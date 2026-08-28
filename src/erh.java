import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class erh extends erj {
   public static final MapCodec<erh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dwy.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, erh::new)
   );
   private final dwy b;
   private final float d;

   public erh(dwy $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dwy $$0, azh $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected erk<?> a() {
      return erk.f;
   }
}
