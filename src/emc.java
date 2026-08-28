import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emc extends eme {
   public static final MapCodec<emc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsc.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, emc::new)
   );
   private final dsc b;
   private final float d;

   public emc(dsc $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsc $$0, azh $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected emf<?> a() {
      return emf.f;
   }
}
