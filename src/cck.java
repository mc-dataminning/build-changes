import java.util.EnumSet;
import javax.annotation.Nullable;

public class cck extends cdp implements cda {
   public static final float b = 0.03F;
   boolean bX;
   protected final bwa c;
   protected final bvx d;

   public cck(bmc<? extends cck> $$0, ctx $$1) {
      super($$0, $$1);
      this.bM = new cck.d(this);
      this.a(efk.j, 0.0F);
      this.c = new bwa(this, $$1);
      this.d = new bvx(this, $$1);
   }

   public static bnt.a u() {
      return cdp.gj().a(bnu.r, 1.0);
   }

   @Override
   protected void w() {
      this.bP.a(1, new cck.c(this, 1.0));
      this.bP.a(2, new cck.f(this, 1.0, 40, 10.0F));
      this.bP.a(2, new cck.a(this, 1.0, false));
      this.bP.a(5, new cck.b(this, 1.0));
      this.bP.a(6, new cck.e(this, 1.0, this.dL().A_()));
      this.bP.a(7, new buh(this, 1.0));
      this.bQ.a(1, new bvc(this, cck.class).a(cdr.class));
      this.bQ.a(2, new bvd<>(this, cfq.class, 10, true, false, this::j));
      this.bQ.a(3, new bvd<>(this, cey.class, false));
      this.bQ.a(3, new bvd<>(this, byo.class, true));
      this.bQ.a(3, new bvd<>(this, bzm.class, true, false));
      this.bQ.a(5, new bvd<>(this, bzd.class, 10, true, false, bzd.bV));
   }

   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if (this.c(bmd.b).b() && $$0.F_().i() < 0.03F) {
         this.a(bmd.b, new cng(cnj.vN));
         this.e(bmd.b);
      }

      return $$3;
   }

   public static boolean a(bmc<cck> $$0, cum $$1, bms $$2, hx $$3, auw $$4) {
      if (!$$1.b_($$3.d()).a(asn.a) && !bms.a($$2)) {
         return false;
      } else {
         ih<cuw> $$5 = $$1.t($$3);
         boolean $$6 = $$1.ak() != bjz.a && (bms.b($$2) || a($$1, $$3, $$4)) && (bms.a($$2) || $$1.b_($$3).a(asn.a));
         if ($$6 && bms.a($$2)) {
            return true;
         } else {
            return $$5.a(ash.ap) ? $$4.a(15) == 0 && $$6 : $$4.a(40) == 0 && a($$1, $$3) && $$6;
         }
      }
   }

   private static boolean a(cty $$0, hx $$1) {
      return $$1.v() < $$0.A_() - 5;
   }

   @Override
   protected boolean A() {
      return false;
   }

   @Override
   protected ars y() {
      return this.aZ() ? art.hp : art.ho;
   }

   @Override
   protected ars d(bkv $$0) {
      return this.aZ() ? art.ht : art.hs;
   }

   @Override
   protected ars n_() {
      return this.aZ() ? art.hr : art.hq;
   }

   @Override
   protected ars gf() {
      return art.hv;
   }

   @Override
   protected ars aN() {
      return art.hw;
   }

   @Override
   protected cng gg() {
      return cng.f;
   }

   @Override
   protected void a(auw $$0, bka $$1) {
      if ((double)$$0.i() > 0.9) {
         int $$2 = $$0.a(16);
         if ($$2 < 10) {
            this.a(bmd.a, new cng(cnj.vL));
         } else {
            this.a(bmd.a, new cng(cnj.qU));
         }
      }
   }

   @Override
   protected boolean b(cng $$0, cng $$1) {
      if ($$1.a(cnj.vN)) {
         return false;
      } else if ($$1.a(cnj.vL)) {
         return $$0.a(cnj.vL) ? $$0.k() < $$1.k() : false;
      } else {
         return $$0.a(cnj.vL) ? true : super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gh() {
      return false;
   }

   @Override
   public boolean a(cua $$0) {
      return $$0.f(this);
   }

   public boolean j(@Nullable bmo $$0) {
      return $$0 != null ? !this.dL().P() || $$0.aZ() : false;
   }

   @Override
   public boolean cz() {
      return !this.bZ();
   }

   boolean gp() {
      if (this.bX) {
         return true;
      } else {
         bmo $$0 = this.q();
         return $$0 != null && $$0.aZ();
      }
   }

   @Override
   public void a(emc $$0) {
      if (this.cX() && this.aZ() && this.gp()) {
         this.a(0.01F, $$0);
         this.a(bmu.a, this.do());
         this.g(this.do().a(0.9));
      } else {
         super.a($$0);
      }
   }

   @Override
   public void bf() {
      if (!this.dL().B) {
         if (this.cY() && this.aZ() && this.gp()) {
            this.bO = this.c;
            this.h(true);
         } else {
            this.bO = this.d;
            this.h(false);
         }
      }
   }

   @Override
   public boolean ca() {
      return this.bZ();
   }

   protected boolean gi() {
      efo $$0 = this.N().j();
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
   public void a(bmo $$0, float $$1) {
      cgu $$2 = new cgu(this.dL(), this, new cng(cnj.vL));
      double $$3 = $$0.dq() - this.dq();
      double $$4 = $$0.e(0.3333333333333333) - $$2.ds();
      double $$5 = $$0.dw() - this.dw();
      double $$6 = Math.sqrt($$3 * $$3 + $$5 * $$5);
      $$2.c($$3, $$4 + $$6 * 0.2F, $$5, 1.6F, (float)(14 - this.dL().ak().a() * 4));
      this.a(art.hu, 1.0F, 1.0F / (this.eg().i() * 0.4F + 0.8F));
      this.dL().b($$2);
   }

   public void w(boolean $$0) {
      this.bX = $$0;
   }

   static class a extends buz {
      private final cck b;

      public a(cck $$0, double $$1, boolean $$2) {
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

   static class b extends btx {
      private final cck g;

      public b(cck $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.g.dL().P() && this.g.aZ() && this.g.ds() >= (double)(this.g.dL().A_() - 3);
      }

      @Override
      public boolean b() {
         return super.b();
      }

      @Override
      protected boolean a(cua $$0, hx $$1) {
         hx $$2 = $$1.c();
         return $$0.u($$2) && $$0.u($$2.c()) ? $$0.a_($$1).a($$0, $$1, this.g) : false;
      }

      @Override
      public void c() {
         this.g.w(false);
         this.g.bO = this.g.d;
         super.c();
      }

      @Override
      public void d() {
         super.d();
      }
   }

   static class c extends btk {
      private final bmx a;
      private double b;
      private double c;
      private double d;
      private final double e;
      private final ctx f;

      public c(bmx $$0, double $$1) {
         this.a = $$0;
         this.e = $$1;
         this.f = $$0.dL();
         this.a(EnumSet.of(btk.a.a));
      }

      @Override
      public boolean a() {
         if (!this.f.P()) {
            return false;
         } else if (this.a.aZ()) {
            return false;
         } else {
            emc $$0 = this.h();
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
      private emc h() {
         auw $$0 = this.a.eg();
         hx $$1 = this.a.dl();

         for (int $$2 = 0; $$2 < 10; $$2++) {
            hx $$3 = $$1.b($$0.a(20) - 10, 2 - $$0.a(8), $$0.a(20) - 10);
            if (this.f.a_($$3).a(cxa.G)) {
               return emc.c($$3);
            }
         }

         return null;
      }
   }

   static class d extends bsn {
      private final cck l;

      public d(cck $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         bmo $$0 = this.l.q();
         if (this.l.gp() && this.l.aZ()) {
            if ($$0 != null && $$0.ds() > this.l.ds() || this.l.bX) {
               this.l.g(this.l.do().b(0.0, 0.002, 0.0));
            }

            if (this.k != bsn.a.b || this.l.N().l()) {
               this.l.v(0.0F);
               return;
            }

            double $$1 = this.e - this.l.dq();
            double $$2 = this.f - this.l.ds();
            double $$3 = this.g - this.l.dw();
            double $$4 = Math.sqrt($$1 * $$1 + $$2 * $$2 + $$3 * $$3);
            $$2 /= $$4;
            float $$5 = (float)(aup.d($$3, $$1) * 180.0F / (float)Math.PI) - 90.0F;
            this.l.r(this.a(this.l.dB(), $$5, 90.0F));
            this.l.aU = this.l.dB();
            float $$6 = (float)(this.h * this.l.g(bnu.o));
            float $$7 = aup.i(0.125F, this.l.ff(), $$6);
            this.l.v($$7);
            this.l.g(this.l.do().b((double)$$7 * $$1 * 0.005, (double)$$7 * $$2 * 0.1, (double)$$7 * $$3 * 0.005));
         } else {
            if (!this.l.aC()) {
               this.l.g(this.l.do().b(0.0, -0.008, 0.0));
            }

            super.a();
         }
      }
   }

   static class e extends btk {
      private final cck a;
      private final double b;
      private final int c;
      private boolean d;

      public e(cck $$0, double $$1, int $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean a() {
         return !this.a.dL().P() && this.a.aZ() && this.a.ds() < (double)(this.c - 2);
      }

      @Override
      public boolean b() {
         return this.a() && !this.d;
      }

      @Override
      public void e() {
         if (this.a.ds() < (double)(this.c - 1) && (this.a.N().l() || this.a.gi())) {
            emc $$0 = bxh.a(this.a, 4, 8, new emc(this.a.dq(), (double)(this.c - 1), this.a.dw()), (float) (Math.PI / 2));
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

   static class f extends buj {
      private final cck a;

      public f(cda $$0, double $$1, int $$2, float $$3) {
         super($$0, $$1, $$2, $$3);
         this.a = (cck)$$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.a.eT().a(cnj.vL);
      }

      @Override
      public void c() {
         super.c();
         this.a.v(true);
         this.a.c(bkb.a);
      }

      @Override
      public void d() {
         super.d();
         this.a.ft();
         this.a.v(false);
      }
   }
}
