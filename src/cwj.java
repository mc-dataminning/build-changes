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

public class cwj extends ats {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final ix.a c;
   private Map<cwl<?>, Map<akf, cwi<?>>> d = ImmutableMap.of();
   private Map<akf, cwi<?>> e = ImmutableMap.of();
   private boolean f;

   public cwj(ix.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<akf, JsonElement> $$0, ato $$1, ble $$2) {
      this.f = false;
      Map<cwl<?>, Builder<akf, cwi<?>>> $$3 = Maps.newHashMap();
      Builder<akf, cwi<?>> $$4 = ImmutableMap.builder();
      akd<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<akf, JsonElement> $$6 : $$0.entrySet()) {
         akf $$7 = $$6.getKey();

         try {
            JsonObject $$8 = axm.m($$6.getValue(), "top element");
            cwg<?> $$9 = ac.a(cwg.h.parse($$5, $$8), JsonParseException::new);
            cwi<?> $$10 = new cwi<>($$7, $$9);
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

   public <C extends boj, T extends cwg<C>> Optional<cwi<T>> a(cwl<T> $$0, C $$1, czu $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends boj, T extends cwg<C>> Optional<Pair<akf, cwi<T>>> a(cwl<T> $$0, C $$1, czu $$2, @Nullable akf $$3) {
      Map<akf, cwi<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cwi<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cwi)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((akf)$$0x.getKey(), (cwi)$$0x.getValue()));
   }

   public <C extends boj, T extends cwg<C>> List<cwi<T>> a(cwl<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends boj, T extends cwg<C>> List<cwi<T>> b(cwl<T> $$0, C $$1, czu $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).s()))
         .collect(Collectors.toList());
   }

   private <C extends boj, T extends cwg<C>> Map<akf, cwi<T>> c(cwl<T> $$0) {
      return (Map<akf, cwi<T>>)this.d.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends boj, T extends cwg<C>> je<csd> c(cwl<T> $$0, C $$1, czu $$2) {
      Optional<cwi<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         je<csd> $$4 = je.a($$1.b(), csd.i);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cwi<?>> a(akf $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   public Collection<cwi<?>> b() {
      return this.d.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<akf> d() {
      return this.d.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   @VisibleForTesting
   protected static cwi<?> a(akf $$0, JsonObject $$1, ix.a $$2) {
      cwg<?> $$3 = ac.a(cwg.h.parse($$2.a(JsonOps.INSTANCE), $$1), JsonParseException::new);
      return new cwi<>($$0, $$3);
   }

   public void a(Iterable<cwi<?>> $$0) {
      this.f = false;
      Map<cwl<?>, Map<akf, cwi<?>>> $$1 = Maps.newHashMap();
      Builder<akf, cwi<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<akf, cwi<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         akf $$4 = $$2x.a();
         cwi<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.d = ImmutableMap.copyOf($$1);
      this.e = $$2.build();
   }

   public static <C extends boj, T extends cwg<C>> cwj.a<C, T> b(final cwl<T> $$0) {
      return new cwj.a<C, T>() {
         @Nullable
         private akf b;

         @Override
         public Optional<cwi<T>> a(C $$0x, czu $$1) {
            cwj $$2 = $$1.r();
            Optional<Pair<akf, cwi<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<akf, cwi<T>> $$4 = $$3.get();
               this.b = (akf)$$4.getFirst();
               return Optional.of((cwi<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends boj, T extends cwg<C>> {
      Optional<cwi<T>> a(C var1, czu var2);
   }
}
