import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cab extends cav {
   private static final aie<hz> d = aih.a(cab.class, aig.n);
   private static final aie<Boolean> e = aih.a(cab.class, aig.k);
   private static final aie<Integer> bT = aih.a(cab.class, aig.b);
   static final byu bU = byu.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<cds> c = $$0 -> !$$0.z() && $$0.bx() && $$0.aZ();

   public cab(bnu<? extends cab> $$0, cvn $$1) {
      super($$0, $$1);
      this.bL = new bug(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new buf(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
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
      this.bO.a(0, new bum(this));
      this.bO.a(0, new bwl(this));
      this.bO.a(1, new cab.a(this));
      this.bO.a(2, new cab.b(this, 4.0));
      this.bO.a(4, new bvz(this, 1.0, 10));
      this.bO.a(4, new bvw(this));
      this.bO.a(5, new bvj(this, chh.class, 6.0F));
      this.bO.a(5, new bur(this, 10));
      this.bO.a(6, new bvl(this, 1.2F, true));
      this.bO.a(8, new cab.c());
      this.bO.a(8, new buw(this));
      this.bO.a(9, new bui<>(this, cej.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new bwt(this, cej.class).a());
   }

   public static bpk.a gg() {
      return boi.C().a(bpl.n, 10.0).a(bpl.o, 1.2F).a(bpl.c, 3.0);
   }

   @Override
   protected bxp b(cvn $$0) {
      return new bxr(this, $$0);
   }

   @Override
   public boolean B(bno $$0) {
      boolean $$1 = $$0.a(this.dN().b((bog)this), (float)((int)this.g(bpl.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(atk.gJ, 1.0F, 1.0F);
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
   protected boolean n(bno $$0) {
      return true;
   }

   @Override
   public boolean f(coz $$0) {
      bnv $$1 = boi.h($$0);
      return !this.c($$1).b() ? false : $$1 == bnv.a && super.f($$0);
   }

   @Override
   protected void b(cds $$0) {
      if (this.c(bnv.a).b()) {
         coz $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bnv.a, $$1);
            this.e(bnv.a);
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
            ens $$0 = this.f(0.0F);
            float $$1 = awh.b(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = awh.a(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
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
   protected blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(auh.ao)) {
         if (!this.dM().B) {
            this.a(atk.gL, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         return blu.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.gM;
   }

   @Nullable
   @Override
   protected atj n_() {
      return atk.gK;
   }

   @Nullable
   @Override
   protected atj y() {
      return this.aZ() ? atk.gI : atk.gH;
   }

   @Override
   protected atj aO() {
      return atk.gP;
   }

   @Override
   protected atj aN() {
      return atk.gQ;
   }

   protected boolean gh() {
      hz $$0 = this.N().h();
      return $$0 != null ? $$0.a(this.dk(), 12.0) : false;
   }

   @Override
   public void a(ens $$0) {
      if (this.cY() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bol.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.q() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(chh $$0) {
      return true;
   }

   static class a extends bvb {
      private final cab a;
      private boolean b;

      a(cab $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bvb.a.a, bvb.a.b));
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
         if (this.a.dM() instanceof aov) {
            aov $$0 = (aov)this.a.dM();
            this.b = false;
            this.a.N().n();
            hz $$1 = this.a.dm();
            hz $$2 = $$0.a(auk.b, $$1, 50, false);
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
         cvn $$0 = this.a.dM();
         if (this.a.gh() || this.a.N().l()) {
            ens $$1 = ens.b(this.a.u());
            ens $$2 = byy.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = byy.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               hz $$3 = hz.a($$2);
               if (!$$0.b_($$3).a(aue.a) || !$$0.a_($$3).a($$0, $$3, ehf.b)) {
                  $$2 = byy.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends bvb {
      private final cab a;
      private final double b;
      @Nullable
      private chh c;

      b(cab $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bvb.a.a, bvb.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dM().a(cab.bU, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bnb(bnd.D, 100), this.a);
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
            this.c.b(new bnb(bnd.D, 100), this.a);
         }
      }
   }

   class c extends bvb {
      private int b;

      @Override
      public boolean a() {
         if (this.b > cab.this.ag) {
            return false;
         } else {
            List<cds> $$0 = cab.this.dM().a(cds.class, cab.this.cH().c(8.0, 8.0, 8.0), cab.c);
            return !$$0.isEmpty() || !cab.this.c(bnv.a).b();
         }
      }

      @Override
      public void c() {
         List<cds> $$0 = cab.this.dM().a(cds.class, cab.this.cH().c(8.0, 8.0, 8.0), cab.c);
         if (!$$0.isEmpty()) {
            cab.this.N().a($$0.get(0), 1.2F);
            cab.this.a(atk.gO, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         coz $$0 = cab.this.c(bnv.a);
         if (!$$0.b()) {
            this.a($$0);
            cab.this.a(bnv.a, coz.h);
            this.b = cab.this.ag + cab.this.af.a(100);
         }
      }

      @Override
      public void e() {
         List<cds> $$0 = cab.this.dM().a(cds.class, cab.this.cH().c(8.0, 8.0, 8.0), cab.c);
         coz $$1 = cab.this.c(bnv.a);
         if (!$$1.b()) {
            this.a($$1);
            cab.this.a(bnv.a, coz.h);
         } else if (!$$0.isEmpty()) {
            cab.this.N().a($$0.get(0), 1.2F);
         }
      }

      private void a(coz $$0) {
         if (!$$0.b()) {
            double $$1 = cab.this.dv() - 0.3F;
            cds $$2 = new cds(cab.this.dM(), cab.this.dr(), $$1, cab.this.dx(), $$0);
            $$2.b(40);
            $$2.a(cab.this);
            float $$3 = 0.3F;
            float $$4 = cab.this.af.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cab.this.af.i();
            $$2.o(
               (double)(0.3F * -awh.a(cab.this.dC() * (float) (Math.PI / 180.0)) * awh.b(cab.this.dE() * (float) (Math.PI / 180.0)) + awh.b($$4) * $$5),
               (double)(0.3F * awh.a(cab.this.dE() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * awh.b(cab.this.dC() * (float) (Math.PI / 180.0)) * awh.b(cab.this.dE() * (float) (Math.PI / 180.0)) + awh.a($$4) * $$5)
            );
            cab.this.dM().b($$2);
         }
      }
   }
}
