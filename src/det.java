import java.util.Arrays;

public class det extends cuk {
   public static final dfx<dgb> b = dfp.bg;
   public static final dfq c = dfp.x;
   public static final float d = 4.0F;
   protected static final ehw e = csl.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehw f = csl.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ehw g = csl.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ehw h = csl.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ehw i = csl.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehw j = csl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float k = 2.0F;
   protected static final float l = 6.0F;
   protected static final float m = 10.0F;
   protected static final ehw n = csl.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ehw D = csl.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ehw E = csl.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ehw F = csl.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ehw G = csl.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ehw H = csl.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ehw I = csl.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ehw J = csl.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ehw K = csl.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ehw L = csl.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ehw M = csl.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ehw N = csl.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ehw[] O = a(true);
   private static final ehw[] P = a(false);

   private static ehw[] a(boolean $$0) {
      return Arrays.stream(ha.values()).map($$1 -> a($$1, $$0)).toArray(ehw[]::new);
   }

   private static ehw a(ha $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return eht.a(j, $$1 ? J : D);
         case b:
            return eht.a(i, $$1 ? I : n);
         case c:
            return eht.a(h, $$1 ? L : F);
         case d:
            return eht.a(g, $$1 ? K : E);
         case e:
            return eht.a(f, $$1 ? N : H);
         case f:
            return eht.a(e, $$1 ? M : G);
      }
   }

   public det(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, dgb.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dez $$0) {
      return true;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return ($$0.c(c) ? O : P)[$$0.c(a).ordinal()];
   }

   private boolean a(dez $$0, dez $$1) {
      csl $$2 = $$0.c(b) == dgb.a ? csm.by : csm.br;
      return $$1.a($$2) && $$1.c(des.b) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, cbm $$3) {
      if (!$$0.B && $$3.fR().d) {
         gu $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         gu $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      dez $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(csm.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, csl $$3, gu $$4, boolean $$5) {
      if ($$0.a((cpo)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return new cix($$2.c(b) == dgb.b ? csm.br : csm.by);
   }

   @Override
   public dez a(dez $$0, cyx $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dez a(dez $$0, cxg $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
