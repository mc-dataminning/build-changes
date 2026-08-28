import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cpt extends cpr {
   private static final deo g = new dfn(true, false, Optional.of(1.22F), lx.e.a(awz.cA).map(Function.identity()));
   private static final float h = 1.2F;
   private static final float i = azj.l(3.5F);
   private int j = 5;

   public cpt(bug<? extends cpr> $$0, dev $$1) {
      super($$0, $$1);
   }

   public cpt(coh $$0, dev $$1, double $$2, double $$3, double $$4) {
      super(bug.bn, $$1, $$0, $$2, $$3, $$4);
   }

   public cpt(dev $$0, double $$1, double $$2, double $$3, ezh $$4) {
      super(bug.bn, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.j > 0) {
         this.j--;
      }
   }

   @Override
   public boolean a(cpc $$0, @Nullable btz $$1, @Nullable btz $$2, boolean $$3) {
      return this.j > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ezh $$0) {
      this.dX().a(this, null, g, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dev.a.e, lq.A, lq.z, awk.Cu);
   }

   @Override
   public boolean a(double $$0) {
      return this.ag < 2 && $$0 < (double)i ? false : super.a($$0);
   }
}
