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

public class ayq implements DynamicOps<azs> {
   public static final ayq a = new ayq();

   private ayq() {
   }

   public <U> U a(DynamicOps<U> $$0, azs $$1) {
      return (U)$$0.empty();
   }

   public azs a() {
      return azs.a;
   }

   public azs b() {
      return azs.a;
   }

   public azs c() {
      return azs.a;
   }

   public azs a(Number $$0) {
      return azs.a;
   }

   public azs a(byte $$0) {
      return azs.a;
   }

   public azs a(short $$0) {
      return azs.a;
   }

   public azs a(int $$0) {
      return azs.a;
   }

   public azs a(long $$0) {
      return azs.a;
   }

   public azs a(float $$0) {
      return azs.a;
   }

   public azs a(double $$0) {
      return azs.a;
   }

   public azs a(boolean $$0) {
      return azs.a;
   }

   public azs a(String $$0) {
      return azs.a;
   }

   public DataResult<Number> a(azs $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(azs $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(azs $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<azs> a(azs $$0, azs $$1) {
      return DataResult.success(azs.a);
   }

   public DataResult<azs> a(azs $$0, List<azs> $$1) {
      return DataResult.success(azs.a);
   }

   public DataResult<azs> a(azs $$0, azs $$1, azs $$2) {
      return DataResult.success(azs.a);
   }

   public DataResult<azs> a(azs $$0, Map<azs, azs> $$1) {
      return DataResult.success(azs.a);
   }

   public DataResult<azs> a(azs $$0, MapLike<azs> $$1) {
      return DataResult.success(azs.a);
   }

   public DataResult<Stream<Pair<azs, azs>>> d(azs $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<azs, azs>>> e(azs $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<azs>> f(azs $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<azs>> g(azs $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<azs>>> h(azs $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(azs $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(azs $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(azs $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public azs a(Stream<Pair<azs, azs>> $$0) {
      return azs.a;
   }

   public azs a(Map<azs, azs> $$0) {
      return azs.a;
   }

   public azs b(Stream<azs> $$0) {
      return azs.a;
   }

   public azs a(ByteBuffer $$0) {
      return azs.a;
   }

   public azs a(IntStream $$0) {
      return azs.a;
   }

   public azs a(LongStream $$0) {
      return azs.a;
   }

   public azs a(azs $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<azs> mapBuilder() {
      return new ayq.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<azs, azs> {
      public a(DynamicOps<azs> $$0) {
         super($$0);
      }

      protected azs a() {
         return azs.a;
      }

      protected azs a(azs $$0, azs $$1, azs $$2) {
         return $$2;
      }

      protected DataResult<azs> a(azs $$0, azs $$1) {
         return DataResult.success($$1);
      }
   }
}
