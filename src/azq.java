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

public class azq implements DynamicOps<baw> {
   public static final azq a = new azq();

   private azq() {
   }

   public <U> U a(DynamicOps<U> $$0, baw $$1) {
      return (U)$$0.empty();
   }

   public baw a() {
      return baw.a;
   }

   public baw b() {
      return baw.a;
   }

   public baw c() {
      return baw.a;
   }

   public baw a(Number $$0) {
      return baw.a;
   }

   public baw a(byte $$0) {
      return baw.a;
   }

   public baw a(short $$0) {
      return baw.a;
   }

   public baw a(int $$0) {
      return baw.a;
   }

   public baw a(long $$0) {
      return baw.a;
   }

   public baw a(float $$0) {
      return baw.a;
   }

   public baw a(double $$0) {
      return baw.a;
   }

   public baw a(boolean $$0) {
      return baw.a;
   }

   public baw a(String $$0) {
      return baw.a;
   }

   public DataResult<Number> a(baw $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(baw $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(baw $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<baw> a(baw $$0, baw $$1) {
      return DataResult.success(baw.a);
   }

   public DataResult<baw> a(baw $$0, List<baw> $$1) {
      return DataResult.success(baw.a);
   }

   public DataResult<baw> a(baw $$0, baw $$1, baw $$2) {
      return DataResult.success(baw.a);
   }

   public DataResult<baw> a(baw $$0, Map<baw, baw> $$1) {
      return DataResult.success(baw.a);
   }

   public DataResult<baw> a(baw $$0, MapLike<baw> $$1) {
      return DataResult.success(baw.a);
   }

   public DataResult<Stream<Pair<baw, baw>>> d(baw $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<baw, baw>>> e(baw $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<baw>> f(baw $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<baw>> g(baw $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<baw>>> h(baw $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(baw $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(baw $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(baw $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public baw a(Stream<Pair<baw, baw>> $$0) {
      return baw.a;
   }

   public baw a(Map<baw, baw> $$0) {
      return baw.a;
   }

   public baw b(Stream<baw> $$0) {
      return baw.a;
   }

   public baw a(ByteBuffer $$0) {
      return baw.a;
   }

   public baw a(IntStream $$0) {
      return baw.a;
   }

   public baw a(LongStream $$0) {
      return baw.a;
   }

   public baw a(baw $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<baw> mapBuilder() {
      return new azq.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<baw, baw> {
      public a(DynamicOps<baw> $$0) {
         super($$0);
      }

      protected baw a() {
         return baw.a;
      }

      protected baw a(baw $$0, baw $$1, baw $$2) {
         return $$2;
      }

      protected DataResult<baw> a(baw $$0, baw $$1) {
         return DataResult.success($$1);
      }
   }
}
