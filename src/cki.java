import java.util.EnumSet;
import javax.annotation.Nullable;

public class cki extends ckb {
   @Nullable
   private cki.b b;

   public cki(bsw<? extends cki> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new cki.b(this);
      this.bU.a(1, new cae(this));
      this.bU.a(1, new bzz(this, this.dQ()));
      this.bU.a(3, this.b);
      this.bU.a(4, new cau(this, 1.0, false));
      this.bU.a(5, new cki.a(this));
      this.bV.a(1, new ccc(this).a());
      this.bV.a(2, new ccd<>(this, cmv.class, true));
   }

   public static but.a s() {
      return ckb.gs().a(buu.s, 8.0).a(buu.v, 0.25).a(buu.c, 1.0);
   }

   @Override
   protected bsq.b bc() {
      return bsq.b.c;
   }

   @Override
   protected avn v() {
      return avo.wX;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.wZ;
   }

   @Override
   protected avn n_() {
      return avo.wY;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.xa, 0.15F, 1.0F);
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(awf.x)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aY = this.dG();
      super.l();
   }

   @Override
   public void p(float $$0) {
      this.s($$0);
      super.p($$0);
   }

   @Override
   public float a(jd $$0, dcx $$1) {
      return djv.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bsw<cki> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmv $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends cbh {
      @Nullable
      private ji i;
      private boolean j;

      public a(cki $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cak.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.J().l()) {
            return false;
         } else {
            ayv $$0 = this.b.dT();
            if (this.b.dQ().ab().b(dcq.c) && $$0.a(b(10)) == 0) {
               this.i = ji.b($$0);
               jd $$1 = jd.a(this.b.dv(), this.b.dx() + 0.5, this.b.dB()).a(this.i);
               dta $$2 = this.b.dQ().a_($$1);
               if (djv.m($$2)) {
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
            dcv $$0 = this.b.dQ();
            jd $$1 = jd.a(this.b.dv(), this.b.dx() + 0.5, this.b.dB()).a(this.i);
            dta $$2 = $$0.a_($$1);
            if (djv.m($$2)) {
               $$0.a($$1, djv.n($$2), 3);
               this.b.R();
               this.b.aq();
            }
         }
      }
   }

   static class b extends cak {
      private final cki a;
      private int b;

      public b(cki $$0) {
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
            dcu $$0 = this.a.dQ();
            ayv $$1 = this.a.dT();
            jd $$2 = this.a.dq();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jd $$6 = $$2.b($$4, $$3, $$5);
                     dta $$7 = $$0.a_($$6);
                     dfw $$8 = $$7.b();
                     if ($$8 instanceof djv) {
                        if ($$0.ab().b(dcq.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((djv)$$8).o($$0.a_($$6)), 3);
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
