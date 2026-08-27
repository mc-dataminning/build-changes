import java.util.Optional;
import javax.annotation.Nullable;

public class cyy extends czb {
   private final Optional<awm<bsc<?>>> b;

   public cyy(czb.b $$0, Optional<awm<bsc<?>>> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public float a(int $$0, @Nullable bsc<?> $$1) {
      if (this.b.isEmpty()) {
         return 1.0F + (float)Math.max(0, $$0 - 1) * 0.5F;
      } else {
         return $$1 != null && $$1.a(this.b.get()) ? (float)$$0 * 2.5F : 0.0F;
      }
   }

   @Override
   public boolean a(czb $$0) {
      return !($$0 instanceof cyy);
   }

   @Override
   public void a(bsq $$0, brw $$1, int $$2) {
      if (this.b.isPresent() && $$1 instanceof bsq $$3 && this.b.get() == awa.C && $$2 > 0 && $$3.ak().a(this.b.get())) {
         int $$4 = 20 + $$0.el().a(10 * $$2);
         $$3.b(new bre(brg.b, $$4, 3));
      }
   }
}
