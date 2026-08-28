import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eij extends eic {
   public static final MapCodec<eij> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eij::new)
   );
   private final int c;

   private eij(int $$0) {
      this.c = $$0;
   }

   public static eij a(int $$0) {
      return new eij($$0);
   }

   @Override
   protected boolean a(eib $$0, ayo $$1, ja $$2) {
      int $$3 = $$0.a(dyf.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dyf.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eie<?> b() {
      return eie.d;
   }
}
