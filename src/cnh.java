import java.util.EnumSet;
import javax.annotation.Nullable;

public class cnh extends com implements cnx {
   public static final float a = 0.03F;
   boolean bI;
   protected final cgl b;
   protected final cgi c;

   public cnh(bwj<? extends cnh> $$0, dip $$1) {
      super($$0, $$1);
      this.bz = new cnh.d(this);
      this.a(ewm.j, 0.0F);
      this.b = new cgl(this, $$1);
      this.c = new cgi(this, $$1);
   }

   public static bye.a j() {
      return com.gr().a(byf.B, 1.0);
   }

   @Override
   protected void m() {
      this.bC.a(1, new cnh.c(this, 1.0));
      this.bC.a(2, new cnh.f(this, 1.0, 40, 10.0F));
      this.bC.a(2, new cnh.a(this, 1.0, false));
      this.bC.a(5, new cnh.b(this, 1.0));
      this.bC.a(6, new cnh.e(this, 1.0, this.dV().P()));
      this.bC.a(7, new ces(this, 1.0));
      this.bD.a(1, new cfn(this, cnh.class).a(cop.class));
      this.bD.a(2, new cfo<>(this, cqs.class, 10, true, false, ($$0, $$1) -> this.i($$0)));
      this.bD.a(3, new cfo<>(this, cpz.class, false));
      this.bD.a(3, new cfo<>(this, cja.class, true));
      this.bD.a(3, new cfo<>(this, ckd.class, true, false));
      this.bD.a(5, new cfo<>(this, cjs.class, 10, true, false, cjs.bF));
   }

   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(bwk.b).f() && $$0.C_().i() < 0.03F) {
         this.a(bwk.b, new cys(cyw.wX));
         this.g(bwk.b);
      }

      return $$3;
   }

   public static boolean a(bwj<cnh> $$0, djg $$1, bwi $$2, iu $$3, azt $$4) {
      if (!$$1.b_($$3.e()).a(axf.a) && !bwi.a($$2)) {
         return false;
      } else {
         je<djs> $$5 = $$1.u($$3);
         boolean $$6 = $$1.an() != btv.a && (bwi.b($$2) || a($$1, $$3, $$4)) && (bwi.a($$2) || $$1.b_($$3).a(axf.a));
         if (!$$6 || !bwi.a($$2) && $$2 != bwi.j) {
            return $$5.a(awz.ar) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         } else {
            return true;
         }
      }
   }

   private static boolean a(diq $$0, iu $$1) {
      return $$1.v() < $$0.P() - 5;
   }

   @Override
   protected awk u() {
      return this.bj() ? awl.hZ : awl.hY;
   }

   @Override
   protected awk e(bup $$0) {
      return this.bj() ? awl.id : awl.ic;
   }

   @Override
   protected awk l_() {
      return this.bj() ? awl.ib : awl.ia;
   }

   @Override
   protected awk n() {
      return awl.if;
   }

   @Override
   protected awk aV() {
      return awl.ig;
   }

   @Override
   protected boolean q() {
      return true;
   }

   @Override
   protected cys t() {
      return cys.k;
   }

   @Override
   protected void a(azt $$0, btw $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bwk.a, new cys(cyw.wW));
         } else {
            this.a(bwk.a, new cys(cyw.rW));
         }
      }
   }

   @Override
   protected boolean a(cys $$0, cys $$1, bwk $$2) {
      return $$1.a(cyw.wX) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   public boolean a(dis $$0) {
      return $$0.f(this);
   }

   public boolean i(@Nullable bwz $$0) {
      return $$0 != null ? !this.dV().V() || $$0.bj() : false;
   }

   @Override
   public boolean cJ() {
      return !this.ck();
   }

   boolean gx() {
      if (this.bI) {
         return true;
      } else {
         bwz $$0 = this.f();
         return $$0 != null && $$0.bj();
      }
   }

   @Override
   public void a_(fdw $$0) {
      if (this.bn() && this.gx()) {
         this.a(0.01F, $$0);
         this.a(bxd.a, this.dy());
         this.i(this.dy().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void bo() {
      if (!this.dV().C) {
         if (this.dj() && this.bn() && this.gx()) {
            this.bB = this.b;
            this.i(true);
         } else {
            this.bB = this.c;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cl() {
      return this.ck();
   }

   protected boolean gq() {
      ewj $$0 = this.O().i();
      if ($$0 != null) {
         iu $$1 = $$0.l();
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
   public void a(bwz $$0, float $$1) {
      cys $$2 = this.fa();
      cys $$3 = $$2.a(cyw.wW) ? $$2 : new cys(cyw.wW);
      csa $$4 = new csa(this.dV(), this, $$3);
      double $$5 = $$0.dA() - this.dA();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dC();
      double $$7 = $$0.dG() - this.dG();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dV() instanceof aro $$9) {
         crm.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dV().an().a() * 4));
      }

      this.a(awl.ie, 1.0F, 1.0F / (this.dY().i() * 0.4F + 0.8F));
   }

   @Override
   public axp<cyo> Y() {
      return axi.bT;
   }

   public void w(boolean $$0) {
      this.bI = $$0;
   }

   static class a extends cfk {
      private final cnh b;

      public a(cnh $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.i(this.b.f());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.i(this.b.f());
      }
   }

   static class b extends cei {
      private final cnh g;

      public b(cnh $$0, double $$1) {
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
      protected boolean a(dis $$0, iu $$1) {
         iu $$2 = $$1.d();
         return $$0.v($$2) && $$0.v($$2.d()) ? $$0.a_($$1).b($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.w(false);
         this.g.bB = this.g.c;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends cdv {
      private final bxh a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dip f;

      public c(bxh $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dV();
         this.a(EnumSet.of(cdv.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.V()) {
            return false;
         } else if (this.a.bj()) {
            return false;
         } else {
            fdw $$0 = this.h();
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
      private fdw h() {
         azt $$0 = this.a.dY();
         iu $$1 = this.a.dv();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            iu $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dlw.J)) {
               return fdw.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends ccy {
      private final cnh l;

      public d(cnh $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bwz $$0 = this.l.f();
         if (this.l.gx() && this.l.bj()) {
            if ($$0 != null && $$0.dC() > this.l.dC() || this.l.bI) {
               this.l.i(this.l.dy().b(0.0, 0.002, 0.0));
            }

            if (this.k != ccy.a.b || this.l.O().k()) {
               this.l.B(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dA();
            double $$2 = this.f - this.l.dC();
            double $$3 = this.g - this.l.dG();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azk.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.w(this.b(this.l.dL(), $$5, 90.0F));
            this.l.aV = this.l.dL();
            float $$6 = (float)(this.h * this.l.h(byf.v));
            float $$7 = azk.h(0.125F, this.l.fn(), $$6);
            this.l.B($$7);
            this.l.i(this.l.dy().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aJ()) {
               this.l.i(this.l.dy().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends cdv {
      private final cnh a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cnh $$0, double $$1, int $$2) {
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
            fdw $$0 = chs.a(this.a, 4, 8, new fdw(this.a.dA(), (double)(this.c - 1), this.a.dG()), (float) (Math.PI / 2));
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

   static class f extends ceu {
      private final cnh a;

      public f(cnx $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cnh)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fa().a(cyw.wW);
      }

      @Override
      public void d() {
         super.d();
         this.a.v(true);
         this.a.c(btx.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fE();
         this.a.v(false);
      }
   }
}
