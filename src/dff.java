import java.util.Arrays;

public class dff extends cuw {
   public static final dgj<dgn> b = dgb.bg;
   public static final dgc c = dgb.x;
   public static final float d = 4.0F;
   protected static final eii e = csx.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eii f = csx.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final eii g = csx.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final eii h = csx.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final eii i = csx.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final eii j = csx.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float k = 2.0F;
   protected static final float l = 6.0F;
   protected static final float m = 10.0F;
   protected static final eii n = csx.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eii D = csx.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final eii E = csx.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final eii F = csx.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final eii G = csx.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eii H = csx.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final eii I = csx.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final eii J = csx.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eii K = csx.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final eii L = csx.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final eii M = csx.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final eii N = csx.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final eii[] O = a(true);
   private static final eii[] P = a(false);

   private static eii[] a(boolean $$0) {
      return Arrays.stream(hc.values()).map($$1 -> a($$1, $$0)).toArray(eii[]::new);
   }

   private static eii a(hc $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return eif.a(j, $$1 ? J : D);
         case b:
            return eif.a(i, $$1 ? I : n);
         case c:
            return eif.a(h, $$1 ? L : F);
         case d:
            return eif.a(g, $$1 ? K : E);
         case e:
            return eif.a(f, $$1 ? N : H);
         case f:
            return eif.a(e, $$1 ? M : G);
      }
   }

   public dff(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.c).a(b, dgn.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfl $$0) {
      return true;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return ($$0.c(c) ? O : P)[$$0.c(a).ordinal()];
   }

   private boolean a(dfl $$0, dfl $$1) {
      csx $$2 = $$0.c(b) == dgn.a ? csy.by : csy.br;
      return $$1.a($$2) && $$1.c(dfe.b) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      if (!$$0.B && $$3.fS().d) {
         gw $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         gw $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      dfl $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(csy.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, csx $$3, gw $$4, boolean $$5) {
      if ($$0.a((cqa)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh($$2.c(b) == dgn.b ? csy.br : csy.by);
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
