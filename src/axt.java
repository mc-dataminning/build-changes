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

public class axt<T> {
   private static final Logger a = LogUtils.getLogger();
   final Function<alj, Optional<? extends T>> b;
   private final String c;

   public axt(Function<alj, Optional<? extends T>> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<alj, List<axt.a>> a(avd $$0) {
      Map<alj, List<axt.a>> $$1 = new HashMap<>();
      alc $$2 = alc.a(this.c);

      for (Entry<alj, List<avb>> $$3 : $$2.b($$0).entrySet()) {
         alj $$4 = $$3.getKey();
         alj $$5 = $$2.b($$4);

         for (avb $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axt.a> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axr $$10 = (axr)axr.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axt.a($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<axt.a>, List<T>> a(axq.a<T> $$0, List<axt.a> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<axt.a> $$3 = new ArrayList<>();

      for (axt.a $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<alj, List<T>> a(Map<alj, List<axt.a>> $$0) {
      final Map<alj, List<T>> $$1 = new HashMap<>();
      axq.a<T> $$2 = new axq.a<T>() {
         @Nullable
         @Override
         public T a(alj $$0) {
            return (T)axt.this.b.apply($$0).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> b(alj $$0) {
            return $$1.get($$0);
         }
      };
      ayr<alj, axt.c> $$3 = new ayr<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axt.c($$2x)));
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

   public static <T> void a(axu.a $$0, km<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<kd.a<?>> a(avd $$0, ke $$1) {
      return $$1.a().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(avd $$0, km<T> $$1) {
      ali<? extends kd<T>> $$2 = $$1.g();
      jr<T> $$3 = $$1.p();
      axt<jq<T>> $$4 = new axt<>($$2x -> $$3.a(ali.a($$2, $$2x)), ma.d($$2));
      $$4.a($$4.a($$0)).forEach(($$2x, $$3x) -> $$1.a(axs.a($$2, $$2x), $$3x));
   }

   private static <T> Map<axs<T>, List<jq<T>>> a(ali<? extends kd<T>> $$0, Map<alj, List<jq<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> axs.a($$0, (alj)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<kd.a<T>> a(avd $$0, kd<T> $$1) {
      ali<? extends kd<T>> $$2 = $$1.g();
      axt<jq<T>> $$3 = new axt<>($$1::c, ma.d($$2));
      axt.b<T> $$4 = new axt.b<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
      return $$4.b().isEmpty() ? Optional.empty() : Optional.of($$1.a($$4));
   }

   public static List<js.b<?>> a(ke.b $$0, List<kd.a<?>> $$1) {
      List<js.b<?>> $$2 = new ArrayList<>();
      $$0.a().forEach($$2x -> {
         kd.a<?> $$3 = a($$1, $$2x.a());
         $$2.add((js.b<?>)($$3 != null ? $$3.b() : $$2x.b()));
      });
      return $$2;
   }

   @Nullable
   private static kd.a<?> a(List<kd.a<?>> $$0, ali<? extends kd<?>> $$1) {
      for (kd.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public static record a(axq a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record b<T>(ali<? extends kd<T>> a, Map<axs<T>, List<jq<T>>> b) {
   }

   static record c(List<axt.a> a) implements ayr.a<alj> {

      @Override
      public void a(Consumer<alj> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<alj> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}
