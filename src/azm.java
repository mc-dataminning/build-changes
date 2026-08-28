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

public class azm implements DynamicOps<bap> {
   public static final azm a = new azm();

   private azm() {
   }

   public <U> U a(DynamicOps<U> $$0, bap $$1) {
      return (U)$$0.empty();
   }

   public bap a() {
      return bap.a;
   }

   public bap b() {
      return bap.a;
   }

   public bap c() {
      return bap.a;
   }

   public bap a(Number $$0) {
      return bap.a;
   }

   public bap a(byte $$0) {
      return bap.a;
   }

   public bap a(short $$0) {
      return bap.a;
   }

   public bap a(int $$0) {
      return bap.a;
   }

   public bap a(long $$0) {
      return bap.a;
   }

   public bap a(float $$0) {
      return bap.a;
   }

   public bap a(double $$0) {
      return bap.a;
   }

   public bap a(boolean $$0) {
      return bap.a;
   }

   public bap a(String $$0) {
      return bap.a;
   }

   public DataResult<Number> a(bap $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bap $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bap $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bap> a(bap $$0, bap $$1) {
      return DataResult.success(bap.a);
   }

   public DataResult<bap> a(bap $$0, List<bap> $$1) {
      return DataResult.success(bap.a);
   }

   public DataResult<bap> a(bap $$0, bap $$1, bap $$2) {
      return DataResult.success(bap.a);
   }

   public DataResult<bap> a(bap $$0, Map<bap, bap> $$1) {
      return DataResult.success(bap.a);
   }

   public DataResult<bap> a(bap $$0, MapLike<bap> $$1) {
      return DataResult.success(bap.a);
   }

   public DataResult<Stream<Pair<bap, bap>>> d(bap $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bap, bap>>> e(bap $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bap>> f(bap $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bap>> g(bap $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bap>>> h(bap $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bap $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bap $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bap $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bap a(Stream<Pair<bap, bap>> $$0) {
      return bap.a;
   }

   public bap a(Map<bap, bap> $$0) {
      return bap.a;
   }

   public bap b(Stream<bap> $$0) {
      return bap.a;
   }

   public bap a(ByteBuffer $$0) {
      return bap.a;
   }

   public bap a(IntStream $$0) {
      return bap.a;
   }

   public bap a(LongStream $$0) {
      return bap.a;
   }

   public bap a(bap $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bap> mapBuilder() {
      return new azm.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bap, bap> {
      public a(DynamicOps<bap> $$0) {
         super($$0);
      }

      protected bap a() {
         return bap.a;
      }

      protected bap a(bap $$0, bap $$1, bap $$2) {
         return $$2;
      }

      protected DataResult<bap> a(bap $$0, bap $$1) {
         return DataResult.success($$1);
      }
   }
}
