import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enw extends enp {
   public static final MapCodec<enw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, enw::new)
   );
   private final int c;

   private enw(int $$0) {
      this.c = $$0;
   }

   public static enw a(int $$0) {
      return new enw($$0);
   }

   @Override
   protected boolean a(eno $$0, bam $$1, jh $$2) {
      int $$3 = $$0.a(edp.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(edp.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public enr<?> b() {
      return enr.d;
   }
}
