import com.mojang.serialization.MapCodec;

public class dor extends diq {
   public static final MapCodec<dor> a = b(dor::new);
   public static final dwm b = dou.d;

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   public dor(dvu.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a_(dvv $$0, dfm $$1, jh $$2, cou $$3) {
      e($$0, $$1, $$2);
      super.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, bul $$3) {
      if (!$$3.ce()) {
         e($$2, $$0, $$1);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      if ($$2.C) {
         a($$2, $$3);
      } else {
         e($$1, $$2, $$3);
      }

      return (bsk)($$0.h() instanceof cus && new dad($$4, $$5, $$0, $$6).b() ? bsk.e : bsk.a);
   }

   private static void e(dvv $$0, dfm $$1, jh $$2) {
      a($$1, $$2);
      if (!$$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected boolean f(dvv $$0) {
      return $$0.c(b);
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
      }
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, cwm $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, brv.a(1, 5));
      }
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$0.c(b)) {
         a($$1, $$2);
      }
   }

   private static void a(dfm $$0, jh $$1) {
      double $$2 = 0.5625;
      azu $$3 = $$0.A;

      for (jm $$4 : jm.values()) {
         jh $$5 = $$1.a($$4);
         if (!$$0.a_($$5).s()) {
            jm.a $$6 = $$4.o();
            double $$7 = $$6 == jm.a.a ? 0.5 + 0.5625 * (double)$$4.j() : (double)$$3.i();
            double $$8 = $$6 == jm.a.b ? 0.5 + 0.5625 * (double)$$4.k() : (double)$$3.i();
            double $$9 = $$6 == jm.a.c ? 0.5 + 0.5625 * (double)$$4.l() : (double)$$3.i();
            $$0.a(ln.b, (double)$$1.u() + $$7, (double)$$1.v() + $$8, (double)$$1.w() + $$9, 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }
}
