import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cik extends cig implements bvm<cik.d>, clh {
   private static final int bY = 5;
   private static final akh<Integer> bZ = akl.a(cik.class, akj.b);
   private static final akh<Integer> ca = akl.a(cik.class, akj.b);
   private static final btu cc = bty.an.n().a(btt.a().a(bts.a, 0.0F, bty.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cd;
   @Nullable
   private cik ce;
   @Nullable
   private cik cf;

   public cik(bty<? extends cik> $$0, dej $$1) {
      super($$0, $$1);
      this.P().a(40.0F);
   }

   public boolean gr() {
      return false;
   }

   private void x(int $$0) {
      this.am.a(bZ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azn $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gs() {
      return this.am.a(bZ);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB().g);
      $$0.a("Strength", this.gs());
   }

   @Override
   public void a(ug $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cik.d.a($$0.h("Variant")));
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbe(this));
      this.bS.a(1, new cco(this, 1.2));
      this.bS.a(2, new cbr(this, 2.1F));
      this.bS.a(3, new ccj(this, 1.25, 40, 20.0F));
      this.bS.a(3, new ccd(this, 1.2));
      this.bS.a(4, new caw(this, 1.0));
      this.bS.a(5, new ccs(this, 1.25, $$0 -> $$0.a(axe.ao), false));
      this.bS.a(6, new cbj(this, 1.0));
      this.bS.a(7, new ccx(this, 0.7));
      this.bS.a(8, new cbs(this, cnx.class, 6.0F));
      this.bS.a(9, new ccf(this));
      this.bT.a(1, new cik.c(this));
      this.bT.a(2, new cik.a(this));
   }

   public static bvt.a gA() {
      return q();
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
      $$0.a(ca, 0);
   }

   public cik.d gB() {
      return cik.d.a(this.am.a(ca));
   }

   public void a(cik.d $$0) {
      this.am.a(ca, $$0.g);
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.an);
   }

   @Override
   protected boolean a(cnx $$0, cvs $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cvw.px)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dho.ij.q())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gF() && this.g() == 0 && this.gv()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eB() < this.eQ() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.p_() && $$2 > 0) {
         this.dS().a(lo.O, this.d(1.0), this.dA() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dS().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gF()) && this.gL() < this.gR()) {
         $$5 = true;
         if (!this.dS().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.ba()) {
         awf $$6 = this.gq();
         if ($$6 != null) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), this.gq(), this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean ff() {
      return this.eC() || this.gI();
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      azn $$4 = $$0.D_();
      this.b($$4);
      cik.d $$5;
      if ($$3 instanceof cik.b) {
         $$5 = ((cik.b)$$3).a;
      } else {
         $$5 = ad.a(cik.d.values(), $$4);
         $$3 = new cik.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected awf gP() {
      return awg.oa;
   }

   @Override
   protected awf w() {
      return awg.nZ;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.oe;
   }

   @Override
   protected awf o_() {
      return awg.oc;
   }

   @Nullable
   @Override
   protected awf gq() {
      return awg.od;
   }

   @Override
   protected void b(jf $$0, dus $$1) {
      this.a(awg.og, 0.15F, 1.0F);
   }

   @Override
   protected void y() {
      this.a(awg.ob, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.t() ? this.gs() : 0;
   }

   @Override
   public boolean e(btz $$0) {
      return true;
   }

   @Override
   public boolean k(cvs $$0) {
      return $$0.a(axe.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Nullable
   private static cum m(cvs $$0) {
      dhm $$1 = dhm.a($$0.h());
      return $$1 instanceof dri ? ((dri)$$1).b() : null;
   }

   @Nullable
   public cum gC() {
      return m(this.a(btz.g));
   }

   @Override
   public int gR() {
      return 30;
   }

   @Override
   public boolean a(cgd $$0) {
      return $$0 != this && $$0 instanceof cik && this.gY() && ((cik)$$0).gY();
   }

   @Nullable
   public cik b(arj $$0, btk $$1) {
      cik $$2 = this.gD();
      if ($$2 != null) {
         this.a($$1, $$2);
         cik $$3 = (cik)$$1;
         int $$4 = this.af.a(Math.max(this.gs(), $$3.gs())) + 1;
         if (this.af.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.af.h() ? this.gB() : $$3.gB());
      }

      return $$2;
   }

   @Nullable
   protected cik gD() {
      return bty.an.a(this.dS(), btx.e);
   }

   private void k(bun $$0) {
      coq $$1 = new coq(this.dS(), this);
      double $$2 = $$0.dx() - this.dx();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dz();
      double $$4 = $$0.dD() - this.dD();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dS() instanceof arj $$6) {
         cor.a($$1, $$6, cvs.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.ba()) {
         this.dS().a(null, this.dx(), this.dz(), this.dD(), awg.of, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
      }

      this.cd = true;
   }

   void E(boolean $$0) {
      this.cd = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bsj $$2) {
      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bX()) {
               for (btr $$4 : this.da()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eM();
         return true;
      }
   }

   public void gE() {
      if (this.ce != null) {
         this.ce.cf = null;
      }

      this.ce = null;
   }

   public void a(cik $$0) {
      this.ce = $$0;
      this.ce.cf = this;
   }

   public boolean hb() {
      return this.cf != null;
   }

   public boolean hc() {
      return this.ce != null;
   }

   @Nullable
   public cik hd() {
      return this.ce;
   }

   @Override
   protected double gn() {
      return 2.0;
   }

   @Override
   protected void gS() {
      if (!this.hc() && this.p_()) {
         super.gS();
      }
   }

   @Override
   public boolean gT() {
      return false;
   }

   @Override
   public void a(bun $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, 0.75 * (double)this.cP(), (double)this.dn() * 0.5);
   }

   @Override
   public btu e(buz $$0) {
      return this.p_() ? cc : super.e($$0);
   }

   @Override
   protected eyw a(btr $$0, btu $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cdd<chg> {
      public a(cik $$0) {
         super($$0, chg.class, 16, false, true, $$0x -> !((chg)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends btk.a {
      public final cik.d a;

      b(cik.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cdc {
      public c(cik $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cik $$0 && $$0.cd) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bab {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cik.d> e = bab.a(cik.d::values);
      private static final IntFunction<cik.d> f = axw.a(cik.d::a, values(), axw.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cik.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
