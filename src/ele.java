import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ele extends ekx {
   public static final MapCodec<ele> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ele::new)
   );
   private final int c;

   private ele(int $$0) {
      this.c = $$0;
   }

   public static ele a(int $$0) {
      return new ele($$0);
   }

   @Override
   protected boolean a(ekw $$0, azr $$1, jg $$2) {
      int $$3 = $$0.a(eaz.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(eaz.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ekz<?> b() {
      return ekz.d;
   }
}
