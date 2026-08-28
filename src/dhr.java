import com.mojang.serialization.MapCodec;

public class dhr extends dlk {
   public static final MapCodec<dhr> b = b(dhr::new);

   @Override
   public MapCodec<dhr> a() {
      return b;
   }

   protected dhr(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.b));
   }

   @Override
   public dse a(cyc $$0) {
      je $$1 = $$0.k();
      dse $$2 = $$0.q().a_($$0.a().a($$1.g()));
      return $$2.a(this) && $$2.c(a) == $$1 ? this.o().a(a, $$1.g()) : this.o().a(a, $$1);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      je $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1F);
      double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1F);
      double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1F);
      double $$8 = (double)(0.4F - ($$3.i() + $$3.i()) * 0.4F);
      if ($$3.a(5) == 0) {
         $$1.a(li.t, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(a);
   }
}
