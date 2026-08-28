import java.util.EnumSet;
import javax.annotation.Nullable;

public class cog extends cnz {
   @Nullable
   private cog.b a;

   public cog(bwm<? extends cog> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.a = new cog.b(this);
      this.bC.a(1, new cds(this));
      this.bC.a(1, new cdn(this, this.dV()));
      this.bC.a(3, this.a);
      this.bC.a(4, new cei(this, 1.0, false));
      this.bC.a(5, new cog.a(this));
      this.bD.a(1, new cfq(this).a());
      this.bD.a(2, new cfr<>(this, cqy.class, true));
   }

   public static byh.a j() {
      return cnz.gt().a(byi.s, 8.0).a(byi.v, 0.25).a(byi.c, 1.0);
   }

   @Override
   protected bwd.d bg() {
      return bwd.d.c;
   }

   @Override
   protected awm u() {
      return awn.xK;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.xM;
   }

   @Override
   protected awm l_() {
      return awn.xL;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.xN, 0.15F, 1.0F);
   }

   @Override
   public boolean a(arq $$0, bus $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(axd.x)) && this.a != null) {
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
   public float a(iu $$0, diy $$1) {
      return dqd.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bwm<cog> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bwl.a($$2)) {
         return true;
      } else {
         cqy $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cev {
      @Nullable
      private ja i;
      private boolean j;

      public a(cog $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cdy.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.f() != null) {
            return false;
         } else if (!this.b.O().k()) {
            return false;
         } else {
            azv $$0 = this.b.dY();
            if (a(this.b).O().c(dir.c) && $$0.a(b(10)) == 0) {
               this.i = ja.b($$0);
               iu $$1 = iu.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
               dzz $$2 = this.b.dV().a_($$1);
               if (dqd.o($$2)) {
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
            diw $$0 = this.b.dV();
            iu $$1 = iu.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
            dzz $$2 = $$0.a_($$1);
            if (dqd.o($$2)) {
               $$0.a($$1, dqd.p($$2), 3);
               this.b.U();
               this.b.at();
            }
         }
      }
   }

   static class b extends cdy {
      private final cog a;
      private int b;

      public b(cog $$0) {
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
            div $$0 = this.a.dV();
            azv $$1 = this.a.dY();
            iu $$2 = this.a.dv();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     iu $$6 = $$2.b($$4, $$3, $$5);
                     dzz $$7 = $$0.a_($$6);
                     dma $$8 = $$7.b();
                     if ($$8 instanceof dqd) {
                        if (a($$0).O().c(dir.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dqd)$$8).q($$0.a_($$6)), 3);
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
