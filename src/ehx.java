import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehx extends ehq {
   public static final MapCodec<ehx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ehx::new)
   );
   private final int c;

   private ehx(int $$0) {
      this.c = $$0;
   }

   public static ehx a(int $$0) {
      return new ehx($$0);
   }

   @Override
   protected boolean a(ehp $$0, azh $$1, iz $$2) {
      int $$3 = $$0.a(dxu.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dxu.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ehs<?> b() {
      return ehs.d;
   }
}
