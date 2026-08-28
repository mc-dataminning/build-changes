import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.ListBuilder;
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

public class bab implements DynamicOps<bbh> {
   public static final bab a = new bab();

   private bab() {
   }

   public <U> U a(DynamicOps<U> $$0, bbh $$1) {
      return (U)$$0.empty();
   }

   public bbh a() {
      return bbh.a;
   }

   public bbh b() {
      return bbh.a;
   }

   public bbh c() {
      return bbh.a;
   }

   public bbh a(Number $$0) {
      return bbh.a;
   }

   public bbh a(byte $$0) {
      return bbh.a;
   }

   public bbh a(short $$0) {
      return bbh.a;
   }

   public bbh a(int $$0) {
      return bbh.a;
   }

   public bbh a(long $$0) {
      return bbh.a;
   }

   public bbh a(float $$0) {
      return bbh.a;
   }

   public bbh a(double $$0) {
      return bbh.a;
   }

   public bbh a(boolean $$0) {
      return bbh.a;
   }

   public bbh a(String $$0) {
      return bbh.a;
   }

   public DataResult<Number> a(bbh $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bbh $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bbh $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bbh> a(bbh $$0, bbh $$1) {
      return DataResult.success(bbh.a);
   }

   public DataResult<bbh> a(bbh $$0, List<bbh> $$1) {
      return DataResult.success(bbh.a);
   }

   public DataResult<bbh> a(bbh $$0, bbh $$1, bbh $$2) {
      return DataResult.success(bbh.a);
   }

   public DataResult<bbh> a(bbh $$0, Map<bbh, bbh> $$1) {
      return DataResult.success(bbh.a);
   }

   public DataResult<bbh> a(bbh $$0, MapLike<bbh> $$1) {
      return DataResult.success(bbh.a);
   }

   public DataResult<Stream<Pair<bbh, bbh>>> d(bbh $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bbh, bbh>>> e(bbh $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bbh>> f(bbh $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bbh>> g(bbh $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bbh>>> h(bbh $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bbh $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bbh $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bbh $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bbh a(Stream<Pair<bbh, bbh>> $$0) {
      return bbh.a;
   }

   public bbh a(Map<bbh, bbh> $$0) {
      return bbh.a;
   }

   public bbh b(Stream<bbh> $$0) {
      return bbh.a;
   }

   public bbh a(ByteBuffer $$0) {
      return bbh.a;
   }

   public bbh a(IntStream $$0) {
      return bbh.a;
   }

   public bbh a(LongStream $$0) {
      return bbh.a;
   }

   public bbh a(bbh $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bbh> mapBuilder() {
      return new bab.b(this);
   }

   public ListBuilder<bbh> listBuilder() {
      return new bab.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends ayj<bbh, bbh> {
      public a(DynamicOps<bbh> $$0) {
         super($$0);
      }

      protected bbh b() {
         return bbh.a;
      }

      protected bbh a(bbh $$0, bbh $$1) {
         return $$0;
      }

      protected DataResult<bbh> b(bbh $$0, bbh $$1) {
         return DataResult.success($$0);
      }
   }

   static final class b extends AbstractUniversalBuilder<bbh, bbh> {
      public b(DynamicOps<bbh> $$0) {
         super($$0);
      }

      protected bbh a() {
         return bbh.a;
      }

      protected bbh a(bbh $$0, bbh $$1, bbh $$2) {
         return $$2;
      }

      protected DataResult<bbh> a(bbh $$0, bbh $$1) {
         return DataResult.success($$1);
      }
   }
}
