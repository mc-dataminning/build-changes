import java.util.EnumSet;
import javax.annotation.Nullable;

public class clj extends cmo implements clz {
   public static final float b = 0.03F;
   boolean cb;
   protected final ces c;
   protected final cep d;

   public clj(bup<? extends clj> $$0, dff $$1) {
      super($$0, $$1);
      this.bP = new clj.d(this);
      this.a(esf.j, 0.0F);
      this.c = new ces(this, $$1);
      this.d = new cep(this, $$1);
   }

   public static bwl.a q() {
      return cmo.gy().a(bwm.B, 1.0);
   }

   @Override
   protected void t() {
      this.bS.a(1, new clj.c(this, 1.0));
      this.bS.a(2, new clj.f(this, 1.0, 40, 10.0F));
      this.bS.a(2, new clj.a(this, 1.0, false));
      this.bS.a(5, new clj.b(this, 1.0));
      this.bS.a(6, new clj.e(this, 1.0, this.dY().N()));
      this.bS.a(7, new ccz(this, 1.0));
      this.bT.a(1, new cdu(this, clj.class).a(cmq.class));
      this.bT.a(2, new cdv<>(this, cor.class, 10, true, false, this::j));
      this.bT.a(3, new cdv<>(this, cnx.class, false));
      this.bT.a(3, new cdv<>(this, chh.class, true));
      this.bT.a(3, new cdv<>(this, cih.class, true, false));
      this.bT.a(5, new cdv<>(this, chw.class, 10, true, false, chw.bY));
   }

   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      if (this.a(buq.b).f() && $$0.E_().i() < 0.03F) {
         this.a(buq.b, new cwf(cwj.wl));
         this.g(buq.b);
      }

      return $$3;
   }

   public static boolean a(bup<clj> $$0, dfw $$1, buo $$2, jh $$3, azv $$4) {
      if (!$$1.b_($$3.e()).a(axj.a) && !buo.a($$2)) {
         return false;
      } else {
         jq<dgh> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != bse.a && (buo.b($$2) || a($$1, $$3, $$4)) && (buo.a($$2) || $$1.b_($$3).a(axj.a));
         if ($$6 && buo.a($$2)) {
            return true;
         } else {
            return $$5.a(axc.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(dfg $$0, jh $$1) {
      return $$1.v() < $$0.N() - 5;
   }

   @Override
   protected awn w() {
      return this.bl() ? awo.hF : awo.hE;
   }

   @Override
   protected awn d(bsy $$0) {
      return this.bl() ? awo.hJ : awo.hI;
   }

   @Override
   protected awn o_() {
      return this.bl() ? awo.hH : awo.hG;
   }

   @Override
   protected awn y() {
      return awo.hL;
   }

   @Override
   protected awn aX() {
      return awo.hM;
   }

   @Override
   protected cwf gv() {
      return cwf.k;
   }

   @Override
   protected void a(azv $$0, bsf $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(buq.a, new cwf(cwj.wk));
         } else {
            this.a(buq.a, new cwf(cwj.rm));
         }
      }
   }

   @Override
   protected boolean a(cwf $$0, cwf $$1, buq $$2) {
      if ($$1.a(cwj.wl)) {
         return false;
      } else if ($$1.a(cwj.wk)) {
         return $$0.a(cwj.wk) ? $$0.o() < $$1.o() : false;
      } else {
         return $$0.a(cwj.wk) ? true : super.a($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   public boolean a(dfi $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bve $$0) {
      return $$0 != null ? !this.dY().S() || $$0.bl() : false;
   }

   @Override
   public boolean cL() {
      return !this.cm();
   }

   boolean gE() {
      if (this.cb) {
         return true;
      } else {
         bve $$0 = this.m();
         return $$0 != null && $$0.bl();
      }
   }

   @Override
   public void a_(ezr $$0) {
      if (this.dk() && this.bq() && this.gE()) {
         this.a(0.01F, $$0);
         this.a(bvi.a, this.dB());
         this.h(this.dB().c(0.9));
      } else {
         super.a_($$0);
      }
   }

   @Override
   public void br() {
      if (!this.dY().C) {
         if (this.dl() && this.bq() && this.gE()) {
            this.bR = this.c;
            this.i(true);
         } else {
            this.bR = this.d;
            this.i(false);
         }
      }
   }

   @Override
   public boolean cn() {
      return this.cm();
   }

   protected boolean gx() {
      esc $$0 = this.P().k();
      if ($$0 != null) {
         jh $$1 = $$0.l();
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
   public void a(bve $$0, float $$1) {
      cwf $$2 = this.fc();
      cwf $$3 = $$2.a(cwj.wk) ? $$2 : new cwf(cwj.wk);
      cpx $$4 = new cpx(this.dY(), this, $$3);
      double $$5 = $$0.dD() - this.dD();
      double $$6 = $$0.e(0.3333333333333333) - $$4.dF();
      double $$7 = $$0.dJ() - this.dJ();
      double $$8 = Math.sqrt($$5 * $$5 + $$7 * $$7);
      if (this.dY() instanceof arq $$9) {
         cpk.a($$4, $$9, $$3, $$5, $$6 + $$8 * 0.2F, $$7, 1.6F, (float)(14 - this.dY().ak().a() * 4));
      }

      this.a(awo.hK, 1.0F, 1.0F / (this.eb().i() * 0.4F + 0.8F));
   }

   public void x(boolean $$0) {
      this.cb = $$0;
   }

   static class a extends cdr {
      private final clj b;

      public a(clj $$0, double $$1, boolean $$2) {
         super($$0, $$1, $$2);
         this.b = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.b.j(this.b.m());
      }

      @Override
      public boolean c() {
         return super.c() && this.b.j(this.b.m());
      }
   }

   static class b extends ccp {
      private final clj g;

      public b(clj $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         return super.b() && !this.g.dY().S() && this.g.bl() && this.g.dF() >= (double)(this.g.dY().N() - 3);
      }

      @Override
      public boolean c() {
         return super.c();
      }

      @Override
      protected boolean a(dfi $$0, jh $$1) {
         jh $$2 = $$1.d();
         return $$0.u($$2) && $$0.u($$2.d()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void d() {
         this.g.x(false);
         this.g.bR = this.g.d;
         super.d();
      }

      @Override
      public void e() {
         super.e();
      }
   }

   static class c extends ccc {
      private final bvm a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final dff f;

      public c(bvm $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dY();
         this.a(EnumSet.of(ccc.a.a));
      }

      @Override
      public boolean b() {
         if (!this.f.S()) {
            return false;
         } else if (this.a.bl()) {
            return false;
         } else {
            ezr $$0 = this.h();
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
         return !this.a.P().m();
      }

      @Override
      public void d() {
         this.a.P().a(this.b, this.c, this.d, this.e);
      }

      @Nullable
      private ezr h() {
         azv $$0 = this.a.eb();
         jh $$1 = this.a.dy();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            jh $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(dil.G)) {
               return ezr.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends cbf {
      private final clj l;

      public d(clj $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bve $$0 = this.l.m();
         if (this.l.gE() && this.l.bl()) {
            if ($$0 != null && $$0.dF() > this.l.dF() || this.l.cb) {
               this.l.h(this.l.dB().b(0.0, 0.002, 0.0));
            }

            if (this.k != cbf.a.b || this.l.P().m()) {
               this.l.C(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dD();
            double $$2 = this.f - this.l.dF();
            double $$3 = this.g - this.l.dJ();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(azn.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.v(this.b(this.l.dO(), $$5, 90.0F));
            this.l.aX = this.l.dO();
            float $$6 = (float)(this.h * this.l.h(bwm.v));
            float $$7 = azn.h(0.125F, this.l.fs(), $$6);
            this.l.C($$7);
            this.l.h(this.l.dB().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aL()) {
               this.l.h(this.l.dB().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends ccc {
      private final clj a;
      private final double b;
      private final int c;
      private boolean d;

      public e(clj $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean b() {
         return !this.a.dY().S() && this.a.bl() && this.a.dF() < (double)(this.c - 2);
      }

      @Override
      public boolean c() {
         return this.b() && !this.d;
      }

      @Override
      public void a() {
         if (this.a.dF() < (double)(this.c - 1) && (this.a.P().m() || this.a.gx())) {
            ezr $$0 = cfz.a(this.a, 4, 8, new ezr(this.a.dD(), (double)(this.c - 1), this.a.dJ()), (float) (Math.PI / 2));
            if ($$0 == null) {
               this.d = true;
               return;
            }

            this.a.P().a($$0.d, $$0.e, $$0.f, this.b);
         }
      }

      @Override
      public void d() {
         this.a.x(true);
         this.d = false;
      }

      @Override
      public void e() {
         this.a.x(false);
      }
   }

   static class f extends cdb {
      private final clj a;

      public f(clz $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (clj)$$0;
      }

      @Override
      public boolean b() {
         return super.b() && this.a.fc().a(cwj.wk);
      }

      @Override
      public void d() {
         super.d();
         this.a.w(true);
         this.a.c(bsg.a);
      }

      @Override
      public void e() {
         super.e();
         this.a.fI();
         this.a.w(false);
      }
   }
}
