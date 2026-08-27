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

public class csv extends asj {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final in.a c;
   private Map<csx<?>, Map<ajc, csu<?>>> d = ImmutableMap.of();
   private Map<ajc, csu<?>> e = ImmutableMap.of();
   private boolean f;

   public csv(in.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<ajc, JsonElement> $$0, asf $$1, bjc $$2) {
      this.f = false;
      Map<csx<?>, Builder<ajc, csu<?>>> $$3 = Maps.newHashMap();
      Builder<ajc, csu<?>> $$4 = ImmutableMap.builder();
      aja<JsonElement> $$5 = aja.a(JsonOps.INSTANCE, this.c);

      for (Entry<ajc, JsonElement> $$6 : $$0.entrySet()) {
         ajc $$7 = $$6.getKey();

         try {
            JsonObject $$8 = awc.m($$6.getValue(), "top element");
            css<?> $$9 = ac.a(css.h.parse($$5, $$8), JsonParseException::new);
            csu<?> $$10 = new csu<>($$7, $$9);
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

   public <C extends bme, T extends css<C>> Optional<csu<T>> a(csx<T> $$0, C $$1, cwe $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bme, T extends css<C>> Optional<Pair<ajc, csu<T>>> a(csx<T> $$0, C $$1, cwe $$2, @Nullable ajc $$3) {
      Map<ajc, csu<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         csu<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((csu)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((ajc)$$0x.getKey(), (csu)$$0x.getValue()));
   }

   public <C extends bme, T extends css<C>> List<csu<T>> a(csx<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bme, T extends css<C>> List<csu<T>> b(csx<T> $$0, C $$1, cwe $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.I_()).r()))
         .collect(Collectors.toList());
   }

   private <C extends bme, T extends css<C>> Map<ajc, csu<T>> c(csx<T> $$0) {
      return (Map<ajc, csu<T>>)this.d.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bme, T extends css<C>> iu<cpq> c(csx<T> $$0, C $$1, cwe $$2) {
      Optional<csu<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         iu<cpq> $$4 = iu.a($$1.b(), cpq.h);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<csu<?>> a(ajc $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   public Collection<csu<?>> b() {
      return this.d.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<ajc> d() {
      return this.d.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   @VisibleForTesting
   protected static csu<?> a(ajc $$0, JsonObject $$1, in.a $$2) {
      css<?> $$3 = ac.a(css.h.parse(aja.a(JsonOps.INSTANCE, $$2), $$1), JsonParseException::new);
      return new csu<>($$0, $$3);
   }

   public void a(Iterable<csu<?>> $$0) {
      this.f = false;
      Map<csx<?>, Map<ajc, csu<?>>> $$1 = Maps.newHashMap();
      Builder<ajc, csu<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<ajc, csu<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         ajc $$4 = $$2x.a();
         csu<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.d = ImmutableMap.copyOf($$1);
      this.e = $$2.build();
   }

   public static <C extends bme, T extends css<C>> csv.a<C, T> b(final csx<T> $$0) {
      return new csv.a<C, T>() {
         @Nullable
         private ajc b;

         @Override
         public Optional<csu<T>> a(C $$0x, cwe $$1) {
            csv $$2 = $$1.r();
            Optional<Pair<ajc, csu<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<ajc, csu<T>> $$4 = $$3.get();
               this.b = (ajc)$$4.getFirst();
               return Optional.of((csu<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bme, T extends css<C>> {
      Optional<csu<T>> a(C var1, cwe var2);
   }
}
