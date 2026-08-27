public class czk extends csv implements czw {
   private static final int e = 1;
   private static final eig f;
   private static final eig g;
   private static final eig h = csv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eig i = eid.b().a(0.0, -1.0, 0.0);
   public static final int a = 7;
   public static final dgj b = dfz.aW;
   public static final dga c = dfz.C;
   public static final dga d = dfz.b;

   protected czk(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(7)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(d) ? g : f;
      } else {
         return eid.b();
      }
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2) {
      return eid.b();
   }

   @Override
   public boolean a(dfj $$0, cln $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dfj a(cln $$0) {
      gw $$1 = $$0.a();
      cpv $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.n().a(c, Boolean.valueOf($$2.b_($$1).a() == ean.c)).a(b, Integer.valueOf($$3)).a(d, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dfj $$0, cpv $$1, gw $$2, dfj $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      if (!$$3.w_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      int $$4 = a($$1, $$2);
      dfj $$5 = $$0.a(b, Integer.valueOf($$4)).a(d, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(b) == 7) {
         if ($$0.c(b) == 7) {
            bym.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public eig c(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      if ($$3.a(eid.b(), $$2, true) && !$$3.b()) {
         return f;
      } else {
         return $$0.c(b) != 0 && $$0.c(d) && $$3.a(i, $$2, true) ? h : eid.a();
      }
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(c) ? ean.c.a(false) : super.c_($$0);
   }

   private boolean a(cpb $$0, gw $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(cpb $$0, gw $$1) {
      gw.a $$2 = $$1.j().c(ha.a);
      dfj $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(csw.nS)) {
         $$4 = $$3.c(b);
      } else if ($$3.d($$0, $$2, ha.b)) {
         return 0;
      }

      for (ha $$5 : ha.c.a) {
         dfj $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(csw.nS)) {
            $$4 = Math.min($$4, $$6.c(b) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eig $$0 = csv.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eig $$1 = csv.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eig $$2 = csv.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eig $$3 = csv.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eig $$4 = csv.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      f = eid.a($$0, $$1, $$2, $$3, $$4);
      eig $$5 = csv.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eig $$6 = csv.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eig $$7 = csv.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eig $$8 = csv.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      g = eid.a(czk.h, f, $$6, $$5, $$8, $$7);
   }
}
