import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckm extends ckf {
   @Nullable
   private ckm.b b;

   public ckm(btc<? extends ckm> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new ckm.b(this);
      this.bS.a(1, new caj(this));
      this.bS.a(1, new cae(this, this.dP()));
      this.bS.a(3, this.b);
      this.bS.a(4, new caz(this, 1.0, false));
      this.bS.a(5, new ckm.a(this));
      this.bT.a(1, new cch(this).a());
      this.bT.a(2, new cci<>(this, cmz.class, true));
   }

   public static buy.a s() {
      return ckf.gw().a(buz.q, 8.0).a(buz.r, 0.25).a(buz.c, 1.0);
   }

   @Override
   protected bsw.b bb() {
      return bsw.b.c;
   }

   @Override
   protected avz v() {
      return awa.wU;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.wW;
   }

   @Override
   protected avz o_() {
      return awa.wV;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(awa.wX, 0.15F, 1.0F);
   }

   @Override
   public boolean a(brp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(awr.y)) && this.b != null) {
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
   public float a(iz $$0, dcd $$1) {
      return dja.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(btc<ckm> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmz $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends cbm {
      @Nullable
      private je i;
      private boolean j;

      public a(ckm $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cap.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            azh $$0 = this.b.el();
            if (this.b.dP().ab().b(dbw.c) && $$0.a(b(10)) == 0) {
               this.i = je.b($$0);
               iz $$1 = iz.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
               dse $$2 = this.b.dP().a_($$1);
               if (dja.m($$2)) {
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
            dcb $$0 = this.b.dP();
            iz $$1 = iz.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
            dse $$2 = $$0.a_($$1);
            if (dja.m($$2)) {
               $$0.a($$1, dja.n($$2), 3);
               this.b.R();
               this.b.ao();
            }
         }
      }
   }

   static class b extends cap {
      private final ckm a;
      private int b;

      public b(ckm $$0) {
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
            dca $$0 = this.a.dP();
            azh $$1 = this.a.el();
            iz $$2 = this.a.dp();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     iz $$6 = $$2.b($$4, $$3, $$5);
                     dse $$7 = $$0.a_($$6);
                     dfb $$8 = $$7.b();
                     if ($$8 instanceof dja) {
                        if ($$0.ab().b(dbw.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dja)$$8).o($$0.a_($$6)), 3);
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
