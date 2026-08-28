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

public class dan extends ave<daj<?>> {
   private static final Logger a = LogUtils.getLogger();
   private Multimap<dap<?>, dal<?>> b = ImmutableMultimap.of();
   private Map<alh, dal<?>> c = ImmutableMap.of();
   @Nullable
   private List<dal<?>> d;
   private boolean e;

   public dan(jr.a $$0) {
      super($$0, daj.h, ly.c(ly.bh));
   }

   protected void a(Map<alh, daj<?>> $$0, ava $$1, bok $$2) {
      this.e = false;
      Builder<dap<?>, dal<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alh, dal<?>> $$4 = ImmutableMap.builder();

      for (Entry<alh, daj<?>> $$5 : $$0.entrySet()) {
         alh $$6 = $$5.getKey();
         daj<?> $$7 = $$5.getValue();

         try {
            dal<?> $$8 = new dal<>($$6, $$7);
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
         daj<?> $$1 = $$0.b();
         if (!$$1.aq_() && $$1.a().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$0.a());
         }
      });
   }

   public boolean b() {
      return this.e;
   }

   public <I extends dam, T extends daj<I>> Optional<dal<T>> a(dap<T> $$0, I $$1, dev $$2) {
      return this.a($$0, $$1, $$2, (dal<T>)null);
   }

   public <I extends dam, T extends daj<I>> Optional<dal<T>> a(dap<T> $$0, I $$1, dev $$2, @Nullable alh $$3) {
      dal<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dam, T extends daj<I>> Optional<dal<T>> a(dap<T> $$0, I $$1, dev $$2, @Nullable dal<T> $$3) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
      }
   }

   public <I extends dam, T extends daj<I>> List<dal<T>> a(dap<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <I extends dam, T extends daj<I>> List<dal<T>> b(dap<T> $$0, I $$1, dev $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).h().m()))
         .collect(Collectors.toList());
   }

   private <I extends dam, T extends daj<I>> Collection<dal<T>> c(dap<T> $$0) {
      return this.b.get($$0);
   }

   public <I extends dam, T extends daj<I>> jy<cvx> c(dap<T> $$0, I $$1, dev $$2) {
      Optional<dal<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jy<cvx> $$4 = jy.a($$1.a(), cvx.k);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<dal<?>> a(alh $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   @Nullable
   private <T extends daj<?>> dal<T> a(dap<T> $$0, alh $$1) {
      dal<?> $$2 = this.c.get($$1);
      return (dal<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<dal<?>> d() {
      return this.b.values();
   }

   public Collection<dal<?>> e() {
      if (this.d == null) {
         this.d = this.d().stream().filter($$0 -> !$$0.b().a().c()).toList();
      }

      return this.d;
   }

   public Collection<dal<?>> f() {
      return this.c.values();
   }

   public Stream<alh> g() {
      return this.c.keySet().stream();
   }

   @VisibleForTesting
   protected static dal<?> a(alh $$0, JsonObject $$1, jr.a $$2) {
      daj<?> $$3 = (daj<?>)daj.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dal<>($$0, $$3);
   }

   public void a(Iterable<dal<?>> $$0) {
      this.e = false;
      Builder<dap<?>, dal<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alh, dal<?>> $$2 = ImmutableMap.builder();

      for (dal<?> $$3 : $$0) {
         dap<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.b = $$1.build();
      this.c = $$2.build();
      this.d = null;
   }

   public static <I extends dam, T extends daj<I>> dan.a<I, T> b(final dap<T> $$0) {
      return new dan.a<I, T>() {
         @Nullable
         private alh b;

         @Override
         public Optional<dal<T>> a(I $$0x, dev $$1) {
            dan $$2 = $$1.r();
            Optional<dal<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dal<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<I extends dam, T extends daj<I>> {
      Optional<dal<T>> a(I var1, dev var2);
   }
}
