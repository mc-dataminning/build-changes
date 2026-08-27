import javax.annotation.Nullable;

public class dac extends cvb implements csz, czy {
   private static final dgc e = dgb.C;
   public static final dgf b = dgb.R;
   protected static final float c = 6.0F;
   protected static final eii d = csx.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   public dac(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgh.b).a(e, Boolean.valueOf(false)).a(b, hc.c));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return d;
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return $$0.a(apu.bw) || $$1.b_($$2.c()).a(eap.c) && super.d($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      dfl $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.a(b, $$0.g().g())) : null;
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bji $$3, cjh $$4) {
      if (!$$0.w_()) {
         gw $$5 = $$1.c();
         dfl $$6 = cvb.b($$0, $$5, this.n().a(a, dgh.a).a(b, $$2.c(b)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(e) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      if ($$0.c(a) == dgh.a) {
         return super.a($$0, $$1, $$2);
      } else {
         gw $$3 = $$2.d();
         dfl $$4 = $$1.a_($$3);
         return this.d($$4, $$1, $$3);
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, e, b);
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return true;
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      if ($$3.c(cvb.a) == dgh.b) {
         gw $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         csu.a($$0, $$1, $$2, $$3.c(b));
      } else {
         gw $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   public dfl a(dfl $$0, czj $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfl a(dfl $$0, cxs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public float ar_() {
      return 0.1F;
   }
}
