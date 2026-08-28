import java.util.EnumSet;
import javax.annotation.Nullable;

public class cop extends cpu implements cpf {
   public static final float a = 0.03F;
   boolean bJ;
   protected final chi b;
   protected final chf c;

   public cop(bxe<? extends cop> $$0, djz $$1) {
      super($$0, $$1);
      this.bC = new cop.d(this);
      this.a(eyh.j, 0.0F);
      this.b = new chi(this, $$1);
      this.c = new chf(this, $$1);
   }

   public static bzb.a j() {
      return cpu.gv().a(bzc.B, 1.0);
   }

   @Override
   protected void m() {
      this.bF.a(1, new cop.c(this, 1.0));
      this.bF.a(2, new cop.f(this, 1.0, 40, 10.0F));
      this.bF.a(2, new cop.a(this, 1.0, false));
      this.bF.a(5, new cop.b(this, 1.0));
      this.bF.a(6, new cop.e(this, 1.0, this.dV().P()));
      this.bF.a(7, new cfp(this, 1.0));
      this.bG.a(1, new cgk(this, cop.class).a(cpw.class));
      this.bG.a(2, new cgl<>(this, crz.class, 10, true, false, ($$0, $$1) -> this.i($$0)));
      this.bG.a(3, new cgl<>(this, crg.class, false));
      this.bG.a(3, new cgl<>(this, ckc.class, true));
      this.bG.a(3, new cgl<>(this, clb.class, true, false));
      this.bG.a(5, new cgl<>(this, ckt.class, 10, true, false, ckt.bI));
   }

   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bxf.b).f() && $$0.G_().i() < 0.03F) {
         this.a(bxf.b, new daa(dae.xe));
         this.g(bxf.b);
      }

      return $$3;
   }

   public static boolean a(bxe<cop> $$0, dkq $$1, bxd $$2, iw $$3, azz $$4) {
      if (!$$1.b_($$3.e()).a(axl.a) && !bxd.a($$2)) {
         return false;
      } else {
         jg<dlc> $$5 = $$1.u($$3);
         boolean $$6 = $$1.an() != buq.a && (bxd.b($$2) || a($$1, $$3, $$4)) && (bxd.a($$2) || $$1.b_($$3).a(axl.a));
         if (!$$6 || !bxd.a($$2) && $$2 != bxd.j) {
            return $$5.a(axf.ar) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(dka $$0, iw $$1) {
      return $$1.v() < $$0.P() - 5;
   }

   @Override
   protected awq u() {
      return this.bi() ? awr.ic : awr.ib;
   }

   @Override
   protected awq e(bvk $$0) {
      return this.bi() ? awr.ig : awr.if;
   }

   @Override
   protected awq l_() {
      return this.bi() ? awr.ie : awr.id;
   }

   @Override
   protected awq n() {
      return awr.ii;
   }

   @Override
   protected awq aU() {
      return awr.ij;
   }

   @Override
   protected boolean q() {
      return true;
   }

   @Override
   protected daa t() {
      return daa.k;
   }

   @Override
   protected void a(azz $$0, bur $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bxf.a, new daa(dae.xd));
         } else {
            this.a(bxf.a, new daa(dae.sd));
         }
      }
   }

   @Override
   protected boolean a(daa $$0, daa $$1, bxf $$2) {
      return $$1.a(dae.xe) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   public boolean a(dkc $$0) {
      return $$0.f(this);
   }

   public boolean i(@Nullable bxw $$0) {
      return $$0 != null ? !this.dV().V() || $$0.bi() : false;
   }

   @Override
   public boolean cJ() {
      return !this.cj();
   }

   boolean gB() {
      if (this.bJ) {
         return true;
      } else {
         bxw $$0 = this.f();
         return $$0 != null && $$0.bi();
      }
   }

   @Override
   public void a_(ffs $$0) {
      if (this.bm() && this.gB()) {
         this.a(0.01F, $$0);
         this.a(bya.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bn() {
      if (!this.dV().C) {
         if (this.dj() && this.bm() && this.gB()) {
            this.bE = this.b;
            this.i(true);
         } else {
            this.bE = this.c;
            this.i(false);
         }
      }
   }

   @Override
   public boolean ck() {
      return this.cj();
   }

   protected boolean gu() {
      eye $$0 = this.O().i();
      if ($$0 != null) {
         iw $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.h((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bxw $$0, float $$1) {
      daa $$2 = this.fb();
      daa $$3 = $$2.a(dae.xd) ? $$2 : new daa(dae.xd);
      cti $$4 = new cti(this.dV(), this, $$3);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof aru $$9) {
         csu.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dV().an().a() * 4));
      }

      this.a(awr.ih, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public axv<czw> Y() {
      return axo.bV;
   }

   public void w(boolean $$0) {
      this.bJ = $$0;
   }

   static class a extends cgh {
      private final cop b;

      public a(cop $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.i(this.b.f());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.i(this.b.f());
      }
   }

   static class b extends cff {
      private final cop g;

      public b(cop $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dV().V() && this.g.bi() && this.g.dC() >= (double)(this.g.dV().P() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dkc $$0, iw $$1) {
         iw $$2 = $$1.d();
         return $$0.v($$2) && $$0.v($$2.d()) ? $$0.a_($$1).b($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.w(false);
         this.g.bE = this.g.c;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends ces {
      private final bye a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final djz f;

      public c(bye $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dV();
         this.a(EnumSet.of(ces.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.V()) {
            return false;
         } else if (this.a.bi()) {
            return false;
         } else {
            ffs $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.d;
               this.c = $$0.e;
               this.d = $$0.f;
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.O().k();
      }

      @Override
      public void d() {
         this.a.O().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ffs h() {
         azz $$0 = this.a.dY();
         iw $$1 = this.a.dv();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            iw $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dng.J)) {
               return ffs.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cdv {
      private final cop l;

      public d(cop $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bxw $$0 = this.l.f();
         if (this.l.gB() && this.l.bi()) {
            if ($$0 != null && $$0.dC() > this.l.dC() || this.l.bJ) {
               this.l.i(this.l.dy().b(0.0, 0.002, 0.0));
            }

            if (this.k != cdv.a.b || this.l.O().k()) {
               this.l.B(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azq.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aV = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(bzc.v));
            float $$7 = azq.h(0.125F, this.l.fo(), $$6);
            this.l.B($$7);
            this.l.i(this.l.dy().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aH()) {
               this.l.i(this.l.dy().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends ces {
      private final cop a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cop $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dV().V() && this.a.bi() && this.a.dC() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dC() < (double)(this.c - 1) && (this.a.O().k() || this.a.gu())) {
            ffs $$0 = cip.a(this.a, 4, 8, new ffs(this.a.dA(), (double)(this.c - 1), this.a.dG()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.O().a($$0.d, $$0.e, $$0.f, this.b);
         }
      }

      @Override
      public void d() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.w(false);
      }
   }

   static class f extends cfr {
      private final cop a;

      public f(cpf $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cop)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fb().a(dae.xd);
      }

      @Override
      public void d() {
         super.d();
         this.a.v(true);
         this.a.c(bus.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fF();
         this.a.v(false);
      }
   }
}
