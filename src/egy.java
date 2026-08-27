import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egy extends egr {
   public static final MapCodec<egy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, egy::new)
   );
   private final int c;

   private egy(int $$0) {
      this.c = $$0;
   }

   public static egy a(int $$0) {
      return new egy($$0);
   }

   @Override
   protected boolean a(egq $$0, aym $$1, io $$2) {
      int $$3 = $$0.a(dwv.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dwv.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public egt<?> b() {
      return egt.d;
   }
}
