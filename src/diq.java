import com.mojang.serialization.MapCodec;

public class diq extends dhe implements dgy {
   public static final MapCodec<diq> d = b(diq::new);
   public static final int e = 7;
   public static final dva f = duq.av;
   private static final eyx[] a = new eyx[]{
      dgv.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dgv.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends diq> a() {
      return d;
   }

   protected diq(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.a(dgx.cC);
   }

   protected dva b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dua $$0) {
      return $$0.c(this.b());
   }

   public dua b(int $$0) {
      return this.o().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dua $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dua $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
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

   public void a(dds $$0, je $$1, dua $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dds $$0) {
      return azc.a($$0.z, 2, 5);
   }

   protected static float a(dgv $$0, dcx $$1, je $$2) {
      float $$3 = 1.0F;
      je $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dua $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dgx.cC)) {
               $$7 = 1.0F;
               if ($$8.c(djs.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      je $$9 = $$2.f();
      je $$10 = $$2.g();
      je $$11 = $$2.h();
      je $$12 = $$2.i();
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
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(ddv $$0, je $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if ($$3 instanceof cla && $$1.ac().b(ddo.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected ddr d() {
      return cvo.pw;
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return new cvl(this.d());
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      this.a((dds)$$0, $$2, $$3);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(f);
   }
}
