import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class elw extends elz {
   public static final MapCodec<elw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(lp.e.q().fieldOf("block").forGetter($$0x -> $$0x.b), Codec.FLOAT.fieldOf("probability").forGetter($$0x -> $$0x.d)).apply($$0, elw::new)
   );
   private final deu b;
   private final float d;

   public elw(deu $$0, float $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   @Override
   public boolean a(drx $$0, azc $$1) {
      return $$0.a(this.b) && $$1.i() < this.d;
   }

   @Override
   protected ema<?> a() {
      return ema.e;
   }
}
