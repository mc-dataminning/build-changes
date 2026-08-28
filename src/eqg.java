import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqg extends epz {
   public static final MapCodec<eqg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eqg::new)
   );
   private final int c;

   private eqg(int $$0) {
      this.c = $$0;
   }

   public static eqg a(int $$0) {
      return new eqg($$0);
   }

   @Override
   protected boolean a(epy $$0, azv $$1, iu $$2) {
      int $$3 = $$0.a(efy.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(efy.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eqb<?> b() {
      return eqb.d;
   }
}
