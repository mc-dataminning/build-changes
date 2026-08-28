import com.mojang.serialization.MapCodec;

public class dpb extends dwq implements dnh {
   public static final MapCodec<dpb> d = b(dpb::new);
   public static final int e = 7;
   public static final ecg f = ebw.ay;
   private static final fgm[] a = dne.a(7, $$0 -> dne.b(16.0, 0.0, (double)(2 + $$0 * 2)));

   @Override
   public MapCodec<? extends dpb> a() {
      return d;
   }

   protected dpb(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(ebg $$0, djd $$1, iw $$2) {
      return $$0.a(dng.cN);
   }

   protected ecg b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(ebg $$0) {
      return $$0.c(this.b());
   }

   public ebg b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(ebg $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(ebg $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(ebg $$0, aru $$1, iw $$2, azz $$3) {
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

   public void b(djz $$0, iw $$1, ebg $$2) {
      int $$3 = Math.min(this.c(), this.h($$2) + this.a($$0));
      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(djz $$0) {
      return azq.a($$0.A, 2, 5);
   }

   protected static float a(dne $$0, djd $$1, iw $$2) {
      float $$3 = 1.0F;
      iw $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            ebg $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dng.cN)) {
               $$7 = 1.0F;
               if ($$8.c(dqd.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      iw $$9 = $$2.f();
      iw $$10 = $$2.g();
      iw $$11 = $$2.h();
      iw $$12 = $$2.i();
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
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dkc $$0, iw $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if ($$1 instanceof aru $$5 && $$3 instanceof cpg && $$5.O().c(djv.d)) {
         $$5.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   protected djy d() {
      return dae.qj;
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      return new daa(this.d());
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      this.b($$0, $$2, $$3);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(f);
   }
}
