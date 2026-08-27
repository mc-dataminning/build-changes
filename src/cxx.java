import javax.annotation.Nullable;

public class cxx extends cuo implements csm {
   public static final dfy b = dfo.at;
   public static final int c = 4;
   private static final int d = 3;
   private static final int e = 1;
   private static final ehy f = csk.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ehy g = csk.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ehy h = csk.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ehy i = csk.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ehy[] j = new ehy[]{csk.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), f};
   private static final ehy[] k = new ehy[]{h, csk.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), g, g, g};

   public cxx(dex.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      return this.n();
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return $$0.c(a) == dfu.a ? j[Math.min(Math.abs(4 - ($$0.c(b) + 1)), j.length - 1)] : k[$$0.c(b)];
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      if ($$0.c(b) == 0) {
         return h;
      } else {
         return $$0.c(a) == dfu.b ? i : super.c($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if (b($$0.c(b))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : csl.a.n();
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d(dey $$0, coq $$1, gv $$2) {
      return $$0.a(csl.cC);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b);
      super.a($$0);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if ($$3 instanceof bze && $$1.X().b(cpg.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dey $$0, cle $$1) {
      return false;
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, biw $$3, ciw $$4) {
   }

   @Override
   public boolean e_(dey $$0) {
      return $$0.c(a) == dfu.b && !this.n($$0);
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      float $$4 = cub.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aki $$0, dey $$1, gv $$2, int $$3) {
      int $$4 = Math.min($$1.c(b) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dey $$5 = $$1.a(b, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(a, dfu.a), 3);
         }
      }
   }

   private static boolean a(cpn $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(csl.kB);
   }

   private static boolean b(cpn $$0, gv $$1) {
      return cub.a($$0, $$1);
   }

   private static boolean h(dey $$0) {
      return $$0.a(csl.kB) && $$0.c(a) == dfu.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cpn $$0, gv $$1, dey $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dey $$0) {
      return $$0.c(b) >= 4;
   }

   @Nullable
   private cxx.a c(cpn $$0, gv $$1, dey $$2) {
      if (h($$2)) {
         return new cxx.a($$1, $$2);
      } else {
         gv $$3 = $$1.d();
         dey $$4 = $$0.a_($$3);
         return h($$4) ? new cxx.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      cxx.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(b) + 1);
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      cxx.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(gv a, dey b) {
   }
}
