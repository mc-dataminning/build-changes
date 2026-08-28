import java.util.Optional;
import javax.annotation.Nullable;

public class czv extends czy {
   private final Optional<axe<bsy<?>>> b;

   public czv(czy.b $$0, Optional<axe<bsy<?>>> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public float a(int $$0, @Nullable bsy<?> $$1) {
      if (this.b.isEmpty()) {
         return 1.0F + (float)Math.max(0, $$0 - 1) * 0.5F;
      } else {
         return $$1 != null && $$1.a(this.b.get()) ? (float)$$0 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean a(czy $$0) {
      return !($$0 instanceof czv);
   }

   @Override
   public void a(btn $$0, bss $$1, int $$2) {
      if (this.b.isPresent() && $$1 instanceof btn $$3 && this.b.get() == aws.C && $$2 > 0 && $$3.ak().a(this.b.get())) {
         int $$4 = 20 + $$0.el().a(10 * $$2);
         $$3.b(new bsa(bsc.b, $$4, 3));
      }
   }
}
