import java.util.Optional;
import javax.annotation.Nullable;

public class czz extends dac {
   private final Optional<axf<btc<?>>> b;

   public czz(dac.b $$0, Optional<axf<btc<?>>> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public float a(int $$0, @Nullable btc<?> $$1) {
      if (this.b.isEmpty()) {
         return 1.0F + (float)Math.max(0, $$0 - 1) * 0.5F;
      } else {
         return $$1 != null && $$1.a(this.b.get()) ? (float)$$0 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean a(dac $$0) {
      return !($$0 instanceof czz);
   }

   @Override
   public void a(btr $$0, bsw $$1, int $$2) {
      if (this.b.isPresent() && $$1 instanceof btr $$3 && this.b.get() == awt.C && $$2 > 0 && $$3.ak().a(this.b.get())) {
         int $$4 = 20 + $$0.el().a(10 * $$2);
         $$3.b(new bse(bsg.b, $$4, 3));
      }
   }
}
