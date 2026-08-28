import com.mojang.serialization.MapCodec;

public class dgt extends djl implements dfz, dgs {
   public static final MapCodec<dgt> c = b(dgt::new);
   private static final float g = 0.11F;

   @Override
   public MapCodec<dgt> a() {
      return c;
   }

   public dgt(dsz.d $$0) {
      super($$0, ji.a, q_, false, 0.1);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(ayv $$0) {
      return 1;
   }

   @Override
   protected boolean g(dta $$0) {
      return $$0.i();
   }

   @Override
   protected dfw b() {
      return dfy.sw;
   }

   @Override
   protected dta a(dta $$0, dta $$1) {
      return $$1.a(r_, $$0.c(r_));
   }

   @Override
   protected dta a(dta $$0, ayv $$1) {
      return super.a($$0, $$1).a(r_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return new cuo(cur.wv);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      return dgs.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      super.a($$0);
      $$0.a(r_);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return !$$2.c(r_);
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      $$0.a($$2, $$3.a(r_, Boolean.valueOf(true)), 2);
   }
}
