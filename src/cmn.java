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

public class cmn extends anz {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cmp<?>, Map<aey, cmm<?>>> c = ImmutableMap.of();
   private Map<aey, cmm<?>> d = ImmutableMap.of();
   private boolean e;

   public cmn() {
      super(a, "recipes");
   }

   protected void a(Map<aey, JsonElement> $$0, anv $$1, bdr $$2) {
      this.e = false;
      Map<cmp<?>, Builder<aey, cmm<?>>> $$3 = Maps.newHashMap();
      Builder<aey, cmm<?>> $$4 = ImmutableMap.builder();

      for (Entry<aey, JsonElement> $$5 : $$0.entrySet()) {
         aey $$6 = $$5.getKey();

         try {
            cmm<?> $$7 = a($$6, arp.m($$5.getValue(), "top element"));
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

   public <C extends bgt, T extends cml<C>> Optional<cmm<T>> a(cmp<T> $$0, C $$1, cpx $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bgt, T extends cml<C>> Optional<Pair<aey, cmm<T>>> a(cmp<T> $$0, C $$1, cpx $$2, @Nullable aey $$3) {
      Map<aey, cmm<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cmm<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cmm)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((aey)$$0x.getKey(), (cmm)$$0x.getValue()));
   }

   public <C extends bgt, T extends cml<C>> List<cmm<T>> a(cmp<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bgt, T extends cml<C>> List<cmm<T>> b(cmp<T> $$0, C $$1, cpx $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.G_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bgt, T extends cml<C>> Map<aey, cmm<T>> c(cmp<T> $$0) {
      return (Map<aey, cmm<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bgt, T extends cml<C>> hp<cjh> c(cmp<T> $$0, C $$1, cpx $$2) {
      Optional<cmm<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         hp<cjh> $$4 = hp.a($$1.b(), cjh.b);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cmm<?>> a(aey $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cmm<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<aey> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static cmm<?> a(aey $$0, JsonObject $$1) {
      String $$2 = arp.i($$1, "type");
      Codec<? extends cml<?>> $$3 = (Codec<? extends cml<?>>)jd.u
         .b(new aey($$2))
         .orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'"))
         .a();
      cml<?> $$4 = ac.a($$3.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new cmm<>($$0, $$4);
   }

   public void a(Iterable<cmm<?>> $$0) {
      this.e = false;
      Map<cmp<?>, Map<aey, cmm<?>>> $$1 = Maps.newHashMap();
      Builder<aey, cmm<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<aey, cmm<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         aey $$4 = $$2x.a();
         cmm<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bgt, T extends cml<C>> cmn.a<C, T> b(final cmp<T> $$0) {
      return new cmn.a<C, T>() {
         @Nullable
         private aey b;

         @Override
         public Optional<cmm<T>> a(C $$0x, cpx $$1) {
            cmn $$2 = $$1.q();
            Optional<Pair<aey, cmm<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<aey, cmm<T>> $$4 = $$3.get();
               this.b = (aey)$$4.getFirst();
               return Optional.of((cmm<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bgt, T extends cml<C>> {
      Optional<cmm<T>> a(C var1, cpx var2);
   }
}
