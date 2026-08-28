import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehv extends eho {
   public static final MapCodec<ehv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ehv::new)
   );
   private final int c;

   private ehv(int $$0) {
      this.c = $$0;
   }

   public static ehv a(int $$0) {
      return new ehv($$0);
   }

   @Override
   protected boolean a(ehn $$0, azf $$1, iz $$2) {
      int $$3 = $$0.a(dxs.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dxs.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ehq<?> b() {
      return ehq.d;
   }
}
