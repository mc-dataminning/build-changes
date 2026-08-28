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

public class axm<T> {
   private static final Logger a = LogUtils.getLogger();
   final Function<ale, Optional<? extends T>> b;
   private final String c;

   public axm(Function<ale, Optional<? extends T>> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<ale, List<axm.a>> a(auv $$0) {
      Map<ale, List<axm.a>> $$1 = new HashMap<>();
      akx $$2 = akx.a(this.c);

      for (Entry<ale, List<aut>> $$3 : $$2.b($$0).entrySet()) {
         ale $$4 = $$3.getKey();
         ale $$5 = $$2.b($$4);

         for (aut $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axm.a> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axk $$10 = (axk)axk.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axm.a($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<List<axm.a>, List<T>> a(axj.a<T> $$0, List<axm.a> $$1) {
      SequencedSet<T> $$2 = new LinkedHashSet<>();
      List<axm.a> $$3 = new ArrayList<>();

      for (axm.a $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right(List.copyOf($$2)) : Either.left($$3);
   }

   public Map<ale, List<T>> a(Map<ale, List<axm.a>> $$0) {
      final Map<ale, List<T>> $$1 = new HashMap<>();
      axj.a<T> $$2 = new axj.a<T>() {
         @Nullable
         @Override
         public T a(ale $$0) {
            return (T)axm.this.b.apply($$0).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> b(ale $$0) {
            return $$1.get($$0);
         }
      };
      ayk<ale, axm.c> $$3 = new ayk<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axm.c($$2x)));
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

   public static <T> void a(axn.a $$0, kk<T> $$1) {
      $$0.a($$1).b.forEach($$1::a);
   }

   public static List<kb.a<?>> a(auv $$0, kc $$1) {
      return $$1.d().map($$1x -> a($$0, $$1x.b())).flatMap(Optional::stream).collect(Collectors.toUnmodifiableList());
   }

   public static <T> void a(auv $$0, kk<T> $$1) {
      ald<? extends kb<T>> $$2 = $$1.g();
      jp<T> $$3 = $$1.p();
      axm<jo<T>> $$4 = new axm<>($$2x -> $$3.a(ald.a($$2, $$2x)), lw.d($$2));
      $$4.a($$4.a($$0)).forEach(($$2x, $$3x) -> $$1.a(axl.a($$2, $$2x), $$3x));
   }

   private static <T> Map<axl<T>, List<jo<T>>> a(ald<? extends kb<T>> $$0, Map<ale, List<jo<T>>> $$1) {
      return $$1.entrySet().stream().collect(Collectors.toUnmodifiableMap($$1x -> axl.a($$0, (ale)$$1x.getKey()), Entry::getValue));
   }

   private static <T> Optional<kb.a<T>> a(auv $$0, kb<T> $$1) {
      ald<? extends kb<T>> $$2 = $$1.g();
      axm<jo<T>> $$3 = new axm<>($$1::c, lw.d($$2));
      axm.b<T> $$4 = new axm.b<>($$2, a($$1.g(), $$3.a($$3.a($$0))));
      return $$4.b().isEmpty() ? Optional.empty() : Optional.of($$1.a($$4));
   }

   public static List<jq.b<?>> a(kc.b $$0, List<kb.a<?>> $$1) {
      List<jq.b<?>> $$2 = new ArrayList<>();
      $$0.d().forEach($$2x -> {
         kb.a<?> $$3 = a($$1, $$2x.a());
         $$2.add((jq.b<?>)($$3 != null ? $$3.b() : $$2x.b()));
      });
      return $$2;
   }

   @Nullable
   private static kb.a<?> a(List<kb.a<?>> $$0, ald<? extends kb<?>> $$1) {
      for (kb.a<?> $$2 : $$0) {
         if ($$2.a() == $$1) {
            return $$2;
         }
      }

      return null;
   }

   public static record a(axj a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   public static record b<T>(ald<? extends kb<T>> a, Map<axl<T>, List<jo<T>>> b) {
   }

   static record c(List<axm.a> a) implements ayk.a<ale> {

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
