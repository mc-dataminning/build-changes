import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cau extends cbo {
   private static final aii<ib> d = ail.a(cau.class, aik.n);
   private static final aii<Boolean> e = ail.a(cau.class, aik.k);
   private static final aii<Integer> bV = ail.a(cau.class, aik.b);
   static final bzn bW = bzn.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bX = 2400;
   public static final Predicate<cel> c = $$0 -> !$$0.z() && $$0.bx() && $$0.aZ();

   public cau(bol<? extends cau> $$0, cwe $$1) {
      super($$0, $$1);
      this.bM = new buz(this, 85, 10, 0.02F, 0.1F, true);
      this.bL = new buy(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      this.k(this.ce());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(ib $$0) {
      this.am.b(d, $$0);
   }

   public ib u() {
      return this.am.b(d);
   }

   public boolean w() {
      return this.am.b(e);
   }

   public void w(boolean $$0) {
      this.am.b(e, $$0);
   }

   public int A() {
      return this.am.b(bV);
   }

   public void c(int $$0) {
      this.am.b(bV, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, ib.c);
      this.am.a(e, false);
      this.am.a(bV, 2400);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.u().u());
      $$0.a("TreasurePosY", this.u().v());
      $$0.a("TreasurePosZ", this.u().w());
      $$0.a("GotFish", this.w());
      $$0.a("Moistness", this.A());
   }

   @Override
   public void a(sy $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new ib($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void B() {
      this.bP.a(0, new bvf(this));
      this.bP.a(0, new bxe(this));
      this.bP.a(1, new cau.a(this));
      this.bP.a(2, new cau.b(this, 4.0));
      this.bP.a(4, new bws(this, 1.0, 10));
      this.bP.a(4, new bwp(this));
      this.bP.a(5, new bwc(this, cia.class, 6.0F));
      this.bP.a(5, new bvk(this, 10));
      this.bP.a(6, new bwe(this, 1.2F, true));
      this.bP.a(8, new cau.c());
      this.bP.a(8, new bvp(this));
      this.bP.a(9, new bvb<>(this, cfc.class, 8.0F, 1.0, 1.0));
      this.bQ.a(1, new bxm(this, cfc.class).a());
   }

   public static bqd.a gl() {
      return boz.C().a(bqe.n, 10.0).a(bqe.o, 1.2F).a(bqe.c, 3.0);
   }

   @Override
   protected byi b(cwe $$0) {
      return new byk(this, $$0);
   }

   @Override
   public boolean B(bof $$0) {
      boolean $$1 = $$0.a(this.dK().b((box)this), (float)((int)this.g(bqe.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(atp.gK, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int ce() {
      return 4800;
   }

   @Override
   protected int o(int $$0) {
      return this.ce();
   }

   @Override
   public int ab() {
      return 1;
   }

   @Override
   public int fJ() {
      return 1;
   }

   @Override
   protected boolean n(bof $$0) {
      return true;
   }

   @Override
   public boolean f(cpq $$0) {
      bom $$1 = boz.h($$0);
      return !this.c($$1).b() ? false : $$1 == bom.a && super.f($$0);
   }

   @Override
   protected void b(cel $$0) {
      if (this.c(bom.a).b()) {
         cpq $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bom.a, $$1);
            this.e(bom.a);
            this.a($$0, $$1.M());
            $$0.am();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gb()) {
         this.k(this.ce());
      } else {
         if (this.bb()) {
            this.c(2400);
         } else {
            this.c(this.A() - 1);
            if (this.A() <= 0) {
               this.a(this.dK().r(), 1.0F);
            }

            if (this.aC()) {
               this.g(this.dm().b((double)((this.af.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.af.i() * 360.0F);
               this.c(false);
               this.at = true;
            }
         }

         if (this.dJ().B && this.aZ() && this.dm().g() > 0.03) {
            eov $$0 = this.f(0.0F);
            float $$1 = awm.b(this.dz() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = awm.a(this.dz() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.af.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dJ()
                  .a(kb.ap, this.do() - $$0.c * (double)$$3 + (double)$$1, this.dq() - $$0.d, this.du() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dJ()
                  .a(kb.ap, this.do() - $$0.c * (double)$$3 - (double)$$1, this.dq() - $$0.d, this.du() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(kb.M);
      } else {
         super.b($$0);
      }
   }

   private void a(jz $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.af.k() * 0.01;
         double $$3 = this.af.k() * 0.01;
         double $$4 = this.af.k() * 0.01;
         this.dJ().a($$0, this.d(1.0), this.dr() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(aum.ao)) {
         if (!this.dJ().B) {
            this.a(atp.gM, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fW().d) {
            $$2.h(1);
         }

         return bml.a(this.dJ().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected ato d(bne $$0) {
      return atp.gN;
   }

   @Nullable
   @Override
   protected ato n_() {
      return atp.gL;
   }

   @Nullable
   @Override
   protected ato y() {
      return this.aZ() ? atp.gJ : atp.gI;
   }

   @Override
   protected ato aO() {
      return atp.gQ;
   }

   @Override
   protected ato aN() {
      return atp.gR;
   }

   protected boolean gm() {
      ib $$0 = this.N().h();
      return $$0 != null ? $$0.a(this.dh(), 12.0) : false;
   }

   @Override
   public void a(eov $$0) {
      if (this.cV() && this.aZ()) {
         this.a(this.fh(), $$0);
         this.a(bpc.a, this.dm());
         this.g(this.dm().a(0.9));
         if (this.q() == null) {
            this.g(this.dm().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cia $$0) {
      return true;
   }

   static class a extends bvu {
      private final cau a;
      private boolean b;

      a(cau $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvu.a.a, bvu.a.b));
      }

      @Override
      public boolean S_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.w() && this.a.cf() >= 100;
      }

      @Override
      public boolean b() {
         ib $$0 = this.a.u();
         return !ib.a((double)$$0.u(), this.a.dq(), (double)$$0.w()).a(this.a.dh(), 4.0) && !this.b && this.a.cf() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dJ() instanceof apa) {
            apa $$0 = (apa)this.a.dJ();
            this.b = false;
            this.a.N().n();
            ib $$1 = this.a.dj();
            ib $$2 = $$0.a(aup.b, $$1, 50, false);
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
         ib $$0 = this.a.u();
         if (ib.a((double)$$0.u(), this.a.dq(), (double)$$0.w()).a(this.a.dh(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         cwe $$0 = this.a.dJ();
         if (this.a.gm() || this.a.N().l()) {
            eov $$1 = eov.b(this.a.u());
            eov $$2 = bzr.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bzr.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ib $$3 = ib.a($$2);
               if (!$$0.b_($$3).a(auj.a) || !$$0.a_($$3).a($$0, $$3, eih.b)) {
                  $$2 = bzr.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.I().a($$2.c, $$2.d, $$2.e, (float)(this.a.fJ() + 20), (float)this.a.ab());
            this.a.N().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bvu {
      private final cau a;
      private final double b;
      @Nullable
      private cia c;

      b(cau $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bvu.a.a, bvu.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dJ().a(cau.bW, this.a);
         return this.c == null ? false : this.c.bW() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bW() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bns(bnu.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.N().n();
      }

      @Override
      public void e() {
         this.a.I().a(this.c, (float)(this.a.fJ() + 20), (float)this.a.ab());
         if (this.a.f(this.c) < 6.25) {
            this.a.N().n();
         } else {
            this.a.N().a(this.c, this.b);
         }

         if (this.c.bW() && this.c.dJ().z.a(6) == 0) {
            this.c.b(new bns(bnu.D, 100), this.a);
         }
      }
   }

   class c extends bvu {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cau.this.ag) {
            return false;
         } else {
            List<cel> $$0 = cau.this.dJ().a(cel.class, cau.this.cE().c(8.0, 8.0, 8.0), cau.c);
            return !$$0.isEmpty() || !cau.this.c(bom.a).b();
         }
      }

      @Override
      public void c() {
         List<cel> $$0 = cau.this.dJ().a(cel.class, cau.this.cE().c(8.0, 8.0, 8.0), cau.c);
         if (!$$0.isEmpty()) {
            cau.this.N().a($$0.get(0), 1.2F);
            cau.this.a(atp.gP, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cpq $$0 = cau.this.c(bom.a);
         if (!$$0.b()) {
            this.a($$0);
            cau.this.a(bom.a, cpq.h);
            this.b = cau.this.ag + cau.this.af.a(100);
         }
      }

      @Override
      public void e() {
         List<cel> $$0 = cau.this.dJ().a(cel.class, cau.this.cE().c(8.0, 8.0, 8.0), cau.c);
         cpq $$1 = cau.this.c(bom.a);
         if (!$$1.b()) {
            this.a($$1);
            cau.this.a(bom.a, cpq.h);
         } else if (!$$0.isEmpty()) {
            cau.this.N().a($$0.get(0), 1.2F);
         }
      }

      private void a(cpq $$0) {
         if (!$$0.b()) {
            double $$1 = cau.this.ds() - 0.3F;
            cel $$2 = new cel(cau.this.dJ(), cau.this.do(), $$1, cau.this.du(), $$0);
            $$2.b(40);
            $$2.a(cau.this);
            float $$3 = 0.3F;
            float $$4 = cau.this.af.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cau.this.af.i();
            $$2.o(
               (double)(0.3F * -awm.a(cau.this.dz() * (float) (Math.PI / 180.0)) * awm.b(cau.this.dB() * (float) (Math.PI / 180.0)) + awm.b($$4) * $$5),
               (double)(0.3F * awm.a(cau.this.dB() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * awm.b(cau.this.dz() * (float) (Math.PI / 180.0)) * awm.b(cau.this.dB() * (float) (Math.PI / 180.0)) + awm.a($$4) * $$5)
            );
            cau.this.dJ().b($$2);
         }
      }
   }
}
