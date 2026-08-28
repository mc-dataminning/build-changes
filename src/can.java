import java.util.EnumSet;

public class can extends cbc {
   private final bun a;

   public can(bun $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbc.a.a, cbc.a.b));
   }

   @Override
   public boolean b() {
      return this.a.cq() < 140;
   }

   @Override
   public boolean c() {
      return this.b();
   }

   @Override
   public boolean S_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<je> $$0 = je.b(
         azc.a(this.a.dx() - 1.0), this.a.dy(), azc.a(this.a.dD() - 1.0), azc.a(this.a.dx() + 1.0), azc.a(this.a.dz() + 8.0), azc.a(this.a.dD() + 1.0)
      );
      je $$1 = null;

      for (je $$2 : $$0) {
         if (this.a(this.a.dS(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = je.a(this.a.dx(), this.a.dz() + 8.0, this.a.dD());
      }

      this.a.P().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new eye((double)this.a.bl, (double)this.a.bm, (double)this.a.bn));
      this.a.a(buj.a, this.a.dv());
   }

   private boolean a(ddv $$0, je $$1) {
      dua $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dgx.nd)) && $$2.a(eqq.a);
   }
}
