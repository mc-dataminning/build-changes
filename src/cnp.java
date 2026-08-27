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
import com.mojang.serialization.Codec;
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

public class cnp extends aox {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cnr<?>, Map<afw, cno<?>>> c = ImmutableMap.of();
   private Map<afw, cno<?>> d = ImmutableMap.of();
   private boolean e;

   public cnp() {
      super(a, "recipes");
   }

   protected void a(Map<afw, JsonElement> $$0, aot $$1, bes $$2) {
      this.e = false;
      Map<cnr<?>, Builder<afw, cno<?>>> $$3 = Maps.newHashMap();
      Builder<afw, cno<?>> $$4 = ImmutableMap.builder();

      for (Entry<afw, JsonElement> $$5 : $$0.entrySet()) {
         afw $$6 = $$5.getKey();

         try {
            cno<?> $$7 = a($$6, aso.m($$5.getValue(), "top element"));
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

   public <C extends bhu, T extends cnn<C>> Optional<cno<T>> a(cnr<T> $$0, C $$1, cqz $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bhu, T extends cnn<C>> Optional<Pair<afw, cno<T>>> a(cnr<T> $$0, C $$1, cqz $$2, @Nullable afw $$3) {
      Map<afw, cno<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cno<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cno)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((afw)$$0x.getKey(), (cno)$$0x.getValue()));
   }

   public <C extends bhu, T extends cnn<C>> List<cno<T>> a(cnr<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bhu, T extends cnn<C>> List<cno<T>> b(cnr<T> $$0, C $$1, cqz $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.H_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bhu, T extends cnn<C>> Map<afw, cno<T>> c(cnr<T> $$0) {
      return (Map<afw, cno<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bhu, T extends cnn<C>> il<ckj> c(cnr<T> $$0, C $$1, cqz $$2) {
      Optional<cno<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         il<ckj> $$4 = il.a($$1.b(), ckj.b);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cno<?>> a(afw $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cno<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<afw> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static cno<?> a(afw $$0, JsonObject $$1) {
      String $$2 = aso.i($$1, "type");
      Codec<? extends cnn<?>> $$3 = (Codec<? extends cnn<?>>)jy.u
         .b(new afw($$2))
         .orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'"))
         .a();
      cnn<?> $$4 = ac.a($$3.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new cno<>($$0, $$4);
   }

   public void a(Iterable<cno<?>> $$0) {
      this.e = false;
      Map<cnr<?>, Map<afw, cno<?>>> $$1 = Maps.newHashMap();
      Builder<afw, cno<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<afw, cno<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         afw $$4 = $$2x.a();
         cno<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bhu, T extends cnn<C>> cnp.a<C, T> b(final cnr<T> $$0) {
      return new cnp.a<C, T>() {
         @Nullable
         private afw b;

         @Override
         public Optional<cno<T>> a(C $$0x, cqz $$1) {
            cnp $$2 = $$1.q();
            Optional<Pair<afw, cno<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<afw, cno<T>> $$4 = $$3.get();
               this.b = (afw)$$4.getFirst();
               return Optional.of((cno<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bhu, T extends cnn<C>> {
      Optional<cno<T>> a(C var1, cqz var2);
   }
}
