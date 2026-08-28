import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class esd extends esf {
   public static final MapCodec<esd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxu.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, esd::new)
   );
   private final dxu b;
   private final float d;

   public esd(dxu $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dxu $$0, bam $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected esg<?> a() {
      return esg.f;
   }
}
