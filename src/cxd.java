import javax.annotation.Nullable;

public class cxd extends cyz implements czm {
   public static final dfz a = dfp.at;
   public static final int b = 4;
   private static final ehw[] g = new ehw[]{
      csl.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      csl.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      csl.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      csl.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      csl.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dfq h = dfp.C;
   public static final dfq c = dfp.j;
   private static final float i = 0.85F;

   public cxd(dey.d $$0) {
      super(new dem(0.85F), $$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(a, Integer.valueOf(0)).a(h, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(d).a(a).a(h).a(c);
   }

   @Override
   protected boolean d(dez $$0, cor $$1, gu $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(csm.dR);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      eac $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ead.c;
      return super.a($$0).a(h, Boolean.valueOf($$2)).a(a, Integer.valueOf(4));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      ehd $$4 = $$0.n($$1, $$2);
      ehw $$5;
      if (!$$0.c(c)) {
         $$5 = g[4];
      } else {
         $$5 = g[$$0.c(a)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(csm.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return $$1 == ha.b && !$$0.a($$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(h) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!h($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!n($$0)) {
            $$1.a($$2, $$0.a(a), 2);
         }
      }
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(a), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dez $$0) {
      return $$0.c(c);
   }

   private static boolean n(dez $$0) {
      return $$0.c(a) == 4;
   }

   public static dez b() {
      return b(0);
   }

   public static dez b(int $$0) {
      return csm.E.n().a(c, Boolean.valueOf(true)).a(a, Integer.valueOf($$0));
   }
}
