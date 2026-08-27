import com.mojang.serialization.MapCodec;

public class cvt extends cuj implements cud {
   public static final MapCodec<cvt> d = b(cvt::new);
   public static final int e = 7;
   public static final dhb f = dgr.av;
   private static final eiy[] a = new eiy[]{
      cua.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cua.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends cvt> a() {
      return d;
   }

   protected cvt(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean d(dgb $$0, cqf $$1, ht $$2) {
      return $$0.a(cuc.cC);
   }

   protected dhb b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dgb $$0) {
      return $$0.c(this.b());
   }

   public dgb b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dgb $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   public boolean e_(dgb $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dgb $$0, alq $$1, ht $$2, ate $$3) {
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

   public void a(cqz $$0, ht $$1, dgb $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cqz $$0) {
      return asy.a($$0.z, 2, 5);
   }

   protected static float a(cua $$0, cqf $$1, ht $$2) {
      float $$3 = 1.0F;
      ht $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dgb $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cuc.cC)) {
               $$7 = 1.0F;
               if ($$8.c(cwv.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      ht $$9 = $$2.e();
      ht $$10 = $$2.f();
      ht $$11 = $$2.g();
      ht $$12 = $$2.h();
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
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(crc $$0, ht $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if ($$3 instanceof caq && $$1.X().b(cqv.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cqy d() {
      return ckm.oH;
   }

   @Override
   public ckj a(crc $$0, ht $$1, dgb $$2) {
      return new ckj(this.d());
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      this.a((cqz)$$0, $$2, $$3);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(f);
   }
}
