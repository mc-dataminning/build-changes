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

public class cym extends aua {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jl.a c;
   private Multimap<cyo<?>, cyk<?>> d = ImmutableMultimap.of();
   private Map<akk, cyk<?>> e = ImmutableMap.of();
   private boolean f;

   public cym(jl.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<akk, JsonElement> $$0, atw $$1, bmu $$2) {
      this.f = false;
      Builder<cyo<?>, cyk<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<akk, cyk<?>> $$4 = ImmutableMap.builder();
      aki<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<akk, JsonElement> $$6 : $$0.entrySet()) {
         akk $$7 = $$6.getKey();

         try {
            cyi<?> $$8 = (cyi<?>)cyi.h.parse($$5, $$6.getValue()).getOrThrow(JsonParseException::new);
            cyk<?> $$9 = new cyk<>($$7, $$8);
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

   public <I extends cyl, T extends cyi<I>> Optional<cyk<T>> a(cyo<T> $$0, I $$1, dcf $$2) {
      return this.a($$0, $$1, $$2, (cyk<T>)null);
   }

   public <I extends cyl, T extends cyi<I>> Optional<cyk<T>> a(cyo<T> $$0, I $$1, dcf $$2, @Nullable akk $$3) {
      cyk<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends cyl, T extends cyi<I>> Optional<cyk<T>> a(cyo<T> $$0, I $$1, dcf $$2, @Nullable cyk<T> $$3) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
      }
   }

   public <I extends cyl, T extends cyi<I>> List<cyk<T>> a(cyo<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <I extends cyl, T extends cyi<I>> List<cyk<T>> b(cyo<T> $$0, I $$1, dcf $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).t()))
         .collect(Collectors.toList());
   }

   private <I extends cyl, T extends cyi<I>> Collection<cyk<T>> c(cyo<T> $$0) {
      return this.d.get($$0);
   }

   public <I extends cyl, T extends cyi<I>> js<cuc> c(cyo<T> $$0, I $$1, dcf $$2) {
      Optional<cyk<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         js<cuc> $$4 = js.a($$1.a(), cuc.l);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cyk<?>> a(akk $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Nullable
   private <T extends cyi<?>> cyk<T> a(cyo<T> $$0, akk $$1) {
      cyk<?> $$2 = this.e.get($$1);
      return (cyk<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<cyk<?>> b() {
      return this.d.values();
   }

   public Collection<cyk<?>> d() {
      return this.e.values();
   }

   public Stream<akk> e() {
      return this.e.keySet().stream();
   }

   @VisibleForTesting
   protected static cyk<?> a(akk $$0, JsonObject $$1, jl.a $$2) {
      cyi<?> $$3 = (cyi<?>)cyi.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new cyk<>($$0, $$3);
   }

   public void a(Iterable<cyk<?>> $$0) {
      this.f = false;
      Builder<cyo<?>, cyk<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<akk, cyk<?>> $$2 = ImmutableMap.builder();

      for (cyk<?> $$3 : $$0) {
         cyo<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.d = $$1.build();
      this.e = $$2.build();
   }

   public static <I extends cyl, T extends cyi<I>> cym.a<I, T> b(final cyo<T> $$0) {
      return new cym.a<I, T>() {
         @Nullable
         private akk b;

         @Override
         public Optional<cyk<T>> a(I $$0x, dcf $$1) {
            cym $$2 = $$1.r();
            Optional<cyk<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               cyk<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<I extends cyl, T extends cyi<I>> {
      Optional<cyk<T>> a(I var1, dcf var2);
   }
}
