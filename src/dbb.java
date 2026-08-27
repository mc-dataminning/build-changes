public class dbb extends ctf implements csz {
   private static final float c = 0.003F;
   public static final int a = 3;
   public static final dgl b = dgb.as;
   private static final eii d = csx.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eii e = csx.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public dbb(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh(cjk.vv);
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      if ($$0.c(b) == 0) {
         return d;
      } else {
         return $$0.c(b) < 3 ? e : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dfl $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dfl $$5 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(djv.c, $$2, djv.a.a($$5));
      }
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if ($$3 instanceof bji && $$3.ag() != biw.N && $$3.ag() != biw.h) {
         $$3.a($$0, new ehp(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(b) > 0 && ($$3.ac != $$3.dq() || $$3.ae != $$3.dw())) {
            double $$4 = Math.abs($$3.dq() - $$3.ac);
            double $$5 = Math.abs($$3.dw() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ag().s(), 1.0F);
            }
         }
      }
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      int $$6 = $$0.c(b);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(cjk.qK)) {
         return bha.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new cjh(cjk.vv, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, apf.xF, apg.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dfl $$9 = $$0.a(b, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(djv.c, $$2, djv.a.a($$3, $$9));
         return bha.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return $$2.c(b) < 3;
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      int $$4 = Math.min(3, $$3.c(b) + 1);
      $$0.a($$2, $$3.a(b, Integer.valueOf($$4)), 2);
   }
}
