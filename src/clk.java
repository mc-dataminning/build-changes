import java.util.EnumSet;
import javax.annotation.Nullable;

public class clk extends cld {
   @Nullable
   private clk.b b;

   public clk(bty<? extends clk> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.b = new clk.b(this);
      this.bS.a(1, new cbe(this));
      this.bS.a(1, new caz(this, this.dS()));
      this.bS.a(3, this.b);
      this.bS.a(4, new cbu(this, 1.0, false));
      this.bS.a(5, new clk.a(this));
      this.bT.a(1, new cdc(this).a());
      this.bT.a(2, new cdd<>(this, cnx.class, true));
   }

   public static bvt.a q() {
      return cld.gu().a(bvu.s, 8.0).a(bvu.v, 0.25).a(bvu.c, 1.0);
   }

   @Override
   protected btr.b bf() {
      return btr.b.c;
   }

   @Override
   protected awf w() {
      return awg.wY;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.xa;
   }

   @Override
   protected awf o_() {
      return awg.wZ;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.xb, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(awx.x)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aT = this.dI();
      super.l();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public float a(jf $$0, dem $$1) {
      return dll.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bty<clk> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (btx.a($$2)) {
         return true;
      } else {
         cnx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cch {
      @Nullable
      private jk i;
      private boolean j;

      public a(clk $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.m() != null) {
            return false;
         } else if (!this.b.P().m()) {
            return false;
         } else {
            azn $$0 = this.b.dV();
            if (this.b.dS().ac().b(def.c) && $$0.a(b(10)) == 0) {
               this.i = jk.b($$0);
               jf $$1 = jf.a(this.b.dx(), this.b.dz() + 0.5, this.b.dD()).a(this.i);
               dus $$2 = this.b.dS().a_($$1);
               if (dll.o($$2)) {
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
            dek $$0 = this.b.dS();
            jf $$1 = jf.a(this.b.dx(), this.b.dz() + 0.5, this.b.dD()).a(this.i);
            dus $$2 = $$0.a_($$1);
            if (dll.o($$2)) {
               $$0.a($$1, dll.p($$2), 3);
               this.b.V();
               this.b.as();
            }
         }
      }
   }

   static class b extends cbk {
      private final clk a;
      private int b;

      public b(clk $$0) {
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
            dej $$0 = this.a.dS();
            azn $$1 = this.a.dV();
            jf $$2 = this.a.ds();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jf $$6 = $$2.b($$4, $$3, $$5);
                     dus $$7 = $$0.a_($$6);
                     dhm $$8 = $$7.b();
                     if ($$8 instanceof dll) {
                        if ($$0.ac().b(def.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dll)$$8).q($$0.a_($$6)), 3);
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
