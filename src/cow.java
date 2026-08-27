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

public class cow extends app {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<coy<?>, Map<agm, cov<?>>> c = ImmutableMap.of();
   private Map<agm, cov<?>> d = ImmutableMap.of();
   private boolean e;

   public cow() {
      super(a, "recipes");
   }

   protected void a(Map<agm, JsonElement> $$0, apl $$1, bfs $$2) {
      this.e = false;
      Map<coy<?>, Builder<agm, cov<?>>> $$3 = Maps.newHashMap();
      Builder<agm, cov<?>> $$4 = ImmutableMap.builder();

      for (Entry<agm, JsonElement> $$5 : $$0.entrySet()) {
         agm $$6 = $$5.getKey();

         try {
            cov<?> $$7 = a($$6, atg.m($$5.getValue(), "top element"));
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

   public <C extends biu, T extends cot<C>> Optional<cov<T>> a(coy<T> $$0, C $$1, csf $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends biu, T extends cot<C>> Optional<Pair<agm, cov<T>>> a(coy<T> $$0, C $$1, csf $$2, @Nullable agm $$3) {
      Map<agm, cov<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cov<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cov)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((agm)$$0x.getKey(), (cov)$$0x.getValue()));
   }

   public <C extends biu, T extends cot<C>> List<cov<T>> a(coy<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends biu, T extends cot<C>> List<cov<T>> b(coy<T> $$0, C $$1, csf $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.I_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends biu, T extends cot<C>> Map<agm, cov<T>> c(coy<T> $$0) {
      return (Map<agm, cov<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends biu, T extends cot<C>> ip<clo> c(coy<T> $$0, C $$1, csf $$2) {
      Optional<cov<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         ip<clo> $$4 = ip.a($$1.b(), clo.b);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cov<?>> a(agm $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cov<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<agm> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static cov<?> a(agm $$0, JsonObject $$1) {
      String $$2 = atg.i($$1, "type");
      Codec<? extends cot<?>> $$3 = (Codec<? extends cot<?>>)kc.u
         .b(new agm($$2))
         .orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'"))
         .a();
      cot<?> $$4 = ac.a($$3.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new cov<>($$0, $$4);
   }

   public void a(Iterable<cov<?>> $$0) {
      this.e = false;
      Map<coy<?>, Map<agm, cov<?>>> $$1 = Maps.newHashMap();
      Builder<agm, cov<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<agm, cov<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         agm $$4 = $$2x.a();
         cov<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends biu, T extends cot<C>> cow.a<C, T> b(final coy<T> $$0) {
      return new cow.a<C, T>() {
         @Nullable
         private agm b;

         @Override
         public Optional<cov<T>> a(C $$0x, csf $$1) {
            cow $$2 = $$1.q();
            Optional<Pair<agm, cov<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<agm, cov<T>> $$4 = $$3.get();
               this.b = (agm)$$4.getFirst();
               return Optional.of((cov<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends biu, T extends cot<C>> {
      Optional<cov<T>> a(C var1, csf var2);
   }
}
