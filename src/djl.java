import com.mojang.serialization.MapCodec;

public class djl extends dnf {
   public static final MapCodec<djl> b = b(djl::new);

   @Override
   public MapCodec<djl> a() {
      return b;
   }

   protected djl(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(a, jj.b));
   }

   @Override
   public dua a(cyw $$0) {
      jj $$1 = $$0.k();
      dua $$2 = $$0.q().a_($$0.a().a($$1.g()));
      return $$2.a(this) && $$2.c(a) == $$1 ? this.o().b(a, $$1.g()) : this.o().b(a, $$1);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      jj $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1F);
      double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1F);
      double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1F);
      double $$8 = (double)(0.4F - ($$3.i() + $$3.i()) * 0.4F);
      if ($$3.a(5) == 0) {
         $$1.a(ln.t, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
      }
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(a);
   }
}
