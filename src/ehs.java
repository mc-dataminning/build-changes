import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehs extends ehl {
   public static final MapCodec<ehs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ehs::new)
   );
   private final int c;

   private ehs(int $$0) {
      this.c = $$0;
   }

   public static ehs a(int $$0) {
      return new ehs($$0);
   }

   @Override
   protected boolean a(ehk $$0, azc $$1, iz $$2) {
      int $$3 = $$0.a(dxp.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dxp.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ehn<?> b() {
      return ehn.d;
   }
}
