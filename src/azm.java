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

public class azm implements DynamicOps<baq> {
   public static final azm a = new azm();

   private azm() {
   }

   public <U> U a(DynamicOps<U> $$0, baq $$1) {
      return (U)$$0.empty();
   }

   public baq a() {
      return baq.a;
   }

   public baq b() {
      return baq.a;
   }

   public baq c() {
      return baq.a;
   }

   public baq a(Number $$0) {
      return baq.a;
   }

   public baq a(byte $$0) {
      return baq.a;
   }

   public baq a(short $$0) {
      return baq.a;
   }

   public baq a(int $$0) {
      return baq.a;
   }

   public baq a(long $$0) {
      return baq.a;
   }

   public baq a(float $$0) {
      return baq.a;
   }

   public baq a(double $$0) {
      return baq.a;
   }

   public baq a(boolean $$0) {
      return baq.a;
   }

   public baq a(String $$0) {
      return baq.a;
   }

   public DataResult<Number> a(baq $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(baq $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(baq $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<baq> a(baq $$0, baq $$1) {
      return DataResult.success(baq.a);
   }

   public DataResult<baq> a(baq $$0, List<baq> $$1) {
      return DataResult.success(baq.a);
   }

   public DataResult<baq> a(baq $$0, baq $$1, baq $$2) {
      return DataResult.success(baq.a);
   }

   public DataResult<baq> a(baq $$0, Map<baq, baq> $$1) {
      return DataResult.success(baq.a);
   }

   public DataResult<baq> a(baq $$0, MapLike<baq> $$1) {
      return DataResult.success(baq.a);
   }

   public DataResult<Stream<Pair<baq, baq>>> d(baq $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<baq, baq>>> e(baq $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<baq>> f(baq $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<baq>> g(baq $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<baq>>> h(baq $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(baq $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(baq $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(baq $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public baq a(Stream<Pair<baq, baq>> $$0) {
      return baq.a;
   }

   public baq a(Map<baq, baq> $$0) {
      return baq.a;
   }

   public baq b(Stream<baq> $$0) {
      return baq.a;
   }

   public baq a(ByteBuffer $$0) {
      return baq.a;
   }

   public baq a(IntStream $$0) {
      return baq.a;
   }

   public baq a(LongStream $$0) {
      return baq.a;
   }

   public baq a(baq $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<baq> mapBuilder() {
      return new azm.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<baq, baq> {
      public a(DynamicOps<baq> $$0) {
         super($$0);
      }

      protected baq a() {
         return baq.a;
      }

      protected baq a(baq $$0, baq $$1, baq $$2) {
         return $$2;
      }

      protected DataResult<baq> a(baq $$0, baq $$1) {
         return DataResult.success($$1);
      }
   }
}
