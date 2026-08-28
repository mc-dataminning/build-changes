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

public class cyk extends aty {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jl.a c;
   private Multimap<cym<?>, cyi<?>> d = ImmutableMultimap.of();
   private Map<akk, cyi<?>> e = ImmutableMap.of();
   private boolean f;

   public cyk(jl.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<akk, JsonElement> $$0, atu $$1, bmr $$2) {
      this.f = false;
      Builder<cym<?>, cyi<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<akk, cyi<?>> $$4 = ImmutableMap.builder();
      aki<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<akk, JsonElement> $$6 : $$0.entrySet()) {
         akk $$7 = $$6.getKey();

         try {
            cyg<?> $$8 = (cyg<?>)cyg.h.parse($$5, $$6.getValue()).getOrThrow(JsonParseException::new);
            cyi<?> $$9 = new cyi<>($$7, $$8);
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

   public <I extends cyj, T extends cyg<I>> Optional<cyi<T>> a(cym<T> $$0, I $$1, dcd $$2) {
      return this.a($$0, $$1, $$2, (cyi<T>)null);
   }

   public <I extends cyj, T extends cyg<I>> Optional<cyi<T>> a(cym<T> $$0, I $$1, dcd $$2, @Nullable akk $$3) {
      cyi<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends cyj, T extends cyg<I>> Optional<cyi<T>> a(cym<T> $$0, I $$1, dcd $$2, @Nullable cyi<T> $$3) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
      }
   }

   public <I extends cyj, T extends cyg<I>> List<cyi<T>> a(cym<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <I extends cyj, T extends cyg<I>> List<cyi<T>> b(cym<T> $$0, I $$1, dcd $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).t()))
         .collect(Collectors.toList());
   }

   private <I extends cyj, T extends cyg<I>> Collection<cyi<T>> c(cym<T> $$0) {
      return this.d.get($$0);
   }

   public <I extends cyj, T extends cyg<I>> js<cua> c(cym<T> $$0, I $$1, dcd $$2) {
      Optional<cyi<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         js<cua> $$4 = js.a($$1.a(), cua.l);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cyi<?>> a(akk $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Nullable
   private <T extends cyg<?>> cyi<T> a(cym<T> $$0, akk $$1) {
      cyi<?> $$2 = this.e.get($$1);
      return (cyi<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<cyi<?>> b() {
      return this.d.values();
   }

   public Collection<cyi<?>> d() {
      return this.e.values();
   }

   public Stream<akk> e() {
      return this.e.keySet().stream();
   }

   @VisibleForTesting
   protected static cyi<?> a(akk $$0, JsonObject $$1, jl.a $$2) {
      cyg<?> $$3 = (cyg<?>)cyg.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new cyi<>($$0, $$3);
   }

   public void a(Iterable<cyi<?>> $$0) {
      this.f = false;
      Builder<cym<?>, cyi<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<akk, cyi<?>> $$2 = ImmutableMap.builder();

      for (cyi<?> $$3 : $$0) {
         cym<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.d = $$1.build();
      this.e = $$2.build();
   }

   public static <I extends cyj, T extends cyg<I>> cyk.a<I, T> b(final cym<T> $$0) {
      return new cyk.a<I, T>() {
         @Nullable
         private akk b;

         @Override
         public Optional<cyi<T>> a(I $$0x, dcd $$1) {
            cyk $$2 = $$1.r();
            Optional<cyi<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               cyi<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<I extends cyj, T extends cyg<I>> {
      Optional<cyi<T>> a(I var1, dcd var2);
   }
}
