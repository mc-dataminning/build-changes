import javax.annotation.Nullable;

public class ccg extends bvf {
   private final ccf a;

   public ccg(ccf $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dM().a(this.a.dr(), this.a.dt(), this.a.dx(), 10.0);
   }

   @Override
   public void e() {
      aow $$0 = (aow)this.a.dM();
      blu $$1 = $$0.d_(this.a.dm());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      boh $$2 = bnw.ak.a((cvr)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dr(), this.a.dt(), this.a.dx());
         $$2.a(true);
         $$0.b($$2);
         cez $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.m(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cbz $$5 = this.a($$1);
               if ($$5 != null) {
                  cez $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.m($$5);
                     $$5.j(this.a.eh().a(0.0, 1.1485), 0.0, this.a.eh().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cbz a(blu $$0) {
      ccf $$1 = bnw.aM.a(this.a.dM());
      if ($$1 != null) {
         $$1.a((aow)this.a.dM(), $$0, bom.k, null, null);
         $$1.a_(this.a.dr(), this.a.dt(), this.a.dx());
         $$1.ak = 60;
         $$1.fL();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cez a(blu $$0, cbz $$1) {
      cez $$2 = bnw.aL.a($$1.dM());
      if ($$2 != null) {
         $$2.a((aow)$$1.dM(), $$0, bom.k, null, null);
         $$2.a_($$1.dr(), $$1.dt(), $$1.dx());
         $$2.ak = 60;
         $$2.fL();
         if ($$2.c(bnx.f).b()) {
            $$2.a(bnx.f, new cpd(cpg.pF));
         }

         $$2.a(bnx.a, ctn.a($$2.eh(), this.a($$2.eT()), (int)(5.0F + $$0.d() * (float)$$2.eh().a(18)), false));
         $$2.a(bnx.f, ctn.a($$2.eh(), this.a($$2.c(bnx.f)), (int)(5.0F + $$0.d() * (float)$$2.eh().a(18)), false));
      }

      return $$2;
   }

   private cpd a(cpd $$0) {
      $$0.c("Enchantments");
      return $$0;
   }
}
