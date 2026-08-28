import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ema extends emd {
   public static final MapCodec<ema> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, ema::new)
   );
   private final dey b;
   private final float d;

   public ema(dey $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsb $$0, azg $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected eme<?> a() {
      return eme.e;
   }
}
