import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class evh extends evj {
   public static final MapCodec<evh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eat.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, evh::new)
   );
   private final eat b;
   private final float d;

   public evh(eat $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(eat $$0, azv $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected evk<?> a() {
      return evk.f;
   }
}
