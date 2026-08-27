import com.mojang.serialization.MapCodec;

public class dan extends czb implements cyv {
   public static final MapCodec<dan> d = b(dan::new);
   public static final int e = 7;
   public static final dmj f = dlz.av;
   private static final eos[] a = new eos[]{
      cys.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cys.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dan> a() {
      return d;
   }

   protected dan(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.a(cyu.cC);
   }

   protected dmj b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dlj $$0) {
      return $$0.c(this.b());
   }

   public dlj b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dlj $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean e_(dlj $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
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

   public void a(cvr $$0, hz $$1, dlj $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cvr $$0) {
      return awi.a($$0.z, 2, 5);
   }

   protected static float a(cys $$0, cux $$1, hz $$2) {
      float $$3 = 1.0F;
      hz $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dlj $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cyu.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dbp.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      hz $$9 = $$2.e();
      hz $$10 = $$2.f();
      hz $$11 = $$2.g();
      hz $$12 = $$2.h();
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
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cvu $$0, hz $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      if ($$3 instanceof cew && $$1.Z().b(cvn.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cvq d() {
      return cpg.pu;
   }

   @Override
   public cpd a(cvu $$0, hz $$1, dlj $$2) {
      return new cpd(this.d());
   }

   @Override
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return true;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      this.a((cvr)$$0, $$2, $$3);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(f);
   }
}
