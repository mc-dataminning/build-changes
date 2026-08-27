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

public class avs<T> {
   private static final Logger a = LogUtils.getLogger();
   final Function<ajt, Optional<? extends T>> b;
   private final String c;

   public avs(Function<ajt, Optional<? extends T>> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<ajt, List<avs.a>> a(atc $$0) {
      Map<ajt, List<avs.a>> $$1 = Maps.newHashMap();
      ajm $$2 = ajm.a(this.c);

      for (Entry<ajt, List<ata>> $$3 : $$2.b($$0).entrySet()) {
         ajt $$4 = $$3.getKey();
         ajt $$5 = $$2.b($$4);

         for (ata $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<avs.a> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               avq $$10 = (avq)avq.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow(false, a::error);
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new avs.a($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<Collection<avs.a>, Collection<T>> a(avp.a<T> $$0, List<avs.a> $$1) {
      Builder<T> $$2 = ImmutableSet.builder();
      List<avs.a> $$3 = new ArrayList<>();

      for (avs.a $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right($$2.build()) : Either.left($$3);
   }

   public Map<ajt, Collection<T>> a(Map<ajt, List<avs.a>> $$0) {
      final Map<ajt, Collection<T>> $$1 = Maps.newHashMap();
      avp.a<T> $$2 = new avp.a<T>() {
         @Nullable
         @Override
         public T a(ajt $$0) {
            return (T)avs.this.b.apply($$0).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> b(ajt $$0) {
            return $$1.get($$0);
         }
      };
      awp<ajt, avs.b> $$3 = new awp<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new avs.b($$2x)));
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

   public Map<ajt, Collection<T>> b(atc $$0) {
      return this.a(this.a($$0));
   }

   public static record a(avp a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   static record b(List<avs.a> a) implements awp.a<ajt> {

      @Override
      public void a(Consumer<ajt> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<ajt> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}
