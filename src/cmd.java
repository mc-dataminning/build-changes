import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmd extends clw {
   @Nullable
   private cmd.b a;

   public cmd(buq<? extends cmd> $$0, dgg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.a = new cmd.b(this);
      this.bS.a(1, new cbx(this));
      this.bS.a(1, new cbs(this, this.dW()));
      this.bS.a(3, this.a);
      this.bS.a(4, new ccn(this, 1.0, false));
      this.bS.a(5, new cmd.a(this));
      this.bT.a(1, new cdv(this).a());
      this.bT.a(2, new cdw<>(this, cov.class, true));
   }

   public static bwm.a m() {
      return clw.gu().a(bwn.s, 8.0).a(bwn.v, 0.25).a(bwn.c, 1.0);
   }

   @Override
   protected buj.c bg() {
      return buj.c.c;
   }

   @Override
   protected avy u() {
      return avz.xx;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.xz;
   }

   @Override
   protected avy o_() {
      return avz.xy;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.xA, 0.15F, 1.0F);
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(awq.x)) && this.a != null) {
            this.a.h();
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void h() {
      this.aX = this.dM();
      super.h();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public float a(ji $$0, dgj $$1) {
      return dnl.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(buq<cmd> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bup.a($$2)) {
         return true;
      } else {
         cov $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cda {
      @Nullable
      private jn i;
      private boolean j;

      public a(cmd $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(ccd.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.O_() != null) {
            return false;
         } else if (!this.b.L().k()) {
            return false;
         } else {
            azg $$0 = this.b.dZ();
            if (a(this.b).O().b(dgc.c) && $$0.a(b(10)) == 0) {
               this.i = jn.b($$0);
               ji $$1 = ji.a(this.b.dB(), this.b.dD() + 0.5, this.b.dH()).a(this.i);
               dwv $$2 = this.b.dW().a_($$1);
               if (dnl.o($$2)) {
                  this.j = true;
                  return true;
               }
            }

            this.j = false;
            return super.b();
         }
      }

      @Override
      public boolean c() {
         return this.j ? false : super.c();
      }

      @Override
      public void d() {
         if (!this.j) {
            super.d();
         } else {
            dgh $$0 = this.b.dW();
            ji $$1 = ji.a(this.b.dB(), this.b.dD() + 0.5, this.b.dH()).a(this.i);
            dwv $$2 = $$0.a_($$1);
            if (dnl.o($$2)) {
               $$0.a($$1, dnl.p($$2), 3);
               this.b.S();
               this.b.at();
            }
         }
      }
   }

   static class b extends ccd {
      private final cmd a;
      private int b;

      public b(cmd $$0) {
         this.a = $$0;
      }

      public void h() {
         if (this.b == 0) {
            this.b = this.a(20);
         }
      }

      @Override
      public boolean b() {
         return this.b > 0;
      }

      @Override
      public void a() {
         this.b--;
         if (this.b <= 0) {
            dgg $$0 = this.a.dW();
            azg $$1 = this.a.dZ();
            ji $$2 = this.a.dw();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ji $$6 = $$2.b($$4, $$3, $$5);
                     dwv $$7 = $$0.a_($$6);
                     djk $$8 = $$7.b();
                     if ($$8 instanceof dnl) {
                        if (a($$0).O().b(dgc.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dnl)$$8).q($$0.a_($$6)), 3);
                        }

                        if ($$1.h()) {
                           return;
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
