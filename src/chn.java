import javax.annotation.Nullable;

public class chn extends cak {
   private final chm a;

   public chn(chm $$0) {
      this.a = $$0;
   }

   @Override
   public boolean b() {
      return this.a.dQ().a(this.a.dv(), this.a.dx(), this.a.dB(), 10.0);
   }

   @Override
   public void a() {
      aqt $$0 = (aqt)this.a.dQ();
      bqo $$1 = $$0.d_(this.a.dq());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      btk $$2 = bsw.am.a((dcu)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dv(), this.a.dx(), this.a.dB());
         $$2.a(true);
         $$0.b($$2);
         ckj $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               chg $$5 = this.a($$1);
               if ($$5 != null) {
                  ckj $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.dT().a(0.0, 1.1485), 0.0, this.a.dT().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private chg a(bqo $$0) {
      chm $$1 = bsw.aO.a(this.a.dQ());
      if ($$1 != null) {
         $$1.a((aqt)this.a.dQ(), $$0, btp.k, null);
         $$1.a_(this.a.dv(), this.a.dx(), this.a.dB());
         $$1.am = 60;
         $$1.fP();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private ckj a(bqo $$0, chg $$1) {
      ckj $$2 = bsw.aN.a($$1.dQ());
      if ($$2 != null) {
         $$2.a((aqt)$$1.dQ(), $$0, btp.k, null);
         $$2.a_($$1.dv(), $$1.dx(), $$1.dB());
         $$2.am = 60;
         $$2.fP();
         if ($$2.a(bsx.f).e()) {
            $$2.a(bsx.f, new cuo(cur.pG));
         }

         this.a($$2, bsx.a, $$0);
         this.a($$2, bsx.f, $$0);
      }

      return $$2;
   }

   private void a(ckj $$0, bsx $$1, bqo $$2) {
      cuo $$3 = $$0.a($$1);
      $$3.b(kq.k, dag.a);
      dac.a($$3, $$0.dQ().H_(), dbn.a, $$2, $$0.dT());
      $$0.a($$1, $$3);
   }
}
