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

public class azh implements DynamicOps<bak> {
   public static final azh a = new azh();

   private azh() {
   }

   public <U> U a(DynamicOps<U> $$0, bak $$1) {
      return (U)$$0.empty();
   }

   public bak a() {
      return bak.a;
   }

   public bak b() {
      return bak.a;
   }

   public bak c() {
      return bak.a;
   }

   public bak a(Number $$0) {
      return bak.a;
   }

   public bak a(byte $$0) {
      return bak.a;
   }

   public bak a(short $$0) {
      return bak.a;
   }

   public bak a(int $$0) {
      return bak.a;
   }

   public bak a(long $$0) {
      return bak.a;
   }

   public bak a(float $$0) {
      return bak.a;
   }

   public bak a(double $$0) {
      return bak.a;
   }

   public bak a(boolean $$0) {
      return bak.a;
   }

   public bak a(String $$0) {
      return bak.a;
   }

   public DataResult<Number> a(bak $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bak $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bak $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bak> a(bak $$0, bak $$1) {
      return DataResult.success(bak.a);
   }

   public DataResult<bak> a(bak $$0, List<bak> $$1) {
      return DataResult.success(bak.a);
   }

   public DataResult<bak> a(bak $$0, bak $$1, bak $$2) {
      return DataResult.success(bak.a);
   }

   public DataResult<bak> a(bak $$0, Map<bak, bak> $$1) {
      return DataResult.success(bak.a);
   }

   public DataResult<bak> a(bak $$0, MapLike<bak> $$1) {
      return DataResult.success(bak.a);
   }

   public DataResult<Stream<Pair<bak, bak>>> d(bak $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bak, bak>>> e(bak $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bak>> f(bak $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bak>> g(bak $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bak>>> h(bak $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bak $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bak $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bak $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bak a(Stream<Pair<bak, bak>> $$0) {
      return bak.a;
   }

   public bak a(Map<bak, bak> $$0) {
      return bak.a;
   }

   public bak b(Stream<bak> $$0) {
      return bak.a;
   }

   public bak a(ByteBuffer $$0) {
      return bak.a;
   }

   public bak a(IntStream $$0) {
      return bak.a;
   }

   public bak a(LongStream $$0) {
      return bak.a;
   }

   public bak a(bak $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bak> mapBuilder() {
      return new azh.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bak, bak> {
      public a(DynamicOps<bak> $$0) {
         super($$0);
      }

      protected bak a() {
         return bak.a;
      }

      protected bak a(bak $$0, bak $$1, bak $$2) {
         return $$2;
      }

      protected DataResult<bak> a(bak $$0, bak $$1) {
         return DataResult.success($$1);
      }
   }
}
