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

public class azo implements DynamicOps<bau> {
   public static final azo a = new azo();

   private azo() {
   }

   public <U> U a(DynamicOps<U> $$0, bau $$1) {
      return (U)$$0.empty();
   }

   public bau a() {
      return bau.a;
   }

   public bau b() {
      return bau.a;
   }

   public bau c() {
      return bau.a;
   }

   public bau a(Number $$0) {
      return bau.a;
   }

   public bau a(byte $$0) {
      return bau.a;
   }

   public bau a(short $$0) {
      return bau.a;
   }

   public bau a(int $$0) {
      return bau.a;
   }

   public bau a(long $$0) {
      return bau.a;
   }

   public bau a(float $$0) {
      return bau.a;
   }

   public bau a(double $$0) {
      return bau.a;
   }

   public bau a(boolean $$0) {
      return bau.a;
   }

   public bau a(String $$0) {
      return bau.a;
   }

   public DataResult<Number> a(bau $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bau $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bau $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bau> a(bau $$0, bau $$1) {
      return DataResult.success(bau.a);
   }

   public DataResult<bau> a(bau $$0, List<bau> $$1) {
      return DataResult.success(bau.a);
   }

   public DataResult<bau> a(bau $$0, bau $$1, bau $$2) {
      return DataResult.success(bau.a);
   }

   public DataResult<bau> a(bau $$0, Map<bau, bau> $$1) {
      return DataResult.success(bau.a);
   }

   public DataResult<bau> a(bau $$0, MapLike<bau> $$1) {
      return DataResult.success(bau.a);
   }

   public DataResult<Stream<Pair<bau, bau>>> d(bau $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bau, bau>>> e(bau $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bau>> f(bau $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bau>> g(bau $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bau>>> h(bau $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bau $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bau $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bau $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bau a(Stream<Pair<bau, bau>> $$0) {
      return bau.a;
   }

   public bau a(Map<bau, bau> $$0) {
      return bau.a;
   }

   public bau b(Stream<bau> $$0) {
      return bau.a;
   }

   public bau a(ByteBuffer $$0) {
      return bau.a;
   }

   public bau a(IntStream $$0) {
      return bau.a;
   }

   public bau a(LongStream $$0) {
      return bau.a;
   }

   public bau a(bau $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bau> mapBuilder() {
      return new azo.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bau, bau> {
      public a(DynamicOps<bau> $$0) {
         super($$0);
      }

      protected bau a() {
         return bau.a;
      }

      protected bau a(bau $$0, bau $$1, bau $$2) {
         return $$2;
      }

      protected DataResult<bau> a(bau $$0, bau $$1) {
         return DataResult.success($$1);
      }
   }
}
