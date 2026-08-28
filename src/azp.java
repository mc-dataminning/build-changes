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

public class azp implements DynamicOps<bat> {
   public static final azp a = new azp();

   private azp() {
   }

   public <U> U a(DynamicOps<U> $$0, bat $$1) {
      return (U)$$0.empty();
   }

   public bat a() {
      return bat.a;
   }

   public bat b() {
      return bat.a;
   }

   public bat c() {
      return bat.a;
   }

   public bat a(Number $$0) {
      return bat.a;
   }

   public bat a(byte $$0) {
      return bat.a;
   }

   public bat a(short $$0) {
      return bat.a;
   }

   public bat a(int $$0) {
      return bat.a;
   }

   public bat a(long $$0) {
      return bat.a;
   }

   public bat a(float $$0) {
      return bat.a;
   }

   public bat a(double $$0) {
      return bat.a;
   }

   public bat a(boolean $$0) {
      return bat.a;
   }

   public bat a(String $$0) {
      return bat.a;
   }

   public DataResult<Number> a(bat $$0) {
      return DataResult.error(() -> "Not a number");
   }

   public DataResult<Boolean> b(bat $$0) {
      return DataResult.error(() -> "Not a boolean");
   }

   public DataResult<String> c(bat $$0) {
      return DataResult.error(() -> "Not a string");
   }

   public DataResult<bat> a(bat $$0, bat $$1) {
      return DataResult.success(bat.a);
   }

   public DataResult<bat> a(bat $$0, List<bat> $$1) {
      return DataResult.success(bat.a);
   }

   public DataResult<bat> a(bat $$0, bat $$1, bat $$2) {
      return DataResult.success(bat.a);
   }

   public DataResult<bat> a(bat $$0, Map<bat, bat> $$1) {
      return DataResult.success(bat.a);
   }

   public DataResult<bat> a(bat $$0, MapLike<bat> $$1) {
      return DataResult.success(bat.a);
   }

   public DataResult<Stream<Pair<bat, bat>>> d(bat $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Consumer<BiConsumer<bat, bat>>> e(bat $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<MapLike<bat>> f(bat $$0) {
      return DataResult.error(() -> "Not a map");
   }

   public DataResult<Stream<bat>> g(bat $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<Consumer<Consumer<bat>>> h(bat $$0) {
      return DataResult.error(() -> "Not a list");
   }

   public DataResult<ByteBuffer> i(bat $$0) {
      return DataResult.error(() -> "Not a byte list");
   }

   public DataResult<IntStream> j(bat $$0) {
      return DataResult.error(() -> "Not an int list");
   }

   public DataResult<LongStream> k(bat $$0) {
      return DataResult.error(() -> "Not a long list");
   }

   public bat a(Stream<Pair<bat, bat>> $$0) {
      return bat.a;
   }

   public bat a(Map<bat, bat> $$0) {
      return bat.a;
   }

   public bat b(Stream<bat> $$0) {
      return bat.a;
   }

   public bat a(ByteBuffer $$0) {
      return bat.a;
   }

   public bat a(IntStream $$0) {
      return bat.a;
   }

   public bat a(LongStream $$0) {
      return bat.a;
   }

   public bat a(bat $$0, String $$1) {
      return $$0;
   }

   public RecordBuilder<bat> mapBuilder() {
      return new azp.a(this);
   }

   @Override
   public String toString() {
      return "Null";
   }

   static final class a extends AbstractUniversalBuilder<bat, bat> {
      public a(DynamicOps<bat> $$0) {
         super($$0);
      }

      protected bat a() {
         return bat.a;
      }

      protected bat a(bat $$0, bat $$1, bat $$2) {
         return $$2;
      }

      protected DataResult<bat> a(bat $$0, bat $$1) {
         return DataResult.success($$1);
      }
   }
}
