import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnq extends cnj {
   @Nullable
   private cnq.b a;

   public cnq(bwb<? extends cnq> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.a = new cnq.b(this);
      this.bB.a(1, new cdh(this));
      this.bB.a(1, new cdc(this, this.dV()));
      this.bB.a(3, this.a);
      this.bB.a(4, new cdx(this, 1.0, false));
      this.bB.a(5, new cnq.a(this));
      this.bC.a(1, new cff(this).a());
      this.bC.a(2, new cfg<>(this, cqi.class, true));
   }

   public static bxw.a j() {
      return cnj.gt().a(bxx.s, 8.0).a(bxx.v, 0.25).a(bxx.c, 1.0);
   }

   @Override
   protected bvs.d bg() {
      return bvs.d.c;
   }

   @Override
   protected awj u() {
      return awk.xH;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.xJ;
   }

   @Override
   protected awj l_() {
      return awk.xI;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.xK, 0.15F, 1.0F);
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(axb.x)) && this.a != null) {
            this.a.h();
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void h() {
      this.aU = this.dL();
      super.h();
   }

   @Override
   public void s(float $$0) {
      this.w($$0);
      super.s($$0);
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      return dow.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bwb<cnq> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bwa.a($$2)) {
         return true;
      } else {
         cqi $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cek {
      @Nullable
      private jo i;
      private boolean j;

      public a(cnq $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.f() != null) {
            return false;
         } else if (!this.b.O().k()) {
            return false;
         } else {
            azs $$0 = this.b.dY();
            if (a(this.b).O().c(dhl.c) && $$0.a(b(10)) == 0) {
               this.i = jo.b($$0);
               jj $$1 = jj.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
               dym $$2 = this.b.dV().a_($$1);
               if (dow.o($$2)) {
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
            dhq $$0 = this.b.dV();
            jj $$1 = jj.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
            dym $$2 = $$0.a_($$1);
            if (dow.o($$2)) {
               $$0.a($$1, dow.p($$2), 3);
               this.b.U();
               this.b.at();
            }
         }
      }
   }

   static class b extends cdn {
      private final cnq a;
      private int b;

      public b(cnq $$0) {
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
            dhp $$0 = this.a.dV();
            azs $$1 = this.a.dY();
            jj $$2 = this.a.dv();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     jj $$6 = $$2.b($$4, $$3, $$5);
                     dym $$7 = $$0.a_($$6);
                     dku $$8 = $$7.b();
                     if ($$8 instanceof dow) {
                        if (a($$0).O().c(dhl.c)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((dow)$$8).q($$0.a_($$6)), 3);
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
