import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjd extends ciz implements bwf<cjd.d>, cma {
   private static final int bY = 5;
   private static final ajx<Integer> bZ = akb.a(cjd.class, ajz.b);
   private static final ajx<Integer> ca = akb.a(cjd.class, ajz.b);
   private static final bum cc = buq.ax.n().a(bul.a().a(buk.a, 0.0F, buq.ax.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cd;
   @Nullable
   private cjd ce;
   @Nullable
   private cjd cf;

   public cjd(buq<? extends cjd> $$0, dgg $$1) {
      super($$0, $$1);
      this.L().a(40.0F);
   }

   public boolean gs() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bZ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azg $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gt() {
      return this.al.a(bZ);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Variant", this.gC().g);
      $$0.a("Strength", this.gt());
   }

   @Override
   public void a(tq $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cjd.d.a($$0.h("Variant")));
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbx(this));
      this.bS.a(1, new cdh(this, 1.2));
      this.bS.a(2, new cck(this, 2.1F));
      this.bS.a(3, new cdc(this, 1.25, 40, 20.0F));
      this.bS.a(3, new ccw(this, 1.2));
      this.bS.a(4, new cbp(this, 1.0));
      this.bS.a(5, new cdl(this, 1.25, $$0 -> $$0.a(awx.ar), false));
      this.bS.a(6, new ccc(this, 1.0));
      this.bS.a(7, new cdq(this, 0.7));
      this.bS.a(8, new ccl(this, cov.class, 6.0F));
      this.bS.a(9, new ccy(this));
      this.bT.a(1, new cjd.c(this));
      this.bT.a(2, new cjd.a(this));
   }

   public static bwm.a gB() {
      return p();
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
      $$0.a(ca, 0);
   }

   public cjd.d gC() {
      return cjd.d.a(this.al.a(ca));
   }

   public void a(cjd.d $$0) {
      this.al.a(ca, $$0.g);
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.aq);
   }

   @Override
   protected boolean a(cov $$0, cwn $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cwr.qb)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(djm.iH.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gG() && this.Y_() == 0 && this.gw()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eE() < this.eS() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.e_() && $$2 > 0) {
         this.dW().a(lt.P, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dW().C) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gG()) && this.gM() < this.gS()) {
         $$5 = true;
         if (!this.dW().C) {
            this.u($$3);
         }
      }

      if ($$5 && !this.bb()) {
         avy $$6 = this.gr();
         if ($$6 != null) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), this.gr(), this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fi() {
      return this.eF() || this.gJ();
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      azg $$4 = $$0.H_();
      this.b($$4);
      cjd.d $$5;
      if ($$3 instanceof cjd.b) {
         $$5 = ((cjd.b)$$3).a;
      } else {
         $$5 = af.a(cjd.d.values(), $$4);
         $$3 = new cjd.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   protected avy gQ() {
      return avz.ox;
   }

   @Override
   protected avy u() {
      return avz.ow;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.oB;
   }

   @Override
   protected avy o_() {
      return avz.oz;
   }

   @Nullable
   @Override
   protected avy gr() {
      return avz.oA;
   }

   @Override
   protected void b(ji $$0, dwv $$1) {
      this.a(avz.oD, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(avz.oy, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.t() ? this.gt() : 0;
   }

   @Override
   public boolean e(bur $$0) {
      return true;
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public int gS() {
      return 30;
   }

   @Override
   public boolean a(cgw $$0) {
      return $$0 != this && $$0 instanceof cjd && this.gY() && ((cjd)$$0).gY();
   }

   @Nullable
   public cjd b(arc $$0, bua $$1) {
      cjd $$2 = this.gD();
      if ($$2 != null) {
         this.a($$1, $$2);
         cjd $$3 = (cjd)$$1;
         int $$4 = this.ae.a(Math.max(this.gt(), $$3.gt())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gC() : $$3.gC());
      }

      return $$2;
   }

   @Nullable
   protected cjd gD() {
      return buq.ax.a(this.dW(), bup.e);
   }

   private void k(bvf $$0) {
      cpn $$1 = new cpn(this.dW(), this);
      double $$2 = $$0.dB() - this.dB();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dD();
      double $$4 = $$0.dH() - this.dH();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dW() instanceof arc $$6) {
         cpo.a($$1, $$6, cwn.j, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dW().a(null, this.dB(), this.dD(), this.dH(), avz.oC, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.cd = true;
   }

   void E(boolean $$0) {
      this.cd = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bsz $$2) {
      int $$3 = this.f($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.ca()) {
               for (buj $$4 : this.dd()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eO();
         return true;
      }
   }

   public void gE() {
      if (this.ce != null) {
         this.ce.cf = null;
      }

      this.ce = null;
   }

   public void a(cjd $$0) {
      this.ce = $$0;
      this.ce.cf = this;
   }

   public boolean gF() {
      return this.cf != null;
   }

   public boolean hb() {
      return this.ce != null;
   }

   @Nullable
   public cjd hc() {
      return this.ce;
   }

   @Override
   protected double go() {
      return 2.0;
   }

   @Override
   protected void g(arc $$0) {
      if (!this.hb() && this.e_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gT() {
      return false;
   }

   @Override
   public void a(bvf $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public fay cT() {
      return new fay(0.0, 0.75 * (double)this.cS(), (double)this.dr() * 0.5);
   }

   @Override
   public bum e(bvr $$0) {
      return this.e_() ? cc : super.e($$0);
   }

   @Override
   protected fay a(buj $$0, bum $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cdw<chz> {
      public a(cjd $$0) {
         super($$0, chz.class, 16, false, true, ($$0x, $$1) -> !((chz)$$0x).p());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bua.a {
      public final cjd.d a;

      b(cjd.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cdv {
      public c(cjd $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cjd $$0 && $$0.cd) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements azu {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cjd.d> e = azu.a(cjd.d::values);
      private static final IntFunction<cjd.d> f = axp.a(cjd.d::a, values(), axp.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cjd.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
