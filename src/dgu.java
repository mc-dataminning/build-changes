import com.mojang.serialization.MapCodec;

public class dgu extends djk implements dfz, dgs {
   public static final MapCodec<dgu> c = b(dgu::new);

   @Override
   public MapCodec<dgu> a() {
      return c;
   }

   public dgu(dsz.d $$0) {
      super($$0, ji.a, q_, false);
      this.k(this.E.b().a(r_, Boolean.valueOf(false)));
   }

   @Override
   protected djl c() {
      return (djl)dfy.sv;
   }

   @Override
   protected dta a(dta $$0, dta $$1) {
      return $$1.a(r_, $$0.c(r_));
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
