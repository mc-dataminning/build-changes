import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cki extends cju {
   private static final aku<Boolean> bL = aky.a(cki.class, akw.k);
   private static final aku<Integer> bM = aky.a(cki.class, akw.b);
   static final ciu bN = ciu.b().a(10.0).d();
   public static final int bI = 4800;
   private static final int bO = 2400;
   public static final Predicate<coo> bJ = $$0 -> !$$0.n() && $$0.bJ() && $$0.bi();
   public static final float bK = 0.65F;
   private static final boolean bP = false;
   @Nullable
   iw bQ;

   public cki(bxn<? extends cki> $$0, dkj $$1) {
      super($$0, $$1);
      this.bC = new ceg(this, 85, 10, 0.02F, 0.1F, true);
      this.bB = new cef(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      this.j(this.cr());
      this.x(0.0F);
      byx $$4 = Objects.requireNonNullElseGet($$3, () -> new bwu.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cki b(asb $$0, bwu $$1) {
      return bxn.I.a($$0, bxm.e);
   }

   @Override
   public float ek() {
      return this.e_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public boolean m() {
      return this.al.a(bL);
   }

   public void w(boolean $$0) {
      this.al.a(bL, $$0);
   }

   public int p() {
      return this.al.a(bM);
   }

   public void s(int $$0) {
      this.al.a(bM, $$0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bL, false);
      $$0.a(bM, 2400);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("GotFish", this.m());
      $$0.a("Moistness", this.p());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("GotFish", false));
      this.s($$0.b("Moistness", 2400));
   }

   @Override
   protected void C() {
      this.bF.a(0, new cem(this));
      this.bF.a(0, new cgl(this));
      this.bF.a(1, new cki.a(this));
      this.bF.a(2, new cki.b(this, 4.0));
      this.bF.a(4, new cfz(this, 1.0, 10));
      this.bF.a(4, new cfw(this));
      this.bF.a(5, new cfj(this, csi.class, 6.0F));
      this.bF.a(5, new cer(this, 10));
      this.bF.a(6, new cfl(this, 1.2F, true));
      this.bF.a(8, new cki.c());
      this.bF.a(8, new cew(this));
      this.bF.a(9, new cei<>(this, cpg.class, 8.0F, 1.0, 1.0));
      this.bG.a(1, new cgt(this, cpg.class).a());
   }

   public static bzk.a u() {
      return byh.D().a(bzl.s, 10.0).a(bzl.v, 1.2F).a(bzl.c, 3.0);
   }

   @Override
   protected chp b(dkj $$0) {
      return new chr(this, $$0);
   }

   @Override
   public void gn() {
      this.a(awy.hv, 1.0F, 1.0F);
   }

   @Override
   public boolean c(byf $$0) {
      return !this.e_() && super.c($$0);
   }

   @Override
   public int cr() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cr();
   }

   @Override
   public int ac() {
      return 1;
   }

   @Override
   public int ae() {
      return 1;
   }

   @Override
   protected boolean o(bxe $$0) {
      return true;
   }

   @Override
   protected boolean f(bxo $$0) {
      return $$0 == bxo.a && this.fN();
   }

   @Override
   protected void a(asb $$0, coo $$1) {
      if (this.a(bxo.a).f()) {
         dak $$2 = $$1.e();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bxo.a, $$2);
            this.g(bxo.a);
            this.a($$1, $$2.M());
            $$1.aq();
         }
      }
   }

   @Override
   public void g() {
      super.g();
      if (this.gj()) {
         this.j(this.cr());
      } else {
         if (this.bk()) {
            this.s(2400);
         } else {
            this.s(this.p() - 1);
            if (this.p() <= 0) {
               this.a(this.dW().t(), 1.0F);
            }

            if (this.aH()) {
               this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.w(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dV().C && this.bi() && this.dy().h() > 0.03) {
            fgc $$0 = this.h(0.0F);
            float $$1 = azz.b(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azz.a(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dV()
                  .a(lz.av, this.dA() - $$0.d * (double)$$3 + (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dV()
                  .a(lz.av, this.dA() - $$0.d * (double)$$3 - (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lz.Q);
      } else {
         super.b($$0);
      }
   }

   private void a(lx $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dV().a($$0, this.d(1.0), this.dD() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bvc b(csi $$0, bvb $$1) {
      dak $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axv.aV)) {
         if (!this.dV().C) {
            this.a(awy.hx, 1.0F, 1.0F);
         }

         if (this.e_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.d), true);
         } else {
            this.w(true);
            $$2.a(1, $$0);
         }

         return bvc.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.hy;
   }

   @Nullable
   @Override
   protected awx j_() {
      return awy.hw;
   }

   @Nullable
   @Override
   protected awx s() {
      return this.bi() ? awy.hu : awy.ht;
   }

   @Override
   protected awx aV() {
      return awy.hB;
   }

   @Override
   protected awx aU() {
      return awy.hC;
   }

   protected boolean gu() {
      iw $$0 = this.N().g();
      return $$0 != null ? $$0.a(this.dt(), 12.0) : false;
   }

   @Override
   public void a_(fgc $$0) {
      if (this.bi()) {
         this.a(this.fo(), $$0);
         this.a(byj.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.e() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   static class a extends cfb {
      private final cki a;
      private boolean b;

      a(cki $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cfb.a.a, cfb.a.b));
      }

      @Override
      public boolean V_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.m() && this.a.cs() >= 100;
      }

      @Override
      public boolean c() {
         iw $$0 = this.a.bQ;
         return $$0 == null ? false : !iw.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) && !this.b && this.a.cs() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dV() instanceof asb) {
            asb $$0 = (asb)this.a.dV();
            this.b = false;
            this.a.N().m();
            iw $$1 = this.a.dv();
            iw $$2 = $$0.a(axy.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.bQ = $$2;
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         iw $$0 = this.a.bQ;
         if ($$0 == null || iw.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void a() {
         if (this.a.bQ != null) {
            dkj $$0 = this.a.dV();
            if (this.a.gu() || this.a.N().k()) {
               fgc $$1 = fgc.b(this.a.bQ);
               fgc $$2 = ciy.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
               if ($$2 == null) {
                  $$2 = ciy.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
               }

               if ($$2 != null) {
                  iw $$3 = iw.a((jq)$$2);
                  if (!$$0.b_($$3).a(axs.a) || !$$0.a_($$3).a(eyp.b)) {
                     $$2 = ciy.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
                  }
               }

               if ($$2 == null) {
                  this.b = true;
                  return;
               }

               this.a.I().a($$2.d, $$2.e, $$2.f, (float)(this.a.ae() + 20), (float)this.a.ac());
               this.a.N().a($$2.d, $$2.e, $$2.f, 1.3);
               if ($$0.A.a(this.a(80)) == 0) {
                  $$0.a(this.a, (byte)38);
               }
            }
         }
      }
   }

   static class b extends cfb {
      private final cki a;
      private final double b;
      @Nullable
      private csi c;

      b(cki $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cfb.a.a, cfb.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(cki.bN, this.a);
         return this.c == null ? false : this.c.cj() && this.a.e() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.cj() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bwi(bwk.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.N().m();
      }

      @Override
      public void a() {
         this.a.I().a(this.c, (float)(this.a.ae() + 20), (float)this.a.ac());
         if (this.a.g(this.c) < 6.25) {
            this.a.N().m();
         } else {
            this.a.N().a(this.c, this.b);
         }

         if (this.c.cj() && this.c.dV().A.a(6) == 0) {
            this.c.b(new bwi(bwk.D, 100), this.a);
         }
      }
   }

   class c extends cfb {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cki.this.af) {
            return false;
         } else {
            List<coo> $$0 = cki.this.dV().a(coo.class, cki.this.cR().c(8.0, 8.0, 8.0), cki.bJ);
            return !$$0.isEmpty() || !cki.this.a(bxo.a).f();
         }
      }

      @Override
      public void d() {
         List<coo> $$0 = cki.this.dV().a(coo.class, cki.this.cR().c(8.0, 8.0, 8.0), cki.bJ);
         if (!$$0.isEmpty()) {
            cki.this.N().a($$0.get(0), 1.2F);
            cki.this.a(awy.hA, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         dak $$0 = cki.this.a(bxo.a);
         if (!$$0.f()) {
            this.a($$0);
            cki.this.a(bxo.a, dak.l);
            this.b = cki.this.af + cki.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<coo> $$0 = cki.this.dV().a(coo.class, cki.this.cR().c(8.0, 8.0, 8.0), cki.bJ);
         dak $$1 = cki.this.a(bxo.a);
         if (!$$1.f()) {
            this.a($$1);
            cki.this.a(bxo.a, dak.l);
         } else if (!$$0.isEmpty()) {
            cki.this.N().a($$0.get(0), 1.2F);
         }
      }

      private void a(dak $$0) {
         if (!$$0.f()) {
            double $$1 = cki.this.dE() - 0.3F;
            coo $$2 = new coo(cki.this.dV(), cki.this.dA(), $$1, cki.this.dG(), $$0);
            $$2.b(40);
            $$2.b(cki.this);
            float $$3 = 0.3F;
            float $$4 = cki.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cki.this.ae.i();
            $$2.n(
               (double)(0.3F * -azz.a(cki.this.dL() * (float) (Math.PI / 180.0)) * azz.b(cki.this.dN() * (float) (Math.PI / 180.0)) + azz.b($$4) * $$5),
               (double)(0.3F * azz.a(cki.this.dN() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azz.b(cki.this.dL() * (float) (Math.PI / 180.0)) * azz.b(cki.this.dN() * (float) (Math.PI / 180.0)) + azz.a($$4) * $$5)
            );
            cki.this.dV().b($$2);
         }
      }
   }
}
