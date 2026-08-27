import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
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

public class cor extends apl {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cot<?>, Map<agi, coq<?>>> c = ImmutableMap.of();
   private Map<agi, coq<?>> d = ImmutableMap.of();
   private boolean e;

   public cor() {
      super(a, "recipes");
   }

   protected void a(Map<agi, JsonElement> $$0, aph $$1, bfo $$2) {
      this.e = false;
      Map<cot<?>, Builder<agi, coq<?>>> $$3 = Maps.newHashMap();
      Builder<agi, coq<?>> $$4 = ImmutableMap.builder();

      for (Entry<agi, JsonElement> $$5 : $$0.entrySet()) {
         agi $$6 = $$5.getKey();

         try {
            coq<?> $$7 = a($$6, atc.m($$5.getValue(), "top element"));
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

   public <C extends biq, T extends coo<C>> Optional<coq<T>> a(cot<T> $$0, C $$1, csa $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends biq, T extends coo<C>> Optional<Pair<agi, coq<T>>> a(cot<T> $$0, C $$1, csa $$2, @Nullable agi $$3) {
      Map<agi, coq<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         coq<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((coq)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((agi)$$0x.getKey(), (coq)$$0x.getValue()));
   }

   public <C extends biq, T extends coo<C>> List<coq<T>> a(cot<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends biq, T extends coo<C>> List<coq<T>> b(cot<T> $$0, C $$1, csa $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends biq, T extends coo<C>> Map<agi, coq<T>> c(cot<T> $$0) {
      return (Map<agi, coq<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends biq, T extends coo<C>> il<clj> c(cot<T> $$0, C $$1, csa $$2) {
      Optional<coq<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         il<clj> $$4 = il.a($$1.b(), clj.b);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<coq<?>> a(agi $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<coq<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<agi> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static coq<?> a(agi $$0, JsonObject $$1) {
      String $$2 = atc.i($$1, "type");
      Codec<? extends coo<?>> $$3 = (Codec<? extends coo<?>>)jy.u
         .b(new agi($$2))
         .orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'"))
         .a();
      coo<?> $$4 = ac.a($$3.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new coq<>($$0, $$4);
   }

   public void a(Iterable<coq<?>> $$0) {
      this.e = false;
      Map<cot<?>, Map<agi, coq<?>>> $$1 = Maps.newHashMap();
      Builder<agi, coq<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<agi, coq<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         agi $$4 = $$2x.a();
         coq<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends biq, T extends coo<C>> cor.a<C, T> b(final cot<T> $$0) {
      return new cor.a<C, T>() {
         @Nullable
         private agi b;

         @Override
         public Optional<coq<T>> a(C $$0x, csa $$1) {
            cor $$2 = $$1.q();
            Optional<Pair<agi, coq<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<agi, coq<T>> $$4 = $$3.get();
               this.b = (agi)$$4.getFirst();
               return Optional.of((coq<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends biq, T extends coo<C>> {
      Optional<coq<T>> a(C var1, csa var2);
   }
}
