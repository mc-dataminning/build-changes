import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eme extends emg {
   public static final MapCodec<eme> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dse.b.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, eme::new)
   );
   private final dse b;
   private final float d;

   public eme(dse $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dse $$0, azh $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected emh<?> a() {
      return emh.f;
   }
}
