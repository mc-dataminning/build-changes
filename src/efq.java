import com.mojang.serialization.Codec;

public class efq extends efm {
   public static final Codec<efq> a = axe.j.fieldOf("chance").xmap(efq::new, $$0 -> $$0.c).codec();
   private final int c;

   private efq(int $$0) {
      this.c = $$0;
   }

   public static efq a(int $$0) {
      return new efq($$0);
   }

   @Override
   protected boolean a(efl $$0, ayd $$1, im $$2) {
      return $$1.i() < 1.0F / (float)this.c;
   }

   @Override
   public efo<?> b() {
      return efo.b;
   }
}
