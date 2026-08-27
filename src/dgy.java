import com.mojang.serialization.MapCodec;

public class dgy extends dfl implements dff {
   public static final MapCodec<dgy> d = b(dgy::new);
   public static final int e = 7;
   public static final duc f = dts.av;
   private static final exn[] a = new exn[]{
      dfc.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dfc.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dgy> a() {
      return d;
   }

   protected dgy(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(dfe.dn) || $$0.a(dfe.do);
   }

   protected duc b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dtc $$0) {
      return $$0.c(this.b());
   }

   public dtc a(int $$0, dtc $$1) {
      return this.n().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dtc $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(dtc $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$1.b($$2, 0) >= 9) {
         int $$4 = this.g($$0);
         if ($$4 < this.c()) {
            float $$5 = a(this, $$1, $$2);
            if ($$0.a(dfe.ho)) {
               if ($$3.a((int)(6.25F / $$5) + 1) == 0) {
                  $$1.a($$2, this.a($$4 + 1, $$0), 2);
               }
            } else if ($$3.a((int)(25.0F / $$5) + 1) == 0) {
               $$1.a($$2, this.a($$4 + 1, $$0), 2);
            }
         }
      }
   }

   public void a(dca $$0, ir $$1, dtc $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.a($$3, $$2), 2);
   }

   protected int a(dca $$0) {
      return aym.a($$0.A, 2, 5);
   }

   protected static float a(dfc $$0, dbg $$1, ir $$2) {
      float $$3 = 1.0F;
      ir $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            ir $$8 = $$4.b($$5, 0, $$6);
            dtc $$9 = $$1.a_($$8);
            if ($$0 instanceof dfl $$10 && $$10.b($$9, $$1, $$8)) {
               $$7 = 1.0F;
               if (($$9.a(dfe.dn) || $$9.a(dfe.do)) && $$9.c(dic.b) > 0) {
                  $$7 = 3.0F;
               }

               if ($$9.a(dfe.l)) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      ir $$11 = $$2.e();
      ir $$12 = $$2.f();
      ir $$13 = $$2.g();
      ir $$14 = $$2.h();
      boolean $$15 = $$1.a_($$13).a($$0) || $$1.a_($$14).a($$0);
      boolean $$16 = $$1.a_($$11).a($$0) || $$1.a_($$12).a($$0);
      if ($$15 && $$16) {
         $$3 /= 2.0F;
      } else {
         boolean $$17 = $$1.a_($$13.e()).a($$0) || $$1.a_($$14.e()).a($$0) || $$1.a_($$14.f()).a($$0) || $$1.a_($$13.f()).a($$0);
         if ($$17) {
            $$3 /= 2.0F;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dcd $$0, ir $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dtc $$0, dca $$1, ir $$2, brv $$3) {
      if ($$3 instanceof cjj && $$1.ab().b(dbw.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dbz d() {
      return cuk.qO;
   }

   @Override
   public cuh a(dcd $$0, ir $$1, dtc $$2) {
      return new cuh(this.d());
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      this.a((dca)$$0, $$2, $$3);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(f);
   }
}
