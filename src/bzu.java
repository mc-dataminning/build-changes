import javax.annotation.Nullable;

public class bzu extends bym {
   public bzu(bip<? extends bzu> $$0, cpq $$1) {
      super($$0, $$1);
      this.a(eas.i, 8.0F);
   }

   @Override
   protected void w() {
      this.bP.a(3, new brp<>(this, cae.class, true));
      super.w();
   }

   @Override
   protected aoy r() {
      return aoz.Ao;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.Aq;
   }

   @Override
   protected aoy h_() {
      return aoz.Ap;
   }

   @Override
   aoy q() {
      return aoz.Ar;
   }

   @Override
   protected void a(bhj $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof byp $$4 && $$4.gb()) {
         $$4.gc();
         this.a((cpp)cjd.ts);
      }
   }

   @Override
   protected void a(arx $$0, bgr $$1) {
      this.a(biq.a, new cja(cjd.oc));
   }

   @Override
   protected void b(arx $$0, bgr $$1) {
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      bju $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bkh.f).a(4.0);
      this.t();
      return $$5;
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 2.1F;
   }

   @Override
   protected float l(bil $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(bil $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bjb) {
            ((bjb)$$0).b(new bhy(bia.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cbv b(cja $$0, float $$1) {
      cbv $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bhy $$0) {
      return $$0.c() == bia.t ? false : super.c($$0);
   }
}
