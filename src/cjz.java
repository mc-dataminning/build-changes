import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjz extends cjl {
   private static final akn<Boolean> bL = akr.a(cjz.class, akp.k);
   private static final akn<Integer> bM = akr.a(cjz.class, akp.b);
   static final cil bN = cil.b().a(10.0).d();
   public static final int bI = 4800;
   private static final int bO = 2400;
   public static final Predicate<coe> bJ = $$0 -> !$$0.o() && $$0.bJ() && $$0.bi();
   public static final float bK = 0.65F;
   private static final boolean bP = false;
   @Nullable
   iw bQ;

   public cjz(bxe<? extends cjz> $$0, djz $$1) {
      super($$0, $$1);
      this.bC = new cdx(this, 85, 10, 0.02F, 0.1F, true);
      this.bB = new cdw(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      this.j(this.cr());
      this.x(0.0F);
      byo $$4 = Objects.requireNonNullElseGet($$3, () -> new bwl.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cjz b(aru $$0, bwl $$1) {
      return bxe.I.a($$0, bxd.e);
   }

   @Override
   public float ek() {
      return this.n_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public boolean q() {
      return this.al.a(bL);
   }

   public void w(boolean $$0) {
      this.al.a(bL, $$0);
   }

   public int t() {
      return this.al.a(bM);
   }

   public void s(int $$0) {
      this.al.a(bM, $$0);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bL, false);
      $$0.a(bM, 2400);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("GotFish", this.q());
      $$0.a("Moistness", this.t());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.w($$0.b("GotFish", false));
      this.s($$0.b("Moistness", 2400));
   }

   @Override
   protected void D() {
      this.bF.a(0, new ced(this));
      this.bF.a(0, new cgc(this));
      this.bF.a(1, new cjz.a(this));
      this.bF.a(2, new cjz.b(this, 4.0));
      this.bF.a(4, new cfq(this, 1.0, 10));
      this.bF.a(4, new cfn(this));
      this.bF.a(5, new cfa(this, crz.class, 6.0F));
      this.bF.a(5, new cei(this, 10));
      this.bF.a(6, new cfc(this, 1.2F, true));
      this.bF.a(8, new cjz.c());
      this.bF.a(8, new cen(this));
      this.bF.a(9, new cdz<>(this, cox.class, 8.0F, 1.0, 1.0));
      this.bG.a(1, new cgk(this, cox.class).a());
   }

   public static bzb.a x() {
      return bxy.E().a(bzc.s, 10.0).a(bzc.v, 1.2F).a(bzc.c, 3.0);
   }

   @Override
   protected chg b(djz $$0) {
      return new chi(this, $$0);
   }

   @Override
   public void gn() {
      this.a(awr.hv, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bxw $$0) {
      return !this.n_() && super.c($$0);
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
   public int ad() {
      return 1;
   }

   @Override
   public int af() {
      return 1;
   }

   @Override
   protected boolean o(bwv $$0) {
      return true;
   }

   @Override
   protected boolean f(bxf $$0) {
      return $$0 == bxf.a && this.fN();
   }

   @Override
   protected void a(aru $$0, coe $$1) {
      if (this.a(bxf.a).f()) {
         daa $$2 = $$1.f();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bxf.a, $$2);
            this.g(bxf.a);
            this.a($$1, $$2.M());
            $$1.aq();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.gj()) {
         this.j(this.cr());
      } else {
         if (this.bk()) {
            this.s(2400);
         } else {
            this.s(this.t() - 1);
            if (this.t() <= 0) {
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
            ffs $$0 = this.h(0.0F);
            float $$1 = azq.b(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azq.a(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
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
   protected but b(crz $$0, bus $$1) {
      daa $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axo.aV)) {
         if (!this.dV().C) {
            this.a(awr.hx, 1.0F, 1.0F);
         }

         if (this.n_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.d), true);
         } else {
            this.w(true);
            $$2.a(1, $$0);
         }

         return but.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.hy;
   }

   @Nullable
   @Override
   protected awq l_() {
      return awr.hw;
   }

   @Nullable
   @Override
   protected awq u() {
      return this.bi() ? awr.hu : awr.ht;
   }

   @Override
   protected awq aV() {
      return awr.hB;
   }

   @Override
   protected awq aU() {
      return awr.hC;
   }

   protected boolean gu() {
      iw $$0 = this.O().g();
      return $$0 != null ? $$0.a(this.dt(), 12.0) : false;
   }

   @Override
   public void a_(ffs $$0) {
      if (this.bi()) {
         this.a(this.fo(), $$0);
         this.a(bya.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.f() == null) {
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

   static class a extends ces {
      private final cjz a;
      private boolean b;

      a(cjz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(ces.a.a, ces.a.b));
      }

      @Override
      public boolean U_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.q() && this.a.cs() >= 100;
      }

      @Override
      public boolean c() {
         iw $$0 = this.a.bQ;
         return $$0 == null ? false : !iw.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) && !this.b && this.a.cs() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dV() instanceof aru) {
            aru $$0 = (aru)this.a.dV();
            this.b = false;
            this.a.O().m();
            iw $$1 = this.a.dv();
            iw $$2 = $$0.a(axr.b, $$1, 50, false);
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
            djz $$0 = this.a.dV();
            if (this.a.gu() || this.a.O().k()) {
               ffs $$1 = ffs.b(this.a.bQ);
               ffs $$2 = cip.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
               if ($$2 == null) {
                  $$2 = cip.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
               }

               if ($$2 != null) {
                  iw $$3 = iw.a((jq)$$2);
                  if (!$$0.b_($$3).a(axl.a) || !$$0.a_($$3).a(eyf.b)) {
                     $$2 = cip.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
                  }
               }

               if ($$2 == null) {
                  this.b = true;
                  return;
               }

               this.a.J().a($$2.d, $$2.e, $$2.f, (float)(this.a.af() + 20), (float)this.a.ad());
               this.a.O().a($$2.d, $$2.e, $$2.f, 1.3);
               if ($$0.A.a(this.a(80)) == 0) {
                  $$0.a(this.a, (byte)38);
               }
            }
         }
      }
   }

   static class b extends ces {
      private final cjz a;
      private final double b;
      @Nullable
      private crz c;

      b(cjz $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(ces.a.a, ces.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(cjz.bN, this.a);
         return this.c == null ? false : this.c.cj() && this.a.f() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.cj() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bvz(bwb.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.O().m();
      }

      @Override
      public void a() {
         this.a.J().a(this.c, (float)(this.a.af() + 20), (float)this.a.ad());
         if (this.a.g(this.c) < 6.25) {
            this.a.O().m();
         } else {
            this.a.O().a(this.c, this.b);
         }

         if (this.c.cj() && this.c.dV().A.a(6) == 0) {
            this.c.b(new bvz(bwb.D, 100), this.a);
         }
      }
   }

   class c extends ces {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cjz.this.af) {
            return false;
         } else {
            List<coe> $$0 = cjz.this.dV().a(coe.class, cjz.this.cR().c(8.0, 8.0, 8.0), cjz.bJ);
            return !$$0.isEmpty() || !cjz.this.a(bxf.a).f();
         }
      }

      @Override
      public void d() {
         List<coe> $$0 = cjz.this.dV().a(coe.class, cjz.this.cR().c(8.0, 8.0, 8.0), cjz.bJ);
         if (!$$0.isEmpty()) {
            cjz.this.O().a($$0.get(0), 1.2F);
            cjz.this.a(awr.hA, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         daa $$0 = cjz.this.a(bxf.a);
         if (!$$0.f()) {
            this.a($$0);
            cjz.this.a(bxf.a, daa.k);
            this.b = cjz.this.af + cjz.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<coe> $$0 = cjz.this.dV().a(coe.class, cjz.this.cR().c(8.0, 8.0, 8.0), cjz.bJ);
         daa $$1 = cjz.this.a(bxf.a);
         if (!$$1.f()) {
            this.a($$1);
            cjz.this.a(bxf.a, daa.k);
         } else if (!$$0.isEmpty()) {
            cjz.this.O().a($$0.get(0), 1.2F);
         }
      }

      private void a(daa $$0) {
         if (!$$0.f()) {
            double $$1 = cjz.this.dE() - 0.3F;
            coe $$2 = new coe(cjz.this.dV(), cjz.this.dA(), $$1, cjz.this.dG(), $$0);
            $$2.b(40);
            $$2.b(cjz.this);
            float $$3 = 0.3F;
            float $$4 = cjz.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cjz.this.ae.i();
            $$2.n(
               (double)(0.3F * -azq.a(cjz.this.dL() * (float) (Math.PI / 180.0)) * azq.b(cjz.this.dN() * (float) (Math.PI / 180.0)) + azq.b($$4) * $$5),
               (double)(0.3F * azq.a(cjz.this.dN() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azq.b(cjz.this.dL() * (float) (Math.PI / 180.0)) * azq.b(cjz.this.dN() * (float) (Math.PI / 180.0)) + azq.a($$4) * $$5)
            );
            cjz.this.dV().b($$2);
         }
      }
   }
}
