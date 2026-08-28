import com.mojang.serialization.MapCodec;

public class dje extends dhs implements dhm {
   public static final MapCodec<dje> d = b(dje::new);
   public static final int e = 7;
   public static final dvo f = dve.av;
   private static final ezm[] a = new ezm[]{
      dhj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dhj.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dje> a() {
      return d;
   }

   protected dje(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(duo $$0, ddl $$1, je $$2) {
      return $$0.a(dhl.cC);
   }

   protected dvo b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(duo $$0) {
      return $$0.c(this.b());
   }

   public duo b(int $$0) {
      return this.o().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(duo $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(duo $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
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

   public void a(deg $$0, je $$1, duo $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(deg $$0) {
      return azd.a($$0.z, 2, 5);
   }

   protected static float a(dhj $$0, ddl $$1, je $$2) {
      float $$3 = 1.0F;
      je $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            duo $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dhl.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dkg.b) > 0) {
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
   protected boolean a(duo $$0, dej $$1, je $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dej $$0, je $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if ($$3 instanceof clf && $$1.ac().b(dec.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected def d() {
      return cvt.pw;
   }

   @Override
   public cvp a(dej $$0, je $$1, duo $$2) {
      return new cvp(this.d());
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      this.a((deg)$$0, $$2, $$3);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(f);
   }
}
