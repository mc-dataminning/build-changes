import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dmf<O, S extends dmg<O, S>> {
   static final Pattern a = Pattern.compile("^[a-z0-9_]+$");
   private final O b;
   private final ImmutableSortedMap<String, dnh<?>> c;
   private final ImmutableList<S> d;

   protected dmf(Function<O, S> $$0, O $$1, dmf.b<O, S> $$2, Map<String, dnh<?>> $$3) {
      this.b = $$1;
      this.c = ImmutableSortedMap.copyOf($$3);
      Supplier<S> $$4 = () -> $$0.apply($$1);
      MapCodec<S> $$5 = MapCodec.of(Encoder.empty(), Decoder.unit($$4));
      UnmodifiableIterator $$7 = this.c.entrySet().iterator();

      while ($$7.hasNext()) {
         Entry<String, dnh<?>> $$6 = (Entry<String, dnh<?>>)$$7.next();
         $$5 = a($$5, $$4, $$6.getKey(), $$6.getValue());
      }

      MapCodec<S> $$7x = $$5;
      Map<Map<dnh<?>, Comparable<?>>, S> $$8 = Maps.newLinkedHashMap();
      List<S> $$9 = Lists.newArrayList();
      Stream<List<Pair<dnh<?>, Comparable<?>>>> $$10 = Stream.of(Collections.emptyList());
      UnmodifiableIterator var11 = this.c.values().iterator();

      while (var11.hasNext()) {
         dnh<?> $$11 = (dnh<?>)var11.next();
         $$10 = $$10.flatMap($$1x -> $$11.a().stream().map($$2x -> {
               List<Pair<dnh<?>, Comparable<?>>> $$3x = Lists.newArrayList($$1x);
               $$3x.add(Pair.of($$11, $$2x));
               return $$3x;
            }));
      }

      $$10.forEach($$5x -> {
         ImmutableMap<dnh<?>, Comparable<?>> $$6 = $$5x.stream().collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
         S $$7xx = $$2.create($$1, $$6, $$7);
         $$8.put($$6, $$7xx);
         $$9.add($$7xx);
      });

      for (S $$12 : $$9) {
         $$12.a($$8);
      }

      this.d = ImmutableList.copyOf($$9);
   }

   private static <S extends dmg<?, S>, T extends Comparable<T>> MapCodec<S> a(MapCodec<S> $$0, Supplier<S> $$1, String $$2, dnh<T> $$3) {
      return Codec.mapPair($$0, $$3.e().fieldOf($$2).orElseGet($$0x -> {
      }, () -> $$3.a($$1.get()))).xmap($$1x -> (dmg)((dmg)$$1x.getFirst()).a($$3, ((dnh.a)$$1x.getSecond()).b()), $$1x -> Pair.of($$1x, $$3.a($$1x)));
   }

   public ImmutableList<S> a() {
      return this.d;
   }

   public S b() {
      return (S)this.d.get(0);
   }

   public O c() {
      return this.b;
   }

   public Collection<dnh<?>> d() {
      return this.c.values();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("block", this.b)
         .add("properties", this.c.values().stream().map(dnh::f).collect(Collectors.toList()))
         .toString();
   }

   @Nullable
   public dnh<?> a(String $$0) {
      return (dnh<?>)this.c.get($$0);
   }

   public static class a<O, S extends dmg<O, S>> {
      private final O a;
      private final Map<String, dnh<?>> b = Maps.newHashMap();

      public a(O $$0) {
         this.a = $$0;
      }

      public dmf.a<O, S> a(dnh<?>... $$0) {
         for (dnh<?> $$1 : $$0) {
            this.a($$1);
            this.b.put($$1.f(), $$1);
         }

         return this;
      }

      private <T extends Comparable<T>> void a(dnh<T> $$0) {
         String $$1 = $$0.f();
         if (!dmf.a.matcher($$1).matches()) {
            throw new IllegalArgumentException(this.a + " has invalidly named property: " + $$1);
         } else {
            Collection<T> $$2 = $$0.a();
            if ($$2.size() <= 1) {
               throw new IllegalArgumentException(this.a + " attempted use property " + $$1 + " with <= 1 possible values");
            } else {
               for (T $$3 : $$2) {
                  String $$4 = $$0.a($$3);
                  if (!dmf.a.matcher($$4).matches()) {
                     throw new IllegalArgumentException(this.a + " has property: " + $$1 + " with invalidly named value: " + $$4);
                  }
               }

               if (this.b.containsKey($$1)) {
                  throw new IllegalArgumentException(this.a + " has duplicate property: " + $$1);
               }
            }
         }
      }

      public dmf<O, S> a(Function<O, S> $$0, dmf.b<O, S> $$1) {
         return new dmf<>($$0, this.a, $$1, this.b);
      }
   }

   public interface b<O, S> {
      S create(O var1, ImmutableMap<dnh<?>, Comparable<?>> var2, MapCodec<S> var3);
   }
}
