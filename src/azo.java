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

public class azo implements DynamicOps<bas> {
   public static final azo a = new azo();

   private azo() {
   }

   public <U> U a(DynamicOps<U> $$0, bas $$1) {
      return (U)$$0.empty();
   }

   public bas a() {
      return bas.a;
   }

   public bas b() {
      return bas.a;
   }

   public bas c() {
      return bas.a;
   }

   public bas a(Number $$0) {
      return bas.a;
   }

   public bas a(byte $$0) {
      return bas.a;
   }

   public bas a(short $$0) {
      return bas.a;
   }

   public bas a(int $$0) {
      return bas.a;
   }

   public bas a(long $$0) {
      return bas.a;
   }

   public bas a(float $$0) {
      return bas.a;
   }

   public bas a(double $$0) {
      return bas.a;
   }

   public bas a(boolean $$0) {
      return bas.a;
   }

   public bas a(String $$0) {
      return bas.a;
   }

   public DataResult<Number> a(bas $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bas $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bas $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bas> a(bas $$0, bas $$1) {
      return DataResult.success(bas.a);
   }

   public DataResult<bas> a(bas $$0, List<bas> $$1) {
      return DataResult.success(bas.a);
   }

   public DataResult<bas> a(bas $$0, bas $$1, bas $$2) {
      return DataResult.success(bas.a);
   }

   public DataResult<bas> a(bas $$0, Map<bas, bas> $$1) {
      return DataResult.success(bas.a);
   }

   public DataResult<bas> a(bas $$0, MapLike<bas> $$1) {
      return DataResult.success(bas.a);
   }

   public DataResult<Stream<Pair<bas, bas>>> d(bas $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bas, bas>>> e(bas $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bas>> f(bas $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bas>> g(bas $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bas>>> h(bas $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bas $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bas $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bas $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bas a(Stream<Pair<bas, bas>> $$0) {
      return bas.a;
   }

   public bas a(Map<bas, bas> $$0) {
      return bas.a;
   }

   public bas b(Stream<bas> $$0) {
      return bas.a;
   }

   public bas a(ByteBuffer $$0) {
      return bas.a;
   }

   public bas a(IntStream $$0) {
      return bas.a;
   }

   public bas a(LongStream $$0) {
      return bas.a;
   }

   public bas a(bas $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bas> mapBuilder() {
      return new azo.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bas, bas> {
      public a(DynamicOps<bas> $$0) {
         super($$0);
      }

      protected bas a() {
         return bas.a;
      }

      protected bas a(bas $$0, bas $$1, bas $$2) {
         return $$2;
      }

      protected DataResult<bas> a(bas $$0, bas $$1) {
         return DataResult.success($$1);
      }
   }
}
