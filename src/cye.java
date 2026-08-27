import com.mojang.serialization.MapCodec;

public class cye extends cws implements cwm {
   public static final MapCodec<cye> d = b(cye::new);
   public static final int e = 7;
   public static final dka f = djq.av;
   private static final emf[] a = new emf[]{
      cwj.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      cwj.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends cye> a() {
      return d;
   }

   protected cye(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(cwl.cC);
   }

   protected dka b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dja $$0) {
      return $$0.c(this.b());
   }

   public dja b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dja $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   public boolean e_(dja $$0) {
      return !this.h($$0);
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
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

   public void a(cti $$0, hx $$1, dja $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cti $$0) {
      return aui.a($$0.z, 2, 5);
   }

   protected static float a(cwj $$0, cso $$1, hx $$2) {
      float $$3 = 1.0F;
      hx $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dja $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(cwl.cC)) {
               $$7 = 1.0F;
               if ($$8.c(czg.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      hx $$9 = $$2.e();
      hx $$10 = $$2.f();
      hx $$11 = $$2.g();
      hx $$12 = $$2.h();
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
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(ctl $$0, hx $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if ($$3 instanceof cco && $$1.Z().b(cte.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cth d() {
      return cmu.ps;
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return new cmr(this.d());
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      this.a((cti)$$0, $$2, $$3);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(f);
   }
}
