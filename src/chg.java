import java.util.EnumSet;
import javax.annotation.Nullable;

public class chg extends cgz {
   @Nullable
   private chg.b b;

   public chg(bqb<? extends chg> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new chg.b(this);
      this.bR.a(1, new bxf(this));
      this.bR.a(1, new bxa(this, this.dM()));
      this.bR.a(3, this.b);
      this.bR.a(4, new bxv(this, 1.0, false));
      this.bR.a(5, new chg.a(this));
      this.bS.a(1, new bzd(this).a());
      this.bS.a(2, new bze<>(this, cjt.class, true));
   }

   public static bru.a r() {
      return cgz.gt().a(brv.q, 8.0).a(brv.r, 0.25).a(brv.c, 1.0);
   }

   @Override
   protected bpv.b aZ() {
      return bpv.b.c;
   }

   @Override
   protected aul v() {
      return aum.wB;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.wD;
   }

   @Override
   protected aul o_() {
      return aum.wC;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.wE, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bot $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(ave.y)) && this.b != null) {
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
   public float a(ib $$0, cza $$1) {
      return dfw.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bqb<chg> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cjt $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends byi {
      @Nullable
      private ih i;
      private boolean j;

      public a(chg $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bxl.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            axr $$0 = this.b.ei();
            if (this.b.dM().aa().b(cyt.c) && $$0.a(b(10)) == 0) {
               this.i = ih.b($$0);
               ib $$1 = ib.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
               doz $$2 = this.b.dM().a_($$1);
               if (dfw.m($$2)) {
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
            cyy $$0 = this.b.dM();
            ib $$1 = ib.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
            doz $$2 = $$0.a_($$1);
            if (dfw.m($$2)) {
               $$0.a($$1, dfw.n($$2), 3);
               this.b.Q();
               this.b.am();
            }
         }
      }
   }

   static class b extends bxl {
      private final chg a;
      private int b;

      public b(chg $$0) {
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
            cyx $$0 = this.a.dM();
            axr $$1 = this.a.ei();
            ib $$2 = this.a.dm();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ib $$6 = $$2.b($$4, $$3, $$5);
                     doz $$7 = $$0.a_($$6);
                     dby $$8 = $$7.b();
                     if ($$8 instanceof dfw) {
                        if ($$0.aa().b(cyt.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dfw)$$8).o($$0.a_($$6)), 3);
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
