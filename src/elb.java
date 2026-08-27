import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elb extends eld {
   public static final MapCodec<elb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drb.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, elb::new)
   );
   private final drb b;
   private final float d;

   public elb(drb $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(drb $$0, ayk $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ele<?> a() {
      return ele.f;
   }
}
