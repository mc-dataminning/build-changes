import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.RecordBuilder.AbstractUniversalBuilder;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class axs implements DynamicOps<Object> {
   public static final axs a = new axs();

   private axs() {
   }

   public Object empty() {
      return null;
   }

   public Object emptyMap() {
      return Map.of();
   }

   public Object emptyList() {
      return List.of();
   }

   public <U> U convertTo(DynamicOps<U> $$0, Object $$1) {
      if ($$1 == null) {
         return (U)$$0.empty();
      } else if ($$1 instanceof Map) {
         return (U)this.convertMap($$0, $$1);
      } else if ($$1 instanceof ByteList $$2) {
         return (U)$$0.createByteList(ByteBuffer.wrap($$2.toByteArray()));
      } else if ($$1 instanceof IntList $$3) {
         return (U)$$0.createIntList($$3.intStream());
      } else if ($$1 instanceof LongList $$4) {
         return (U)$$0.createLongList($$4.longStream());
      } else if ($$1 instanceof List) {
         return (U)this.convertList($$0, $$1);
      } else if ($$1 instanceof String $$5) {
         return (U)$$0.createString($$5);
      } else if ($$1 instanceof Boolean $$6) {
         return (U)$$0.createBoolean($$6);
      } else if ($$1 instanceof Byte $$7) {
         return (U)$$0.createByte($$7);
      } else if ($$1 instanceof Short $$8) {
         return (U)$$0.createShort($$8);
      } else if ($$1 instanceof Integer $$9) {
         return (U)$$0.createInt($$9);
      } else if ($$1 instanceof Long $$10) {
         return (U)$$0.createLong($$10);
      } else if ($$1 instanceof Float $$11) {
         return (U)$$0.createFloat($$11);
      } else if ($$1 instanceof Double $$12) {
         return (U)$$0.createDouble($$12);
      } else if ($$1 instanceof Number $$13) {
         return (U)$$0.createNumeric($$13);
      } else {
         throw new IllegalStateException("Don't know how to convert " + $$1);
      }
   }

   public DataResult<Number> getNumberValue(Object $$0) {
      return $$0 instanceof Number $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a number: " + $$0);
   }

   public Object createNumeric(Number $$0) {
      return $$0;
   }

   public Object createByte(byte $$0) {
      return $$0;
   }

   public Object createShort(short $$0) {
      return $$0;
   }

   public Object createInt(int $$0) {
      return $$0;
   }

   public Object createLong(long $$0) {
      return $$0;
   }

   public Object createFloat(float $$0) {
      return $$0;
   }

   public Object createDouble(double $$0) {
      return $$0;
   }

   public DataResult<Boolean> getBooleanValue(Object $$0) {
      return $$0 instanceof Boolean $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a boolean: " + $$0);
   }

   public Object createBoolean(boolean $$0) {
      return $$0;
   }

   public DataResult<String> getStringValue(Object $$0) {
      return $$0 instanceof String $$1 ? DataResult.success($$1) : DataResult.error(() -> "Not a string: " + $$0);
   }

   public Object createString(String $$0) {
      return $$0;
   }

   public DataResult<Object> mergeToList(Object $$0, Object $$1) {
      if ($$0 == this.empty()) {
         return DataResult.success(List.of($$1));
      } else if ($$0 instanceof List<?> $$2) {
         return $$2.isEmpty() ? DataResult.success(List.of($$1)) : DataResult.success(ImmutableList.builder().addAll($$2).add($$1).build());
      } else {
         return DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<Object> mergeToList(Object $$0, List<Object> $$1) {
      if ($$0 == this.empty()) {
         return DataResult.success($$1);
      } else if ($$0 instanceof List<?> $$2) {
         return $$2.isEmpty() ? DataResult.success($$1) : DataResult.success(ImmutableList.builder().addAll($$2).addAll($$1).build());
      } else {
         return DataResult.error(() -> "Not a list: " + $$0);
      }
   }

   public DataResult<Object> mergeToMap(Object $$0, Object $$1, Object $$2) {
      if ($$0 == this.empty()) {
         return DataResult.success(Map.of($$1, $$2));
      } else if ($$0 instanceof Map<?, ?> $$3) {
         if ($$3.isEmpty()) {
            return DataResult.success(Map.of($$1, $$2));
         } else {
            Builder<Object, Object> $$4 = ImmutableMap.builderWithExpectedSize($$3.size() + 1);
            $$4.putAll($$3);
            $$4.put($$1, $$2);
            return DataResult.success($$4.buildKeepingLast());
         }
      } else {
         return DataResult.error(() -> "Not a map: " + $$0);
      }
   }

   public DataResult<Object> mergeToMap(Object $$0, Map<Object, Object> $$1) {
      if ($$0 == this.empty()) {
         return DataResult.success($$1);
      } else if ($$0 instanceof Map<?, ?> $$2) {
         if ($$2.isEmpty()) {
            return DataResult.success($$1);
         } else {
            Builder<Object, Object> $$3 = ImmutableMap.builderWithExpectedSize($$2.size() + $$1.size());
            $$3.putAll($$2);
            $$3.putAll($$1);
            return DataResult.success($$3.buildKeepingLast());
         }
      } else {
         return DataResult.error(() -> "Not a map: " + $$0);
      }
   }

   private static Map<Object, Object> a(MapLike<Object> $$0) {
      return $$0.entries().collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
   }

   public DataResult<Object> mergeToMap(Object $$0, MapLike<Object> $$1) {
      if ($$0 == this.empty()) {
         return DataResult.success(a($$1));
      } else if ($$0 instanceof Map<?, ?> $$2) {
         if ($$2.isEmpty()) {
            return DataResult.success(a($$1));
         } else {
            Builder<Object, Object> $$3 = ImmutableMap.builderWithExpectedSize($$2.size());
            $$3.putAll($$2);
            $$1.entries().forEach($$1x -> $$3.put($$1x.getFirst(), $$1x.getSecond()));
            return DataResult.success($$3.buildKeepingLast());
         }
      } else {
         return DataResult.error(() -> "Not a map: " + $$0);
      }
   }

   static Stream<Pair<Object, Object>> a(Map<?, ?> $$0) {
      return $$0.entrySet().stream().map($$0x -> Pair.of($$0x.getKey(), $$0x.getValue()));
   }

   public DataResult<Stream<Pair<Object, Object>>> getMapValues(Object $$0) {
      return $$0 instanceof Map<?, ?> $$1 ? DataResult.success(a($$1)) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public DataResult<Consumer<BiConsumer<Object, Object>>> getMapEntries(Object $$0) {
      return $$0 instanceof Map<?, ?> $$1 ? DataResult.success($$1::forEach) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public Object createMap(Stream<Pair<Object, Object>> $$0) {
      return $$0.collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
   }

   public DataResult<MapLike<Object>> getMap(Object $$0) {
      return $$0 instanceof Map<?, ?> $$1 ? DataResult.success(new MapLike<Object>() {
         @Nullable
         public Object get(Object $$0) {
            return $$1.get($$0);
         }

         @Nullable
         public Object get(String $$0) {
            return $$1.get($$0);
         }

         public Stream<Pair<Object, Object>> entries() {
            return axs.a($$1);
         }

         @Override
         public String toString() {
            return "MapLike[" + $$1 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + $$0);
   }

   public Object createMap(Map<Object, Object> $$0) {
      return $$0;
   }

   public DataResult<Stream<Object>> getStream(Object $$0) {
      return $$0 instanceof List<?> $$1 ? DataResult.success($$1.stream().map($$0x -> $$0x)) : DataResult.error(() -> "Not an list: " + $$0);
   }

   public DataResult<Consumer<Consumer<Object>>> getList(Object $$0) {
      return $$0 instanceof List<?> $$1 ? DataResult.success($$1::forEach) : DataResult.error(() -> "Not an list: " + $$0);
   }

   public Object createList(Stream<Object> $$0) {
      return $$0.toList();
   }

   public DataResult<ByteBuffer> getByteBuffer(Object $$0) {
      return $$0 instanceof ByteList $$1 ? DataResult.success(ByteBuffer.wrap($$1.toByteArray())) : DataResult.error(() -> "Not a byte list: " + $$0);
   }

   public Object createByteList(ByteBuffer $$0) {
      ByteBuffer $$1 = $$0.duplicate().clear();
      ByteArrayList $$2 = new ByteArrayList();
      $$2.size($$1.capacity());
      $$1.get(0, $$2.elements(), 0, $$2.size());
      return $$2;
   }

   public DataResult<IntStream> getIntStream(Object $$0) {
      return $$0 instanceof IntList $$1 ? DataResult.success($$1.intStream()) : DataResult.error(() -> "Not an int list: " + $$0);
   }

   public Object createIntList(IntStream $$0) {
      return IntArrayList.toList($$0);
   }

   public DataResult<LongStream> getLongStream(Object $$0) {
      return $$0 instanceof LongList $$1 ? DataResult.success($$1.longStream()) : DataResult.error(() -> "Not a long list: " + $$0);
   }

   public Object createLongList(LongStream $$0) {
      return LongArrayList.toList($$0);
   }

   public Object remove(Object $$0, String $$1) {
      if ($$0 instanceof Map<?, ?> $$2) {
         Map<Object, Object> $$3 = new LinkedHashMap<>((Map<? extends Object, ? extends Object>)$$2);
         $$3.remove($$1);
         return Map.copyOf($$3);
      } else {
         return $$0;
      }
   }

   public RecordBuilder<Object> mapBuilder() {
      return new axs.a<Object>(this);
   }

   @Override
   public String toString() {
      return "Java";
   }

   static final class a<T> extends AbstractUniversalBuilder<T, Builder<T, T>> {
      public a(DynamicOps<T> $$0) {
         super($$0);
      }

      protected Builder<T, T> a() {
         return ImmutableMap.builder();
      }

      protected Builder<T, T> a(T $$0, T $$1, Builder<T, T> $$2) {
         return $$2.put($$0, $$1);
      }

      protected DataResult<T> a(Builder<T, T> $$0, T $$1) {
         ImmutableMap<T, T> $$2;
         try {
            $$2 = $$0.buildOrThrow();
         } catch (IllegalArgumentException var5) {
            return DataResult.error(() -> "Can't build map: " + var5.getMessage());
         }

         return this.ops().mergeToMap($$1, $$2);
      }
   }
}
