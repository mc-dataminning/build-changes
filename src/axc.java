import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableSet.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class axc<T> {
   private static final Logger a = LogUtils.getLogger();
   final Function<alb, Optional<? extends T>> b;
   private final String c;

   public axc(Function<alb, Optional<? extends T>> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<alb, List<axc.a>> a(aul $$0) {
      Map<alb, List<axc.a>> $$1 = Maps.newHashMap();
      aku $$2 = aku.a(this.c);

      for (Entry<alb, List<auj>> $$3 : $$2.b($$0).entrySet()) {
         alb $$4 = $$3.getKey();
         alb $$5 = $$2.b($$4);

         for (auj $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<axc.a> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               axa $$10 = (axa)axa.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new axc.a($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<Collection<axc.a>, Collection<T>> a(awz.a<T> $$0, List<axc.a> $$1) {
      Builder<T> $$2 = ImmutableSet.builder();
      List<axc.a> $$3 = new ArrayList<>();

      for (axc.a $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right($$2.build()) : Either.left($$3);
   }

   public Map<alb, Collection<T>> a(Map<alb, List<axc.a>> $$0) {
      final Map<alb, Collection<T>> $$1 = Maps.newHashMap();
      awz.a<T> $$2 = new awz.a<T>() {
         @Nullable
         @Override
         public T a(alb $$0) {
            return (T)axc.this.b.apply($$0).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> b(alb $$0) {
            return $$1.get($$0);
         }
      };
      axz<alb, axc.b> $$3 = new axz<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new axc.b($$2x)));
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

   public Map<alb, Collection<T>> b(aul $$0) {
      return this.a(this.a($$0));
   }

   public static record a(awz a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   static record b(List<axc.a> a) implements axz.a<alb> {

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
