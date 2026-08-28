import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckj extends ckc {
   @Nullable
   private ckj.b b;

   public ckj(bsz<? extends ckj> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new ckj.b(this);
      this.bS.a(1, new cag(this));
      this.bS.a(1, new cab(this, this.dP()));
      this.bS.a(3, this.b);
      this.bS.a(4, new caw(this, 1.0, false));
      this.bS.a(5, new ckj.a(this));
      this.bT.a(1, new cce(this).a());
      this.bT.a(2, new ccf<>(this, cmw.class, true));
   }

   public static buv.a s() {
      return ckc.gw().a(buw.q, 8.0).a(buw.r, 0.25).a(buw.c, 1.0);
   }

   @Override
   protected bst.b bb() {
      return bst.b.c;
   }

   @Override
   protected avy v() {
      return avz.wU;
   }

   @Override
   protected avy d(brm $$0) {
      return avz.wW;
   }

   @Override
   protected avy o_() {
      return avz.wV;
   }

   @Override
   protected void b(iz $$0, dsb $$1) {
      this.a(avz.wX, 0.15F, 1.0F);
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(awq.y)) && this.b != null) {
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
   public float a(iz $$0, dca $$1) {
      return dix.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bsz<ckj> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmw $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends cbj {
      @Nullable
      private je i;
      private boolean j;

      public a(ckj $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            azg $$0 = this.b.el();
            if (this.b.dP().ab().b(dbt.c) && $$0.a(b(10)) == 0) {
               this.i = je.b($$0);
               iz $$1 = iz.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
               dsb $$2 = this.b.dP().a_($$1);
               if (dix.m($$2)) {
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
            dby $$0 = this.b.dP();
            iz $$1 = iz.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
            dsb $$2 = $$0.a_($$1);
            if (dix.m($$2)) {
               $$0.a($$1, dix.n($$2), 3);
               this.b.R();
               this.b.ao();
            }
         }
      }
   }

   static class b extends cam {
      private final ckj a;
      private int b;

      public b(ckj $$0) {
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
            dbx $$0 = this.a.dP();
            azg $$1 = this.a.el();
            iz $$2 = this.a.dp();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     iz $$6 = $$2.b($$4, $$3, $$5);
                     dsb $$7 = $$0.a_($$6);
                     dey $$8 = $$7.b();
                     if ($$8 instanceof dix) {
                        if ($$0.ab().b(dbt.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dix)$$8).o($$0.a_($$6)), 3);
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
