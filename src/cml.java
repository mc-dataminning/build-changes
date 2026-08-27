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

public class cml extends anx {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cmn<?>, Map<aew, cmk<?>>> c = ImmutableMap.of();
   private Map<aew, cmk<?>> d = ImmutableMap.of();
   private boolean e;

   public cml() {
      super(a, "recipes");
   }

   protected void a(Map<aew, JsonElement> $$0, ant $$1, bdp $$2) {
      this.e = false;
      Map<cmn<?>, Builder<aew, cmk<?>>> $$3 = Maps.newHashMap();
      Builder<aew, cmk<?>> $$4 = ImmutableMap.builder();

      for (Entry<aew, JsonElement> $$5 : $$0.entrySet()) {
         aew $$6 = $$5.getKey();

         try {
            cmk<?> $$7 = a($$6, arn.m($$5.getValue(), "top element"));
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

   public <C extends bgr, T extends cmj<C>> Optional<cmk<T>> a(cmn<T> $$0, C $$1, cpv $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bgr, T extends cmj<C>> Optional<Pair<aew, cmk<T>>> a(cmn<T> $$0, C $$1, cpv $$2, @Nullable aew $$3) {
      Map<aew, cmk<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cmk<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cmk)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((aew)$$0x.getKey(), (cmk)$$0x.getValue()));
   }

   public <C extends bgr, T extends cmj<C>> List<cmk<T>> a(cmn<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bgr, T extends cmj<C>> List<cmk<T>> b(cmn<T> $$0, C $$1, cpv $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.G_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bgr, T extends cmj<C>> Map<aew, cmk<T>> c(cmn<T> $$0) {
      return (Map<aew, cmk<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bgr, T extends cmj<C>> hn<cjf> c(cmn<T> $$0, C $$1, cpv $$2) {
      Optional<cmk<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         hn<cjf> $$4 = hn.a($$1.b(), cjf.b);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cmk<?>> a(aew $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cmk<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<aew> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static cmk<?> a(aew $$0, JsonObject $$1) {
      String $$2 = arn.i($$1, "type");
      Codec<? extends cmj<?>> $$3 = (Codec<? extends cmj<?>>)jb.u
         .b(new aew($$2))
         .orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'"))
         .a();
      cmj<?> $$4 = ac.a($$3.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new cmk<>($$0, $$4);
   }

   public void a(Iterable<cmk<?>> $$0) {
      this.e = false;
      Map<cmn<?>, Map<aew, cmk<?>>> $$1 = Maps.newHashMap();
      Builder<aew, cmk<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<aew, cmk<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         aew $$4 = $$2x.a();
         cmk<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bgr, T extends cmj<C>> cml.a<C, T> b(final cmn<T> $$0) {
      return new cml.a<C, T>() {
         @Nullable
         private aew b;

         @Override
         public Optional<cmk<T>> a(C $$0x, cpv $$1) {
            cml $$2 = $$1.q();
            Optional<Pair<aew, cmk<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<aew, cmk<T>> $$4 = $$3.get();
               this.b = (aew)$$4.getFirst();
               return Optional.of((cmk<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bgr, T extends cmj<C>> {
      Optional<cmk<T>> a(C var1, cpv var2);
   }
}
