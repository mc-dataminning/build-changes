public class cti extends csx {
   public static final int a = 6;
   public static final dgl b = dgb.ay;
   public static final int c = b(0);
   protected static final float d = 1.0F;
   protected static final float e = 2.0F;
   protected static final eii[] f = new eii[]{
      csx.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csx.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csx.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csx.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csx.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csx.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csx.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   protected cti(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return f[$$0.c(b)];
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      cjh $$6 = $$3.b($$4);
      cjc $$7 = $$6.d();
      if ($$6.a(aqc.ai) && $$0.c(b) == 0) {
         csx $$8 = csx.a($$7);
         if ($$8 instanceof ctl) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, apf.cK, apg.e, 1.0F, 1.0F);
            $$1.b($$2, ctm.a($$8));
            $$1.a($$3, djv.c, $$2);
            $$3.b(app.c.b($$7));
            return bha.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bha.a;
         }

         if ($$6.b()) {
            return bha.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bha a(cpy $$0, gw $$1, dfl $$2, cbw $$3) {
      if (!$$3.t(false)) {
         return bha.d;
      } else {
         $$3.a(app.U);
         $$3.gb().a(2, 0.1F);
         int $$4 = $$2.c(b);
         $$0.a($$3, djv.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(b, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, djv.f, $$1);
         }

         return bha.a;
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b);
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return b($$0.c(b));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
