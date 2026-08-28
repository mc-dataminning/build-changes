import java.util.EnumSet;
import javax.annotation.Nullable;

public class cmx extends coc implements cnn {
   public static final float a = 0.03F;
   boolean bH;
   protected final cgd b;
   protected final cga c;

   public cmx(bwb<? extends cmx> $$0, dhp $$1) {
      super($$0, $$1);
      this.by = new cmx.d(this);
      this.a(evk.j, 0.0F);
      this.b = new cgd(this, $$1);
      this.c = new cga(this, $$1);
   }

   public static bxw.a j() {
      return coc.gr().a(bxx.B, 1.0);
   }

   @Override
   protected void m() {
      this.bB.a(1, new cmx.c(this, 1.0));
      this.bB.a(2, new cmx.f(this, 1.0, 40, 10.0F));
      this.bB.a(2, new cmx.a(this, 1.0, false));
      this.bB.a(5, new cmx.b(this, 1.0));
      this.bB.a(6, new cmx.e(this, 1.0, this.dV().P()));
      this.bB.a(7, new cek(this, 1.0));
      this.bC.a(1, new cff(this, cmx.class).a(coe.class));
      this.bC.a(2, new cfg<>(this, cqi.class, 10, true, false, ($$0, $$1) -> this.j($$0)));
      this.bC.a(3, new cfg<>(this, cpp.class, false));
      this.bC.a(3, new cfg<>(this, cis.class, true));
      this.bC.a(3, new cfg<>(this, cjv.class, true, false));
      this.bC.a(5, new cfg<>(this, cjk.class, 10, true, false, cjk.bE));
   }

   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bwc.b).f() && $$0.C_().i() < 0.03F) {
         this.a(bwc.b, new cxy(cyc.wX));
         this.g(bwc.b);
      }

      return $$3;
   }

   public static boolean a(bwb<cmx> $$0, dig $$1, bwa $$2, jj $$3, azs $$4) {
      if (!$$1.b_($$3.e()).a(axf.a) && !bwa.a($$2)) {
         return false;
      } else {
         js<dis> $$5 = $$1.t($$3);
         boolean $$6 = $$1.an() != btn.a && (bwa.b($$2) || a($$1, $$3, $$4)) && (bwa.a($$2) || $$1.b_($$3).a(axf.a));
         if (!$$6 || !bwa.a($$2) && $$2 != bwa.j) {
            return $$5.a(awy.ar) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(dhq $$0, jj $$1) {
      return $$1.v() < $$0.P() - 5;
   }

   @Override
   protected awj u() {
      return this.bj() ? awk.hZ : awk.hY;
   }

   @Override
   protected awj e(buh $$0) {
      return this.bj() ? awk.id : awk.ic;
   }

   @Override
   protected awj l_() {
      return this.bj() ? awk.ib : awk.ia;
   }

   @Override
   protected awj n() {
      return awk.if;
   }

   @Override
   protected awj aV() {
      return awk.ig;
   }

   @Override
   protected boolean q() {
      return true;
   }

   @Override
   protected cxy t() {
      return cxy.k;
   }

   @Override
   protected void a(azs $$0, bto $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bwc.a, new cxy(cyc.wW));
         } else {
            this.a(bwc.a, new cxy(cyc.rW));
         }
      }
   }

   @Override
   protected boolean a(cxy $$0, cxy $$1, bwc $$2) {
      return $$1.a(cyc.wX) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   public boolean a(dhs $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bwr $$0) {
      return $$0 != null ? !this.dV().V() || $$0.bj() : false;
   }

   @Override
   public boolean cJ() {
      return !this.ck();
   }

   boolean gx() {
      if (this.bH) {
         return true;
      } else {
         bwr $$0 = this.f();
         return $$0 != null && $$0.bj();
      }
   }

   @Override
   public void a_(fcu $$0) {
      if (this.bn() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(bwv.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bo() {
      if (!this.dV().C) {
         if (this.dj() && this.bn() && this.gx()) {
            this.bA = this.b;
            this.i(true);
         } else {
            this.bA = this.c;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cl() {
      return this.ck();
   }

   protected boolean gq() {
      evh $$0 = this.O().i();
      if ($$0 != null) {
         jj $$1 = $$0.l();
         if ($$1 != null) {
            double $$2 = this.i((double)$$1.u(), (double)$$1.v(), (double)$$1.w());
            if ($$2 < 4.0) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public void a(bwr $$0, float $$1) {
      cxy $$2 = this.fa();
      cxy $$3 = $$2.a(cyc.wW) ? $$2 : new cxy(cyc.wW);
      cro $$4 = new cro(this.dV(), this, $$3);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof arn $$9) {
         crb.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dV().an().a() * 4));
      }

      this.a(awk.ie, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public axp<cxu> Y() {
      return axi.bT;
   }

   public void w(boolean $$0) {
      this.bH = $$0;
   }

   static class a extends cfc {
      private final cmx b;

      public a(cmx $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.f());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.j(this.b.f());
      }
   }

   static class b extends cea {
      private final cmx g;

      public b(cmx $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dV().V() && this.g.bj() && this.g.dC() >= (double)(this.g.dV().P() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dhs $$0, jj $$1) {
         jj $$2 = $$1.d();
         return $$0.u($$2) && $$0.u($$2.d()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.w(false);
         this.g.bA = this.g.c;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends cdn {
      private final bwz a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dhp f;

      public c(bwz $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dV();
         this.a(EnumSet.of(cdn.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.V()) {
            return false;
         } else if (this.a.bj()) {
            return false;
         } else {
            fcu $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.d;
               this.c = $$0.e;
               this.d = $$0.f;
               return true;
            }
         }
      }

      @Override
      public boolean c() {
         return !this.a.O().k();
      }

      @Override
      public void d() {
         this.a.O().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private fcu h() {
         azs $$0 = this.a.dY();
         jj $$1 = this.a.dv();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jj $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dkw.J)) {
               return fcu.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends ccq {
      private final cmx l;

      public d(cmx $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bwr $$0 = this.l.f();
         if (this.l.gx() && this.l.bj()) {
            if ($$0 != null && $$0.dC() > this.l.dC() || this.l.bH) {
               this.l.i(this.l.dy().b(0.0, 0.002, 0.0));
            }

            if (this.k != ccq.a.b || this.l.O().k()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azk.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aU = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(bxx.v));
            float $$7 = azk.h(0.125F, this.l.fn(), $$6);
            this.l.C($$7);
            this.l.i(this.l.dy().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aJ()) {
               this.l.i(this.l.dy().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cdn {
      private final cmx a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cmx $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dV().V() && this.a.bj() && this.a.dC() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dC() < (double)(this.c - 1) && (this.a.O().k() || this.a.gq())) {
            fcu $$0 = chk.a(this.a, 4, 8, new fcu(this.a.dA(), (double)(this.c - 1), this.a.dG()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.O().a($$0.d, $$0.e, $$0.f, this.b);
         }
      }

      @Override
      public void d() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.w(false);
      }
   }

   static class f extends cem {
      private final cmx a;

      public f(cnn $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cmx)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fa().a(cyc.wW);
      }

      @Override
      public void d() {
         super.d();
         this.a.v(true);
         this.a.c(btp.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fE();
         this.a.v(false);
      }
   }
}
