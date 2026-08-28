import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ema extends emc {
   public static final MapCodec<ema> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsa.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ema::new)
   );
   private final dsa b;
   private final float d;

   public ema(dsa $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsa $$0, azf $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected emd<?> a() {
      return emd.f;
   }
}
