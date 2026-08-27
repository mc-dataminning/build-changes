import java.util.EnumSet;

public class byx extends bzm {
   private final bsx a;

   public byx(bsx $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bzm.a.a, bzm.a.b));
   }

   @Override
   public boolean a() {
      return this.a.cl() < 140;
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
      Iterable<io> $$0 = io.b(
         ayd.a(this.a.du() - 1.0), this.a.dv(), ayd.a(this.a.dA() - 1.0), ayd.a(this.a.du() + 1.0), ayd.a(this.a.dw() + 8.0), ayd.a(this.a.dA() + 1.0)
      );
      io $$1 = null;

      for (io $$2 : $$0) {
         if (this.a(this.a.dP(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = io.a(this.a.du(), this.a.dw() + 8.0, this.a.dA());
      }

      this.a.K().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new euk((double)this.a.bp, (double)this.a.bq, (double)this.a.br));
      this.a.a(bst.a, this.a.ds());
   }

   private boolean a(dba $$0, io $$1) {
      drb $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(dea.nd)) && $$2.a(enj.a);
   }
}
