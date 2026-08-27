import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class caf extends caz {
   private static final aie<hz> d = aih.a(caf.class, aig.n);
   private static final aie<Boolean> e = aih.a(caf.class, aig.k);
   private static final aie<Integer> bT = aih.a(caf.class, aig.b);
   static final byy bU = byy.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<cdw> c = $$0 -> !$$0.z() && $$0.bx() && $$0.aZ();

   public caf(bnw<? extends caf> $$0, cvr $$1) {
      super($$0, $$1);
      this.bL = new buk(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new buj(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      this.k(this.ch());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(hz $$0) {
      this.am.b(d, $$0);
   }

   public hz u() {
      return this.am.b(d);
   }

   public boolean w() {
      return this.am.b(e);
   }

   public void w(boolean $$0) {
      this.am.b(e, $$0);
   }

   public int A() {
      return this.am.b(bT);
   }

   public void c(int $$0) {
      this.am.b(bT, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, hz.c);
      this.am.a(e, false);
      this.am.a(bT, 2400);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.u().u());
      $$0.a("TreasurePosY", this.u().v());
      $$0.a("TreasurePosZ", this.u().w());
      $$0.a("GotFish", this.w());
      $$0.a("Moistness", this.A());
   }

   @Override
   public void a(sw $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new hz($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void B() {
      this.bO.a(0, new buq(this));
      this.bO.a(0, new bwp(this));
      this.bO.a(1, new caf.a(this));
      this.bO.a(2, new caf.b(this, 4.0));
      this.bO.a(4, new bwd(this, 1.0, 10));
      this.bO.a(4, new bwa(this));
      this.bO.a(5, new bvn(this, chl.class, 6.0F));
      this.bO.a(5, new buv(this, 10));
      this.bO.a(6, new bvp(this, 1.2F, true));
      this.bO.a(8, new caf.c());
      this.bO.a(8, new bva(this));
      this.bO.a(9, new bum<>(this, cen.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new bwx(this, cen.class).a());
   }

   public static bpo.a gg() {
      return bok.C().a(bpp.n, 10.0).a(bpp.o, 1.2F).a(bpp.c, 3.0);
   }

   @Override
   protected bxt b(cvr $$0) {
      return new bxv(this, $$0);
   }

   @Override
   public boolean B(bnq $$0) {
      boolean $$1 = $$0.a(this.dN().b((boi)this), (float)((int)this.g(bpp.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(atl.gK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int ch() {
      return 4800;
   }

   @Override
   protected int o(int $$0) {
      return this.ch();
   }

   @Override
   public int ab() {
      return 1;
   }

   @Override
   public int fH() {
      return 1;
   }

   @Override
   protected boolean n(bnq $$0) {
      return true;
   }

   @Override
   public boolean f(cpd $$0) {
      bnx $$1 = bok.h($$0);
      return !this.c($$1).b() ? false : $$1 == bnx.a && super.f($$0);
   }

   @Override
   protected void b(cdw $$0) {
      if (this.c(bnx.a).b()) {
         cpd $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bnx.a, $$1);
            this.e(bnx.a);
            this.a($$0, $$1.M());
            $$0.am();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.fW()) {
         this.k(this.ch());
      } else {
         if (this.bb()) {
            this.c(2400);
         } else {
            this.c(this.A() - 1);
            if (this.A() <= 0) {
               this.a(this.dN().r(), 1.0F);
            }

            if (this.aC()) {
               this.g(this.dp().b((double)((this.af.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.af.i() * 360.0F);
               this.c(false);
               this.at = true;
            }
         }

         if (this.dM().B && this.aZ() && this.dp().g() > 0.03) {
            enz $$0 = this.f(0.0F);
            float $$1 = awi.b(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = awi.a(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.af.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dM()
                  .a(jz.ap, this.dr() - $$0.c * (double)$$3 + (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dM()
                  .a(jz.ap, this.dr() - $$0.c * (double)$$3 - (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(jz.M);
      } else {
         super.b($$0);
      }
   }

   private void a(jx $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.af.k() * 0.01;
         double $$3 = this.af.k() * 0.01;
         double $$4 = this.af.k() * 0.01;
         this.dM().a($$0, this.d(1.0), this.du() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(aui.ao)) {
         if (!this.dM().B) {
            this.a(atl.gM, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         return blw.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.gN;
   }

   @Nullable
   @Override
   protected atk n_() {
      return atl.gL;
   }

   @Nullable
   @Override
   protected atk y() {
      return this.aZ() ? atl.gJ : atl.gI;
   }

   @Override
   protected atk aO() {
      return atl.gQ;
   }

   @Override
   protected atk aN() {
      return atl.gR;
   }

   protected boolean gh() {
      hz $$0 = this.N().h();
      return $$0 != null ? $$0.a(this.dk(), 12.0) : false;
   }

   @Override
   public void a(enz $$0) {
      if (this.cY() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bon.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.q() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(chl $$0) {
      return true;
   }

   static class a extends bvf {
      private final caf a;
      private boolean b;

      a(caf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvf.a.a, bvf.a.b));
      }

      @Override
      public boolean S_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.w() && this.a.ci() >= 100;
      }

      @Override
      public boolean b() {
         hz $$0 = this.a.u();
         return !hz.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) && !this.b && this.a.ci() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dM() instanceof aow) {
            aow $$0 = (aow)this.a.dM();
            this.b = false;
            this.a.N().n();
            hz $$1 = this.a.dm();
            hz $$2 = $$0.a(aul.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.i($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void d() {
         hz $$0 = this.a.u();
         if (hz.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         cvr $$0 = this.a.dM();
         if (this.a.gh() || this.a.N().l()) {
            enz $$1 = enz.b(this.a.u());
            enz $$2 = bzc.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bzc.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               hz $$3 = hz.a($$2);
               if (!$$0.b_($$3).a(auf.a) || !$$0.a_($$3).a($$0, $$3, ehm.b)) {
                  $$2 = bzc.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.I().a($$2.c, $$2.d, $$2.e, (float)(this.a.fH() + 20), (float)this.a.ab());
            this.a.N().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bvf {
      private final caf a;
      private final double b;
      @Nullable
      private chl c;

      b(caf $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bvf.a.a, bvf.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dM().a(caf.bU, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bnd(bnf.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.N().n();
      }

      @Override
      public void e() {
         this.a.I().a(this.c, (float)(this.a.fH() + 20), (float)this.a.ab());
         if (this.a.f(this.c) < 6.25) {
            this.a.N().n();
         } else {
            this.a.N().a(this.c, this.b);
         }

         if (this.c.bZ() && this.c.dM().z.a(6) == 0) {
            this.c.b(new bnd(bnf.D, 100), this.a);
         }
      }
   }

   class c extends bvf {
      private int b;

      @Override
      public boolean a() {
         if (this.b > caf.this.ag) {
            return false;
         } else {
            List<cdw> $$0 = caf.this.dM().a(cdw.class, caf.this.cH().c(8.0, 8.0, 8.0), caf.c);
            return !$$0.isEmpty() || !caf.this.c(bnx.a).b();
         }
      }

      @Override
      public void c() {
         List<cdw> $$0 = caf.this.dM().a(cdw.class, caf.this.cH().c(8.0, 8.0, 8.0), caf.c);
         if (!$$0.isEmpty()) {
            caf.this.N().a($$0.get(0), 1.2F);
            caf.this.a(atl.gP, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cpd $$0 = caf.this.c(bnx.a);
         if (!$$0.b()) {
            this.a($$0);
            caf.this.a(bnx.a, cpd.h);
            this.b = caf.this.ag + caf.this.af.a(100);
         }
      }

      @Override
      public void e() {
         List<cdw> $$0 = caf.this.dM().a(cdw.class, caf.this.cH().c(8.0, 8.0, 8.0), caf.c);
         cpd $$1 = caf.this.c(bnx.a);
         if (!$$1.b()) {
            this.a($$1);
            caf.this.a(bnx.a, cpd.h);
         } else if (!$$0.isEmpty()) {
            caf.this.N().a($$0.get(0), 1.2F);
         }
      }

      private void a(cpd $$0) {
         if (!$$0.b()) {
            double $$1 = caf.this.dv() - 0.3F;
            cdw $$2 = new cdw(caf.this.dM(), caf.this.dr(), $$1, caf.this.dx(), $$0);
            $$2.b(40);
            $$2.a(caf.this);
            float $$3 = 0.3F;
            float $$4 = caf.this.af.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * caf.this.af.i();
            $$2.o(
               (double)(0.3F * -awi.a(caf.this.dC() * (float) (Math.PI / 180.0)) * awi.b(caf.this.dE() * (float) (Math.PI / 180.0)) + awi.b($$4) * $$5),
               (double)(0.3F * awi.a(caf.this.dE() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * awi.b(caf.this.dC() * (float) (Math.PI / 180.0)) * awi.b(caf.this.dE() * (float) (Math.PI / 180.0)) + awi.a($$4) * $$5)
            );
            caf.this.dM().b($$2);
         }
      }
   }
}
