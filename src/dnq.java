import com.mojang.serialization.MapCodec;

public class dnq extends dme implements dlx {
   public static final MapCodec<dnq> d = b(dnq::new);
   public static final int e = 7;
   public static final eao f = eae.ay;
   private static final feq[] a = dlu.a(7, $$0 -> dlu.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<? extends dnq> a() {
      return d;
   }

   protected dnq(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dzo $$0, dhv $$1, iu $$2) {
      return $$0.a(dlw.cK);
   }

   protected eao b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dzo $$0) {
      return $$0.c(this.b());
   }

   public dzo b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dzo $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dzo $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
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

   public void a(dip $$0, iu $$1, dzo $$2) {
      int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dip $$0) {
      return azk.a($$0.A, 2, 5);
   }

   protected static float a(dlu $$0, dhv $$1, iu $$2) {
      float $$3 = 1.0F;
      iu $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dzo $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dlw.cK)) {
               $$7 = 1.0F;
               if ($$8.c(dos.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      iu $$9 = $$2.f();
      iu $$10 = $$2.g();
      iu $$11 = $$2.h();
      iu $$12 = $$2.i();
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
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dis $$0, iu $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      if ($$1 instanceof aro $$4 && $$3 instanceof cny && $$4.O().c(dil.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dio d() {
      return cyw.qe;
   }

   @Override
   protected cys a(dis $$0, iu $$1, dzo $$2, boolean $$3) {
      return new cys(this.d());
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      this.a((dip)$$0, $$2, $$3);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(f);
   }
}
