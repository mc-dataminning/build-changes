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

public class cts extends ass {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final in.a c;
   private Map<ctu<?>, Map<ajh, ctr<?>>> d = ImmutableMap.of();
   private Map<ajh, ctr<?>> e = ImmutableMap.of();
   private boolean f;

   public cts(in.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<ajh, JsonElement> $$0, aso $$1, bjr $$2) {
      this.f = false;
      Map<ctu<?>, Builder<ajh, ctr<?>>> $$3 = Maps.newHashMap();
      Builder<ajh, ctr<?>> $$4 = ImmutableMap.builder();
      ajf<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<ajh, JsonElement> $$6 : $$0.entrySet()) {
         ajh $$7 = $$6.getKey();

         try {
            JsonObject $$8 = awm.m($$6.getValue(), "top element");
            ctp<?> $$9 = ac.a(ctp.h.parse($$5, $$8), JsonParseException::new);
            ctr<?> $$10 = new ctr<>($$7, $$9);
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

   public <C extends bmw, T extends ctp<C>> Optional<ctr<T>> a(ctu<T> $$0, C $$1, cxb $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bmw, T extends ctp<C>> Optional<Pair<ajh, ctr<T>>> a(ctu<T> $$0, C $$1, cxb $$2, @Nullable ajh $$3) {
      Map<ajh, ctr<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         ctr<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((ctr)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((ajh)$$0x.getKey(), (ctr)$$0x.getValue()));
   }

   public <C extends bmw, T extends ctp<C>> List<ctr<T>> a(ctu<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bmw, T extends ctp<C>> List<ctr<T>> b(ctu<T> $$0, C $$1, cxb $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).r()))
         .collect(Collectors.toList());
   }

   private <C extends bmw, T extends ctp<C>> Map<ajh, ctr<T>> c(ctu<T> $$0) {
      return (Map<ajh, ctr<T>>)this.d.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bmw, T extends ctp<C>> iu<cqm> c(ctu<T> $$0, C $$1, cxb $$2) {
      Optional<ctr<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         iu<cqm> $$4 = iu.a($$1.b(), cqm.h);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<ctr<?>> a(ajh $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   public Collection<ctr<?>> b() {
      return this.d.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<ajh> d() {
      return this.d.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   @VisibleForTesting
   protected static ctr<?> a(ajh $$0, JsonObject $$1, in.a $$2) {
      ctp<?> $$3 = ac.a(ctp.h.parse($$2.a(JsonOps.INSTANCE), $$1), JsonParseException::new);
      return new ctr<>($$0, $$3);
   }

   public void a(Iterable<ctr<?>> $$0) {
      this.f = false;
      Map<ctu<?>, Map<ajh, ctr<?>>> $$1 = Maps.newHashMap();
      Builder<ajh, ctr<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<ajh, ctr<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         ajh $$4 = $$2x.a();
         ctr<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.d = ImmutableMap.copyOf($$1);
      this.e = $$2.build();
   }

   public static <C extends bmw, T extends ctp<C>> cts.a<C, T> b(final ctu<T> $$0) {
      return new cts.a<C, T>() {
         @Nullable
         private ajh b;

         @Override
         public Optional<ctr<T>> a(C $$0x, cxb $$1) {
            cts $$2 = $$1.r();
            Optional<Pair<ajh, ctr<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<ajh, ctr<T>> $$4 = $$3.get();
               this.b = (ajh)$$4.getFirst();
               return Optional.of((ctr<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bmw, T extends ctp<C>> {
      Optional<ctr<T>> a(C var1, cxb var2);
   }
}
