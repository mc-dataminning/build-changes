import com.mojang.serialization.MapCodec;

public class dmb extends dko implements dkh {
   public static final MapCodec<dmb> d = b(dmb::new);
   public static final int e = 7;
   public static final dym f = dyd.aw;
   private static final fcm[] a = new fcm[]{
      dke.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dke.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dmb> a() {
      return d;
   }

   protected dmb(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.a(dkg.cK);
   }

   protected dym b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dxn $$0) {
      return $$0.c(this.b());
   }

   public dxn b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dxn $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dxn $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
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

   public void a(dha $$0, jh $$1, dxn $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dha $$0) {
      return bae.a($$0.A, 2, 5);
   }

   protected static float a(dke $$0, dgf $$1, jh $$2) {
      float $$3 = 1.0F;
      jh $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dxn $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dkg.cK)) {
               $$7 = 1.0F;
               if ($$8.c(dnc.b) > 0) {
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
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dhd $$0, jh $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if ($$1 instanceof ash $$4 && $$3 instanceof cmx && $$4.N().b(dgw.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dgz d() {
      return cxo.pR;
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk(this.d());
   }

   @Override
   public boolean b(dhd $$0, jh $$1, dxn $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dha $$0, bam $$1, jh $$2, dxn $$3) {
      return true;
   }

   @Override
   public void a(ash $$0, bam $$1, jh $$2, dxn $$3) {
      this.a((dha)$$0, $$2, $$3);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(f);
   }
}
