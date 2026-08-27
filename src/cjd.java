import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjd extends alb {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cjf<?>, Map<acq, cjc<?>>> c = ImmutableMap.of();
   private Map<acq, cjc<?>> d = ImmutableMap.of();
   private boolean e;

   public cjd() {
      super(a, "recipes");
   }

   protected void a(Map<acq, JsonElement> $$0, akx $$1, ban $$2) {
      this.e = false;
      Map<cjf<?>, Builder<acq, cjc<?>>> $$3 = Maps.newHashMap();
      Builder<acq, cjc<?>> $$4 = ImmutableMap.builder();

      for (Entry<acq, JsonElement> $$5 : $$0.entrySet()) {
         acq $$6 = $$5.getKey();

         try {
            cjc<?> $$7 = a($$6, aor.m($$5.getValue(), "top element"));
            $$3.computeIfAbsent($$7.f(), $$0x -> ImmutableMap.builder()).put($$6, $$7);
            $$4.put($$6, $$7);
         } catch (IllegalArgumentException | JsonParseException var10) {
            b.error("Parsing error loading recipe {}", $$6, var10);
         }
      }

      this.c = $$3.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, $$0x -> ((Builder)$$0x.getValue()).build()));
      this.d = $$4.build();
      b.info("Loaded {} recipes", $$3.size());
   }

   public boolean a() {
      return this.e;
   }

   public <C extends bdq, T extends cjc<C>> Optional<T> a(cjf<T> $$0, C $$1, cmm $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.a($$1, $$2)).findFirst();
   }

   public <C extends bdq, T extends cjc<C>> Optional<Pair<acq, T>> a(cjf<T> $$0, C $$1, cmm $$2, @Nullable acq $$3) {
      Map<acq, T> $$4 = this.c($$0);
      if ($$3 != null) {
         T $$5 = (T)$$4.get($$3);
         if ($$5 != null && $$5.a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cjc)$$2x.getValue()).a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((acq)$$0x.getKey(), (cjc)$$0x.getValue()));
   }

   public <C extends bdq, T extends cjc<C>> List<T> a(cjf<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bdq, T extends cjc<C>> List<T> b(cjf<T> $$0, C $$1, cmm $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.a($$2.B_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bdq, T extends cjc<C>> Map<acq, T> c(cjf<T> $$0) {
      return this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bdq, T extends cjc<C>> hn<cfz> c(cjf<T> $$0, C $$1, cmm $$2) {
      Optional<T> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().a($$1);
      } else {
         hn<cfz> $$4 = hn.a($$1.b(), cfz.b);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<? extends cjc<?>> a(acq $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cjc<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<acq> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   public static cjc<?> a(acq $$0, JsonObject $$1) {
      String $$2 = aor.i($$1, "type");
      return jb.u.b(new acq($$2)).orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'")).a($$0, $$1);
   }

   public void a(Iterable<cjc<?>> $$0) {
      this.e = false;
      Map<cjf<?>, Map<acq, cjc<?>>> $$1 = Maps.newHashMap();
      Builder<acq, cjc<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<acq, cjc<?>> $$3 = $$1.computeIfAbsent($$2x.f(), $$0xx -> Maps.newHashMap());
         acq $$4 = $$2x.e();
         cjc<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bdq, T extends cjc<C>> cjd.a<C, T> b(final cjf<T> $$0) {
      return new cjd.a<C, T>() {
         @Nullable
         private acq b;

         @Override
         public Optional<T> a(C $$0x, cmm $$1) {
            cjd $$2 = $$1.q();
            Optional<Pair<acq, T>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<acq, T> $$4 = $$3.get();
               this.b = (acq)$$4.getFirst();
               return Optional.of((T)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bdq, T extends cjc<C>> {
      Optional<T> a(C var1, cmm var2);
   }
}
