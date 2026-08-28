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

public class cyn extends aua {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jl.a c;
   private Multimap<cyp<?>, cyl<?>> d = ImmutableMultimap.of();
   private Map<akk, cyl<?>> e = ImmutableMap.of();
   private boolean f;

   public cyn(jl.a $$0) {
      super(a, "recipes");
      this.c = $$0;
   }

   protected void a(Map<akk, JsonElement> $$0, atw $$1, bmv $$2) {
      this.f = false;
      Builder<cyp<?>, cyl<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<akk, cyl<?>> $$4 = ImmutableMap.builder();
      aki<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<akk, JsonElement> $$6 : $$0.entrySet()) {
         akk $$7 = $$6.getKey();

         try {
            cyj<?> $$8 = (cyj<?>)cyj.h.parse($$5, $$6.getValue()).getOrThrow(JsonParseException::new);
            cyl<?> $$9 = new cyl<>($$7, $$8);
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

   public <I extends cym, T extends cyj<I>> Optional<cyl<T>> a(cyp<T> $$0, I $$1, dcg $$2) {
      return this.a($$0, $$1, $$2, (cyl<T>)null);
   }

   public <I extends cym, T extends cyj<I>> Optional<cyl<T>> a(cyp<T> $$0, I $$1, dcg $$2, @Nullable akk $$3) {
      cyl<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends cym, T extends cyj<I>> Optional<cyl<T>> a(cyp<T> $$0, I $$1, dcg $$2, @Nullable cyl<T> $$3) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
      }
   }

   public <I extends cym, T extends cyj<I>> List<cyl<T>> a(cyp<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <I extends cym, T extends cyj<I>> List<cyl<T>> b(cyp<T> $$0, I $$1, dcg $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).t()))
         .collect(Collectors.toList());
   }

   private <I extends cym, T extends cyj<I>> Collection<cyl<T>> c(cyp<T> $$0) {
      return this.d.get($$0);
   }

   public <I extends cym, T extends cyj<I>> js<cud> c(cyp<T> $$0, I $$1, dcg $$2) {
      Optional<cyl<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         js<cud> $$4 = js.a($$1.a(), cud.l);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cyl<?>> a(akk $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Nullable
   private <T extends cyj<?>> cyl<T> a(cyp<T> $$0, akk $$1) {
      cyl<?> $$2 = this.e.get($$1);
      return (cyl<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<cyl<?>> b() {
      return this.d.values();
   }

   public Collection<cyl<?>> d() {
      return this.e.values();
   }

   public Stream<akk> e() {
      return this.e.keySet().stream();
   }

   @VisibleForTesting
   protected static cyl<?> a(akk $$0, JsonObject $$1, jl.a $$2) {
      cyj<?> $$3 = (cyj<?>)cyj.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new cyl<>($$0, $$3);
   }

   public void a(Iterable<cyl<?>> $$0) {
      this.f = false;
      Builder<cyp<?>, cyl<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<akk, cyl<?>> $$2 = ImmutableMap.builder();

      for (cyl<?> $$3 : $$0) {
         cyp<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.d = $$1.build();
      this.e = $$2.build();
   }

   public static <I extends cym, T extends cyj<I>> cyn.a<I, T> b(final cyp<T> $$0) {
      return new cyn.a<I, T>() {
         @Nullable
         private akk b;

         @Override
         public Optional<cyl<T>> a(I $$0x, dcg $$1) {
            cyn $$2 = $$1.r();
            Optional<cyl<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               cyl<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<I extends cym, T extends cyj<I>> {
      Optional<cyl<T>> a(I var1, dcg var2);
   }
}
