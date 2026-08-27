import java.util.Optional;
import javax.annotation.Nullable;

public class cye extends cyg {
   private final Optional<awg<brn<?>>> b;

   public cye(cyg.b $$0, Optional<awg<brn<?>>> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public float a(int $$0, @Nullable brn<?> $$1) {
      if (this.b.isEmpty()) {
         return 1.0F + (float)Math.max(0, $$0 - 1) * 0.5F;
      } else {
         return $$1 != null && $$1.a(this.b.get()) ? (float)$$0 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean a(cyg $$0) {
      return !($$0 instanceof cye);
   }

   @Override
   public void a(bsa $$0, brh $$1, int $$2) {
      if (this.b.isPresent() && $$1 instanceof bsa $$3 && this.b.get() == avu.C && $$2 > 0 && $$3.ai().a(this.b.get())) {
         int $$4 = 20 + $$0.ej().a(10 * $$2);
         $$3.b(new bqt(bqv.b, $$4, 3));
      }
   }
}
