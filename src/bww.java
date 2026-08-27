import java.util.EnumSet;

public class bww extends bxl {
   private final bqw a;

   public bww(bqw $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bxl.a.a, bxl.a.b));
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
         axk.a(this.a.dr() - 1.0), this.a.ds(), axk.a(this.a.dx() - 1.0), axk.a(this.a.dr() + 1.0), axk.a(this.a.dt() + 8.0), axk.a(this.a.dx() + 1.0)
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
      this.a.a(0.02F, new esa((double)this.a.bn, (double)this.a.bo, (double)this.a.bp));
      this.a.a(bqt.a, this.a.dp());
   }

   private boolean a(cza $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dca.nd)) && $$2.a(elh.a);
   }
}
