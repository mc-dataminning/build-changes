import java.util.Arrays;

public class dey extends cup {
   public static final dgc<dgg> b = dfu.bg;
   public static final dfv c = dfu.x;
   public static final float d = 4.0F;
   protected static final eib e = csq.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eib f = csq.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eib g = csq.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eib h = csq.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eib i = csq.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eib j = csq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float k = 2.0F;
   protected static final float l = 6.0F;
   protected static final float m = 10.0F;
   protected static final eib n = csq.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eib D = csq.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eib E = csq.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eib F = csq.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eib G = csq.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eib H = csq.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eib I = csq.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eib J = csq.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eib K = csq.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eib L = csq.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eib M = csq.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eib N = csq.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eib[] O = a(true);
   private static final eib[] P = a(false);

   private static eib[] a(boolean $$0) {
      return Arrays.stream(hc.values()).map($$1 -> a($$1, $$0)).toArray(eib[]::new);
   }

   private static eib a(hc $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ehy.a(j, $$1 ? J : D);
         case b:
            return ehy.a(i, $$1 ? I : n);
         case c:
            return ehy.a(h, $$1 ? L : F);
         case d:
            return ehy.a(g, $$1 ? K : E);
         case e:
            return ehy.a(f, $$1 ? N : H);
         case f:
            return ehy.a(e, $$1 ? M : G);
      }
   }

   public dey(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, dgg.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfe $$0) {
      return true;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return ($$0.c(c) ? O : P)[$$0.c(a).ordinal()];
   }

   private boolean a(dfe $$0, dfe $$1) {
      csq $$2 = $$0.c(b) == dgg.a ? csr.by : csr.br;
      return $$1.a($$2) && $$1.c(dex.b) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, cbp $$3) {
      if (!$$0.B && $$3.fR().d) {
         gw $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         gw $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      dfe $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(csr.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, csq $$3, gw $$4, boolean $$5) {
      if ($$0.a((cpt)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja($$2.c(b) == dgg.b ? csr.br : csr.by);
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
