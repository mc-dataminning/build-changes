import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ccl extends cdf {
   private static final aiy<ib> d = ajc.a(ccl.class, aja.n);
   private static final aiy<Boolean> e = ajc.a(ccl.class, aja.k);
   private static final aiy<Integer> bX = ajc.a(ccl.class, aja.b);
   static final cbe bY = cbe.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bZ = 2400;
   public static final Predicate<cgd> c = $$0 -> !$$0.y() && $$0.bA() && $$0.bc();

   public ccl(bqb<? extends ccl> $$0, cyx $$1) {
      super($$0, $$1);
      this.bO = new bwq(this, 85, 10, 0.02F, 0.1F, true);
      this.bN = new bwp(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      this.k(this.ch());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(ib $$0) {
      this.an.a(d, $$0);
   }

   public ib r() {
      return this.an.a(d);
   }

   public boolean u() {
      return this.an.a(e);
   }

   public void w(boolean $$0) {
      this.an.a(e, $$0);
   }

   public int y() {
      return this.an.a(bX);
   }

   public void c(int $$0) {
      this.an.a(bX, $$0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(d, ib.c);
      $$0.a(e, false);
      $$0.a(bX, 2400);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.r().u());
      $$0.a("TreasurePosY", this.r().v());
      $$0.a("TreasurePosZ", this.r().w());
      $$0.a("GotFish", this.u());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(tm $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new ib($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bR.a(0, new bww(this));
      this.bR.a(0, new byv(this));
      this.bR.a(1, new ccl.a(this));
      this.bR.a(2, new ccl.b(this, 4.0));
      this.bR.a(4, new byj(this, 1.0, 10));
      this.bR.a(4, new byg(this));
      this.bR.a(5, new bxt(this, cjt.class, 6.0F));
      this.bR.a(5, new bxb(this, 10));
      this.bR.a(6, new bxv(this, 1.2F, true));
      this.bR.a(8, new ccl.c());
      this.bR.a(8, new bxg(this));
      this.bR.a(9, new bws<>(this, cgv.class, 8.0F, 1.0, 1.0));
      this.bS.a(1, new bzd(this, cgv.class).a());
   }

   public static bru.a gn() {
      return bqq.A().a(brv.q, 10.0).a(brv.r, 1.2F).a(brv.c, 3.0);
   }

   @Override
   protected bzz b(cyx $$0) {
      return new cab(this, $$0);
   }

   @Override
   public boolean C(bpv $$0) {
      boolean $$1 = $$0.a(this.dN().b((bqo)this), (float)((int)this.g(brv.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aum.gS, 1.0F, 1.0F);
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
   public int Z() {
      return 1;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   protected boolean o(bpv $$0) {
      return true;
   }

   @Override
   public boolean f(crj $$0) {
      bqc $$1 = bqq.h($$0);
      return !this.d($$1).d() ? false : $$1 == bqc.a && super.f($$0);
   }

   @Override
   protected void b(cgd $$0) {
      if (this.d(bqc.a).d()) {
         crj $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bqc.a, $$1);
            this.f(bqc.a);
            this.a($$0, $$1.G());
            $$0.am();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gd()) {
         this.k(this.ch());
      } else {
         if (this.be()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dN().r(), 1.0F);
            }

            if (this.aC()) {
               this.g(this.dp().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ag.i() * 360.0F);
               this.c(false);
               this.au = true;
            }
         }

         if (this.dM().B && this.bc() && this.dp().g() > 0.03) {
            esa $$0 = this.f(0.0F);
            float $$1 = axk.b(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = axk.a(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dM()
                  .a(kl.aq, this.dr() - $$0.c * (double)$$3 + (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dM()
                  .a(kl.aq, this.dr() - $$0.c * (double)$$3 - (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(kl.N);
      } else {
         super.b($$0);
      }
   }

   private void a(kj $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dM().a($$0, this.d(1.0), this.du() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected boa b(cjt $$0, bnz $$1) {
      crj $$2 = $$0.b($$1);
      if (!$$2.d() && $$2.a(avk.ao)) {
         if (!this.dM().B) {
            this.a(aum.gU, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return boa.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected aul d(bot $$0) {
      return aum.gV;
   }

   @Nullable
   @Override
   protected aul o_() {
      return aum.gT;
   }

   @Nullable
   @Override
   protected aul v() {
      return this.bc() ? aum.gR : aum.gQ;
   }

   @Override
   protected aul aO() {
      return aum.gY;
   }

   @Override
   protected aul aN() {
      return aum.gZ;
   }

   protected boolean go() {
      ib $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dk(), 12.0) : false;
   }

   @Override
   public void a(esa $$0) {
      if (this.cY() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bqt.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.p() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cjt $$0) {
      return true;
   }

   static class a extends bxl {
      private final ccl a;
      private boolean b;

      a(ccl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bxl.a.a, bxl.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.u() && this.a.ci() >= 100;
      }

      @Override
      public boolean b() {
         ib $$0 = this.a.r();
         return !ib.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) && !this.b && this.a.ci() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dM() instanceof aps) {
            aps $$0 = (aps)this.a.dM();
            this.b = false;
            this.a.K().n();
            ib $$1 = this.a.dm();
            ib $$2 = $$0.a(avn.b, $$1, 50, false);
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
         ib $$0 = this.a.r();
         if (ib.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         cyx $$0 = this.a.dM();
         if (this.a.go() || this.a.K().l()) {
            esa $$1 = esa.b(this.a.r());
            esa $$2 = cbi.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cbi.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ib $$3 = ib.a($$2);
               if (!$$0.b_($$3).a(avh.a) || !$$0.a_($$3).a(elh.b)) {
                  $$2 = cbi.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.G().a($$2.c, $$2.d, $$2.e, (float)(this.a.aa() + 20), (float)this.a.Z());
            this.a.K().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bxl {
      private final ccl a;
      private final double b;
      @Nullable
      private cjt c;

      b(ccl $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bxl.a.a, bxl.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dM().a(ccl.bY, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bph(bpj.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.K().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.c, (float)(this.a.aa() + 20), (float)this.a.Z());
         if (this.a.g(this.c) < 6.25) {
            this.a.K().n();
         } else {
            this.a.K().a(this.c, this.b);
         }

         if (this.c.bZ() && this.c.dM().z.a(6) == 0) {
            this.c.b(new bph(bpj.D, 100), this.a);
         }
      }
   }

   class c extends bxl {
      private int b;

      @Override
      public boolean a() {
         if (this.b > ccl.this.ah) {
            return false;
         } else {
            List<cgd> $$0 = ccl.this.dM().a(cgd.class, ccl.this.cH().c(8.0, 8.0, 8.0), ccl.c);
            return !$$0.isEmpty() || !ccl.this.d(bqc.a).d();
         }
      }

      @Override
      public void c() {
         List<cgd> $$0 = ccl.this.dM().a(cgd.class, ccl.this.cH().c(8.0, 8.0, 8.0), ccl.c);
         if (!$$0.isEmpty()) {
            ccl.this.K().a($$0.get(0), 1.2F);
            ccl.this.a(aum.gX, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         crj $$0 = ccl.this.d(bqc.a);
         if (!$$0.d()) {
            this.a($$0);
            ccl.this.a(bqc.a, crj.i);
            this.b = ccl.this.ah + ccl.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<cgd> $$0 = ccl.this.dM().a(cgd.class, ccl.this.cH().c(8.0, 8.0, 8.0), ccl.c);
         crj $$1 = ccl.this.d(bqc.a);
         if (!$$1.d()) {
            this.a($$1);
            ccl.this.a(bqc.a, crj.i);
         } else if (!$$0.isEmpty()) {
            ccl.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(crj $$0) {
         if (!$$0.d()) {
            double $$1 = ccl.this.dv() - 0.3F;
            cgd $$2 = new cgd(ccl.this.dM(), ccl.this.dr(), $$1, ccl.this.dx(), $$0);
            $$2.b(40);
            $$2.b(ccl.this);
            float $$3 = 0.3F;
            float $$4 = ccl.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * ccl.this.ag.i();
            $$2.o(
               (double)(0.3F * -axk.a(ccl.this.dC() * (float) (Math.PI / 180.0)) * axk.b(ccl.this.dE() * (float) (Math.PI / 180.0)) + axk.b($$4) * $$5),
               (double)(0.3F * axk.a(ccl.this.dE() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * axk.b(ccl.this.dC() * (float) (Math.PI / 180.0)) * axk.b(ccl.this.dE() * (float) (Math.PI / 180.0)) + axk.a($$4) * $$5)
            );
            ccl.this.dM().b($$2);
         }
      }
   }
}
