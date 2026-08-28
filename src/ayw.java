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

public class ayw implements DynamicOps<azx> {
   public static final ayw a = new ayw();

   private ayw() {
   }

   public <U> U a(DynamicOps<U> $$0, azx $$1) {
      return (U)$$0.empty();
   }

   public azx a() {
      return azx.a;
   }

   public azx b() {
      return azx.a;
   }

   public azx c() {
      return azx.a;
   }

   public azx a(Number $$0) {
      return azx.a;
   }

   public azx a(byte $$0) {
      return azx.a;
   }

   public azx a(short $$0) {
      return azx.a;
   }

   public azx a(int $$0) {
      return azx.a;
   }

   public azx a(long $$0) {
      return azx.a;
   }

   public azx a(float $$0) {
      return azx.a;
   }

   public azx a(double $$0) {
      return azx.a;
   }

   public azx a(boolean $$0) {
      return azx.a;
   }

   public azx a(String $$0) {
      return azx.a;
   }

   public DataResult<Number> a(azx $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(azx $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(azx $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<azx> a(azx $$0, azx $$1) {
      return DataResult.success(azx.a);
   }

   public DataResult<azx> a(azx $$0, List<azx> $$1) {
      return DataResult.success(azx.a);
   }

   public DataResult<azx> a(azx $$0, azx $$1, azx $$2) {
      return DataResult.success(azx.a);
   }

   public DataResult<azx> a(azx $$0, Map<azx, azx> $$1) {
      return DataResult.success(azx.a);
   }

   public DataResult<azx> a(azx $$0, MapLike<azx> $$1) {
      return DataResult.success(azx.a);
   }

   public DataResult<Stream<Pair<azx, azx>>> d(azx $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<azx, azx>>> e(azx $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<azx>> f(azx $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<azx>> g(azx $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<azx>>> h(azx $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(azx $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(azx $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(azx $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public azx a(Stream<Pair<azx, azx>> $$0) {
      return azx.a;
   }

   public azx a(Map<azx, azx> $$0) {
      return azx.a;
   }

   public azx b(Stream<azx> $$0) {
      return azx.a;
   }

   public azx a(ByteBuffer $$0) {
      return azx.a;
   }

   public azx a(IntStream $$0) {
      return azx.a;
   }

   public azx a(LongStream $$0) {
      return azx.a;
   }

   public azx a(azx $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<azx> mapBuilder() {
      return new ayw.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<azx, azx> {
      public a(DynamicOps<azx> $$0) {
         super($$0);
      }

      protected azx a() {
         return azx.a;
      }

      protected azx a(azx $$0, azx $$1, azx $$2) {
         return $$2;
      }

      protected DataResult<azx> a(azx $$0, azx $$1) {
         return DataResult.success($$1);
      }
   }
}
