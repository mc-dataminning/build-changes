import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cyy extends aut {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jk.a c;
   private Multimap<cza<?>, cyx<?>> d = ImmutableMultimap.of();
   private Map<alf, cyx<?>> e = ImmutableMap.of();
   private boolean f;

   public cyy(jk.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<alf, JsonElement> $$0, aup $$1, bni $$2) {
      this.f = false;
      Builder<cza<?>, cyx<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alf, cyx<?>> $$4 = ImmutableMap.builder();
      ald<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<alf, JsonElement> $$6 : $$0.entrySet()) {
         alf $$7 = $$6.getKey();

         try {
            cyv<?> $$8 = (cyv<?>)cyv.h.parse($$5, $$6.getValue()).getOrThrow(JsonParseException::new);
            cyx<?> $$9 = new cyx<>($$7, $$8);
            $$3.put($$8.e(), $$9);
            $$4.put($$7, $$9);
         } catch (IllegalArgumentException | JsonParseException var12) {
            b.error("Parsing error loading recipe {}", $$7, var12);
         }
      }

      this.d = $$3.build();
      this.e = $$4.build();
      b.info("Loaded {} recipes", this.d.size());
   }

   public boolean a() {
      return this.f;
   }

   public <C extends bqn, T extends cyv<C>> Optional<cyx<T>> a(cza<T> $$0, C $$1, dby $$2) {
      return this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bqn, T extends cyv<C>> Optional<cyx<T>> a(cza<T> $$0, C $$1, dby $$2, @Nullable alf $$3) {
      if ($$3 != null) {
         cyx<T> $$4 = this.a($$0, $$3);
         if ($$4 != null && $$4.b().a($$1, $$2)) {
            return Optional.of($$4);
         }
      }

      return this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bqn, T extends cyv<C>> List<cyx<T>> a(cza<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <C extends bqn, T extends cyv<C>> List<cyx<T>> b(cza<T> $$0, C $$1, dby $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).t()))
         .collect(Collectors.toList());
   }

   private <C extends bqn, T extends cyv<C>> Collection<cyx<T>> c(cza<T> $$0) {
      return this.d.get($$0);
   }

   public <C extends bqn, T extends cyv<C>> jr<cup> c(cza<T> $$0, C $$1, dby $$2) {
      Optional<cyx<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jr<cup> $$4 = jr.a($$1.b(), cup.l);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cyx<?>> a(alf $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Nullable
   private <T extends cyv<?>> cyx<T> a(cza<T> $$0, alf $$1) {
      cyx<?> $$2 = this.e.get($$1);
      return (cyx<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<cyx<?>> b() {
      return this.d.values();
   }

   public Collection<cyx<?>> d() {
      return this.e.values();
   }

   public Stream<alf> e() {
      return this.e.keySet().stream();
   }

   @VisibleForTesting
   protected static cyx<?> a(alf $$0, JsonObject $$1, jk.a $$2) {
      cyv<?> $$3 = (cyv<?>)cyv.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new cyx<>($$0, $$3);
   }

   public void a(Iterable<cyx<?>> $$0) {
      this.f = false;
      Builder<cza<?>, cyx<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alf, cyx<?>> $$2 = ImmutableMap.builder();

      for (cyx<?> $$3 : $$0) {
         cza<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.d = $$1.build();
      this.e = $$2.build();
   }

   public static <C extends bqn, T extends cyv<C>> cyy.a<C, T> b(final cza<T> $$0) {
      return new cyy.a<C, T>() {
         @Nullable
         private alf b;

         @Override
         public Optional<cyx<T>> a(C $$0x, dby $$1) {
            cyy $$2 = $$1.r();
            Optional<cyx<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               cyx<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bqn, T extends cyv<C>> {
      Optional<cyx<T>> a(C var1, dby var2);
   }
}
