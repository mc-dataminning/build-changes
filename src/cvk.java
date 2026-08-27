import javax.annotation.Nullable;

public class cvk extends crr<ddr> implements czy {
   public static final dgf b = cwq.aC;
   public static final dgc c = dgb.C;
   protected static final eii d = csx.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final tn e = tn.c("container.enderchest");

   protected cvk(dfk.d $$0) {
      super($$0, () -> dcz.d);
      this.k(this.C.b().a(b, hc.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cva.c<? extends dde> a(dfl $$0, cpx $$1, gw $$2, boolean $$3) {
      return cva.b::b;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return d;
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.b;
   }

   @Override
   public dfl a(clp $$0) {
      eao $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf($$1.a() == eap.c));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      cfw $$6 = $$3.ge();
      dcx $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof ddr) {
         gw $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bha.a($$1.B);
         } else if ($$1.B) {
            return bha.a;
         } else {
            ddr $$9 = (ddr)$$7;
            $$6.a($$9);
            $$3.a(new bhi(($$1x, $$2x, $$3x) -> ceu.a($$1x, $$2x, $$6), e));
            $$3.a(app.aj);
            can.a($$3, true);
            return bha.b;
         }
      } else {
         return bha.a($$1.B);
      }
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ddr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return $$0.B ? a($$2, dcz.d, ddr::a) : null;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(ix.X, $$7, $$8, $$9, $$10, $$11, $$12);
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
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(c) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      dcx $$4 = $$1.c_($$2);
      if ($$4 instanceof ddr) {
         ((ddr)$$4).c();
      }
   }
}
