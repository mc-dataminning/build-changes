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

public class ctq extends ass {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final in.a c;
   private Map<cts<?>, Map<ajh, ctp<?>>> d = ImmutableMap.of();
   private Map<ajh, ctp<?>> e = ImmutableMap.of();
   private boolean f;

   public ctq(in.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<ajh, JsonElement> $$0, aso $$1, bjq $$2) {
      this.f = false;
      Map<cts<?>, Builder<ajh, ctp<?>>> $$3 = Maps.newHashMap();
      Builder<ajh, ctp<?>> $$4 = ImmutableMap.builder();
      ajf<JsonElement> $$5 = ajf.a(JsonOps.INSTANCE, this.c);

      for (Entry<ajh, JsonElement> $$6 : $$0.entrySet()) {
         ajh $$7 = $$6.getKey();

         try {
            JsonObject $$8 = awm.m($$6.getValue(), "top element");
            ctn<?> $$9 = ac.a(ctn.h.parse($$5, $$8), JsonParseException::new);
            ctp<?> $$10 = new ctp<>($$7, $$9);
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

   public <C extends bmv, T extends ctn<C>> Optional<ctp<T>> a(cts<T> $$0, C $$1, cwz $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bmv, T extends ctn<C>> Optional<Pair<ajh, ctp<T>>> a(cts<T> $$0, C $$1, cwz $$2, @Nullable ajh $$3) {
      Map<ajh, ctp<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         ctp<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((ctp)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((ajh)$$0x.getKey(), (ctp)$$0x.getValue()));
   }

   public <C extends bmv, T extends ctn<C>> List<ctp<T>> a(cts<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bmv, T extends ctn<C>> List<ctp<T>> b(cts<T> $$0, C $$1, cwz $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).r()))
         .collect(Collectors.toList());
   }

   private <C extends bmv, T extends ctn<C>> Map<ajh, ctp<T>> c(cts<T> $$0) {
      return (Map<ajh, ctp<T>>)this.d.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bmv, T extends ctn<C>> iu<cqk> c(cts<T> $$0, C $$1, cwz $$2) {
      Optional<ctp<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         iu<cqk> $$4 = iu.a($$1.b(), cqk.h);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<ctp<?>> a(ajh $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   public Collection<ctp<?>> b() {
      return this.d.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<ajh> d() {
      return this.d.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   @VisibleForTesting
   protected static ctp<?> a(ajh $$0, JsonObject $$1, in.a $$2) {
      ctn<?> $$3 = ac.a(ctn.h.parse(ajf.a(JsonOps.INSTANCE, $$2), $$1), JsonParseException::new);
      return new ctp<>($$0, $$3);
   }

   public void a(Iterable<ctp<?>> $$0) {
      this.f = false;
      Map<cts<?>, Map<ajh, ctp<?>>> $$1 = Maps.newHashMap();
      Builder<ajh, ctp<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<ajh, ctp<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         ajh $$4 = $$2x.a();
         ctp<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.d = ImmutableMap.copyOf($$1);
      this.e = $$2.build();
   }

   public static <C extends bmv, T extends ctn<C>> ctq.a<C, T> b(final cts<T> $$0) {
      return new ctq.a<C, T>() {
         @Nullable
         private ajh b;

         @Override
         public Optional<ctp<T>> a(C $$0x, cwz $$1) {
            ctq $$2 = $$1.r();
            Optional<Pair<ajh, ctp<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<ajh, ctp<T>> $$4 = $$3.get();
               this.b = (ajh)$$4.getFirst();
               return Optional.of((ctp<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bmv, T extends ctn<C>> {
      Optional<ctp<T>> a(C var1, cwz var2);
   }
}
