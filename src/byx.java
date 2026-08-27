import javax.annotation.Nullable;

public class byx extends bsb {
   private final byw a;

   public byx(byw $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dN().a(this.a.ds(), this.a.du(), this.a.dy(), 10.0);
   }

   @Override
   public void e() {
      ame $$0 = (ame)this.a.dN();
      biv $$1 = $$0.d_(this.a.dn());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      blf $$2 = bku.ai.a((csa)$$0);
      if ($$2 != null) {
         $$2.e(this.a.ds(), this.a.du(), this.a.dy());
         $$2.a(true);
         $$0.b($$2);
         cbq $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               byq $$5 = this.a($$1);
               if ($$5 != null) {
                  cbq $$6 = this.a($$1, $$5);
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
   private byq a(biv $$0) {
      byw $$1 = bku.aK.a(this.a.dN());
      if ($$1 != null) {
         $$1.a((ame)this.a.dN(), $$0, blk.k, null, null);
         $$1.a_(this.a.ds(), this.a.du(), this.a.dy());
         $$1.al = 60;
         $$1.fK();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cbq a(biv $$0, byq $$1) {
      cbq $$2 = bku.aJ.a($$1.dN());
      if ($$2 != null) {
         $$2.a((ame)$$1.dN(), $$0, blk.k, null, null);
         $$2.a_($$1.ds(), $$1.du(), $$1.dy());
         $$2.al = 60;
         $$2.fK();
         if ($$2.c(bkv.f).b()) {
            $$2.a(bkv.f, new clj(clm.pD));
         }

         $$2.a(bkv.a, cpw.a($$2.eh(), this.a($$2.eU()), (int)(5.0F + $$0.d() * (float)$$2.eh().a(18)), false));
         $$2.a(bkv.f, cpw.a($$2.eh(), this.a($$2.c(bkv.f)), (int)(5.0F + $$0.d() * (float)$$2.eh().a(18)), false));
      }

      return $$2;
   }

   private clj a(clj $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
