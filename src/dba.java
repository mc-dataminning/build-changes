import com.mojang.serialization.MapCodec;

public class dba extends czo implements czi {
   public static final MapCodec<dba> d = b(dba::new);
   public static final int e = 7;
   public static final dne f = dmu.av;
   private static final epo[] a = new epo[]{
      czf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dba> a() {
      return d;
   }

   protected dba(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.a(czh.cC);
   }

   protected dne b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dme $$0) {
      return $$0.c(this.b());
   }

   public dme b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dme $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean e_(dme $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
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

   public void a(cwe $$0, ib $$1, dme $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cwe $$0) {
      return awm.a($$0.z, 2, 5);
   }

   protected static float a(czf $$0, cvk $$1, ib $$2) {
      float $$3 = 1.0F;
      ib $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dme $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(czh.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dcc.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      ib $$9 = $$2.e();
      ib $$10 = $$2.f();
      ib $$11 = $$2.g();
      ib $$12 = $$2.h();
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
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cwh $$0, ib $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      if ($$3 instanceof cfl && $$1.Z().b(cwa.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cwd d() {
      return cpt.pu;
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return new cpq(this.d());
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      this.a((cwe)$$0, $$2, $$3);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(f);
   }
}
