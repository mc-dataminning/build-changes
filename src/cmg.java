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

public class cmg extends ant {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cmi<?>, Map<aeu, cmf<?>>> c = ImmutableMap.of();
   private Map<aeu, cmf<?>> d = ImmutableMap.of();
   private boolean e;

   public cmg() {
      super(a, "recipes");
   }

   protected void a(Map<aeu, JsonElement> $$0, anp $$1, bdk $$2) {
      this.e = false;
      Map<cmi<?>, Builder<aeu, cmf<?>>> $$3 = Maps.newHashMap();
      Builder<aeu, cmf<?>> $$4 = ImmutableMap.builder();

      for (Entry<aeu, JsonElement> $$5 : $$0.entrySet()) {
         aeu $$6 = $$5.getKey();

         try {
            cmf<?> $$7 = a($$6, arj.m($$5.getValue(), "top element"));
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

   public <C extends bgm, T extends cme<C>> Optional<cmf<T>> a(cmi<T> $$0, C $$1, cpq $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bgm, T extends cme<C>> Optional<Pair<aeu, cmf<T>>> a(cmi<T> $$0, C $$1, cpq $$2, @Nullable aeu $$3) {
      Map<aeu, cmf<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cmf<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cmf)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((aeu)$$0x.getKey(), (cmf)$$0x.getValue()));
   }

   public <C extends bgm, T extends cme<C>> List<cmf<T>> a(cmi<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bgm, T extends cme<C>> List<cmf<T>> b(cmi<T> $$0, C $$1, cpq $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.B_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bgm, T extends cme<C>> Map<aeu, cmf<T>> c(cmi<T> $$0) {
      return (Map<aeu, cmf<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bgm, T extends cme<C>> hp<cja> c(cmi<T> $$0, C $$1, cpq $$2) {
      Optional<cmf<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         hp<cja> $$4 = hp.a($$1.b(), cja.b);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cmf<?>> a(aeu $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cmf<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<aeu> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static cmf<?> a(aeu $$0, JsonObject $$1) {
      String $$2 = arj.i($$1, "type");
      Codec<? extends cme<?>> $$3 = (Codec<? extends cme<?>>)jd.u
         .b(new aeu($$2))
         .orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'"))
         .a();
      cme<?> $$4 = ac.a($$3.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new cmf<>($$0, $$4);
   }

   public void a(Iterable<cmf<?>> $$0) {
      this.e = false;
      Map<cmi<?>, Map<aeu, cmf<?>>> $$1 = Maps.newHashMap();
      Builder<aeu, cmf<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<aeu, cmf<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         aeu $$4 = $$2x.a();
         cmf<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bgm, T extends cme<C>> cmg.a<C, T> b(final cmi<T> $$0) {
      return new cmg.a<C, T>() {
         @Nullable
         private aeu b;

         @Override
         public Optional<cmf<T>> a(C $$0x, cpq $$1) {
            cmg $$2 = $$1.q();
            Optional<Pair<aeu, cmf<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<aeu, cmf<T>> $$4 = $$3.get();
               this.b = (aeu)$$4.getFirst();
               return Optional.of((cmf<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bgm, T extends cme<C>> {
      Optional<cmf<T>> a(C var1, cpq var2);
   }
}
