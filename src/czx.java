import java.util.Optional;
import javax.annotation.Nullable;

public class czx extends daa {
   private final Optional<axf<bta<?>>> b;

   public czx(daa.b $$0, Optional<axf<bta<?>>> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public float a(int $$0, @Nullable bta<?> $$1) {
      if (this.b.isEmpty()) {
         return 1.0F + (float)Math.max(0, $$0 - 1) * 0.5F;
      } else {
         return $$1 != null && $$1.a(this.b.get()) ? (float)$$0 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean a(daa $$0) {
      return !($$0 instanceof czx);
   }

   @Override
   public void a(btp $$0, bsu $$1, int $$2) {
      if (this.b.isPresent() && $$1 instanceof btp $$3 && this.b.get() == awt.C && $$2 > 0 && $$3.ak().a(this.b.get())) {
         int $$4 = 20 + $$0.el().a(10 * $$2);
         $$3.b(new bsc(bse.b, $$4, 3));
      }
   }
}
