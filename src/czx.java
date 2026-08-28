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

public class czx extends auw {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jp.a c;
   private Multimap<czz<?>, czv<?>> d = ImmutableMultimap.of();
   private Map<alb, czv<?>> e = ImmutableMap.of();
   @Nullable
   private List<czv<?>> f;
   private boolean g;

   public czx(jp.a $$0) {
      super(a, lv.c(lv.bg));
      this.c = $$0;
   }

   protected void a(Map<alb, JsonElement> $$0, aus $$1, bny $$2) {
      this.g = false;
      Builder<czz<?>, czv<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alb, czv<?>> $$4 = ImmutableMap.builder();
      akz<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<alb, JsonElement> $$6 : $$0.entrySet()) {
         alb $$7 = $$6.getKey();

         try {
            czt<?> $$8 = (czt<?>)czt.h.parse($$5, $$6.getValue()).getOrThrow(JsonParseException::new);
            czv<?> $$9 = new czv<>($$7, $$8);
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
         czt<?> $$1 = $$0.b();
         if (!$$1.ar_() && $$1.a().c()) {
            b.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$0.a());
         }
      });
   }

   public boolean b() {
      return this.g;
   }

   public <I extends czw, T extends czt<I>> Optional<czv<T>> a(czz<T> $$0, I $$1, dds $$2) {
      return this.a($$0, $$1, $$2, (czv<T>)null);
   }

   public <I extends czw, T extends czt<I>> Optional<czv<T>> a(czz<T> $$0, I $$1, dds $$2, @Nullable alb $$3) {
      czv<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends czw, T extends czt<I>> Optional<czv<T>> a(czz<T> $$0, I $$1, dds $$2, @Nullable czv<T> $$3) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
      }
   }

   public <I extends czw, T extends czt<I>> List<czv<T>> a(czz<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <I extends czw, T extends czt<I>> List<czv<T>> b(czz<T> $$0, I $$1, dds $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.F_()).v()))
         .collect(Collectors.toList());
   }

   private <I extends czw, T extends czt<I>> Collection<czv<T>> c(czz<T> $$0) {
      return this.d.get($$0);
   }

   public <I extends czw, T extends czt<I>> jw<cvl> c(czz<T> $$0, I $$1, dds $$2) {
      Optional<czv<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jw<cvl> $$4 = jw.a($$1.a(), cvl.k);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<czv<?>> a(alb $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Nullable
   private <T extends czt<?>> czv<T> a(czz<T> $$0, alb $$1) {
      czv<?> $$2 = this.e.get($$1);
      return (czv<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<czv<?>> d() {
      return this.d.values();
   }

   public Collection<czv<?>> e() {
      if (this.f == null) {
         this.f = this.d().stream().filter($$0 -> !$$0.b().a().c()).toList();
      }

      return this.f;
   }

   public Collection<czv<?>> f() {
      return this.e.values();
   }

   public Stream<alb> g() {
      return this.e.keySet().stream();
   }

   @VisibleForTesting
   protected static czv<?> a(alb $$0, JsonObject $$1, jp.a $$2) {
      czt<?> $$3 = (czt<?>)czt.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new czv<>($$0, $$3);
   }

   public void a(Iterable<czv<?>> $$0) {
      this.g = false;
      Builder<czz<?>, czv<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<alb, czv<?>> $$2 = ImmutableMap.builder();

      for (czv<?> $$3 : $$0) {
         czz<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.d = $$1.build();
      this.e = $$2.build();
      this.f = null;
   }

   public static <I extends czw, T extends czt<I>> czx.a<I, T> b(final czz<T> $$0) {
      return new czx.a<I, T>() {
         @Nullable
         private alb b;

         @Override
         public Optional<czv<T>> a(I $$0x, dds $$1) {
            czx $$2 = $$1.r();
            Optional<czv<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               czv<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<I extends czw, T extends czt<I>> {
      Optional<czv<T>> a(I var1, dds var2);
   }
}
