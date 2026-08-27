import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dux extends duq {
   public static final Codec<dux> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, dux::new)
   );
   private final int c;

   private dux(int $$0) {
      this.c = $$0;
   }

   public static dux a(int $$0) {
      return new dux($$0);
   }

   @Override
   protected boolean a(dup $$0, ase $$1, gw $$2) {
      int $$3 = $$0.a(dku.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dku.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public dus<?> b() {
      return dus.d;
   }
}
