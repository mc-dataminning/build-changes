import java.util.EnumSet;
import javax.annotation.Nullable;

public class cpg extends coz {
   @Nullable
   private cpg.b a;

   public cpg(bxc<? extends cpg> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.a = new cpg.b(this);
      this.bF.a(1, new cek(this));
      this.bF.a(1, new cef(this, this.dV()));
      this.bF.a(3, this.a);
      this.bF.a(4, new cfa(this, 1.0, false));
      this.bF.a(5, new cpg.a(this));
      this.bG.a(1, new cgi(this).a());
      this.bG.a(2, new cgj<>(this, crx.class, true));
   }

   public static byz.a j() {
      return coz.gx().a(bza.s, 8.0).a(bza.v, 0.25).a(bza.c, 1.0);
   }

   @Override
   protected bwt.c bf() {
      return bwt.c.c;
   }

   @Override
   protected awo u() {
      return awp.xN;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.xP;
   }

   @Override
   protected awo l_() {
      return awp.xO;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.xQ, 0.15F, 1.0F);
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.a($$0, $$1)) {
         return false;
      } else {
         if (($$1.d() != null || $$1.a(axf.x)) && this.a != null) {
            this.a.h();
         }

         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void h() {
      this.aV = this.dL();
      super.h();
   }

   @Override
   public void s(float $$0) {
      this.w($$0);
      super.s($$0);
   }

   @Override
   public float a(iv $$0, dka $$1) {
      return drg.o($$1.a_($$0.e())) ? 10.0F : super.a($$0, $$1);
   }

   public static boolean b(bxc<cpg> $$0, djy $$1, bxb $$2, iv $$3, azx $$4) {
      if (!c($$0, $$1, $$2, $$3, $$4)) {
         return false;
      } else if (bxb.a($$2)) {
         return true;
      } else {
         crx $$5 = $$1.a((double)$$3.u() + 0.5, (double)$$3.v() + 0.5, (double)$$3.w() + 0.5, 5.0, true);
         return $$5 == null;
      }
   }

   static class a extends cfn {
      @Nullable
      private jb i;
      private boolean j;

      public a(cpg $$0) {
         super($$0, 1.0, 10);
         this.a(EnumSet.of(ceq.a.a));
      }

      @Override
      public boolean b() {
         if (this.b.f() != null) {
            return false;
         } else if (!this.b.O().k()) {
            return false;
         } else {
            azx $$0 = this.b.dY();
            if (a(this.b).O().c(djt.d) && $$0.a(b(10)) == 0) {
               this.i = jb.b($$0);
               iv $$1 = iv.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
               ebe $$2 = this.b.dV().a_($$1);
               if (drg.o($$2)) {
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
            djy $$0 = this.b.dV();
            iv $$1 = iv.a(this.b.dA(), this.b.dC() + 0.5, this.b.dG()).a(this.i);
            ebe $$2 = $$0.a_($$1);
            if (drg.o($$2)) {
               $$0.a($$1, drg.p($$2), 3);
               this.b.U();
               this.b.aq();
            }
         }
      }
   }

   static class b extends ceq {
      private final cpg a;
      private int b;

      public b(cpg $$0) {
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
            djx $$0 = this.a.dV();
            azx $$1 = this.a.dY();
            iv $$2 = this.a.dv();

            for (int $$3 = 0; $$3 <= 5 && $$3 >= -5; $$3 = ($$3 <= 0 ? 1 : 0) - $$3) {
               for (int $$4 = 0; $$4 <= 10 && $$4 >= -10; $$4 = ($$4 <= 0 ? 1 : 0) - $$4) {
                  for (int $$5 = 0; $$5 <= 10 && $$5 >= -10; $$5 = ($$5 <= 0 ? 1 : 0) - $$5) {
                     iv $$6 = $$2.b($$4, $$3, $$5);
                     ebe $$7 = $$0.a_($$6);
                     dnc $$8 = $$7.b();
                     if ($$8 instanceof drg) {
                        if (a($$0).O().c(djt.d)) {
                           $$0.a($$6, true, this.a);
                        } else {
                           $$0.a($$6, ((drg)$$8).q($$0.a_($$6)), 3);
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
