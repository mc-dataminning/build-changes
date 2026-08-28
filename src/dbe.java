import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
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

public class dbe extends avh<dba<?>> {
   private static final Logger a = LogUtils.getLogger();
   private Multimap<dbg<?>, dbc<?>> b = ImmutableMultimap.of();
   private Map<alj, dbc<?>> c = ImmutableMap.of();
   @Nullable
   private List<dbc<?>> d;
   private boolean e;

   public dbe(js.a $$0) {
      super($$0, dba.h, ma.c(ma.bh));
   }

   protected void a(Map<alj, dba<?>> $$0, avd $$1, bou $$2) {
      this.e = false;
      Builder<dbg<?>, dbc<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alj, dbc<?>> $$4 = ImmutableMap.builder();

      for (Entry<alj, dba<?>> $$5 : $$0.entrySet()) {
         alj $$6 = $$5.getKey();
         dba<?> $$7 = $$5.getValue();

         try {
            dbc<?> $$8 = new dbc<>($$6, $$7);
            $$3.put($$7.e(), $$8);
            $$4.put($$6, $$8);
         } catch (IllegalArgumentException | JsonParseException var11) {
            a.error("Parsing error loading recipe {}", $$6, var11);
         }
      }

      this.b = $$3.build();
      this.c = $$4.build();
      this.d = null;
      a.info("Loaded {} recipes", this.b.size());
   }

   public void a() {
      this.c.values().forEach($$0 -> {
         dba<?> $$1 = $$0.b();
         if (!$$1.ao_() && $$1.a().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$0.a());
         }
      });
   }

   public boolean b() {
      return this.e;
   }

   public <I extends dbd, T extends dba<I>> Optional<dbc<T>> a(dbg<T> $$0, I $$1, dfm $$2) {
      return this.a($$0, $$1, $$2, (dbc<T>)null);
   }

   public <I extends dbd, T extends dba<I>> Optional<dbc<T>> a(dbg<T> $$0, I $$1, dfm $$2, @Nullable alj $$3) {
      dbc<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dbd, T extends dba<I>> Optional<dbc<T>> a(dbg<T> $$0, I $$1, dfm $$2, @Nullable dbc<T> $$3) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
      }
   }

   public <I extends dbd, T extends dba<I>> List<dbc<T>> a(dbg<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <I extends dbd, T extends dba<I>> List<dbc<T>> b(dbg<T> $$0, I $$1, dfm $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.J_()).h().m()))
         .collect(Collectors.toList());
   }

   private <I extends dbd, T extends dba<I>> Collection<dbc<T>> c(dbg<T> $$0) {
      return this.b.get($$0);
   }

   public <I extends dbd, T extends dba<I>> jz<cwm> c(dbg<T> $$0, I $$1, dfm $$2) {
      Optional<dbc<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jz<cwm> $$4 = jz.a($$1.a(), cwm.k);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<dbc<?>> a(alj $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   @Nullable
   private <T extends dba<?>> dbc<T> a(dbg<T> $$0, alj $$1) {
      dbc<?> $$2 = this.c.get($$1);
      return (dbc<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<dbc<?>> d() {
      return this.b.values();
   }

   public Collection<dbc<?>> e() {
      if (this.d == null) {
         this.d = this.d().stream().filter($$0 -> !$$0.b().a().c()).toList();
      }

      return this.d;
   }

   public Collection<dbc<?>> f() {
      return this.c.values();
   }

   public Stream<alj> g() {
      return this.c.keySet().stream();
   }

   @VisibleForTesting
   protected static dbc<?> a(alj $$0, JsonObject $$1, js.a $$2) {
      dba<?> $$3 = (dba<?>)dba.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dbc<>($$0, $$3);
   }

   public void a(Iterable<dbc<?>> $$0) {
      this.e = false;
      Builder<dbg<?>, dbc<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alj, dbc<?>> $$2 = ImmutableMap.builder();

      for (dbc<?> $$3 : $$0) {
         dbg<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.b = $$1.build();
      this.c = $$2.build();
      this.d = null;
   }

   public static <I extends dbd, T extends dba<I>> dbe.a<I, T> b(final dbg<T> $$0) {
      return new dbe.a<I, T>() {
         @Nullable
         private alj b;

         @Override
         public Optional<dbc<T>> a(I $$0x, dfm $$1) {
            dbe $$2 = $$1.s();
            Optional<dbc<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dbc<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<I extends dbd, T extends dba<I>> {
      Optional<dbc<T>> a(I var1, dfm var2);
   }
}
