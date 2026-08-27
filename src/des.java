import java.util.Arrays;

public class des extends cuj {
   public static final dfw<dga> b = dfo.bg;
   public static final dfp c = dfo.x;
   public static final float d = 4.0F;
   protected static final ehy e = csk.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehy f = csk.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final ehy g = csk.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final ehy h = csk.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final ehy i = csk.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final ehy j = csk.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float k = 2.0F;
   protected static final float l = 6.0F;
   protected static final float m = 10.0F;
   protected static final ehy n = csk.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ehy D = csk.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final ehy E = csk.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final ehy F = csk.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final ehy G = csk.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ehy H = csk.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final ehy I = csk.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final ehy J = csk.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ehy K = csk.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final ehy L = csk.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final ehy M = csk.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final ehy N = csk.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final ehy[] O = a(true);
   private static final ehy[] P = a(false);

   private static ehy[] a(boolean $$0) {
      return Arrays.stream(hb.values()).map($$1 -> a($$1, $$0)).toArray(ehy[]::new);
   }

   private static ehy a(hb $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return ehv.a(j, $$1 ? J : D);
         case b:
            return ehv.a(i, $$1 ? I : n);
         case c:
            return ehv.a(h, $$1 ? L : F);
         case d:
            return ehv.a(g, $$1 ? K : E);
         case e:
            return ehv.a(f, $$1 ? N : H);
         case f:
            return ehv.a(e, $$1 ? M : G);
      }
   }

   public des(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.c).a(b, dga.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dey $$0) {
      return true;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return ($$0.c(c) ? O : P)[$$0.c(a).ordinal()];
   }

   private boolean a(dey $$0, dey $$1) {
      csk $$2 = $$0.c(b) == dga.a ? csl.by : csl.br;
      return $$1.a($$2) && $$1.c(der.b) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, cbl $$3) {
      if (!$$0.B && $$3.fR().d) {
         gv $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, dey $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         gv $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      dey $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(csl.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if ($$0.a((cpn)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return new ciw($$2.c(b) == dga.b ? csl.br : csl.by);
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
