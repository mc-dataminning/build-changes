import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class ctn extends ctl {
   private static final djt f = new dks(true, false, Optional.of(1.22F), mh.e.a(axg.cF).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = azq.l(3.5F);
   private int i = 5;

   public ctn(bxe<? extends ctl> $$0, djz $$1) {
      super($$0, $$1);
   }

   public ctn(crz $$0, djz $$1, double $$2, double $$3, double $$4) {
      super(bxe.bI, $$1, $$0, $$2, $$3, $$4);
   }

   public ctn(djz $$0, double $$1, double $$2, double $$3, ffs $$4) {
      super(bxe.bI, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(csv $$0, @Nullable bwv $$1, @Nullable bwv $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ffs $$0) {
      this.dV().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, djz.a.e, lz.A, lz.z, awr.Du);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
