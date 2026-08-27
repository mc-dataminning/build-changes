public class cuo extends ctf implements csz {
   public static final int c = 7;
   public static final dgl d = dgb.av;
   private static final eii[] a = new eii[]{
      csx.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      csx.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   protected cuo(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(this.a(), Integer.valueOf(0)));
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean d(dfl $$0, cpd $$1, gw $$2) {
      return $$0.a(csy.cC);
   }

   protected dgl a() {
      return d;
   }

   public int b() {
      return 7;
   }

   public int g(dfl $$0) {
      return $$0.c(this.a());
   }

   public dfl b(int $$0) {
      return this.n().a(this.a(), Integer.valueOf($$0));
   }

   public final boolean h(dfl $$0) {
      return this.g($$0) >= this.b();
   }

   @Override
   public boolean e_(dfl $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$1.b($$2, 0) >= 9) {
         int $$4 = this.g($$0);
         if ($$4 < this.b()) {
            float $$5 = a(this, $$1, $$2);
            if ($$3.a((int)(25.0F / $$5) + 1) == 0) {
               $$1.a($$2, this.b($$4 + 1), 2);
            }
         }
      }
   }

   public void a(cpx $$0, gw $$1, dfl $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.b();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cpx $$0) {
      return ary.a($$0.z, 2, 5);
   }

   protected static float a(csx $$0, cpd $$1, gw $$2) {
      float $$3 = 1.0F;
      gw $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dfl $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(csy.cC)) {
               $$7 = 1.0F;
               if ($$8.c(cvq.a) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      gw $$9 = $$2.e();
      gw $$10 = $$2.f();
      gw $$11 = $$2.g();
      gw $$12 = $$2.h();
      boolean $$13 = $$1.a_($$11).a($$0) || $$1.a_($$12).a($$0);
      boolean $$14 = $$1.a_($$9).a($$0) || $$1.a_($$10).a($$0);
      if ($$13 && $$14) {
         $$3 /= 2.0F;
      } else {
         boolean $$15 = $$1.a_($$11.e()).a($$0) || $$1.a_($$12.e()).a($$0) || $$1.a_($$12.f()).a($$0) || $$1.a_($$11.f()).a($$0);
         if ($$15) {
            $$3 /= 2.0F;
         }
      }

      return $$3;
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cqa $$0, gw $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, bis $$3) {
      if ($$3 instanceof bzp && $$1.X().b(cpt.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cpw c() {
      return cjk.oH;
   }

   @Override
   public cjh a(cpd $$0, gw $$1, dfl $$2) {
      return new cjh(this.c());
   }

   @Override
   public boolean a(cqa $$0, gw $$1, dfl $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cpx $$0, ase $$1, gw $$2, dfl $$3) {
      return true;
   }

   @Override
   public void a(aks $$0, ase $$1, gw $$2, dfl $$3) {
      this.a((cpx)$$0, $$2, $$3);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(d);
   }
}
