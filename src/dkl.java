import com.mojang.serialization.MapCodec;

public class dkl extends diz implements dit {
   public static final MapCodec<dkl> d = b(dkl::new);
   public static final int e = 7;
   public static final dwu f = dwl.av;
   private static final fas[] a = new fas[]{
      diq.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      diq.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dkl> a() {
      return d;
   }

   protected dkl(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dvv $$0, der $$1, jh $$2) {
      return $$0.a(dis.cC);
   }

   protected dwu b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dvv $$0) {
      return $$0.c(this.b());
   }

   public dvv b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dvv $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dvv $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
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

   public void a(dfm $$0, jh $$1, dvv $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dfm $$0) {
      return azm.a($$0.A, 2, 5);
   }

   protected static float a(diq $$0, der $$1, jh $$2) {
      float $$3 = 1.0F;
      jh $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dvv $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dis.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dlm.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      jh $$9 = $$2.f();
      jh $$10 = $$2.g();
      jh $$11 = $$2.h();
      jh $$12 = $$2.i();
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
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dfp $$0, jh $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if ($$1 instanceof arp $$4 && $$3 instanceof cmd && $$4.N().b(dfi.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dfl d() {
      return cwq.pw;
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return new cwm(this.d());
   }

   @Override
   public boolean b(dfp $$0, jh $$1, dvv $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dfm $$0, azu $$1, jh $$2, dvv $$3) {
      return true;
   }

   @Override
   public void a(arp $$0, azu $$1, jh $$2, dvv $$3) {
      this.a((dfm)$$0, $$2, $$3);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(f);
   }
}
