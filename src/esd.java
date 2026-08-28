import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class esd extends esg {
   public static final MapCodec<esd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ma.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, esd::new)
   );
   private final dkm b;
   private final float d;

   public esd(dkm $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dxv $$0, bam $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected esh<?> a() {
      return esh.e;
   }
}
