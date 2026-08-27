import com.mojang.serialization.MapCodec;

public class dgi extends dce {
   public static final MapCodec<dgi> a = b(dgi::new);
   public static final dns b = dnr.s;
   public static final dob e = dnr.aA;

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   protected dgi(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected bnd a(dnb $$0, cxb $$1, ib $$2, ciu $$3, epp $$4) {
      if (!$$3.ga().e) {
         return bnd.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bnd.a($$1.B);
      }
   }

   @Override
   protected int g(dnb $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dnb a(csu $$0) {
      dnb $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a && !this.b($$3, $$5, $$2)) {
         return dae.a.o();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(cxe $$0, ib $$1, dnb $$2) {
      return this.a((cxr)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dnb $$0, cxb $$1, ib $$2, axd $$3) {
      if ($$0.c(d)) {
         ih $$4 = $$0.c(aE);
         double $$5 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.v() + 0.4 + ($$3.j() - 0.5) * 0.2;
         double $$7 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         float $$8 = -5.0F;
         if ($$3.h()) {
            $$8 = (float)($$0.c(e) * 2 - 1);
         }

         $$8 /= 16.0F;
         double $$9 = (double)($$8 * (float)$$4.j());
         double $$10 = (double)($$8 * (float)$$4.l());
         $$1.a(jw.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(aE, e, b, d);
   }
}
