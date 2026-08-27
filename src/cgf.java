import java.util.EnumSet;
import javax.annotation.Nullable;

public class cgf extends cfy {
   @Nullable
   private cgf.b b;

   public cgf(bpc<? extends cgf> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.b = new cgf.b(this);
      this.bR.a(1, new bwf(this));
      this.bR.a(1, new bwa(this, this.dM()));
      this.bR.a(3, this.b);
      this.bR.a(4, new bwv(this, 1.0, false));
      this.bR.a(5, new cgf.a(this));
      this.bS.a(1, new byd(this).a());
      this.bS.a(2, new bye<>(this, cis.class, true));
   }

   public static bqu.a r() {
      return cfy.gt().a(bqv.q, 8.0).a(bqv.r, 0.25).a(bqv.c, 1.0);
   }

   @Override
   protected bow.b aZ() {
      return bow.b.c;
   }

   @Override
   protected atx v() {
      return aty.wt;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.wv;
   }

   @Override
   protected atx n_() {
      return aty.wu;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.ww, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
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
   public float a(ib $$0, cxc $$1) {
      return ddy.m($$1.a_($$0.d())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bpc<cgf> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      if (c($$0, $$1, $$2, $$3, $$4)) {
         cis $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      } else {
         return false;
      }
   }

   static class a extends bxi {
      @Nullable
      private ih i;
      private boolean j;

      public a(cgf $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(bwl.a.a));
      }

      @Override
      public boolean a() {
         if (this.b.p() != null) {
            return false;
         } else if (!this.b.K().l()) {
            return false;
         } else {
            axd $$0 = this.b.ei();
            if (this.b.dM().Z().b(cwv.c) && $$0.a(b(10)) == 0) {
               this.i = ih.b($$0);
               ib $$1 = ib.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
               dmz $$2 = this.b.dM().a_($$1);
               if (ddy.m($$2)) {
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
            cxa $$0 = this.b.dM();
            ib $$1 = ib.a(this.b.dr(), this.b.dt() + 0.5, this.b.dx()).a(this.i);
            dmz $$2 = $$0.a_($$1);
            if (ddy.m($$2)) {
               $$0.a($$1, ddy.n($$2), 3);
               this.b.Q();
               this.b.am();
            }
         }
      }
   }

   static class b extends bwl {
      private final cgf a;
      private int b;

      public b(cgf $$0) {
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
            cwz $$0 = this.a.dM();
            axd $$1 = this.a.ei();
            ib $$2 = this.a.dm();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     ib $$6 = $$2.b($$4, $$3, $$5);
                     dmz $$7 = $$0.a_($$6);
                     daa $$8 = $$7.b();
                     if ($$8 instanceof ddy) {
                        if ($$0.Z().b(cwv.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((ddy)$$8).o($$0.a_($$6)), 3);
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
