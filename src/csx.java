import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class csx extends csv {
   private static final djb f = new dka(true, false, Optional.of(1.22F), mg.e.a(axc.cF).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = azm.l(3.5F);
   private int i = 5;

   public csx(bwr<? extends csv> $$0, djh $$1) {
      super($$0, $$1);
   }

   public csx(crj $$0, djh $$1, double $$2, double $$3, double $$4) {
      super(bwr.bH, $$1, $$0, $$2, $$3, $$4);
   }

   public csx(djh $$0, double $$1, double $$2, double $$3, fex $$4) {
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
   public boolean a(csf $$0, @Nullable bwi $$1, @Nullable bwi $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fex $$0) {
      this.dU().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, djh.a.e, ly.A, ly.z, awn.Du);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
