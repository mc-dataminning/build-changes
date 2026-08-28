import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjv extends cjr implements bwx<cjv.d>, cms {
   private static final int bZ = 5;
   private static final aks<Integer> ca = akw.a(cjv.class, aku.b);
   private static final aks<Integer> cb = akw.a(cjv.class, aku.b);
   private static final bve cd = bvi.ay.n().a(bvd.a().a(bvc.a, 0.0F, bvi.ay.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private cjv cf;
   @Nullable
   private cjv cg;

   public cjv(bvi<? extends cjv> $$0, dgz $$1) {
      super($$0, $$1);
      this.L().a(40.0F);
   }

   public boolean gr() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(ca, Math.max(1, Math.min(5, $$0)));
   }

   private void b(bac $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gs() {
      return this.al.a(ca);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB().g);
      $$0.a("Strength", this.gs());
   }

   @Override
   public void a(um $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cjv.d.a($$0.h("Variant")));
   }

   @Override
   protected void B() {
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new cdz(this, 1.2));
      this.bT.a(2, new cdc(this, 2.1F));
      this.bT.a(3, new cdu(this, 1.25, 40, 20.0F));
      this.bT.a(3, new cdo(this, 1.2));
      this.bT.a(4, new cch(this, 1.0));
      this.bT.a(5, new ced(this, 1.25, $$0 -> $$0.a(axt.at), false));
      this.bT.a(6, new ccu(this, 1.0));
      this.bT.a(7, new cei(this, 0.7));
      this.bT.a(8, new cdd(this, cpo.class, 6.0F));
      this.bT.a(9, new cdq(this));
      this.bU.a(1, new cjv.c(this));
      this.bU.a(2, new cjv.a(this));
   }

   public static bxe.a gA() {
      return p();
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
      $$0.a(cb, 0);
   }

   public cjv.d gB() {
      return cjv.d.a(this.al.a(cb));
   }

   public void a(cjv.d $$0) {
      this.al.a(cb, $$0.g);
   }

   @Override
   public boolean j(cxg $$0) {
      return $$0.a(axt.as);
   }

   @Override
   protected boolean a(cpo $$0, cxg $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cxk.qb)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dkf.iH.j())) {
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
         this.dW().a(ls.P, this.d(1.0), this.dE() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
         awu $$6 = this.gq();
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
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bac $$4 = $$0.H_();
      this.b($$4);
      cjv.d $$5;
      if ($$3 instanceof cjv.b) {
         $$5 = ((cjv.b)$$3).a;
      } else {
         $$5 = ae.a(cjv.d.values(), $$4);
         $$3 = new cjv.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected awu gP() {
      return awv.ox;
   }

   @Override
   protected awu u() {
      return awv.ow;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.oB;
   }

   @Override
   protected awu o_() {
      return awv.oz;
   }

   @Nullable
   @Override
   protected awu gq() {
      return awv.oA;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.oD, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awv.oy, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? this.gs() : 0;
   }

   @Override
   public boolean e(bvj $$0) {
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
   public boolean a(cho $$0) {
      return $$0 != this && $$0 instanceof cjv && this.gX() && ((cjv)$$0).gX();
   }

   @Nullable
   public cjv b(arx $$0, bus $$1) {
      cjv $$2 = this.gC();
      if ($$2 != null) {
         this.a($$1, $$2);
         cjv $$3 = (cjv)$$1;
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
   protected cjv gC() {
      return bvi.ay.a(this.dW(), bvh.e);
   }

   private void k(bvx $$0) {
      cqg $$1 = new cqg(this.dW(), this);
      double $$2 = $$0.dB() - this.dB();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dD();
      double $$4 = $$0.dH() - this.dH();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dW() instanceof arx $$6) {
         cqh.a($$1, $$6, cxg.j, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dW().a(null, this.dB(), this.dD(), this.dH(), awv.oC, this.dn(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.ce = true;
   }

   void E(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, btr $$2) {
      int $$3 = this.f($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.ca()) {
               for (bvb $$4 : this.dd()) {
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

   public void a(cjv $$0) {
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
   public cjv hb() {
      return this.cf;
   }

   @Override
   protected double gn() {
      return 2.0;
   }

   @Override
   protected void g(arx $$0) {
      if (!this.ha() && this.e_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gS() {
      return false;
   }

   @Override
   public void a(bvx $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public fbr cT() {
      return new fbr(0.0, 0.75 * (double)this.cS(), (double)this.dr() * 0.5);
   }

   @Override
   public bve e(bwj $$0) {
      return this.e_() ? cd : super.e($$0);
   }

   @Override
   protected fbr a(bvb $$0, bve $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends ceo<cir> {
      public a(cjv $$0) {
         super($$0, cir.class, 16, false, true, ($$0x, $$1) -> !((cir)$$0x).p());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bus.a {
      public final cjv.d a;

      b(cjv.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cen {
      public c(cjv $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cjv $$0 && $$0.ce) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements baq {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cjv.d> e = baq.a(cjv.d::values);
      private static final IntFunction<cjv.d> f = ayl.a(cjv.d::a, values(), ayl.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cjv.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
