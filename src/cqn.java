import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cqn extends aqn {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cqp<?>, Map<ahh, cqm<?>>> c = ImmutableMap.of();
   private Map<ahh, cqm<?>> d = ImmutableMap.of();
   private boolean e;

   public cqn() {
      super(a, "recipes");
   }

   protected void a(Map<ahh, JsonElement> $$0, aqj $$1, bgt $$2) {
      this.e = false;
      Map<cqp<?>, Builder<ahh, cqm<?>>> $$3 = Maps.newHashMap();
      Builder<ahh, cqm<?>> $$4 = ImmutableMap.builder();

      for (Entry<ahh, JsonElement> $$5 : $$0.entrySet()) {
         ahh $$6 = $$5.getKey();

         try {
            cqm<?> $$7 = a($$6, auf.m($$5.getValue(), "top element"));
            $$3.computeIfAbsent($$7.b().e(), $$0x -> ImmutableMap.builder()).put($$6, $$7);
            $$4.put($$6, $$7);
         } catch (IllegalArgumentException | JsonParseException var10) {
            b.error("Parsing error loading recipe {}", $$6, var10);
         }
      }

      this.c = $$3.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((Builder)$$0x.getValue()).build()));
      this.d = $$4.build();
      b.info("Loaded {} recipes", $$3.size());
   }

   public boolean a() {
      return this.e;
   }

   public <C extends bjv, T extends cqk<C>> Optional<cqm<T>> a(cqp<T> $$0, C $$1, ctx $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bjv, T extends cqk<C>> Optional<Pair<ahh, cqm<T>>> a(cqp<T> $$0, C $$1, ctx $$2, @Nullable ahh $$3) {
      Map<ahh, cqm<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cqm<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cqm)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((ahh)$$0x.getKey(), (cqm)$$0x.getValue()));
   }

   public <C extends bjv, T extends cqk<C>> List<cqm<T>> a(cqp<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bjv, T extends cqk<C>> List<cqm<T>> b(cqp<T> $$0, C $$1, ctx $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.I_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bjv, T extends cqk<C>> Map<ahh, cqm<T>> c(cqp<T> $$0) {
      return (Map<ahh, cqm<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bjv, T extends cqk<C>> iq<cng> c(cqp<T> $$0, C $$1, ctx $$2) {
      Optional<cqm<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         iq<cng> $$4 = iq.a($$1.b(), cng.f);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cqm<?>> a(ahh $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cqm<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<ahh> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static cqm<?> a(ahh $$0, JsonObject $$1) {
      cqk<?> $$2 = ac.a(cqk.h.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new cqm<>($$0, $$2);
   }

   public void a(Iterable<cqm<?>> $$0) {
      this.e = false;
      Map<cqp<?>, Map<ahh, cqm<?>>> $$1 = Maps.newHashMap();
      Builder<ahh, cqm<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<ahh, cqm<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         ahh $$4 = $$2x.a();
         cqm<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bjv, T extends cqk<C>> cqn.a<C, T> b(final cqp<T> $$0) {
      return new cqn.a<C, T>() {
         @Nullable
         private ahh b;

         @Override
         public Optional<cqm<T>> a(C $$0x, ctx $$1) {
            cqn $$2 = $$1.r();
            Optional<Pair<ahh, cqm<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<ahh, cqm<T>> $$4 = $$3.get();
               this.b = (ahh)$$4.getFirst();
               return Optional.of((cqm<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bjv, T extends cqk<C>> {
      Optional<cqm<T>> a(C var1, ctx var2);
   }
}
