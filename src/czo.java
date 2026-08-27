import com.mojang.serialization.MapCodec;

public class czo extends ddg {
   public static final MapCodec<czo> b = b(czo::new);

   @Override
   public MapCodec<czo> a() {
      return b;
   }

   protected czo(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ic.b));
   }

   @Override
   public djp a(cpp $$0) {
      ic $$1 = $$0.k();
      djp $$2 = $$0.q().a_($$0.a().a($$1.g()));
      return $$2.a(this) && $$2.c(a) == $$1 ? this.o().a(a, $$1.g()) : this.o().a(a, $$1);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      ic $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1F);
      double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1F);
      double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1F);
      double $$8 = (double)(0.4F - ($$3.i() + $$3.i()) * 0.4F);
      if ($$3.a(5) == 0) {
         $$1.a(jx.u, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(a);
   }
}
