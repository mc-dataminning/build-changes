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

public class azs implements DynamicOps<bay> {
   public static final azs a = new azs();

   private azs() {
   }

   public <U> U a(DynamicOps<U> $$0, bay $$1) {
      return (U)$$0.empty();
   }

   public bay a() {
      return bay.a;
   }

   public bay b() {
      return bay.a;
   }

   public bay c() {
      return bay.a;
   }

   public bay a(Number $$0) {
      return bay.a;
   }

   public bay a(byte $$0) {
      return bay.a;
   }

   public bay a(short $$0) {
      return bay.a;
   }

   public bay a(int $$0) {
      return bay.a;
   }

   public bay a(long $$0) {
      return bay.a;
   }

   public bay a(float $$0) {
      return bay.a;
   }

   public bay a(double $$0) {
      return bay.a;
   }

   public bay a(boolean $$0) {
      return bay.a;
   }

   public bay a(String $$0) {
      return bay.a;
   }

   public DataResult<Number> a(bay $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bay $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bay $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bay> a(bay $$0, bay $$1) {
      return DataResult.success(bay.a);
   }

   public DataResult<bay> a(bay $$0, List<bay> $$1) {
      return DataResult.success(bay.a);
   }

   public DataResult<bay> a(bay $$0, bay $$1, bay $$2) {
      return DataResult.success(bay.a);
   }

   public DataResult<bay> a(bay $$0, Map<bay, bay> $$1) {
      return DataResult.success(bay.a);
   }

   public DataResult<bay> a(bay $$0, MapLike<bay> $$1) {
      return DataResult.success(bay.a);
   }

   public DataResult<Stream<Pair<bay, bay>>> d(bay $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bay, bay>>> e(bay $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bay>> f(bay $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bay>> g(bay $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bay>>> h(bay $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bay $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bay $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bay $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bay a(Stream<Pair<bay, bay>> $$0) {
      return bay.a;
   }

   public bay a(Map<bay, bay> $$0) {
      return bay.a;
   }

   public bay b(Stream<bay> $$0) {
      return bay.a;
   }

   public bay a(ByteBuffer $$0) {
      return bay.a;
   }

   public bay a(IntStream $$0) {
      return bay.a;
   }

   public bay a(LongStream $$0) {
      return bay.a;
   }

   public bay a(bay $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bay> mapBuilder() {
      return new azs.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bay, bay> {
      public a(DynamicOps<bay> $$0) {
         super($$0);
      }

      protected bay a() {
         return bay.a;
      }

      protected bay a(bay $$0, bay $$1, bay $$2) {
         return $$2;
      }

      protected DataResult<bay> a(bay $$0, bay $$1) {
         return DataResult.success($$1);
      }
   }
}
