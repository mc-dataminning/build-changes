import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class csq extends cso {
   private static final diu f = new djt(true, false, Optional.of(1.22F), mf.e.a(axc.cE).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = azm.l(3.5F);
   private int i = 5;

   public csq(bwo<? extends cso> $$0, dja $$1) {
      super($$0, $$1);
   }

   public csq(crc $$0, dja $$1, double $$2, double $$3, double $$4) {
      super(bwo.bH, $$1, $$0, $$2, $$3, $$4);
   }

   public csq(dja $$0, double $$1, double $$2, double $$3, feq $$4) {
      super(bwo.bH, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cry $$0, @Nullable bwf $$1, @Nullable bwf $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(feq $$0) {
      this.dV().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dja.a.e, lx.A, lx.z, awn.Du);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
