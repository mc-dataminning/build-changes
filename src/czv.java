import javax.annotation.Nullable;

public class czv extends cuu implements css, czr {
   private static final dfv e = dfu.C;
   public static final dfy b = dfu.R;
   protected static final float c = 6.0F;
   protected static final eib d = csq.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public czv(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dga.b).a(e, Boolean.valueOf(false)).a(b, hc.c));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return d;
   }

   @Override
   protected boolean d(dfe $$0, cow $$1, gw $$2) {
      return $$0.a(apo.bw) || $$1.b_($$2.c()).a(eai.c) && super.d($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.a(b, $$0.g().g())) : null;
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, bjb $$3, cja $$4) {
      if (!$$0.r_()) {
         gw $$5 = $$1.c();
         dfe $$6 = cuu.b($$0, $$5, this.n().a(a, dga.a).a(b, $$2.c(b)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(e) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      if ($$0.c(a) == dga.a) {
         return super.a($$0, $$1, $$2);
      } else {
         gw $$3 = $$2.d();
         dfe $$4 = $$1.a_($$3);
         return this.d($$4, $$1, $$3);
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, e, b);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return true;
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      if ($$3.c(cuu.a) == dga.b) {
         gw $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         csn.a($$0, $$1, $$2, $$3.c(b));
      } else {
         gw $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public float am_() {
      return 0.1F;
   }
}
