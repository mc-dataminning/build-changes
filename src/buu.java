import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buu extends bvo {
   private static final aec<gw> d = aef.a(buu.class, aee.n);
   private static final aec<Boolean> e = aef.a(buu.class, aee.k);
   private static final aec<Integer> bT = aef.a(buu.class, aee.b);
   static final btn bU = btn.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<byi> c = $$0 -> !$$0.r() && $$0.bv() && $$0.aX();

   public buu(bip<? extends buu> $$0, cpq $$1) {
      super($$0, $$1);
      this.bL = new bpb(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bpa(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      this.j(this.cg());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean dP() {
      return false;
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(gw $$0) {
      this.an.b(d, $$0);
   }

   public gw p() {
      return this.an.b(d);
   }

   public boolean q() {
      return this.an.b(e);
   }

   public void w(boolean $$0) {
      this.an.b(e, $$0);
   }

   public int t() {
      return this.an.b(bT);
   }

   public void c(int $$0) {
      this.an.b(bT, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, gw.b);
      this.an.a(e, false);
      this.an.a(bT, 2400);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.p().u());
      $$0.a("TreasurePosY", this.p().v());
      $$0.a("TreasurePosZ", this.p().w());
      $$0.a("GotFish", this.q());
      $$0.a("Moistness", this.t());
   }

   @Override
   public void a(qu $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new gw($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void w() {
      this.bO.a(0, new bph(this));
      this.bO.a(0, new brg(this));
      this.bO.a(1, new buu.a(this));
      this.bO.a(2, new buu.b(this, 4.0));
      this.bO.a(4, new bqu(this, 1.0, 10));
      this.bO.a(4, new bqr(this));
      this.bO.a(5, new bqe(this, cbp.class, 6.0F));
      this.bO.a(5, new bpm(this, 10));
      this.bO.a(6, new bqg(this, 1.2F, true));
      this.bO.a(8, new buu.c());
      this.bO.a(8, new bpr(this));
      this.bO.a(9, new bpd<>(this, byz.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new bro(this, byz.class).a());
   }

   public static bkg.a ga() {
      return bjd.x().a(bkh.a, 10.0).a(bkh.d, 1.2F).a(bkh.f, 3.0);
   }

   @Override
   protected bsk b(cpq $$0) {
      return new bsm(this, $$0);
   }

   @Override
   public boolean C(bil $$0) {
      boolean $$1 = $$0.a(this.dL().b((bjb)this), (float)((int)this.b(bkh.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aoz.fR, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int cg() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.cg();
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 0.3F;
   }

   @Override
   public int W() {
      return 1;
   }

   @Override
   public int X() {
      return 1;
   }

   @Override
   protected boolean o(bil $$0) {
      return true;
   }

   @Override
   public boolean f(cja $$0) {
      biq $$1 = bjd.h($$0);
      return !this.c($$1).b() ? false : $$1 == biq.a && super.f($$0);
   }

   @Override
   protected void b(byi $$0) {
      if (this.c(biq.a).b()) {
         cja $$1 = $$0.j();
         if (this.j($$1)) {
            this.a($$0);
            this.a(biq.a, $$1);
            this.e(biq.a);
            this.a($$0, $$1.L());
            $$0.ak();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.fQ()) {
         this.j(this.cg());
      } else {
         if (this.aZ()) {
            this.c(2400);
         } else {
            this.c(this.t() - 1);
            if (this.t() <= 0) {
               this.a(this.dL().r(), 1.0F);
            }

            if (this.aA()) {
               this.f(this.dn().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ag.i() * 360.0F);
               this.c(false);
               this.au = true;
            }
         }

         if (this.dK().B && this.aX() && this.dn().g() > 0.03) {
            ehi $$0 = this.f(0.0F);
            float $$1 = ars.b(this.dA() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ars.a(this.dA() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dK()
                  .a(ix.am, this.dp() - $$0.c * (double)$$3 + (double)$$1, this.dr() - $$0.d, this.dv() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dK()
                  .a(ix.am, this.dp() - $$0.c * (double)$$3 - (double)$$1, this.dr() - $$0.d, this.dv() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(ix.K);
      } else {
         super.b($$0);
      }
   }

   private void a(iv $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dK().a($$0, this.d(1.0), this.ds() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(apw.ao)) {
         if (!this.dK().B) {
            this.a(aoz.fT, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         return bgt.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.fU;
   }

   @Nullable
   @Override
   protected aoy h_() {
      return aoz.fS;
   }

   @Nullable
   @Override
   protected aoy r() {
      return this.aX() ? aoz.fQ : aoz.fP;
   }

   @Override
   protected aoy aM() {
      return aoz.fX;
   }

   @Override
   protected aoy aL() {
      return aoz.fY;
   }

   protected boolean gb() {
      gw $$0 = this.H().h();
      return $$0 != null ? $$0.a(this.di(), 12.0) : false;
   }

   @Override
   public void h(ehi $$0) {
      if (this.cX() && this.aX()) {
         this.a(this.fd(), $$0);
         this.a(bjh.a, this.dn());
         this.f(this.dn().a(0.9));
         if (this.j() == null) {
            this.f(this.dn().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(cbp $$0) {
      return true;
   }

   static class a extends bpw {
      private final buu a;
      private boolean b;

      a(buu $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpw.a.a, bpw.a.b));
      }

      @Override
      public boolean J_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.q() && this.a.ch() >= 100;
      }

      @Override
      public boolean b() {
         gw $$0 = this.a.p();
         return !gw.a((double)$$0.u(), this.a.dr(), (double)$$0.w()).a(this.a.di(), 4.0) && !this.b && this.a.ch() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dK() instanceof akn) {
            akn $$0 = (akn)this.a.dK();
            this.b = false;
            this.a.H().n();
            gw $$1 = this.a.dk();
            gw $$2 = $$0.a(apz.b, $$1, 50, false);
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
         gw $$0 = this.a.p();
         if (gw.a((double)$$0.u(), this.a.dr(), (double)$$0.w()).a(this.a.di(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         cpq $$0 = this.a.dK();
         if (this.a.gb() || this.a.H().l()) {
            ehi $$1 = ehi.b(this.a.p());
            ehi $$2 = btr.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = btr.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               gw $$3 = gw.a($$2);
               if (!$$0.b_($$3).a(apt.a) || !$$0.a_($$3).a($$0, $$3, eax.b)) {
                  $$2 = btr.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.D().a($$2.c, $$2.d, $$2.e, (float)(this.a.X() + 20), (float)this.a.W());
            this.a.H().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bpw {
      private final buu a;
      private final double b;
      @Nullable
      private cbp c;

      b(buu $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bpw.a.a, bpw.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dK().a(buu.bU, this.a);
         return this.c == null ? false : this.c.bY() && this.a.j() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bY() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bhy(bia.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.H().n();
      }

      @Override
      public void e() {
         this.a.D().a(this.c, (float)(this.a.X() + 20), (float)this.a.W());
         if (this.a.f(this.c) < 6.25) {
            this.a.H().n();
         } else {
            this.a.H().a(this.c, this.b);
         }

         if (this.c.bY() && this.c.dK().z.a(6) == 0) {
            this.c.b(new bhy(bia.D, 100), this.a);
         }
      }
   }

   class c extends bpw {
      private int b;

      @Override
      public boolean a() {
         if (this.b > buu.this.ah) {
            return false;
         } else {
            List<byi> $$0 = buu.this.dK().a(byi.class, buu.this.cG().c(8.0, 8.0, 8.0), buu.c);
            return !$$0.isEmpty() || !buu.this.c(biq.a).b();
         }
      }

      @Override
      public void c() {
         List<byi> $$0 = buu.this.dK().a(byi.class, buu.this.cG().c(8.0, 8.0, 8.0), buu.c);
         if (!$$0.isEmpty()) {
            buu.this.H().a($$0.get(0), 1.2F);
            buu.this.a(aoz.fW, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cja $$0 = buu.this.c(biq.a);
         if (!$$0.b()) {
            this.a($$0);
            buu.this.a(biq.a, cja.b);
            this.b = buu.this.ah + buu.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<byi> $$0 = buu.this.dK().a(byi.class, buu.this.cG().c(8.0, 8.0, 8.0), buu.c);
         cja $$1 = buu.this.c(biq.a);
         if (!$$1.b()) {
            this.a($$1);
            buu.this.a(biq.a, cja.b);
         } else if (!$$0.isEmpty()) {
            buu.this.H().a($$0.get(0), 1.2F);
         }
      }

      private void a(cja $$0) {
         if (!$$0.b()) {
            double $$1 = buu.this.dt() - 0.3F;
            byi $$2 = new byi(buu.this.dK(), buu.this.dp(), $$1, buu.this.dv(), $$0);
            $$2.b(40);
            $$2.c(buu.this.cv());
            float $$3 = 0.3F;
            float $$4 = buu.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * buu.this.ag.i();
            $$2.o(
               (double)(0.3F * -ars.a(buu.this.dA() * (float) (Math.PI / 180.0)) * ars.b(buu.this.dC() * (float) (Math.PI / 180.0)) + ars.b($$4) * $$5),
               (double)(0.3F * ars.a(buu.this.dC() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ars.b(buu.this.dA() * (float) (Math.PI / 180.0)) * ars.b(buu.this.dC() * (float) (Math.PI / 180.0)) + ars.a($$4) * $$5)
            );
            buu.this.dK().b($$2);
         }
      }
   }
}
