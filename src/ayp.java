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

public class ayp implements DynamicOps<azr> {
   public static final ayp a = new ayp();

   private ayp() {
   }

   public <U> U a(DynamicOps<U> $$0, azr $$1) {
      return (U)$$0.empty();
   }

   public azr a() {
      return azr.a;
   }

   public azr b() {
      return azr.a;
   }

   public azr c() {
      return azr.a;
   }

   public azr a(Number $$0) {
      return azr.a;
   }

   public azr a(byte $$0) {
      return azr.a;
   }

   public azr a(short $$0) {
      return azr.a;
   }

   public azr a(int $$0) {
      return azr.a;
   }

   public azr a(long $$0) {
      return azr.a;
   }

   public azr a(float $$0) {
      return azr.a;
   }

   public azr a(double $$0) {
      return azr.a;
   }

   public azr a(boolean $$0) {
      return azr.a;
   }

   public azr a(String $$0) {
      return azr.a;
   }

   public DataResult<Number> a(azr $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(azr $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(azr $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<azr> a(azr $$0, azr $$1) {
      return DataResult.success(azr.a);
   }

   public DataResult<azr> a(azr $$0, List<azr> $$1) {
      return DataResult.success(azr.a);
   }

   public DataResult<azr> a(azr $$0, azr $$1, azr $$2) {
      return DataResult.success(azr.a);
   }

   public DataResult<azr> a(azr $$0, Map<azr, azr> $$1) {
      return DataResult.success(azr.a);
   }

   public DataResult<azr> a(azr $$0, MapLike<azr> $$1) {
      return DataResult.success(azr.a);
   }

   public DataResult<Stream<Pair<azr, azr>>> d(azr $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<azr, azr>>> e(azr $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<azr>> f(azr $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<azr>> g(azr $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<azr>>> h(azr $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(azr $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(azr $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(azr $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public azr a(Stream<Pair<azr, azr>> $$0) {
      return azr.a;
   }

   public azr a(Map<azr, azr> $$0) {
      return azr.a;
   }

   public azr b(Stream<azr> $$0) {
      return azr.a;
   }

   public azr a(ByteBuffer $$0) {
      return azr.a;
   }

   public azr a(IntStream $$0) {
      return azr.a;
   }

   public azr a(LongStream $$0) {
      return azr.a;
   }

   public azr a(azr $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<azr> mapBuilder() {
      return new ayp.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<azr, azr> {
      public a(DynamicOps<azr> $$0) {
         super($$0);
      }

      protected azr a() {
         return azr.a;
      }

      protected azr a(azr $$0, azr $$1, azr $$2) {
         return $$2;
      }

      protected DataResult<azr> a(azr $$0, azr $$1) {
         return DataResult.success($$1);
      }
   }
}
