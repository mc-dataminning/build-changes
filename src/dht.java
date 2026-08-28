import com.mojang.serialization.MapCodec;

public class dht extends dgh implements dgb {
   public static final MapCodec<dht> d = b(dht::new);
   public static final int e = 7;
   public static final duc f = dts.av;
   private static final ext[] a = new ext[]{
      dfy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dfy.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dht> a() {
      return d;
   }

   protected dht(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dtc $$0, dcc $$1, jd $$2) {
      return $$0.a(dga.cC);
   }

   protected duc b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dtc $$0) {
      return $$0.c(this.b());
   }

   public dtc b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dtc $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(dtc $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
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

   public void a(dcw $$0, jd $$1, dtc $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dcw $$0) {
      return ayo.a($$0.z, 2, 5);
   }

   protected static float a(dfy $$0, dcc $$1, jd $$2) {
      float $$3 = 1.0F;
      jd $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dtc $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dga.cC)) {
               $$7 = 1.0F;
               if ($$8.c(div.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      jd $$9 = $$2.f();
      jd $$10 = $$2.g();
      jd $$11 = $$2.h();
      jd $$12 = $$2.i();
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
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dcz $$0, jd $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if ($$3 instanceof cki && $$1.ab().b(dcs.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dcv d() {
      return cut.pv;
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq(this.d());
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      this.a((dcw)$$0, $$2, $$3);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(f);
   }
}
