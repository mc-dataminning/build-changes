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

public class coi extends aph {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cok<?>, Map<agg, coh<?>>> c = ImmutableMap.of();
   private Map<agg, coh<?>> d = ImmutableMap.of();
   private boolean e;

   public coi() {
      super(a, "recipes");
   }

   protected void a(Map<agg, JsonElement> $$0, apd $$1, bfh $$2) {
      this.e = false;
      Map<cok<?>, Builder<agg, coh<?>>> $$3 = Maps.newHashMap();
      Builder<agg, coh<?>> $$4 = ImmutableMap.builder();

      for (Entry<agg, JsonElement> $$5 : $$0.entrySet()) {
         agg $$6 = $$5.getKey();

         try {
            coh<?> $$7 = a($$6, asy.m($$5.getValue(), "top element"));
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

   public <C extends bij, T extends cof<C>> Optional<coh<T>> a(cok<T> $$0, C $$1, crs $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bij, T extends cof<C>> Optional<Pair<agg, coh<T>>> a(cok<T> $$0, C $$1, crs $$2, @Nullable agg $$3) {
      Map<agg, coh<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         coh<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((coh)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((agg)$$0x.getKey(), (coh)$$0x.getValue()));
   }

   public <C extends bij, T extends cof<C>> List<coh<T>> a(cok<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bij, T extends cof<C>> List<coh<T>> b(cok<T> $$0, C $$1, crs $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bij, T extends cof<C>> Map<agg, coh<T>> c(cok<T> $$0) {
      return (Map<agg, coh<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bij, T extends cof<C>> il<clb> c(cok<T> $$0, C $$1, crs $$2) {
      Optional<coh<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         il<clb> $$4 = il.a($$1.b(), clb.b);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<coh<?>> a(agg $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<coh<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<agg> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static coh<?> a(agg $$0, JsonObject $$1) {
      String $$2 = asy.i($$1, "type");
      Codec<? extends cof<?>> $$3 = (Codec<? extends cof<?>>)jy.u
         .b(new agg($$2))
         .orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'"))
         .a();
      cof<?> $$4 = ac.a($$3.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new coh<>($$0, $$4);
   }

   public void a(Iterable<coh<?>> $$0) {
      this.e = false;
      Map<cok<?>, Map<agg, coh<?>>> $$1 = Maps.newHashMap();
      Builder<agg, coh<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<agg, coh<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         agg $$4 = $$2x.a();
         coh<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bij, T extends cof<C>> coi.a<C, T> b(final cok<T> $$0) {
      return new coi.a<C, T>() {
         @Nullable
         private agg b;

         @Override
         public Optional<coh<T>> a(C $$0x, crs $$1) {
            coi $$2 = $$1.q();
            Optional<Pair<agg, coh<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<agg, coh<T>> $$4 = $$3.get();
               this.b = (agg)$$4.getFirst();
               return Optional.of((coh<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bij, T extends cof<C>> {
      Optional<coh<T>> a(C var1, crs var2);
   }
}
