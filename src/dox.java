import com.mojang.serialization.MapCodec;

public class dox extends dks {
   public static final MapCodec<dox> a = b(dox::new);
   public static final dwm b = dwl.s;
   public static final dwu e = dwl.aA;

   @Override
   public MapCodec<dox> a() {
      return a;
   }

   protected dox(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jm.c).b(e, Integer.valueOf(1)).b(b, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$3.gh().e) {
         return bsk.e;
      } else {
         $$1.a($$2, $$0.a(e), 3);
         return bsk.a;
      }
   }

   @Override
   protected int h(dvv $$0) {
      return $$0.c(e) * 2;
   }

   @Override
   public dvv a(dad $$0) {
      dvv $$1 = super.a($$0);
      return $$1.b(b, Boolean.valueOf(this.c($$0.q(), $$0.a(), $$1)));
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4 == jm.a && !this.b($$1, $$5, $$6)) {
         return dis.a.m();
      } else {
         return !$$1.A_() && $$4.o() != $$0.c(aF).o() ? $$0.b(b, Boolean.valueOf(this.c($$1, $$3, $$0))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean c(dfp $$0, jh $$1, dvv $$2) {
      return this.a((dge)$$0, $$1, $$2) > 0;
   }

   @Override
   protected boolean b() {
      return true;
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$0.c(d)) {
         jm $$4 = $$0.c(aF);
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
         $$1.a(ln.b, $$5 + $$9, $$6, $$7 + $$10, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(aF, e, b, d);
   }
}
