import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
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

public class csi extends asf {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<csk<?>, Map<aiy, csh<?>>> c = ImmutableMap.of();
   private Map<aiy, csh<?>> d = ImmutableMap.of();
   private boolean e;

   public csi() {
      super(a, "recipes");
   }

   protected void a(Map<aiy, JsonElement> $$0, asb $$1, bin $$2) {
      this.e = false;
      Map<csk<?>, Builder<aiy, csh<?>>> $$3 = Maps.newHashMap();
      Builder<aiy, csh<?>> $$4 = ImmutableMap.builder();

      for (Entry<aiy, JsonElement> $$5 : $$0.entrySet()) {
         aiy $$6 = $$5.getKey();

         try {
            csh<?> $$7 = a($$6, avy.m($$5.getValue(), "top element"));
            $$3.computeIfAbsent($$7.b().e(), $$0x -> ImmutableMap.builder()).put($$6, $$7);
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

   public <C extends blp, T extends csf<C>> Optional<csh<T>> a(csk<T> $$0, C $$1, cvr $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends blp, T extends csf<C>> Optional<Pair<aiy, csh<T>>> a(csk<T> $$0, C $$1, cvr $$2, @Nullable aiy $$3) {
      Map<aiy, csh<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         csh<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((csh)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((aiy)$$0x.getKey(), (csh)$$0x.getValue()));
   }

   public <C extends blp, T extends csf<C>> List<csh<T>> a(csk<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends blp, T extends csf<C>> List<csh<T>> b(csk<T> $$0, C $$1, cvr $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.I_()).r()))
         .collect(Collectors.toList());
   }

   private <C extends blp, T extends csf<C>> Map<aiy, csh<T>> c(csk<T> $$0) {
      return (Map<aiy, csh<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends blp, T extends csf<C>> is<cpd> c(csk<T> $$0, C $$1, cvr $$2) {
      Optional<csh<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         is<cpd> $$4 = is.a($$1.b(), cpd.h);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<csh<?>> a(aiy $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<csh<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<aiy> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static csh<?> a(aiy $$0, JsonObject $$1) {
      csf<?> $$2 = ac.a(csf.h.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new csh<>($$0, $$2);
   }

   public void a(Iterable<csh<?>> $$0) {
      this.e = false;
      Map<csk<?>, Map<aiy, csh<?>>> $$1 = Maps.newHashMap();
      Builder<aiy, csh<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<aiy, csh<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         aiy $$4 = $$2x.a();
         csh<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends blp, T extends csf<C>> csi.a<C, T> b(final csk<T> $$0) {
      return new csi.a<C, T>() {
         @Nullable
         private aiy b;

         @Override
         public Optional<csh<T>> a(C $$0x, cvr $$1) {
            csi $$2 = $$1.r();
            Optional<Pair<aiy, csh<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<aiy, csh<T>> $$4 = $$3.get();
               this.b = (aiy)$$4.getFirst();
               return Optional.of((csh<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends blp, T extends csf<C>> {
      Optional<csh<T>> a(C var1, cvr var2);
   }
}
