import com.mojang.serialization.MapCodec;

public class dbg extends cxc {
   public static final MapCodec<dbg> a = b(dbg::new);
   public static final dhz b = dhy.s;
   public static final dii e = dhy.aA;

   @Override
   public MapCodec<dbg> a() {
      return a;
   }

   protected dbg(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, hx.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      if (!$$3.fU().e) {
         return bix.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bix.a($$1.B);
      }
   }

   @Override
   protected int g(dhi $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a && !this.b($$3, $$5, $$2)) {
         return cvc.a.o();
      } else {
         return !$$3.x_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(csd $$0, ht $$1, dhi $$2) {
      return this.a((csq)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, ats $$3) {
      if ($$0.c(d)) {
         hx $$4 = $$0.c(aE);
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
         $$1.a(jm.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(aE, e, b, d);
   }
}
