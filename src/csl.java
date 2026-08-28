import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class csl extends csj {
   private static final dip f = new djo(true, false, Optional.of(1.22F), mf.e.a(axc.cD).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = azm.l(3.5F);
   private int i = 5;

   public csl(bwm<? extends csj> $$0, div $$1) {
      super($$0, $$1);
   }

   public csl(cqy $$0, div $$1, double $$2, double $$3, double $$4) {
      super(bwm.bH, $$1, $$0, $$2, $$3, $$4);
   }

   public csl(div $$0, double $$1, double $$2, double $$3, fei $$4) {
      super(bwm.bH, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(crt $$0, @Nullable bwd $$1, @Nullable bwd $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fei $$0) {
      this.dV().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, div.a.e, lx.A, lx.z, awn.Dr);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
