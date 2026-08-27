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

public class cvm extends atg {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final in.a c;
   private Map<cvo<?>, Map<ajt, cvl<?>>> d = ImmutableMap.of();
   private Map<ajt, cvl<?>> e = ImmutableMap.of();
   private boolean f;

   public cvm(in.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<ajt, JsonElement> $$0, atc $$1, bko $$2) {
      this.f = false;
      Map<cvo<?>, Builder<ajt, cvl<?>>> $$3 = Maps.newHashMap();
      Builder<ajt, cvl<?>> $$4 = ImmutableMap.builder();
      ajr<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<ajt, JsonElement> $$6 : $$0.entrySet()) {
         ajt $$7 = $$6.getKey();

         try {
            JsonObject $$8 = axa.m($$6.getValue(), "top element");
            cvj<?> $$9 = ac.a(cvj.h.parse($$5, $$8), JsonParseException::new);
            cvl<?> $$10 = new cvl<>($$7, $$9);
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

   public <C extends bnt, T extends cvj<C>> Optional<cvl<T>> a(cvo<T> $$0, C $$1, cyx $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bnt, T extends cvj<C>> Optional<Pair<ajt, cvl<T>>> a(cvo<T> $$0, C $$1, cyx $$2, @Nullable ajt $$3) {
      Map<ajt, cvl<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cvl<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cvl)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((ajt)$$0x.getKey(), (cvl)$$0x.getValue()));
   }

   public <C extends bnt, T extends cvj<C>> List<cvl<T>> a(cvo<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bnt, T extends cvj<C>> List<cvl<T>> b(cvo<T> $$0, C $$1, cyx $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).s()))
         .collect(Collectors.toList());
   }

   private <C extends bnt, T extends cvj<C>> Map<ajt, cvl<T>> c(cvo<T> $$0) {
      return (Map<ajt, cvl<T>>)this.d.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bnt, T extends cvj<C>> iu<crj> c(cvo<T> $$0, C $$1, cyx $$2) {
      Optional<cvl<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         iu<crj> $$4 = iu.a($$1.b(), crj.i);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cvl<?>> a(ajt $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   public Collection<cvl<?>> b() {
      return this.d.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<ajt> d() {
      return this.d.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   @VisibleForTesting
   protected static cvl<?> a(ajt $$0, JsonObject $$1, in.a $$2) {
      cvj<?> $$3 = ac.a(cvj.h.parse($$2.a(JsonOps.INSTANCE), $$1), JsonParseException::new);
      return new cvl<>($$0, $$3);
   }

   public void a(Iterable<cvl<?>> $$0) {
      this.f = false;
      Map<cvo<?>, Map<ajt, cvl<?>>> $$1 = Maps.newHashMap();
      Builder<ajt, cvl<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<ajt, cvl<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         ajt $$4 = $$2x.a();
         cvl<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.d = ImmutableMap.copyOf($$1);
      this.e = $$2.build();
   }

   public static <C extends bnt, T extends cvj<C>> cvm.a<C, T> b(final cvo<T> $$0) {
      return new cvm.a<C, T>() {
         @Nullable
         private ajt b;

         @Override
         public Optional<cvl<T>> a(C $$0x, cyx $$1) {
            cvm $$2 = $$1.r();
            Optional<Pair<ajt, cvl<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<ajt, cvl<T>> $$4 = $$3.get();
               this.b = (ajt)$$4.getFirst();
               return Optional.of((cvl<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bnt, T extends cvj<C>> {
      Optional<cvl<T>> a(C var1, cyx var2);
   }
}
