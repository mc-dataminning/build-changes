import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cta extends csy {
   private static final djg f = new dkf(true, false, Optional.of(1.22F), mg.e.a(axc.cF).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = azm.l(3.5F);
   private int i = 5;

   public cta(bwr<? extends csy> $$0, djm $$1) {
      super($$0, $$1);
   }

   public cta(crm $$0, djm $$1, double $$2, double $$3, double $$4) {
      super(bwr.bH, $$1, $$0, $$2, $$3, $$4);
   }

   public cta(djm $$0, double $$1, double $$2, double $$3, ffc $$4) {
      super(bwr.bH, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(csi $$0, @Nullable bwi $$1, @Nullable bwi $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ffc $$0) {
      this.dU().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, djm.a.e, ly.A, ly.z, awn.Du);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
