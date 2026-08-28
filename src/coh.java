import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class coh extends cof {
   private static final dcp g = new ddn(true, false, Optional.of(1.22F), lt.e.b(awe.cy).map(Function.identity()));
   private static final float h = 1.2F;
   private int i = 5;

   public coh(bsx<? extends cof> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public coh(cmx $$0, dcw $$1, double $$2, double $$3, double $$4) {
      super(bsx.bn, $$1, $$0, $$2, $$3, $$4);
   }

   public coh(dcw $$0, double $$1, double $$2, double $$3, exa $$4) {
      super(bsx.bn, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cnq $$0, @Nullable bsr $$1, @Nullable bsr $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(exa $$0) {
      this.dP().a(this, null, g, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dcw.a.e, lm.A, lm.z, avp.Cq);
   }
}
