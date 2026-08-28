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

public class axs<T> {
   private static final Logger a = LogUtils.getLogger();
   final axs.a<T> b;
   private final String c;

   public axs(axs.a<T> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<alg, List<axs.b>> a(avd $$0) {
      Map<alg, List<axs.b>> $$1 = new HashMap<>();
      akz $$2 = akz.a(this.c);

      for (Entry<alg, List<avb>> $$3 : $$2.b($$0).entrySet()) {
         alg $$4 = $$3.getKey();
         alg $$5 = $$2.b($$4);

         for (avb $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axs.b> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axq $$10 = (axq)axq.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axs.b($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<axs.b>, List<T>> a(axp.a<T> $$0, List<axs.b> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<axs.b> $$3 = new ArrayList<>();

      for (axs.b $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<alg, List<T>> a(Map<alg, List<axs.b>> $$0) {
      final Map<alg, List<T>> $$1 = new HashMap<>();
      axp.a<T> $$2 = new axp.a<T>() {
         @Nullable
         @Override
         public T a(alg $$0, boolean $$1x) {
            return (T)axs.this.b.get($$0, $$1).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> a(alg $$0) {
            return $$1.get($$0);
         }
      };
      ayq<alg, axs.d> $$3 = new ayq<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axs.d($$2x)));
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

   public static <T> void a(axt.a $$0, ka<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<jr.a<?>> a(avd $$0, js $$1) {
      return $$1.a().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(avd $$0, ka<T> $$1) {
      alf<? extends jr<T>> $$2 = $$1.g();
      axs<je<T>> $$3 = new axs<>(axs.a.a($$1), mg.d($$2));
      $$3.a($$3.a($$0)).forEach(($$2x, $$3x) -> $$1.a(axr.a($$2, $$2x), $$3x));
   }

   private static <T> Map<axr<T>, List<je<T>>> a(alf<? extends jr<T>> $$0, Map<alg, List<je<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> axr.a($$0, (alg)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<jr.a<T>> a(avd $$0, jr<T> $$1) {
      alf<? extends jr<T>> $$2 = $$1.g();
      axs<je<T>> $$3 = new axs<>((axs.a<je<T>>)axs.a.a($$1), mg.d($$2));
      axs.c<T> $$4 = new axs.c<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
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
   private static jr.a<?> a(List<jr.a<?>> $$0, alf<? extends jr<?>> $$1) {
      for (jr.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public interface a<T> {
      Optional<? extends T> get(alg var1, boolean var2);

      static <T> axs.a<? extends je<T>> a(jr<T> $$0) {
         return ($$1, $$2) -> $$0.c($$1);
      }

      static <T> axs.a<je<T>> a(ka<T> $$0) {
         jf<T> $$1 = $$0.p();
         return ($$2, $$3) -> ((jf<T>)($$3 ? $$1 : $$0)).a(alf.a($$0.g(), $$2));
      }
   }

   public static record b(axp a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record c<T>(alf<? extends jr<T>> a, Map<axr<T>, List<je<T>>> b) {
   }

   static record d(List<axs.b> a) implements ayq.a<alg> {

      @Override
      public void a(Consumer<alg> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<alg> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}
