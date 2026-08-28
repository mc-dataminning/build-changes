import javax.annotation.Nullable;

public class chc extends bzz {
   private final chb a;

   public chc(chb $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dQ().a(this.a.dv(), this.a.dx(), this.a.dB(), 10.0);
   }

   @Override
   public void e() {
      aqm $$0 = (aqm)this.a.dQ();
      bqe $$1 = $$0.d_(this.a.dq());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bta $$2 = bsm.am.a((dcf)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dv(), this.a.dx(), this.a.dB());
         $$2.a(true);
         $$0.b($$2);
         cjy $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cgv $$5 = this.a($$1);
               if ($$5 != null) {
                  cjy $$6 = this.a($$1, $$5);
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
   private cgv a(bqe $$0) {
      chb $$1 = bsm.aO.a(this.a.dQ());
      if ($$1 != null) {
         $$1.a((aqm)this.a.dQ(), $$0, btf.k, null);
         $$1.a_(this.a.dv(), this.a.dx(), this.a.dB());
         $$1.am = 60;
         $$1.fR();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cjy a(bqe $$0, cgv $$1) {
      cjy $$2 = bsm.aN.a($$1.dQ());
      if ($$2 != null) {
         $$2.a((aqm)$$1.dQ(), $$0, btf.k, null);
         $$2.a_($$1.dv(), $$1.dx(), $$1.dB());
         $$2.am = 60;
         $$2.fR();
         if ($$2.a(bsn.f).e()) {
            $$2.a(bsn.f, new cuc(cuf.pG));
         }

         this.a($$2, bsn.a);
         this.a($$2, bsn.f);
      }

      return $$2;
   }

   private void a(cjy $$0, bsn $$1) {
      cuc $$2 = $$0.a($$1);
      $$2.b(kn.k, czr.a);
      czn.a($$2, day.a, $$0.dQ(), $$0.dq(), $$0.dT());
      $$0.a($$1, $$2);
   }
}
