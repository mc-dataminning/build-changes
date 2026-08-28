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

public class cyz extends aut {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jk.a c;
   private Multimap<czb<?>, cyy<?>> d = ImmutableMultimap.of();
   private Map<alf, cyy<?>> e = ImmutableMap.of();
   private boolean f;

   public cyz(jk.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<alf, JsonElement> $$0, aup $$1, bnj $$2) {
      this.f = false;
      Builder<czb<?>, cyy<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alf, cyy<?>> $$4 = ImmutableMap.builder();
      ald<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<alf, JsonElement> $$6 : $$0.entrySet()) {
         alf $$7 = $$6.getKey();

         try {
            cyw<?> $$8 = (cyw<?>)cyw.h.parse($$5, $$6.getValue()).getOrThrow(JsonParseException::new);
            cyy<?> $$9 = new cyy<>($$7, $$8);
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

   public <C extends bqo, T extends cyw<C>> Optional<cyy<T>> a(czb<T> $$0, C $$1, dbz $$2) {
      return this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bqo, T extends cyw<C>> Optional<cyy<T>> a(czb<T> $$0, C $$1, dbz $$2, @Nullable alf $$3) {
      if ($$3 != null) {
         cyy<T> $$4 = this.a($$0, $$3);
         if ($$4 != null && $$4.b().a($$1, $$2)) {
            return Optional.of($$4);
         }
      }

      return this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bqo, T extends cyw<C>> List<cyy<T>> a(czb<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <C extends bqo, T extends cyw<C>> List<cyy<T>> b(czb<T> $$0, C $$1, dbz $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).t()))
         .collect(Collectors.toList());
   }

   private <C extends bqo, T extends cyw<C>> Collection<cyy<T>> c(czb<T> $$0) {
      return this.d.get($$0);
   }

   public <C extends bqo, T extends cyw<C>> jr<cuq> c(czb<T> $$0, C $$1, dbz $$2) {
      Optional<cyy<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jr<cuq> $$4 = jr.a($$1.b(), cuq.l);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cyy<?>> a(alf $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Nullable
   private <T extends cyw<?>> cyy<T> a(czb<T> $$0, alf $$1) {
      cyy<?> $$2 = this.e.get($$1);
      return (cyy<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<cyy<?>> b() {
      return this.d.values();
   }

   public Collection<cyy<?>> d() {
      return this.e.values();
   }

   public Stream<alf> e() {
      return this.e.keySet().stream();
   }

   @VisibleForTesting
   protected static cyy<?> a(alf $$0, JsonObject $$1, jk.a $$2) {
      cyw<?> $$3 = (cyw<?>)cyw.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new cyy<>($$0, $$3);
   }

   public void a(Iterable<cyy<?>> $$0) {
      this.f = false;
      Builder<czb<?>, cyy<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alf, cyy<?>> $$2 = ImmutableMap.builder();

      for (cyy<?> $$3 : $$0) {
         czb<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.d = $$1.build();
      this.e = $$2.build();
   }

   public static <C extends bqo, T extends cyw<C>> cyz.a<C, T> b(final czb<T> $$0) {
      return new cyz.a<C, T>() {
         @Nullable
         private alf b;

         @Override
         public Optional<cyy<T>> a(C $$0x, dbz $$1) {
            cyz $$2 = $$1.r();
            Optional<cyy<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               cyy<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bqo, T extends cyw<C>> {
      Optional<cyy<T>> a(C var1, dbz var2);
   }
}
