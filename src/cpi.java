import java.util.EnumSet;
import javax.annotation.Nullable;

public class cpi extends cpb {
   @Nullable
   private cpi.b a;

   public cpi(bxe<? extends cpi> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.a = new cpi.b(this);
      this.bF.a(1, new cem(this));
      this.bF.a(1, new ceh(this, this.dV()));
      this.bF.a(3, this.a);
      this.bF.a(4, new cfc(this, 1.0, false));
      this.bF.a(5, new cpi.a(this));
      this.bG.a(1, new cgk(this).a());
      this.bG.a(2, new cgl<>(this, crz.class, true));
   }

   public static bzb.a j() {
      return cpb.gx().a(bzc.s, 8.0).a(bzc.v, 0.25).a(bzc.c, 1.0);
   }

   @Override
   protected bwv.c bf() {
      return bwv.c.c;
   }

   @Override
   protected awq u() {
      return awr.xN;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.xP;
   }

   @Override
   protected awq l_() {
      return awr.xO;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.xQ, 0.15F, 1.0F);
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(axh.x)) && this.a != null) {
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
   public float a(iw $$0, dkc $$1) {
      return dri.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bxe<cpi> $$0, dka $$1, bxd $$2, iw $$3, azz $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bxd.a($$2)) {
         return true;
      } else {
         crz $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cfp {
      @Nullable
      private jc i;
      private boolean j;

      public a(cpi $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.f() != null) {
            return false;
         } else if (!this.b.O().k()) {
            return false;
         } else {
            azz $$0 = this.b.dY();
            if (a(this.b).O().c(djv.d) && $$0.a(b(10)) == 0) {
               this.i = jc.b($$0);
               iw $$1 = iw.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
               ebg $$2 = this.b.dV().a_($$1);
               if (dri.o($$2)) {
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
            dka $$0 = this.b.dV();
            iw $$1 = iw.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
            ebg $$2 = $$0.a_($$1);
            if (dri.o($$2)) {
               $$0.a($$1, dri.p($$2), 3);
               this.b.U();
               this.b.aq();
            }
         }
      }
   }

   static class b extends ces {
      private final cpi a;
      private int b;

      public b(cpi $$0) {
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
            djz $$0 = this.a.dV();
            azz $$1 = this.a.dY();
            iw $$2 = this.a.dv();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     iw $$6 = $$2.b($$4, $$3, $$5);
                     ebg $$7 = $$0.a_($$6);
                     dne $$8 = $$7.b();
                     if ($$8 instanceof dri) {
                        if (a($$0).O().c(djv.d)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dri)$$8).q($$0.a_($$6)), 3);
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
