import java.util.EnumSet;
import javax.annotation.Nullable;

public class cpr extends cpk {
   @Nullable
   private cpr.b a;

   public cpr(bxn<? extends cpr> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.a = new cpr.b(this);
      this.bF.a(1, new cev(this));
      this.bF.a(1, new ceq(this, this.dV()));
      this.bF.a(3, this.a);
      this.bF.a(4, new cfl(this, 1.0, false));
      this.bF.a(5, new cpr.a(this));
      this.bG.a(1, new cgt(this).a());
      this.bG.a(2, new cgu<>(this, csi.class, true));
   }

   public static bzk.a j() {
      return cpk.gx().a(bzl.s, 8.0).a(bzl.v, 0.25).a(bzl.c, 1.0);
   }

   @Override
   protected bxe.c bf() {
      return bxe.c.c;
   }

   @Override
   protected awx u() {
      return awy.xN;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.xP;
   }

   @Override
   protected awx l_() {
      return awy.xO;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.xQ, 0.15F, 1.0F);
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(axo.x)) && this.a != null) {
            this.a.h();
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void h() {
      this.aV = this.dL();
      super.h();
   }

   @Override
   public void s(float $$0) {
      this.w($$0);
      super.s($$0);
   }

   @Override
   public float a(iw $$0, dkm $$1) {
      return drs.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bxn<cpr> $$0, dkk $$1, bxm $$2, iw $$3, bai $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bxm.a($$2)) {
         return true;
      } else {
         csi $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cfy {
      @Nullable
      private jc i;
      private boolean j;

      public a(cpr $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cfb.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.f() != null) {
            return false;
         } else if (!this.b.O().k()) {
            return false;
         } else {
            bai $$0 = this.b.dY();
            if (a(this.b).O().c(dkf.d) && $$0.a(b(10)) == 0) {
               this.i = jc.b($$0);
               iw $$1 = iw.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
               ebq $$2 = this.b.dV().a_($$1);
               if (drs.o($$2)) {
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
            dkk $$0 = this.b.dV();
            iw $$1 = iw.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
            ebq $$2 = $$0.a_($$1);
            if (drs.o($$2)) {
               $$0.a($$1, drs.p($$2), 3);
               this.b.U();
               this.b.aq();
            }
         }
      }
   }

   static class b extends cfb {
      private final cpr a;
      private int b;

      public b(cpr $$0) {
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
            dkj $$0 = this.a.dV();
            bai $$1 = this.a.dY();
            iw $$2 = this.a.dv();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     iw $$6 = $$2.b($$4, $$3, $$5);
                     ebq $$7 = $$0.a_($$6);
                     dno $$8 = $$7.b();
                     if ($$8 instanceof drs) {
                        if (a($$0).O().c(dkf.d)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((drs)$$8).q($$0.a_($$6)), 3);
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
