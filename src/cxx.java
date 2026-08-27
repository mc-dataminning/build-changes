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

public class cxx extends aua {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final iz.a c;
   private Map<cxz<?>, Map<akm, cxw<?>>> d = ImmutableMap.of();
   private Map<akm, cxw<?>> e = ImmutableMap.of();
   private boolean f;

   public cxx(iz.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<akm, JsonElement> $$0, atw $$1, bmi $$2) {
      this.f = false;
      Map<cxz<?>, Builder<akm, cxw<?>>> $$3 = Maps.newHashMap();
      Builder<akm, cxw<?>> $$4 = ImmutableMap.builder();
      akk<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<akm, JsonElement> $$6 : $$0.entrySet()) {
         akm $$7 = $$6.getKey();

         try {
            JsonObject $$8 = axu.m($$6.getValue(), "top element");
            cxu<?> $$9 = (cxu<?>)cxu.h.parse($$5, $$8).getOrThrow(JsonParseException::new);
            cxw<?> $$10 = new cxw<>($$7, $$9);
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

   public <C extends bpn, T extends cxu<C>> Optional<cxw<T>> a(cxz<T> $$0, C $$1, dax $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bpn, T extends cxu<C>> Optional<Pair<akm, cxw<T>>> a(cxz<T> $$0, C $$1, dax $$2, @Nullable akm $$3) {
      Map<akm, cxw<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cxw<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cxw)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((akm)$$0x.getKey(), (cxw)$$0x.getValue()));
   }

   public <C extends bpn, T extends cxu<C>> List<cxw<T>> a(cxz<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bpn, T extends cxu<C>> List<cxw<T>> b(cxz<T> $$0, C $$1, dax $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).t()))
         .collect(Collectors.toList());
   }

   private <C extends bpn, T extends cxu<C>> Map<akm, cxw<T>> c(cxz<T> $$0) {
      return (Map<akm, cxw<T>>)this.d.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bpn, T extends cxu<C>> jg<cto> c(cxz<T> $$0, C $$1, dax $$2) {
      Optional<cxw<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jg<cto> $$4 = jg.a($$1.b(), cto.i);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cxw<?>> a(akm $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   public Collection<cxw<?>> b() {
      return this.d.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<akm> d() {
      return this.d.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   @VisibleForTesting
   protected static cxw<?> a(akm $$0, JsonObject $$1, iz.a $$2) {
      cxu<?> $$3 = (cxu<?>)cxu.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new cxw<>($$0, $$3);
   }

   public void a(Iterable<cxw<?>> $$0) {
      this.f = false;
      Map<cxz<?>, Map<akm, cxw<?>>> $$1 = Maps.newHashMap();
      Builder<akm, cxw<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<akm, cxw<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         akm $$4 = $$2x.a();
         cxw<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.d = ImmutableMap.copyOf($$1);
      this.e = $$2.build();
   }

   public static <C extends bpn, T extends cxu<C>> cxx.a<C, T> b(final cxz<T> $$0) {
      return new cxx.a<C, T>() {
         @Nullable
         private akm b;

         @Override
         public Optional<cxw<T>> a(C $$0x, dax $$1) {
            cxx $$2 = $$1.r();
            Optional<Pair<akm, cxw<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<akm, cxw<T>> $$4 = $$3.get();
               this.b = (akm)$$4.getFirst();
               return Optional.of((cxw<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bpn, T extends cxu<C>> {
      Optional<cxw<T>> a(C var1, dax var2);
   }
}
