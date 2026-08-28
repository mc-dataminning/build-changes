import com.mojang.serialization.MapCodec;

public class dli extends djw implements djp {
   public static final MapCodec<dli> d = b(dli::new);
   public static final int e = 7;
   public static final dxw f = dxn.ay;
   private static final fbu[] a = new fbu[]{
      djm.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      djm.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };

   @Override
   public MapCodec<? extends dli> a() {
      return d;
   }

   protected dli(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(this.b(), Integer.valueOf(0)));
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return a[this.h($$0)];
   }

   @Override
   protected boolean b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a(djo.cK);
   }

   protected dxw b() {
      return f;
   }

   public int c() {
      return 7;
   }

   public int h(dwx $$0) {
      return $$0.c(this.b());
   }

   public dwx b(int $$0) {
      return this.m().b(this.b(), Integer.valueOf($$0));
   }

   public final boolean i(dwx $$0) {
      return this.h($$0) >= this.c();
   }

   @Override
   protected boolean f(dwx $$0) {
      return !this.i($$0);
   }

   @Override
   protected void b(dwx $$0, arc $$1, ji $$2, azh $$3) {
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

   public void a(dgi $$0, ji $$1, dwx $$2) {
      int $$3 = this.h($$2) + this.a($$0);
      int $$4 = this.c();
      if ($$3 > $$4) {
         $$3 = $$4;
      }

      $$0.a($$1, this.b($$3), 2);
   }

   protected int a(dgi $$0) {
      return ayz.a($$0.A, 2, 5);
   }

   protected static float a(djm $$0, dfn $$1, ji $$2) {
      float $$3 = 1.0F;
      ji $$4 = $$2.e();

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            float $$7 = 0.0F;
            dwx $$8 = $$1.a_($$4.b($$5, 0, $$6));
            if ($$8.a(djo.cK)) {
               $$7 = 1.0F;
               if ($$8.c(dmk.b) > 0) {
                  $$7 = 3.0F;
               }
            }

            if ($$5 != 0 || $$6 != 0) {
               $$7 /= 4.0F;
            }

            $$3 += $$7;
         }
      }

      ji $$9 = $$2.f();
      ji $$10 = $$2.g();
      ji $$11 = $$2.h();
      ji $$12 = $$2.i();
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
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      return a($$1, $$2) && super.a($$0, $$1, $$2);
   }

   protected static boolean a(dgl $$0, ji $$1) {
      return $$0.b($$1, 0) >= 8;
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, buk $$3) {
      if ($$1 instanceof arc $$4 && $$3 instanceof cmc && $$4.O().b(dge.c)) {
         $$4.a($$2, true, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   protected dgh d() {
      return cwt.qa;
   }

   @Override
   protected cwp a(dgl $$0, ji $$1, dwx $$2, boolean $$3) {
      return new cwp(this.d());
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return !this.i($$2);
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azh $$1, ji $$2, dwx $$3) {
      this.a((dgi)$$0, $$2, $$3);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(f);
   }
}
