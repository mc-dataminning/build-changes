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

public class awn<T> {
   private static final Logger a = LogUtils.getLogger();
   final Function<akk, Optional<? extends T>> b;
   private final String c;

   public awn(Function<akk, Optional<? extends T>> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<akk, List<awn.a>> a(atw $$0) {
      Map<akk, List<awn.a>> $$1 = Maps.newHashMap();
      akd $$2 = akd.a(this.c);

      for (Entry<akk, List<atu>> $$3 : $$2.b($$0).entrySet()) {
         akk $$4 = $$3.getKey();
         akk $$5 = $$2.b($$4);

         for (atu $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<awn.a> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               awl $$10 = (awl)awl.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow();
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new awn.a($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<Collection<awn.a>, Collection<T>> a(awk.a<T> $$0, List<awn.a> $$1) {
      Builder<T> $$2 = ImmutableSet.builder();
      List<awn.a> $$3 = new ArrayList<>();

      for (awn.a $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right($$2.build()) : Either.left($$3);
   }

   public Map<akk, Collection<T>> a(Map<akk, List<awn.a>> $$0) {
      final Map<akk, Collection<T>> $$1 = Maps.newHashMap();
      awk.a<T> $$2 = new awk.a<T>() {
         @Nullable
         @Override
         public T a(akk $$0) {
            return (T)awn.this.b.apply($$0).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> b(akk $$0) {
            return $$1.get($$0);
         }
      };
      axk<akk, awn.b> $$3 = new axk<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new awn.b($$2x)));
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

   public Map<akk, Collection<T>> b(atw $$0) {
      return this.a(this.a($$0));
   }

   public static record a(awk a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   static record b(List<awn.a> a) implements axk.a<akk> {

      @Override
      public void a(Consumer<akk> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<akk> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}
