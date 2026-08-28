import java.util.Optional;
import javax.annotation.Nullable;

public abstract class eoe extends enz {
   public static final float e = 0.44444445F;

   @Override
   public eoa d() {
      return eoc.d;
   }

   @Override
   public eoa e() {
      return eoc.e;
   }

   @Override
   public ctv a() {
      return cud.qA;
   }

   @Override
   public void a(dcd $$0, ja $$1, eob $$2, aym $$3) {
      ja $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lj.Y, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, avf.nR, avg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), avf.nP, avg.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(dcd $$0, ja $$1, eob $$2, aym $$3) {
      if ($$0.ab().b(dbz.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            ja $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dsh $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((dcg)$$0, $$5)) {
                     $$0.b($$5, des.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               ja $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.u($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), des.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(dcg $$0, ja $$1) {
      for (jf $$2 : jf.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(dcg $$0, ja $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.am() && !$$0.B($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public lh h() {
      return lj.i;
   }

   @Override
   protected void a(dce $$0, ja $$1, dsh $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(dcg $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dsh b(eob $$0) {
      return dfh.H.o().a(djv.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(eoa $$0) {
      return $$0 == eoc.e || $$0 == eoc.d;
   }

   @Override
   public int c(dcg $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(eob $$0, dbj $$1, ja $$2, eoa $$3, jf $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(awa.a);
   }

   @Override
   public int a(dcg $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(dcd $$0, ja $$1, eob $$2, eob $$3) {
      int $$4 = this.a((dcg)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((dbj)$$0, $$1) > $$2.a((dbj)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(dce $$0, ja $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(dcd $$0) {
      return $$0.ab().b(dbz.V);
   }

   @Override
   protected void a(dce $$0, ja $$1, dsh $$2, jf $$3, eob $$4) {
      if ($$3 == jf.a) {
         eob $$5 = $$0.b_($$1);
         if (this.a(awa.b) && $$5.a(awa.a)) {
            if ($$2.b() instanceof djv) {
               $$0.a($$1, dfh.b.o(), 3);
            }

            this.a($$0, $$1);
            return;
         }
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean i() {
      return true;
   }

   @Override
   protected float c() {
      return 100.0F;
   }

   @Override
   public Optional<ave> j() {
      return Optional.of(avf.dl);
   }

   public static class a extends eoe {
      @Override
      protected void a(dsi.a<eoa, eob> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(eob $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(eob $$0) {
         return false;
      }
   }

   public static class b extends eoe {
      @Override
      public int d(eob $$0) {
         return 8;
      }

      @Override
      public boolean c(eob $$0) {
         return true;
      }
   }
}
