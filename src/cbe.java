import java.util.EnumSet;

public class cbe extends cbt {
   private final bvd a;

   public cbe(bvd $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbt.a.a, cbt.a.b));
   }

   @Override
   public boolean b() {
      return this.a.cu() < 140;
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public boolean U_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<jg> $$0 = jg.b(
         azj.a(this.a.dC() - 1.0), this.a.dD(), azj.a(this.a.dI() - 1.0), azj.a(this.a.dC() + 1.0), azj.a(this.a.dE() + 8.0), azj.a(this.a.dI() + 1.0)
      );
      jg $$1 = null;

      for (jg $$2 : $$0) {
         if (this.a(this.a.dX(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = jg.a(this.a.dC(), this.a.dE() + 8.0, this.a.dI());
      }

      this.a.P().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new ezh((double)this.a.bl, (double)this.a.bm, (double)this.a.bn));
      this.a.a(buz.a, this.a.dA());
   }

   private boolean a(dey $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dia.nd)) && $$2.a(ert.a);
   }
}
