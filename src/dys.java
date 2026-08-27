import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dys extends dyl {
   public static final Codec<dys> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dys::new)
   );
   private final int c;

   private dys(int $$0) {
      this.c = $$0;
   }

   public static dys a(int $$0) {
      return new dys($$0);
   }

   @Override
   protected boolean a(dyk $$0, auu $$1, hx $$2) {
      int $$3 = $$0.a(dop.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dop.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dyn<?> b() {
      return dyn.d;
   }
}
