import com.mojang.serialization.MapCodec;

public class dmq extends dle implements dkx {
   public static final MapCodec<dmq> d = b(dmq::new);
   public static final int e = 7;
   public static final dzm f = dzc.ay;
   private static final fdo[] a = dku.a(7, $$0 -> dku.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<? extends dmq> a() {
      return d;
   }

   protected dmq(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a(dkw.cK);
   }

   protected dzm b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dym $$0) {
      return $$0.c(this.b());
   }

   public dym b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dym $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dym $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
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

   public void a(dhp $$0, jj $$1, dym $$2) {
      int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dhp $$0) {
      return azk.a($$0.A, 2, 5);
   }

   protected static float a(dku $$0, dgv $$1, jj $$2) {
      float $$3 = 1.0F;
      jj $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dym $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dkw.cK)) {
               $$7 = 1.0F;
               if ($$8.c(dns.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      jj $$9 = $$2.f();
      jj $$10 = $$2.g();
      jj $$11 = $$2.h();
      jj $$12 = $$2.i();
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
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dhs $$0, jj $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if ($$1 instanceof arn $$4 && $$3 instanceof cno && $$4.O().c(dhl.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dho d() {
      return cyc.qe;
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return new cxy(this.d());
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      this.a((dhp)$$0, $$2, $$3);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(f);
   }
}
