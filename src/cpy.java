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

public class cpy extends aqg {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cqa<?>, Map<ahd, cpx<?>>> c = ImmutableMap.of();
   private Map<ahd, cpx<?>> d = ImmutableMap.of();
   private boolean e;

   public cpy() {
      super(a, "recipes");
   }

   protected void a(Map<ahd, JsonElement> $$0, aqc $$1, bgm $$2) {
      this.e = false;
      Map<cqa<?>, Builder<ahd, cpx<?>>> $$3 = Maps.newHashMap();
      Builder<ahd, cpx<?>> $$4 = ImmutableMap.builder();

      for (Entry<ahd, JsonElement> $$5 : $$0.entrySet()) {
         ahd $$6 = $$5.getKey();

         try {
            cpx<?> $$7 = a($$6, aty.m($$5.getValue(), "top element"));
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

   public <C extends bjo, T extends cpv<C>> Optional<cpx<T>> a(cqa<T> $$0, C $$1, cti $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bjo, T extends cpv<C>> Optional<Pair<ahd, cpx<T>>> a(cqa<T> $$0, C $$1, cti $$2, @Nullable ahd $$3) {
      Map<ahd, cpx<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cpx<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cpx)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((ahd)$$0x.getKey(), (cpx)$$0x.getValue()));
   }

   public <C extends bjo, T extends cpv<C>> List<cpx<T>> a(cqa<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bjo, T extends cpv<C>> List<cpx<T>> b(cqa<T> $$0, C $$1, cti $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.I_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bjo, T extends cpv<C>> Map<ahd, cpx<T>> c(cqa<T> $$0) {
      return (Map<ahd, cpx<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bjo, T extends cpv<C>> iq<cmr> c(cqa<T> $$0, C $$1, cti $$2) {
      Optional<cpx<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         iq<cmr> $$4 = iq.a($$1.b(), cmr.f);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cpx<?>> a(ahd $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cpx<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<ahd> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static cpx<?> a(ahd $$0, JsonObject $$1) {
      cpv<?> $$2 = ac.a(cpv.h.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new cpx<>($$0, $$2);
   }

   public void a(Iterable<cpx<?>> $$0) {
      this.e = false;
      Map<cqa<?>, Map<ahd, cpx<?>>> $$1 = Maps.newHashMap();
      Builder<ahd, cpx<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<ahd, cpx<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         ahd $$4 = $$2x.a();
         cpx<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bjo, T extends cpv<C>> cpy.a<C, T> b(final cqa<T> $$0) {
      return new cpy.a<C, T>() {
         @Nullable
         private ahd b;

         @Override
         public Optional<cpx<T>> a(C $$0x, cti $$1) {
            cpy $$2 = $$1.r();
            Optional<Pair<ahd, cpx<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<ahd, cpx<T>> $$4 = $$3.get();
               this.b = (ahd)$$4.getFirst();
               return Optional.of((cpx<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bjo, T extends cpv<C>> {
      Optional<cpx<T>> a(C var1, cti var2);
   }
}
