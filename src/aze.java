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

public class aze implements DynamicOps<bah> {
   public static final aze a = new aze();

   private aze() {
   }

   public <U> U a(DynamicOps<U> $$0, bah $$1) {
      return (U)$$0.empty();
   }

   public bah a() {
      return bah.a;
   }

   public bah b() {
      return bah.a;
   }

   public bah c() {
      return bah.a;
   }

   public bah a(Number $$0) {
      return bah.a;
   }

   public bah a(byte $$0) {
      return bah.a;
   }

   public bah a(short $$0) {
      return bah.a;
   }

   public bah a(int $$0) {
      return bah.a;
   }

   public bah a(long $$0) {
      return bah.a;
   }

   public bah a(float $$0) {
      return bah.a;
   }

   public bah a(double $$0) {
      return bah.a;
   }

   public bah a(boolean $$0) {
      return bah.a;
   }

   public bah a(String $$0) {
      return bah.a;
   }

   public DataResult<Number> a(bah $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bah $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bah $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bah> a(bah $$0, bah $$1) {
      return DataResult.success(bah.a);
   }

   public DataResult<bah> a(bah $$0, List<bah> $$1) {
      return DataResult.success(bah.a);
   }

   public DataResult<bah> a(bah $$0, bah $$1, bah $$2) {
      return DataResult.success(bah.a);
   }

   public DataResult<bah> a(bah $$0, Map<bah, bah> $$1) {
      return DataResult.success(bah.a);
   }

   public DataResult<bah> a(bah $$0, MapLike<bah> $$1) {
      return DataResult.success(bah.a);
   }

   public DataResult<Stream<Pair<bah, bah>>> d(bah $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bah, bah>>> e(bah $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bah>> f(bah $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bah>> g(bah $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bah>>> h(bah $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bah $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bah $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bah $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bah a(Stream<Pair<bah, bah>> $$0) {
      return bah.a;
   }

   public bah a(Map<bah, bah> $$0) {
      return bah.a;
   }

   public bah b(Stream<bah> $$0) {
      return bah.a;
   }

   public bah a(ByteBuffer $$0) {
      return bah.a;
   }

   public bah a(IntStream $$0) {
      return bah.a;
   }

   public bah a(LongStream $$0) {
      return bah.a;
   }

   public bah a(bah $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bah> mapBuilder() {
      return new aze.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bah, bah> {
      public a(DynamicOps<bah> $$0) {
         super($$0);
      }

      protected bah a() {
         return bah.a;
      }

      protected bah a(bah $$0, bah $$1, bah $$2) {
         return $$2;
      }

      protected DataResult<bah> a(bah $$0, bah $$1) {
         return DataResult.success($$1);
      }
   }
}
