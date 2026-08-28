import com.mojang.serialization.MapCodec;

public class dim extends dmg {
   public static final MapCodec<dim> b = b(dim::new);

   @Override
   public MapCodec<dim> a() {
      return b;
   }

   protected dim(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ji.b));
   }

   @Override
   public dta a(cyb $$0) {
      ji $$1 = $$0.k();
      dta $$2 = $$0.q().a_($$0.a().a($$1.g()));
      return $$2.a(this) && $$2.c(a) == $$1 ? this.o().a(a, $$1.g()) : this.o().a(a, $$1);
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      ji $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1F);
      double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1F);
      double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1F);
      double $$8 = (double)(0.4F - ($$3.i() + $$3.i()) * 0.4F);
      if ($$3.a(5) == 0) {
         $$1.a(lm.t, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
      }
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(a);
   }
}
