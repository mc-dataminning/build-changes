import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.RecordBuilder.AbstractUniversalBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class azp implements DynamicOps<HashCode> {
   private static final byte d = 1;
   private static final byte e = 2;
   private static final byte f = 3;
   private static final byte g = 4;
   private static final byte h = 5;
   private static final byte i = 6;
   private static final byte j = 7;
   private static final byte k = 8;
   private static final byte l = 9;
   private static final byte m = 10;
   private static final byte n = 11;
   private static final byte o = 12;
   private static final byte p = 13;
   private static final byte q = 14;
   private static final byte r = 15;
   private static final byte s = 16;
   private static final byte t = 17;
   private static final byte u = 18;
   private static final byte v = 19;
   private static final byte[] w = new byte[]{1};
   private static final byte[] x = new byte[]{13, 0};
   private static final byte[] y = new byte[]{13, 1};
   public static final byte[] a = new byte[]{2, 3};
   public static final byte[] b = new byte[]{4, 5};
   private static final DataResult<Object> z = DataResult.error(() -> "Unsupported operation");
   private static final Comparator<HashCode> A = Comparator.comparingLong(HashCode::padToLong);
   private static final Comparator<Entry<HashCode, HashCode>> B = Entry.<HashCode, HashCode>comparingByKey(A).thenComparing(Entry.comparingByValue(A));
   private static final Comparator<Pair<HashCode, HashCode>> C = Comparator.<Pair<HashCode, HashCode>, HashCode>comparing(Pair::getFirst, A)
      .thenComparing(Pair::getSecond, A);
   public static final azp c = new azp(Hashing.crc32c());
   final HashFunction D;
   final HashCode E;
   private final HashCode F;
   private final HashCode G;
   private final HashCode H;
   private final HashCode I;

   public azp(HashFunction $$0) {
      this.D = $$0;
      this.E = $$0.hashBytes(w);
      this.F = $$0.hashBytes(a);
      this.G = $$0.hashBytes(b);
      this.I = $$0.hashBytes(x);
      this.H = $$0.hashBytes(y);
   }

   public HashCode a() {
      return this.E;
   }

   public HashCode b() {
      return this.F;
   }

   public HashCode c() {
      return this.G;
   }

   public HashCode a(Number $$0) {
      Objects.requireNonNull($$0);

      return switch ($$0) {
         case Byte $$1 -> this.a($$1.byteValue());
         case Short $$2 -> this.a($$2.shortValue());
         case Integer $$3 -> this.a($$3.intValue());
         case Long $$4 -> this.a($$4.longValue());
         case Double $$5 -> this.a($$5.doubleValue());
         case Float $$6 -> this.a($$6.floatValue());
         default -> this.a($$0.doubleValue());
      };
   }

   public HashCode a(byte $$0) {
      return this.D.newHasher(2).putByte((byte)6).putByte($$0).hash();
   }

   public HashCode a(short $$0) {
      return this.D.newHasher(3).putByte((byte)7).putShort($$0).hash();
   }

   public HashCode a(int $$0) {
      return this.D.newHasher(5).putByte((byte)8).putInt($$0).hash();
   }

   public HashCode a(long $$0) {
      return this.D.newHasher(9).putByte((byte)9).putLong($$0).hash();
   }

   public HashCode a(float $$0) {
      return this.D.newHasher(5).putByte((byte)10).putFloat($$0).hash();
   }

   public HashCode a(double $$0) {
      return this.D.newHasher(9).putByte((byte)11).putDouble($$0).hash();
   }

   public HashCode a(String $$0) {
      return this.D.newHasher().putByte((byte)12).putInt($$0.length()).putUnencodedChars($$0).hash();
   }

   public HashCode a(boolean $$0) {
      return $$0 ? this.H : this.I;
   }

   private static Hasher a(Hasher $$0, Map<HashCode, HashCode> $$1) {
      $$0.putByte((byte)2);
      $$1.entrySet().stream().sorted(B).forEach($$1x -> $$0.putBytes(((HashCode)$$1x.getKey()).asBytes()).putBytes(((HashCode)$$1x.getValue()).asBytes()));
      $$0.putByte((byte)3);
      return $$0;
   }

   static Hasher a(Hasher $$0, Stream<Pair<HashCode, HashCode>> $$1) {
      $$0.putByte((byte)2);
      $$1.sorted(C).forEach($$1x -> $$0.putBytes(((HashCode)$$1x.getFirst()).asBytes()).putBytes(((HashCode)$$1x.getSecond()).asBytes()));
      $$0.putByte((byte)3);
      return $$0;
   }

   public HashCode a(Stream<Pair<HashCode, HashCode>> $$0) {
      return a(this.D.newHasher(), $$0).hash();
   }

   public HashCode a(Map<HashCode, HashCode> $$0) {
      return a(this.D.newHasher(), $$0).hash();
   }

   public HashCode b(Stream<HashCode> $$0) {
      Hasher $$1 = this.D.newHasher();
      $$1.putByte((byte)4);
      $$0.forEach($$1x -> $$1.putBytes($$1x.asBytes()));
      $$1.putByte((byte)5);
      return $$1.hash();
   }

   public HashCode a(ByteBuffer $$0) {
      Hasher $$1 = this.D.newHasher();
      $$1.putByte((byte)14);
      $$1.putBytes($$0);
      $$1.putByte((byte)15);
      return $$1.hash();
   }

   public HashCode a(IntStream $$0) {
      Hasher $$1 = this.D.newHasher();
      $$1.putByte((byte)16);
      $$0.forEach($$1::putInt);
      $$1.putByte((byte)17);
      return $$1.hash();
   }

   public HashCode a(LongStream $$0) {
      Hasher $$1 = this.D.newHasher();
      $$1.putByte((byte)18);
      $$0.forEach($$1::putLong);
      $$1.putByte((byte)19);
      return $$1.hash();
   }

   public HashCode a(HashCode $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<HashCode> mapBuilder() {
      return new azp.b();
   }

   public ListBuilder<HashCode> listBuilder() {
      return new azp.a();
   }

   @Override
   public String toString() {
      return "Hash " + this.D;
   }

   public <U> U a(DynamicOps<U> $$0, HashCode $$1) {
      throw new UnsupportedOperationException("Can't convert from this type");
   }

   public Number a(HashCode $$0, Number $$1) {
      return $$1;
   }

   public HashCode a(HashCode $$0, String $$1, HashCode $$2) {
      return $$0;
   }

   public HashCode a(HashCode $$0, String $$1, Function<HashCode, HashCode> $$2) {
      return $$0;
   }

   public HashCode a(HashCode $$0, HashCode $$1, Function<HashCode, HashCode> $$2) {
      return $$0;
   }

   private static <T> DataResult<T> d() {
      return (DataResult<T>)z;
   }

   public DataResult<HashCode> b(HashCode $$0, String $$1) {
      return d();
   }

   public DataResult<HashCode> a(HashCode $$0, HashCode $$1) {
      return d();
   }

   public DataResult<Number> a(HashCode $$0) {
      return d();
   }

   public DataResult<Boolean> b(HashCode $$0) {
      return d();
   }

   public DataResult<String> c(HashCode $$0) {
      return d();
   }

   public DataResult<HashCode> b(HashCode $$0, HashCode $$1) {
      return d();
   }

   public DataResult<HashCode> a(HashCode $$0, List<HashCode> $$1) {
      return d();
   }

   public DataResult<HashCode> a(HashCode $$0, HashCode $$1, HashCode $$2) {
      return d();
   }

   public DataResult<HashCode> a(HashCode $$0, Map<HashCode, HashCode> $$1) {
      return d();
   }

   public DataResult<HashCode> a(HashCode $$0, MapLike<HashCode> $$1) {
      return d();
   }

   public DataResult<Stream<Pair<HashCode, HashCode>>> d(HashCode $$0) {
      return d();
   }

   public DataResult<Consumer<BiConsumer<HashCode, HashCode>>> e(HashCode $$0) {
      return d();
   }

   public DataResult<Stream<HashCode>> f(HashCode $$0) {
      return d();
   }

   public DataResult<Consumer<Consumer<HashCode>>> g(HashCode $$0) {
      return d();
   }

   public DataResult<MapLike<HashCode>> h(HashCode $$0) {
      return d();
   }

   public DataResult<ByteBuffer> i(HashCode $$0) {
      return d();
   }

   public DataResult<IntStream> j(HashCode $$0) {
      return d();
   }

   public DataResult<LongStream> k(HashCode $$0) {
      return d();
   }

   class a extends ayj<HashCode, Hasher> {
      public a() {
         super(azp.this);
      }

      protected Hasher b() {
         return azp.this.D.newHasher().putByte((byte)4);
      }

      protected Hasher a(Hasher $$0, HashCode $$1) {
         return $$0.putBytes($$1.asBytes());
      }

      protected DataResult<HashCode> b(Hasher $$0, HashCode $$1) {
         assert $$1.equals(azp.this.E);

         $$0.putByte((byte)5);
         return DataResult.success($$0.hash());
      }
   }

   final class b extends AbstractUniversalBuilder<HashCode, List<Pair<HashCode, HashCode>>> {
      public b() {
         super(azp.this);
      }

      protected List<Pair<HashCode, HashCode>> a() {
         return new ArrayList<>();
      }

      protected List<Pair<HashCode, HashCode>> a(HashCode $$0, HashCode $$1, List<Pair<HashCode, HashCode>> $$2) {
         $$2.add(Pair.of($$0, $$1));
         return $$2;
      }

      protected DataResult<HashCode> a(List<Pair<HashCode, HashCode>> $$0, HashCode $$1) {
         assert $$1.equals(azp.this.a());

         return DataResult.success(azp.a(azp.this.D.newHasher(), $$0.stream()).hash());
      }
   }
}
