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

public class cse extends ase {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<csg<?>, Map<aiy, csd<?>>> c = ImmutableMap.of();
   private Map<aiy, csd<?>> d = ImmutableMap.of();
   private boolean e;

   public cse() {
      super(a, "recipes");
   }

   protected void a(Map<aiy, JsonElement> $$0, asa $$1, bil $$2) {
      this.e = false;
      Map<csg<?>, Builder<aiy, csd<?>>> $$3 = Maps.newHashMap();
      Builder<aiy, csd<?>> $$4 = ImmutableMap.builder();

      for (Entry<aiy, JsonElement> $$5 : $$0.entrySet()) {
         aiy $$6 = $$5.getKey();

         try {
            csd<?> $$7 = a($$6, avx.m($$5.getValue(), "top element"));
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

   public <C extends bln, T extends csb<C>> Optional<csd<T>> a(csg<T> $$0, C $$1, cvn $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bln, T extends csb<C>> Optional<Pair<aiy, csd<T>>> a(csg<T> $$0, C $$1, cvn $$2, @Nullable aiy $$3) {
      Map<aiy, csd<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         csd<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((csd)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((aiy)$$0x.getKey(), (csd)$$0x.getValue()));
   }

   public <C extends bln, T extends csb<C>> List<csd<T>> a(csg<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bln, T extends csb<C>> List<csd<T>> b(csg<T> $$0, C $$1, cvn $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.I_()).r()))
         .collect(Collectors.toList());
   }

   private <C extends bln, T extends csb<C>> Map<aiy, csd<T>> c(csg<T> $$0) {
      return (Map<aiy, csd<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bln, T extends csb<C>> is<coz> c(csg<T> $$0, C $$1, cvn $$2) {
      Optional<csd<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         is<coz> $$4 = is.a($$1.b(), coz.h);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<csd<?>> a(aiy $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<csd<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<aiy> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static csd<?> a(aiy $$0, JsonObject $$1) {
      csb<?> $$2 = ac.a(csb.h.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new csd<>($$0, $$2);
   }

   public void a(Iterable<csd<?>> $$0) {
      this.e = false;
      Map<csg<?>, Map<aiy, csd<?>>> $$1 = Maps.newHashMap();
      Builder<aiy, csd<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<aiy, csd<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         aiy $$4 = $$2x.a();
         csd<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bln, T extends csb<C>> cse.a<C, T> b(final csg<T> $$0) {
      return new cse.a<C, T>() {
         @Nullable
         private aiy b;

         @Override
         public Optional<csd<T>> a(C $$0x, cvn $$1) {
            cse $$2 = $$1.r();
            Optional<Pair<aiy, csd<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<aiy, csd<T>> $$4 = $$3.get();
               this.b = (aiy)$$4.getFirst();
               return Optional.of((csd<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bln, T extends csb<C>> {
      Optional<csd<T>> a(C var1, cvn var2);
   }
}
