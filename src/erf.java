import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class erf extends erh {
   public static final MapCodec<erf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dww.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, erf::new)
   );
   private final dww b;
   private final float d;

   public erf(dww $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dww $$0, azh $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected eri<?> a() {
      return eri.f;
   }
}
