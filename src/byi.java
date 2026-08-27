import java.util.EnumSet;

public class byi extends byx {
   private final bsi a;

   public byi(bsi $$0) {
      this.a = $$0;
      this.a(EnumSet.of(byx.a.a, byx.a.b));
   }

   @Override
   public boolean a() {
      return this.a.cj() < 140;
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
      Iterable<in> $$0 = in.b(
         axz.a(this.a.ds() - 1.0), this.a.dt(), axz.a(this.a.dy() - 1.0), axz.a(this.a.ds() + 1.0), axz.a(this.a.du() + 8.0), axz.a(this.a.dy() + 1.0)
      );
      in $$1 = null;

      for (in $$2 : $$0) {
         if (this.a(this.a.dN(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = in.a(this.a.ds(), this.a.du() + 8.0, this.a.dy());
      }

      this.a.K().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new etp((double)this.a.bp, (double)this.a.bq, (double)this.a.br));
      this.a.a(bsf.a, this.a.dq());
   }

   private boolean a(dag $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(ddg.nd)) && $$2.a(emp.a);
   }
}
