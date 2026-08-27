import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dym extends dyf {
   public static final Codec<dym> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dym::new)
   );
   private final int c;

   private dym(int $$0) {
      this.c = $$0;
   }

   public static dym a(int $$0) {
      return new dym($$0);
   }

   @Override
   protected boolean a(dye $$0, aup $$1, hx $$2) {
      int $$3 = $$0.a(doj.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(doj.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dyh<?> b() {
      return dyh.d;
   }
}
