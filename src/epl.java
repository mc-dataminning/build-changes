import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class epl extends epn {
   public static final MapCodec<epl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dvd.a.fieldOf("block_state").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d))
            .apply($$0, epl::new)
   );
   private final dvd b;
   private final float d;

   public epl(dvd $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(dvd $$0, azr $$1) {
      return $$0 == this.b && $$1.i() < this.d;
   }

   @Override
   protected epo<?> a() {
      return epo.f;
   }
}
