import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eik extends eid {
   public static final MapCodec<eik> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eik::new)
   );
   private final int c;

   private eik(int $$0) {
      this.c = $$0;
   }

   public static eik a(int $$0) {
      return new eik($$0);
   }

   @Override
   protected boolean a(eic $$0, ayo $$1, ja $$2) {
      int $$3 = $$0.a(dyg.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dyg.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eif<?> b() {
      return eif.d;
   }
}
