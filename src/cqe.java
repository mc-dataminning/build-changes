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

public class cqe extends aql {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cqg<?>, Map<ahg, cqd<?>>> c = ImmutableMap.of();
   private Map<ahg, cqd<?>> d = ImmutableMap.of();
   private boolean e;

   public cqe() {
      super(a, "recipes");
   }

   protected void a(Map<ahg, JsonElement> $$0, aqh $$1, bgr $$2) {
      this.e = false;
      Map<cqg<?>, Builder<ahg, cqd<?>>> $$3 = Maps.newHashMap();
      Builder<ahg, cqd<?>> $$4 = ImmutableMap.builder();

      for (Entry<ahg, JsonElement> $$5 : $$0.entrySet()) {
         ahg $$6 = $$5.getKey();

         try {
            cqd<?> $$7 = a($$6, aud.m($$5.getValue(), "top element"));
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

   public <C extends bjt, T extends cqb<C>> Optional<cqd<T>> a(cqg<T> $$0, C $$1, cto $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bjt, T extends cqb<C>> Optional<Pair<ahg, cqd<T>>> a(cqg<T> $$0, C $$1, cto $$2, @Nullable ahg $$3) {
      Map<ahg, cqd<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cqd<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cqd)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((ahg)$$0x.getKey(), (cqd)$$0x.getValue()));
   }

   public <C extends bjt, T extends cqb<C>> List<cqd<T>> a(cqg<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bjt, T extends cqb<C>> List<cqd<T>> b(cqg<T> $$0, C $$1, cto $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.I_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bjt, T extends cqb<C>> Map<ahg, cqd<T>> c(cqg<T> $$0) {
      return (Map<ahg, cqd<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bjt, T extends cqb<C>> iq<cmx> c(cqg<T> $$0, C $$1, cto $$2) {
      Optional<cqd<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         iq<cmx> $$4 = iq.a($$1.b(), cmx.f);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cqd<?>> a(ahg $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cqd<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<ahg> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static cqd<?> a(ahg $$0, JsonObject $$1) {
      cqb<?> $$2 = ac.a(cqb.h.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new cqd<>($$0, $$2);
   }

   public void a(Iterable<cqd<?>> $$0) {
      this.e = false;
      Map<cqg<?>, Map<ahg, cqd<?>>> $$1 = Maps.newHashMap();
      Builder<ahg, cqd<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<ahg, cqd<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         ahg $$4 = $$2x.a();
         cqd<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bjt, T extends cqb<C>> cqe.a<C, T> b(final cqg<T> $$0) {
      return new cqe.a<C, T>() {
         @Nullable
         private ahg b;

         @Override
         public Optional<cqd<T>> a(C $$0x, cto $$1) {
            cqe $$2 = $$1.r();
            Optional<Pair<ahg, cqd<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<ahg, cqd<T>> $$4 = $$3.get();
               this.b = (ahg)$$4.getFirst();
               return Optional.of((cqd<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bjt, T extends cqb<C>> {
      Optional<cqd<T>> a(C var1, cto var2);
   }
}
