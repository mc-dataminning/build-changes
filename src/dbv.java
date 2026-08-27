import java.util.Arrays;

public class dbv extends crm {
   public static final dcz<ddd> b = dcr.bg;
   public static final dcs c = dcr.x;
   public static final float d = 4.0F;
   protected static final efb e = cpn.a(12.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   protected static final efb f = cpn.a(0.0, 0.0, 0.0, 4.0, 16.0, 16.0);
   protected static final efb g = cpn.a(0.0, 0.0, 12.0, 16.0, 16.0, 16.0);
   protected static final efb h = cpn.a(0.0, 0.0, 0.0, 16.0, 16.0, 4.0);
   protected static final efb i = cpn.a(0.0, 12.0, 0.0, 16.0, 16.0, 16.0);
   protected static final efb j = cpn.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0);
   protected static final float k = 2.0F;
   protected static final float l = 6.0F;
   protected static final float m = 10.0F;
   protected static final efb n = cpn.a(6.0, -4.0, 6.0, 10.0, 12.0, 10.0);
   protected static final efb D = cpn.a(6.0, 4.0, 6.0, 10.0, 20.0, 10.0);
   protected static final efb E = cpn.a(6.0, 6.0, -4.0, 10.0, 10.0, 12.0);
   protected static final efb F = cpn.a(6.0, 6.0, 4.0, 10.0, 10.0, 20.0);
   protected static final efb G = cpn.a(-4.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final efb H = cpn.a(4.0, 6.0, 6.0, 20.0, 10.0, 10.0);
   protected static final efb I = cpn.a(6.0, 0.0, 6.0, 10.0, 12.0, 10.0);
   protected static final efb J = cpn.a(6.0, 4.0, 6.0, 10.0, 16.0, 10.0);
   protected static final efb K = cpn.a(6.0, 6.0, 0.0, 10.0, 10.0, 12.0);
   protected static final efb L = cpn.a(6.0, 6.0, 4.0, 10.0, 10.0, 16.0);
   protected static final efb M = cpn.a(0.0, 6.0, 6.0, 12.0, 10.0, 10.0);
   protected static final efb N = cpn.a(4.0, 6.0, 6.0, 16.0, 10.0, 10.0);
   private static final efb[] O = a(true);
   private static final efb[] P = a(false);

   private static efb[] a(boolean $$0) {
      return Arrays.stream(ha.values()).map($$1 -> a($$1, $$0)).toArray(efb[]::new);
   }

   private static efb a(ha $$0, boolean $$1) {
      switch ($$0) {
         case a:
         default:
            return eey.a(j, $$1 ? J : D);
         case b:
            return eey.a(i, $$1 ? I : n);
         case c:
            return eey.a(h, $$1 ? L : F);
         case d:
            return eey.a(g, $$1 ? K : E);
         case e:
            return eey.a(f, $$1 ? N : H);
         case f:
            return eey.a(e, $$1 ? M : G);
      }
   }

   public dbv(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.c).a(b, ddd.a).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(dcb $$0) {
      return true;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return ($$0.c(c) ? O : P)[$$0.c(a).ordinal()];
   }

   private boolean a(dcb $$0, dcb $$1) {
      cpn $$2 = $$0.c(b) == ddd.a ? cpo.by : cpo.br;
      return $$1.a($$2) && $$1.c(dbu.b) && $$1.c(a) == $$0.c(a);
   }

   @Override
   public void a(cmm $$0, gu $$1, dcb $$2, byo $$3) {
      if (!$$0.B && $$3.fO().d) {
         gu $$4 = $$1.a($$2.c(a).g());
         if (this.a($$2, $$0.a_($$4))) {
            $$0.b($$4, false);
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, dcb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         super.a($$0, $$1, $$2, $$3, $$4);
         gu $$5 = $$2.a($$0.c(a).g());
         if (this.a($$0, $$1.a_($$5))) {
            $$1.b($$5, true);
         }
      }
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return $$1.g() == $$0.c(a) && !$$0.a($$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      dcb $$3 = $$1.a_($$2.a($$0.c(a).g()));
      return this.a($$0, $$3) || $$3.a(cpo.bQ) && $$3.c(a) == $$0.c(a);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, cpn $$3, gu $$4, boolean $$5) {
      if ($$0.a((cmp)$$1, $$2)) {
         $$1.a($$2.a($$0.c(a).g()), $$3, $$4);
      }
   }

   @Override
   public cfz a(cls $$0, gu $$1, dcb $$2) {
      return new cfz($$2.c(b) == ddd.b ? cpo.br : cpo.by);
   }

   @Override
   public dcb a(dcb $$0, cvz $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dcb a(dcb $$0, cui $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
