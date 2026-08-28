import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class clt extends bur implements clj {
   public static final float b = 7.448451F;
   public static final int c = azk.f(24.166098F);
   private static final akl<Integer> d = akp.a(clt.class, akn.b);
   ezn e = ezn.c;
   jh bX = jh.c;
   clt.a bY = clt.a.a;

   public clt(bul<? extends clt> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bP = new clt.g(this);
      this.bO = new clt.f(this);
   }

   @Override
   public boolean bb() {
      return (this.t() + this.ag) % c == 0;
   }

   @Override
   protected caw J() {
      return new clt.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new clt.c());
      this.bS.a(2, new clt.i());
      this.bS.a(3, new clt.e());
      this.bT.a(1, new clt.b());
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.am.a(d, azk.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.g(bwi.c).a((double)(6 + this.q()));
   }

   public int q() {
      return this.am.a(d);
   }

   @Override
   public void a(akl<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int t() {
      return this.as() * 3;
   }

   @Override
   protected boolean aa() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().C) {
         float $$0 = azk.b((float)(this.t() + this.ag) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = azk.b((float)(this.t() + this.ag + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dX().a(this.dC(), this.dE(), this.dI(), awl.tw, this.dn(), 0.95F + this.af.i() * 0.05F, 0.95F + this.af.i() * 0.05F, false);
         }

         float $$2 = this.ds() * 1.48F;
         float $$3 = azk.b(this.dN() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = azk.a(this.dN() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dt() * 2.5F;
         this.dX().a(lr.Z, this.dC() + (double)$$3, this.dE() + (double)$$5, this.dI() + (double)$$4, 0.0, 0.0, 0.0);
         this.dX().a(lr.Z, this.dC() - (double)$$3, this.dE() + (double)$$5, this.dI() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void n_() {
      if (this.bM() && this.gm()) {
         this.d(8.0F);
      }

      super.n_();
   }

   @Override
   protected void ac() {
      super.ac();
   }

   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      this.bX = this.dx().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bX = new jh($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("AX", this.bX.u());
      $$0.a("AY", this.bX.v());
      $$0.a("AZ", this.bX.w());
      $$0.a("Size", this.q());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public awm dn() {
      return awm.f;
   }

   @Override
   protected awk w() {
      return awl.tt;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.tx;
   }

   @Override
   protected awk o_() {
      return awl.tv;
   }

   @Override
   protected float fi() {
      return 1.0F;
   }

   @Override
   public boolean a(bul<?> $$0) {
      return true;
   }

   @Override
   public buh e(bvm $$0) {
      int $$1 = this.q();
      buh $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends cby {
      private final cfr b = cfr.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean b() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<com> $$0 = clt.this.dX().a(this.b, clt.this, clt.this.cS().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bue::dE).reversed());

               for (com $$1 : $$0) {
                  if (clt.this.a($$1, cfr.a)) {
                     clt.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean c() {
         bva $$0 = clt.this.m();
         return $$0 != null ? clt.this.a($$0, cfr.a) : false;
      }
   }

   class c extends cby {
      private int b;

      @Override
      public boolean b() {
         bva $$0 = clt.this.m();
         return $$0 != null ? clt.this.a($$0, cfr.a) : false;
      }

      @Override
      public void d() {
         this.b = this.a(10);
         clt.this.bY = clt.a.a;
         this.h();
      }

      @Override
      public void e() {
         clt.this.bX = clt.this.dX().a(ebf.a.e, clt.this.bX).b(10 + clt.this.af.a(20));
      }

      @Override
      public void a() {
         if (clt.this.bY == clt.a.a) {
            this.b--;
            if (this.b <= 0) {
               clt.this.bY = clt.a.b;
               this.h();
               this.b = this.a((8 + clt.this.af.a(4)) * 20);
               clt.this.a(awl.ty, 10.0F, 0.95F + clt.this.af.i() * 0.1F);
            }
         }
      }

      private void h() {
         clt.this.bX = clt.this.m().dx().b(20 + clt.this.af.a(20));
         if (clt.this.bX.v() < clt.this.dX().N()) {
            clt.this.bX = new jh(clt.this.bX.u(), clt.this.dX().N() + 1, clt.this.bX.w());
         }
      }
   }

   class d extends caw {
      public d(final bvc $$0) {
         super($$0);
      }

      @Override
      public void a() {
         clt.this.aZ = clt.this.aX;
         clt.this.aX = clt.this.dN();
      }
   }

   class e extends clt.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean b() {
         return clt.this.m() == null || clt.this.bY == clt.a.a;
      }

      @Override
      public void d() {
         this.d = 5.0F + clt.this.af.i() * 10.0F;
         this.e = -4.0F + clt.this.af.i() * 9.0F;
         this.f = clt.this.af.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void a() {
         if (clt.this.af.a(this.a(350)) == 0) {
            this.e = -4.0F + clt.this.af.i() * 9.0F;
         }

         if (clt.this.af.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (clt.this.af.a(this.a(450)) == 0) {
            this.c = clt.this.af.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (clt.this.e.e < clt.this.dE() && !clt.this.dX().u(clt.this.dx().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (clt.this.e.e > clt.this.dE() && !clt.this.dX().u(clt.this.dx().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (jh.c.equals(clt.this.bX)) {
            clt.this.bX = clt.this.dx();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         clt.this.e = ezn.a(clt.this.bX).b((double)(this.d * azk.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * azk.a(this.c)));
      }
   }

   class f extends cba {
      public f(final bvc $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends cbb {
      private float m = 0.1F;

      public g(final bvc $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (clt.this.Q) {
            clt.this.v(clt.this.dN() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = clt.this.e.d - clt.this.dC();
         double $$1 = clt.this.e.e - clt.this.dE();
         double $$2 = clt.this.e.f - clt.this.dI();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = clt.this.dN();
            float $$7 = (float)azk.d($$2, $$0);
            float $$8 = azk.h(clt.this.dN() + 90.0F);
            float $$9 = azk.h($$7 * (180.0F / (float)Math.PI));
            clt.this.v(azk.e($$8, $$9, 4.0F) - 90.0F);
            clt.this.aX = clt.this.dN();
            if (azk.d($$6, clt.this.dN()) < 3.0F) {
               this.m = azk.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = azk.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(azk.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            clt.this.w($$10);
            float $$11 = clt.this.dN() + 90.0F;
            double $$12 = (double)(this.m * azk.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * azk.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * azk.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ezn $$15 = clt.this.dA();
            clt.this.h($$15.e(new ezn($$12, $$14, $$13).d($$15).c(0.2)));
         }
      }
   }

   abstract class h extends cby {
      public h() {
         this.a(EnumSet.of(cby.a.a));
      }

      protected boolean h() {
         return clt.this.e.c(clt.this.dC(), clt.this.dE(), clt.this.dI()) < 4.0;
      }
   }

   class i extends clt.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean b() {
         return clt.this.m() != null && clt.this.bY == clt.a.b;
      }

      @Override
      public boolean c() {
         bva $$0 = clt.this.m();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bM()) {
            return false;
         } else {
            if ($$0 instanceof com $$1 && ($$0.R_() || $$1.f())) {
               return false;
            }

            if (!this.b()) {
               return false;
            } else {
               if (clt.this.ag > this.e) {
                  this.e = clt.this.ag + 20;
                  List<cgu> $$2 = clt.this.dX().a(cgu.class, clt.this.cS().g(16.0), buj.a);

                  for (cgu $$3 : $$2) {
                     $$3.gJ();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void d() {
      }

      @Override
      public void e() {
         clt.this.h(null);
         clt.this.bY = clt.a.a;
      }

      @Override
      public void a() {
         bva $$0 = clt.this.m();
         if ($$0 != null) {
            clt.this.e = new ezn($$0.dC(), $$0.e(0.5), $$0.dI());
            if (clt.this.cS().g(0.2F).c($$0.cS())) {
               clt.this.E($$0);
               clt.this.bY = clt.a.a;
               if (!clt.this.bc()) {
                  clt.this.dX().c(1039, clt.this.dx(), 0);
               }
            } else if (clt.this.Q || clt.this.aN > 0) {
               clt.this.bY = clt.a.a;
            }
         }
      }
   }
}
