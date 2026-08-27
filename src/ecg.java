import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecg extends eci {
   public static final Codec<ecg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dip.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, ecg::new)
   );
   private final dip b;
   private final float d;

   public ecg(dip $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dip $$0, auf $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected ecj<?> a() {
      return ecj.f;
   }
}
