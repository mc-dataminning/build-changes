import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvf extends bvz {
   private static final aef<gw> d = aei.a(bvf.class, aeh.n);
   private static final aef<Boolean> e = aei.a(bvf.class, aeh.k);
   private static final aef<Integer> bT = aei.a(bvf.class, aeh.b);
   static final bty bU = bty.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<byt> c = $$0 -> !$$0.y() && $$0.bv() && $$0.aX();

   public bvf(bja<? extends bvf> $$0, cqb $$1) {
      super($$0, $$1);
      this.bL = new bpm(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bpl(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      this.j(this.cg());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3, $$4);
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
      this.bO.a(0, new bps(this));
      this.bO.a(0, new brr(this));
      this.bO.a(1, new bvf.a(this));
      this.bO.a(2, new bvf.b(this, 4.0));
      this.bO.a(4, new brf(this, 1.0, 10));
      this.bO.a(4, new brc(this));
      this.bO.a(5, new bqp(this, cca.class, 6.0F));
      this.bO.a(5, new bpx(this, 10));
      this.bO.a(6, new bqr(this, 1.2F, true));
      this.bO.a(8, new bvf.c());
      this.bO.a(8, new bqc(this));
      this.bO.a(9, new bpo<>(this, bzk.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new brz(this, bzk.class).a());
   }

   public static bkr.a ge() {
      return bjo.A().a(bks.l, 10.0).a(bks.m, 1.2F).a(bks.c, 3.0);
   }

   @Override
   protected bsv b(cqb $$0) {
      return new bsx(this, $$0);
   }

   @Override
   public boolean C(biw $$0) {
      boolean $$1 = $$0.a(this.dM().b((bjm)this), (float)((int)this.b(bks.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(apg.fR, 1.0F, 1.0F);
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
   protected float b(bjy $$0, bix $$1) {
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
   protected boolean o(biw $$0) {
      return true;
   }

   @Override
   public boolean f(cjl $$0) {
      bjb $$1 = bjo.h($$0);
      return !this.c($$1).b() ? false : $$1 == bjb.a && super.f($$0);
   }

   @Override
   protected void b(byt $$0) {
      if (this.c(bjb.a).b()) {
         cjl $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bjb.a, $$1);
            this.e(bjb.a);
            this.a($$0, $$1.L());
            $$0.ak();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.fU()) {
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
            ehh $$0 = this.f(0.0F);
            float $$1 = asb.b(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = asb.a(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
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
   protected bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(aqd.ao)) {
         if (!this.dL().B) {
            this.a(apg.fT, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         return bhe.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.fU;
   }

   @Nullable
   @Override
   protected apf l_() {
      return apg.fS;
   }

   @Nullable
   @Override
   protected apf w() {
      return this.aX() ? apg.fQ : apg.fP;
   }

   @Override
   protected apf aM() {
      return apg.fX;
   }

   @Override
   protected apf aL() {
      return apg.fY;
   }

   protected boolean gf() {
      gw $$0 = this.L().h();
      return $$0 != null ? $$0.a(this.dj(), 12.0) : false;
   }

   @Override
   public void h(ehh $$0) {
      if (this.cX() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(bjs.a, this.do());
         this.f(this.do().a(0.9));
         if (this.q() == null) {
            this.f(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(cca $$0) {
      return true;
   }

   static class a extends bqh {
      private final bvf a;
      private boolean b;

      a(bvf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqh.a.a, bqh.a.b));
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
         if (this.a.dL() instanceof akt) {
            akt $$0 = (akt)this.a.dL();
            this.b = false;
            this.a.L().n();
            gw $$1 = this.a.dl();
            gw $$2 = $$0.a(aqg.b, $$1, 50, false);
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
         cqb $$0 = this.a.dL();
         if (this.a.gf() || this.a.L().l()) {
            ehh $$1 = ehh.b(this.a.s());
            ehh $$2 = buc.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = buc.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               gw $$3 = gw.a($$2);
               if (!$$0.b_($$3).a(aqa.a) || !$$0.a_($$3).a($$0, $$3, eaw.b)) {
                  $$2 = buc.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends bqh {
      private final bvf a;
      private final double b;
      @Nullable
      private cca c;

      b(bvf $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bqh.a.a, bqh.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dL().a(bvf.bU, this.a);
         return this.c == null ? false : this.c.bY() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bY() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bij(bil.D, 100), this.a);
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
            this.c.b(new bij(bil.D, 100), this.a);
         }
      }
   }

   class c extends bqh {
      private int b;

      @Override
      public boolean a() {
         if (this.b > bvf.this.ah) {
            return false;
         } else {
            List<byt> $$0 = bvf.this.dL().a(byt.class, bvf.this.cG().c(8.0, 8.0, 8.0), bvf.c);
            return !$$0.isEmpty() || !bvf.this.c(bjb.a).b();
         }
      }

      @Override
      public void c() {
         List<byt> $$0 = bvf.this.dL().a(byt.class, bvf.this.cG().c(8.0, 8.0, 8.0), bvf.c);
         if (!$$0.isEmpty()) {
            bvf.this.L().a($$0.get(0), 1.2F);
            bvf.this.a(apg.fW, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cjl $$0 = bvf.this.c(bjb.a);
         if (!$$0.b()) {
            this.a($$0);
            bvf.this.a(bjb.a, cjl.b);
            this.b = bvf.this.ah + bvf.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<byt> $$0 = bvf.this.dL().a(byt.class, bvf.this.cG().c(8.0, 8.0, 8.0), bvf.c);
         cjl $$1 = bvf.this.c(bjb.a);
         if (!$$1.b()) {
            this.a($$1);
            bvf.this.a(bjb.a, cjl.b);
         } else if (!$$0.isEmpty()) {
            bvf.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(cjl $$0) {
         if (!$$0.b()) {
            double $$1 = bvf.this.du() - 0.3F;
            byt $$2 = new byt(bvf.this.dL(), bvf.this.dq(), $$1, bvf.this.dw(), $$0);
            $$2.b(40);
            $$2.c(bvf.this.cv());
            float $$3 = 0.3F;
            float $$4 = bvf.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * bvf.this.ag.i();
            $$2.o(
               (double)(0.3F * -asb.a(bvf.this.dB() * (float) (Math.PI / 180.0)) * asb.b(bvf.this.dD() * (float) (Math.PI / 180.0)) + asb.b($$4) * $$5),
               (double)(0.3F * asb.a(bvf.this.dD() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * asb.b(bvf.this.dB() * (float) (Math.PI / 180.0)) * asb.b(bvf.this.dD() * (float) (Math.PI / 180.0)) + asb.a($$4) * $$5)
            );
            bvf.this.dL().b($$2);
         }
      }
   }
}
