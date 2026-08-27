import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buq extends bvk {
   private static final adx<gv> d = aea.a(buq.class, adz.n);
   private static final adx<Boolean> e = aea.a(buq.class, adz.k);
   private static final adx<Integer> bT = aea.a(buq.class, adz.b);
   static final btj bU = btj.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<bye> c = $$0 -> !$$0.r() && $$0.bv() && $$0.aX();

   public buq(bik<? extends buq> $$0, cpk $$1) {
      super($$0, $$1);
      this.bL = new box(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bow(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
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

   public void i(gv $$0) {
      this.an.b(d, $$0);
   }

   public gv p() {
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
      this.an.a(d, gv.b);
      this.an.a(e, false);
      this.an.a(bT, 2400);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.p().u());
      $$0.a("TreasurePosY", this.p().v());
      $$0.a("TreasurePosZ", this.p().w());
      $$0.a("GotFish", this.q());
      $$0.a("Moistness", this.t());
   }

   @Override
   public void a(qs $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new gv($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpd(this));
      this.bO.a(0, new brc(this));
      this.bO.a(1, new buq.a(this));
      this.bO.a(2, new buq.b(this, 4.0));
      this.bO.a(4, new bqq(this, 1.0, 10));
      this.bO.a(4, new bqn(this));
      this.bO.a(5, new bqa(this, cbl.class, 6.0F));
      this.bO.a(5, new bpi(this, 10));
      this.bO.a(6, new bqc(this, 1.2F, true));
      this.bO.a(8, new buq.c());
      this.bO.a(8, new bpn(this));
      this.bO.a(9, new boz<>(this, byv.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new brk(this, byv.class).a());
   }

   public static bkc.a fZ() {
      return biy.x().a(bkd.a, 10.0).a(bkd.d, 1.2F).a(bkd.f, 3.0);
   }

   @Override
   protected bsg b(cpk $$0) {
      return new bsi(this, $$0);
   }

   @Override
   public boolean C(big $$0) {
      boolean $$1 = $$0.a(this.dL().b((biw)this), (float)((int)this.b(bkd.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aou.fR, 1.0F, 1.0F);
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
   protected float b(bji $$0, bih $$1) {
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
   protected boolean o(big $$0) {
      return true;
   }

   @Override
   public boolean f(ciw $$0) {
      bil $$1 = biy.h($$0);
      return !this.c($$1).b() ? false : $$1 == bil.a && super.f($$0);
   }

   @Override
   protected void b(bye $$0) {
      if (this.c(bil.a).b()) {
         ciw $$1 = $$0.j();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bil.a, $$1);
            this.e(bil.a);
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
            ehf $$0 = this.f(0.0F);
            float $$1 = aro.b(this.dA() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = aro.a(this.dA() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dK()
                  .a(iw.am, this.dp() - $$0.c * (double)$$3 + (double)$$1, this.dr() - $$0.d, this.dv() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dK()
                  .a(iw.am, this.dp() - $$0.c * (double)$$3 - (double)$$1, this.dr() - $$0.d, this.dv() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(iw.K);
      } else {
         super.b($$0);
      }
   }

   private void a(iu $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dK().a($$0, this.d(1.0), this.ds() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(apr.ao)) {
         if (!this.dK().B) {
            this.a(aou.fT, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         return bgo.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.fU;
   }

   @Nullable
   @Override
   protected aot h_() {
      return aou.fS;
   }

   @Nullable
   @Override
   protected aot r() {
      return this.aX() ? aou.fQ : aou.fP;
   }

   @Override
   protected aot aM() {
      return aou.fX;
   }

   @Override
   protected aot aL() {
      return aou.fY;
   }

   protected boolean ga() {
      gv $$0 = this.H().h();
      return $$0 != null ? $$0.a(this.di(), 12.0) : false;
   }

   @Override
   public void h(ehf $$0) {
      if (this.cX() && this.aX()) {
         this.a(this.fd(), $$0);
         this.a(bjc.a, this.dn());
         this.f(this.dn().a(0.9));
         if (this.j() == null) {
            this.f(this.dn().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return true;
   }

   static class a extends bps {
      private final buq a;
      private boolean b;

      a(buq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bps.a.a, bps.a.b));
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
         gv $$0 = this.a.p();
         return !gv.a((double)$$0.u(), this.a.dr(), (double)$$0.w()).a(this.a.di(), 4.0) && !this.b && this.a.ch() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dK() instanceof aki) {
            aki $$0 = (aki)this.a.dK();
            this.b = false;
            this.a.H().n();
            gv $$1 = this.a.dk();
            gv $$2 = $$0.a(apu.b, $$1, 50, false);
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
         gv $$0 = this.a.p();
         if (gv.a((double)$$0.u(), this.a.dr(), (double)$$0.w()).a(this.a.di(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         cpk $$0 = this.a.dK();
         if (this.a.ga() || this.a.H().l()) {
            ehf $$1 = ehf.b(this.a.p());
            ehf $$2 = btn.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = btn.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               gv $$3 = gv.a($$2);
               if (!$$0.b_($$3).a(apo.a) || !$$0.a_($$3).a($$0, $$3, ear.b)) {
                  $$2 = btn.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends bps {
      private final buq a;
      private final double b;
      @Nullable
      private cbl c;

      b(buq $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bps.a.a, bps.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dK().a(buq.bU, this.a);
         return this.c == null ? false : this.c.bY() && this.a.j() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bY() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bht(bhv.D, 100), this.a);
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
            this.c.b(new bht(bhv.D, 100), this.a);
         }
      }
   }

   class c extends bps {
      private int b;

      @Override
      public boolean a() {
         if (this.b > buq.this.ah) {
            return false;
         } else {
            List<bye> $$0 = buq.this.dK().a(bye.class, buq.this.cG().c(8.0, 8.0, 8.0), buq.c);
            return !$$0.isEmpty() || !buq.this.c(bil.a).b();
         }
      }

      @Override
      public void c() {
         List<bye> $$0 = buq.this.dK().a(bye.class, buq.this.cG().c(8.0, 8.0, 8.0), buq.c);
         if (!$$0.isEmpty()) {
            buq.this.H().a($$0.get(0), 1.2F);
            buq.this.a(aou.fW, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         ciw $$0 = buq.this.c(bil.a);
         if (!$$0.b()) {
            this.a($$0);
            buq.this.a(bil.a, ciw.b);
            this.b = buq.this.ah + buq.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<bye> $$0 = buq.this.dK().a(bye.class, buq.this.cG().c(8.0, 8.0, 8.0), buq.c);
         ciw $$1 = buq.this.c(bil.a);
         if (!$$1.b()) {
            this.a($$1);
            buq.this.a(bil.a, ciw.b);
         } else if (!$$0.isEmpty()) {
            buq.this.H().a($$0.get(0), 1.2F);
         }
      }

      private void a(ciw $$0) {
         if (!$$0.b()) {
            double $$1 = buq.this.dt() - 0.3F;
            bye $$2 = new bye(buq.this.dK(), buq.this.dp(), $$1, buq.this.dv(), $$0);
            $$2.b(40);
            $$2.c(buq.this.cv());
            float $$3 = 0.3F;
            float $$4 = buq.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * buq.this.ag.i();
            $$2.o(
               (double)(0.3F * -aro.a(buq.this.dA() * (float) (Math.PI / 180.0)) * aro.b(buq.this.dC() * (float) (Math.PI / 180.0)) + aro.b($$4) * $$5),
               (double)(0.3F * aro.a(buq.this.dC() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * aro.b(buq.this.dA() * (float) (Math.PI / 180.0)) * aro.b(buq.this.dC() * (float) (Math.PI / 180.0)) + aro.a($$4) * $$5)
            );
            buq.this.dK().b($$2);
         }
      }
   }
}
