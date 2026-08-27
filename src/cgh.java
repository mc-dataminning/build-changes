import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgh extends cga {
   @Nullable
   private cgh.b b;

   public cgh(bpd<? extends cgh> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new cgh.b(this);
      this.bR.a(1, new bwg(this));
      this.bR.a(1, new bwb(this, this.dM()));
      this.bR.a(3, this.b);
      this.bR.a(4, new bww(this, 1.0, false));
      this.bR.a(5, new cgh.a(this));
      this.bS.a(1, new bye(this).a());
      this.bS.a(2, new byf<>(this, ciu.class, true));
   }

   public static bqv.a r() {
      return cga.gt().a(bqw.q, 8.0).a(bqw.r, 0.25).a(bqw.c, 1.0);
   }

   @Override
   protected box.b aZ() {
      return box.b.c;
   }

   @Override
   protected atx v() {
      return aty.wy;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.wA;
   }

   @Override
   protected atx n_() {
      return aty.wz;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.wB, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bnw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(aup.y)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aX = this.dC();
      super.l();
   }

   @Override
   public void o(float $$0) {
      this.r($$0);
      super.o($$0);
   }

   @Override
   public float a(ib $$0, cxe $$1) {
      return dea.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bpd<cgh> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         ciu $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends bxj {
      @Nullable
      private ih i;
      private boolean j;

      public a(cgh $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bwm.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            axd $$0 = this.b.ei();
            if (this.b.dM().Z().b(cwx.c) && $$0.a(b(10)) == 0) {
               this.i = ih.b($$0);
               ib $$1 = ib.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
               dnb $$2 = this.b.dM().a_($$1);
               if (dea.m($$2)) {
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
            cxc $$0 = this.b.dM();
            ib $$1 = ib.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
            dnb $$2 = $$0.a_($$1);
            if (dea.m($$2)) {
               $$0.a($$1, dea.n($$2), 3);
               this.b.Q();
               this.b.am();
            }
         }
      }
   }

   static class b extends bwm {
      private final cgh a;
      private int b;

      public b(cgh $$0) {
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
            cxb $$0 = this.a.dM();
            axd $$1 = this.a.ei();
            ib $$2 = this.a.dm();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ib $$6 = $$2.b($$4, $$3, $$5);
                     dnb $$7 = $$0.a_($$6);
                     dac $$8 = $$7.b();
                     if ($$8 instanceof dea) {
                        if ($$0.Z().b(cwx.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dea)$$8).o($$0.a_($$6)), 3);
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
