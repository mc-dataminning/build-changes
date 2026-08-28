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

public class czd extends aui {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jo.a c;
   private Multimap<czf<?>, czb<?>> d = ImmutableMultimap.of();
   private Map<akr, czb<?>> e = ImmutableMap.of();
   private boolean f;

   public czd(jo.a $$0) {
      super(a, lu.c(lu.bg));
      this.c = $$0;
   }

   protected void a(Map<akr, JsonElement> $$0, aue $$1, bnf $$2) {
      this.f = false;
      Builder<czf<?>, czb<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<akr, czb<?>> $$4 = ImmutableMap.builder();
      akp<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<akr, JsonElement> $$6 : $$0.entrySet()) {
         akr $$7 = $$6.getKey();

         try {
            cyz<?> $$8 = (cyz<?>)cyz.h.parse($$5, $$6.getValue()).getOrThrow(JsonParseException::new);
            czb<?> $$9 = new czb<>($$7, $$8);
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

   public <I extends czc, T extends cyz<I>> Optional<czb<T>> a(czf<T> $$0, I $$1, dcw $$2) {
      return this.a($$0, $$1, $$2, (czb<T>)null);
   }

   public <I extends czc, T extends cyz<I>> Optional<czb<T>> a(czf<T> $$0, I $$1, dcw $$2, @Nullable akr $$3) {
      czb<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends czc, T extends cyz<I>> Optional<czb<T>> a(czf<T> $$0, I $$1, dcw $$2, @Nullable czb<T> $$3) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
      }
   }

   public <I extends czc, T extends cyz<I>> List<czb<T>> a(czf<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <I extends czc, T extends cyz<I>> List<czb<T>> b(czf<T> $$0, I $$1, dcw $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).t()))
         .collect(Collectors.toList());
   }

   private <I extends czc, T extends cyz<I>> Collection<czb<T>> c(czf<T> $$0) {
      return this.d.get($$0);
   }

   public <I extends czc, T extends cyz<I>> jv<cuq> c(czf<T> $$0, I $$1, dcw $$2) {
      Optional<czb<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jv<cuq> $$4 = jv.a($$1.a(), cuq.l);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<czb<?>> a(akr $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Nullable
   private <T extends cyz<?>> czb<T> a(czf<T> $$0, akr $$1) {
      czb<?> $$2 = this.e.get($$1);
      return (czb<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<czb<?>> b() {
      return this.d.values();
   }

   public Collection<czb<?>> d() {
      return this.e.values();
   }

   public Stream<akr> e() {
      return this.e.keySet().stream();
   }

   @VisibleForTesting
   protected static czb<?> a(akr $$0, JsonObject $$1, jo.a $$2) {
      cyz<?> $$3 = (cyz<?>)cyz.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new czb<>($$0, $$3);
   }

   public void a(Iterable<czb<?>> $$0) {
      this.f = false;
      Builder<czf<?>, czb<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<akr, czb<?>> $$2 = ImmutableMap.builder();

      for (czb<?> $$3 : $$0) {
         czf<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.d = $$1.build();
      this.e = $$2.build();
   }

   public static <I extends czc, T extends cyz<I>> czd.a<I, T> b(final czf<T> $$0) {
      return new czd.a<I, T>() {
         @Nullable
         private akr b;

         @Override
         public Optional<czb<T>> a(I $$0x, dcw $$1) {
            czd $$2 = $$1.r();
            Optional<czb<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               czb<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<I extends czc, T extends cyz<I>> {
      Optional<czb<T>> a(I var1, dcw var2);
   }
}
