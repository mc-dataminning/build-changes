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

public class azb implements DynamicOps<baf> {
   public static final azb a = new azb();

   private azb() {
   }

   public <U> U a(DynamicOps<U> $$0, baf $$1) {
      return (U)$$0.empty();
   }

   public baf a() {
      return baf.a;
   }

   public baf b() {
      return baf.a;
   }

   public baf c() {
      return baf.a;
   }

   public baf a(Number $$0) {
      return baf.a;
   }

   public baf a(byte $$0) {
      return baf.a;
   }

   public baf a(short $$0) {
      return baf.a;
   }

   public baf a(int $$0) {
      return baf.a;
   }

   public baf a(long $$0) {
      return baf.a;
   }

   public baf a(float $$0) {
      return baf.a;
   }

   public baf a(double $$0) {
      return baf.a;
   }

   public baf a(boolean $$0) {
      return baf.a;
   }

   public baf a(String $$0) {
      return baf.a;
   }

   public DataResult<Number> a(baf $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(baf $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(baf $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<baf> a(baf $$0, baf $$1) {
      return DataResult.success(baf.a);
   }

   public DataResult<baf> a(baf $$0, List<baf> $$1) {
      return DataResult.success(baf.a);
   }

   public DataResult<baf> a(baf $$0, baf $$1, baf $$2) {
      return DataResult.success(baf.a);
   }

   public DataResult<baf> a(baf $$0, Map<baf, baf> $$1) {
      return DataResult.success(baf.a);
   }

   public DataResult<baf> a(baf $$0, MapLike<baf> $$1) {
      return DataResult.success(baf.a);
   }

   public DataResult<Stream<Pair<baf, baf>>> d(baf $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<baf, baf>>> e(baf $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<baf>> f(baf $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<baf>> g(baf $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<baf>>> h(baf $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(baf $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(baf $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(baf $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public baf a(Stream<Pair<baf, baf>> $$0) {
      return baf.a;
   }

   public baf a(Map<baf, baf> $$0) {
      return baf.a;
   }

   public baf b(Stream<baf> $$0) {
      return baf.a;
   }

   public baf a(ByteBuffer $$0) {
      return baf.a;
   }

   public baf a(IntStream $$0) {
      return baf.a;
   }

   public baf a(LongStream $$0) {
      return baf.a;
   }

   public baf a(baf $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<baf> mapBuilder() {
      return new azb.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<baf, baf> {
      public a(DynamicOps<baf> $$0) {
         super($$0);
      }

      protected baf a() {
         return baf.a;
      }

      protected baf a(baf $$0, baf $$1, baf $$2) {
         return $$2;
      }

      protected DataResult<baf> a(baf $$0, baf $$1) {
         return DataResult.success($$1);
      }
   }
}
