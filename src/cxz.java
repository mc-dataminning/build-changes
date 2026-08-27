import javax.annotation.Nullable;

public class cxz extends cuq implements cso {
   public static final dga b = dfq.at;
   public static final int c = 4;
   private static final int d = 3;
   private static final int e = 1;
   private static final ehx f = csm.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final ehx g = csm.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final ehx h = csm.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final ehx i = csm.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final ehx[] j = new ehx[]{csm.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), f};
   private static final ehx[] k = new ehx[]{h, csm.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), g, g, g};

   public cxz(dez.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      return this.n();
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return $$0.c(a) == dfw.a ? j[Math.min(Math.abs(4 - ($$0.c(b) + 1)), j.length - 1)] : k[$$0.c(b)];
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      if ($$0.c(b) == 0) {
         return h;
      } else {
         return $$0.c(a) == dfw.b ? i : super.c($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if (b($$0.c(b))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : csn.a.n();
      }
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return $$0.a(csn.cC);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b);
      super.a($$0);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if ($$3 instanceof bzg && $$1.X().b(cpi.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfa $$0, clg $$1) {
      return false;
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, biy $$3, ciy $$4) {
   }

   @Override
   public boolean e_(dfa $$0) {
      return $$0.c(a) == dfw.b && !this.n($$0);
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      float $$4 = cud.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(akk $$0, dfa $$1, gu $$2, int $$3) {
      int $$4 = Math.min($$1.c(b) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dfa $$5 = $$1.a(b, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(a, dfw.a), 3);
         }
      }
   }

   private static boolean a(cpp $$0, gu $$1) {
      dfa $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(csn.kB);
   }

   private static boolean b(cpp $$0, gu $$1) {
      return cud.a($$0, $$1);
   }

   private static boolean h(dfa $$0) {
      return $$0.a(csn.kB) && $$0.c(a) == dfw.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cpp $$0, gu $$1, dfa $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dfa $$0) {
      return $$0.c(b) >= 4;
   }

   @Nullable
   private cxz.a c(cpp $$0, gu $$1, dfa $$2) {
      if (h($$2)) {
         return new cxz.a($$1, $$2);
      } else {
         gu $$3 = $$1.d();
         dfa $$4 = $$0.a_($$3);
         return h($$4) ? new cxz.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      cxz.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(b) + 1);
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      cxz.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(gu a, dfa b) {
   }
}
