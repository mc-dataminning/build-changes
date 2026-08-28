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

public class azf implements DynamicOps<bai> {
   public static final azf a = new azf();

   private azf() {
   }

   public <U> U a(DynamicOps<U> $$0, bai $$1) {
      return (U)$$0.empty();
   }

   public bai a() {
      return bai.a;
   }

   public bai b() {
      return bai.a;
   }

   public bai c() {
      return bai.a;
   }

   public bai a(Number $$0) {
      return bai.a;
   }

   public bai a(byte $$0) {
      return bai.a;
   }

   public bai a(short $$0) {
      return bai.a;
   }

   public bai a(int $$0) {
      return bai.a;
   }

   public bai a(long $$0) {
      return bai.a;
   }

   public bai a(float $$0) {
      return bai.a;
   }

   public bai a(double $$0) {
      return bai.a;
   }

   public bai a(boolean $$0) {
      return bai.a;
   }

   public bai a(String $$0) {
      return bai.a;
   }

   public DataResult<Number> a(bai $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bai $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bai $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bai> a(bai $$0, bai $$1) {
      return DataResult.success(bai.a);
   }

   public DataResult<bai> a(bai $$0, List<bai> $$1) {
      return DataResult.success(bai.a);
   }

   public DataResult<bai> a(bai $$0, bai $$1, bai $$2) {
      return DataResult.success(bai.a);
   }

   public DataResult<bai> a(bai $$0, Map<bai, bai> $$1) {
      return DataResult.success(bai.a);
   }

   public DataResult<bai> a(bai $$0, MapLike<bai> $$1) {
      return DataResult.success(bai.a);
   }

   public DataResult<Stream<Pair<bai, bai>>> d(bai $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bai, bai>>> e(bai $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bai>> f(bai $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bai>> g(bai $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bai>>> h(bai $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bai $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bai $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bai $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bai a(Stream<Pair<bai, bai>> $$0) {
      return bai.a;
   }

   public bai a(Map<bai, bai> $$0) {
      return bai.a;
   }

   public bai b(Stream<bai> $$0) {
      return bai.a;
   }

   public bai a(ByteBuffer $$0) {
      return bai.a;
   }

   public bai a(IntStream $$0) {
      return bai.a;
   }

   public bai a(LongStream $$0) {
      return bai.a;
   }

   public bai a(bai $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bai> mapBuilder() {
      return new azf.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bai, bai> {
      public a(DynamicOps<bai> $$0) {
         super($$0);
      }

      protected bai a() {
         return bai.a;
      }

      protected bai a(bai $$0, bai $$1, bai $$2) {
         return $$2;
      }

      protected DataResult<bai> a(bai $$0, bai $$1) {
         return DataResult.success($$1);
      }
   }
}
