import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.SequencedSet;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class axq<T> {
   private static final Logger a = LogUtils.getLogger();
   final axq.a<T> b;
   private final String c;

   public axq(axq.a<T> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<ale, List<axq.b>> a(avb $$0) {
      Map<ale, List<axq.b>> $$1 = new HashMap<>();
      akx $$2 = akx.a(this.c);

      for (Entry<ale, List<auz>> $$3 : $$2.b($$0).entrySet()) {
         ale $$4 = $$3.getKey();
         ale $$5 = $$2.b($$4);

         for (auz $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axq.b> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axo $$10 = (axo)axo.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axq.b($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<axq.b>, List<T>> a(axn.a<T> $$0, List<axq.b> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<axq.b> $$3 = new ArrayList<>();

      for (axq.b $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<ale, List<T>> a(Map<ale, List<axq.b>> $$0) {
      final Map<ale, List<T>> $$1 = new HashMap<>();
      axn.a<T> $$2 = new axn.a<T>() {
         @Nullable
         @Override
         public T a(ale $$0, boolean $$1x) {
            return (T)axq.this.b.get($$0, $$1).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> a(ale $$0) {
            return $$1.get($$0);
         }
      };
      ayo<ale, axq.d> $$3 = new ayo<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axq.d($$2x)));
      $$3.a(
         ($$2x, $$3x) -> this.a($$2, $$3x.a)
               .ifLeft(
                  $$1xx -> a.error(
                        "Couldn't load tag {} as it is missing following references: {}",
                        $$2x,
                        $$1xx.stream().map(Objects::toString).collect(Collectors.joining(", "))
                     )
               )
               .ifRight($$2xx -> $$1.put($$2x, $$2xx))
      );
      return $$1;
   }

   public static <T> void a(axr.a $$0, ka<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<jr.a<?>> a(avb $$0, js $$1) {
      return $$1.a().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(avb $$0, ka<T> $$1) {
      ald<? extends jr<T>> $$2 = $$1.g();
      axq<je<T>> $$3 = new axq<>(axq.a.a($$1), mg.d($$2));
      $$3.a($$3.a($$0)).forEach(($$2x, $$3x) -> $$1.a(axp.a($$2, $$2x), $$3x));
   }

   private static <T> Map<axp<T>, List<je<T>>> a(ald<? extends jr<T>> $$0, Map<ale, List<je<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> axp.a($$0, (ale)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<jr.a<T>> a(avb $$0, jr<T> $$1) {
      ald<? extends jr<T>> $$2 = $$1.g();
      axq<je<T>> $$3 = new axq<>((axq.a<je<T>>)axq.a.a($$1), mg.d($$2));
      axq.c<T> $$4 = new axq.c<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
      return $$4.b().isEmpty() ? Optional.empty() : Optional.of($$1.a($$4));
   }

   public static List<jg.b<?>> a(js.b $$0, List<jr.a<?>> $$1) {
      List<jg.b<?>> $$2 = new ArrayList<>();
      $$0.a().forEach($$2x -> {
         jr.a<?> $$3 = a($$1, $$2x.a());
         $$2.add((jg.b<?>)($$3 != null ? $$3.c() : $$2x.b()));
      });
      return $$2;
   }

   @Nullable
   private static jr.a<?> a(List<jr.a<?>> $$0, ald<? extends jr<?>> $$1) {
      for (jr.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public interface a<T> {
      Optional<? extends T> get(ale var1, boolean var2);

      static <T> axq.a<? extends je<T>> a(jr<T> $$0) {
         return ($$1, $$2) -> $$0.c($$1);
      }

      static <T> axq.a<je<T>> a(ka<T> $$0) {
         jf<T> $$1 = $$0.p();
         return ($$2, $$3) -> ((jf<T>)($$3 ? $$1 : $$0)).a(ald.a($$0.g(), $$2));
      }
   }

   public static record b(axn a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record c<T>(ald<? extends jr<T>> a, Map<axp<T>, List<je<T>>> b) {
   }

   static record d(List<axq.b> a) implements ayo.a<ale> {

      @Override
      public void a(Consumer<ale> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<ale> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}
