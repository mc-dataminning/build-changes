import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class era extends eqt {
   public static final MapCodec<era> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, era::new)
   );
   private final int c;

   private era(int $$0) {
      this.c = $$0;
   }

   public static era a(int $$0) {
      return new era($$0);
   }

   @Override
   protected boolean a(eqs $$0, azv $$1, iv $$2) {
      int $$3 = $$0.a(egs.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(egs.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eqv<?> b() {
      return eqv.d;
   }
}
