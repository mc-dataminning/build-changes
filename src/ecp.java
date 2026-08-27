import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ecp extends eci {
   public static final Codec<ecp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, ecp::new)
   );
   private final int c;

   private ecp(int $$0) {
      this.c = $$0;
   }

   public static ecp a(int $$0) {
      return new ecp($$0);
   }

   @Override
   protected boolean a(ech $$0, axd $$1, ib $$2) {
      int $$3 = $$0.a(dsm.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dsm.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eck<?> b() {
      return eck.d;
   }
}
