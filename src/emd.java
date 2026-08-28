import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emd extends emg {
   public static final MapCodec<emd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, emd::new)
   );
   private final dfb b;
   private final float d;

   public emd(dfb $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dse $$0, azh $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected emh<?> a() {
      return emh.e;
   }
}
