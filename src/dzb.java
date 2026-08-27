import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dzb extends dyu {
   public static final Codec<dzb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dzb::new)
   );
   private final int c;

   private dzb(int $$0) {
      this.c = $$0;
   }

   public static dzb a(int $$0) {
      return new dzb($$0);
   }

   @Override
   protected boolean a(dyt $$0, auw $$1, hx $$2) {
      int $$3 = $$0.a(doy.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(doy.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dyw<?> b() {
      return dyw.d;
   }
}
