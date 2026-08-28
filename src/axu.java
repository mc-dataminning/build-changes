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

public class axu<T> {
   private static final Logger a = LogUtils.getLogger();
   final axu.a<T> b;
   private final String c;

   public axu(axu.a<T> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<ali, List<axu.b>> a(avf $$0) {
      Map<ali, List<axu.b>> $$1 = new HashMap<>();
      alb $$2 = alb.a(this.c);

      for (Entry<ali, List<avd>> $$3 : $$2.b($$0).entrySet()) {
         ali $$4 = $$3.getKey();
         ali $$5 = $$2.b($$4);

         for (avd $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axu.b> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axs $$10 = (axs)axs.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axu.b($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<axu.b>, List<T>> a(axr.a<T> $$0, List<axu.b> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<axu.b> $$3 = new ArrayList<>();

      for (axu.b $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<ali, List<T>> a(Map<ali, List<axu.b>> $$0) {
      final Map<ali, List<T>> $$1 = new HashMap<>();
      axr.a<T> $$2 = new axr.a<T>() {
         @Nullable
         @Override
         public T a(ali $$0, boolean $$1x) {
            return (T)axu.this.b.get($$0, $$1).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> a(ali $$0) {
            return $$1.get($$0);
         }
      };
      ays<ali, axu.d> $$3 = new ays<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axu.d($$2x)));
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

   public static <T> void a(axv.a $$0, kb<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<js.a<?>> a(avf $$0, jt $$1) {
      return $$1.a().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(avf $$0, kb<T> $$1) {
      alh<? extends js<T>> $$2 = $$1.g();
      axu<jf<T>> $$3 = new axu<>(axu.a.a($$1), mh.d($$2));
      $$3.a($$3.a($$0)).forEach(($$2x, $$3x) -> $$1.a(axt.a($$2, $$2x), $$3x));
   }

   private static <T> Map<axt<T>, List<jf<T>>> a(alh<? extends js<T>> $$0, Map<ali, List<jf<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> axt.a($$0, (ali)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<js.a<T>> a(avf $$0, js<T> $$1) {
      alh<? extends js<T>> $$2 = $$1.g();
      axu<jf<T>> $$3 = new axu<>((axu.a<jf<T>>)axu.a.a($$1), mh.d($$2));
      axu.c<T> $$4 = new axu.c<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
      return $$4.b().isEmpty() ? Optional.empty() : Optional.of($$1.a($$4));
   }

   public static List<jh.b<?>> a(jt.b $$0, List<js.a<?>> $$1) {
      List<jh.b<?>> $$2 = new ArrayList<>();
      $$0.a().forEach($$2x -> {
         js.a<?> $$3 = a($$1, $$2x.a());
         $$2.add((jh.b<?>)($$3 != null ? $$3.c() : $$2x.b()));
      });
      return $$2;
   }

   @Nullable
   private static js.a<?> a(List<js.a<?>> $$0, alh<? extends js<?>> $$1) {
      for (js.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public interface a<T> {
      Optional<? extends T> get(ali var1, boolean var2);

      static <T> axu.a<? extends jf<T>> a(js<T> $$0) {
         return ($$1, $$2) -> $$0.c($$1);
      }

      static <T> axu.a<jf<T>> a(kb<T> $$0) {
         jg<T> $$1 = $$0.p();
         return ($$2, $$3) -> ((jg<T>)($$3 ? $$1 : $$0)).a(alh.a($$0.g(), $$2));
      }
   }

   public static record b(axr a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record c<T>(alh<? extends js<T>> a, Map<axt<T>, List<jf<T>>> b) {
   }

   static record d(List<axu.b> a) implements ays.a<ali> {

      @Override
      public void a(Consumer<ali> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<ali> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}
