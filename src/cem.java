import javax.annotation.Nullable;

public class cem extends bxl {
   private final cel a;

   public cem(cel $$0) {
      this.a = $$0;
   }

   @Override
   public boolean a() {
      return this.a.dM().a(this.a.dr(), this.a.dt(), this.a.dx(), 10.0);
   }

   @Override
   public void e() {
      aps $$0 = (aps)this.a.dM();
      bny $$1 = $$0.d_(this.a.dm());
      this.a.w(false);
      this.a.x(true);
      this.a.c_(0);
      bqn $$2 = bqb.al.a((cyx)$$0);
      if ($$2 != null) {
         $$2.e(this.a.dr(), this.a.dt(), this.a.dx());
         $$2.a(true);
         $$0.b($$2);
         chh $$3 = this.a($$1, this.a);
         if ($$3 != null) {
            $$3.n(this.a);
            $$0.a_($$3);

            for (int $$4 = 0; $$4 < 3; $$4++) {
               cef $$5 = this.a($$1);
               if ($$5 != null) {
                  chh $$6 = this.a($$1, $$5);
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
   private cef a(bny $$0) {
      cel $$1 = bqb.aN.a(this.a.dM());
      if ($$1 != null) {
         $$1.a((aps)this.a.dM(), $$0, bqs.k, null);
         $$1.a_(this.a.dr(), this.a.dt(), this.a.dx());
         $$1.al = 60;
         $$1.fS();
         $$1.x(true);
         $$1.c_(0);
      }

      return $$1;
   }

   @Nullable
   private chh a(bny $$0, cef $$1) {
      chh $$2 = bqb.aM.a($$1.dM());
      if ($$2 != null) {
         $$2.a((aps)$$1.dM(), $$0, bqs.k, null);
         $$2.a_($$1.dr(), $$1.dt(), $$1.dx());
         $$2.al = 60;
         $$2.fS();
         if ($$2.d(bqc.f).d()) {
            $$2.a(bqc.f, new crj(crm.pF));
         }

         $$2.a(bqc.a, cwr.a($$2.ei(), this.a($$2.eU()), (int)(5.0F + $$0.d() * (float)$$2.ei().a(18)), false));
         $$2.a(bqc.f, cwr.a($$2.ei(), this.a($$2.d(bqc.f)), (int)(5.0F + $$0.d() * (float)$$2.ei().a(18)), false));
      }

      return $$2;
   }

   private crj a(crj $$0) {
      $$0.b(jp.f, cwx.a);
      return $$0;
   }
}
