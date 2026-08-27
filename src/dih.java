import com.mojang.serialization.MapCodec;

public class dih extends dfc implements coy {
   public static final MapCodec<dih> a = b(dih::new);
   public static final dtw b = dhg.a;
   public static final dtt c = dts.A;

   @Override
   protected MapCodec<dih> a() {
      return a;
   }

   protected dih(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, iw.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public dtc a(cyd $$0) {
      return this.n().a(b, $$0.d());
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, dfc $$3, ir $$4, boolean $$5) {
      boolean $$6 = a(dhj.a($$1, $$2), $$1, $$2);
      boolean $$7 = $$0.c(c);
      if ($$6 != $$7) {
         if ($$6) {
            $$1.a($$2, this, 1);
            $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         } else {
            $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
         }
      }
   }

   private static boolean a(boolean $$0, dca $$1, ir $$2) {
      return $$0 && $$1.C($$2);
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      iw $$4 = $$0.c(b);
      cpc $$5 = cpc.a($$1, $$2, $$4);
      if ($$5 != null) {
         coz $$6 = new coz(bsb.bH, $$1);
         ir $$7 = $$5.c();
         $$6.e((double)$$7.u(), (double)$$7.v(), (double)$$7.w());
         $$6.r().a($$5.a());
         $$6.r().a($$1.t($$2));
         $$6.a($$4, (float)$$5.d() * 0.1F);
         $$5.a($$1);
         $$1.b($$6);
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c);
   }

   @Override
   public void a(dca $$0, cpb $$1, dtc $$2, ir $$3, ewu $$4, iw $$5) {
      if ($$0.C) {
         iw $$6 = $$2.c(b);
         if ($$5 == $$6 && $$2.c(c) && $$0.F_().h()) {
            iw $$7 = $$6.g();
            if ($$1.b($$3.a($$7)).i()) {
               double $$8 = 0.5;
               $$4 = $$4.b(0.5, 0.5, 0.5).b((double)$$7.j() * 0.5, (double)$$7.k() * 0.5, (double)$$7.l() * 0.5);
               $$0.a(lb.e, $$4.c, $$4.d, $$4.e, 0.0, 0.0, 0.0);
            }
         }
      }
   }
}
