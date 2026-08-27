import com.mojang.serialization.MapCodec;

public class cvr extends cyh implements cuw, cvp {
   public static final MapCodec<cvr> c = b(cvr::new);

   @Override
   public MapCodec<cvr> a() {
      return c;
   }

   public cvr(dgv.d $$0) {
      super($$0, hx.a, r_, false);
      this.k(this.E.b().a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected cyi c() {
      return (cyi)cuv.ru;
   }

   @Override
   protected dgw a(dgw $$0, dgw $$1) {
      return $$1.a(s_, $$0.c(s_));
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
