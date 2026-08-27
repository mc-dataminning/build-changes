import javax.annotation.Nullable;

public class bwt extends bvl {
   public bwt(bfn<? extends bwt> $$0, cmm $$1) {
      super($$0, $$1);
      this.a(dxp.i, 8.0F);
   }

   @Override
   protected void x() {
      this.bP.a(3, new boo<>(this, bxd.class, true));
      super.x();
   }

   @Override
   protected amg s() {
      return amh.Ad;
   }

   @Override
   protected amg d(ben $$0) {
      return amh.Af;
   }

   @Override
   protected amg g_() {
      return amh.Ae;
   }

   @Override
   amg r() {
      return amh.Ag;
   }

   @Override
   protected void a(ben $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bvo $$4 && $$4.fZ()) {
         $$4.ga();
         this.a((cml)cgc.ts);
      }
   }

   @Override
   protected void a(apf $$0, bdv $$1) {
      this.a(bfo.a, new cfz(cgc.oc));
   }

   @Override
   protected void b(apf $$0, bdv $$1) {
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      bgt $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bhg.f).a(4.0);
      this.w();
      return $$5;
   }

   @Override
   protected float b(bgl $$0, bfk $$1) {
      return 2.1F;
   }

   @Override
   public boolean z(bfj $$0) {
      if (!super.z($$0)) {
         return false;
      } else {
         if ($$0 instanceof bfz) {
            ((bfz)$$0).b(new bfa(bfc.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected byu b(cfz $$0, float $$1) {
      byu $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bfa $$0) {
      return $$0.c() == bfc.t ? false : super.c($$0);
   }
}
