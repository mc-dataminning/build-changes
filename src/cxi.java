import javax.annotation.Nullable;

public class cxi extends cze implements czr {
   public static final dge a = dfu.at;
   public static final int b = 4;
   private static final eib[] g = new eib[]{
      csq.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0),
      csq.a(7.0, 10.0, 7.0, 9.0, 16.0, 9.0),
      csq.a(7.0, 7.0, 7.0, 9.0, 16.0, 9.0),
      csq.a(7.0, 3.0, 7.0, 9.0, 16.0, 9.0),
      csq.a(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)
   };
   private static final dfv h = dfu.C;
   public static final dfv c = dfu.j;
   private static final float i = 0.85F;

   public cxi(dfd.d $$0) {
      super(new der(0.85F), $$0);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(a, Integer.valueOf(0)).a(h, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(d).a(a).a(h).a(c);
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return super.d($$0, $$1, $$2) || $$0.a(csr.dR);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eai.c;
      return super.a($$0).a(h, Boolean.valueOf($$2)).a(a, Integer.valueOf(4));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      ehi $$4 = $$0.n($$1, $$2);
      eib $$5;
      if (!$$0.c(c)) {
         $$5 = g[4];
      } else {
         $$5 = g[$$0.c(a)];
      }

      return $$5.a($$4.c, $$4.d, $$4.e);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return h($$0) ? $$1.a_($$2.c()).a(csr.aL) : super.a($$0, $$1, $$2);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(h)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return $$1 == hc.b && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(h) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
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
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return !h($$2) || !n($$2);
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return h($$3) ? !n($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      if (h($$3) && !n($$3)) {
         $$0.a($$2, $$3.a(a), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean h(dfe $$0) {
      return $$0.c(c);
   }

   private static boolean n(dfe $$0) {
      return $$0.c(a) == 4;
   }

   public static dfe b() {
      return b(0);
   }

   public static dfe b(int $$0) {
      return csr.E.n().a(c, Boolean.valueOf(true)).a(a, Integer.valueOf($$0));
   }
}
