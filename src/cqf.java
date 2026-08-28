import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cqf extends cqd {
   private static final dff f = new dgf(true, false, Optional.of(1.22F), lz.e.a(axc.cA).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = azm.l(3.5F);
   private int i = 5;

   public cqf(bus<? extends cqd> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cqf(cou $$0, dfm $$1, double $$2, double $$3, double $$4) {
      super(bus.bD, $$1, $$0, $$2, $$3, $$4);
   }

   public cqf(dfm $$0, double $$1, double $$2, double $$3, ezy $$4) {
      super(bus.bD, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cpo $$0, @Nullable bul $$1, @Nullable bul $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ezy $$0) {
      this.dV().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dfm.a.e, ls.A, ls.z, awn.Cu);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
