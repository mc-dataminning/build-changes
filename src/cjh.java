import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cjh extends cit {
   private static final akj<iu> bJ = akn.a(cjh.class, akl.o);
   private static final akj<Boolean> bK = akn.a(cjh.class, akl.k);
   private static final akj<Integer> bL = akn.a(cjh.class, akl.b);
   static final cht bM = cht.b().a(10.0).d();
   public static final int bG = 4800;
   private static final int bN = 2400;
   public static final Predicate<cnh> bH = $$0 -> !$$0.o() && $$0.bK() && $$0.bj();
   public static final float bI = 0.65F;

   public cjh(bwo<? extends cjh> $$0, dja $$1) {
      super($$0, $$1);
      this.bA = new cdf(this, 85, 10, 0.02F, 0.1F, true);
      this.bz = new cde(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      this.j(this.cs());
      this.x(0.0F);
      bxw $$4 = Objects.requireNonNullElseGet($$3, () -> new bvv.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cjh b(arq $$0, bvv $$1) {
      return bwo.H.a($$0, bwn.e);
   }

   @Override
   public float ek() {
      return this.n_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public void h(iu $$0) {
      this.al.a(bJ, $$0);
   }

   public iu q() {
      return this.al.a(bJ);
   }

   public boolean t() {
      return this.al.a(bK);
   }

   public void w(boolean $$0) {
      this.al.a(bK, $$0);
   }

   public int x() {
      return this.al.a(bL);
   }

   public void s(int $$0) {
      this.al.a(bL, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bJ, iu.c);
      $$0.a(bK, false);
      $$0.a(bL, 2400);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.q().u());
      $$0.a("TreasurePosY", this.q().v());
      $$0.a("TreasurePosZ", this.q().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(tz $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new iu($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.s($$0.h("Moistness"));
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdl(this));
      this.bD.a(0, new cfk(this));
      this.bD.a(1, new cjh.a(this));
      this.bD.a(2, new cjh.b(this, 4.0));
      this.bD.a(4, new cey(this, 1.0, 10));
      this.bD.a(4, new cev(this));
      this.bD.a(5, new cei(this, crc.class, 6.0F));
      this.bD.a(5, new cdq(this, 10));
      this.bD.a(6, new cek(this, 1.2F, true));
      this.bD.a(8, new cjh.c());
      this.bD.a(8, new cdv(this));
      this.bD.a(9, new cdh<>(this, cnz.class, 8.0F, 1.0, 1.0));
      this.bE.a(1, new cfs(this, cnz.class).a());
   }

   public static byj.a gr() {
      return bxg.E().a(byk.s, 10.0).a(byk.v, 1.2F).a(byk.c, 3.0);
   }

   @Override
   protected cgo b(dja $$0) {
      return new cgq(this, $$0);
   }

   @Override
   public void gk() {
      this.a(awn.hv, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bxe $$0) {
      return !this.n_() && super.c($$0);
   }

   @Override
   public int cs() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cs();
   }

   @Override
   public int ac() {
      return 1;
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   protected boolean o(bwf $$0) {
      return true;
   }

   @Override
   protected boolean f(bwp $$0) {
      return $$0 == bwp.a && this.fN();
   }

   @Override
   protected void a(arq $$0, cnh $$1) {
      if (this.a(bwp.a).f()) {
         czd $$2 = $$1.f();
         if (this.g($$2)) {
            this.a($$1);
            this.a(bwp.a, $$2);
            this.g(bwp.a);
            this.a($$1, $$2.M());
            $$1.at();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.gg()) {
         this.j(this.cs());
      } else {
         if (this.bl()) {
            this.s(2400);
         } else {
            this.s(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dW().t(), 1.0F);
            }

            if (this.aJ()) {
               this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.w(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dV().C && this.bj() && this.dy().h() > 0.03) {
            feq $$0 = this.h(0.0F);
            float $$1 = azm.b(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azm.a(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dV()
                  .a(lx.av, this.dA() - $$0.d * (double)$$3 + (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dV()
                  .a(lx.av, this.dA() - $$0.d * (double)$$3 - (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lx.Q);
      } else {
         super.b($$0);
      }
   }

   private void a(lv $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dV().a($$0, this.d(1.0), this.dD() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bud b(crc $$0, buc $$1) {
      czd $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axk.aU)) {
         if (!this.dV().C) {
            this.a(awn.hx, 1.0F, 1.0F);
         }

         if (this.n_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.w(true);
            $$2.a(1, $$0);
         }

         return bud.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awm e(buu $$0) {
      return awn.hy;
   }

   @Nullable
   @Override
   protected awm l_() {
      return awn.hw;
   }

   @Nullable
   @Override
   protected awm u() {
      return this.bj() ? awn.hu : awn.ht;
   }

   @Override
   protected awm aW() {
      return awn.hB;
   }

   @Override
   protected awm aV() {
      return awn.hC;
   }

   protected boolean gs() {
      iu $$0 = this.O().g();
      return $$0 != null ? $$0.a(this.dt(), 12.0) : false;
   }

   @Override
   public void a_(feq $$0) {
      if (this.bj()) {
         this.a(this.fo(), $$0);
         this.a(bxi.a, this.dy());
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

   static class a extends cea {
      private final cjh a;
      private boolean b;

      a(cjh $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cea.a.a, cea.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.ct() >= 100;
      }

      @Override
      public boolean c() {
         iu $$0 = this.a.q();
         return !iu.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) && !this.b && this.a.ct() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dV() instanceof arq) {
            arq $$0 = (arq)this.a.dV();
            this.b = false;
            this.a.O().m();
            iu $$1 = this.a.dv();
            iu $$2 = $$0.a(axn.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.h($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         iu $$0 = this.a.q();
         if (iu.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void a() {
         dja $$0 = this.a.dV();
         if (this.a.gs() || this.a.O().k()) {
            feq $$1 = feq.b(this.a.q());
            feq $$2 = chx.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = chx.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               iu $$3 = iu.a((jo)$$2);
               if (!$$0.b_($$3).a(axh.a) || !$$0.a_($$3).a(exd.b)) {
                  $$2 = chx.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.J().a($$2.d, $$2.e, $$2.f, (float)(this.a.ad() + 20), (float)this.a.ac());
            this.a.O().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cea {
      private final cjh a;
      private final double b;
      @Nullable
      private crc c;

      b(cjh $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cea.a.a, cea.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(cjh.bM, this.a);
         return this.c == null ? false : this.c.ck() && this.a.f() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ck() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bvj(bvl.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.O().m();
      }

      @Override
      public void a() {
         this.a.J().a(this.c, (float)(this.a.ad() + 20), (float)this.a.ac());
         if (this.a.g(this.c) < 6.25) {
            this.a.O().m();
         } else {
            this.a.O().a(this.c, this.b);
         }

         if (this.c.ck() && this.c.dV().A.a(6) == 0) {
            this.c.b(new bvj(bvl.D, 100), this.a);
         }
      }
   }

   class c extends cea {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cjh.this.af) {
            return false;
         } else {
            List<cnh> $$0 = cjh.this.dV().a(cnh.class, cjh.this.cR().c(8.0, 8.0, 8.0), cjh.bH);
            return !$$0.isEmpty() || !cjh.this.a(bwp.a).f();
         }
      }

      @Override
      public void d() {
         List<cnh> $$0 = cjh.this.dV().a(cnh.class, cjh.this.cR().c(8.0, 8.0, 8.0), cjh.bH);
         if (!$$0.isEmpty()) {
            cjh.this.O().a($$0.get(0), 1.2F);
            cjh.this.a(awn.hA, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         czd $$0 = cjh.this.a(bwp.a);
         if (!$$0.f()) {
            this.a($$0);
            cjh.this.a(bwp.a, czd.k);
            this.b = cjh.this.af + cjh.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<cnh> $$0 = cjh.this.dV().a(cnh.class, cjh.this.cR().c(8.0, 8.0, 8.0), cjh.bH);
         czd $$1 = cjh.this.a(bwp.a);
         if (!$$1.f()) {
            this.a($$1);
            cjh.this.a(bwp.a, czd.k);
         } else if (!$$0.isEmpty()) {
            cjh.this.O().a($$0.get(0), 1.2F);
         }
      }

      private void a(czd $$0) {
         if (!$$0.f()) {
            double $$1 = cjh.this.dE() - 0.3F;
            cnh $$2 = new cnh(cjh.this.dV(), cjh.this.dA(), $$1, cjh.this.dG(), $$0);
            $$2.b(40);
            $$2.b(cjh.this);
            float $$3 = 0.3F;
            float $$4 = cjh.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cjh.this.ae.i();
            $$2.n(
               (double)(0.3F * -azm.a(cjh.this.dL() * (float) (Math.PI / 180.0)) * azm.b(cjh.this.dN() * (float) (Math.PI / 180.0)) + azm.b($$4) * $$5),
               (double)(0.3F * azm.a(cjh.this.dN() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azm.b(cjh.this.dL() * (float) (Math.PI / 180.0)) * azm.b(cjh.this.dN() * (float) (Math.PI / 180.0)) + azm.a($$4) * $$5)
            );
            cjh.this.dV().b($$2);
         }
      }
   }
}
