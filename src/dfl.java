import com.mojang.serialization.MapCodec;

public class dfl extends dbh {
   public static final MapCodec<dfl> a = b(dfl::new);
   public static final dmv b = dmu.s;
   public static final dne e = dmu.aA;

   @Override
   public MapCodec<dfl> a() {
      return a;
   }

   protected dfl(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(e, Integer.valueOf(1)).a(b, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if (!$$3.fW().e) {
         return bml.d;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bml.a($$1.B);
      }
   }

   @Override
   protected int g(dme $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dme a(crx $$0) {
      dme $$1 = super.a($$0);
      return $$1.a(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1 == ih.a && !this.b($$3, $$5, $$2)) {
         return czh.a.o();
      } else {
         return !$$3.y_() && $$1.o() != $$0.c(aE).o() ? $$0.a(b, Boolean.valueOf(this.c($$3, $$4, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean c(cwh $$0, ib $$1, dme $$2) {
      return this.a((cwu)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
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
         $$1.a(jv.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(aE, e, b, d);
   }
}
