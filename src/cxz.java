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

public class cxz extends aub {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final iz.a c;
   private Map<cyb<?>, Map<akn, cxy<?>>> d = ImmutableMap.of();
   private Map<akn, cxy<?>> e = ImmutableMap.of();
   private boolean f;

   public cxz(iz.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<akn, JsonElement> $$0, atx $$1, bmk $$2) {
      this.f = false;
      Map<cyb<?>, Builder<akn, cxy<?>>> $$3 = Maps.newHashMap();
      Builder<akn, cxy<?>> $$4 = ImmutableMap.builder();
      akl<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<akn, JsonElement> $$6 : $$0.entrySet()) {
         akn $$7 = $$6.getKey();

         try {
            JsonObject $$8 = axv.m($$6.getValue(), "top element");
            cxw<?> $$9 = (cxw<?>)cxw.h.parse($$5, $$8).getOrThrow(JsonParseException::new);
            cxy<?> $$10 = new cxy<>($$7, $$9);
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

   public <C extends bpp, T extends cxw<C>> Optional<cxy<T>> a(cyb<T> $$0, C $$1, daz $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bpp, T extends cxw<C>> Optional<Pair<akn, cxy<T>>> a(cyb<T> $$0, C $$1, daz $$2, @Nullable akn $$3) {
      Map<akn, cxy<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cxy<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cxy)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((akn)$$0x.getKey(), (cxy)$$0x.getValue()));
   }

   public <C extends bpp, T extends cxw<C>> List<cxy<T>> a(cyb<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bpp, T extends cxw<C>> List<cxy<T>> b(cyb<T> $$0, C $$1, daz $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).t()))
         .collect(Collectors.toList());
   }

   private <C extends bpp, T extends cxw<C>> Map<akn, cxy<T>> c(cyb<T> $$0) {
      return (Map<akn, cxy<T>>)this.d.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bpp, T extends cxw<C>> jg<ctq> c(cyb<T> $$0, C $$1, daz $$2) {
      Optional<cxy<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jg<ctq> $$4 = jg.a($$1.b(), ctq.i);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cxy<?>> a(akn $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   public Collection<cxy<?>> b() {
      return this.d.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<akn> d() {
      return this.d.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   @VisibleForTesting
   protected static cxy<?> a(akn $$0, JsonObject $$1, iz.a $$2) {
      cxw<?> $$3 = (cxw<?>)cxw.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new cxy<>($$0, $$3);
   }

   public void a(Iterable<cxy<?>> $$0) {
      this.f = false;
      Map<cyb<?>, Map<akn, cxy<?>>> $$1 = Maps.newHashMap();
      Builder<akn, cxy<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<akn, cxy<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         akn $$4 = $$2x.a();
         cxy<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.d = ImmutableMap.copyOf($$1);
      this.e = $$2.build();
   }

   public static <C extends bpp, T extends cxw<C>> cxz.a<C, T> b(final cyb<T> $$0) {
      return new cxz.a<C, T>() {
         @Nullable
         private akn b;

         @Override
         public Optional<cxy<T>> a(C $$0x, daz $$1) {
            cxz $$2 = $$1.r();
            Optional<Pair<akn, cxy<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<akn, cxy<T>> $$4 = $$3.get();
               this.b = (akn)$$4.getFirst();
               return Optional.of((cxy<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bpp, T extends cxw<C>> {
      Optional<cxy<T>> a(C var1, daz var2);
   }
}
