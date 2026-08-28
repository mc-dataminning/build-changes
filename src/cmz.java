import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmz extends cms {
   @Nullable
   private cmz.b a;

   public cmz(bvm<? extends cmz> $$0, dha $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.a = new cmz.b(this);
      this.bT.a(1, new cct(this));
      this.bT.a(1, new cco(this, this.dV()));
      this.bT.a(3, this.a);
      this.bT.a(4, new cdj(this, 1.0, false));
      this.bT.a(5, new cmz.a(this));
      this.bU.a(1, new cer(this).a());
      this.bU.a(2, new ces<>(this, cps.class, true));
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.s, 8.0).a(bxj.v, 0.25).a(bxj.c, 1.0);
   }

   @Override
   protected bvf.b bg() {
      return bvf.b.c;
   }

   @Override
   protected axe u() {
      return axf.xq;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.xs;
   }

   @Override
   protected axe o_() {
      return axf.xr;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.xt, 0.15F, 1.0F);
   }

   @Override
   public boolean a(ash $$0, btv $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(axw.x)) && this.a != null) {
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
   public float a(jh $$0, dhd $$1) {
      return dof.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bvm<cmz> $$0, dhb $$1, bvl $$2, jh $$3, bam $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bvl.a($$2)) {
         return true;
      } else {
         cps $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cdw {
      @Nullable
      private jm i;
      private boolean j;

      public a(cmz $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(ccz.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.O_() != null) {
            return false;
         } else if (!this.b.L().m()) {
            return false;
         } else {
            bam $$0 = this.b.dY();
            if (a(this.b).N().b(dgw.c) && $$0.a(b(10)) == 0) {
               this.i = jm.b($$0);
               jh $$1 = jh.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
               dxn $$2 = this.b.dV().a_($$1);
               if (dof.o($$2)) {
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
            dhb $$0 = this.b.dV();
            jh $$1 = jh.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
            dxn $$2 = $$0.a_($$1);
            if (dof.o($$2)) {
               $$0.a($$1, dof.p($$2), 3);
               this.b.S();
               this.b.at();
            }
         }
      }
   }

   static class b extends ccz {
      private final cmz a;
      private int b;

      public b(cmz $$0) {
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
            dha $$0 = this.a.dV();
            bam $$1 = this.a.dY();
            jh $$2 = this.a.dv();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jh $$6 = $$2.b($$4, $$3, $$5);
                     dxn $$7 = $$0.a_($$6);
                     dke $$8 = $$7.b();
                     if ($$8 instanceof dof) {
                        if (a($$0).N().b(dgw.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dof)$$8).q($$0.a_($$6)), 3);
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
