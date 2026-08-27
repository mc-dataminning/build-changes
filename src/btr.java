import javax.annotation.Nullable;

public class btr extends bmv {
   private final btq a;

   public btr(btq $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dI().a(this.a.dn(), this.a.dp(), this.a.dt(), 10.0);
   }

   @Override
   public void e() {
      aif $$0 = (aif)this.a.dI();
      bdv $$1 = $$0.d_(this.a.di());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bfy $$2 = bfn.ai.a((cmm)$$0);
      if ($$2 != null) {
         $$2.d(this.a.dn(), this.a.dp(), this.a.dt());
         $$2.a(true);
         $$0.b($$2);
         bwk $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.k(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               btk $$5 = this.a($$1);
               if ($$5 != null) {
                  bwk $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.k($$5);
                     $$5.j(this.a.ec().a(0.0, 1.1485), 0.0, this.a.ec().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private btk a(bdv $$0) {
      btq $$1 = bfn.aK.a(this.a.dI());
      if ($$1 != null) {
         $$1.a((aif)this.a.dI(), $$0, bgd.k, null, null);
         $$1.e(this.a.dn(), this.a.dp(), this.a.dt());
         $$1.ak = 60;
         $$1.fF();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private bwk a(bdv $$0, btk $$1) {
      bwk $$2 = bfn.aJ.a($$1.dI());
      if ($$2 != null) {
         $$2.a((aif)$$1.dI(), $$0, bgd.k, null, null);
         $$2.e($$1.dn(), $$1.dp(), $$1.dt());
         $$2.ak = 60;
         $$2.fF();
         if ($$2.c(bfo.f).b()) {
            $$2.a(bfo.f, new cfz(cgc.oS));
         }

         $$2.a(bfo.a, cki.a($$2.ec(), this.a($$2.eO()), (int)(5.0F + $$0.d() * (float)$$2.ec().a(18)), false));
         $$2.a(bfo.f, cki.a($$2.ec(), this.a($$2.c(bfo.f)), (int)(5.0F + $$0.d() * (float)$$2.ec().a(18)), false));
      }

      return $$2;
   }

   private cfz a(cfz $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
