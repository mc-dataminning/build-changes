public class czf extends csq implements czr {
   private static final int e = 1;
   private static final eib f;
   private static final eib g;
   private static final eib h = csq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eib i = ehy.b().a(0.0, -1.0, 0.0);
   public static final int a = 7;
   public static final dge b = dfu.aW;
   public static final dfv c = dfu.C;
   public static final dfv d = dfu.b;

   protected czf(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(d) ? g : f;
      } else {
         return ehy.b();
      }
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2) {
      return ehy.b();
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dfe a(cli $$0) {
      gw $$1 = $$0.a();
      cpq $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(c, Boolean.valueOf($$2.b_($$1).a() == eai.c)).a(b, Integer.valueOf($$3)).a(d, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      if (!$$3.r_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      int $$4 = a($$1, $$2);
      dfe $$5 = $$0.a(b, Integer.valueOf($$4)).a(d, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(b) == 7) {
         if ($$0.c(b) == 7) {
            byh.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      if ($$3.a(ehy.b(), $$2, true) && !$$3.b()) {
         return f;
      } else {
         return $$0.c(b) != 0 && $$0.c(d) && $$3.a(i, $$2, true) ? h : ehy.a();
      }
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(c) ? eai.c.a(false) : super.c_($$0);
   }

   private boolean a(cow $$0, gw $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cow $$0, gw $$1) {
      gw.a $$2 = $$1.j().c(hc.a);
      dfe $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(csr.nS)) {
         $$4 = $$3.c(b);
      } else if ($$3.d($$0, $$2, hc.b)) {
         return 0;
      }

      for (hc $$5 : hc.c.a) {
         dfe $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(csr.nS)) {
            $$4 = Math.min($$4, $$6.c(b) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eib $$0 = csq.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eib $$1 = csq.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eib $$2 = csq.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eib $$3 = csq.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eib $$4 = csq.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      f = ehy.a($$0, $$1, $$2, $$3, $$4);
      eib $$5 = csq.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eib $$6 = csq.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eib $$7 = csq.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eib $$8 = csq.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      g = ehy.a(czf.h, f, $$6, $$5, $$8, $$7);
   }
}
