import com.mojang.serialization.MapCodec;

public class djc extends ddy {
   public static final MapCodec<djc> a = b(djc::new);
   public static final drz<it.a> b = drr.H;
   protected static final int c = 2;
   protected static final evd d = ddy.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final evd e = ddy.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<djc> a() {
      return a;
   }

   public djc(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, it.a.a));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      switch ((it.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
      if ($$1.D_().j() && $$1.aa().b(dat.e) && $$3.a(2000) < $$1.ak().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bsa.bx)) {
            bru $$4 = bsa.bx.a($$1, $$2.c(), bss.d);
            if ($$4 != null) {
               $$4.aw();
            }
         }
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      it.a $$6 = $$1.o();
      it.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new enu($$3, $$4, $$7).c() ? dea.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if ($$3.cw()) {
         $$3.g($$2);
      }
   }

   @Override
   public void a(drb $$0, dax $$1, io $$2, ayk $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avh.uE, avi.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(ky.ac, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return cto.i;
   }

   @Override
   protected drb a(drb $$0, dkl $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((it.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, it.a.a);
               case a:
                  return $$0.a(b, it.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(b);
   }
}
