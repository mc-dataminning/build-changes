import java.util.Arrays;

public class deu extends cul {
   public static final dfy<dgc> b = dfq.bg;
   public static final dfr c = dfq.x;
   public static final float d = 4.0F;
   protected static final ehx e = csm.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehx f = csm.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ehx g = csm.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ehx h = csm.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ehx i = csm.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehx j = csm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float k = 2.0F;
   protected static final float l = 6.0F;
   protected static final float m = 10.0F;
   protected static final ehx n = csm.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ehx D = csm.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ehx E = csm.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ehx F = csm.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ehx G = csm.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ehx H = csm.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ehx I = csm.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ehx J = csm.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ehx K = csm.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ehx L = csm.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ehx M = csm.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ehx N = csm.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ehx[] O = a(true);
   private static final ehx[] P = a(false);

   private static ehx[] a(boolean $$0) {
      return Arrays.stream(ha.values()).map($$1 -> a($$1, $$0)).toArray(ehx[]::new);
   }

   private static ehx a(ha $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ehu.a(j, $$1 ? J : D);
         case b:
            return ehu.a(i, $$1 ? I : n);
         case c:
            return ehu.a(h, $$1 ? L : F);
         case d:
            return ehu.a(g, $$1 ? K : E);
         case e:
            return ehu.a(f, $$1 ? N : H);
         case f:
            return ehu.a(e, $$1 ? M : G);
      }
   }

   public deu(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, dgc.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dfa $$0) {
      return true;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return ($$0.c(c) ? O : P)[$$0.c(a).ordinal()];
   }

   private boolean a(dfa $$0, dfa $$1) {
      csm $$2 = $$0.c(b) == dgc.a ? csn.by : csn.br;
      return $$1.a($$2) && $$1.c(det.b) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, cbn $$3) {
      if (!$$0.B && $$3.fR().d) {
         gu $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         gu $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      dfa $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(csn.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      if ($$0.a((cpp)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy($$2.c(b) == dgc.b ? csn.br : csn.by);
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dfa a(dfa $$0, cxh $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
