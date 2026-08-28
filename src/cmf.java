import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmf extends cly {
   @Nullable
   private cmf.b a;

   public cmf(bus<? extends cmf> $$0, dfm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.a = new cmf.b(this);
      this.bS.a(1, new cbz(this));
      this.bS.a(1, new cbu(this, this.dV()));
      this.bS.a(3, this.a);
      this.bS.a(4, new ccp(this, 1.0, false));
      this.bS.a(5, new cmf.a(this));
      this.bT.a(1, new cdx(this).a());
      this.bT.a(2, new cdy<>(this, cou.class, true));
   }

   public static bwo.a n() {
      return cly.gs().a(bwp.s, 8.0).a(bwp.v, 0.25).a(bwp.c, 1.0);
   }

   @Override
   protected bul.b bg() {
      return bul.b.c;
   }

   @Override
   protected awm t() {
      return awn.wW;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.wY;
   }

   @Override
   protected awm n_() {
      return awn.wX;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.wZ, 0.15F, 1.0F);
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(axe.x)) && this.a != null) {
            this.a.h();
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void h() {
      this.aW = this.dL();
      super.h();
   }

   @Override
   public void r(float $$0) {
      this.v($$0);
      super.r($$0);
   }

   @Override
   public float a(jh $$0, dfp $$1) {
      return dmo.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bus<cmf> $$0, dfn $$1, bur $$2, jh $$3, azu $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bur.a($$2)) {
         return true;
      } else {
         cou $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cdc {
      @Nullable
      private jm i;
      private boolean j;

      public a(cmf $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(ccf.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.aa_() != null) {
            return false;
         } else if (!this.b.L().m()) {
            return false;
         } else {
            azu $$0 = this.b.dY();
            if (a(this.b).N().b(dfi.c) && $$0.a(b(10)) == 0) {
               this.i = jm.b($$0);
               jh $$1 = jh.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
               dvv $$2 = this.b.dV().a_($$1);
               if (dmo.o($$2)) {
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
            dfn $$0 = this.b.dV();
            jh $$1 = jh.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
            dvv $$2 = $$0.a_($$1);
            if (dmo.o($$2)) {
               $$0.a($$1, dmo.p($$2), 3);
               this.b.S();
               this.b.at();
            }
         }
      }
   }

   static class b extends ccf {
      private final cmf a;
      private int b;

      public b(cmf $$0) {
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
            dfm $$0 = this.a.dV();
            azu $$1 = this.a.dY();
            jh $$2 = this.a.dv();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jh $$6 = $$2.b($$4, $$3, $$5);
                     dvv $$7 = $$0.a_($$6);
                     diq $$8 = $$7.b();
                     if ($$8 instanceof dmo) {
                        if (a($$0).N().b(dfi.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dmo)$$8).q($$0.a_($$6)), 3);
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
