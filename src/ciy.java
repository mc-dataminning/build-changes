import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ciy extends ciu implements bwa<ciy.d>, clv {
   private static final int bY = 5;
   private static final akl<Integer> bZ = akp.a(ciy.class, akn.b);
   private static final akl<Integer> ca = akp.a(ciy.class, akn.b);
   private static final buh cc = bul.an.n().a(bug.a().a(buf.a, 0.0F, bul.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cd;
   @Nullable
   private ciy ce;
   @Nullable
   private ciy cf;

   public ciy(bul<? extends ciy> $$0, dfb $$1) {
      super($$0, $$1);
      this.P().a(40.0F);
   }

   public boolean gx() {
      return false;
   }

   private void x(int $$0) {
      this.am.a(bZ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azs $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gy() {
      return this.am.a(bZ);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Variant", this.gH().g);
      $$0.a("Strength", this.gy());
   }

   @Override
   public void a(uk $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(ciy.d.a($$0.h("Variant")));
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new cdc(this, 1.2));
      this.bS.a(2, new ccf(this, 2.1F));
      this.bS.a(3, new ccx(this, 1.25, 40, 20.0F));
      this.bS.a(3, new ccr(this, 1.2));
      this.bS.a(4, new cbk(this, 1.0));
      this.bS.a(5, new cdg(this, 1.25, $$0 -> $$0.a(axj.ar), false));
      this.bS.a(6, new cbx(this, 1.0));
      this.bS.a(7, new cdl(this, 0.7));
      this.bS.a(8, new ccg(this, com.class, 6.0F));
      this.bS.a(9, new cct(this));
      this.bT.a(1, new ciy.c(this));
      this.bT.a(2, new ciy.a(this));
   }

   public static bwh.a gG() {
      return q();
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
      $$0.a(ca, 0);
   }

   public ciy.d gH() {
      return ciy.d.a(this.am.a(ca));
   }

   public void a(ciy.d $$0) {
      this.am.a(ca, $$0.g);
   }

   @Override
   public boolean l(cwb $$0) {
      return $$0.a(axj.aq);
   }

   @Override
   protected boolean a(com $$0, cwb $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cwf.px)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dig.ij.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gL() && this.g() == 0 && this.gB()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eG() < this.eV() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.p_() && $$2 > 0) {
         this.dX().a(lr.O, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dX().C) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gL()) && this.gR() < this.gX()) {
         $$5 = true;
         if (!this.dX().C) {
            this.v($$3);
         }
      }

      if ($$5 && !this.bc()) {
         awk $$6 = this.gw();
         if ($$6 != null) {
            this.dX().a(null, this.dC(), this.dE(), this.dI(), this.gw(), this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fk() {
      return this.eH() || this.gO();
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      azs $$4 = $$0.E_();
      this.b($$4);
      ciy.d $$5;
      if ($$3 instanceof ciy.b) {
         $$5 = ((ciy.b)$$3).a;
      } else {
         $$5 = ae.a(ciy.d.values(), $$4);
         $$3 = new ciy.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   protected awk gV() {
      return awl.nY;
   }

   @Override
   protected awk w() {
      return awl.nX;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.oc;
   }

   @Override
   protected awk o_() {
      return awl.oa;
   }

   @Nullable
   @Override
   protected awk gw() {
      return awl.ob;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.oe, 0.15F, 1.0F);
   }

   @Override
   protected void y() {
      this.a(awl.nZ, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? this.gy() : 0;
   }

   @Override
   public boolean e(bum $$0) {
      return true;
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public int gX() {
      return 30;
   }

   @Override
   public boolean a(cgr $$0) {
      return $$0 != this && $$0 instanceof ciy && this.he() && ((ciy)$$0).he();
   }

   @Nullable
   public ciy b(arn $$0, btv $$1) {
      ciy $$2 = this.gI();
      if ($$2 != null) {
         this.a($$1, $$2);
         ciy $$3 = (ciy)$$1;
         int $$4 = this.af.a(Math.max(this.gy(), $$3.gy())) + 1;
         if (this.af.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.af.h() ? this.gH() : $$3.gH());
      }

      return $$2;
   }

   @Nullable
   protected ciy gI() {
      return bul.an.a(this.dX(), buk.e);
   }

   private void k(bva $$0) {
      cpf $$1 = new cpf(this.dX(), this);
      double $$2 = $$0.dC() - this.dC();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dE();
      double $$4 = $$0.dI() - this.dI();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dX() instanceof arn $$6) {
         cpg.a($$1, $$6, cwb.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bc()) {
         this.dX().a(null, this.dC(), this.dE(), this.dI(), awl.od, this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
      }

      this.cd = true;
   }

   void E(boolean $$0) {
      this.cd = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bsu $$2) {
      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.cb()) {
               for (bue $$4 : this.de()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eR();
         return true;
      }
   }

   public void gJ() {
      if (this.ce != null) {
         this.ce.cf = null;
      }

      this.ce = null;
   }

   public void a(ciy $$0) {
      this.ce = $$0;
      this.ce.cf = this;
   }

   public boolean gK() {
      return this.cf != null;
   }

   public boolean hh() {
      return this.ce != null;
   }

   @Nullable
   public ciy hi() {
      return this.ce;
   }

   @Override
   protected double gt() {
      return 2.0;
   }

   @Override
   protected void gY() {
      if (!this.hh() && this.p_()) {
         super.gY();
      }
   }

   @Override
   public boolean gZ() {
      return false;
   }

   @Override
   public void a(bva $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ezn cU() {
      return new ezn(0.0, 0.75 * (double)this.cT(), (double)this.ds() * 0.5);
   }

   @Override
   public buh e(bvm $$0) {
      return this.p_() ? cc : super.e($$0);
   }

   @Override
   protected ezn a(bue $$0, buh $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cdr<chu> {
      public a(ciy $$0) {
         super($$0, chu.class, 16, false, true, $$0x -> !((chu)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends btv.a {
      public final ciy.d a;

      b(ciy.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cdq {
      public c(ciy $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof ciy $$0 && $$0.cd) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bag {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<ciy.d> e = bag.a(ciy.d::values);
      private static final IntFunction<ciy.d> f = ayb.a(ciy.d::a, values(), ayb.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static ciy.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
