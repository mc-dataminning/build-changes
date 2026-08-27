import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgg extends dgf {
   public static final MapCodec<dgg> h = b(dgg::new);
   public static final dnv i = ddx.aE;
   public static final dns j = dgf.d;

   @Override
   public MapCodec<dgg> a() {
      return h;
   }

   protected dgg(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(i, ih.c).a(j, Boolean.valueOf(true)));
   }

   @Override
   public String g() {
      return this.l().a();
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return djd.m($$0);
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return djd.b($$1, $$2, $$0.c(i));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1.g() == $$0.c(i) && !$$0.a($$3, $$4) ? dae.a.o() : $$0;
   }

   @Nullable
   @Override
   public dnb a(csu $$0) {
      dnb $$1 = dae.cq.a($$0);
      return $$1 == null ? null : this.o().a(i, $$1.c(i));
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$0.c(j)) {
         ih $$4 = $$0.c(i).g();
         double $$5 = 0.27;
         double $$6 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.j();
         double $$7 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2 + 0.22;
         double $$8 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2 + 0.27 * (double)$$4.l();
         $$1.a(jw.b, $$6, $$7, $$8, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected boolean a(cxb $$0, ib $$1, dnb $$2) {
      ih $$3 = $$2.c(i).g();
      return $$0.b($$1.a($$3), $$3);
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(j) && $$0.c(i) != $$3 ? 15 : 0;
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(i, $$1.a($$0.c(i)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(i)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(i, j);
   }
}
