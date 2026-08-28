import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ese extends esg {
   public static final MapCodec<ese> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dxv.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ese::new)
   );
   private final dxv b;
   private final float d;

   public ese(dxv $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dxv $$0, bam $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected esh<?> a() {
      return esh.f;
   }
}
