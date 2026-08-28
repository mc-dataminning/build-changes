import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmc extends clv {
   @Nullable
   private cmc.b b;

   public cmc(bup<? extends cmc> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.b = new cmc.b(this);
      this.bS.a(1, new cbw(this));
      this.bS.a(1, new cbr(this, this.dY()));
      this.bS.a(3, this.b);
      this.bS.a(4, new ccm(this, 1.0, false));
      this.bS.a(5, new cmc.a(this));
      this.bT.a(1, new cdu(this).a());
      this.bT.a(2, new cdv<>(this, cor.class, true));
   }

   public static bwl.a q() {
      return clv.gB().a(bwm.s, 8.0).a(bwm.v, 0.25).a(bwm.c, 1.0);
   }

   @Override
   protected bui.b bi() {
      return bui.b.c;
   }

   @Override
   protected awn w() {
      return awo.wW;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.wY;
   }

   @Override
   protected awn o_() {
      return awo.wX;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.wZ, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(axf.x)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aX = this.dO();
      super.l();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public float a(jh $$0, dfi $$1) {
      return dmh.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bup<cmc> $$0, dfg $$1, buo $$2, jh $$3, azv $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (buo.a($$2)) {
         return true;
      } else {
         cor $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends ccz {
      @Nullable
      private jm i;
      private boolean j;

      public a(cmc $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.m() != null) {
            return false;
         } else if (!this.b.P().m()) {
            return false;
         } else {
            azv $$0 = this.b.eb();
            if (this.b.dY().ac().b(dfb.c) && $$0.a(b(10)) == 0) {
               this.i = jm.b($$0);
               jh $$1 = jh.a(this.b.dD(), this.b.dF() + 0.5, this.b.dJ()).a(this.i);
               dvo $$2 = this.b.dY().a_($$1);
               if (dmh.o($$2)) {
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
            dfg $$0 = this.b.dY();
            jh $$1 = jh.a(this.b.dD(), this.b.dF() + 0.5, this.b.dJ()).a(this.i);
            dvo $$2 = $$0.a_($$1);
            if (dmh.o($$2)) {
               $$0.a($$1, dmh.p($$2), 3);
               this.b.V();
               this.b.av();
            }
         }
      }
   }

   static class b extends ccc {
      private final cmc a;
      private int b;

      public b(cmc $$0) {
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
            dff $$0 = this.a.dY();
            azv $$1 = this.a.eb();
            jh $$2 = this.a.dy();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jh $$6 = $$2.b($$4, $$3, $$5);
                     dvo $$7 = $$0.a_($$6);
                     dij $$8 = $$7.b();
                     if ($$8 instanceof dmh) {
                        if ($$0.ac().b(dfb.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dmh)$$8).q($$0.a_($$6)), 3);
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
