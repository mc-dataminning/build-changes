import java.util.List;
import javax.annotation.Nullable;

public class cos extends cpj {
   @Nullable
   private cmg a;

   public cos(bxc<? extends cos> $$0, djx $$1) {
      super($$0, $$1);
      this.bA = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cos.b());
      this.bF.a(2, new cdx<>(this, crx.class, 8.0F, 0.6, 1.0));
      this.bF.a(3, new cdx<>(this, cqd.class, 8.0F, 0.6, 1.0));
      this.bF.a(4, new cos.c());
      this.bF.a(5, new cos.a());
      this.bF.a(6, new cos.d());
      this.bF.a(8, new cfn(this, 0.6));
      this.bF.a(9, new cey(this, crx.class, 3.0F, 1.0F));
      this.bF.a(10, new cey(this, bxw.class, 8.0F));
      this.bG.a(1, new cgi(this, cto.class).a());
      this.bG.a(2, new cgj<>(this, crx.class, true).c(300));
      this.bG.a(3, new cgj<>(this, cre.class, false).c(300));
      this.bG.a(3, new cgj<>(this, cka.class, false));
   }

   public static byz.a m() {
      return coz.gx().a(bza.v, 0.5).a(bza.m, 12.0).a(bza.s, 24.0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
   }

   @Override
   public awo ai_() {
      return awp.iX;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bwt $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cpn $$1 && $$1.m() != null) {
            return this.t($$1.m());
         }

         return false;
      }
   }

   @Override
   protected awo u() {
      return awp.iV;
   }

   @Override
   protected awo l_() {
      return awp.iY;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.ja;
   }

   void a(@Nullable cmg $$0) {
      this.a = $$0;
   }

   @Nullable
   cmg gM() {
      return this.a;
   }

   @Override
   protected awo q() {
      return awp.iW;
   }

   @Override
   public void a(ars $$0, int $$1, boolean $$2) {
   }

   class a extends cpj.c {
      @Override
      protected int h() {
         return 40;
      }

      @Override
      protected int i() {
         return 100;
      }

      @Override
      protected void k() {
         bxu $$0 = cos.this.f();
         double $$1 = Math.min($$0.dC(), cos.this.dC());
         double $$2 = Math.max($$0.dC(), cos.this.dC()) + 1.0;
         float $$3 = (float)azo.d($$0.dG() - cos.this.dG(), $$0.dA() - cos.this.dA());
         if (cos.this.g((bwt)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cos.this.dA() + (double)azo.b($$5) * 1.5, cos.this.dG() + (double)azo.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cos.this.dA() + (double)azo.b($$7) * 2.5, cos.this.dG() + (double)azo.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cos.this.dA() + (double)azo.b($$3) * $$9, cos.this.dG() + (double)azo.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iv $$6 = iv.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iv $$9 = $$6.e();
            ebe $$10 = cos.this.dV().a_($$9);
            if ($$10.c(cos.this.dV(), $$9, jb.b)) {
               if (!cos.this.dV().v($$6)) {
                  ebe $$11 = cos.this.dV().a_($$6);
                  fgk $$12 = $$11.g(cos.this.dV(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jb.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azo.a($$2) - 1);

         if ($$7) {
            cos.this.dV().b(new csk(cos.this.dV(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cos.this));
            cos.this.dV().a(ege.t, new ffq($$0, (double)$$6.v() + $$8, $$1), ege.a.a(cos.this));
         }
      }

      @Override
      protected awo l() {
         return awp.jb;
      }

      @Override
      protected cpj.a m() {
         return cpj.a.c;
      }
   }

   class b extends cpj.b {
      @Override
      public void a() {
         if (cos.this.f() != null) {
            cos.this.J().a(cos.this.f(), (float)cos.this.af(), (float)cos.this.ad());
         } else if (cos.this.gM() != null) {
            cos.this.J().a(cos.this.gM(), (float)cos.this.af(), (float)cos.this.ad());
         }
      }
   }

   class c extends cpj.c {
      private final cij e = cij.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cos.this.dV()).a(cpn.class, this.e, cos.this, cos.this.cR().g(16.0)).size();
            return cos.this.ae.a(8) + 1 > $$0;
         }
      }

      @Override
      protected int h() {
         return 100;
      }

      @Override
      protected int i() {
         return 340;
      }

      @Override
      protected void k() {
         ars $$0 = (ars)cos.this.dV();
         fgq $$1 = cos.this.cq();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iv $$3 = cos.this.dv().b(-2 + cos.this.ae.a(5), 1, -2 + cos.this.ae.a(5));
            cpn $$4 = bxc.bD.a(cos.this.dV(), bxb.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cos.this.dV().d_($$3), bxb.f, null);
               $$4.a(cos.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cos.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(ege.t, $$3, ege.a.a(cos.this));
            }
         }
      }

      @Override
      protected awo l() {
         return awp.jc;
      }

      @Override
      protected cpj.a m() {
         return cpj.a.b;
      }
   }

   public class d extends cpj.c {
      private final cij e = cij.b().a(16.0).a(($$0x, $$1) -> ((cmg)$$0x).t() == cyw.l);

      @Override
      public boolean b() {
         if (cos.this.f() != null) {
            return false;
         } else if (cos.this.gB()) {
            return false;
         } else if (cos.this.af < this.c) {
            return false;
         } else {
            ars $$0 = a(cos.this.dV());
            if (!$$0.O().c(djt.d)) {
               return false;
            } else {
               List<cmg> $$1 = $$0.a(cmg.class, this.e, cos.this, cos.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cos.this.a($$1.get(cos.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cos.this.gM() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cos.this.a(null);
      }

      @Override
      protected void k() {
         cmg $$0 = cos.this.gM();
         if ($$0 != null && $$0.bJ()) {
            $$0.b(cyw.o);
         }
      }

      @Override
      protected int n() {
         return 40;
      }

      @Override
      protected int h() {
         return 60;
      }

      @Override
      protected int i() {
         return 140;
      }

      @Override
      protected awo l() {
         return awp.jd;
      }

      @Override
      protected cpj.a m() {
         return cpj.a.d;
      }
   }
}
