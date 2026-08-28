import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epr extends ept {
   public static final MapCodec<epr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvj.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, epr::new)
   );
   private final dvj b;
   private final float d;

   public epr(dvj $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dvj $$0, azs $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected epu<?> a() {
      return epu.f;
   }
}
