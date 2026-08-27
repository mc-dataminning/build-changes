import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dyb extends dxu {
   public static final Codec<dyb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dyb::new)
   );
   private final int c;

   private dyb(int $$0) {
      this.c = $$0;
   }

   public static dyb a(int $$0) {
      return new dyb($$0);
   }

   @Override
   protected boolean a(dxt $$0, auf $$1, hv $$2) {
      int $$3 = $$0.a(dny.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dny.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dxw<?> b() {
      return dxw.d;
   }
}
