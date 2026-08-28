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

public class cyx extends aus {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jk.a c;
   private Multimap<cyz<?>, cyw<?>> d = ImmutableMultimap.of();
   private Map<ale, cyw<?>> e = ImmutableMap.of();
   private boolean f;

   public cyx(jk.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<ale, JsonElement> $$0, auo $$1, bnh $$2) {
      this.f = false;
      Builder<cyz<?>, cyw<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<ale, cyw<?>> $$4 = ImmutableMap.builder();
      alc<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<ale, JsonElement> $$6 : $$0.entrySet()) {
         ale $$7 = $$6.getKey();

         try {
            cyu<?> $$8 = (cyu<?>)cyu.h.parse($$5, $$6.getValue()).getOrThrow(JsonParseException::new);
            cyw<?> $$9 = new cyw<>($$7, $$8);
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

   public <C extends bqm, T extends cyu<C>> Optional<cyw<T>> a(cyz<T> $$0, C $$1, dbx $$2) {
      return this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bqm, T extends cyu<C>> Optional<cyw<T>> a(cyz<T> $$0, C $$1, dbx $$2, @Nullable ale $$3) {
      if ($$3 != null) {
         cyw<T> $$4 = this.a($$0, $$3);
         if ($$4 != null && $$4.b().a($$1, $$2)) {
            return Optional.of($$4);
         }
      }

      return this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bqm, T extends cyu<C>> List<cyw<T>> a(cyz<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <C extends bqm, T extends cyu<C>> List<cyw<T>> b(cyz<T> $$0, C $$1, dbx $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).t()))
         .collect(Collectors.toList());
   }

   private <C extends bqm, T extends cyu<C>> Collection<cyw<T>> c(cyz<T> $$0) {
      return this.d.get($$0);
   }

   public <C extends bqm, T extends cyu<C>> jr<cuo> c(cyz<T> $$0, C $$1, dbx $$2) {
      Optional<cyw<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jr<cuo> $$4 = jr.a($$1.b(), cuo.l);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cyw<?>> a(ale $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Nullable
   private <T extends cyu<?>> cyw<T> a(cyz<T> $$0, ale $$1) {
      cyw<?> $$2 = this.e.get($$1);
      return (cyw<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<cyw<?>> b() {
      return this.d.values();
   }

   public Collection<cyw<?>> d() {
      return this.e.values();
   }

   public Stream<ale> e() {
      return this.e.keySet().stream();
   }

   @VisibleForTesting
   protected static cyw<?> a(ale $$0, JsonObject $$1, jk.a $$2) {
      cyu<?> $$3 = (cyu<?>)cyu.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new cyw<>($$0, $$3);
   }

   public void a(Iterable<cyw<?>> $$0) {
      this.f = false;
      Builder<cyz<?>, cyw<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<ale, cyw<?>> $$2 = ImmutableMap.builder();

      for (cyw<?> $$3 : $$0) {
         cyz<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.d = $$1.build();
      this.e = $$2.build();
   }

   public static <C extends bqm, T extends cyu<C>> cyx.a<C, T> b(final cyz<T> $$0) {
      return new cyx.a<C, T>() {
         @Nullable
         private ale b;

         @Override
         public Optional<cyw<T>> a(C $$0x, dbx $$1) {
            cyx $$2 = $$1.r();
            Optional<cyw<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               cyw<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bqm, T extends cyu<C>> {
      Optional<cyw<T>> a(C var1, dbx var2);
   }
}
