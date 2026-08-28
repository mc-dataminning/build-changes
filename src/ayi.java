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

public class ayi implements DynamicOps<azk> {
   public static final ayi a = new ayi();

   private ayi() {
   }

   public <U> U a(DynamicOps<U> $$0, azk $$1) {
      return (U)$$0.empty();
   }

   public azk a() {
      return azk.a;
   }

   public azk b() {
      return azk.a;
   }

   public azk c() {
      return azk.a;
   }

   public azk a(Number $$0) {
      return azk.a;
   }

   public azk a(byte $$0) {
      return azk.a;
   }

   public azk a(short $$0) {
      return azk.a;
   }

   public azk a(int $$0) {
      return azk.a;
   }

   public azk a(long $$0) {
      return azk.a;
   }

   public azk a(float $$0) {
      return azk.a;
   }

   public azk a(double $$0) {
      return azk.a;
   }

   public azk a(boolean $$0) {
      return azk.a;
   }

   public azk a(String $$0) {
      return azk.a;
   }

   public DataResult<Number> a(azk $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(azk $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(azk $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<azk> a(azk $$0, azk $$1) {
      return DataResult.success(azk.a);
   }

   public DataResult<azk> a(azk $$0, List<azk> $$1) {
      return DataResult.success(azk.a);
   }

   public DataResult<azk> a(azk $$0, azk $$1, azk $$2) {
      return DataResult.success(azk.a);
   }

   public DataResult<azk> a(azk $$0, Map<azk, azk> $$1) {
      return DataResult.success(azk.a);
   }

   public DataResult<azk> a(azk $$0, MapLike<azk> $$1) {
      return DataResult.success(azk.a);
   }

   public DataResult<Stream<Pair<azk, azk>>> d(azk $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<azk, azk>>> e(azk $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<azk>> f(azk $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<azk>> g(azk $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<azk>>> h(azk $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(azk $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(azk $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(azk $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public azk a(Stream<Pair<azk, azk>> $$0) {
      return azk.a;
   }

   public azk a(Map<azk, azk> $$0) {
      return azk.a;
   }

   public azk b(Stream<azk> $$0) {
      return azk.a;
   }

   public azk a(ByteBuffer $$0) {
      return azk.a;
   }

   public azk a(IntStream $$0) {
      return azk.a;
   }

   public azk a(LongStream $$0) {
      return azk.a;
   }

   public azk a(azk $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<azk> mapBuilder() {
      return new ayi.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<azk, azk> {
      public a(DynamicOps<azk> $$0) {
         super($$0);
      }

      protected azk a() {
         return azk.a;
      }

      protected azk a(azk $$0, azk $$1, azk $$2) {
         return $$2;
      }

      protected DataResult<azk> a(azk $$0, azk $$1) {
         return DataResult.success($$1);
      }
   }
}
