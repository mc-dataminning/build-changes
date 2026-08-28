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
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class axq<T> {
   private static final Logger a = LogUtils.getLogger();
   final Function<alh, Optional<? extends T>> b;
   private final String c;

   public axq(Function<alh, Optional<? extends T>> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<alh, List<axq.a>> a(ava $$0) {
      Map<alh, List<axq.a>> $$1 = new HashMap<>();
      ala $$2 = ala.a(this.c);

      for (Entry<alh, List<auy>> $$3 : $$2.b($$0).entrySet()) {
         alh $$4 = $$3.getKey();
         alh $$5 = $$2.b($$4);

         for (auy $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axq.a> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axo $$10 = (axo)axo.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axq.a($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<axq.a>, List<T>> a(axn.a<T> $$0, List<axq.a> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<axq.a> $$3 = new ArrayList<>();

      for (axq.a $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<alh, List<T>> a(Map<alh, List<axq.a>> $$0) {
      final Map<alh, List<T>> $$1 = new HashMap<>();
      axn.a<T> $$2 = new axn.a<T>() {
         @Nullable
         @Override
         public T a(alh $$0) {
            return (T)axq.this.b.apply($$0).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> b(alh $$0) {
            return $$1.get($$0);
         }
      };
      ayo<alh, axq.c> $$3 = new ayo<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axq.c($$2x)));
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

   public static <T> void a(axr.a $$0, kl<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<kc.a<?>> a(ava $$0, kd $$1) {
      return $$1.d().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(ava $$0, kl<T> $$1) {
      alg<? extends kc<T>> $$2 = $$1.g();
      jq<T> $$3 = $$1.p();
      axq<jp<T>> $$4 = new axq<>($$2x -> $$3.a(alg.a($$2, $$2x)), ly.d($$2));
      $$4.a($$4.a($$0)).forEach(($$2x, $$3x) -> $$1.a(axp.a($$2, $$2x), $$3x));
   }

   private static <T> Map<axp<T>, List<jp<T>>> a(alg<? extends kc<T>> $$0, Map<alh, List<jp<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> axp.a($$0, (alh)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<kc.a<T>> a(ava $$0, kc<T> $$1) {
      alg<? extends kc<T>> $$2 = $$1.g();
      axq<jp<T>> $$3 = new axq<>($$1::c, ly.d($$2));
      axq.b<T> $$4 = new axq.b<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
      return $$4.b().isEmpty() ? Optional.empty() : Optional.of($$1.a($$4));
   }

   public static List<jr.b<?>> a(kd.b $$0, List<kc.a<?>> $$1) {
      List<jr.b<?>> $$2 = new ArrayList<>();
      $$0.d().forEach($$2x -> {
         kc.a<?> $$3 = a($$1, $$2x.a());
         $$2.add((jr.b<?>)($$3 != null ? $$3.b() : $$2x.b()));
      });
      return $$2;
   }

   @Nullable
   private static kc.a<?> a(List<kc.a<?>> $$0, alg<? extends kc<?>> $$1) {
      for (kc.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public static record a(axn a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record b<T>(alg<? extends kc<T>> a, Map<axp<T>, List<jp<T>>> b) {
   }

   static record c(List<axq.a> a) implements ayo.a<alh> {

      @Override
      public void a(Consumer<alh> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<alh> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}
