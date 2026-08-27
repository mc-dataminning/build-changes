import java.util.EnumSet;

public class bvw extends bwl {
   private final bpw a;

   public bvw(bpw $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bwl.a.a, bwl.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ci() < 140;
   }

   @Override
   public boolean b() {
      return this.a();
   }

   @Override
   public boolean Q_() {
      return false;
   }

   @Override
   public void c() {
      this.h();
   }

   private void h() {
      Iterable<ib> $$0 = ib.b(
         aww.a(this.a.dr() - 1.0), this.a.ds(), aww.a(this.a.dx() - 1.0), aww.a(this.a.dr() + 1.0), aww.a(this.a.dt() + 8.0), aww.a(this.a.dx() + 1.0)
      );
      ib $$1 = null;

      for (ib $$2 : $$0) {
         if (this.a(this.a.dM(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = ib.a(this.a.dr(), this.a.dt() + 8.0, this.a.dx());
      }

      this.a.K().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new epr((double)this.a.bn, (double)this.a.bo, (double)this.a.bp));
      this.a.a(bpt.a, this.a.dp());
   }

   private boolean a(cxc $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dac.nd)) && $$2.a($$0, $$1, ejd.a);
   }
}
