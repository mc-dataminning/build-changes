import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class bqf extends bpy {
   public static final MapCodec<bqf> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("min_inclusive").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("max_exclusive").forGetter($$0x -> $$0x.d))
               .apply($$0, bqf::new)
      )
      .validate(
         $$0 -> $$0.d <= $$0.b
               ? DataResult.error(() -> "Max must be larger than min, min_inclusive: " + $$0.b + ", max_exclusive: " + $$0.d)
               : DataResult.success($$0)
      );
   private final float b;
   private final float d;

   private bqf(float $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static bqf b(float $$0, float $$1) {
      if ($$1 <= $$0) {
         throw new IllegalArgumentException("Max must exceed min");
      } else {
         return new bqf($$0, $$1);
      }
   }

   @Override
   public float a(azh $$0) {
      return ayz.b($$0, this.b, this.d);
   }

   @Override
   public float a() {
      return this.b;
   }

   @Override
   public float b() {
      return this.d;
   }

   @Override
   public bpz<?> c() {
      return bpz.b;
   }

   @Override
   public String toString() {
      return "[" + this.b + "-" + this.d + "]";
   }
}
