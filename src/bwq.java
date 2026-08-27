import javax.annotation.Nullable;

public class bwq extends bpu {
   private final bwp a;

   public bwq(bwp $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dK().a(this.a.dp(), this.a.dr(), this.a.dv(), 10.0);
   }

   @Override
   public void e() {
      akk $$0 = (akk)this.a.dK();
      bgo $$1 = $$0.d_(this.a.dk());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bix $$2 = bim.ai.a((cpm)$$0);
      if ($$2 != null) {
         $$2.d(this.a.dp(), this.a.dr(), this.a.dv());
         $$2.a(true);
         $$0.b($$2);
         bzj $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               bwj $$5 = this.a($$1);
               if ($$5 != null) {
                  bzj $$6 = this.a($$1, $$5);
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
   private bwj a(bgo $$0) {
      bwp $$1 = bim.aK.a(this.a.dK());
      if ($$1 != null) {
         $$1.a((akk)this.a.dK(), $$0, bjc.k, null, null);
         $$1.e(this.a.dp(), this.a.dr(), this.a.dv());
         $$1.al = 60;
         $$1.fF();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private bzj a(bgo $$0, bwj $$1) {
      bzj $$2 = bim.aJ.a($$1.dK());
      if ($$2 != null) {
         $$2.a((akk)$$1.dK(), $$0, bjc.k, null, null);
         $$2.e($$1.dp(), $$1.dr(), $$1.dv());
         $$2.al = 60;
         $$2.fF();
         if ($$2.c(bin.f).b()) {
            $$2.a(bin.f, new ciy(cjb.oS));
         }

         $$2.a(bin.a, cnh.a($$2.ee(), this.a($$2.eR()), (int)(5.0F + $$0.d() * (float)$$2.ee().a(18)), false));
         $$2.a(bin.f, cnh.a($$2.ee(), this.a($$2.c(bin.f)), (int)(5.0F + $$0.d() * (float)$$2.ee().a(18)), false));
      }

      return $$2;
   }

   private ciy a(ciy $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
