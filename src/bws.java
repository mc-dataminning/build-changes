import javax.annotation.Nullable;

public class bws extends bpw {
   private final bwr a;

   public bws(bwr $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dK().a(this.a.dp(), this.a.dr(), this.a.dv(), 10.0);
   }

   @Override
   public void e() {
      akn $$0 = (akn)this.a.dK();
      bgr $$1 = $$0.d_(this.a.dk());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bja $$2 = bip.ai.a((cpq)$$0);
      if ($$2 != null) {
         $$2.d(this.a.dp(), this.a.dr(), this.a.dv());
         $$2.a(true);
         $$0.b($$2);
         bzl $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               bwl $$5 = this.a($$1);
               if ($$5 != null) {
                  bzl $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.ee().a(0.0, 1.1485), 0.0, this.a.ee().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private bwl a(bgr $$0) {
      bwr $$1 = bip.aK.a(this.a.dK());
      if ($$1 != null) {
         $$1.a((akn)this.a.dK(), $$0, bjf.k, null, null);
         $$1.e(this.a.dp(), this.a.dr(), this.a.dv());
         $$1.al = 60;
         $$1.fF();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private bzl a(bgr $$0, bwl $$1) {
      bzl $$2 = bip.aJ.a($$1.dK());
      if ($$2 != null) {
         $$2.a((akn)$$1.dK(), $$0, bjf.k, null, null);
         $$2.e($$1.dp(), $$1.dr(), $$1.dv());
         $$2.al = 60;
         $$2.fF();
         if ($$2.c(biq.f).b()) {
            $$2.a(biq.f, new cja(cjd.oS));
         }

         $$2.a(biq.a, cnl.a($$2.ee(), this.a($$2.eR()), (int)(5.0F + $$0.d() * (float)$$2.ee().a(18)), false));
         $$2.a(biq.f, cnl.a($$2.ee(), this.a($$2.c(biq.f)), (int)(5.0F + $$0.d() * (float)$$2.ee().a(18)), false));
      }

      return $$2;
   }

   private cja a(cja $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
