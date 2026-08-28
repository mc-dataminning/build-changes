import java.util.EnumSet;

public class cav extends cbk {
   private final buv a;

   public cav(buv $$0) {
      this.a = $$0;
      this.a(EnumSet.of(cbk.a.a, cbk.a.b));
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
   public boolean T_() {
      return false;
   }

   @Override
   public void d() {
      this.h();
   }

   private void h() {
      Iterable<jf> $$0 = jf.b(
         azf.a(this.a.dx() - 1.0), this.a.dy(), azf.a(this.a.dD() - 1.0), azf.a(this.a.dx() + 1.0), azf.a(this.a.dz() + 8.0), azf.a(this.a.dD() + 1.0)
      );
      jf $$1 = null;

      for (jf $$2 : $$0) {
         if (this.a(this.a.dS(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = jf.a(this.a.dx(), this.a.dz() + 8.0, this.a.dD());
      }

      this.a.P().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void a() {
      this.h();
      this.a.a(0.02F, new eyw((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(bur.a, this.a.dv());
   }

   private boolean a(dem $$0, jf $$1) {
      dus $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dho.nd)) && $$2.a(eri.a);
   }
}
