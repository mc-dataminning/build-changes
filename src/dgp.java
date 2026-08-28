import com.mojang.serialization.MapCodec;

public class dgp extends dfd implements dex {
   public static final MapCodec<dgp> d = b(dgp::new);
   public static final int e = 7;
   public static final dsx f = dsn.av;
   private static final ewf[] a = new ewf[]{
      deu.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      deu.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dgp> a() {
      return d;
   }

   protected dgp(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.a(dew.cC);
   }

   protected dsx b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(drx $$0) {
      return $$0.c(this.b());
   }

   public drx b(int $$0) {
      return this.n().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(drx $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean d_(drx $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(drx $$0, arb $$1, iz $$2, azc $$3) {
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

   public void a(dbt $$0, iz $$1, drx $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dbt $$0) {
      return ayu.a($$0.z, 2, 5);
   }

   protected static float a(deu $$0, daz $$1, iz $$2) {
      float $$3 = 1.0F;
      iz $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            drx $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dew.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dhr.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      iz $$9 = $$2.e();
      iz $$10 = $$2.f();
      iz $$11 = $$2.g();
      iz $$12 = $$2.h();
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
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dbw $$0, iz $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if ($$3 instanceof ckd && $$1.ab().b(dbp.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dbs d() {
      return cun.pv;
   }

   @Override
   public cuk a(dbw $$0, iz $$1, drx $$2) {
      return new cuk(this.d());
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      this.a((dbt)$$0, $$2, $$3);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(f);
   }
}
