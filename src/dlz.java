import com.mojang.serialization.MapCodec;

public class dlz extends dkn implements dkg {
   public static final MapCodec<dlz> d = b(dlz::new);
   public static final int e = 7;
   public static final dyn f = dye.ay;
   private static final fcl[] a = new fcl[]{
      dkd.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dkd.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dlz> a() {
      return d;
   }

   protected dlz(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dxo $$0, dge $$1, jh $$2) {
      return $$0.a(dkf.cK);
   }

   protected dyn b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dxo $$0) {
      return $$0.c(this.b());
   }

   public dxo b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dxo $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dxo $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$1.b($$2, 0) >= 9) {
         int $$4 = this.h($$0);
         if ($$4 < this.c()) {
            float $$5 = a(this, $$1, $$2);
            if ($$3.a((int)(25.0F / $$5) + 1) == 0) {
               $$1.a($$2, this.b($$4 + 1), 2);
            }
         }
      }
   }

   public void a(dgz $$0, jh $$1, dxo $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dgz $$0) {
      return azu.a($$0.A, 2, 5);
   }

   protected static float a(dkd $$0, dge $$1, jh $$2) {
      float $$3 = 1.0F;
      jh $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dxo $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dkf.cK)) {
               $$7 = 1.0F;
               if ($$8.c(dnb.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      jh $$9 = $$2.f();
      jh $$10 = $$2.g();
      jh $$11 = $$2.h();
      jh $$12 = $$2.i();
      boolean $$13 = $$1.a_($$11).a($$0) || $$1.a_($$12).a($$0);
      boolean $$14 = $$1.a_($$9).a($$0) || $$1.a_($$10).a($$0);
      if ($$13 && $$14) {
         $$3 /= 2.0F;
      } else {
         boolean $$15 = $$1.a_($$11.f()).a($$0) || $$1.a_($$12.f()).a($$0) || $$1.a_($$12.g()).a($$0) || $$1.a_($$11.g()).a($$0);
         if ($$15) {
            $$3 /= 2.0F;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dhc $$0, jh $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if ($$1 instanceof arx $$4 && $$3 instanceof cmt && $$4.O().b(dgv.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dgy d() {
      return cxk.qa;
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return new cxg(this.d());
   }

   @Override
   public boolean b(dhc $$0, jh $$1, dxo $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dgz $$0, bac $$1, jh $$2, dxo $$3) {
      return true;
   }

   @Override
   public void a(arx $$0, bac $$1, jh $$2, dxo $$3) {
      this.a((dgz)$$0, $$2, $$3);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(f);
   }
}
