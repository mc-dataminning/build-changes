import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class brc extends bqv {
   public static final MapCodec<brc> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(Codec.FLOAT.fieldOf("min_inclusive").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("max_exclusive").forGetter($$0x -> $$0x.d))
               .apply($$0, brc::new)
      )
      .validate(
         $$0 -> $$0.d <= $$0.b
               ? DataResult.error(() -> "Max must be larger than min, min_inclusive: " + $$0.b + ", max_exclusive: " + $$0.d)
               : DataResult.success($$0)
      );
   private final float b;
   private final float d;

   private brc(float $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static brc b(float $$0, float $$1) {
      if ($$1 <= $$0) {
         throw new IllegalArgumentException("Max must exceed min");
      } else {
         return new brc($$0, $$1);
      }
   }

   @Override
   public float a(azn $$0) {
      return azf.b($$0, this.b, this.d);
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
   public bqw<?> c() {
      return bqw.b;
   }

   @Override
   public String toString() {
      return "[" + this.b + "-" + this.d + "]";
   }
}
