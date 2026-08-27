import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyt extends dym {
   public static final Codec<dyt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dyt::new)
   );
   private final int c;

   private dyt(int $$0) {
      this.c = $$0;
   }

   public static dyt a(int $$0) {
      return new dyt($$0);
   }

   @Override
   protected boolean a(dyl $$0, auv $$1, hx $$2) {
      int $$3 = $$0.a(doq.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(doq.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dyo<?> b() {
      return dyo.d;
   }
}
