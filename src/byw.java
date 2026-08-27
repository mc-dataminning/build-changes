import java.util.EnumSet;

public class byw extends bzl {
   private final bsw a;

   public byw(bsw $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzl.a.a, bzl.a.b));
   }

   @Override
   public boolean a() {
      return this.a.cq() < 140;
   }

   @Override
   public boolean b() {
      return this.a();
   }

   @Override
   public boolean R_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<ir> $$0 = ir.b(
         aym.a(this.a.dz() - 1.0), this.a.dA(), aym.a(this.a.dF() - 1.0), aym.a(this.a.dz() + 1.0), aym.a(this.a.dB() + 8.0), aym.a(this.a.dF() + 1.0)
      );
      ir $$1 = null;

      for (ir $$2 : $$0) {
         if (this.a(this.a.dU(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = ir.a(this.a.dz(), this.a.dB() + 8.0, this.a.dF());
      }

      this.a.J().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new ewu((double)this.a.bz, (double)this.a.bA, (double)this.a.bB));
      this.a.a(bst.a, this.a.dx());
   }

   private boolean a(dcd $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dfe.ob)) && $$2.a(ept.a);
   }
}
