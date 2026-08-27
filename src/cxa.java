import com.mojang.serialization.MapCodec;

public class cxa extends cvo implements cvi {
   public static final MapCodec<cxa> d = b(cxa::new);
   public static final int e = 7;
   public static final din f = did.av;
   private static final eks[] a = new eks[]{
      cvf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cvf.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends cxa> a() {
      return d;
   }

   protected cxa(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.a(cvh.cC);
   }

   protected din b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dhn $$0) {
      return $$0.c(this.b());
   }

   public dhn b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dhn $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   public boolean e_(dhn $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.b($$2, 0) >= 9) {
         int $$4 = this.g($$0);
         if ($$4 < this.c()) {
            float $$5 = a(this, $$1, $$2);
            if ($$3.a((int)(25.0F / $$5) + 1) == 0) {
               $$1.a($$2, this.b($$4 + 1), 2);
            }
         }
      }
   }

   public void a(csf $$0, hx $$1, dhn $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(csf $$0) {
      return atq.a($$0.z, 2, 5);
   }

   protected static float a(cvf $$0, crl $$1, hx $$2) {
      float $$3 = 1.0F;
      hx $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dhn $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cvh.cC)) {
               $$7 = 1.0F;
               if ($$8.c(cyc.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      hx $$9 = $$2.e();
      hx $$10 = $$2.f();
      hx $$11 = $$2.g();
      hx $$12 = $$2.h();
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
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(csi $$0, hx $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if ($$3 instanceof cbs && $$1.Y().b(csb.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cse d() {
      return clr.ps;
   }

   @Override
   public clo a(csi $$0, hx $$1, dhn $$2) {
      return new clo(this.d());
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return true;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      this.a((csf)$$0, $$2, $$3);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(f);
   }
}
