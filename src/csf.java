import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class csf extends csd {
   private static final dij f = new dji(true, false, Optional.of(1.22F), mf.e.a(axa.cD).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = azk.l(3.5F);
   private int i = 5;

   public csf(bwj<? extends csd> $$0, dip $$1) {
      super($$0, $$1);
   }

   public csf(cqs $$0, dip $$1, double $$2, double $$3, double $$4) {
      super(bwj.bH, $$1, $$0, $$2, $$3, $$4);
   }

   public csf(dip $$0, double $$1, double $$2, double $$3, fdw $$4) {
      super(bwj.bH, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(crn $$0, @Nullable bwa $$1, @Nullable bwa $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fdw $$0) {
      this.dV().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dip.a.e, lx.A, lx.z, awl.Do);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
