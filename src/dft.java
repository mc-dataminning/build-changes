import com.mojang.serialization.MapCodec;

public class dft extends deh implements deb {
   public static final MapCodec<dft> d = b(dft::new);
   public static final int e = 7;
   public static final dsb f = drr.av;
   private static final evd[] a = new evd[]{
      ddy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      ddy.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dft> a() {
      return d;
   }

   protected dft(dra.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(drb $$0, dad $$1, io $$2) {
      return $$0.a(dea.cC);
   }

   protected dsb b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(drb $$0) {
      return $$0.c(this.b());
   }

   public drb b(int $$0) {
      return this.n().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(drb $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(drb $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(drb $$0, aqm $$1, io $$2, ayk $$3) {
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

   public void a(dax $$0, io $$1, drb $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dax $$0) {
      return ayd.a($$0.z, 2, 5);
   }

   protected static float a(ddy $$0, dad $$1, io $$2) {
      float $$3 = 1.0F;
      io $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            drb $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dea.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dgv.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      io $$9 = $$2.e();
      io $$10 = $$2.f();
      io $$11 = $$2.g();
      io $$12 = $$2.h();
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
   protected boolean a(drb $$0, dba $$1, io $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dba $$0, io $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(drb $$0, dax $$1, io $$2, bru $$3) {
      if ($$3 instanceof cjh && $$1.aa().b(dat.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected daw d() {
      return ctr.pv;
   }

   @Override
   public cto a(dba $$0, io $$1, drb $$2) {
      return new cto(this.d());
   }

   @Override
   public boolean b(dba $$0, io $$1, drb $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dax $$0, ayk $$1, io $$2, drb $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayk $$1, io $$2, drb $$3) {
      this.a((dax)$$0, $$2, $$3);
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(f);
   }
}
