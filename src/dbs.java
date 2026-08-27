import com.mojang.serialization.MapCodec;

public class dbs extends cwp {
   public static final MapCodec<dbs> a = b(dbs::new);
   public static final dke<ic.a> b = djw.H;
   protected static final int c = 2;
   protected static final eml d = cwp.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eml e = cwp.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dbs> a() {
      return a;
   }

   public dbs(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.a.a));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      switch ((ic.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$1.E_().j() && $$1.Z().b(ctk.e) && $$3.a(2000) < $$1.ak().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bly.bu)) {
            blu $$4 = bly.bu.a($$1, $$2.c(), bmo.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      ic.a $$6 = $$1.o();
      ic.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new efo($$3, $$4, $$7).c() ? cwr.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if ($$3.ct()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, arr.tK, ars.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for (int $$4 = 0; $$4 < 4; $$4++) {
         double $$5 = (double)$$2.u() + $$3.j();
         double $$6 = (double)$$2.v() + $$3.j();
         double $$7 = (double)$$2.w() + $$3.j();
         double $$8 = ((double)$$3.i() - 0.5) * 0.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         double $$10 = ((double)$$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.g()).a(this) && !$$1.a_($$2.h()).a(this)) {
            $$5 = (double)$$2.u() + 0.5 + 0.25 * (double)$$11;
            $$8 = (double)($$3.i() * 2.0F * (float)$$11);
         } else {
            $$7 = (double)$$2.w() + 0.5 + 0.25 * (double)$$11;
            $$10 = (double)($$3.i() * 2.0F * (float)$$11);
         }

         $$1.a(jx.Z, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return cmx.f;
   }

   @Override
   public djg a(djg $$0, ddb $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ic.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, ic.a.a);
               case a:
                  return $$0.a(b, ic.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b);
   }
}
