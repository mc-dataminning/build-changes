import com.mojang.serialization.MapCodec;

public class dor extends dsp {
   public static final MapCodec<dor> b = b(dor::new);

   @Override
   public MapCodec<dor> a() {
      return b;
   }

   protected dor(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, ja.b));
   }

   @Override
   public dzz a(dcr $$0) {
      ja $$1 = $$0.k();
      dzz $$2 = $$0.q().a_($$0.a().a($$1.g()));
      return $$2.a(this) && $$2.c(a) == $$1 ? this.m().b(a, $$1.g()) : this.m().b(a, $$1);
   }

   @Override
   public void a(dzz $$0, div $$1, iu $$2, azv $$3) {
      ja $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1F);
      double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1F);
      double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1F);
      double $$8 = (double)(0.4F - ($$3.i() + $$3.i()) * 0.4F);
      if ($$3.a(5) == 0) {
         $$1.a(lx.t, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(a);
   }
}
