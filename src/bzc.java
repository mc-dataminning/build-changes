import javax.annotation.Nullable;

public class bzc extends bsg {
   private final bzb a;

   public bzc(bzb $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dN().a(this.a.ds(), this.a.du(), this.a.dy(), 10.0);
   }

   @Override
   public void e() {
      ami $$0 = (ami)this.a.dN();
      biz $$1 = $$0.d_(this.a.dn());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      blk $$2 = bkz.ai.a((csf)$$0);
      if ($$2 != null) {
         $$2.e(this.a.ds(), this.a.du(), this.a.dy());
         $$2.a(true);
         $$0.b($$2);
         cbv $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               byv $$5 = this.a($$1);
               if ($$5 != null) {
                  cbv $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.eh().a(0.0, 1.1485), 0.0, this.a.eh().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private byv a(biz $$0) {
      bzb $$1 = bkz.aK.a(this.a.dN());
      if ($$1 != null) {
         $$1.a((ami)this.a.dN(), $$0, blp.k, null, null);
         $$1.a_(this.a.ds(), this.a.du(), this.a.dy());
         $$1.al = 60;
         $$1.fK();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cbv a(biz $$0, byv $$1) {
      cbv $$2 = bkz.aJ.a($$1.dN());
      if ($$2 != null) {
         $$2.a((ami)$$1.dN(), $$0, blp.k, null, null);
         $$2.a_($$1.ds(), $$1.du(), $$1.dy());
         $$2.al = 60;
         $$2.fK();
         if ($$2.c(bla.f).b()) {
            $$2.a(bla.f, new clo(clr.pD));
         }

         $$2.a(bla.a, cqb.a($$2.eh(), this.a($$2.eU()), (int)(5.0F + $$0.d() * (float)$$2.eh().a(18)), false));
         $$2.a(bla.f, cqb.a($$2.eh(), this.a($$2.c(bla.f)), (int)(5.0F + $$0.d() * (float)$$2.eh().a(18)), false));
      }

      return $$2;
   }

   private clo a(clo $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
