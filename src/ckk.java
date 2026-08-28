import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckk extends ckd {
   @Nullable
   private ckk.b b;

   public ckk(bta<? extends ckk> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new ckk.b(this);
      this.bS.a(1, new cah(this));
      this.bS.a(1, new cac(this, this.dP()));
      this.bS.a(3, this.b);
      this.bS.a(4, new cax(this, 1.0, false));
      this.bS.a(5, new ckk.a(this));
      this.bT.a(1, new ccf(this).a());
      this.bT.a(2, new ccg<>(this, cmx.class, true));
   }

   public static buw.a s() {
      return ckd.gw().a(bux.q, 8.0).a(bux.r, 0.25).a(bux.c, 1.0);
   }

   @Override
   protected bsu.b bb() {
      return bsu.b.c;
   }

   @Override
   protected avz v() {
      return awa.wU;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.wW;
   }

   @Override
   protected avz o_() {
      return awa.wV;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(awa.wX, 0.15F, 1.0F);
   }

   @Override
   public boolean a(brn $$0, float $$1) {
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
   public float a(iz $$0, dcb $$1) {
      return diy.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bta<ckk> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends cbk {
      @Nullable
      private je i;
      private boolean j;

      public a(ckk $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(can.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            azh $$0 = this.b.el();
            if (this.b.dP().ab().b(dbu.c) && $$0.a(b(10)) == 0) {
               this.i = je.b($$0);
               iz $$1 = iz.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
               dsc $$2 = this.b.dP().a_($$1);
               if (diy.m($$2)) {
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
            dbz $$0 = this.b.dP();
            iz $$1 = iz.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
            dsc $$2 = $$0.a_($$1);
            if (diy.m($$2)) {
               $$0.a($$1, diy.n($$2), 3);
               this.b.R();
               this.b.ao();
            }
         }
      }
   }

   static class b extends can {
      private final ckk a;
      private int b;

      public b(ckk $$0) {
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
            dby $$0 = this.a.dP();
            azh $$1 = this.a.el();
            iz $$2 = this.a.dp();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     iz $$6 = $$2.b($$4, $$3, $$5);
                     dsc $$7 = $$0.a_($$6);
                     dez $$8 = $$7.b();
                     if ($$8 instanceof diy) {
                        if ($$0.ab().b(dbu.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((diy)$$8).o($$0.a_($$6)), 3);
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
