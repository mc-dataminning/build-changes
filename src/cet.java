import javax.annotation.Nullable;

public class cet extends bxq {
   private final ces a;

   public cet(ces $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dM().a(this.a.dr(), this.a.dt(), this.a.dx(), 10.0);
   }

   @Override
   public void e() {
      apu $$0 = (apu)this.a.dM();
      bod $$1 = $$0.d_(this.a.dm());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bqs $$2 = bqg.al.a((czg)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dr(), this.a.dt(), this.a.dx());
         $$2.a(true);
         $$0.b($$2);
         cho $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cem $$5 = this.a($$1);
               if ($$5 != null) {
                  cho $$6 = this.a($$1, $$5);
                  if ($$6 != null) {
                     $$6.n($$5);
                     $$5.j(this.a.ei().a(0.0, 1.1485), 0.0, this.a.ei().a(0.0, 1.1485));
                     $$0.a_($$5);
                  }
               }
            }
         }
      }
   }

   @Nullable
   private cem a(bod $$0) {
      ces $$1 = bqg.aN.a(this.a.dM());
      if ($$1 != null) {
         $$1.a((apu)this.a.dM(), $$0, bqx.k, null);
         $$1.a_(this.a.dr(), this.a.dt(), this.a.dx());
         $$1.al = 60;
         $$1.fS();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private cho a(bod $$0, cem $$1) {
      cho $$2 = bqg.aM.a($$1.dM());
      if ($$2 != null) {
         $$2.a((apu)$$1.dM(), $$0, bqx.k, null);
         $$2.a_($$1.dr(), $$1.dt(), $$1.dx());
         $$2.al = 60;
         $$2.fS();
         if ($$2.d(bqh.f).d()) {
            $$2.a(bqh.f, new crs(crv.pF));
         }

         $$2.a(bqh.a, cxa.a($$2.ei(), this.a($$2.eU()), (int)(5.0F + $$0.d() * (float)$$2.ei().a(18)), false));
         $$2.a(bqh.f, cxa.a($$2.ei(), this.a($$2.d(bqh.f)), (int)(5.0F + $$0.d() * (float)$$2.ei().a(18)), false));
      }

      return $$2;
   }

   private crs a(crs $$0) {
      $$0.b(jr.f, cxg.a);
      return $$0;
   }
}
