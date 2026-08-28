import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmg extends clz {
   @Nullable
   private cmg.b a;

   public cmg(but<? extends cmg> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.a = new cmg.b(this);
      this.bS.a(1, new cca(this));
      this.bS.a(1, new cbv(this, this.dV()));
      this.bS.a(3, this.a);
      this.bS.a(4, new ccq(this, 1.0, false));
      this.bS.a(5, new cmg.a(this));
      this.bT.a(1, new cdy(this).a());
      this.bT.a(2, new cdz<>(this, coy.class, true));
   }

   public static bwp.a m() {
      return clz.gx().a(bwq.s, 8.0).a(bwq.v, 0.25).a(bwq.c, 1.0);
   }

   @Override
   protected bum.c bg() {
      return bum.c.c;
   }

   @Override
   protected avz u() {
      return awa.xx;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.xz;
   }

   @Override
   protected avz o_() {
      return awa.xy;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.xA, 0.15F, 1.0F);
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(awr.x)) && this.a != null) {
            this.a.h();
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void h() {
      this.aX = this.dL();
      super.h();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public float a(ji $$0, dgm $$1) {
      return dno.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(but<cmg> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bus.a($$2)) {
         return true;
      } else {
         coy $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cdd {
      @Nullable
      private jn i;
      private boolean j;

      public a(cmg $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(ccg.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.O_() != null) {
            return false;
         } else if (!this.b.P().k()) {
            return false;
         } else {
            azh $$0 = this.b.dY();
            if (a(this.b).O().b(dgf.c) && $$0.a(b(10)) == 0) {
               this.i = jn.b($$0);
               ji $$1 = ji.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
               dwy $$2 = this.b.dV().a_($$1);
               if (dno.o($$2)) {
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
            dgk $$0 = this.b.dV();
            ji $$1 = ji.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
            dwy $$2 = $$0.a_($$1);
            if (dno.o($$2)) {
               $$0.a($$1, dno.p($$2), 3);
               this.b.V();
               this.b.at();
            }
         }
      }
   }

   static class b extends ccg {
      private final cmg a;
      private int b;

      public b(cmg $$0) {
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
            dgj $$0 = this.a.dV();
            azh $$1 = this.a.dY();
            ji $$2 = this.a.dv();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ji $$6 = $$2.b($$4, $$3, $$5);
                     dwy $$7 = $$0.a_($$6);
                     djn $$8 = $$7.b();
                     if ($$8 instanceof dno) {
                        if (a($$0).O().b(dgf.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dno)$$8).q($$0.a_($$6)), 3);
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
