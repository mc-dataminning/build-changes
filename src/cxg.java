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

public class cxg extends atv {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final iy.a c;
   private Map<cxi<?>, Map<akh, cxf<?>>> d = ImmutableMap.of();
   private Map<akh, cxf<?>> e = ImmutableMap.of();
   private boolean f;

   public cxg(iy.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<akh, JsonElement> $$0, atr $$1, bma $$2) {
      this.f = false;
      Map<cxi<?>, Builder<akh, cxf<?>>> $$3 = Maps.newHashMap();
      Builder<akh, cxf<?>> $$4 = ImmutableMap.builder();
      akf<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<akh, JsonElement> $$6 : $$0.entrySet()) {
         akh $$7 = $$6.getKey();

         try {
            JsonObject $$8 = axp.m($$6.getValue(), "top element");
            cxd<?> $$9 = ac.a(cxd.h.parse($$5, $$8), JsonParseException::new);
            cxf<?> $$10 = new cxf<>($$7, $$9);
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

   public <C extends bpf, T extends cxd<C>> Optional<cxf<T>> a(cxi<T> $$0, C $$1, dad $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bpf, T extends cxd<C>> Optional<Pair<akh, cxf<T>>> a(cxi<T> $$0, C $$1, dad $$2, @Nullable akh $$3) {
      Map<akh, cxf<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cxf<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cxf)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((akh)$$0x.getKey(), (cxf)$$0x.getValue()));
   }

   public <C extends bpf, T extends cxd<C>> List<cxf<T>> a(cxi<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bpf, T extends cxd<C>> List<cxf<T>> b(cxi<T> $$0, C $$1, dad $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).s()))
         .collect(Collectors.toList());
   }

   private <C extends bpf, T extends cxd<C>> Map<akh, cxf<T>> c(cxi<T> $$0) {
      return (Map<akh, cxf<T>>)this.d.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bpf, T extends cxd<C>> jf<csz> c(cxi<T> $$0, C $$1, dad $$2) {
      Optional<cxf<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jf<csz> $$4 = jf.a($$1.b(), csz.i);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cxf<?>> a(akh $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   public Collection<cxf<?>> b() {
      return this.d.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<akh> d() {
      return this.d.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   @VisibleForTesting
   protected static cxf<?> a(akh $$0, JsonObject $$1, iy.a $$2) {
      cxd<?> $$3 = ac.a(cxd.h.parse($$2.a(JsonOps.INSTANCE), $$1), JsonParseException::new);
      return new cxf<>($$0, $$3);
   }

   public void a(Iterable<cxf<?>> $$0) {
      this.f = false;
      Map<cxi<?>, Map<akh, cxf<?>>> $$1 = Maps.newHashMap();
      Builder<akh, cxf<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<akh, cxf<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         akh $$4 = $$2x.a();
         cxf<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.d = ImmutableMap.copyOf($$1);
      this.e = $$2.build();
   }

   public static <C extends bpf, T extends cxd<C>> cxg.a<C, T> b(final cxi<T> $$0) {
      return new cxg.a<C, T>() {
         @Nullable
         private akh b;

         @Override
         public Optional<cxf<T>> a(C $$0x, dad $$1) {
            cxg $$2 = $$1.r();
            Optional<Pair<akh, cxf<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<akh, cxf<T>> $$4 = $$3.get();
               this.b = (akh)$$4.getFirst();
               return Optional.of((cxf<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bpf, T extends cxd<C>> {
      Optional<cxf<T>> a(C var1, dad var2);
   }
}
