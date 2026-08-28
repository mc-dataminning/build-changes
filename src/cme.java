import javax.annotation.Nullable;

public class cme extends cly {
   private static final chr b = chr.a().d();
   @Nullable
   private ewu c;
   @Nullable
   private fei d;

   public cme(clw $$0) {
      super($$0);
   }

   @Override
   public cmm<cme> h() {
      return cmm.c;
   }

   @Override
   public void c() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void a(arq $$0) {
      double $$1 = this.d == null ? 0.0 : this.d.c(this.a.dA(), this.a.dC(), this.a.dG());
      if ($$1 < 100.0 || $$1 > 22500.0 || this.a.P || this.a.Q) {
         this.b($$0);
      }
   }

   @Nullable
   @Override
   public fei f() {
      return this.d;
   }

   private void b(arq $$0) {
      if (this.c == null || this.c.c()) {
         int $$1 = this.a.n();
         iu $$2 = $$0.a(efy.a.f, ejd.a(this.a.j()));
         cqy $$3 = $$0.a(b, this.a, (double)$$2.u(), (double)$$2.v(), (double)$$2.w());
         int $$5;
         if ($$3 != null) {
            fei $$4 = new fei($$3.dA(), 0.0, $$3.dG()).d();
            $$5 = this.a.q(-$$4.d * 40.0, 105.0, -$$4.f * 40.0);
         } else {
            $$5 = this.a.q(40.0, (double)$$2.v(), 0.0);
         }

         ews $$7 = new ews($$2.u(), $$2.v(), $$2.w());
         this.c = this.a.a($$1, $$5, $$7);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.i();
      if (this.c != null && this.c.c()) {
         this.a.t().a(cmm.d);
      }
   }

   private void i() {
      if (this.c != null && !this.c.c()) {
         jz $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.dY().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new fei($$1, $$3, $$2);
      }
   }
}
