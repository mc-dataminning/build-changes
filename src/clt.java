import java.util.EnumSet;
import javax.annotation.Nullable;

public class clt extends clm {
   @Nullable
   private clt.b b;

   public clt(bug<? extends clt> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.b = new clt.b(this);
      this.bS.a(1, new cbn(this));
      this.bS.a(1, new cbi(this, this.dX()));
      this.bS.a(3, this.b);
      this.bS.a(4, new ccd(this, 1.0, false));
      this.bS.a(5, new clt.a(this));
      this.bT.a(1, new cdl(this).a());
      this.bT.a(2, new cdm<>(this, coh.class, true));
   }

   public static bwc.a q() {
      return clm.gB().a(bwd.s, 8.0).a(bwd.v, 0.25).a(bwd.c, 1.0);
   }

   @Override
   protected btz.b bh() {
      return btz.b.c;
   }

   @Override
   protected awj w() {
      return awk.wW;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.wY;
   }

   @Override
   protected awj o_() {
      return awk.wX;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.wZ, 0.15F, 1.0F);
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (($$0.d() != null || $$0.a(axb.x)) && this.b != null) {
            this.b.h();
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public void l() {
      this.aU = this.dN();
      super.l();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public float a(jg $$0, dey $$1) {
      return dlw.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bug<clt> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (buf.a($$2)) {
         return true;
      } else {
         coh $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends ccq {
      @Nullable
      private jl i;
      private boolean j;

      public a(clt $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.m() != null) {
            return false;
         } else if (!this.b.P().m()) {
            return false;
         } else {
            azr $$0 = this.b.ea();
            if (this.b.dX().ac().b(der.c) && $$0.a(b(10)) == 0) {
               this.i = jl.b($$0);
               jg $$1 = jg.a(this.b.dC(), this.b.dE() + 0.5, this.b.dI()).a(this.i);
               dvd $$2 = this.b.dX().a_($$1);
               if (dlw.o($$2)) {
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
            dew $$0 = this.b.dX();
            jg $$1 = jg.a(this.b.dC(), this.b.dE() + 0.5, this.b.dI()).a(this.i);
            dvd $$2 = $$0.a_($$1);
            if (dlw.o($$2)) {
               $$0.a($$1, dlw.p($$2), 3);
               this.b.V();
               this.b.au();
            }
         }
      }
   }

   static class b extends cbt {
      private final clt a;
      private int b;

      public b(clt $$0) {
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
            dev $$0 = this.a.dX();
            azr $$1 = this.a.ea();
            jg $$2 = this.a.dx();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jg $$6 = $$2.b($$4, $$3, $$5);
                     dvd $$7 = $$0.a_($$6);
                     dhy $$8 = $$7.b();
                     if ($$8 instanceof dlw) {
                        if ($$0.ac().b(der.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dlw)$$8).q($$0.a_($$6)), 3);
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
