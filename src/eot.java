import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eot extends eom {
   public static final MapCodec<eot> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eot::new)
   );
   private final int c;

   private eot(int $$0) {
      this.c = $$0;
   }

   public static eot a(int $$0) {
      return new eot($$0);
   }

   @Override
   protected boolean a(eol $$0, azs $$1, jj $$2) {
      int $$3 = $$0.a(eel.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(eel.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eoo<?> b() {
      return eoo.d;
   }
}
