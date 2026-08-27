import javax.annotation.Nullable;

public class cbc extends bzu {
   public cbc(bjx<? extends cbc> $$0, cqz $$1) {
      super($$0, $$1);
      this.a(ebp.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bP.a(3, new bsx<>(this, cbm.class, true));
      super.z();
   }

   @Override
   protected aqc w() {
      return aqd.Ar;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.At;
   }

   @Override
   protected aqc m_() {
      return aqd.As;
   }

   @Override
   aqc t() {
      return aqd.Au;
   }

   @Override
   protected void a(bir $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bzx $$4 && $$4.gf()) {
         $$4.gg();
         this.a((cqy)ckm.ts);
      }
   }

   @Override
   protected void a(ate $$0, bhz $$1) {
      this.a(bjy.a, new ckj(ckm.oc));
   }

   @Override
   protected void b(ate $$0, bhz $$1) {
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      blc $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(blp.c).a(4.0);
      this.y();
      return $$5;
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 2.1F;
   }

   @Override
   protected float l(bjt $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(bjt $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bkj) {
            ((bkj)$$0).b(new bjg(bji.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected cdd b(ckj $$0, float $$1) {
      cdd $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bjg $$0) {
      return $$0.c() == bji.t ? false : super.c($$0);
   }
}
