import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ekp extends eki {
   public static final MapCodec<ekp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ekp::new)
   );
   private final int c;

   private ekp(int $$0) {
      this.c = $$0;
   }

   public static ekp a(int $$0) {
      return new ekp($$0);
   }

   @Override
   protected boolean a(ekh $$0, azl $$1, je $$2) {
      int $$3 = $$0.a(eak.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(eak.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public ekk<?> b() {
      return ekk.d;
   }
}
