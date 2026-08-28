import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
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

public class dsf<O, S extends dsg<O, S>> {
   static final Pattern a = Pattern.compile("^[a-z0-9_]+$");
   private final O b;
   private final ImmutableSortedMap<String, dth<?>> c;
   private final ImmutableList<S> d;

   protected dsf(Function<O, S> $$0, O $$1, dsf.b<O, S> $$2, Map<String, dth<?>> $$3) {
      this.b = $$1;
      this.c = ImmutableSortedMap.copyOf($$3);
      Supplier<S> $$4 = () -> $$0.apply($$1);
      MapCodec<S> $$5 = MapCodec.of(Encoder.empty(), Decoder.unit($$4));
      UnmodifiableIterator $$7 = this.c.entrySet().iterator();

      while ($$7.hasNext()) {
         Entry<String, dth<?>> $$6 = (Entry<String, dth<?>>)$$7.next();
         $$5 = a($$5, $$4, $$6.getKey(), $$6.getValue());
      }

      MapCodec<S> $$7x = $$5;
      Map<Map<dth<?>, Comparable<?>>, S> $$8 = Maps.newLinkedHashMap();
      List<S> $$9 = Lists.newArrayList();
      Stream<List<Pair<dth<?>, Comparable<?>>>> $$10 = Stream.of(Collections.emptyList());
      UnmodifiableIterator var11 = this.c.values().iterator();

      while (var11.hasNext()) {
         dth<?> $$11 = (dth<?>)var11.next();
         $$10 = $$10.flatMap($$1x -> $$11.a().stream().map($$2x -> {
               List<Pair<dth<?>, Comparable<?>>> $$3x = Lists.newArrayList($$1x);
               $$3x.add(Pair.of($$11, $$2x));
               return $$3x;
            }));
      }

      $$10.forEach($$5x -> {
         Reference2ObjectArrayMap<dth<?>, Comparable<?>> $$6 = new Reference2ObjectArrayMap($$5x.size());

         for (Pair<dth<?>, Comparable<?>> $$7xx : $$5x) {
            $$6.put((dth)$$7xx.getFirst(), (Comparable)$$7xx.getSecond());
         }

         S $$8x = $$2.create($$1, $$6, $$7);
         $$8.put($$6, $$8x);
         $$9.add($$8x);
      });

      for (S $$12 : $$9) {
         $$12.a($$8);
      }

      this.d = ImmutableList.copyOf($$9);
   }

   private static <S extends dsg<?, S>, T extends Comparable<T>> MapCodec<S> a(MapCodec<S> $$0, Supplier<S> $$1, String $$2, dth<T> $$3) {
      return Codec.mapPair($$0, $$3.e().fieldOf($$2).orElseGet($$0x -> {
      }, () -> $$3.a($$1.get()))).xmap($$1x -> (dsg)((dsg)$$1x.getFirst()).a($$3, ((dth.a)$$1x.getSecond()).b()), $$1x -> Pair.of($$1x, $$3.a($$1x)));
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

   public Collection<dth<?>> d() {
      return this.c.values();
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this)
         .add("block", this.b)
         .add("properties", this.c.values().stream().map(dth::f).collect(Collectors.toList()))
         .toString();
   }

   @Nullable
   public dth<?> a(String $$0) {
      return (dth<?>)this.c.get($$0);
   }

   public static class a<O, S extends dsg<O, S>> {
      private final O a;
      private final Map<String, dth<?>> b = Maps.newHashMap();

      public a(O $$0) {
         this.a = $$0;
      }

      public dsf.a<O, S> a(dth<?>... $$0) {
         for (dth<?> $$1 : $$0) {
            this.a($$1);
            this.b.put($$1.f(), $$1);
         }

         return this;
      }

      private <T extends Comparable<T>> void a(dth<T> $$0) {
         String $$1 = $$0.f();
         if (!dsf.a.matcher($$1).matches()) {
            throw new IllegalArgumentException(this.a + " has invalidly named property: " + $$1);
         } else {
            Collection<T> $$2 = $$0.a();
            if ($$2.size() <= 1) {
               throw new IllegalArgumentException(this.a + " attempted use property " + $$1 + " with <= 1 possible values");
            } else {
               for (T $$3 : $$2) {
                  String $$4 = $$0.a($$3);
                  if (!dsf.a.matcher($$4).matches()) {
                     throw new IllegalArgumentException(this.a + " has property: " + $$1 + " with invalidly named value: " + $$4);
                  }
               }

               if (this.b.containsKey($$1)) {
                  throw new IllegalArgumentException(this.a + " has duplicate property: " + $$1);
               }
            }
         }
      }

      public dsf<O, S> a(Function<O, S> $$0, dsf.b<O, S> $$1) {
         return new dsf<>($$0, this.a, $$1, this.b);
      }
   }

   public interface b<O, S> {
      S create(O var1, Reference2ObjectArrayMap<dth<?>, Comparable<?>> var2, MapCodec<S> var3);
   }
}
