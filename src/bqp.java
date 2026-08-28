import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class bqp extends bqx {
   public static final MapCodec<bqp> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.INT.fieldOf("min_inclusive").forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("max_inclusive").forGetter($$0x -> $$0x.f))
               .apply($$0, bqp::new)
      )
      .validate(
         $$0 -> $$0.f < $$0.b
               ? DataResult.error(() -> "Max must be at least min, min_inclusive: " + $$0.b + ", max_inclusive: " + $$0.f)
               : DataResult.success($$0)
      );
   private final int b;
   private final int f;

   private bqp(int $$0, int $$1) {
      this.b = $$0;
      this.f = $$1;
   }

   public static bqp a(int $$0, int $$1) {
      return new bqp($$0, $$1);
   }

   @Override
   public int a(azn $$0) {
      return this.b + $$0.a($$0.a(this.f - this.b + 1) + 1);
   }

   @Override
   public int a() {
      return this.b;
   }

   @Override
   public int b() {
      return this.f;
   }

   @Override
   public bqy<?> c() {
      return bqy.c;
   }

   @Override
   public String toString() {
      return "[" + this.b + "-" + this.f + "]";
   }
}
