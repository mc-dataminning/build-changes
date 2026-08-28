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

public class dao extends ava {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private final jq.a c;
   private Multimap<daq<?>, dam<?>> d = ImmutableMultimap.of();
   private Map<ale, dam<?>> e = ImmutableMap.of();
   @Nullable
   private List<dam<?>> f;
   private boolean g;

   public dao(jq.a $$0) {
      super(a, lw.c(lw.bi));
      this.c = $$0;
   }

   protected void a(Map<ale, JsonElement> $$0, auv $$1, bog $$2) {
      this.g = false;
      Builder<daq<?>, dam<?>> $$3 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<ale, dam<?>> $$4 = ImmutableMap.builder();
      alc<JsonElement> $$5 = this.c.a(JsonOps.INSTANCE);

      for (Entry<ale, JsonElement> $$6 : $$0.entrySet()) {
         ale $$7 = $$6.getKey();

         try {
            dak<?> $$8 = (dak<?>)dak.h.parse($$5, $$6.getValue()).getOrThrow(JsonParseException::new);
            dam<?> $$9 = new dam<>($$7, $$8);
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
         dak<?> $$1 = $$0.b();
         if (!$$1.aq_() && $$1.a().c()) {
            b.warn("Recipe {} can't be placed due to empty ingredients and will be ignored", $$0.a());
         }
      });
   }

   public boolean b() {
      return this.g;
   }

   public <I extends dan, T extends dak<I>> Optional<dam<T>> a(daq<T> $$0, I $$1, dej $$2) {
      return this.a($$0, $$1, $$2, (dam<T>)null);
   }

   public <I extends dan, T extends dak<I>> Optional<dam<T>> a(daq<T> $$0, I $$1, dej $$2, @Nullable ale $$3) {
      dam<T> $$4 = $$3 != null ? this.a($$0, $$3) : null;
      return this.a($$0, $$1, $$2, $$4);
   }

   public <I extends dan, T extends dak<I>> Optional<dam<T>> a(daq<T> $$0, I $$1, dej $$2, @Nullable dam<T> $$3) {
      if ($$1.b()) {
         return Optional.empty();
      } else {
         return $$3 != null && $$3.b().a($$1, $$2) ? Optional.of($$3) : this.c($$0).stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
      }
   }

   public <I extends dan, T extends dak<I>> List<dam<T>> a(daq<T> $$0) {
      return List.copyOf(this.c($$0));
   }

   public <I extends dan, T extends dak<I>> List<dam<T>> b(daq<T> $$0, I $$1, dej $$2) {
      return this.c($$0)
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.G_()).v()))
         .collect(Collectors.toList());
   }

   private <I extends dan, T extends dak<I>> Collection<dam<T>> c(daq<T> $$0) {
      return this.d.get($$0);
   }

   public <I extends dan, T extends dak<I>> jx<cvs> c(daq<T> $$0, I $$1, dej $$2) {
      Optional<dam<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         jx<cvs> $$4 = jx.a($$1.a(), cvs.k);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<dam<?>> a(ale $$0) {
      return Optional.ofNullable(this.e.get($$0));
   }

   @Nullable
   private <T extends dak<?>> dam<T> a(daq<T> $$0, ale $$1) {
      dam<?> $$2 = this.e.get($$1);
      return (dam<T>)($$2 != null && $$2.b().e().equals($$0) ? $$2 : null);
   }

   public Collection<dam<?>> d() {
      return this.d.values();
   }

   public Collection<dam<?>> e() {
      if (this.f == null) {
         this.f = this.d().stream().filter($$0 -> !$$0.b().a().c()).toList();
      }

      return this.f;
   }

   public Collection<dam<?>> f() {
      return this.e.values();
   }

   public Stream<ale> g() {
      return this.e.keySet().stream();
   }

   @VisibleForTesting
   protected static dam<?> a(ale $$0, JsonObject $$1, jq.a $$2) {
      dak<?> $$3 = (dak<?>)dak.h.parse($$2.a(JsonOps.INSTANCE), $$1).getOrThrow(JsonParseException::new);
      return new dam<>($$0, $$3);
   }

   public void a(Iterable<dam<?>> $$0) {
      this.g = false;
      Builder<daq<?>, dam<?>> $$1 = ImmutableMultimap.builder();
      com.google.common.collect.ImmutableMap.Builder<ale, dam<?>> $$2 = ImmutableMap.builder();

      for (dam<?> $$3 : $$0) {
         daq<?> $$4 = $$3.b().e();
         $$1.put($$4, $$3);
         $$2.put($$3.a(), $$3);
      }

      this.d = $$1.build();
      this.e = $$2.build();
      this.f = null;
   }

   public static <I extends dan, T extends dak<I>> dao.a<I, T> b(final daq<T> $$0) {
      return new dao.a<I, T>() {
         @Nullable
         private ale b;

         @Override
         public Optional<dam<T>> a(I $$0x, dej $$1) {
            dao $$2 = $$1.r();
            Optional<dam<T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               dam<T> $$4 = $$3.get();
               this.b = $$4.a();
               return Optional.of($$4);
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<I extends dan, T extends dak<I>> {
      Optional<dam<T>> a(I var1, dej var2);
   }
}
