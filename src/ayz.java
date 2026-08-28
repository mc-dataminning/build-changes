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

public class ayz implements DynamicOps<baa> {
   public static final ayz a = new ayz();

   private ayz() {
   }

   public <U> U a(DynamicOps<U> $$0, baa $$1) {
      return (U)$$0.empty();
   }

   public baa a() {
      return baa.a;
   }

   public baa b() {
      return baa.a;
   }

   public baa c() {
      return baa.a;
   }

   public baa a(Number $$0) {
      return baa.a;
   }

   public baa a(byte $$0) {
      return baa.a;
   }

   public baa a(short $$0) {
      return baa.a;
   }

   public baa a(int $$0) {
      return baa.a;
   }

   public baa a(long $$0) {
      return baa.a;
   }

   public baa a(float $$0) {
      return baa.a;
   }

   public baa a(double $$0) {
      return baa.a;
   }

   public baa a(boolean $$0) {
      return baa.a;
   }

   public baa a(String $$0) {
      return baa.a;
   }

   public DataResult<Number> a(baa $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(baa $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(baa $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<baa> a(baa $$0, baa $$1) {
      return DataResult.success(baa.a);
   }

   public DataResult<baa> a(baa $$0, List<baa> $$1) {
      return DataResult.success(baa.a);
   }

   public DataResult<baa> a(baa $$0, baa $$1, baa $$2) {
      return DataResult.success(baa.a);
   }

   public DataResult<baa> a(baa $$0, Map<baa, baa> $$1) {
      return DataResult.success(baa.a);
   }

   public DataResult<baa> a(baa $$0, MapLike<baa> $$1) {
      return DataResult.success(baa.a);
   }

   public DataResult<Stream<Pair<baa, baa>>> d(baa $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<baa, baa>>> e(baa $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<baa>> f(baa $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<baa>> g(baa $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<baa>>> h(baa $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(baa $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(baa $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(baa $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public baa a(Stream<Pair<baa, baa>> $$0) {
      return baa.a;
   }

   public baa a(Map<baa, baa> $$0) {
      return baa.a;
   }

   public baa b(Stream<baa> $$0) {
      return baa.a;
   }

   public baa a(ByteBuffer $$0) {
      return baa.a;
   }

   public baa a(IntStream $$0) {
      return baa.a;
   }

   public baa a(LongStream $$0) {
      return baa.a;
   }

   public baa a(baa $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<baa> mapBuilder() {
      return new ayz.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<baa, baa> {
      public a(DynamicOps<baa> $$0) {
         super($$0);
      }

      protected baa a() {
         return baa.a;
      }

      protected baa a(baa $$0, baa $$1, baa $$2) {
         return $$2;
      }

      protected DataResult<baa> a(baa $$0, baa $$1) {
         return DataResult.success($$1);
      }
   }
}
