import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckf extends cjy {
   @Nullable
   private ckf.b b;

   public ckf(bsv<? extends ckf> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new ckf.b(this);
      this.bS.a(1, new cac(this));
      this.bS.a(1, new bzx(this, this.dP()));
      this.bS.a(3, this.b);
      this.bS.a(4, new cas(this, 1.0, false));
      this.bS.a(5, new ckf.a(this));
      this.bT.a(1, new cca(this).a());
      this.bT.a(2, new ccb<>(this, cms.class, true));
   }

   public static bur.a s() {
      return cjy.gw().a(bus.q, 8.0).a(bus.r, 0.25).a(bus.c, 1.0);
   }

   @Override
   protected bsp.b bb() {
      return bsp.b.c;
   }

   @Override
   protected avv v() {
      return avw.wU;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.wW;
   }

   @Override
   protected avv o_() {
      return avw.wV;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(avw.wX, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(awn.y)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aY = this.dF();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(iz $$0, dbw $$1) {
      return dit.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bsv<ckf> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cms $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends cbf {
      @Nullable
      private je i;
      private boolean j;

      public a(ckf $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cai.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            azc $$0 = this.b.el();
            if (this.b.dP().ab().b(dbp.c) && $$0.a(b(10)) == 0) {
               this.i = je.b($$0);
               iz $$1 = iz.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
               drx $$2 = this.b.dP().a_($$1);
               if (dit.m($$2)) {
                  this.j = true;
                  return true;
               }
            }

            this.j = false;
            return super.a();
         }
      }

      @Override
      public boolean b() {
         return this.j ? false : super.b();
      }

      @Override
      public void c() {
         if (!this.j) {
            super.c();
         } else {
            dbu $$0 = this.b.dP();
            iz $$1 = iz.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
            drx $$2 = $$0.a_($$1);
            if (dit.m($$2)) {
               $$0.a($$1, dit.n($$2), 3);
               this.b.R();
               this.b.ao();
            }
         }
      }
   }

   static class b extends cai {
      private final ckf a;
      private int b;

      public b(ckf $$0) {
         this.a = $$0;
      }

      public void h() {
         if (this.b == 0) {
            this.b = this.a(20);
         }
      }

      @Override
      public boolean a() {
         return this.b > 0;
      }

      @Override
      public void e() {
         this.b--;
         if (this.b <= 0) {
            dbt $$0 = this.a.dP();
            azc $$1 = this.a.el();
            iz $$2 = this.a.dp();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     iz $$6 = $$2.b($$4, $$3, $$5);
                     drx $$7 = $$0.a_($$6);
                     deu $$8 = $$7.b();
                     if ($$8 instanceof dit) {
                        if ($$0.ab().b(dbp.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dit)$$8).o($$0.a_($$6)), 3);
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
