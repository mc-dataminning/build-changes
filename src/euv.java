import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class euv extends eux {
   public static final MapCodec<euv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eah.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, euv::new)
   );
   private final eah b;
   private final float d;

   public euv(eah $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(eah $$0, azv $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected euy<?> a() {
      return euy.f;
   }
}
