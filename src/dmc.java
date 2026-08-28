import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmc extends dmb {
   public static final MapCodec<dmc> h = b(dmc::new);
   public static final dtu i = djs.aE;
   public static final dtr j = dmb.d;

   @Override
   public MapCodec<dmc> a() {
      return h;
   }

   protected dmc(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ji.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.r().a();
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return doz.m($$0);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      return doz.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dfy.a.o() : $$0;
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = dfy.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$0.c(j)) {
         ji $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(lh.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(dcu $$0, jd $$1, dta $$2) {
      ji $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dta $$0, dca $$1, jd $$2, ji $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(i, j);
   }
}
