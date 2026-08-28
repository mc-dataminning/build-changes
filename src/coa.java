import java.util.EnumSet;
import javax.annotation.Nullable;

public class coa extends cnt {
   @Nullable
   private coa.b a;

   public coa(bwj<? extends coa> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.a = new coa.b(this);
      this.bC.a(1, new cdp(this));
      this.bC.a(1, new cdk(this, this.dV()));
      this.bC.a(3, this.a);
      this.bC.a(4, new cef(this, 1.0, false));
      this.bC.a(5, new coa.a(this));
      this.bD.a(1, new cfn(this).a());
      this.bD.a(2, new cfo<>(this, cqs.class, true));
   }

   public static bye.a j() {
      return cnt.gt().a(byf.s, 8.0).a(byf.v, 0.25).a(byf.c, 1.0);
   }

   @Override
   protected bwa.d bg() {
      return bwa.d.c;
   }

   @Override
   protected awk u() {
      return awl.xH;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.xJ;
   }

   @Override
   protected awk l_() {
      return awl.xI;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.xK, 0.15F, 1.0F);
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(axb.x)) && this.a != null) {
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
   public float a(iu $$0, dis $$1) {
      return dpw.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bwj<coa> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bwi.a($$2)) {
         return true;
      } else {
         cqs $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends ces {
      @Nullable
      private ja i;
      private boolean j;

      public a(coa $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.f() != null) {
            return false;
         } else if (!this.b.O().k()) {
            return false;
         } else {
            azt $$0 = this.b.dY();
            if (a(this.b).O().c(dil.c) && $$0.a(b(10)) == 0) {
               this.i = ja.b($$0);
               iu $$1 = iu.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
               dzo $$2 = this.b.dV().a_($$1);
               if (dpw.o($$2)) {
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
            diq $$0 = this.b.dV();
            iu $$1 = iu.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
            dzo $$2 = $$0.a_($$1);
            if (dpw.o($$2)) {
               $$0.a($$1, dpw.p($$2), 3);
               this.b.U();
               this.b.at();
            }
         }
      }
   }

   static class b extends cdv {
      private final coa a;
      private int b;

      public b(coa $$0) {
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
            dip $$0 = this.a.dV();
            azt $$1 = this.a.dY();
            iu $$2 = this.a.dv();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     iu $$6 = $$2.b($$4, $$3, $$5);
                     dzo $$7 = $$0.a_($$6);
                     dlu $$8 = $$7.b();
                     if ($$8 instanceof dpw) {
                        if (a($$0).O().c(dil.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dpw)$$8).q($$0.a_($$6)), 3);
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
