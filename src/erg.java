import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class erg extends eri {
   public static final MapCodec<erg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwx.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, erg::new)
   );
   private final dwx b;
   private final float d;

   public erg(dwx $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dwx $$0, azh $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected erj<?> a() {
      return erj.f;
   }
}
