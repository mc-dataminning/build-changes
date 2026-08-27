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

public class cqf extends aqm {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cqh<?>, Map<ahg, cqe<?>>> c = ImmutableMap.of();
   private Map<ahg, cqe<?>> d = ImmutableMap.of();
   private boolean e;

   public cqf() {
      super(a, "recipes");
   }

   protected void a(Map<ahg, JsonElement> $$0, aqi $$1, bgs $$2) {
      this.e = false;
      Map<cqh<?>, Builder<ahg, cqe<?>>> $$3 = Maps.newHashMap();
      Builder<ahg, cqe<?>> $$4 = ImmutableMap.builder();

      for (Entry<ahg, JsonElement> $$5 : $$0.entrySet()) {
         ahg $$6 = $$5.getKey();

         try {
            cqe<?> $$7 = a($$6, aue.m($$5.getValue(), "top element"));
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

   public <C extends bju, T extends cqc<C>> Optional<cqe<T>> a(cqh<T> $$0, C $$1, ctp $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bju, T extends cqc<C>> Optional<Pair<ahg, cqe<T>>> a(cqh<T> $$0, C $$1, ctp $$2, @Nullable ahg $$3) {
      Map<ahg, cqe<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cqe<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cqe)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((ahg)$$0x.getKey(), (cqe)$$0x.getValue()));
   }

   public <C extends bju, T extends cqc<C>> List<cqe<T>> a(cqh<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bju, T extends cqc<C>> List<cqe<T>> b(cqh<T> $$0, C $$1, ctp $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.I_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bju, T extends cqc<C>> Map<ahg, cqe<T>> c(cqh<T> $$0) {
      return (Map<ahg, cqe<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bju, T extends cqc<C>> iq<cmy> c(cqh<T> $$0, C $$1, ctp $$2) {
      Optional<cqe<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         iq<cmy> $$4 = iq.a($$1.b(), cmy.f);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cqe<?>> a(ahg $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cqe<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<ahg> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static cqe<?> a(ahg $$0, JsonObject $$1) {
      cqc<?> $$2 = ac.a(cqc.h.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new cqe<>($$0, $$2);
   }

   public void a(Iterable<cqe<?>> $$0) {
      this.e = false;
      Map<cqh<?>, Map<ahg, cqe<?>>> $$1 = Maps.newHashMap();
      Builder<ahg, cqe<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<ahg, cqe<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         ahg $$4 = $$2x.a();
         cqe<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bju, T extends cqc<C>> cqf.a<C, T> b(final cqh<T> $$0) {
      return new cqf.a<C, T>() {
         @Nullable
         private ahg b;

         @Override
         public Optional<cqe<T>> a(C $$0x, ctp $$1) {
            cqf $$2 = $$1.r();
            Optional<Pair<ahg, cqe<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<ahg, cqe<T>> $$4 = $$3.get();
               this.b = (ahg)$$4.getFirst();
               return Optional.of((cqe<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bju, T extends cqc<C>> {
      Optional<cqe<T>> a(C var1, ctp var2);
   }
}
