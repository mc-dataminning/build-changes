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

public class dax extends avi<dat<?>> {
   private static final Logger a = LogUtils.getLogger();
   private Multimap<daz<?>, dav<?>> b = ImmutableMultimap.of();
   private Map<all, dav<?>> c = ImmutableMap.of();
   @Nullable
   private List<dav<?>> d;
   private boolean e;

   public dax(js.a $$0) {
      super($$0, dat.h, ma.c(ma.bh));
   }

   protected void a(Map<all, dat<?>> $$0, ave $$1, bor $$2) {
      this.e = false;
      Builder<daz<?>, dav<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<all, dav<?>> $$4 = ImmutableMap.builder();

      for (Entry<all, dat<?>> $$5 : $$0.entrySet()) {
         all $$6 = $$5.getKey();
         dat<?> $$7 = $$5.getValue();

         try {
            dav<?> $$8 = new dav<>($$6, $$7);
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
         dat<?> $$1 = $$0.b();
         if (!$$1.ap_() && $$1.a().c()) {
            a.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$0.a());
         }
      });
   }

   public boolean b() {
      return this.e;
   }

   public <I extends daw, T extends dat<I>> Optional<dav<T>> a(daz<T> $$0, I $$1, dff $$2) {
      return this.a($$0, $$1, $$2, (dav<T>)null);
   }

   public <I extends daw, T extends dat<I>> Optional<dav<T>> a(daz<T> $$0, I $$1, dff $$2, @Nullable all $$3) {
      dav<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends daw, T extends dat<I>> Optional<dav<T>> a(daz<T> $$0, I $$1, dff $$2, @Nullable dav<T> $$3) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
      }
   }

   public <I extends daw, T extends dat<I>> List<dav<T>> a(daz<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <I extends daw, T extends dat<I>> List<dav<T>> b(daz<T> $$0, I $$1, dff $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).h().m()))
         .collect(Collectors.toList());
   }

   private <I extends daw, T extends dat<I>> Collection<dav<T>> c(daz<T> $$0) {
      return this.b.get($$0);
   }

   public <I extends daw, T extends dat<I>> jz<cwf> c(daz<T> $$0, I $$1, dff $$2) {
      Optional<dav<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jz<cwf> $$4 = jz.a($$1.a(), cwf.k);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<dav<?>> a(all $$0) {
      return Optional.ofNullable(this.c.get($$0));
   }

   @Nullable
   private <T extends dat<?>> dav<T> a(daz<T> $$0, all $$1) {
      dav<?> $$2 = this.c.get($$1);
      return (dav<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<dav<?>> d() {
      return this.b.values();
   }

   public Collection<dav<?>> e() {
      if (this.d == null) {
         this.d = this.d().stream().filter($$0 -> !$$0.b().a().c()).toList();
      }

      return this.d;
   }

   public Collection<dav<?>> f() {
      return this.c.values();
   }

   public Stream<all> g() {
      return this.c.keySet().stream();
   }

   @VisibleForTesting
   protected static dav<?> a(all $$0, JsonObject $$1, js.a $$2) {
      dat<?> $$3 = (dat<?>)dat.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dav<>($$0, $$3);
   }

   public void a(Iterable<dav<?>> $$0) {
      this.e = false;
      Builder<daz<?>, dav<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<all, dav<?>> $$2 = ImmutableMap.builder();

      for (dav<?> $$3 : $$0) {
         daz<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.b = $$1.build();
      this.c = $$2.build();
      this.d = null;
   }

   public static <I extends daw, T extends dat<I>> dax.a<I, T> b(final daz<T> $$0) {
      return new dax.a<I, T>() {
         @Nullable
         private all b;

         @Override
         public Optional<dav<T>> a(I $$0x, dff $$1) {
            dax $$2 = $$1.r();
            Optional<dav<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dav<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<I extends daw, T extends dat<I>> {
      Optional<dav<T>> a(I var1, dff var2);
   }
}
