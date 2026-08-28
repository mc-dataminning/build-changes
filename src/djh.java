import com.mojang.serialization.MapCodec;

public class djh extends dhv implements dhp {
   public static final MapCodec<djh> d = b(djh::new);
   public static final int e = 7;
   public static final dvs f = dvi.av;
   private static final ezq[] a = new ezq[]{
      dhm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dhm.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends djh> a() {
      return d;
   }

   protected djh(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.a(dho.cC);
   }

   protected dvs b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dus $$0) {
      return $$0.c(this.b());
   }

   public dus b(int $$0) {
      return this.n().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dus $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dus $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
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

   public void a(dej $$0, jf $$1, dus $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dej $$0) {
      return azf.a($$0.z, 2, 5);
   }

   protected static float a(dhm $$0, ddo $$1, jf $$2) {
      float $$3 = 1.0F;
      jf $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dus $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dho.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dkj.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      jf $$9 = $$2.f();
      jf $$10 = $$2.g();
      jf $$11 = $$2.h();
      jf $$12 = $$2.i();
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
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dem $$0, jf $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if ($$3 instanceof cli && $$1.ac().b(def.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dei d() {
      return cvw.pw;
   }

   @Override
   public cvs a(dem $$0, jf $$1, dus $$2) {
      return new cvs(this.d());
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      this.a((dej)$$0, $$2, $$3);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(f);
   }
}
