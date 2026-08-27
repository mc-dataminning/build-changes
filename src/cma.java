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

public class cma extends ano {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cmc<?>, Map<aep, clz<?>>> c = ImmutableMap.of();
   private Map<aep, clz<?>> d = ImmutableMap.of();
   private boolean e;

   public cma() {
      super(a, "recipes");
   }

   protected void a(Map<aep, JsonElement> $$0, ank $$1, bde $$2) {
      this.e = false;
      Map<cmc<?>, Builder<aep, clz<?>>> $$3 = Maps.newHashMap();
      Builder<aep, clz<?>> $$4 = ImmutableMap.builder();

      for (Entry<aep, JsonElement> $$5 : $$0.entrySet()) {
         aep $$6 = $$5.getKey();

         try {
            clz<?> $$7 = a($$6, arf.m($$5.getValue(), "top element"));
            $$3.computeIfAbsent($$7.f(), $$0x -> ImmutableMap.builder()).put($$6, $$7);
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

   public <C extends bgh, T extends clz<C>> Optional<T> a(cmc<T> $$0, C $$1, cpk $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.a($$1, $$2)).findFirst();
   }

   public <C extends bgh, T extends clz<C>> Optional<Pair<aep, T>> a(cmc<T> $$0, C $$1, cpk $$2, @Nullable aep $$3) {
      Map<aep, T> $$4 = this.c($$0);
      if ($$3 != null) {
         T $$5 = (T)$$4.get($$3);
         if ($$5 != null && $$5.a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((clz)$$2x.getValue()).a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((aep)$$0x.getKey(), (clz)$$0x.getValue()));
   }

   public <C extends bgh, T extends clz<C>> List<T> a(cmc<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bgh, T extends clz<C>> List<T> b(cmc<T> $$0, C $$1, cpk $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.a($$2.B_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bgh, T extends clz<C>> Map<aep, T> c(cmc<T> $$0) {
      return this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bgh, T extends clz<C>> ho<ciw> c(cmc<T> $$0, C $$1, cpk $$2) {
      Optional<T> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().a($$1);
      } else {
         ho<ciw> $$4 = ho.a($$1.b(), ciw.b);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<? extends clz<?>> a(aep $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<clz<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<aep> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   public static clz<?> a(aep $$0, JsonObject $$1) {
      String $$2 = arf.i($$1, "type");
      return jc.u.b(new aep($$2)).orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'")).a($$0, $$1);
   }

   public void a(Iterable<clz<?>> $$0) {
      this.e = false;
      Map<cmc<?>, Map<aep, clz<?>>> $$1 = Maps.newHashMap();
      Builder<aep, clz<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<aep, clz<?>> $$3 = $$1.computeIfAbsent($$2x.f(), $$0xx -> Maps.newHashMap());
         aep $$4 = $$2x.e();
         clz<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bgh, T extends clz<C>> cma.a<C, T> b(final cmc<T> $$0) {
      return new cma.a<C, T>() {
         @Nullable
         private aep b;

         @Override
         public Optional<T> a(C $$0x, cpk $$1) {
            cma $$2 = $$1.q();
            Optional<Pair<aep, T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<aep, T> $$4 = $$3.get();
               this.b = (aep)$$4.getFirst();
               return Optional.of((T)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bgh, T extends clz<C>> {
      Optional<T> a(C var1, cpk var2);
   }
}
