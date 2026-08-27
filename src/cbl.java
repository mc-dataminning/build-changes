import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbl extends ccf {
   private static final aim<ib> d = aiq.a(cbl.class, aio.n);
   private static final aim<Boolean> e = aiq.a(cbl.class, aio.k);
   private static final aim<Integer> bX = aiq.a(cbl.class, aio.b);
   static final cae bY = cae.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bZ = 2400;
   public static final Predicate<cfd> c = $$0 -> !$$0.y() && $$0.bA() && $$0.bc();

   public cbl(bpc<? extends cbl> $$0, cwz $$1) {
      super($$0, $$1);
      this.bO = new bvq(this, 85, 10, 0.02F, 0.1F, true);
      this.bN = new bvp(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
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

   public boolean s() {
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
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(d, ib.c);
      $$0.a(e, false);
      $$0.a(bX, 2400);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.r().u());
      $$0.a("TreasurePosY", this.r().v());
      $$0.a("TreasurePosZ", this.r().w());
      $$0.a("GotFish", this.s());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(ta $$0) {
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
      this.bR.a(0, new bvw(this));
      this.bR.a(0, new bxv(this));
      this.bR.a(1, new cbl.a(this));
      this.bR.a(2, new cbl.b(this, 4.0));
      this.bR.a(4, new bxj(this, 1.0, 10));
      this.bR.a(4, new bxg(this));
      this.bR.a(5, new bwt(this, cis.class, 6.0F));
      this.bR.a(5, new bwb(this, 10));
      this.bR.a(6, new bwv(this, 1.2F, true));
      this.bR.a(8, new cbl.c());
      this.bR.a(8, new bwg(this));
      this.bR.a(9, new bvs<>(this, cfu.class, 8.0F, 1.0, 1.0));
      this.bS.a(1, new byd(this, cfu.class).a());
   }

   public static bqu.a gn() {
      return bpq.A().a(bqv.q, 10.0).a(bqv.r, 1.2F).a(bqv.c, 3.0);
   }

   @Override
   protected byz b(cwz $$0) {
      return new bzb(this, $$0);
   }

   @Override
   public boolean C(bow $$0) {
      boolean $$1 = $$0.a(this.dN().b((bpo)this), (float)((int)this.g(bqv.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aty.gN, 1.0F, 1.0F);
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
   protected boolean o(bow $$0) {
      return true;
   }

   @Override
   public boolean f(cqk $$0) {
      bpd $$1 = bpq.h($$0);
      return !this.d($$1).b() ? false : $$1 == bpd.a && super.f($$0);
   }

   @Override
   protected void b(cfd $$0) {
      if (this.d(bpd.a).b()) {
         cqk $$1 = $$0.p();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bpd.a, $$1);
            this.f(bpd.a);
            this.a($$0, $$1.M());
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
            epr $$0 = this.f(0.0F);
            float $$1 = aww.b(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = aww.a(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dM()
                  .a(kc.aq, this.dr() - $$0.c * (double)$$3 + (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dM()
                  .a(kc.aq, this.dr() - $$0.c * (double)$$3 - (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(kc.N);
      } else {
         super.b($$0);
      }
   }

   private void a(ka $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dM().a($$0, this.d(1.0), this.du() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bnc b(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(auv.ao)) {
         if (!this.dM().B) {
            this.a(aty.gP, 1.0F, 1.0F);
         }

         this.w(true);
         $$2.a(1, $$0);
         return bnc.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.gQ;
   }

   @Nullable
   @Override
   protected atx n_() {
      return aty.gO;
   }

   @Nullable
   @Override
   protected atx v() {
      return this.bc() ? aty.gM : aty.gL;
   }

   @Override
   protected atx aO() {
      return aty.gT;
   }

   @Override
   protected atx aN() {
      return aty.gU;
   }

   protected boolean go() {
      ib $$0 = this.K().h();
      return $$0 != null ? $$0.a(this.dk(), 12.0) : false;
   }

   @Override
   public void a(epr $$0) {
      if (this.cY() && this.bc()) {
         this.a(this.fk(), $$0);
         this.a(bpt.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.p() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cis $$0) {
      return true;
   }

   static class a extends bwl {
      private final cbl a;
      private boolean b;

      a(cbl $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bwl.a.a, bwl.a.b));
      }

      @Override
      public boolean Q_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.s() && this.a.ci() >= 100;
      }

      @Override
      public boolean b() {
         ib $$0 = this.a.r();
         return !ib.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) && !this.b && this.a.ci() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dM() instanceof apf) {
            apf $$0 = (apf)this.a.dM();
            this.b = false;
            this.a.K().n();
            ib $$1 = this.a.dm();
            ib $$2 = $$0.a(auz.b, $$1, 50, false);
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
         cwz $$0 = this.a.dM();
         if (this.a.go() || this.a.K().l()) {
            epr $$1 = epr.b(this.a.r());
            epr $$2 = cai.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cai.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ib $$3 = ib.a($$2);
               if (!$$0.b_($$3).a(aus.a) || !$$0.a_($$3).a($$0, $$3, ejd.b)) {
                  $$2 = cai.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends bwl {
      private final cbl a;
      private final double b;
      @Nullable
      private cis c;

      b(cbl $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bwl.a.a, bwl.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dM().a(cbl.bY, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.p() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new boj(bol.D, 100), this.a);
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
            this.c.b(new boj(bol.D, 100), this.a);
         }
      }
   }

   class c extends bwl {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cbl.this.ah) {
            return false;
         } else {
            List<cfd> $$0 = cbl.this.dM().a(cfd.class, cbl.this.cH().c(8.0, 8.0, 8.0), cbl.c);
            return !$$0.isEmpty() || !cbl.this.d(bpd.a).b();
         }
      }

      @Override
      public void c() {
         List<cfd> $$0 = cbl.this.dM().a(cfd.class, cbl.this.cH().c(8.0, 8.0, 8.0), cbl.c);
         if (!$$0.isEmpty()) {
            cbl.this.K().a($$0.get(0), 1.2F);
            cbl.this.a(aty.gS, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cqk $$0 = cbl.this.d(bpd.a);
         if (!$$0.b()) {
            this.a($$0);
            cbl.this.a(bpd.a, cqk.h);
            this.b = cbl.this.ah + cbl.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<cfd> $$0 = cbl.this.dM().a(cfd.class, cbl.this.cH().c(8.0, 8.0, 8.0), cbl.c);
         cqk $$1 = cbl.this.d(bpd.a);
         if (!$$1.b()) {
            this.a($$1);
            cbl.this.a(bpd.a, cqk.h);
         } else if (!$$0.isEmpty()) {
            cbl.this.K().a($$0.get(0), 1.2F);
         }
      }

      private void a(cqk $$0) {
         if (!$$0.b()) {
            double $$1 = cbl.this.dv() - 0.3F;
            cfd $$2 = new cfd(cbl.this.dM(), cbl.this.dr(), $$1, cbl.this.dx(), $$0);
            $$2.b(40);
            $$2.b(cbl.this);
            float $$3 = 0.3F;
            float $$4 = cbl.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cbl.this.ag.i();
            $$2.o(
               (double)(0.3F * -aww.a(cbl.this.dC() * (float) (Math.PI / 180.0)) * aww.b(cbl.this.dE() * (float) (Math.PI / 180.0)) + aww.b($$4) * $$5),
               (double)(0.3F * aww.a(cbl.this.dE() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * aww.b(cbl.this.dC() * (float) (Math.PI / 180.0)) * aww.b(cbl.this.dE() * (float) (Math.PI / 180.0)) + aww.a($$4) * $$5)
            );
            cbl.this.dM().b($$2);
         }
      }
   }
}
