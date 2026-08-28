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

public class axr<T> {
   private static final Logger a = LogUtils.getLogger();
   final Function<ali, Optional<? extends T>> b;
   private final String c;

   public axr(Function<ali, Optional<? extends T>> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<ali, List<axr.a>> a(avb $$0) {
      Map<ali, List<axr.a>> $$1 = new HashMap<>();
      alb $$2 = alb.a(this.c);

      for (Entry<ali, List<auz>> $$3 : $$2.b($$0).entrySet()) {
         ali $$4 = $$3.getKey();
         ali $$5 = $$2.b($$4);

         for (auz $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axr.a> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axp $$10 = (axp)axp.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axr.a($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<axr.a>, List<T>> a(axo.a<T> $$0, List<axr.a> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<axr.a> $$3 = new ArrayList<>();

      for (axr.a $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<ali, List<T>> a(Map<ali, List<axr.a>> $$0) {
      final Map<ali, List<T>> $$1 = new HashMap<>();
      axo.a<T> $$2 = new axo.a<T>() {
         @Nullable
         @Override
         public T a(ali $$0) {
            return (T)axr.this.b.apply($$0).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> b(ali $$0) {
            return $$1.get($$0);
         }
      };
      ayp<ali, axr.c> $$3 = new ayp<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axr.c($$2x)));
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

   public static <T> void a(axs.a $$0, km<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<kd.a<?>> a(avb $$0, ke $$1) {
      return $$1.a().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(avb $$0, km<T> $$1) {
      alh<? extends kd<T>> $$2 = $$1.g();
      jr<T> $$3 = $$1.p();
      axr<jq<T>> $$4 = new axr<>($$2x -> $$3.a(alh.a($$2, $$2x)), lz.d($$2));
      $$4.a($$4.a($$0)).forEach(($$2x, $$3x) -> $$1.a(axq.a($$2, $$2x), $$3x));
   }

   private static <T> Map<axq<T>, List<jq<T>>> a(alh<? extends kd<T>> $$0, Map<ali, List<jq<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> axq.a($$0, (ali)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<kd.a<T>> a(avb $$0, kd<T> $$1) {
      alh<? extends kd<T>> $$2 = $$1.g();
      axr<jq<T>> $$3 = new axr<>($$1::c, lz.d($$2));
      axr.b<T> $$4 = new axr.b<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
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
   private static kd.a<?> a(List<kd.a<?>> $$0, alh<? extends kd<?>> $$1) {
      for (kd.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public static record a(axo a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record b<T>(alh<? extends kd<T>> a, Map<axq<T>, List<jq<T>>> b) {
   }

   static record c(List<axr.a> a) implements ayp.a<ali> {

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
