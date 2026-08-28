import java.util.List;
import javax.annotation.Nullable;

public class cou extends cpl {
   @Nullable
   private cmi a;

   public cou(bxe<? extends cou> $$0, djz $$1) {
      super($$0, $$1);
      this.bA = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cem(this));
      this.bF.a(1, new cou.b());
      this.bF.a(2, new cdz<>(this, crz.class, 8.0F, 0.6, 1.0));
      this.bF.a(3, new cdz<>(this, cqf.class, 8.0F, 0.6, 1.0));
      this.bF.a(4, new cou.c());
      this.bF.a(5, new cou.a());
      this.bF.a(6, new cou.d());
      this.bF.a(8, new cfp(this, 0.6));
      this.bF.a(9, new cfa(this, crz.class, 3.0F, 1.0F));
      this.bF.a(10, new cfa(this, bxy.class, 8.0F));
      this.bG.a(1, new cgk(this, ctq.class).a());
      this.bG.a(2, new cgl<>(this, crz.class, true).c(300));
      this.bG.a(3, new cgl<>(this, crg.class, false).c(300));
      this.bG.a(3, new cgl<>(this, ckc.class, false));
   }

   public static bzb.a m() {
      return cpb.gx().a(bzc.v, 0.5).a(bzc.m, 12.0).a(bzc.s, 24.0);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
   }

   @Override
   public awq ai_() {
      return awr.iX;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bwv $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cpp $$1 && $$1.m() != null) {
            return this.t($$1.m());
         }

         return false;
      }
   }

   @Override
   protected awq u() {
      return awr.iV;
   }

   @Override
   protected awq l_() {
      return awr.iY;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.ja;
   }

   void a(@Nullable cmi $$0) {
      this.a = $$0;
   }

   @Nullable
   cmi gM() {
      return this.a;
   }

   @Override
   protected awq q() {
      return awr.iW;
   }

   @Override
   public void a(aru $$0, int $$1, boolean $$2) {
   }

   class a extends cpl.c {
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
         bxw $$0 = cou.this.f();
         double $$1 = Math.min($$0.dC(), cou.this.dC());
         double $$2 = Math.max($$0.dC(), cou.this.dC()) + 1.0;
         float $$3 = (float)azq.d($$0.dG() - cou.this.dG(), $$0.dA() - cou.this.dA());
         if (cou.this.g((bwv)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cou.this.dA() + (double)azq.b($$5) * 1.5, cou.this.dG() + (double)azq.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cou.this.dA() + (double)azq.b($$7) * 2.5, cou.this.dG() + (double)azq.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cou.this.dA() + (double)azq.b($$3) * $$9, cou.this.dG() + (double)azq.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iw $$6 = iw.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iw $$9 = $$6.e();
            ebg $$10 = cou.this.dV().a_($$9);
            if ($$10.c(cou.this.dV(), $$9, jc.b)) {
               if (!cou.this.dV().v($$6)) {
                  ebg $$11 = cou.this.dV().a_($$6);
                  fgm $$12 = $$11.g(cou.this.dV(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jc.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azq.a($$2) - 1);

         if ($$7) {
            cou.this.dV().b(new csm(cou.this.dV(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cou.this));
            cou.this.dV().a(egg.t, new ffs($$0, (double)$$6.v() + $$8, $$1), egg.a.a(cou.this));
         }
      }

      @Override
      protected awq l() {
         return awr.jb;
      }

      @Override
      protected cpl.a m() {
         return cpl.a.c;
      }
   }

   class b extends cpl.b {
      @Override
      public void a() {
         if (cou.this.f() != null) {
            cou.this.J().a(cou.this.f(), (float)cou.this.af(), (float)cou.this.ad());
         } else if (cou.this.gM() != null) {
            cou.this.J().a(cou.this.gM(), (float)cou.this.af(), (float)cou.this.ad());
         }
      }
   }

   class c extends cpl.c {
      private final cil e = cil.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cou.this.dV()).a(cpp.class, this.e, cou.this, cou.this.cR().g(16.0)).size();
            return cou.this.ae.a(8) + 1 > $$0;
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
         aru $$0 = (aru)cou.this.dV();
         fgs $$1 = cou.this.cq();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iw $$3 = cou.this.dv().b(-2 + cou.this.ae.a(5), 1, -2 + cou.this.ae.a(5));
            cpp $$4 = bxe.bD.a(cou.this.dV(), bxd.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cou.this.dV().d_($$3), bxd.f, null);
               $$4.a(cou.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cou.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(egg.t, $$3, egg.a.a(cou.this));
            }
         }
      }

      @Override
      protected awq l() {
         return awr.jc;
      }

      @Override
      protected cpl.a m() {
         return cpl.a.b;
      }
   }

   public class d extends cpl.c {
      private final cil e = cil.b().a(16.0).a(($$0x, $$1) -> ((cmi)$$0x).t() == cyy.l);

      @Override
      public boolean b() {
         if (cou.this.f() != null) {
            return false;
         } else if (cou.this.gB()) {
            return false;
         } else if (cou.this.af < this.c) {
            return false;
         } else {
            aru $$0 = a(cou.this.dV());
            if (!$$0.O().c(djv.d)) {
               return false;
            } else {
               List<cmi> $$1 = $$0.a(cmi.class, this.e, cou.this, cou.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cou.this.a($$1.get(cou.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cou.this.gM() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cou.this.a(null);
      }

      @Override
      protected void k() {
         cmi $$0 = cou.this.gM();
         if ($$0 != null && $$0.bJ()) {
            $$0.b(cyy.o);
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
      protected awq l() {
         return awr.jd;
      }

      @Override
      protected cpl.a m() {
         return cpl.a.d;
      }
   }
}
