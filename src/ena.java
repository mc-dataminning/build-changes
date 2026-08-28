import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ena extends emt {
   public static final MapCodec<ena> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ena::new)
   );
   private final int c;

   private ena(int $$0) {
      this.c = $$0;
   }

   public static ena a(int $$0) {
      return new ena($$0);
   }

   @Override
   protected boolean a(ems $$0, azh $$1, ji $$2) {
      int $$3 = $$0.a(ect.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(ect.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public emv<?> b() {
      return emv.d;
   }
}
