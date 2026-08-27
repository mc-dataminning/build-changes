import javax.annotation.Nullable;

public class cyd extends cuu implements css {
   public static final dge b = dfu.at;
   public static final int c = 4;
   private static final int d = 3;
   private static final int e = 1;
   private static final eib f = csq.a(3.0, 0.0, 3.0, 13.0, 15.0, 13.0);
   private static final eib g = csq.a(3.0, -1.0, 3.0, 13.0, 16.0, 13.0);
   private static final eib h = csq.a(5.0, -1.0, 5.0, 11.0, 3.0, 11.0);
   private static final eib i = csq.a(3.0, -1.0, 3.0, 13.0, 5.0, 13.0);
   private static final eib[] j = new eib[]{csq.a(3.0, 0.0, 3.0, 13.0, 11.0, 13.0), f};
   private static final eib[] k = new eib[]{h, csq.a(3.0, -1.0, 3.0, 13.0, 14.0, 13.0), g, g, g};

   public cyd(dfd.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      return this.n();
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return $$0.c(a) == dga.a ? j[Math.min(Math.abs(4 - ($$0.c(b) + 1)), j.length - 1)] : k[$$0.c(b)];
   }

   @Override
   public eib c(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      if ($$0.c(b) == 0) {
         return h;
      } else {
         return $$0.c(a) == dga.b ? i : super.c($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if (b($$0.c(b))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         return $$0.a($$3, $$4) ? $$0 : csr.a.n();
      }
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return h($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return $$0.a(csr.cC);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b);
      super.a($$0);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if ($$3 instanceof bzi && $$1.X().b(cpm.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean a(dfe $$0, cli $$1) {
      return false;
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
   }

   @Override
   public boolean e_(dfe $$0) {
      return $$0.c(a) == dga.b && !this.n($$0);
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      float $$4 = cuh.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(akn $$0, dfe $$1, gw $$2, int $$3) {
      int $$4 = Math.min($$1.c(b) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         dfe $$5 = $$1.a(b, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.c(), $$5.a(a, dga.a), 3);
         }
      }
   }

   private static boolean a(cpt $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      return $$2.i() || $$2.a(csr.kB);
   }

   private static boolean b(cpt $$0, gw $$1) {
      return cuh.a($$0, $$1);
   }

   private static boolean h(dfe $$0) {
      return $$0.a(csr.kB) && $$0.c(a) == dga.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(cpt $$0, gw $$1, dfe $$2, int $$3) {
      return !this.n($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.c()));
   }

   private boolean n(dfe $$0) {
      return $$0.c(b) >= 4;
   }

   @Nullable
   private cyd.a c(cpt $$0, gw $$1, dfe $$2) {
      if (h($$2)) {
         return new cyd.a($$1, $$2);
      } else {
         gw $$3 = $$1.d();
         dfe $$4 = $$0.a_($$3);
         return h($$4) ? new cyd.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      cyd.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(b) + 1);
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      cyd.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(gw a, dfe b) {
   }
}
