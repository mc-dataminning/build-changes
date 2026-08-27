import com.google.common.annotations.VisibleForTesting;
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

public class czd extends auh {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jc.a c;
   private Map<czf<?>, Map<akt, czc<?>>> d = ImmutableMap.of();
   private Map<akt, czc<?>> e = ImmutableMap.of();
   private boolean f;

   public czd(jc.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<akt, JsonElement> $$0, aud $$1, bmo $$2) {
      this.f = false;
      Map<czf<?>, Builder<akt, czc<?>>> $$3 = Maps.newHashMap();
      Builder<akt, czc<?>> $$4 = ImmutableMap.builder();
      akr<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<akt, JsonElement> $$6 : $$0.entrySet()) {
         akt $$7 = $$6.getKey();

         try {
            JsonObject $$8 = ayc.m($$6.getValue(), "top element");
            cza<?> $$9 = ad.a(cza.h.parse($$5, $$8), JsonParseException::new);
            czc<?> $$10 = new czc<>($$7, $$9);
            $$3.computeIfAbsent($$9.e(), $$0x -> ImmutableMap.builder()).put($$7, $$10);
            $$4.put($$7, $$10);
         } catch (IllegalArgumentException | JsonParseException var13) {
            b.error("Parsing error loading recipe {}", $$7, var13);
         }
      }

      this.d = $$3.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((Builder)$$0x.getValue()).build()));
      this.e = $$4.build();
      b.info("Loaded {} recipes", $$3.size());
   }

   public boolean a() {
      return this.f;
   }

   public <C extends bpt, T extends cza<C>> Optional<czc<T>> a(czf<T> $$0, C $$1, dca $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bpt, T extends cza<C>> Optional<Pair<akt, czc<T>>> a(czf<T> $$0, C $$1, dca $$2, @Nullable akt $$3) {
      Map<akt, czc<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         czc<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((czc)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((akt)$$0x.getKey(), (czc)$$0x.getValue()));
   }

   public <C extends bpt, T extends cza<C>> List<czc<T>> a(czf<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bpt, T extends cza<C>> List<czc<T>> b(czf<T> $$0, C $$1, dca $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.I_()).s()))
         .collect(Collectors.toList());
   }

   private <C extends bpt, T extends cza<C>> Map<akt, czc<T>> c(czf<T> $$0) {
      return (Map<akt, czc<T>>)this.d.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bpt, T extends cza<C>> jj<cuh> c(czf<T> $$0, C $$1, dca $$2) {
      Optional<czc<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jj<cuh> $$4 = jj.a($$1.b(), cuh.i);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<czc<?>> a(akt $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   public Collection<czc<?>> b() {
      return this.d.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<akt> d() {
      return this.d.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   @VisibleForTesting
   protected static czc<?> a(akt $$0, JsonObject $$1, jc.a $$2) {
      cza<?> $$3 = ad.a(cza.h.parse($$2.a(JsonOps.INSTANCE), $$1), JsonParseException::new);
      return new czc<>($$0, $$3);
   }

   public void a(Iterable<czc<?>> $$0) {
      this.f = false;
      Map<czf<?>, Map<akt, czc<?>>> $$1 = Maps.newHashMap();
      Builder<akt, czc<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<akt, czc<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         akt $$4 = $$2x.a();
         czc<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.d = ImmutableMap.copyOf($$1);
      this.e = $$2.build();
   }

   public static <C extends bpt, T extends cza<C>> czd.a<C, T> b(final czf<T> $$0) {
      return new czd.a<C, T>() {
         @Nullable
         private akt b;

         @Override
         public Optional<czc<T>> a(C $$0x, dca $$1) {
            czd $$2 = $$1.r();
            Optional<Pair<akt, czc<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<akt, czc<T>> $$4 = $$3.get();
               this.b = (akt)$$4.getFirst();
               return Optional.of((czc<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bpt, T extends cza<C>> {
      Optional<czc<T>> a(C var1, dca var2);
   }
}
