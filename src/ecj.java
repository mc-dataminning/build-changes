import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ecj extends ece {
   public static final float e = 0.44444445F;

   @Override
   public ecf d() {
      return ech.d;
   }

   @Override
   public ecf e() {
      return ech.e;
   }

   @Override
   public ckw a() {
      return cle.pM;
   }

   @Override
   public void a(crs $$0, ht $$1, ecg $$2, ato $$3) {
      ht $$4 = $$1.c();
      if ($$0.a_($$4).i() && !$$0.a_($$4).i($$0, $$4)) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(js.T, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, aqn.mt, aqo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), aqn.mr, aqo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void b(crs $$0, ht $$1, ecg $$2, ato $$3) {
      if ($$0.X().b(cro.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            ht $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.o($$5)) {
                  return;
               }

               dgw $$7 = $$0.a_($$5);
               if ($$7.i()) {
                  if (this.a((crv)$$0, $$5)) {
                     $$0.b($$5, cug.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               ht $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.o($$9)) {
                  return;
               }

               if ($$0.t($$9.c()) && this.b($$0, $$9)) {
                  $$0.b($$9.c(), cug.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(crv $$0, ht $$1) {
      for (hx $$2 : hx.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(crv $$0, ht $$1) {
      return $$1.v() >= $$0.I_() && $$1.v() < $$0.aj() && !$$0.A($$1) ? false : $$0.a_($$1).j();
   }

   @Nullable
   @Override
   public jq h() {
      return js.j;
   }

   @Override
   protected void a(crt $$0, ht $$1, dgw $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(crv $$0) {
      return $$0.D_().i() ? 4 : 2;
   }

   @Override
   public dgw b(ecg $$0) {
      return cuv.H.o().a(czi.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ecf $$0) {
      return $$0 == ech.e || $$0 == ech.d;
   }

   @Override
   public int c(crv $$0) {
      return $$0.D_().i() ? 1 : 2;
   }

   @Override
   public boolean a(ecg $$0, cqy $$1, ht $$2, ecf $$3, hx $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(arh.a);
   }

   @Override
   public int a(crv $$0) {
      return $$0.D_().i() ? 10 : 30;
   }

   @Override
   public int a(crs $$0, ht $$1, ecg $$2, ecg $$3) {
      int $$4 = this.a((crv)$$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a((cqy)$$0, $$1) > $$2.a((cqy)$$0, $$1) && $$0.E_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(crt $$0, ht $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(crs $$0) {
      return $$0.X().b(cro.V);
   }

   @Override
   protected void a(crt $$0, ht $$1, dgw $$2, hx $$3, ecg $$4) {
      if ($$3 == hx.a) {
         ecg $$5 = $$0.b_($$1);
         if (this.a(arh.b) && $$5.a(arh.a)) {
            if ($$2.b() instanceof czi) {
               $$0.a($$1, cuv.b.o(), 3);
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
   public Optional<aqm> j() {
      return Optional.of(aqn.cE);
   }

   public static class a extends ecj {
      @Override
      protected void a(dgx.a<ecf, ecg> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ecg $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ecg $$0) {
         return false;
      }
   }

   public static class b extends ecj {
      @Override
      public int d(ecg $$0) {
         return 8;
      }

      @Override
      public boolean c(ecg $$0) {
         return true;
      }
   }
}
