import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emy extends emr {
   public static final MapCodec<emy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, emy::new)
   );
   private final int c;

   private emy(int $$0) {
      this.c = $$0;
   }

   public static emy a(int $$0) {
      return new emy($$0);
   }

   @Override
   protected boolean a(emq $$0, azh $$1, ji $$2) {
      int $$3 = $$0.a(ecr.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(ecr.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public emt<?> b() {
      return emt.d;
   }
}
