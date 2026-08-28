import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckk extends ckd {
   @Nullable
   private ckk.b b;

   public ckk(bsx<? extends ckk> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.b = new ckk.b(this);
      this.bU.a(1, new cag(this));
      this.bU.a(1, new cab(this, this.dP()));
      this.bU.a(3, this.b);
      this.bU.a(4, new caw(this, 1.0, false));
      this.bU.a(5, new ckk.a(this));
      this.bV.a(1, new cce(this).a());
      this.bV.a(2, new ccf<>(this, cmx.class, true));
   }

   public static buv.a s() {
      return ckd.gr().a(buw.s, 8.0).a(buw.v, 0.25).a(buw.c, 1.0);
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.c;
   }

   @Override
   protected avo v() {
      return avp.wX;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.wZ;
   }

   @Override
   protected avo n_() {
      return avp.wY;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.xa, 0.15F, 1.0F);
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(awg.x)) && this.b != null) {
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
   public void p(float $$0) {
      this.t($$0);
      super.p($$0);
   }

   @Override
   public float a(jd $$0, dcz $$1) {
      return djx.m($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bsx<ckk> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cmx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends cbj {
      @Nullable
      private ji i;
      private boolean j;

      public a(ckk $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cam.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.N().l()) {
            return false;
         } else {
            ayw $$0 = this.b.dS();
            if (this.b.dP().ab().b(dcs.c) && $$0.a(b(10)) == 0) {
               this.i = ji.b($$0);
               jd $$1 = jd.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
               dtc $$2 = this.b.dP().a_($$1);
               if (djx.m($$2)) {
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
            dcx $$0 = this.b.dP();
            jd $$1 = jd.a(this.b.du(), this.b.dw() + 0.5, this.b.dA()).a(this.i);
            dtc $$2 = $$0.a_($$1);
            if (djx.m($$2)) {
               $$0.a($$1, djx.n($$2), 3);
               this.b.T();
               this.b.aq();
            }
         }
      }
   }

   static class b extends cam {
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
      public boolean b() {
         return this.b > 0;
      }

      @Override
      public void a() {
         this.b--;
         if (this.b <= 0) {
            dcw $$0 = this.a.dP();
            ayw $$1 = this.a.dS();
            jd $$2 = this.a.dp();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jd $$6 = $$2.b($$4, $$3, $$5);
                     dtc $$7 = $$0.a_($$6);
                     dfy $$8 = $$7.b();
                     if ($$8 instanceof djx) {
                        if ($$0.ab().b(dcs.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((djx)$$8).o($$0.a_($$6)), 3);
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
