import com.mojang.serialization.MapCodec;

public class dex extends dip {
   public static final MapCodec<dex> b = b(dex::new);

   @Override
   public MapCodec<dex> a() {
      return b;
   }

   protected dex(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ij.b));
   }

   @Override
   public dpi a(cux $$0) {
      ij $$1 = $$0.k();
      dpi $$2 = $$0.q().a_($$0.a().a($$1.g()));
      return $$2.a(this) && $$2.c(a) == $$1 ? this.n().a(a, $$1.g()) : this.n().a(a, $$1);
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      ij $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1F);
      double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1F);
      double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1F);
      double $$8 = (double)(0.4F - ($$3.i() + $$3.i()) * 0.4F);
      if ($$3.a(5) == 0) {
         $$1.a(kn.u, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
      }
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(a);
   }
}
