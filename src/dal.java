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

public class dal extends auy {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jp.a c;
   private Multimap<dan<?>, daj<?>> d = ImmutableMultimap.of();
   private Map<alc, daj<?>> e = ImmutableMap.of();
   @Nullable
   private List<daj<?>> f;
   private boolean g;

   public dal(jp.a $$0) {
      super(a, lv.c(lv.bh));
      this.c = $$0;
   }

   protected void a(Map<alc, JsonElement> $$0, aut $$1, bod $$2) {
      this.g = false;
      Builder<dan<?>, daj<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alc, daj<?>> $$4 = ImmutableMap.builder();
      ala<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<alc, JsonElement> $$6 : $$0.entrySet()) {
         alc $$7 = $$6.getKey();

         try {
            dah<?> $$8 = (dah<?>)dah.h.parse($$5, $$6.getValue()).getOrThrow(JsonParseException::new);
            daj<?> $$9 = new daj<>($$7, $$8);
            $$3.put($$8.e(), $$9);
            $$4.put($$7, $$9);
         } catch (IllegalArgumentException | JsonParseException var12) {
            b.error("Parsing error loading recipe {}", $$7, var12);
         }
      }

      this.d = $$3.build();
      this.e = $$4.build();
      this.f = null;
      b.info("Loaded {} recipes", this.d.size());
   }

   public void a() {
      this.e.values().forEach($$0 -> {
         dah<?> $$1 = $$0.b();
         if (!$$1.ap_() && $$1.a().c()) {
            b.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$0.a());
         }
      });
   }

   public boolean b() {
      return this.g;
   }

   public <I extends dak, T extends dah<I>> Optional<daj<T>> a(dan<T> $$0, I $$1, deg $$2) {
      return this.a($$0, $$1, $$2, (daj<T>)null);
   }

   public <I extends dak, T extends dah<I>> Optional<daj<T>> a(dan<T> $$0, I $$1, deg $$2, @Nullable alc $$3) {
      daj<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dak, T extends dah<I>> Optional<daj<T>> a(dan<T> $$0, I $$1, deg $$2, @Nullable daj<T> $$3) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
      }
   }

   public <I extends dak, T extends dah<I>> List<daj<T>> a(dan<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <I extends dak, T extends dah<I>> List<daj<T>> b(dan<T> $$0, I $$1, deg $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.F_()).v()))
         .collect(Collectors.toList());
   }

   private <I extends dak, T extends dah<I>> Collection<daj<T>> c(dan<T> $$0) {
      return this.d.get($$0);
   }

   public <I extends dak, T extends dah<I>> jw<cvp> c(dan<T> $$0, I $$1, deg $$2) {
      Optional<daj<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jw<cvp> $$4 = jw.a($$1.a(), cvp.k);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<daj<?>> a(alc $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Nullable
   private <T extends dah<?>> daj<T> a(dan<T> $$0, alc $$1) {
      daj<?> $$2 = this.e.get($$1);
      return (daj<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<daj<?>> d() {
      return this.d.values();
   }

   public Collection<daj<?>> e() {
      if (this.f == null) {
         this.f = this.d().stream().filter($$0 -> !$$0.b().a().c()).toList();
      }

      return this.f;
   }

   public Collection<daj<?>> f() {
      return this.e.values();
   }

   public Stream<alc> g() {
      return this.e.keySet().stream();
   }

   @VisibleForTesting
   protected static daj<?> a(alc $$0, JsonObject $$1, jp.a $$2) {
      dah<?> $$3 = (dah<?>)dah.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new daj<>($$0, $$3);
   }

   public void a(Iterable<daj<?>> $$0) {
      this.g = false;
      Builder<dan<?>, daj<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alc, daj<?>> $$2 = ImmutableMap.builder();

      for (daj<?> $$3 : $$0) {
         dan<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.d = $$1.build();
      this.e = $$2.build();
      this.f = null;
   }

   public static <I extends dak, T extends dah<I>> dal.a<I, T> b(final dan<T> $$0) {
      return new dal.a<I, T>() {
         @Nullable
         private alc b;

         @Override
         public Optional<daj<T>> a(I $$0x, deg $$1) {
            dal $$2 = $$1.r();
            Optional<daj<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               daj<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<I extends dak, T extends dah<I>> {
      Optional<daj<T>> a(I var1, deg var2);
   }
}
