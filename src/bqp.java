import java.util.EnumSet;

public class bqp extends bre {
   private final bks a;

   public bqp(bks $$0) {
      this.a = $$0;
      this.a(EnumSet.of(bre.a.a, bre.a.b));
   }

   @Override
   public boolean a() {
      return this.a.ch() < 140;
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
      Iterable<ht> $$0 = ht.b(
         asy.a(this.a.dq() - 1.0), this.a.dr(), asy.a(this.a.dw() - 1.0), asy.a(this.a.dq() + 1.0), asy.a(this.a.ds() + 8.0), asy.a(this.a.dw() + 1.0)
      );
      ht $$1 = null;

      for (ht $$2 : $$0) {
         if (this.a(this.a.dL(), $$2)) {
            $$1 = $$2;
            break;
         }
      }

      if ($$1 == null) {
         $$1 = ht.a(this.a.dq(), this.a.ds() + 8.0, this.a.dw());
      }

      this.a.L().a((double)$$1.u(), (double)($$1.v() + 1), (double)$$1.w(), 1.0);
   }

   @Override
   public void e() {
      this.h();
      this.a.a(0.02F, new eif((double)this.a.bk, (double)this.a.bl, (double)this.a.bm));
      this.a.a(bkp.a, this.a.do());
   }

   private boolean a(crc $$0, ht $$1) {
      dgb $$2 = $$0.a_($$1);
      return ($$0.b_($$1).c() || $$2.a(cuc.nd)) && $$2.a($$0, $$1, ebu.a);
   }
}
