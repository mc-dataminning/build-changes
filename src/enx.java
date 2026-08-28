import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enx extends enq {
   public static final MapCodec<enx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, enx::new)
   );
   private final int c;

   private enx(int $$0) {
      this.c = $$0;
   }

   public static enx a(int $$0) {
      return new enx($$0);
   }

   @Override
   protected boolean a(enp $$0, bam $$1, jh $$2) {
      int $$3 = $$0.a(edq.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(edq.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ens<?> b() {
      return ens.d;
   }
}
