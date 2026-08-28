import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehw extends ehp {
   public static final MapCodec<ehw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ehw::new)
   );
   private final int c;

   private ehw(int $$0) {
      this.c = $$0;
   }

   public static ehw a(int $$0) {
      return new ehw($$0);
   }

   @Override
   protected boolean a(eho $$0, azg $$1, iz $$2) {
      int $$3 = $$0.a(dxt.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dxt.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ehr<?> b() {
      return ehr.d;
   }
}
