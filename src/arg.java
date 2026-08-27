import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.Codec.ResultFunction;
import com.mojang.serialization.DataResult.PartialResult;
import com.mojang.serialization.MapCodec.MapCodecCodec;
import com.mojang.serialization.codecs.BaseMapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.floats.FloatArrayList;
import it.unimi.dsi.fastutil.floats.FloatList;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.mutable.MutableObject;
import org.joml.AxisAngle4f;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class arg {
   public static final Codec<JsonElement> a = Codec.PASSTHROUGH
      .xmap($$0 -> (JsonElement)$$0.convert(JsonOps.INSTANCE).getValue(), $$0 -> new Dynamic(JsonOps.INSTANCE, $$0));
   public static final Codec<tl> b = a(tl.a::a, tl.a::c);
   public static final Codec<tl> c = Codec.STRING.flatXmap($$0 -> {
      try {
         return DataResult.success(tl.a.a($$0));
      } catch (JsonParseException var2) {
         return DataResult.error(var2::getMessage);
      }
   }, $$0 -> {
      try {
         return DataResult.success(tl.a.a($$0));
      } catch (IllegalArgumentException var2) {
         return DataResult.error(var2::getMessage);
      }
   });
   public static final Codec<Vector3f> d = Codec.FLOAT
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 3).map($$0x -> new Vector3f((Float)$$0x.get(0), (Float)$$0x.get(1), (Float)$$0x.get(2))), $$0 -> List.of($$0.x(), $$0.y(), $$0.z())
      );
   public static final Codec<Quaternionf> e = Codec.FLOAT
      .listOf()
      .comapFlatMap(
         $$0 -> ac.a($$0, 4).map($$0x -> new Quaternionf((Float)$$0x.get(0), (Float)$$0x.get(1), (Float)$$0x.get(2), (Float)$$0x.get(3))),
         $$0 -> List.of($$0.x, $$0.y, $$0.z, $$0.w)
      );
   public static final Codec<AxisAngle4f> f = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.FLOAT.fieldOf("angle").forGetter($$0x -> $$0x.angle), d.fieldOf("axis").forGetter($$0x -> new Vector3f($$0x.x, $$0x.y, $$0x.z)))
            .apply($$0, AxisAngle4f::new)
   );
   public static final Codec<Quaternionf> g = e(e, f.xmap(Quaternionf::new, AxisAngle4f::new));
   public static Codec<Matrix4f> h = Codec.FLOAT.listOf().comapFlatMap($$0 -> ac.a($$0, 16).map($$0x -> {
         Matrix4f $$1 = new Matrix4f();

         for (int $$2 = 0; $$2 < $$0x.size(); $$2++) {
            $$1.setRowColumn($$2 >> 2, $$2 & 3, (Float)$$0x.get($$2));
         }

         return $$1.determineProperties();
      }), $$0 -> {
      FloatList $$1 = new FloatArrayList(16);

      for (int $$2 = 0; $$2 < 16; $$2++) {
         $$1.add($$0.getRowColumn($$2 >> 2, $$2 & 3));
      }

      return $$1;
   });
   public static final Codec<Integer> i = a(0, Integer.MAX_VALUE, $$0 -> "Value must be non-negative: " + $$0);
   public static final Codec<Integer> j = a(1, Integer.MAX_VALUE, $$0 -> "Value must be positive: " + $$0);
   public static final Codec<Float> k = a(0.0F, Float.MAX_VALUE, $$0 -> "Value must be positive: " + $$0);
   public static final Codec<Pattern> l = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(Pattern.compile($$0));
      } catch (PatternSyntaxException var2) {
         return DataResult.error(() -> "Invalid regex pattern '" + $$0 + "': " + var2.getMessage());
      }
   }, Pattern::pattern);
   public static final Codec<Instant> m = a(DateTimeFormatter.ISO_INSTANT).xmap(Instant::from, Function.identity());
   public static final Codec<byte[]> n = Codec.STRING.comapFlatMap($$0 -> {
      try {
         return DataResult.success(Base64.getDecoder().decode($$0));
      } catch (IllegalArgumentException var2) {
         return DataResult.error(() -> "Malformed base64 string");
      }
   }, $$0 -> Base64.getEncoder().encodeToString($$0));
   public static final Codec<String> o = Codec.STRING
      .comapFlatMap($$0 -> DataResult.success(StringEscapeUtils.unescapeJava($$0)), StringEscapeUtils::escapeJava);
   public static final Codec<arg.f> p = Codec.STRING
      .comapFlatMap(
         $$0 -> $$0.startsWith("#") ? aex.b($$0.substring(1)).map($$0x -> new arg.f($$0x, true)) : aex.b($$0).map($$0x -> new arg.f($$0x, false)), arg.f::c
      );
   public static final Function<Optional<Long>, OptionalLong> q = $$0 -> $$0.map(OptionalLong::of).orElseGet(OptionalLong::empty);
   public static final Function<OptionalLong, Optional<Long>> r = $$0 -> $$0.isPresent() ? Optional.of($$0.getAsLong()) : Optional.empty();
   public static final Codec<BitSet> s = Codec.LONG_STREAM.xmap($$0 -> BitSet.valueOf($$0.toArray()), $$0 -> Arrays.stream($$0.toLongArray()));
   private static final Codec<Property> y = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("name").forGetter(Property::name),
               Codec.STRING.fieldOf("value").forGetter(Property::value),
               Codec.STRING.optionalFieldOf("signature").forGetter($$0x -> Optional.ofNullable($$0x.signature()))
            )
            .apply($$0, ($$0x, $$1, $$2) -> new Property($$0x, $$1, (String)$$2.orElse(null)))
   );
   @VisibleForTesting
   public static final Codec<PropertyMap> t = Codec.either(Codec.unboundedMap(Codec.STRING, Codec.STRING.listOf()), y.listOf()).xmap($$0 -> {
      PropertyMap $$1 = new PropertyMap();
      $$0.ifLeft($$1x -> $$1x.forEach(($$1xx, $$2) -> {
            for (String $$3 : $$2) {
               $$1.put($$1xx, new Property($$1xx, $$3));
            }
         })).ifRight($$1x -> {
         for (Property $$2 : $$1x) {
            $$1.put($$2.name(), $$2);
         }
      });
      return $$1;
   }, $$0 -> Either.right($$0.values().stream().toList()));
   private static final MapCodec<GameProfile> z = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ia.c.fieldOf("id").forGetter(GameProfile::getId), Codec.STRING.fieldOf("name").forGetter(GameProfile::getName))
            .apply($$0, GameProfile::new)
   );
   public static final Codec<GameProfile> u = RecordCodecBuilder.create(
      $$0 -> $$0.group(z.forGetter(Function.identity()), t.optionalFieldOf("properties", new PropertyMap()).forGetter(GameProfile::getProperties))
            .apply($$0, ($$0x, $$1) -> {
               $$1.forEach(($$1x, $$2) -> $$0x.getProperties().put($$1x, $$2));
               return $$0x;
            })
   );
   public static final Codec<String> v = a(Codec.STRING, $$0 -> $$0.isEmpty() ? DataResult.error(() -> "Expected non-empty string") : DataResult.success($$0));
   public static final Codec<Integer> w = Codec.STRING.comapFlatMap($$0 -> {
      int[] $$1 = $$0.codePoints().toArray();
      return $$1.length != 1 ? DataResult.error(() -> "Expected one codepoint, got: " + $$0) : DataResult.success($$1[0]);
   }, Character::toString);
   public static Codec<String> x = a(
      Codec.STRING, $$0 -> !aex.g($$0) ? DataResult.error(() -> "Invalid string to use as a resource path element: " + $$0) : DataResult.success($$0)
   );

   @Deprecated
   public static <T> Codec<T> a(Function<JsonElement, T> $$0, Function<T, JsonElement> $$1) {
      return a.flatXmap($$1x -> {
         try {
            return DataResult.success($$0.apply($$1x));
         } catch (JsonParseException var3) {
            return DataResult.error(var3::getMessage);
         }
      }, $$1x -> {
         try {
            return DataResult.success($$1.apply((T)$$1x));
         } catch (IllegalArgumentException var3) {
            return DataResult.error(var3::getMessage);
         }
      });
   }

   public static <F, S> Codec<Either<F, S>> a(Codec<F> $$0, Codec<S> $$1) {
      return new arg.g($$0, $$1);
   }

   public static <P, I> Codec<I> a(Codec<P> $$0, String $$1, String $$2, BiFunction<P, P, DataResult<I>> $$3, Function<I, P> $$4, Function<I, P> $$5) {
      Codec<I> $$6 = Codec.list($$0).comapFlatMap($$1x -> ac.a($$1x, 2).flatMap($$1xx -> {
            P $$2x = (P)$$1xx.get(0);
            P $$3x = (P)$$1xx.get(1);
            return $$3.apply($$2x, $$3x);
         }), $$2x -> ImmutableList.of($$4.apply((I)$$2x), $$5.apply((I)$$2x)));
      Codec<I> $$7 = RecordCodecBuilder.create(
            $$3x -> $$3x.group($$0.fieldOf($$1).forGetter(Pair::getFirst), $$0.fieldOf($$2).forGetter(Pair::getSecond)).apply($$3x, Pair::of)
         )
         .comapFlatMap($$1x -> $$3.apply((P)$$1x.getFirst(), (P)$$1x.getSecond()), $$2x -> Pair.of($$4.apply((I)$$2x), $$5.apply((I)$$2x)));
      Codec<I> $$8 = e($$6, $$7);
      return Codec.either($$0, $$8).comapFlatMap($$1x -> (DataResult)$$1x.map($$1xx -> $$3.apply((P)$$1xx, (P)$$1xx), DataResult::success), $$2x -> {
         P $$3x = $$4.apply((I)$$2x);
         P $$4x = $$5.apply((I)$$2x);
         return Objects.equals($$3x, $$4x) ? Either.left($$3x) : Either.right($$2x);
      });
   }

   public static <A> ResultFunction<A> a(final A $$0) {
      return new ResultFunction<A>() {
         public <T> DataResult<Pair<A, T>> apply(DynamicOps<T> $$0x, T $$1, DataResult<Pair<A, T>> $$2) {
            MutableObject<String> $$3 = new MutableObject();
            Optional<Pair<A, T>> $$4 = $$2.resultOrPartial($$3::setValue);
            return $$4.isPresent() ? $$2 : DataResult.error(() -> "(" + (String)$$3.getValue() + " -> using default)", Pair.of($$0, $$1));
         }

         public <T> DataResult<T> coApply(DynamicOps<T> $$0x, A $$1, DataResult<T> $$2) {
            return $$2;
         }

         @Override
         public String toString() {
            return "OrElsePartial[" + $$0 + "]";
         }
      };
   }

   public static <E> Codec<E> a(ToIntFunction<E> $$0, IntFunction<E> $$1, int $$2) {
      return Codec.INT
         .flatXmap(
            $$1x -> Optional.ofNullable($$1.apply($$1x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown element id: " + $$1x)),
            $$2x -> {
               int $$3 = $$0.applyAsInt((E)$$2x);
               return $$3 == $$2 ? DataResult.error(() -> "Element with unknown id: " + $$2x) : DataResult.success($$3);
            }
         );
   }

   public static <E> Codec<E> b(Function<E, String> $$0, Function<String, E> $$1) {
      return Codec.STRING
         .flatXmap(
            $$1x -> Optional.ofNullable($$1.apply($$1x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Unknown element name:" + $$1x)),
            $$1x -> Optional.ofNullable($$0.apply((E)$$1x))
                  .<DataResult>map(DataResult::success)
                  .orElseGet(() -> DataResult.error(() -> "Element with unknown name: " + $$1x))
         );
   }

   public static <E> Codec<E> b(final Codec<E> $$0, final Codec<E> $$1) {
      return new Codec<E>() {
         public <T> DataResult<T> encode(E $$0x, DynamicOps<T> $$1x, T $$2) {
            return $$1.compressMaps() ? $$1.encode($$0, $$1, $$2) : $$0.encode($$0, $$1, $$2);
         }

         public <T> DataResult<Pair<E, T>> decode(DynamicOps<T> $$0x, T $$1x) {
            return $$0.compressMaps() ? $$1.decode($$0, $$1) : $$0.decode($$0, $$1);
         }

         @Override
         public String toString() {
            return $$0 + " orCompressed " + $$1;
         }
      };
   }

   public static <E> Codec<E> a(Codec<E> $$0, final Function<E, Lifecycle> $$1, final Function<E, Lifecycle> $$2) {
      return $$0.mapResult(new ResultFunction<E>() {
         public <T> DataResult<Pair<E, T>> apply(DynamicOps<T> $$0, T $$1x, DataResult<Pair<E, T>> $$2x) {
            return $$2.result().map($$2xxx -> $$2.setLifecycle($$1.apply((E)$$2xxx.getFirst()))).orElse($$2);
         }

         public <T> DataResult<T> coApply(DynamicOps<T> $$0, E $$1x, DataResult<T> $$2x) {
            return $$2.setLifecycle($$2.apply($$1));
         }

         @Override
         public String toString() {
            return "WithLifecycle[" + $$1 + " " + $$2 + "]";
         }
      });
   }

   public static <F, S> arg.b<F, S> c(Codec<F> $$0, Codec<S> $$1) {
      return new arg.b<>($$0, $$1);
   }

   public static <K, V> arg.e<K, V> d(Codec<K> $$0, Codec<V> $$1) {
      return new arg.e<>($$0, $$1);
   }

   public static <T> Codec<T> a(Codec<T> $$0, Function<T, DataResult<T>> $$1) {
      return $$0 instanceof MapCodecCodec<T> $$2 ? a($$2.codec(), $$1).codec() : $$0.flatXmap($$1, $$1);
   }

   public static <T> MapCodec<T> a(MapCodec<T> $$0, Function<T, DataResult<T>> $$1) {
      return $$0.flatXmap($$1, $$1);
   }

   private static Codec<Integer> a(int $$0, int $$1, Function<Integer, String> $$2) {
      return a(Codec.INT, $$3 -> $$3.compareTo($$0) >= 0 && $$3.compareTo($$1) <= 0 ? DataResult.success($$3) : DataResult.error(() -> $$2.apply($$3)));
   }

   public static Codec<Integer> a(int $$0, int $$1) {
      return a($$0, $$1, $$2 -> "Value must be within range [" + $$0 + ";" + $$1 + "]: " + $$2);
   }

   private static Codec<Float> a(float $$0, float $$1, Function<Float, String> $$2) {
      return a(Codec.FLOAT, $$3 -> $$3.compareTo($$0) > 0 && $$3.compareTo($$1) <= 0 ? DataResult.success($$3) : DataResult.error(() -> $$2.apply($$3)));
   }

   public static <T> Codec<List<T>> a(Codec<List<T>> $$0) {
      return a(
         $$0, (Function<List<T>, DataResult<List<T>>>)($$0x -> $$0x.isEmpty() ? DataResult.error(() -> "List must have contents") : DataResult.success($$0x))
      );
   }

   public static <T> Codec<hk<T>> b(Codec<hk<T>> $$0) {
      return a(
         $$0,
         (Function<hk<T>, DataResult<hk<T>>>)($$0x -> $$0x.c().right().filter(List::isEmpty).isPresent()
               ? DataResult.error(() -> "List must have contents")
               : DataResult.success($$0x))
      );
   }

   public static <T> Codec<T> a(Function<Codec<T>, Codec<T>> $$0) {
      return new arg.c<>($$0);
   }

   public static <A> Codec<A> a(Supplier<Codec<A>> $$0) {
      return new arg.c<>($$1 -> $$0.get());
   }

   public static <A> MapCodec<Optional<A>> a(Codec<A> $$0, String $$1) {
      return new arg.d<>($$1, $$0);
   }

   public static <A> MapCodec<A> a(Codec<A> $$0, String $$1, A $$2) {
      return a($$0, $$1).xmap($$1x -> $$1x.orElse($$2), $$1x -> Objects.equals($$1x, $$2) ? Optional.empty() : Optional.of($$1x));
   }

   public static <E> MapCodec<E> b(final Function<DynamicOps<?>, DataResult<E>> $$0) {
      class a extends MapCodec<E> {
         public <T> RecordBuilder<T> encode(E $$0x, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
            return $$2;
         }

         public <T> DataResult<E> decode(DynamicOps<T> $$0x, MapLike<T> $$1) {
            return $$0.apply($$0);
         }

         public String toString() {
            return "ContextRetrievalCodec[" + $$0 + "]";
         }

         public <T> Stream<T> keys(DynamicOps<T> $$0x) {
            return Stream.empty();
         }
      }

      return new a();
   }

   public static <E, L extends Collection<E>, T> Function<L, DataResult<L>> c(Function<E, T> $$0) {
      return $$1 -> {
         Iterator<E> $$2 = $$1.iterator();
         if ($$2.hasNext()) {
            T $$3 = $$0.apply($$2.next());

            while ($$2.hasNext()) {
               E $$4 = $$2.next();
               T $$5 = $$0.apply($$4);
               if ($$5 != $$3) {
                  return DataResult.error(() -> "Mixed type list: element " + $$4 + " had type " + $$5 + ", but list is of type " + $$3);
               }
            }
         }

         return DataResult.success($$1, Lifecycle.stable());
      };
   }

   public static <A> Codec<A> c(final Codec<A> $$0) {
      return Codec.of($$0, new Decoder<A>() {
         public <T> DataResult<Pair<A, T>> decode(DynamicOps<T> $$0x, T $$1) {
            try {
               return $$0.decode($$0, $$1);
            } catch (Exception var4) {
               return DataResult.error(() -> "Caught exception decoding " + $$1 + ": " + var4.getMessage());
            }
         }
      });
   }

   public static Codec<TemporalAccessor> a(DateTimeFormatter $$0) {
      return Codec.STRING.comapFlatMap($$1 -> {
         try {
            return DataResult.success($$0.parse($$1));
         } catch (Exception var3) {
            return DataResult.error(var3::getMessage);
         }
      }, $$0::format);
   }

   public static MapCodec<OptionalLong> a(MapCodec<Optional<Long>> $$0) {
      return $$0.xmap(q, r);
   }

   public static Codec<String> b(int $$0, int $$1) {
      return a(
         Codec.STRING,
         $$2 -> {
            int $$3 = $$2.length();
            if ($$3 < $$0) {
               return DataResult.error(() -> "String \"" + $$2 + "\" is too short: " + $$3 + ", expected range [" + $$0 + "-" + $$1 + "]");
            } else {
               return $$3 > $$1
                  ? DataResult.error(() -> "String \"" + $$2 + "\" is too long: " + $$3 + ", expected range [" + $$0 + "-" + $$1 + "]")
                  : DataResult.success($$2);
            }
         }
      );
   }

   public static <T> Codec<T> e(Codec<T> $$0, Codec<? extends T> $$1) {
      return Codec.either($$0, $$1).xmap($$0x -> $$0x.map($$0xx -> $$0xx, $$0xx -> $$0xx), Either::left);
   }

   public static <T, U> Codec<T> a(Codec<T> $$0, Codec<U> $$1, Function<U, T> $$2) {
      return Codec.either($$0, $$1).xmap($$1x -> $$1x.map($$0xx -> $$0xx, $$2), Either::left);
   }

   public static <T> Codec<Object2BooleanMap<T>> d(Codec<T> $$0) {
      return Codec.unboundedMap($$0, Codec.BOOL).xmap(Object2BooleanOpenHashMap::new, Object2ObjectOpenHashMap::new);
   }

   public static final class b<F, S> implements Codec<Either<F, S>> {
      private final Codec<F> a;
      private final Codec<S> b;

      public b(Codec<F> $$0, Codec<S> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public <T> DataResult<Pair<Either<F, S>, T>> decode(DynamicOps<T> $$0, T $$1) {
         DataResult<Pair<Either<F, S>, T>> $$2 = this.a.decode($$0, $$1).map($$0x -> $$0x.mapFirst(Either::left));
         if ($$2.error().isEmpty()) {
            return $$2;
         } else {
            DataResult<Pair<Either<F, S>, T>> $$3 = this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(Either::right));
            return $$3.error().isEmpty() ? $$3 : $$2.apply2(($$0x, $$1x) -> $$1x, $$3);
         }
      }

      public <T> DataResult<T> a(Either<F, S> $$0, DynamicOps<T> $$1, T $$2) {
         return (DataResult<T>)$$0.map($$2x -> this.a.encode($$2x, $$1, $$2), $$2x -> this.b.encode($$2x, $$1, $$2));
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            arg.b<?, ?> $$1 = (arg.b<?, ?>)$$0;
            return Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.a, this.b);
      }

      @Override
      public String toString() {
         return "EitherCodec[" + this.a + ", " + this.b + "]";
      }
   }

   static class c<T> implements Codec<T> {
      private final Supplier<Codec<T>> a;

      c(Function<Codec<T>, Codec<T>> $$0) {
         this.a = Suppliers.memoize(() -> $$0.apply(this));
      }

      public <S> DataResult<Pair<T, S>> decode(DynamicOps<S> $$0, S $$1) {
         return this.a.get().decode($$0, $$1);
      }

      public <S> DataResult<S> encode(T $$0, DynamicOps<S> $$1, S $$2) {
         return this.a.get().encode($$0, $$1, $$2);
      }

      @Override
      public String toString() {
         return "RecursiveCodec[" + this.a + "]";
      }
   }

   static final class d<A> extends MapCodec<Optional<A>> {
      private final String a;
      private final Codec<A> b;

      public d(String $$0, Codec<A> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public <T> DataResult<Optional<A>> decode(DynamicOps<T> $$0, MapLike<T> $$1) {
         T $$2 = (T)$$1.get(this.a);
         return $$2 == null ? DataResult.success(Optional.empty()) : this.b.parse($$0, $$2).map(Optional::of);
      }

      public <T> RecordBuilder<T> a(Optional<A> $$0, DynamicOps<T> $$1, RecordBuilder<T> $$2) {
         return $$0.isPresent() ? $$2.add(this.a, this.b.encodeStart($$1, $$0.get())) : $$2;
      }

      public <T> Stream<T> keys(DynamicOps<T> $$0) {
         return Stream.of((T)$$0.createString(this.a));
      }

      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else {
            return !($$0 instanceof arg.d<?> $$1) ? false : Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b);
         }
      }

      public int hashCode() {
         return Objects.hash(this.a, this.b);
      }

      public String toString() {
         return "StrictOptionalFieldCodec[" + this.a + ": " + this.b + "]";
      }
   }

   public static record e<K, V>(Codec<K> a, Codec<V> b) implements Codec<Map<K, V>>, BaseMapCodec<K, V> {
      public <T> DataResult<Map<K, V>> decode(DynamicOps<T> $$0, MapLike<T> $$1) {
         Builder<K, V> $$2 = ImmutableMap.builder();

         for (Pair<T, T> $$3 : $$1.entries().toList()) {
            DataResult<K> $$4 = this.keyCodec().parse($$0, $$3.getFirst());
            DataResult<V> $$5 = this.elementCodec().parse($$0, $$3.getSecond());
            DataResult<Pair<K, V>> $$6 = $$4.apply2stable(Pair::of, $$5);
            if ($$6.error().isPresent()) {
               return DataResult.error(() -> {
                  PartialResult<Pair<K, V>> $$2x = (PartialResult<Pair<K, V>>)$$6.error().get();
                  String $$3x;
                  if ($$4.result().isPresent()) {
                     $$3x = "Map entry '" + $$4.result().get() + "' : " + $$2x.message();
                  } else {
                     $$3x = $$2x.message();
                  }

                  return $$3x;
               });
            }

            if (!$$6.result().isPresent()) {
               return DataResult.error(() -> "Empty or invalid map contents are not allowed");
            }

            Pair<K, V> $$7 = (Pair<K, V>)$$6.result().get();
            $$2.put($$7.getFirst(), $$7.getSecond());
         }

         Map<K, V> $$8 = $$2.build();
         return DataResult.success($$8);
      }

      public <T> DataResult<Pair<Map<K, V>, T>> decode(DynamicOps<T> $$0, T $$1) {
         return $$0.getMap($$1).setLifecycle(Lifecycle.stable()).flatMap($$1x -> this.decode($$0, $$1x)).map($$1x -> Pair.of($$1x, $$1));
      }

      public <T> DataResult<T> a(Map<K, V> $$0, DynamicOps<T> $$1, T $$2) {
         return this.encode($$0, $$1, $$1.mapBuilder()).build($$2);
      }

      @Override
      public String toString() {
         return "StrictUnboundedMapCodec[" + this.a + " -> " + this.b + "]";
      }

      public Codec<K> keyCodec() {
         return this.a;
      }

      public Codec<V> elementCodec() {
         return this.b;
      }
   }

   public static record f(aex a, boolean b) {
      @Override
      public String toString() {
         return this.c();
      }

      private String c() {
         return this.b ? "#" + this.a : this.a.toString();
      }
   }

   static record g<F, S>(Codec<F> a, Codec<S> b) implements Codec<Either<F, S>> {
      public <T> DataResult<Pair<Either<F, S>, T>> decode(DynamicOps<T> $$0, T $$1) {
         DataResult<Pair<Either<F, S>, T>> $$2 = this.a.decode($$0, $$1).map($$0x -> $$0x.mapFirst(Either::left));
         DataResult<Pair<Either<F, S>, T>> $$3 = this.b.decode($$0, $$1).map($$0x -> $$0x.mapFirst(Either::right));
         Optional<Pair<Either<F, S>, T>> $$4 = $$2.result();
         Optional<Pair<Either<F, S>, T>> $$5 = $$3.result();
         if ($$4.isPresent() && $$5.isPresent()) {
            return DataResult.error(
               () -> "Both alternatives read successfully, can not pick the correct one; first: " + $$4.get() + " second: " + $$5.get(), $$4.get()
            );
         } else if ($$4.isPresent()) {
            return $$2;
         } else {
            return $$5.isPresent() ? $$3 : $$2.apply2(($$0x, $$1x) -> $$1x, $$3);
         }
      }

      public <T> DataResult<T> a(Either<F, S> $$0, DynamicOps<T> $$1, T $$2) {
         return (DataResult<T>)$$0.map($$2x -> this.a.encode($$2x, $$1, $$2), $$2x -> this.b.encode($$2x, $$1, $$2));
      }

      @Override
      public String toString() {
         return "XorCodec[" + this.a + ", " + this.b + "]";
      }
   }
}
