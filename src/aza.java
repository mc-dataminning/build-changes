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

public class aza implements DynamicOps<bae> {
   public static final aza a = new aza();

   private aza() {
   }

   public <U> U a(DynamicOps<U> $$0, bae $$1) {
      return (U)$$0.empty();
   }

   public bae a() {
      return bae.a;
   }

   public bae b() {
      return bae.a;
   }

   public bae c() {
      return bae.a;
   }

   public bae a(Number $$0) {
      return bae.a;
   }

   public bae a(byte $$0) {
      return bae.a;
   }

   public bae a(short $$0) {
      return bae.a;
   }

   public bae a(int $$0) {
      return bae.a;
   }

   public bae a(long $$0) {
      return bae.a;
   }

   public bae a(float $$0) {
      return bae.a;
   }

   public bae a(double $$0) {
      return bae.a;
   }

   public bae a(boolean $$0) {
      return bae.a;
   }

   public bae a(String $$0) {
      return bae.a;
   }

   public DataResult<Number> a(bae $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bae $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bae $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bae> a(bae $$0, bae $$1) {
      return DataResult.success(bae.a);
   }

   public DataResult<bae> a(bae $$0, List<bae> $$1) {
      return DataResult.success(bae.a);
   }

   public DataResult<bae> a(bae $$0, bae $$1, bae $$2) {
      return DataResult.success(bae.a);
   }

   public DataResult<bae> a(bae $$0, Map<bae, bae> $$1) {
      return DataResult.success(bae.a);
   }

   public DataResult<bae> a(bae $$0, MapLike<bae> $$1) {
      return DataResult.success(bae.a);
   }

   public DataResult<Stream<Pair<bae, bae>>> d(bae $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bae, bae>>> e(bae $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bae>> f(bae $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bae>> g(bae $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bae>>> h(bae $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bae $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bae $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bae $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bae a(Stream<Pair<bae, bae>> $$0) {
      return bae.a;
   }

   public bae a(Map<bae, bae> $$0) {
      return bae.a;
   }

   public bae b(Stream<bae> $$0) {
      return bae.a;
   }

   public bae a(ByteBuffer $$0) {
      return bae.a;
   }

   public bae a(IntStream $$0) {
      return bae.a;
   }

   public bae a(LongStream $$0) {
      return bae.a;
   }

   public bae a(bae $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bae> mapBuilder() {
      return new aza.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bae, bae> {
      public a(DynamicOps<bae> $$0) {
         super($$0);
      }

      protected bae a() {
         return bae.a;
      }

      protected bae a(bae $$0, bae $$1, bae $$2) {
         return $$2;
      }

      protected DataResult<bae> a(bae $$0, bae $$1) {
         return DataResult.success($$1);
      }
   }
}
