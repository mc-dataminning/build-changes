import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import com.mojang.serialization.RecordBuilder.AbstractUniversalBuilder;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class bag implements DynamicOps<bbk> {
   public static final bag a = new bag();

   private bag() {
   }

   public <U> U a(DynamicOps<U> $$0, bbk $$1) {
      return (U)$$0.empty();
   }

   public bbk a() {
      return bbk.a;
   }

   public bbk b() {
      return bbk.a;
   }

   public bbk c() {
      return bbk.a;
   }

   public bbk a(Number $$0) {
      return bbk.a;
   }

   public bbk a(byte $$0) {
      return bbk.a;
   }

   public bbk a(short $$0) {
      return bbk.a;
   }

   public bbk a(int $$0) {
      return bbk.a;
   }

   public bbk a(long $$0) {
      return bbk.a;
   }

   public bbk a(float $$0) {
      return bbk.a;
   }

   public bbk a(double $$0) {
      return bbk.a;
   }

   public bbk a(boolean $$0) {
      return bbk.a;
   }

   public bbk a(String $$0) {
      return bbk.a;
   }

   public DataResult<Number> a(bbk $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bbk $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bbk $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bbk> a(bbk $$0, bbk $$1) {
      return DataResult.success(bbk.a);
   }

   public DataResult<bbk> a(bbk $$0, List<bbk> $$1) {
      return DataResult.success(bbk.a);
   }

   public DataResult<bbk> a(bbk $$0, bbk $$1, bbk $$2) {
      return DataResult.success(bbk.a);
   }

   public DataResult<bbk> a(bbk $$0, Map<bbk, bbk> $$1) {
      return DataResult.success(bbk.a);
   }

   public DataResult<bbk> a(bbk $$0, MapLike<bbk> $$1) {
      return DataResult.success(bbk.a);
   }

   public DataResult<Stream<Pair<bbk, bbk>>> d(bbk $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bbk, bbk>>> e(bbk $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bbk>> f(bbk $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bbk>> g(bbk $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bbk>>> h(bbk $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bbk $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bbk $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bbk $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bbk a(Stream<Pair<bbk, bbk>> $$0) {
      return bbk.a;
   }

   public bbk a(Map<bbk, bbk> $$0) {
      return bbk.a;
   }

   public bbk b(Stream<bbk> $$0) {
      return bbk.a;
   }

   public bbk a(ByteBuffer $$0) {
      return bbk.a;
   }

   public bbk a(IntStream $$0) {
      return bbk.a;
   }

   public bbk a(LongStream $$0) {
      return bbk.a;
   }

   public bbk a(bbk $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bbk> mapBuilder() {
      return new bag.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bbk, bbk> {
      public a(DynamicOps<bbk> $$0) {
         super($$0);
      }

      protected bbk a() {
         return bbk.a;
      }

      protected bbk a(bbk $$0, bbk $$1, bbk $$2) {
         return $$2;
      }

      protected DataResult<bbk> a(bbk $$0, bbk $$1) {
         return DataResult.success($$1);
      }
   }
}
