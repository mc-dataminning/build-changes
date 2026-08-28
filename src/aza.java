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

public class aza implements DynamicOps<bab> {
   public static final aza a = new aza();

   private aza() {
   }

   public <U> U a(DynamicOps<U> $$0, bab $$1) {
      return (U)$$0.empty();
   }

   public bab a() {
      return bab.a;
   }

   public bab b() {
      return bab.a;
   }

   public bab c() {
      return bab.a;
   }

   public bab a(Number $$0) {
      return bab.a;
   }

   public bab a(byte $$0) {
      return bab.a;
   }

   public bab a(short $$0) {
      return bab.a;
   }

   public bab a(int $$0) {
      return bab.a;
   }

   public bab a(long $$0) {
      return bab.a;
   }

   public bab a(float $$0) {
      return bab.a;
   }

   public bab a(double $$0) {
      return bab.a;
   }

   public bab a(boolean $$0) {
      return bab.a;
   }

   public bab a(String $$0) {
      return bab.a;
   }

   public DataResult<Number> a(bab $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bab $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bab $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bab> a(bab $$0, bab $$1) {
      return DataResult.success(bab.a);
   }

   public DataResult<bab> a(bab $$0, List<bab> $$1) {
      return DataResult.success(bab.a);
   }

   public DataResult<bab> a(bab $$0, bab $$1, bab $$2) {
      return DataResult.success(bab.a);
   }

   public DataResult<bab> a(bab $$0, Map<bab, bab> $$1) {
      return DataResult.success(bab.a);
   }

   public DataResult<bab> a(bab $$0, MapLike<bab> $$1) {
      return DataResult.success(bab.a);
   }

   public DataResult<Stream<Pair<bab, bab>>> d(bab $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bab, bab>>> e(bab $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bab>> f(bab $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bab>> g(bab $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bab>>> h(bab $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bab $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bab $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bab $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bab a(Stream<Pair<bab, bab>> $$0) {
      return bab.a;
   }

   public bab a(Map<bab, bab> $$0) {
      return bab.a;
   }

   public bab b(Stream<bab> $$0) {
      return bab.a;
   }

   public bab a(ByteBuffer $$0) {
      return bab.a;
   }

   public bab a(IntStream $$0) {
      return bab.a;
   }

   public bab a(LongStream $$0) {
      return bab.a;
   }

   public bab a(bab $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bab> mapBuilder() {
      return new aza.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bab, bab> {
      public a(DynamicOps<bab> $$0) {
         super($$0);
      }

      protected bab a() {
         return bab.a;
      }

      protected bab a(bab $$0, bab $$1, bab $$2) {
         return $$2;
      }

      protected DataResult<bab> a(bab $$0, bab $$1) {
         return DataResult.success($$1);
      }
   }
}
