import java.util.Optional;
import javax.annotation.Nullable;

public abstract class exd extends ewy {
   public static final float e = 0.44444445F;

   @Override
   public ewz d() {
      return exb.d;
   }

   @Override
   public ewz e() {
      return exb.e;
   }

   @Override
   public czj a() {
      return czr.rq;
   }

   @Override
   public void a(djm $$0, iv $$1, exa $$2, azv $$3) {
      iv $$4 = $$1.d();
      if ($$0.a_($$4).l() && !$$0.a_($$4).s()) {
         if ($$3.a(100) == 0) {
            double $$5 = (double)$$1.u() + $$3.j();
            double $$6 = (double)$$1.v() + 1.0;
            double $$7 = (double)$$1.w() + $$3.j();
            $$0.a(ly.ab, $$5, $$6, $$7, 0.0, 0.0, 0.0);
            $$0.a($$5, $$6, $$7, awn.oy, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }

         if ($$3.a(200) == 0) {
            $$0.a((double)$$1.u(), (double)$$1.v(), (double)$$1.w(), awn.ow, awo.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   public void a(arq $$0, iv $$1, exa $$2, azv $$3) {
      if ($$0.O().c(dji.b)) {
         if ($$0.O().c(dji.c) || $$0.g($$1)) {
            int $$4 = $$3.a(3);
            if ($$4 > 0) {
               iv $$5 = $$1;

               for (int $$6 = 0; $$6 < $$4; $$6++) {
                  $$5 = $$5.b($$3.a(3) - 1, 1, $$3.a(3) - 1);
                  if (!$$0.p($$5)) {
                     return;
                  }

                  eat $$7 = $$0.a_($$5);
                  if ($$7.l()) {
                     if (this.a((djp)$$0, $$5)) {
                        $$0.b($$5, dme.a($$0, $$5));
                        return;
                     }
                  } else if ($$7.d()) {
                     return;
                  }
               }
            } else {
               for (int $$8 = 0; $$8 < 3; $$8++) {
                  iv $$9 = $$1.b($$3.a(3) - 1, 0, $$3.a(3) - 1);
                  if (!$$0.p($$9)) {
                     return;
                  }

                  if ($$0.v($$9.d()) && this.b($$0, $$9)) {
                     $$0.b($$9.d(), dme.a($$0, $$9));
                  }
               }
            }
         }
      }
   }

   @Override
   protected void a(djm $$0, iv $$1, bwi $$2, bxb $$3) {
      $$3.a(bxc.c);
      $$3.b(bxc.c, bwi::aC);
   }

   private boolean a(djp $$0, iv $$1) {
      for (jb $$2 : jb.values()) {
         if (this.b($$0, $$1.a($$2))) {
            return true;
         }
      }

      return false;
   }

   private boolean b(djp $$0, iv $$1) {
      return $$0.d($$1.v()) && !$$0.C($$1) ? false : $$0.a_($$1).m();
   }

   @Nullable
   @Override
   public lw h() {
      return ly.i;
   }

   @Override
   protected void a(djn $$0, iv $$1, eat $$2) {
      this.a($$0, $$1);
   }

   @Override
   public int b(djp $$0) {
      return $$0.B_().i() ? 4 : 2;
   }

   @Override
   public eat b(exa $$0) {
      return dmt.K.m().b(drn.b, Integer.valueOf(e($$0)));
   }

   @Override
   public boolean a(ewz $$0) {
      return $$0 == exb.e || $$0 == exb.d;
   }

   @Override
   public int c(djp $$0) {
      return $$0.B_().i() ? 1 : 2;
   }

   @Override
   public boolean a(exa $$0, diq $$1, iv $$2, ewz $$3, jb $$4) {
      return $$0.a($$1, $$2) >= 0.44444445F && $$3.a(axh.a);
   }

   @Override
   public int a(djp $$0) {
      return $$0.B_().i() ? 10 : 30;
   }

   @Override
   public int a(djm $$0, iv $$1, exa $$2, exa $$3) {
      int $$4 = this.a($$0);
      if (!$$2.c() && !$$3.c() && !$$2.c(a) && !$$3.c(a) && $$3.a($$0, $$1) > $$2.a($$0, $$1) && $$0.C_().a(4) != 0) {
         $$4 *= 4;
      }

      return $$4;
   }

   private void a(djn $$0, iv $$1) {
      $$0.c(1501, $$1, 0);
   }

   @Override
   protected boolean a(arq $$0) {
      return $$0.O().c(dji.X);
   }

   @Override
   protected void a(djn $$0, iv $$1, eat $$2, jb $$3, exa $$4) {
      if ($$3 == jb.a) {
         exa $$5 = $$0.b_($$1);
         if (this.a(axh.b) && $$5.a(axh.a)) {
            if ($$2.b() instanceof drn) {
               $$0.a($$1, dmt.b.m(), 3);
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

   public static class a extends exd {
      @Override
      protected void a(eau.a<ewz, exa> $$0) {
         super.a($$0);
         $$0.a(b);
      }

      @Override
      public int d(exa $$0) {
         return $$0.c(b);
      }

      @Override
      public boolean c(exa $$0) {
         return false;
      }
   }

   public static class b extends exd {
      @Override
      public int d(exa $$0) {
         return 8;
      }

      @Override
      public boolean c(exa $$0) {
         return true;
      }
   }
}
