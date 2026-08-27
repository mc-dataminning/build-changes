import com.mojang.serialization.MapCodec;

public class dbv extends daj implements dad {
   public static final MapCodec<dbv> d = b(dbv::new);
   public static final int e = 7;
   public static final dnz f = dnp.av;
   private static final eqk[] a = new eqk[]{
      daa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dbv> a() {
      return d;
   }

   protected dbv(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return a[this.g($$0)];
   }

   @Override
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.a(dac.cC);
   }

   protected dnz b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int g(dmz $$0) {
      return $$0.c(this.b());
   }

   public dmz b(int $$0) {
      return this.o().a(this.b(), Integer.valueOf($$0));
   }

   public final boolean h(dmz $$0) {
      return this.g($$0) >= this.c();
   }

   @Override
   protected boolean e_(dmz $$0) {
      return !this.h($$0);
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
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

   public void a(cwz $$0, ib $$1, dmz $$2) {
      int $$3 = this.g($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(cwz $$0) {
      return aww.a($$0.z, 2, 5);
   }

   protected static float a(daa $$0, cwf $$1, ib $$2) {
      float $$3 = 1.0F;
      ib $$4 = $$2.d();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dmz $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(dac.cC)) {
               $$7 = 1.0F;
               if ($$8.c(dcx.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      ib $$9 = $$2.e();
      ib $$10 = $$2.f();
      ib $$11 = $$2.g();
      ib $$12 = $$2.h();
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
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(cxc $$0, ib $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      if ($$3 instanceof cgd && $$1.Z().b(cwv.c)) {
         $$1.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected cwy d() {
      return cqn.pu;
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return new cqk(this.d());
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return !this.h($$2);
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      this.a((cwz)$$0, $$2, $$3);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(f);
   }
}
