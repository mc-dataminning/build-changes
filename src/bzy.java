import javax.annotation.Nullable;

public class bzy extends btb {
   private final bzx a;

   public bzy(bzx $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dM().a(this.a.dr(), this.a.dt(), this.a.dx(), 10.0);
   }

   @Override
   public void e() {
      amz $$0 = (amz)this.a.dM();
      bjt $$1 = $$0.d_(this.a.dm());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bme $$2 = blt.aj.a((cti)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dr(), this.a.dt(), this.a.dx());
         $$2.a(true);
         $$0.b($$2);
         ccr $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               bzr $$5 = this.a($$1);
               if ($$5 != null) {
                  ccr $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.eg().a(0.0, 1.1485), 0.0, this.a.eg().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private bzr a(bjt $$0) {
      bzx $$1 = blt.aL.a(this.a.dM());
      if ($$1 != null) {
         $$1.a((amz)this.a.dM(), $$0, bmj.k, null, null);
         $$1.a_(this.a.dr(), this.a.dt(), this.a.dx());
         $$1.al = 60;
         $$1.fJ();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private ccr a(bjt $$0, bzr $$1) {
      ccr $$2 = blt.aK.a($$1.dM());
      if ($$2 != null) {
         $$2.a((amz)$$1.dM(), $$0, bmj.k, null, null);
         $$2.a_($$1.dr(), $$1.dt(), $$1.dx());
         $$2.al = 60;
         $$2.fJ();
         if ($$2.c(blu.f).b()) {
            $$2.a(blu.f, new cmr(cmu.pD));
         }

         $$2.a(blu.a, cre.a($$2.eg(), this.a($$2.eT()), (int)(5.0F + $$0.d() * (float)$$2.eg().a(18)), false));
         $$2.a(blu.f, cre.a($$2.eg(), this.a($$2.c(blu.f)), (int)(5.0F + $$0.d() * (float)$$2.eg().a(18)), false));
      }

      return $$2;
   }

   private cmr a(cmr $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
