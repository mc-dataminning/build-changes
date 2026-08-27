import javax.annotation.Nullable;

public class cbd extends cax {
   private static final bxd b = bxd.a().d();
   @Nullable
   private efo c;
   @Nullable
   private emc d;

   public cbd(cav $$0) {
      super($$0);
   }

   @Override
   public cbl<cbd> i() {
      return cbl.c;
   }

   @Override
   public void d() {
      this.c = null;
      this.d = null;
   }

   @Override
   public void c() {
      double $$0 = this.d == null ? 0.0 : this.d.c(this.a.dq(), this.a.ds(), this.a.dw());
      if ($$0 < 100.0 || $$0 > 22500.0 || this.a.P || this.a.Q) {
         this.j();
      }
   }

   @Nullable
   @Override
   public emc g() {
      return this.d;
   }

   private void j() {
      if (this.c == null || this.c.c()) {
         int $$0 = this.a.A();
         hx $$1 = this.a.dL().a(doy.a.f, dsb.a(this.a.u()));
         cfq $$2 = this.a.dL().a(b, this.a, (double)$$1.u(), (double)$$1.v(), (double)$$1.w());
         int $$4;
         if ($$2 != null) {
            emc $$3 = new emc($$2.dq(), 0.0, $$2.dw()).d();
            $$4 = this.a.r(-$$3.c * 40.0, 105.0, -$$3.e * 40.0);
         } else {
            $$4 = this.a.r(40.0, (double)$$1.v(), 0.0);
         }

         efm $$6 = new efm($$1.u(), $$1.v(), $$1.w());
         this.c = this.a.a($$0, $$4, $$6);
         if (this.c != null) {
            this.c.a();
         }
      }

      this.k();
      if (this.c != null && this.c.c()) {
         this.a.gc().a(cbl.d);
      }
   }

   private void k() {
      if (this.c != null && !this.c.c()) {
         jb $$0 = this.c.g();
         this.c.a();
         double $$1 = (double)$$0.u();
         double $$2 = (double)$$0.w();

         double $$3;
         do {
            $$3 = (double)((float)$$0.v() + this.a.eg().i() * 20.0F);
         } while ($$3 < (double)$$0.v());

         this.d = new emc($$1, $$3, $$2);
      }
   }
}
