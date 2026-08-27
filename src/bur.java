import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bur extends bvl {
   private static final adz<gu> d = aec.a(bur.class, aeb.n);
   private static final adz<Boolean> e = aec.a(bur.class, aeb.k);
   private static final adz<Integer> bT = aec.a(bur.class, aeb.b);
   static final btk bU = btk.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<byf> c = $$0 -> !$$0.r() && $$0.bv() && $$0.aX();

   public bur(bim<? extends bur> $$0, cpl $$1) {
      super($$0, $$1);
      this.bL = new boy(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new box(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
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

   public void i(gu $$0) {
      this.an.b(d, $$0);
   }

   public gu p() {
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
      this.an.a(d, gu.b);
      this.an.a(e, false);
      this.an.a(bT, 2400);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.p().u());
      $$0.a("TreasurePosY", this.p().v());
      $$0.a("TreasurePosZ", this.p().w());
      $$0.a("GotFish", this.q());
      $$0.a("Moistness", this.t());
   }

   @Override
   public void a(qr $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new gu($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpe(this));
      this.bO.a(0, new brd(this));
      this.bO.a(1, new bur.a(this));
      this.bO.a(2, new bur.b(this, 4.0));
      this.bO.a(4, new bqr(this, 1.0, 10));
      this.bO.a(4, new bqo(this));
      this.bO.a(5, new bqb(this, cbm.class, 6.0F));
      this.bO.a(5, new bpj(this, 10));
      this.bO.a(6, new bqd(this, 1.2F, true));
      this.bO.a(8, new bur.c());
      this.bO.a(8, new bpo(this));
      this.bO.a(9, new bpa<>(this, byw.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new brl(this, byw.class).a());
   }

   public static bkd.a ga() {
      return bja.x().a(bke.a, 10.0).a(bke.d, 1.2F).a(bke.f, 3.0);
   }

   @Override
   protected bsh b(cpl $$0) {
      return new bsj(this, $$0);
   }

   @Override
   public boolean C(bii $$0) {
      boolean $$1 = $$0.a(this.dL().b((biy)this), (float)((int)this.b(bke.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aow.fR, 1.0F, 1.0F);
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
   protected float b(bjk $$0, bij $$1) {
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
   protected boolean o(bii $$0) {
      return true;
   }

   @Override
   public boolean f(cix $$0) {
      bin $$1 = bja.h($$0);
      return !this.c($$1).b() ? false : $$1 == bin.a && super.f($$0);
   }

   @Override
   protected void b(byf $$0) {
      if (this.c(bin.a).b()) {
         cix $$1 = $$0.j();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bin.a, $$1);
            this.e(bin.a);
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
            ehd $$0 = this.f(0.0F);
            float $$1 = arp.b(this.dA() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = arp.a(this.dA() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dK()
                  .a(iv.am, this.dp() - $$0.c * (double)$$3 + (double)$$1, this.dr() - $$0.d, this.dv() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dK()
                  .a(iv.am, this.dp() - $$0.c * (double)$$3 - (double)$$1, this.dr() - $$0.d, this.dv() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(iv.K);
      } else {
         super.b($$0);
      }
   }

   private void a(it $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dK().a($$0, this.d(1.0), this.ds() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bgq b(cbm $$0, bgp $$1) {
      cix $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(apt.ao)) {
         if (!this.dK().B) {
            this.a(aow.fT, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         return bgq.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.fU;
   }

   @Nullable
   @Override
   protected aov h_() {
      return aow.fS;
   }

   @Nullable
   @Override
   protected aov r() {
      return this.aX() ? aow.fQ : aow.fP;
   }

   @Override
   protected aov aM() {
      return aow.fX;
   }

   @Override
   protected aov aL() {
      return aow.fY;
   }

   protected boolean gb() {
      gu $$0 = this.H().h();
      return $$0 != null ? $$0.a(this.di(), 12.0) : false;
   }

   @Override
   public void h(ehd $$0) {
      if (this.cX() && this.aX()) {
         this.a(this.fd(), $$0);
         this.a(bje.a, this.dn());
         this.f(this.dn().a(0.9));
         if (this.j() == null) {
            this.f(this.dn().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(cbm $$0) {
      return true;
   }

   static class a extends bpt {
      private final bur a;
      private boolean b;

      a(bur $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bpt.a.a, bpt.a.b));
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
         gu $$0 = this.a.p();
         return !gu.a((double)$$0.u(), this.a.dr(), (double)$$0.w()).a(this.a.di(), 4.0) && !this.b && this.a.ch() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dK() instanceof akk) {
            akk $$0 = (akk)this.a.dK();
            this.b = false;
            this.a.H().n();
            gu $$1 = this.a.dk();
            gu $$2 = $$0.a(apw.b, $$1, 50, false);
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
         gu $$0 = this.a.p();
         if (gu.a((double)$$0.u(), this.a.dr(), (double)$$0.w()).a(this.a.di(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         cpl $$0 = this.a.dK();
         if (this.a.gb() || this.a.H().l()) {
            ehd $$1 = ehd.b(this.a.p());
            ehd $$2 = bto.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bto.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               gu $$3 = gu.a($$2);
               if (!$$0.b_($$3).a(apq.a) || !$$0.a_($$3).a($$0, $$3, eas.b)) {
                  $$2 = bto.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends bpt {
      private final bur a;
      private final double b;
      @Nullable
      private cbm c;

      b(bur $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bpt.a.a, bpt.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dK().a(bur.bU, this.a);
         return this.c == null ? false : this.c.bY() && this.a.j() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bY() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bhv(bhx.D, 100), this.a);
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
            this.c.b(new bhv(bhx.D, 100), this.a);
         }
      }
   }

   class c extends bpt {
      private int b;

      @Override
      public boolean a() {
         if (this.b > bur.this.ah) {
            return false;
         } else {
            List<byf> $$0 = bur.this.dK().a(byf.class, bur.this.cG().c(8.0, 8.0, 8.0), bur.c);
            return !$$0.isEmpty() || !bur.this.c(bin.a).b();
         }
      }

      @Override
      public void c() {
         List<byf> $$0 = bur.this.dK().a(byf.class, bur.this.cG().c(8.0, 8.0, 8.0), bur.c);
         if (!$$0.isEmpty()) {
            bur.this.H().a($$0.get(0), 1.2F);
            bur.this.a(aow.fW, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cix $$0 = bur.this.c(bin.a);
         if (!$$0.b()) {
            this.a($$0);
            bur.this.a(bin.a, cix.b);
            this.b = bur.this.ah + bur.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<byf> $$0 = bur.this.dK().a(byf.class, bur.this.cG().c(8.0, 8.0, 8.0), bur.c);
         cix $$1 = bur.this.c(bin.a);
         if (!$$1.b()) {
            this.a($$1);
            bur.this.a(bin.a, cix.b);
         } else if (!$$0.isEmpty()) {
            bur.this.H().a($$0.get(0), 1.2F);
         }
      }

      private void a(cix $$0) {
         if (!$$0.b()) {
            double $$1 = bur.this.dt() - 0.3F;
            byf $$2 = new byf(bur.this.dK(), bur.this.dp(), $$1, bur.this.dv(), $$0);
            $$2.b(40);
            $$2.c(bur.this.cv());
            float $$3 = 0.3F;
            float $$4 = bur.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * bur.this.ag.i();
            $$2.o(
               (double)(0.3F * -arp.a(bur.this.dA() * (float) (Math.PI / 180.0)) * arp.b(bur.this.dC() * (float) (Math.PI / 180.0)) + arp.b($$4) * $$5),
               (double)(0.3F * arp.a(bur.this.dC() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * arp.b(bur.this.dA() * (float) (Math.PI / 180.0)) * arp.b(bur.this.dC() * (float) (Math.PI / 180.0)) + arp.a($$4) * $$5)
            );
            bur.this.dK().b($$2);
         }
      }
   }
}
