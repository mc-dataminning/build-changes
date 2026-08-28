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

public class azl implements DynamicOps<bao> {
   public static final azl a = new azl();

   private azl() {
   }

   public <U> U a(DynamicOps<U> $$0, bao $$1) {
      return (U)$$0.empty();
   }

   public bao a() {
      return bao.a;
   }

   public bao b() {
      return bao.a;
   }

   public bao c() {
      return bao.a;
   }

   public bao a(Number $$0) {
      return bao.a;
   }

   public bao a(byte $$0) {
      return bao.a;
   }

   public bao a(short $$0) {
      return bao.a;
   }

   public bao a(int $$0) {
      return bao.a;
   }

   public bao a(long $$0) {
      return bao.a;
   }

   public bao a(float $$0) {
      return bao.a;
   }

   public bao a(double $$0) {
      return bao.a;
   }

   public bao a(boolean $$0) {
      return bao.a;
   }

   public bao a(String $$0) {
      return bao.a;
   }

   public DataResult<Number> a(bao $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bao $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bao $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bao> a(bao $$0, bao $$1) {
      return DataResult.success(bao.a);
   }

   public DataResult<bao> a(bao $$0, List<bao> $$1) {
      return DataResult.success(bao.a);
   }

   public DataResult<bao> a(bao $$0, bao $$1, bao $$2) {
      return DataResult.success(bao.a);
   }

   public DataResult<bao> a(bao $$0, Map<bao, bao> $$1) {
      return DataResult.success(bao.a);
   }

   public DataResult<bao> a(bao $$0, MapLike<bao> $$1) {
      return DataResult.success(bao.a);
   }

   public DataResult<Stream<Pair<bao, bao>>> d(bao $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bao, bao>>> e(bao $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bao>> f(bao $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bao>> g(bao $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bao>>> h(bao $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bao $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bao $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bao $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bao a(Stream<Pair<bao, bao>> $$0) {
      return bao.a;
   }

   public bao a(Map<bao, bao> $$0) {
      return bao.a;
   }

   public bao b(Stream<bao> $$0) {
      return bao.a;
   }

   public bao a(ByteBuffer $$0) {
      return bao.a;
   }

   public bao a(IntStream $$0) {
      return bao.a;
   }

   public bao a(LongStream $$0) {
      return bao.a;
   }

   public bao a(bao $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bao> mapBuilder() {
      return new azl.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bao, bao> {
      public a(DynamicOps<bao> $$0) {
         super($$0);
      }

      protected bao a() {
         return bao.a;
      }

      protected bao a(bao $$0, bao $$1, bao $$2) {
         return $$2;
      }

      protected DataResult<bao> a(bao $$0, bao $$1) {
         return DataResult.success($$1);
      }
   }
}
