import com.mojang.serialization.MapCodec;

public class dgq extends dkj {
   public static final MapCodec<dgq> b = b(dgq::new);

   @Override
   public MapCodec<dgq> a() {
      return b;
   }

   protected dgq(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, it.b));
   }

   @Override
   public drd a(cxb $$0) {
      it $$1 = $$0.k();
      drd $$2 = $$0.q().a_($$0.a().a($$1.g()));
      return $$2.a(this) && $$2.c(a) == $$1 ? this.n().a(a, $$1.g()) : this.n().a(a, $$1);
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      it $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1F);
      double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1F);
      double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1F);
      double $$8 = (double)(0.4F - ($$3.i() + $$3.i()) * 0.4F);
      if ($$3.a(5) == 0) {
         $$1.a(ky.t, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(a);
   }
}
