import javax.annotation.Nullable;

public class cxp extends czl implements czy {
   public static final dgl a = dgb.at;
   public static final int b = 4;
   private static final eii[] g = new eii[]{
      csx.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      csx.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      csx.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      csx.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      csx.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dgc h = dgb.C;
   public static final dgc c = dgb.j;
   private static final float i = 0.85F;

   public cxp(dfk.d $$0) {
      super(new dey(0.85F), $$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(a, Integer.valueOf(0)).a(h, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(d).a(a).a(h).a(c);
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(csy.dR);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      eao $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eap.c;
      return super.a($$0).a(h, Boolean.valueOf($$2)).a(a, Integer.valueOf(4));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      ehp $$4 = $$0.n($$1, $$2);
      eii $$5;
      if (!$$0.c(c)) {
         $$5 = g[4];
      } else {
         $$5 = g[$$0.c(a)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(csy.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return $$1 == hc.b && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(h) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
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
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(a), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dfl $$0) {
      return $$0.c(c);
   }

   private static boolean n(dfl $$0) {
      return $$0.c(a) == 4;
   }

   public static dfl b() {
      return b(0);
   }

   public static dfl b(int $$0) {
      return csy.E.n().a(c, Boolean.valueOf(true)).a(a, Integer.valueOf($$0));
   }
}
