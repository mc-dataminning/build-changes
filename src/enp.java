import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class enp extends eni {
   public static final MapCodec<enp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, enp::new)
   );
   private final int c;

   private enp(int $$0) {
      this.c = $$0;
   }

   public static enp a(int $$0) {
      return new enp($$0);
   }

   @Override
   protected boolean a(enh $$0, bam $$1, jh $$2) {
      int $$3 = $$0.a(edi.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(edi.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public enk<?> b() {
      return enk.d;
   }
}
