import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egw extends egp {
   public static final MapCodec<egw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, egw::new)
   );
   private final int c;

   private egw(int $$0) {
      this.c = $$0;
   }

   public static egw a(int $$0) {
      return new egw($$0);
   }

   @Override
   protected boolean a(ego $$0, ayk $$1, io $$2) {
      int $$3 = $$0.a(dwt.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dwt.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public egr<?> b() {
      return egr.d;
   }
}
