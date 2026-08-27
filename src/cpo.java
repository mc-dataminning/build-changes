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

public class cpo extends apw {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cpq<?>, Map<agt, cpn<?>>> c = ImmutableMap.of();
   private Map<agt, cpn<?>> d = ImmutableMap.of();
   private boolean e;

   public cpo() {
      super(a, "recipes");
   }

   protected void a(Map<agt, JsonElement> $$0, aps $$1, bgc $$2) {
      this.e = false;
      Map<cpq<?>, Builder<agt, cpn<?>>> $$3 = Maps.newHashMap();
      Builder<agt, cpn<?>> $$4 = ImmutableMap.builder();

      for (Entry<agt, JsonElement> $$5 : $$0.entrySet()) {
         agt $$6 = $$5.getKey();

         try {
            cpn<?> $$7 = a($$6, ato.m($$5.getValue(), "top element"));
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

   public <C extends bje, T extends cpl<C>> Optional<cpn<T>> a(cpq<T> $$0, C $$1, csy $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bje, T extends cpl<C>> Optional<Pair<agt, cpn<T>>> a(cpq<T> $$0, C $$1, csy $$2, @Nullable agt $$3) {
      Map<agt, cpn<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cpn<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cpn)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((agt)$$0x.getKey(), (cpn)$$0x.getValue()));
   }

   public <C extends bje, T extends cpl<C>> List<cpn<T>> a(cpq<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bje, T extends cpl<C>> List<cpn<T>> b(cpq<T> $$0, C $$1, csy $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.I_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bje, T extends cpl<C>> Map<agt, cpn<T>> c(cpq<T> $$0) {
      return (Map<agt, cpn<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bje, T extends cpl<C>> io<cmh> c(cpq<T> $$0, C $$1, csy $$2) {
      Optional<cpn<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         io<cmh> $$4 = io.a($$1.b(), cmh.f);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cpn<?>> a(agt $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cpn<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<agt> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static cpn<?> a(agt $$0, JsonObject $$1) {
      cpl<?> $$2 = ac.a(cpl.h.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new cpn<>($$0, $$2);
   }

   public void a(Iterable<cpn<?>> $$0) {
      this.e = false;
      Map<cpq<?>, Map<agt, cpn<?>>> $$1 = Maps.newHashMap();
      Builder<agt, cpn<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<agt, cpn<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         agt $$4 = $$2x.a();
         cpn<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bje, T extends cpl<C>> cpo.a<C, T> b(final cpq<T> $$0) {
      return new cpo.a<C, T>() {
         @Nullable
         private agt b;

         @Override
         public Optional<cpn<T>> a(C $$0x, csy $$1) {
            cpo $$2 = $$1.q();
            Optional<Pair<agt, cpn<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<agt, cpn<T>> $$4 = $$3.get();
               this.b = (agt)$$4.getFirst();
               return Optional.of((cpn<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bje, T extends cpl<C>> {
      Optional<cpn<T>> a(C var1, csy var2);
   }
}
