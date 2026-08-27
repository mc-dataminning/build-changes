import com.mojang.serialization.MapCodec;

public class dcq extends dgi {
   public static final MapCodec<dcq> b = b(dcq::new);

   @Override
   public MapCodec<dcq> a() {
      return b;
   }

   protected dcq(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.b));
   }

   @Override
   public dmz a(css $$0) {
      ih $$1 = $$0.k();
      dmz $$2 = $$0.q().a_($$0.a().a($$1.g()));
      return $$2.a(this) && $$2.c(a) == $$1 ? this.o().a(a, $$1.g()) : this.o().a(a, $$1);
   }

   @Override
   public void a(dmz $$0, cwz $$1, ib $$2, axd $$3) {
      ih $$4 = $$0.c(a);
      double $$5 = (double)$$2.u() + 0.55 - (double)($$3.i() * 0.1F);
      double $$6 = (double)$$2.v() + 0.55 - (double)($$3.i() * 0.1F);
      double $$7 = (double)$$2.w() + 0.55 - (double)($$3.i() * 0.1F);
      double $$8 = (double)(0.4F - ($$3.i() + $$3.i()) * 0.4F);
      if ($$3.a(5) == 0) {
         $$1.a(kc.u, $$5 + (double)$$4.j() * $$8, $$6 + (double)$$4.k() * $$8, $$7 + (double)$$4.l() * $$8, $$3.k() * 0.005, $$3.k() * 0.005, $$3.k() * 0.005);
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(a);
   }
}
