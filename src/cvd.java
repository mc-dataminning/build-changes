import javax.annotation.Nullable;

public class cvd extends crk<ddk> implements czr {
   public static final dfy b = cwj.aC;
   public static final dfv c = dfu.C;
   protected static final eib d = csq.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final ti e = ti.c("container.enderchest");

   protected cvd(dfd.d $$0) {
      super($$0, () -> dcs.d);
      this.k(this.C.b().a(b, hc.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cut.c<? extends dcx> a(dfe $$0, cpq $$1, gw $$2, boolean $$3) {
      return cut.b::b;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return d;
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.b;
   }

   @Override
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf($$1.a() == eai.c));
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      cfp $$6 = $$3.gd();
      dcq $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof ddk) {
         gw $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bgt.a($$1.B);
         } else if ($$1.B) {
            return bgt.a;
         } else {
            ddk $$9 = (ddk)$$7;
            $$6.a($$9);
            $$3.a(new bhb(($$1x, $$2x, $$3x) -> cen.a($$1x, $$2x, $$6), e));
            $$3.a(apj.aj);
            cag.a($$3, true);
            return bgt.b;
         }
      } else {
         return bgt.a($$1.B);
      }
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new ddk($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dcq> dcr<T> a(cpq $$0, dfe $$1, dcs<T> $$2) {
      return $$0.B ? a($$2, dcs.d, ddk::a) : null;
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
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
   public dfe a(dfe $$0, czc $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dfe a(dfe $$0, cxl $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(c) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      dcq $$4 = $$1.c_($$2);
      if ($$4 instanceof ddk) {
         ((ddk)$$4).c();
      }
   }
}
