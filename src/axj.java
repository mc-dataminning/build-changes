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

public class axj<T> {
   private static final Logger a = LogUtils.getLogger();
   final Function<alb, Optional<? extends T>> b;
   private final String c;

   public axj(Function<alb, Optional<? extends T>> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<alb, List<axj.a>> a(aus $$0) {
      Map<alb, List<axj.a>> $$1 = new HashMap<>();
      aku $$2 = aku.a(this.c);

      for (Entry<alb, List<auq>> $$3 : $$2.b($$0).entrySet()) {
         alb $$4 = $$3.getKey();
         alb $$5 = $$2.b($$4);

         for (auq $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axj.a> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axh $$10 = (axh)axh.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axj.a($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<axj.a>, List<T>> a(axg.a<T> $$0, List<axj.a> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<axj.a> $$3 = new ArrayList<>();

      for (axj.a $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<alb, List<T>> a(Map<alb, List<axj.a>> $$0) {
      final Map<alb, List<T>> $$1 = new HashMap<>();
      axg.a<T> $$2 = new axg.a<T>() {
         @Nullable
         @Override
         public T a(alb $$0) {
            return (T)axj.this.b.apply($$0).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> b(alb $$0) {
            return $$1.get($$0);
         }
      };
      ayh<alb, axj.c> $$3 = new ayh<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axj.c($$2x)));
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

   public static <T> void a(axk.a $$0, kj<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<ka.a<?>> a(aus $$0, kb $$1) {
      return $$1.e().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(aus $$0, kj<T> $$1) {
      ala<? extends ka<T>> $$2 = $$1.d();
      jo<T> $$3 = $$1.n();
      axj<jn<T>> $$4 = new axj<>($$2x -> $$3.a(ala.a($$2, $$2x)), lv.d($$2));
      $$4.a($$4.a($$0)).forEach(($$2x, $$3x) -> $$1.a(axi.a($$2, $$2x), $$3x));
   }

   private static <T> Map<axi<T>, List<jn<T>>> a(ala<? extends ka<T>> $$0, Map<alb, List<jn<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> axi.a($$0, (alb)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<ka.a<T>> a(aus $$0, ka<T> $$1) {
      ala<? extends ka<T>> $$2 = $$1.d();
      axj<jn<T>> $$3 = new axj<>($$1::c, lv.d($$2));
      axj.b<T> $$4 = new axj.b<>($$2, a($$1.d(), $$3.a($$3.a($$0))));
      return $$4.b().isEmpty() ? Optional.empty() : Optional.of($$1.a($$4));
   }

   public static List<jp.b<?>> a(kb.b $$0, List<ka.a<?>> $$1) {
      List<jp.b<?>> $$2 = new ArrayList<>();
      $$0.e().forEach($$2x -> {
         ka.a<?> $$3 = a($$1, $$2x.a());
         $$2.add($$3 != null ? $$3.b() : $$2x.b().p());
      });
      return $$2;
   }

   @Nullable
   private static ka.a<?> a(List<ka.a<?>> $$0, ala<? extends ka<?>> $$1) {
      for (ka.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public static record a(axg a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record b<T>(ala<? extends ka<T>> a, Map<axi<T>, List<jn<T>>> b) {
   }

   static record c(List<axj.a> a) implements ayh.a<alb> {

      @Override
      public void a(Consumer<alb> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<alb> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}
