import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class buz extends bvt {
   private static final aee<gw> d = aeh.a(buz.class, aeg.n);
   private static final aee<Boolean> e = aeh.a(buz.class, aeg.k);
   private static final aee<Integer> bT = aeh.a(buz.class, aeg.b);
   static final bts bU = bts.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<byn> c = $$0 -> !$$0.y() && $$0.bv() && $$0.aX();

   public buz(biu<? extends buz> $$0, cpv $$1) {
      super($$0, $$1);
      this.bL = new bpg(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bpf(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      this.j(this.cg());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean dQ() {
      return false;
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(gw $$0) {
      this.an.b(d, $$0);
   }

   public gw s() {
      return this.an.b(d);
   }

   public boolean t() {
      return this.an.b(e);
   }

   public void w(boolean $$0) {
      this.an.b(e, $$0);
   }

   public int y() {
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
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.s().u());
      $$0.a("TreasurePosY", this.s().v());
      $$0.a("TreasurePosZ", this.s().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(qw $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new gw($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpm(this));
      this.bO.a(0, new brl(this));
      this.bO.a(1, new buz.a(this));
      this.bO.a(2, new buz.b(this, 4.0));
      this.bO.a(4, new bqz(this, 1.0, 10));
      this.bO.a(4, new bqw(this));
      this.bO.a(5, new bqj(this, cbu.class, 6.0F));
      this.bO.a(5, new bpr(this, 10));
      this.bO.a(6, new bql(this, 1.2F, true));
      this.bO.a(8, new buz.c());
      this.bO.a(8, new bpw(this));
      this.bO.a(9, new bpi<>(this, bze.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new brt(this, bze.class).a());
   }

   public static bkl.a gd() {
      return bji.A().a(bkm.a, 10.0).a(bkm.d, 1.2F).a(bkm.f, 3.0);
   }

   @Override
   protected bsp b(cpv $$0) {
      return new bsr(this, $$0);
   }

   @Override
   public boolean C(biq $$0) {
      boolean $$1 = $$0.a(this.dM().b((bjg)this), (float)((int)this.b(bkm.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(apd.fR, 1.0F, 1.0F);
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
   protected float b(bjs $$0, bir $$1) {
      return 0.3F;
   }

   @Override
   public int Y() {
      return 1;
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   protected boolean o(biq $$0) {
      return true;
   }

   @Override
   public boolean f(cjf $$0) {
      biv $$1 = bji.h($$0);
      return !this.c($$1).b() ? false : $$1 == biv.a && super.f($$0);
   }

   @Override
   protected void b(byn $$0) {
      if (this.c(biv.a).b()) {
         cjf $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(biv.a, $$1);
            this.e(biv.a);
            this.a($$0, $$1.L());
            $$0.ak();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.fT()) {
         this.j(this.cg());
      } else {
         if (this.aZ()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dM().r(), 1.0F);
            }

            if (this.aA()) {
               this.f(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ag.i() * 360.0F);
               this.c(false);
               this.au = true;
            }
         }

         if (this.dL().B && this.aX() && this.do().g() > 0.03) {
            ehn $$0 = this.f(0.0F);
            float $$1 = arw.b(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = arw.a(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dL()
                  .a(iv.am, this.dq() - $$0.c * (double)$$3 + (double)$$1, this.ds() - $$0.d, this.dw() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dL()
                  .a(iv.am, this.dq() - $$0.c * (double)$$3 - (double)$$1, this.ds() - $$0.d, this.dw() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
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
         this.dL().a($$0, this.d(1.0), this.dt() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(aqa.ao)) {
         if (!this.dL().B) {
            this.a(apd.fT, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fS().d) {
            $$2.h(1);
         }

         return bgy.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected apc d(bho $$0) {
      return apd.fU;
   }

   @Nullable
   @Override
   protected apc l_() {
      return apd.fS;
   }

   @Nullable
   @Override
   protected apc w() {
      return this.aX() ? apd.fQ : apd.fP;
   }

   @Override
   protected apc aM() {
      return apd.fX;
   }

   @Override
   protected apc aL() {
      return apd.fY;
   }

   protected boolean ge() {
      gw $$0 = this.L().h();
      return $$0 != null ? $$0.a(this.dj(), 12.0) : false;
   }

   @Override
   public void h(ehn $$0) {
      if (this.cX() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(bjm.a, this.do());
         this.f(this.do().a(0.9));
         if (this.q() == null) {
            this.f(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return true;
   }

   static class a extends bqb {
      private final buz a;
      private boolean b;

      a(buz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqb.a.a, bqb.a.b));
      }

      @Override
      public boolean P_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.t() && this.a.ch() >= 100;
      }

      @Override
      public boolean b() {
         gw $$0 = this.a.s();
         return !gw.a((double)$$0.u(), this.a.ds(), (double)$$0.w()).a(this.a.dj(), 4.0) && !this.b && this.a.ch() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dL() instanceof akq) {
            akq $$0 = (akq)this.a.dL();
            this.b = false;
            this.a.L().n();
            gw $$1 = this.a.dl();
            gw $$2 = $$0.a(aqd.b, $$1, 50, false);
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
         gw $$0 = this.a.s();
         if (gw.a((double)$$0.u(), this.a.ds(), (double)$$0.w()).a(this.a.dj(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         cpv $$0 = this.a.dL();
         if (this.a.ge() || this.a.L().l()) {
            ehn $$1 = ehn.b(this.a.s());
            ehn $$2 = btw.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = btw.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               gw $$3 = gw.a($$2);
               if (!$$0.b_($$3).a(apx.a) || !$$0.a_($$3).a($$0, $$3, ebc.b)) {
                  $$2 = btw.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.G().a($$2.c, $$2.d, $$2.e, (float)(this.a.Z() + 20), (float)this.a.Y());
            this.a.L().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bqb {
      private final buz a;
      private final double b;
      @Nullable
      private cbu c;

      b(buz $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bqb.a.a, bqb.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dL().a(buz.bU, this.a);
         return this.c == null ? false : this.c.bY() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bY() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bid(bif.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.L().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.c, (float)(this.a.Z() + 20), (float)this.a.Y());
         if (this.a.f(this.c) < 6.25) {
            this.a.L().n();
         } else {
            this.a.L().a(this.c, this.b);
         }

         if (this.c.bY() && this.c.dL().z.a(6) == 0) {
            this.c.b(new bid(bif.D, 100), this.a);
         }
      }
   }

   class c extends bqb {
      private int b;

      @Override
      public boolean a() {
         if (this.b > buz.this.ah) {
            return false;
         } else {
            List<byn> $$0 = buz.this.dL().a(byn.class, buz.this.cG().c(8.0, 8.0, 8.0), buz.c);
            return !$$0.isEmpty() || !buz.this.c(biv.a).b();
         }
      }

      @Override
      public void c() {
         List<byn> $$0 = buz.this.dL().a(byn.class, buz.this.cG().c(8.0, 8.0, 8.0), buz.c);
         if (!$$0.isEmpty()) {
            buz.this.L().a($$0.get(0), 1.2F);
            buz.this.a(apd.fW, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cjf $$0 = buz.this.c(biv.a);
         if (!$$0.b()) {
            this.a($$0);
            buz.this.a(biv.a, cjf.b);
            this.b = buz.this.ah + buz.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<byn> $$0 = buz.this.dL().a(byn.class, buz.this.cG().c(8.0, 8.0, 8.0), buz.c);
         cjf $$1 = buz.this.c(biv.a);
         if (!$$1.b()) {
            this.a($$1);
            buz.this.a(biv.a, cjf.b);
         } else if (!$$0.isEmpty()) {
            buz.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(cjf $$0) {
         if (!$$0.b()) {
            double $$1 = buz.this.du() - 0.3F;
            byn $$2 = new byn(buz.this.dL(), buz.this.dq(), $$1, buz.this.dw(), $$0);
            $$2.b(40);
            $$2.c(buz.this.cv());
            float $$3 = 0.3F;
            float $$4 = buz.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * buz.this.ag.i();
            $$2.o(
               (double)(0.3F * -arw.a(buz.this.dB() * (float) (Math.PI / 180.0)) * arw.b(buz.this.dD() * (float) (Math.PI / 180.0)) + arw.b($$4) * $$5),
               (double)(0.3F * arw.a(buz.this.dD() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * arw.b(buz.this.dB() * (float) (Math.PI / 180.0)) * arw.b(buz.this.dD() * (float) (Math.PI / 180.0)) + arw.a($$4) * $$5)
            );
            buz.this.dL().b($$2);
         }
      }
   }
}
