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

public class cyw extends aus {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jk.a c;
   private Multimap<cyy<?>, cyv<?>> d = ImmutableMultimap.of();
   private Map<ale, cyv<?>> e = ImmutableMap.of();
   private boolean f;

   public cyw(jk.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<ale, JsonElement> $$0, auo $$1, bng $$2) {
      this.f = false;
      Builder<cyy<?>, cyv<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<ale, cyv<?>> $$4 = ImmutableMap.builder();
      alc<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<ale, JsonElement> $$6 : $$0.entrySet()) {
         ale $$7 = $$6.getKey();

         try {
            cyt<?> $$8 = (cyt<?>)cyt.h.parse($$5, $$6.getValue()).getOrThrow(JsonParseException::new);
            cyv<?> $$9 = new cyv<>($$7, $$8);
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

   public <C extends bql, T extends cyt<C>> Optional<cyv<T>> a(cyy<T> $$0, C $$1, dbw $$2) {
      return this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bql, T extends cyt<C>> Optional<cyv<T>> a(cyy<T> $$0, C $$1, dbw $$2, @Nullable ale $$3) {
      if ($$3 != null) {
         cyv<T> $$4 = this.a($$0, $$3);
         if ($$4 != null && $$4.b().a($$1, $$2)) {
            return Optional.of($$4);
         }
      }

      return this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bql, T extends cyt<C>> List<cyv<T>> a(cyy<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <C extends bql, T extends cyt<C>> List<cyv<T>> b(cyy<T> $$0, C $$1, dbw $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).t()))
         .collect(Collectors.toList());
   }

   private <C extends bql, T extends cyt<C>> Collection<cyv<T>> c(cyy<T> $$0) {
      return this.d.get($$0);
   }

   public <C extends bql, T extends cyt<C>> jr<cun> c(cyy<T> $$0, C $$1, dbw $$2) {
      Optional<cyv<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jr<cun> $$4 = jr.a($$1.b(), cun.l);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cyv<?>> a(ale $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Nullable
   private <T extends cyt<?>> cyv<T> a(cyy<T> $$0, ale $$1) {
      cyv<?> $$2 = this.e.get($$1);
      return (cyv<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<cyv<?>> b() {
      return this.d.values();
   }

   public Collection<cyv<?>> d() {
      return this.e.values();
   }

   public Stream<ale> e() {
      return this.e.keySet().stream();
   }

   @VisibleForTesting
   protected static cyv<?> a(ale $$0, JsonObject $$1, jk.a $$2) {
      cyt<?> $$3 = (cyt<?>)cyt.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new cyv<>($$0, $$3);
   }

   public void a(Iterable<cyv<?>> $$0) {
      this.f = false;
      Builder<cyy<?>, cyv<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<ale, cyv<?>> $$2 = ImmutableMap.builder();

      for (cyv<?> $$3 : $$0) {
         cyy<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.d = $$1.build();
      this.e = $$2.build();
   }

   public static <C extends bql, T extends cyt<C>> cyw.a<C, T> b(final cyy<T> $$0) {
      return new cyw.a<C, T>() {
         @Nullable
         private ale b;

         @Override
         public Optional<cyv<T>> a(C $$0x, dbw $$1) {
            cyw $$2 = $$1.r();
            Optional<cyv<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               cyv<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bql, T extends cyt<C>> {
      Optional<cyv<T>> a(C var1, dbw var2);
   }
}
