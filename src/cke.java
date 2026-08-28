import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cke extends cka implements bxg<cke.d>, cnb {
   private static final int bZ = 5;
   private static final alc<Integer> ca = alg.a(cke.class, ale.b);
   private static final alc<Integer> cb = alg.a(cke.class, ale.b);
   private static final bvn cd = bvr.ay.n().a(bvm.a().a(bvl.a, 0.0F, bvr.ay.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private cke cf;
   @Nullable
   private cke cg;

   public cke(bvr<? extends cke> $$0, dhi $$1) {
      super($$0, $$1);
      this.L().a(40.0F);
   }

   public boolean gr() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(ca, Math.max(1, Math.min(5, $$0)));
   }

   private void b(bam $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gs() {
      return this.al.a(ca);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB().g);
      $$0.a("Strength", this.gs());
   }

   @Override
   public void a(ux $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cke.d.a($$0.h("Variant")));
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccy(this));
      this.bT.a(1, new cei(this, 1.2));
      this.bT.a(2, new cdl(this, 2.1F));
      this.bT.a(3, new ced(this, 1.25, 40, 20.0F));
      this.bT.a(3, new cdx(this, 1.2));
      this.bT.a(4, new ccq(this, 1.0));
      this.bT.a(5, new cem(this, 1.25, $$0 -> $$0.a(ayd.at), false));
      this.bT.a(6, new cdd(this, 1.0));
      this.bT.a(7, new cer(this, 0.7));
      this.bT.a(8, new cdm(this, cpx.class, 6.0F));
      this.bT.a(9, new cdz(this));
      this.bU.a(1, new cke.c(this));
      this.bU.a(2, new cke.a(this));
   }

   public static bxn.a gA() {
      return p();
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
      $$0.a(cb, 0);
   }

   public cke.d gB() {
      return cke.d.a(this.al.a(cb));
   }

   public void a(cke.d $$0) {
      this.al.a(cb, $$0.g);
   }

   @Override
   public boolean j(cxp $$0) {
      return $$0.a(ayd.as);
   }

   @Override
   protected boolean a(cpx $$0, cxp $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cxt.pS)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dko.iA.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gF() && this.Z_() == 0 && this.gv()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eE() < this.eS() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.e_() && $$2 > 0) {
         this.dW().a(ls.O, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dW().C) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gF()) && this.gL() < this.gR()) {
         $$5 = true;
         if (!this.dW().C) {
            this.u($$3);
         }
      }

      if ($$5 && !this.bb()) {
         axe $$6 = this.gq();
         if ($$6 != null) {
            this.dW().a(null, this.dB(), this.dD(), this.dH(), this.gq(), this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fi() {
      return this.eF() || this.gI();
   }

   @Nullable
   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      bam $$4 = $$0.H_();
      this.b($$4);
      cke.d $$5;
      if ($$3 instanceof cke.b) {
         $$5 = ((cke.b)$$3).a;
      } else {
         $$5 = ae.a(cke.d.values(), $$4);
         $$3 = new cke.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected axe gP() {
      return axf.or;
   }

   @Override
   protected axe u() {
      return axf.oq;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.ov;
   }

   @Override
   protected axe o_() {
      return axf.ot;
   }

   @Nullable
   @Override
   protected axe gq() {
      return axf.ou;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.ox, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(axf.os, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? this.gs() : 0;
   }

   @Override
   public boolean e(bvs $$0) {
      return true;
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public int gR() {
      return 30;
   }

   @Override
   public boolean a(chx $$0) {
      return $$0 != this && $$0 instanceof cke && this.gX() && ((cke)$$0).gX();
   }

   @Nullable
   public cke b(ash $$0, bvb $$1) {
      cke $$2 = this.gC();
      if ($$2 != null) {
         this.a($$1, $$2);
         cke $$3 = (cke)$$1;
         int $$4 = this.ae.a(Math.max(this.gs(), $$3.gs())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gB() : $$3.gB());
      }

      return $$2;
   }

   @Nullable
   protected cke gC() {
      return bvr.ay.a(this.dW(), bvq.e);
   }

   private void k(bwg $$0) {
      cqp $$1 = new cqp(this.dW(), this);
      double $$2 = $$0.dB() - this.dB();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dD();
      double $$4 = $$0.dH() - this.dH();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dW() instanceof ash $$6) {
         cqq.a($$1, $$6, cxp.j, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dW().a(null, this.dB(), this.dD(), this.dH(), axf.ow, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.ce = true;
   }

   void E(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bua $$2) {
      int $$3 = this.f($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.ca()) {
               for (bvk $$4 : this.dd()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eO();
         return true;
      }
   }

   public void gD() {
      if (this.cf != null) {
         this.cf.cg = null;
      }

      this.cf = null;
   }

   public void a(cke $$0) {
      this.cf = $$0;
      this.cf.cg = this;
   }

   public boolean gE() {
      return this.cg != null;
   }

   public boolean ha() {
      return this.cf != null;
   }

   @Nullable
   public cke hb() {
      return this.cf;
   }

   @Override
   protected double gn() {
      return 2.0;
   }

   @Override
   protected void g(ash $$0) {
      if (!this.ha() && this.e_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gS() {
      return false;
   }

   @Override
   public void a(bwg $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public fby cT() {
      return new fby(0.0, 0.75 * (double)this.cS(), (double)this.dr() * 0.5);
   }

   @Override
   public bvn e(bws $$0) {
      return this.e_() ? cd : super.e($$0);
   }

   @Override
   protected fby a(bvk $$0, bvn $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cex<cja> {
      public a(cke $$0) {
         super($$0, cja.class, 16, false, true, ($$0x, $$1) -> !((cja)$$0x).p());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bvb.a {
      public final cke.d a;

      b(cke.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cew {
      public c(cke $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cke $$0 && $$0.ce) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bba {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cke.d> e = bba.a(cke.d::values);
      private static final IntFunction<cke.d> f = ayv.a(cke.d::a, values(), ayv.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cke.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
