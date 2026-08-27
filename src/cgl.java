import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgl extends cgh implements bto<cgl.d>, cjg {
   private static final int bZ = 5;
   private static final ajr<Integer> cb = ajv.a(cgl.class, ajt.b);
   private static final ajr<Integer> cc = ajv.a(cgl.class, ajt.b);
   private static final brx cd = bsa.an.n().a(brw.a().a(brv.a, 0.0F, bsa.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private cgl cf;
   @Nullable
   private cgl cg;

   public cgl(bsa<? extends cgl> $$0, dax $$1) {
      super($$0, $$1);
   }

   public boolean gy() {
      return false;
   }

   private void x(int $$0) {
      this.ao.a(cb, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ayk $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gz() {
      return this.ao.a(cb);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB().g);
      $$0.a("Strength", this.gz());
   }

   @Override
   public void a(ud $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cgl.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzg(this));
      this.bS.a(1, new caq(this, 1.2));
      this.bS.a(2, new bzt(this, 2.1F));
      this.bS.a(3, new cal(this, 1.25, 40, 20.0F));
      this.bS.a(3, new caf(this, 1.2));
      this.bS.a(4, new byy(this, 1.0));
      this.bS.a(5, new cau(this, 1.25, $$0 -> $$0.a(awe.ao), false));
      this.bS.a(6, new bzl(this, 1.0));
      this.bS.a(7, new caz(this, 0.7));
      this.bS.a(8, new bzu(this, clw.class, 6.0F));
      this.bS.a(9, new cah(this));
      this.bT.a(1, new cgl.c(this));
      this.bT.a(2, new cgl.a(this));
   }

   public static btv.a gA() {
      return s().a(btw.k, 40.0);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
   }

   public cgl.d gB() {
      return cgl.d.a(this.ao.a(cc));
   }

   public void a(cgl.d $$0) {
      this.ao.a(cc, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.u() ? 1 + 3 * this.gx() : super.ab_();
   }

   @Override
   public boolean o(cto $$0) {
      return $$0.a(awe.an);
   }

   @Override
   protected boolean a(clw $$0, cto $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(ctr.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dea.ij.q())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gE() && this.g() == 0 && this.gq()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.eA() < this.eR() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.p_() && $$2 > 0) {
         this.dP().a(ky.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dP().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gE()) && this.gK() < this.gP()) {
         $$5 = true;
         if (!this.dP().B) {
            this.w($$3);
         }
      }

      if ($$5 && !this.aW()) {
         avg $$6 = this.gw();
         if ($$6 != null) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), this.gw(), this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fg() {
      return this.eB() || this.gH();
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ayk $$4 = $$0.E_();
      this.b($$4);
      cgl.d $$5;
      if ($$3 instanceof cgl.b) {
         $$5 = ((cgl.b)$$3).a;
      } else {
         $$5 = ac.a(cgl.d.values(), $$4);
         $$3 = new cgl.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   protected avg gN() {
      return avh.nZ;
   }

   @Override
   protected avg v() {
      return avh.nY;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.od;
   }

   @Override
   protected avg o_() {
      return avh.ob;
   }

   @Nullable
   @Override
   protected avg gw() {
      return avh.oc;
   }

   @Override
   protected void b(io $$0, drb $$1) {
      this.a(avh.of, 0.15F, 1.0F);
   }

   @Override
   protected void gp() {
      this.a(avh.oa, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gx() {
      return this.gz();
   }

   @Override
   public boolean fR() {
      return true;
   }

   @Override
   public boolean l(cto $$0) {
      return $$0.a(awe.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public void a(bpn $$0) {
      csh $$1 = this.gC();
      super.a($$0);
      csh $$2 = this.gC();
      if (this.ai > 20 && $$2 != null && $$2 != $$1) {
         this.a(avh.og, 0.5F, 1.0F);
      }
   }

   @Nullable
   private static csh n(cto $$0) {
      ddy $$1 = ddy.a($$0.g());
      return $$1 instanceof dnt ? ((dnt)$$1).b() : null;
   }

   @Nullable
   public csh gC() {
      return n(this.a(bsb.g));
   }

   @Override
   public int gP() {
      return 30;
   }

   @Override
   public boolean a(cee $$0) {
      return $$0 != this && $$0 instanceof cgl && this.gW() && ((cgl)$$0).gW();
   }

   @Nullable
   public cgl b(aqm $$0, bro $$1) {
      cgl $$2 = this.gD();
      if ($$2 != null) {
         this.a($$1, $$2);
         cgl $$3 = (cgl)$$1;
         int $$4 = this.ah.a(Math.max(this.gz(), $$3.gz())) + 1;
         if (this.ah.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.ah.h() ? this.gB() : $$3.gB());
      }

      return $$2;
   }

   @Nullable
   protected cgl gD() {
      return bsa.an.a(this.dP());
   }

   private void k(bso $$0) {
      cmn $$1 = new cmn(this.dP(), this);
      double $$2 = $$0.du() - this.du();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dw();
      double $$4 = $$0.dA() - this.dA();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aW()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), avh.oe, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dP().b($$1);
      this.ce = true;
   }

   void D(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bqn $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bS()) {
               for (bru $$4 : this.cW()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eN();
         return true;
      }
   }

   public void gZ() {
      if (this.cf != null) {
         this.cf.cg = null;
      }

      this.cf = null;
   }

   public void a(cgl $$0) {
      this.cf = $$0;
      this.cf.cg = this;
   }

   public boolean ha() {
      return this.cg != null;
   }

   public boolean hb() {
      return this.cf != null;
   }

   @Nullable
   public cgl hc() {
      return this.cf;
   }

   @Override
   protected double go() {
      return 2.0;
   }

   @Override
   protected void gQ() {
      if (!this.hb() && this.p_()) {
         super.gQ();
      }
   }

   @Override
   public boolean gR() {
      return false;
   }

   @Override
   public void a(bso $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public euk cM() {
      return new euk(0.0, 0.75 * (double)this.cL(), (double)this.dj() * 0.5);
   }

   @Override
   public brx e(bta $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   protected euk a(bru $$0, brx $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cbf<cfh> {
      public a(cgl $$0) {
         super($$0, cfh.class, 16, false, true, $$0x -> !((cfh)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bro.a {
      public final cgl.d a;

      b(cgl.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cbe {
      public c(cgl $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cgl $$0 && $$0.ce) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements ayx {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cgl.d> e = ayx.a(cgl.d::values);
      private static final IntFunction<cgl.d> f = awv.a(cgl.d::a, values(), awv.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cgl.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
