import java.util.Optional;
import javax.annotation.Nullable;

public abstract class ewj extends ewe {
   public static final float e = 0.44444445F;

   @Override
   public ewf d() {
      return ewh.d;
   }

   @Override
   public ewf e() {
      return ewh.e;
   }

   @Override
   public cyu a() {
      return czc.rn;
   }

   @Override
   public void a(div $$0, iu $$1, ewg $$2, azv $$3) {
      iu $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(lx.ab, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awn.ov, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awn.ot, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(arq $$0, iu $$1, ewg $$2, azv $$3) {
      if ($$0.O().c(dir.b)) {
         int $$4 = $$3.a(3);
         if ($$4 > 0) {
            iu $$5 = $$1;

            for (int $$6 = 0; $$6 < $$4; $$6++) {
               $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
               if (!$$0.p($$5)) {
                  return;
               }

               dzz $$7 = $$0.a_($$5);
               if ($$7.l()) {
                  if (this.a((diy)$$0, $$5)) {
                     $$0.b($$5, dln.a($$0, $$5));
                     return;
                  }
               } else if ($$7.d()) {
                  return;
               }
            }
         } else {
            for (int $$8 = 0; $$8 < 3; $$8++) {
               iu $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
               if (!$$0.p($$9)) {
                  return;
               }

               if ($$0.v($$9.d()) && this.b($$0, $$9)) {
                  $$0.b($$9.d(), dln.a($$0, $$9));
               }
            }
         }
      }
   }

   private boolean a(diy $$0, iu $$1) {
      for (ja $$2 : ja.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(diy $$0, iu $$1) {
      return $$0.d($$1.v()) && !$$0.C($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lv h() {
      return lx.i;
   }

   @Override
   protected void a(diw $$0, iu $$1, dzz $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(diy $$0) {
      return $$0.B_().i() ? 4 : 2;
   }

   @Override
   public dzz b(ewg $$0) {
      return dmc.K.m().b(dqv.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ewf $$0) {
      return $$0 == ewh.e || $$0 == ewh.d;
   }

   @Override
   public int c(diy $$0) {
      return $$0.B_().i() ? 1 : 2;
   }

   @Override
   public boolean a(ewg $$0, dib $$1, iu $$2, ewf $$3, ja $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(axh.a);
   }

   @Override
   public int a(diy $$0) {
      return $$0.B_().i() ? 10 : 30;
   }

   @Override
   public int a(div $$0, iu $$1, ewg $$2, ewg $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.C_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(diw $$0, iu $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(arq $$0) {
      return $$0.O().c(dir.W);
   }

   @Override
   protected void a(diw $$0, iu $$1, dzz $$2, ja $$3, ewg $$4) {
      if ($$3 == ja.a) {
         ewg $$5 = $$0.b_($$1);
         if (this.a(axh.b) && $$5.a(axh.a)) {
            if ($$2.b() instanceof dqv) {
               $$0.a($$1, dmc.b.m(), 3);
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
   public Optional<awm> j() {
      return Optional.of(awn.dm);
   }

   public static class a extends ewj {
      @Override
      protected void a(eaa.a<ewf, ewg> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(ewg $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(ewg $$0) {
         return false;
      }
   }

   public static class b extends ewj {
      @Override
      public int d(ewg $$0) {
         return 8;
      }

      @Override
      public boolean c(ewg $$0) {
         return true;
      }
   }
}
