public class cxc extends cyy implements czr {
   public static final dfv b = dfu.C;
   public static final dfv c = dfu.w;
   private static final int j = 8;
   public static final int d = 128;
   private static final int k = 200;

   public cxc(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.b).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eai.c;
      return this.n().a(a, $$0.k()).a(b, Boolean.valueOf($$2));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(b) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   public int b(dfe $$0, cow $$1, gw $$2, hc $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dfe $$0, cpq $$1, gw $$2) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dfe $$0, cpq $$1, gw $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$1.Y() && (long)$$1.z.a(200) <= $$1.V() % 200L && $$2.v() == $$1.a(dkn.a.b, $$2.u(), $$2.w()) - 1) {
         arv.a($$0.c(a).o(), $$1, $$2, 0.125, ix.aN, bge.a(1, 2));
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dfe $$0, cpq $$1, gw $$2, dfe $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(c) && !$$1.L().a($$2, this)) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(cpq $$0, dfe $$1, ehe $$2, cch $$3) {
      if ($$0.Y() && $$3 instanceof cct && ((cct)$$3).D()) {
         gw $$4 = $$2.a();
         if ($$0.g($$4)) {
            bja $$5 = bip.ai.a($$0);
            if ($$5 != null) {
               $$5.d(ehi.c($$4.c()));
               bil $$6 = $$3.v();
               $$5.b($$6 instanceof ako ? (ako)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, aoz.xU, apa.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, c, b);
   }

   @Override
   public boolean f_(dfe $$0) {
      return true;
   }
}
