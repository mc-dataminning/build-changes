import com.mojang.serialization.MapCodec;

public class dlh extends djv implements djo {
   public static final MapCodec<dlh> d = b(dlh::new);
   public static final int e = 7;
   public static final dxv f = dxm.ay;
   private static final fbt[] a = new fbt[]{
      djl.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      djl.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dlh> a() {
      return d;
   }

   protected dlh(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dww $$0, dfm $$1, ji $$2) {
      return $$0.a(djn.cK);
   }

   protected dxv b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dww $$0) {
      return $$0.c(this.b());
   }

   public dww b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dww $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dww $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dww $$0, ard $$1, ji $$2, azh $$3) {
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

   public void a(dgh $$0, ji $$1, dww $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dgh $$0) {
      return ayz.a($$0.A, 2, 5);
   }

   protected static float a(djl $$0, dfm $$1, ji $$2) {
      float $$3 = 1.0F;
      ji $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dww $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(djn.cK)) {
               $$7 = 1.0F;
               if ($$8.c(dmj.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      ji $$9 = $$2.f();
      ji $$10 = $$2.g();
      ji $$11 = $$2.h();
      ji $$12 = $$2.i();
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
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dgk $$0, ji $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if ($$1 instanceof ard $$4 && $$3 instanceof cmc && $$4.O().b(dgd.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dgg d() {
      return cws.qa;
   }

   @Override
   protected cwo a(dgk $$0, ji $$1, dww $$2, boolean $$3) {
      return new cwo(this.d());
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      this.a((dgh)$$0, $$2, $$3);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(f);
   }
}
