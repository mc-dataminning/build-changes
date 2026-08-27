import java.util.EnumSet;
import javax.annotation.Nullable;

public class ccc extends cdh implements ccs {
   public static final float b = 0.03F;
   boolean bX;
   protected final bvw c;
   protected final bvt d;

   public ccc(bly<? extends ccc> $$0, cto $$1) {
      super($$0, $$1);
      this.t(1.0F);
      this.bL = new ccc.d(this);
      this.a(efb.j, 0.0F);
      this.c = new bvw(this, $$1);
      this.d = new bvt(this, $$1);
   }

   @Override
   protected void u() {
      this.bO.a(1, new ccc.c(this, 1.0));
      this.bO.a(2, new ccc.f(this, 1.0, 40, 10.0F));
      this.bO.a(2, new ccc.a(this, 1.0, false));
      this.bO.a(5, new ccc.b(this, 1.0));
      this.bO.a(6, new ccc.e(this, 1.0, this.dM().A_()));
      this.bO.a(7, new bud(this, 1.0));
      this.bP.a(1, new buy(this, ccc.class).a(cdj.class));
      this.bP.a(2, new buz<>(this, cfh.class, 10, true, false, this::j));
      this.bP.a(3, new buz<>(this, cep.class, false));
      this.bP.a(3, new buz<>(this, byj.class, true));
      this.bP.a(3, new buz<>(this, bze.class, true, false));
      this.bP.a(5, new buz<>(this, byy.class, 10, true, false, byy.bU));
   }

   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(blz.b).b() && $$0.F_().i() < 0.03F) {
         this.a(blz.b, new cmx(cna.vK));
         this.e(blz.b);
      }

      return $$3;
   }

   public static boolean a(bly<ccc> $$0, cud $$1, bmo $$2, hx $$3, auu $$4) {
      if (!$$1.b_($$3.d()).a(asl.a) && !bmo.a($$2)) {
         return false;
      } else {
         ih<cun> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != bjx.a && (bmo.b($$2) || a($$1, $$3, $$4)) && (bmo.a($$2) || $$1.b_($$3).a(asl.a));
         if ($$6 && bmo.a($$2)) {
            return true;
         } else {
            return $$5.a(asf.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(ctp $$0, hx $$1) {
      return $$1.v() < $$0.A_() - 5;
   }

   @Override
   protected boolean w() {
      return false;
   }

   @Override
   protected arq y() {
      return this.aZ() ? arr.ha : arr.gZ;
   }

   @Override
   protected arq d(bks $$0) {
      return this.aZ() ? arr.he : arr.hd;
   }

   @Override
   protected arq n_() {
      return this.aZ() ? arr.hc : arr.hb;
   }

   @Override
   protected arq A() {
      return arr.hg;
   }

   @Override
   protected arq aN() {
      return arr.hh;
   }

   @Override
   protected cmx ge() {
      return cmx.f;
   }

   @Override
   protected void a(auu $$0, bjy $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(blz.a, new cmx(cna.vI));
         } else {
            this.a(blz.a, new cmx(cna.qS));
         }
      }
   }

   @Override
   protected boolean b(cmx $$0, cmx $$1) {
      if ($$1.a(cna.vK)) {
         return false;
      } else if ($$1.a(cna.vI)) {
         return $$0.a(cna.vI) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(cna.vI) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   public boolean a(ctr $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bmk $$0) {
      return $$0 != null ? !this.dM().P() || $$0.aZ() : false;
   }

   @Override
   public boolean cz() {
      return !this.bZ();
   }

   boolean go() {
      if (this.bX) {
         return true;
      } else {
         bmk $$0 = this.q();
         return $$0 != null && $$0.aZ();
      }
   }

   @Override
   public void a(els $$0) {
      if (this.cX() && this.aZ() && this.go()) {
         this.a(0.01F, $$0);
         this.a(bmq.a, this.dp());
         this.g(this.dp().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bf() {
      if (!this.dM().B) {
         if (this.cY() && this.aZ() && this.go()) {
            this.bN = this.c;
            this.h(true);
         } else {
            this.bN = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean ca() {
      return this.bZ();
   }

   protected boolean gg() {
      eff $$0 = this.N().j();
      if ($$0 != null) {
         hx $$1 = $$0.l();
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
   public void a(bmk $$0, float $$1) {
      cgl $$2 = new cgl(this.dM(), this, new cmx(cna.vI));
      double $$3 = $$0.dr() - this.dr();
      double $$4 = $$0.e(0.3333333333333333) - $$2.dt();
      double $$5 = $$0.dx() - this.dx();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dM().ak().a() * 4));
      this.a(arr.hf, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends buv {
      private final ccc b;

      public a(ccc $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b.j(this.b.q());
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.q());
      }
   }

   static class b extends btt {
      private final ccc g;

      public b(ccc $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dM().P() && this.g.aZ() && this.g.dt() >= (double)(this.g.dM().A_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(ctr $$0, hx $$1) {
         hx $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bN = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends btg {
      private final bmt a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final cto f;

      public c(bmt $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dM();
         this.a(EnumSet.of(btg.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.P()) {
            return false;
         } else if (this.a.aZ()) {
            return false;
         } else {
            els $$0 = this.h();
            if ($$0 == null) {
               return false;
            } else {
               this.b = $$0.c;
               this.c = $$0.d;
               this.d = $$0.e;
               return true;
            }
         }
      }

      @Override
      public boolean b() {
         return !this.a.N().l();
      }

      @Override
      public void c() {
         this.a.N().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private els h() {
         auu $$0 = this.a.eg();
         hx $$1 = this.a.dm();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            hx $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(cwr.G)) {
               return els.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bsj {
      private final ccc l;

      public d(ccc $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bmk $$0 = this.l.q();
         if (this.l.go() && this.l.aZ()) {
            if ($$0 != null && $$0.dt() > this.l.dt() || this.l.bX) {
               this.l.g(this.l.dp().b(0.0, 0.002, 0.0));
            }

            if (this.k != bsj.a.b || this.l.N().l()) {
               this.l.w(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dr();
            double $$2 = this.f - this.l.dt();
            double $$3 = this.g - this.l.dx();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(aun.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dC(), $$5, 90.0F));
            this.l.aU = this.l.dC();
            float $$6 = (float)(this.h * this.l.b(bnq.m));
            float $$7 = aun.i(0.125F, this.l.ff(), $$6);
            this.l.w($$7);
            this.l.g(this.l.dp().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aC()) {
               this.l.g(this.l.dp().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends btg {
      private final ccc a;
      private final double b;
      private final int c;
      private boolean d;

      public e(ccc $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dM().P() && this.a.aZ() && this.a.dt() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.dt() < (double)(this.c - 1) && (this.a.N().l() || this.a.gg())) {
            els $$0 = bxc.a(this.a, 4, 8, new els(this.a.dr(), (double)(this.c - 1), this.a.dx()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.N().a($$0.c, $$0.d, $$0.e, this.b);
         }
      }

      @Override
      public void c() {
         this.a.w(true);
         this.d = false;
      }

      @Override
      public void d() {
         this.a.w(false);
      }
   }

   static class f extends buf {
      private final ccc a;

      public f(ccs $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (ccc)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eT().a(cna.vI);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bjz.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.ft();
         this.a.v(false);
      }
   }
}
