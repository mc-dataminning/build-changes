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

public class azb implements DynamicOps<bac> {
   public static final azb a = new azb();

   private azb() {
   }

   public <U> U a(DynamicOps<U> $$0, bac $$1) {
      return (U)$$0.empty();
   }

   public bac a() {
      return bac.a;
   }

   public bac b() {
      return bac.a;
   }

   public bac c() {
      return bac.a;
   }

   public bac a(Number $$0) {
      return bac.a;
   }

   public bac a(byte $$0) {
      return bac.a;
   }

   public bac a(short $$0) {
      return bac.a;
   }

   public bac a(int $$0) {
      return bac.a;
   }

   public bac a(long $$0) {
      return bac.a;
   }

   public bac a(float $$0) {
      return bac.a;
   }

   public bac a(double $$0) {
      return bac.a;
   }

   public bac a(boolean $$0) {
      return bac.a;
   }

   public bac a(String $$0) {
      return bac.a;
   }

   public DataResult<Number> a(bac $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bac $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bac $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bac> a(bac $$0, bac $$1) {
      return DataResult.success(bac.a);
   }

   public DataResult<bac> a(bac $$0, List<bac> $$1) {
      return DataResult.success(bac.a);
   }

   public DataResult<bac> a(bac $$0, bac $$1, bac $$2) {
      return DataResult.success(bac.a);
   }

   public DataResult<bac> a(bac $$0, Map<bac, bac> $$1) {
      return DataResult.success(bac.a);
   }

   public DataResult<bac> a(bac $$0, MapLike<bac> $$1) {
      return DataResult.success(bac.a);
   }

   public DataResult<Stream<Pair<bac, bac>>> d(bac $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bac, bac>>> e(bac $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bac>> f(bac $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bac>> g(bac $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bac>>> h(bac $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bac $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bac $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bac $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bac a(Stream<Pair<bac, bac>> $$0) {
      return bac.a;
   }

   public bac a(Map<bac, bac> $$0) {
      return bac.a;
   }

   public bac b(Stream<bac> $$0) {
      return bac.a;
   }

   public bac a(ByteBuffer $$0) {
      return bac.a;
   }

   public bac a(IntStream $$0) {
      return bac.a;
   }

   public bac a(LongStream $$0) {
      return bac.a;
   }

   public bac a(bac $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bac> mapBuilder() {
      return new azb.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bac, bac> {
      public a(DynamicOps<bac> $$0) {
         super($$0);
      }

      protected bac a() {
         return bac.a;
      }

      protected bac a(bac $$0, bac $$1, bac $$2) {
         return $$2;
      }

      protected DataResult<bac> a(bac $$0, bac $$1) {
         return DataResult.success($$1);
      }
   }
}
