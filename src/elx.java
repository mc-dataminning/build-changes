import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elx extends elz {
   public static final MapCodec<elx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drx.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, elx::new)
   );
   private final drx b;
   private final float d;

   public elx(drx $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(drx $$0, azc $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ema<?> a() {
      return ema.f;
   }
}
