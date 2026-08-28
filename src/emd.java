import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emd extends emf {
   public static final MapCodec<emd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dsd.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, emd::new)
   );
   private final dsd b;
   private final float d;

   public emd(dsd $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dsd $$0, azh $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected emg<?> a() {
      return emg.f;
   }
}
