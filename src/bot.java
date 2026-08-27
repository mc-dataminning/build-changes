import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class bot extends box {
   public static final MapCodec<bot> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  Codec.FLOAT.fieldOf("mean").forGetter($$0x -> $$0x.b),
                  Codec.FLOAT.fieldOf("deviation").forGetter($$0x -> $$0x.d),
                  Codec.FLOAT.fieldOf("min").forGetter($$0x -> $$0x.e),
                  Codec.FLOAT.fieldOf("max").forGetter($$0x -> $$0x.f)
               )
               .apply($$0, bot::new)
      )
      .validate($$0 -> $$0.f < $$0.e ? DataResult.error(() -> "Max must be larger than min: [" + $$0.e + ", " + $$0.f + "]") : DataResult.success($$0));
   private final float b;
   private final float d;
   private final float e;
   private final float f;

   public static bot a(float $$0, float $$1, float $$2, float $$3) {
      return new bot($$0, $$1, $$2, $$3);
   }

   private bot(float $$0, float $$1, float $$2, float $$3) {
      this.b = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   @Override
   public float a(ayk $$0) {
      return a($$0, this.b, this.d, this.e, this.f);
   }

   public static float a(ayk $$0, float $$1, float $$2, float $$3, float $$4) {
      return ayd.a(ayd.c($$0, $$1, $$2), $$3, $$4);
   }

   @Override
   public float a() {
      return this.e;
   }

   @Override
   public float b() {
      return this.f;
   }

   @Override
   public boy<?> c() {
      return boy.c;
   }

   @Override
   public String toString() {
      return "normal(" + this.b + ", " + this.d + ") in [" + this.e + "-" + this.f + "]";
   }
}
