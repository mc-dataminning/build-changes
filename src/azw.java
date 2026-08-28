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

public class azw implements DynamicOps<bba> {
   public static final azw a = new azw();

   private azw() {
   }

   public <U> U a(DynamicOps<U> $$0, bba $$1) {
      return (U)$$0.empty();
   }

   public bba a() {
      return bba.a;
   }

   public bba b() {
      return bba.a;
   }

   public bba c() {
      return bba.a;
   }

   public bba a(Number $$0) {
      return bba.a;
   }

   public bba a(byte $$0) {
      return bba.a;
   }

   public bba a(short $$0) {
      return bba.a;
   }

   public bba a(int $$0) {
      return bba.a;
   }

   public bba a(long $$0) {
      return bba.a;
   }

   public bba a(float $$0) {
      return bba.a;
   }

   public bba a(double $$0) {
      return bba.a;
   }

   public bba a(boolean $$0) {
      return bba.a;
   }

   public bba a(String $$0) {
      return bba.a;
   }

   public DataResult<Number> a(bba $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bba $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bba $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bba> a(bba $$0, bba $$1) {
      return DataResult.success(bba.a);
   }

   public DataResult<bba> a(bba $$0, List<bba> $$1) {
      return DataResult.success(bba.a);
   }

   public DataResult<bba> a(bba $$0, bba $$1, bba $$2) {
      return DataResult.success(bba.a);
   }

   public DataResult<bba> a(bba $$0, Map<bba, bba> $$1) {
      return DataResult.success(bba.a);
   }

   public DataResult<bba> a(bba $$0, MapLike<bba> $$1) {
      return DataResult.success(bba.a);
   }

   public DataResult<Stream<Pair<bba, bba>>> d(bba $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bba, bba>>> e(bba $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bba>> f(bba $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bba>> g(bba $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bba>>> h(bba $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bba $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bba $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bba $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bba a(Stream<Pair<bba, bba>> $$0) {
      return bba.a;
   }

   public bba a(Map<bba, bba> $$0) {
      return bba.a;
   }

   public bba b(Stream<bba> $$0) {
      return bba.a;
   }

   public bba a(ByteBuffer $$0) {
      return bba.a;
   }

   public bba a(IntStream $$0) {
      return bba.a;
   }

   public bba a(LongStream $$0) {
      return bba.a;
   }

   public bba a(bba $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bba> mapBuilder() {
      return new azw.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bba, bba> {
      public a(DynamicOps<bba> $$0) {
         super($$0);
      }

      protected bba a() {
         return bba.a;
      }

      protected bba a(bba $$0, bba $$1, bba $$2) {
         return $$2;
      }

      protected DataResult<bba> a(bba $$0, bba $$1) {
         return DataResult.success($$1);
      }
   }
}
