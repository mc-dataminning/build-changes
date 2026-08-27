import javax.annotation.Nullable;

public class cbz extends car {
   public cbz(bku<? extends cbz> $$0, csa $$1) {
      super($$0, $$1);
      this.a(edd.i, 8.0F);
   }

   @Override
   protected void B() {
      this.bP.a(3, new btu<>(this, ccj.class, true));
      super.B();
   }

   @Override
   protected aqq y() {
      return aqr.AU;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.AW;
   }

   @Override
   protected aqq m_() {
      return aqr.AV;
   }

   @Override
   aqq w() {
      return aqr.AX;
   }

   @Override
   protected void a(bjo $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof cau $$4 && $$4.gg()) {
         $$4.gh();
         this.a((crz)clm.ue);
      }
   }

   @Override
   protected void a(ats $$0, biv $$1) {
      this.a(bkv.a, new clj(clm.oN));
   }

   @Override
   protected void b(ats $$0, biv $$1) {
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      blz $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bmm.c).a(4.0);
      this.A();
      return $$5;
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 2.1F;
   }

   @Override
   protected float l(bkq $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(bkq $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof blg) {
            ((blg)$$0).b(new bkd(bkf.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cea b(clj $$0, float $$1) {
      cea $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bkd $$0) {
      return $$0.c() == bkf.t ? false : super.c($$0);
   }
}
