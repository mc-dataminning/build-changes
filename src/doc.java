import com.mojang.serialization.MapCodec;

public class doc extends dvr implements dmi {
   public static final MapCodec<doc> d = b(doc::new);
   public static final int e = 7;
   public static final ebh f = eax.ay;
   private static final ffk[] a = dmf.a(7, $$0 -> dmf.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<? extends doc> a() {
      return d;
   }

   protected doc(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(eah $$0, dig $$1, iu $$2) {
      return $$0.a(dmh.cN);
   }

   protected ebh b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(eah $$0) {
      return $$0.c(this.b());
   }

   public eah b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(eah $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(eah $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(eah $$0, arq $$1, iu $$2, azv $$3) {
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

   public void b(dja $$0, iu $$1, eah $$2) {
      int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dja $$0) {
      return azm.a($$0.A, 2, 5);
   }

   protected static float a(dmf $$0, dig $$1, iu $$2) {
      float $$3 = 1.0F;
      iu $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            eah $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dmh.cN)) {
               $$7 = 1.0F;
               if ($$8.c(dpe.b) > 0) {
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
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(djd $$0, iu $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if ($$1 instanceof arq $$4 && $$3 instanceof coi && $$4.O().c(diw.d)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected diz d() {
      return czh.qj;
   }

   @Override
   protected czd a(djd $$0, iu $$1, eah $$2, boolean $$3) {
      return new czd(this.d());
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      this.b($$0, $$2, $$3);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(f);
   }
}
