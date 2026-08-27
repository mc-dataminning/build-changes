import com.mojang.serialization.MapCodec;

public class cvq extends cyi implements cuw, cvp {
   public static final MapCodec<cvq> c = b(cvq::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<cvq> a() {
      return c;
   }

   public cvq(dgv.d $$0) {
      super($$0, hx.a, r_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(ato $$0) {
      return 1;
   }

   @Override
   protected boolean g(dgw $$0) {
      return $$0.i();
   }

   @Override
   protected cut b() {
      return cuv.rv;
   }

   @Override
   protected dgw a(dgw $$0, dgw $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   protected dgw a(dgw $$0, ato $$1) {
      return super.a($$0, $$1).a(s_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public clb a(crv $$0, ht $$1, dgw $$2) {
      return new clb(cle.vx);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      return cvp.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      super.a($$0);
      $$0.a(s_);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
