import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eje extends eix {
   public static final MapCodec<eje> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eje::new)
   );
   private final int c;

   private eje(int $$0) {
      this.c = $$0;
   }

   public static eje a(int $$0) {
      return new eje($$0);
   }

   @Override
   protected boolean a(eiw $$0, ayw $$1, jd $$2) {
      int $$3 = $$0.a(dyy.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dyy.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eiz<?> b() {
      return eiz.d;
   }
}
