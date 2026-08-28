import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ehy extends ehr {
   public static final MapCodec<ehy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ehy::new)
   );
   private final int c;

   private ehy(int $$0) {
      this.c = $$0;
   }

   public static ehy a(int $$0) {
      return new ehy($$0);
   }

   @Override
   protected boolean a(ehq $$0, azh $$1, iz $$2) {
      int $$3 = $$0.a(dxv.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dxv.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eht<?> b() {
      return eht.d;
   }
}
