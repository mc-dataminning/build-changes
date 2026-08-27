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

public class ash<T> {
   private static final Logger a = LogUtils.getLogger();
   final Function<agt, Optional<? extends T>> b;
   private final String c;

   public ash(Function<agt, Optional<? extends T>> $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public Map<agt, List<ash.a>> a(aps $$0) {
      Map<agt, List<ash.a>> $$1 = Maps.newHashMap();
      agm $$2 = agm.a(this.c);

      for (Entry<agt, List<apq>> $$3 : $$2.b($$0).entrySet()) {
         agt $$4 = $$3.getKey();
         agt $$5 = $$2.b($$4);

         for (apq $$6 : $$3.getValue()) {
            try (Reader $$7 = $$6.e()) {
               JsonElement $$8 = JsonParser.parseReader($$7);
               List<ash.a> $$9 = $$1.computeIfAbsent($$5, $$0x -> new ArrayList<>());
               asf $$10 = (asf)asf.a.parse(new Dynamic(JsonOps.INSTANCE, $$8)).getOrThrow(false, a::error);
               if ($$10.b()) {
                  $$9.clear();
               }

               String $$11 = $$6.b();
               $$10.a().forEach($$2x -> $$9.add(new ash.a($$2x, $$11)));
            } catch (Exception var17) {
               a.error("Couldn't read tag list {} from {} in data pack {}", new Object[]{$$5, $$4, $$6.b(), var17});
            }
         }
      }

      return $$1;
   }

   private Either<Collection<ash.a>, Collection<T>> a(ase.a<T> $$0, List<ash.a> $$1) {
      Builder<T> $$2 = ImmutableSet.builder();
      List<ash.a> $$3 = new ArrayList<>();

      for (ash.a $$4 : $$1) {
         if (!$$4.a().a($$0, $$2::add)) {
            $$3.add($$4);
         }
      }

      return $$3.isEmpty() ? Either.right($$2.build()) : Either.left($$3);
   }

   public Map<agt, Collection<T>> a(Map<agt, List<ash.a>> $$0) {
      final Map<agt, Collection<T>> $$1 = Maps.newHashMap();
      ase.a<T> $$2 = new ase.a<T>() {
         @Nullable
         @Override
         public T a(agt $$0) {
            return (T)ash.this.b.apply($$0).orElse(null);
         }

         @Nullable
         @Override
         public Collection<T> b(agt $$0) {
            return $$1.get($$0);
         }
      };
      atd<agt, ash.b> $$3 = new atd<>();
      $$0.forEach(($$1x, $$2x) -> $$3.a($$1x, new ash.b($$2x)));
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

   public Map<agt, Collection<T>> b(aps $$0) {
      return this.a(this.a($$0));
   }

   public static record a(ase a, String b) {

      @Override
      public String toString() {
         return this.a + " (from " + this.b + ")";
      }
   }

   static record b(List<ash.a> a) implements atd.a<agt> {

      @Override
      public void a(Consumer<agt> $$0) {
         this.a.forEach($$1 -> $$1.a.a($$0));
      }

      @Override
      public void b(Consumer<agt> $$0) {
         this.a.forEach($$1 -> $$1.a.b($$0));
      }
   }
}
