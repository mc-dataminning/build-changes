import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eiz extends eis {
   public static final MapCodec<eiz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eiz::new)
   );
   private final int c;

   private eiz(int $$0) {
      this.c = $$0;
   }

   public static eiz a(int $$0) {
      return new eiz($$0);
   }

   @Override
   protected boolean a(eir $$0, ayv $$1, jd $$2) {
      int $$3 = $$0.a(dyv.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dyv.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eiu<?> b() {
      return eiu.d;
   }
}
