import javax.annotation.Nullable;

public class cxn extends czj implements czw {
   public static final dgj a = dfz.at;
   public static final int b = 4;
   private static final eig[] g = new eig[]{
      csv.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      csv.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      csv.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      csv.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      csv.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dga h = dfz.C;
   public static final dga c = dfz.j;
   private static final float i = 0.85F;

   public cxn(dfi.d $$0) {
      super(new dew(0.85F), $$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(a, Integer.valueOf(0)).a(h, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(d).a(a).a(h).a(c);
   }

   @Override
   protected boolean d(dfj $$0, cpb $$1, gw $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(csw.dR);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      eam $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ean.c;
      return super.a($$0).a(h, Boolean.valueOf($$2)).a(a, Integer.valueOf(4));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      ehn $$4 = $$0.n($$1, $$2);
      eig $$5;
      if (!$$0.c(c)) {
         $$5 = g[4];
      } else {
         $$5 = g[$$0.c(a)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(csw.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, ean.c, ean.c.a($$3));
      }

      return $$1 == hc.b && !$$0.a($$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eam c_(dfj $$0) {
      return $$0.c(h) ? ean.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dfj $$0, akr $$1, gw $$2, asc $$3) {
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
   public boolean a(cpy $$0, gw $$1, dfj $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(cpv $$0, asc $$1, gw $$2, dfj $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(akr $$0, asc $$1, gw $$2, dfj $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(a), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dfj $$0) {
      return $$0.c(c);
   }

   private static boolean n(dfj $$0) {
      return $$0.c(a) == 4;
   }

   public static dfj b() {
      return b(0);
   }

   public static dfj b(int $$0) {
      return csw.E.n().a(c, Boolean.valueOf(true)).a(a, Integer.valueOf($$0));
   }
}
