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

public class ayg implements DynamicOps<azh> {
   public static final ayg a = new ayg();

   private ayg() {
   }

   public <U> U a(DynamicOps<U> $$0, azh $$1) {
      return (U)$$0.empty();
   }

   public azh a() {
      return azh.a;
   }

   public azh b() {
      return azh.a;
   }

   public azh c() {
      return azh.a;
   }

   public azh a(Number $$0) {
      return azh.a;
   }

   public azh a(byte $$0) {
      return azh.a;
   }

   public azh a(short $$0) {
      return azh.a;
   }

   public azh a(int $$0) {
      return azh.a;
   }

   public azh a(long $$0) {
      return azh.a;
   }

   public azh a(float $$0) {
      return azh.a;
   }

   public azh a(double $$0) {
      return azh.a;
   }

   public azh a(boolean $$0) {
      return azh.a;
   }

   public azh a(String $$0) {
      return azh.a;
   }

   public DataResult<Number> a(azh $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(azh $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(azh $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<azh> a(azh $$0, azh $$1) {
      return DataResult.success(azh.a);
   }

   public DataResult<azh> a(azh $$0, List<azh> $$1) {
      return DataResult.success(azh.a);
   }

   public DataResult<azh> a(azh $$0, azh $$1, azh $$2) {
      return DataResult.success(azh.a);
   }

   public DataResult<azh> a(azh $$0, Map<azh, azh> $$1) {
      return DataResult.success(azh.a);
   }

   public DataResult<azh> a(azh $$0, MapLike<azh> $$1) {
      return DataResult.success(azh.a);
   }

   public DataResult<Stream<Pair<azh, azh>>> d(azh $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<azh, azh>>> e(azh $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<azh>> f(azh $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<azh>> g(azh $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<azh>>> h(azh $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(azh $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(azh $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(azh $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public azh a(Stream<Pair<azh, azh>> $$0) {
      return azh.a;
   }

   public azh a(Map<azh, azh> $$0) {
      return azh.a;
   }

   public azh b(Stream<azh> $$0) {
      return azh.a;
   }

   public azh a(ByteBuffer $$0) {
      return azh.a;
   }

   public azh a(IntStream $$0) {
      return azh.a;
   }

   public azh a(LongStream $$0) {
      return azh.a;
   }

   public azh a(azh $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<azh> mapBuilder() {
      return new ayg.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<azh, azh> {
      public a(DynamicOps<azh> $$0) {
         super($$0);
      }

      protected azh a() {
         return azh.a;
      }

      protected azh a(azh $$0, azh $$1, azh $$2) {
         return $$2;
      }

      protected DataResult<azh> a(azh $$0, azh $$1) {
         return DataResult.success($$1);
      }
   }
}
