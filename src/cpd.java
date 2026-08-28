import java.util.List;
import javax.annotation.Nullable;

public class cpd extends cpu {
   @Nullable
   private cmr a;

   public cpd(bxn<? extends cpd> $$0, dkj $$1) {
      super($$0, $$1);
      this.bA = 10;
   }

   @Override
   protected void D() {
      super.D();
      this.bF.a(0, new cev(this));
      this.bF.a(1, new cpd.b());
      this.bF.a(2, new cei<>(this, csi.class, 8.0F, 0.6, 1.0));
      this.bF.a(3, new cei<>(this, cqo.class, 8.0F, 0.6, 1.0));
      this.bF.a(4, new cpd.c());
      this.bF.a(5, new cpd.a());
      this.bF.a(6, new cpd.d());
      this.bF.a(8, new cfy(this, 0.6));
      this.bF.a(9, new cfj(this, csi.class, 3.0F, 1.0F));
      this.bF.a(10, new cfj(this, byh.class, 8.0F));
      this.bG.a(1, new cgt(this, ctz.class).a());
      this.bG.a(2, new cgu<>(this, csi.class, true).c(300));
      this.bG.a(3, new cgu<>(this, crp.class, false).c(300));
      this.bG.a(3, new cgu<>(this, ckl.class, false));
   }

   public static bzk.a m() {
      return cpk.gx().a(bzl.v, 0.5).a(bzl.m, 12.0).a(bzl.s, 24.0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
   }

   @Override
   public awx aj_() {
      return awy.iX;
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
   }

   @Override
   protected boolean t(bxe $$0) {
      if ($$0 == this) {
         return true;
      } else if (super.t($$0)) {
         return true;
      } else {
         if ($$0 instanceof cpy $$1 && $$1.m() != null) {
            return this.t($$1.m());
         }

         return false;
      }
   }

   @Override
   protected awx u() {
      return awy.iV;
   }

   @Override
   protected awx l_() {
      return awy.iY;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.ja;
   }

   void a(@Nullable cmr $$0) {
      this.a = $$0;
   }

   @Nullable
   cmr gM() {
      return this.a;
   }

   @Override
   protected awx q() {
      return awy.iW;
   }

   @Override
   public void a(asb $$0, int $$1, boolean $$2) {
   }

   class a extends cpu.c {
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
         byf $$0 = cpd.this.f();
         double $$1 = Math.min($$0.dC(), cpd.this.dC());
         double $$2 = Math.max($$0.dC(), cpd.this.dC()) + 1.0;
         float $$3 = (float)azz.d($$0.dG() - cpd.this.dG(), $$0.dA() - cpd.this.dA());
         if (cpd.this.g((bxe)$$0) < 9.0) {
            for (int $$4 = 0; $$4 < 5; $$4++) {
               float $$5 = $$3 + (float)$$4 * (float) Math.PI * 0.4F;
               this.a(cpd.this.dA() + (double)azz.b($$5) * 1.5, cpd.this.dG() + (double)azz.a($$5) * 1.5, $$1, $$2, $$5, 0);
            }

            for (int $$6 = 0; $$6 < 8; $$6++) {
               float $$7 = $$3 + (float)$$6 * (float) Math.PI * 2.0F / 8.0F + (float) (Math.PI * 2.0 / 5.0);
               this.a(cpd.this.dA() + (double)azz.b($$7) * 2.5, cpd.this.dG() + (double)azz.a($$7) * 2.5, $$1, $$2, $$7, 3);
            }
         } else {
            for (int $$8 = 0; $$8 < 16; $$8++) {
               double $$9 = 1.25 * (double)($$8 + 1);
               int $$10 = 1 * $$8;
               this.a(cpd.this.dA() + (double)azz.b($$3) * $$9, cpd.this.dG() + (double)azz.a($$3) * $$9, $$1, $$2, $$3, $$10);
            }
         }
      }

      private void a(double $$0, double $$1, double $$2, double $$3, float $$4, int $$5) {
         iw $$6 = iw.a($$0, $$3, $$1);
         boolean $$7 = false;
         double $$8 = 0.0;

         do {
            iw $$9 = $$6.e();
            ebq $$10 = cpd.this.dV().a_($$9);
            if ($$10.c(cpd.this.dV(), $$9, jc.b)) {
               if (!cpd.this.dV().v($$6)) {
                  ebq $$11 = cpd.this.dV().a_($$6);
                  fgw $$12 = $$11.g(cpd.this.dV(), $$6);
                  if (!$$12.c()) {
                     $$8 = $$12.c(jc.a.b);
                  }
               }

               $$7 = true;
               break;
            }

            $$6 = $$6.e();
         } while ($$6.v() >= azz.a($$2) - 1);

         if ($$7) {
            cpd.this.dV().b(new csv(cpd.this.dV(), $$0, (double)$$6.v() + $$8, $$1, $$4, $$5, cpd.this));
            cpd.this.dV().a(egq.t, new fgc($$0, (double)$$6.v() + $$8, $$1), egq.a.a(cpd.this));
         }
      }

      @Override
      protected awx l() {
         return awy.jb;
      }

      @Override
      protected cpu.a m() {
         return cpu.a.c;
      }
   }

   class b extends cpu.b {
      @Override
      public void a() {
         if (cpd.this.f() != null) {
            cpd.this.J().a(cpd.this.f(), (float)cpd.this.af(), (float)cpd.this.ad());
         } else if (cpd.this.gM() != null) {
            cpd.this.J().a(cpd.this.gM(), (float)cpd.this.af(), (float)cpd.this.ad());
         }
      }
   }

   class c extends cpu.c {
      private final ciu e = ciu.b().a(16.0).d().e();

      @Override
      public boolean b() {
         if (!super.b()) {
            return false;
         } else {
            int $$0 = a(cpd.this.dV()).a(cpy.class, this.e, cpd.this, cpd.this.cR().g(16.0)).size();
            return cpd.this.ae.a(8) + 1 > $$0;
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
         asb $$0 = (asb)cpd.this.dV();
         fhc $$1 = cpd.this.cq();

         for (int $$2 = 0; $$2 < 3; $$2++) {
            iw $$3 = cpd.this.dv().b(-2 + cpd.this.ae.a(5), 1, -2 + cpd.this.ae.a(5));
            cpy $$4 = bxn.bD.a(cpd.this.dV(), bxm.f);
            if ($$4 != null) {
               $$4.a($$3, 0.0F, 0.0F);
               $$4.a($$0, cpd.this.dV().d_($$3), bxm.f, null);
               $$4.a(cpd.this);
               $$4.h($$3);
               $$4.b(20 * (30 + cpd.this.ae.a(90)));
               if ($$1 != null) {
                  $$0.g().a($$4.cI(), $$1);
               }

               $$0.a_($$4);
               $$0.a(egq.t, $$3, egq.a.a(cpd.this));
            }
         }
      }

      @Override
      protected awx l() {
         return awy.jc;
      }

      @Override
      protected cpu.a m() {
         return cpu.a.b;
      }
   }

   public class d extends cpu.c {
      private final ciu e = ciu.b().a(16.0).a(($$0x, $$1) -> ((cmr)$$0x).t() == czi.l);

      @Override
      public boolean b() {
         if (cpd.this.f() != null) {
            return false;
         } else if (cpd.this.gB()) {
            return false;
         } else if (cpd.this.af < this.c) {
            return false;
         } else {
            asb $$0 = a(cpd.this.dV());
            if (!$$0.O().c(dkf.d)) {
               return false;
            } else {
               List<cmr> $$1 = $$0.a(cmr.class, this.e, cpd.this, cpd.this.cR().c(16.0, 4.0, 16.0));
               if ($$1.isEmpty()) {
                  return false;
               } else {
                  cpd.this.a($$1.get(cpd.this.ae.a($$1.size())));
                  return true;
               }
            }
         }
      }

      @Override
      public boolean c() {
         return cpd.this.gM() != null && this.b > 0;
      }

      @Override
      public void e() {
         super.e();
         cpd.this.a(null);
      }

      @Override
      protected void k() {
         cmr $$0 = cpd.this.gM();
         if ($$0 != null && $$0.bJ()) {
            $$0.b(czi.o);
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
      protected awx l() {
         return awy.jd;
      }

      @Override
      protected cpu.a m() {
         return cpu.a.d;
      }
   }
}
