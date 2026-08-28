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

public class dat extends avf<dap<?>> {
   private static final Logger a = LogUtils.getLogger();
   private Multimap<dav<?>, dar<?>> b = ImmutableMultimap.of();
   private Map<ali, dar<?>> c = ImmutableMap.of();
   @Nullable
   private List<dar<?>> d;
   private boolean e;

   public dat(js.a $$0) {
      super($$0, dap.h, lz.c(lz.bh));
   }

   protected void a(Map<ali, dap<?>> $$0, avb $$1, bon $$2) {
      this.e = false;
      Builder<dav<?>, dar<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<ali, dar<?>> $$4 = ImmutableMap.builder();

      for (Entry<ali, dap<?>> $$5 : $$0.entrySet()) {
         ali $$6 = $$5.getKey();
         dap<?> $$7 = $$5.getValue();

         try {
            dar<?> $$8 = new dar<>($$6, $$7);
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
         dap<?> $$1 = $$0.b();
         if (!$$1.ap_() && $$1.a().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$0.a());
         }
      });
   }

   public boolean b() {
      return this.e;
   }

   public <I extends das, T extends dap<I>> Optional<dar<T>> a(dav<T> $$0, I $$1, dfb $$2) {
      return this.a($$0, $$1, $$2, (dar<T>)null);
   }

   public <I extends das, T extends dap<I>> Optional<dar<T>> a(dav<T> $$0, I $$1, dfb $$2, @Nullable ali $$3) {
      dar<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends das, T extends dap<I>> Optional<dar<T>> a(dav<T> $$0, I $$1, dfb $$2, @Nullable dar<T> $$3) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
      }
   }

   public <I extends das, T extends dap<I>> List<dar<T>> a(dav<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <I extends das, T extends dap<I>> List<dar<T>> b(dav<T> $$0, I $$1, dfb $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).h().m()))
         .collect(Collectors.toList());
   }

   private <I extends das, T extends dap<I>> Collection<dar<T>> c(dav<T> $$0) {
      return this.b.get($$0);
   }

   public <I extends das, T extends dap<I>> jz<cwb> c(dav<T> $$0, I $$1, dfb $$2) {
      Optional<dar<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jz<cwb> $$4 = jz.a($$1.a(), cwb.k);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<dar<?>> a(ali $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   @Nullable
   private <T extends dap<?>> dar<T> a(dav<T> $$0, ali $$1) {
      dar<?> $$2 = this.c.get($$1);
      return (dar<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<dar<?>> d() {
      return this.b.values();
   }

   public Collection<dar<?>> e() {
      if (this.d == null) {
         this.d = this.d().stream().filter($$0 -> !$$0.b().a().c()).toList();
      }

      return this.d;
   }

   public Collection<dar<?>> f() {
      return this.c.values();
   }

   public Stream<ali> g() {
      return this.c.keySet().stream();
   }

   @VisibleForTesting
   protected static dar<?> a(ali $$0, JsonObject $$1, js.a $$2) {
      dap<?> $$3 = (dap<?>)dap.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dar<>($$0, $$3);
   }

   public void a(Iterable<dar<?>> $$0) {
      this.e = false;
      Builder<dav<?>, dar<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<ali, dar<?>> $$2 = ImmutableMap.builder();

      for (dar<?> $$3 : $$0) {
         dav<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.b = $$1.build();
      this.c = $$2.build();
      this.d = null;
   }

   public static <I extends das, T extends dap<I>> dat.a<I, T> b(final dav<T> $$0) {
      return new dat.a<I, T>() {
         @Nullable
         private ali b;

         @Override
         public Optional<dar<T>> a(I $$0x, dfb $$1) {
            dat $$2 = $$1.r();
            Optional<dar<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dar<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<I extends das, T extends dap<I>> {
      Optional<dar<T>> a(I var1, dfb var2);
   }
}
