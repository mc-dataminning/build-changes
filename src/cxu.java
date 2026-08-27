import com.mojang.serialization.MapCodec;

public class cxu extends cwi implements cwc {
   public static final MapCodec<cxu> d = b(cxu::new);
   public static final int e = 7;
   public static final djp f = djf.av;
   private static final elu[] a = new elu[]{
      cvz.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cvz.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends cxu> a() {
      return d;
   }

   protected cxu(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.a(cwb.cC);
   }

   protected djp b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dip $$0) {
      return $$0.c(this.b());
   }

   public dip b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dip $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   public boolean e_(dip $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
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

   public void a(csy $$0, hv $$1, dip $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(csy $$0) {
      return aty.a($$0.z, 2, 5);
   }

   protected static float a(cvz $$0, cse $$1, hv $$2) {
      float $$3 = 1.0F;
      hv $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dip $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cwb.cC)) {
               $$7 = 1.0F;
               if ($$8.c(cyw.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      hv $$9 = $$2.e();
      hv $$10 = $$2.f();
      hv $$11 = $$2.g();
      hv $$12 = $$2.h();
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
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(ctb $$0, hv $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if ($$3 instanceof cce && $$1.Y().b(csu.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected csx d() {
      return cmk.ps;
   }

   @Override
   public cmh a(ctb $$0, hv $$1, dip $$2) {
      return new cmh(this.d());
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      this.a((csy)$$0, $$2, $$3);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(f);
   }
}
