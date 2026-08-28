import javax.annotation.Nullable;

public class chd extends caa {
   private final chc a;

   public chd(chc $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dR().a(this.a.dw(), this.a.dy(), this.a.dC(), 10.0);
   }

   @Override
   public void e() {
      aqm $$0 = (aqm)this.a.dR();
      bqf $$1 = $$0.d_(this.a.dr());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      btb $$2 = bsn.am.a((dcg)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dw(), this.a.dy(), this.a.dC());
         $$2.a(true);
         $$0.b($$2);
         cjz $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cgw $$5 = this.a($$1);
               if ($$5 != null) {
                  cjz $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.dU().a(0.0, 1.1485), 0.0, this.a.dU().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cgw a(bqf $$0) {
      chc $$1 = bsn.aO.a(this.a.dR());
      if ($$1 != null) {
         $$1.a((aqm)this.a.dR(), $$0, btg.k, null);
         $$1.a_(this.a.dw(), this.a.dy(), this.a.dC());
         $$1.am = 60;
         $$1.fQ();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cjz a(bqf $$0, cgw $$1) {
      cjz $$2 = bsn.aN.a($$1.dR());
      if ($$2 != null) {
         $$2.a((aqm)$$1.dR(), $$0, btg.k, null);
         $$2.a_($$1.dw(), $$1.dy(), $$1.dC());
         $$2.am = 60;
         $$2.fQ();
         if ($$2.a(bso.f).e()) {
            $$2.a(bso.f, new cud(cug.pG));
         }

         this.a($$2, bso.a, $$0);
         this.a($$2, bso.f, $$0);
      }

      return $$2;
   }

   private void a(cjz $$0, bso $$1, bqf $$2) {
      cud $$3 = $$0.a($$1);
      $$3.b(kn.k, czs.a);
      czo.a($$3, $$0.dR().H_(), daz.a, $$2, $$0.dU());
      $$0.a($$1, $$3);
   }
}
