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

public class cmr extends aoa {
   private static final Gson a = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
   private static final Logger b = LogUtils.getLogger();
   private Map<cmt<?>, Map<aez, cmq<?>>> c = ImmutableMap.of();
   private Map<aez, cmq<?>> d = ImmutableMap.of();
   private boolean e;

   public cmr() {
      super(a, "recipes");
   }

   protected void a(Map<aez, JsonElement> $$0, anw $$1, bdv $$2) {
      this.e = false;
      Map<cmt<?>, Builder<aez, cmq<?>>> $$3 = Maps.newHashMap();
      Builder<aez, cmq<?>> $$4 = ImmutableMap.builder();

      for (Entry<aez, JsonElement> $$5 : $$0.entrySet()) {
         aez $$6 = $$5.getKey();

         try {
            cmq<?> $$7 = a($$6, arr.m($$5.getValue(), "top element"));
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

   public <C extends bgx, T extends cmp<C>> Optional<cmq<T>> a(cmt<T> $$0, C $$1, cqb $$2) {
      return this.c($$0).values().stream().filter($$2x -> $$2x.b().a($$1, $$2)).findFirst();
   }

   public <C extends bgx, T extends cmp<C>> Optional<Pair<aez, cmq<T>>> a(cmt<T> $$0, C $$1, cqb $$2, @Nullable aez $$3) {
      Map<aez, cmq<T>> $$4 = this.c($$0);
      if ($$3 != null) {
         cmq<T> $$5 = $$4.get($$3);
         if ($$5 != null && $$5.b().a($$1, $$2)) {
            return Optional.of(Pair.of($$3, $$5));
         }
      }

      return $$4.entrySet()
         .stream()
         .filter($$2x -> ((cmq)$$2x.getValue()).b().a($$1, $$2))
         .findFirst()
         .map($$0x -> Pair.of((aez)$$0x.getKey(), (cmq)$$0x.getValue()));
   }

   public <C extends bgx, T extends cmp<C>> List<cmq<T>> a(cmt<T> $$0) {
      return List.copyOf(this.c($$0).values());
   }

   public <C extends bgx, T extends cmp<C>> List<cmq<T>> b(cmt<T> $$0, C $$1, cqb $$2) {
      return this.c($$0)
         .values()
         .stream()
         .filter($$2x -> $$2x.b().a($$1, $$2))
         .sorted(Comparator.comparing($$1x -> $$1x.b().a($$2.G_()).q()))
         .collect(Collectors.toList());
   }

   private <C extends bgx, T extends cmp<C>> Map<aez, cmq<T>> c(cmt<T> $$0) {
      return (Map<aez, cmq<T>>)this.c.getOrDefault($$0, Collections.emptyMap());
   }

   public <C extends bgx, T extends cmp<C>> hn<cjl> c(cmt<T> $$0, C $$1, cqb $$2) {
      Optional<cmq<T>> $$3 = this.a($$0, $$1, $$2);
      if ($$3.isPresent()) {
         return $$3.get().b().a($$1);
      } else {
         hn<cjl> $$4 = hn.a($$1.b(), cjl.b);

         for (int $$5 = 0; $$5 < $$4.size(); $$5++) {
            $$4.set($$5, $$1.a($$5));
         }

         return $$4;
      }
   }

   public Optional<cmq<?>> a(aez $$0) {
      return Optional.ofNullable(this.d.get($$0));
   }

   public Collection<cmq<?>> b() {
      return this.c.values().stream().flatMap($$0 -> $$0.values().stream()).collect(Collectors.toSet());
   }

   public Stream<aez> d() {
      return this.c.values().stream().flatMap($$0 -> $$0.keySet().stream());
   }

   protected static cmq<?> a(aez $$0, JsonObject $$1) {
      String $$2 = arr.i($$1, "type");
      Codec<? extends cmp<?>> $$3 = (Codec<? extends cmp<?>>)jb.u
         .b(new aez($$2))
         .orElseThrow(() -> new JsonSyntaxException("Invalid or unsupported recipe type '" + $$2 + "'"))
         .a();
      cmp<?> $$4 = ac.a($$3.parse(JsonOps.INSTANCE, $$1), JsonParseException::new);
      return new cmq<>($$0, $$4);
   }

   public void a(Iterable<cmq<?>> $$0) {
      this.e = false;
      Map<cmt<?>, Map<aez, cmq<?>>> $$1 = Maps.newHashMap();
      Builder<aez, cmq<?>> $$2 = ImmutableMap.builder();
      $$0.forEach($$2x -> {
         Map<aez, cmq<?>> $$3 = $$1.computeIfAbsent($$2x.b().e(), $$0xx -> Maps.newHashMap());
         aez $$4 = $$2x.a();
         cmq<?> $$5 = $$3.put($$4, $$2x);
         $$2.put($$4, $$2x);
         if ($$5 != null) {
            throw new IllegalStateException("Duplicate recipe ignored with ID " + $$4);
         }
      });
      this.c = ImmutableMap.copyOf($$1);
      this.d = $$2.build();
   }

   public static <C extends bgx, T extends cmp<C>> cmr.a<C, T> b(final cmt<T> $$0) {
      return new cmr.a<C, T>() {
         @Nullable
         private aez b;

         @Override
         public Optional<cmq<T>> a(C $$0x, cqb $$1) {
            cmr $$2 = $$1.q();
            Optional<Pair<aez, cmq<T>>> $$3 = $$2.a($$0, $$0, $$1, this.b);
            if ($$3.isPresent()) {
               Pair<aez, cmq<T>> $$4 = $$3.get();
               this.b = (aez)$$4.getFirst();
               return Optional.of((cmq<T>)$$4.getSecond());
            } else {
               return Optional.empty();
            }
         }
      };
   }

   public interface a<C extends bgx, T extends cmp<C>> {
      Optional<cmq<T>> a(C var1, cqb var2);
   }
}
