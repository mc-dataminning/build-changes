import com.mojang.serialization.MapCodec;

public class dbc extends cvz {
   public static final MapCodec<dbc> a = b(dbc::new);
   public static final djn<ia.a> b = djf.H;
   protected static final int c = 2;
   protected static final elu d = cvz.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final elu e = cvz.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dbc> a() {
      return a;
   }

   public dbc(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ia.a.a));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      switch ((ia.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$1.E_().j() && $$1.Y().b(csu.e) && $$3.a(2000) < $$1.aj().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, blj.bu)) {
            blf $$4 = blj.bu.a($$1, $$2.c(), blz.d);
            if ($$4 != null) {
               $$4.au();
            }
         }
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      ia.a $$6 = $$1.o();
      ia.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new eex($$3, $$4, $$7).c() ? cwb.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if ($$3.ct()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, auf $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, arc.tK, ard.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(jv.Z, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return cmh.f;
   }

   @Override
   public dip a(dip $$0, dcl $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ia.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, ia.a.a);
               case a:
                  return $$0.a(b, ia.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b);
   }
}
