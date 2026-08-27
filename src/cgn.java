import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgn extends cgj implements btq<cgn.d>, cji {
   private static final int bZ = 5;
   private static final ajs<Integer> cb = ajw.a(cgn.class, aju.b);
   private static final ajs<Integer> cc = ajw.a(cgn.class, aju.b);
   private static final brz cd = bsc.an.n().a(bry.a().a(brx.a, 0.0F, bsc.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private cgn cf;
   @Nullable
   private cgn cg;

   public cgn(bsc<? extends cgn> $$0, daz $$1) {
      super($$0, $$1);
   }

   public boolean gy() {
      return false;
   }

   private void x(int $$0) {
      this.ao.a(cb, Math.max(1, Math.min(5, $$0)));
   }

   private void b(aym $$0) {
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
      this.a(cgn.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bS.a(0, new bzi(this));
      this.bS.a(1, new cas(this, 1.2));
      this.bS.a(2, new bzv(this, 2.1F));
      this.bS.a(3, new can(this, 1.25, 40, 20.0F));
      this.bS.a(3, new cah(this, 1.2));
      this.bS.a(4, new bza(this, 1.0));
      this.bS.a(5, new caw(this, 1.25, $$0 -> $$0.a(awf.ao), false));
      this.bS.a(6, new bzn(this, 1.0));
      this.bS.a(7, new cbb(this, 0.7));
      this.bS.a(8, new bzw(this, cly.class, 6.0F));
      this.bS.a(9, new caj(this));
      this.bT.a(1, new cgn.c(this));
      this.bT.a(2, new cgn.a(this));
   }

   public static btx.a gA() {
      return s().a(bty.k, 40.0);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
   }

   public cgn.d gB() {
      return cgn.d.a(this.ao.a(cc));
   }

   public void a(cgn.d $$0) {
      this.ao.a(cc, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.u() ? 1 + 3 * this.gx() : super.ab_();
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.an);
   }

   @Override
   protected boolean a(cly $$0, ctq $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(ctt.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dec.ij.r())) {
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
         avh $$6 = this.gw();
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
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      aym $$4 = $$0.E_();
      this.b($$4);
      cgn.d $$5;
      if ($$3 instanceof cgn.b) {
         $$5 = ((cgn.b)$$3).a;
      } else {
         $$5 = ac.a(cgn.d.values(), $$4);
         $$3 = new cgn.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   protected avh gN() {
      return avi.nZ;
   }

   @Override
   protected avh v() {
      return avi.nY;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.od;
   }

   @Override
   protected avh o_() {
      return avi.ob;
   }

   @Nullable
   @Override
   protected avh gw() {
      return avi.oc;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(avi.of, 0.15F, 1.0F);
   }

   @Override
   protected void gp() {
      this.a(avi.oa, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
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
   public boolean l(ctq $$0) {
      return $$0.a(awf.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public void a(bpp $$0) {
      csj $$1 = this.gC();
      super.a($$0);
      csj $$2 = this.gC();
      if (this.ai > 20 && $$2 != null && $$2 != $$1) {
         this.a(avi.og, 0.5F, 1.0F);
      }
   }

   @Nullable
   private static csj n(ctq $$0) {
      dea $$1 = dea.a($$0.g());
      return $$1 instanceof dnv ? ((dnv)$$1).b() : null;
   }

   @Nullable
   public csj gC() {
      return n(this.a(bsd.g));
   }

   @Override
   public int gP() {
      return 30;
   }

   @Override
   public boolean a(ceg $$0) {
      return $$0 != this && $$0 instanceof cgn && this.gW() && ((cgn)$$0).gW();
   }

   @Nullable
   public cgn b(aqn $$0, brq $$1) {
      cgn $$2 = this.gD();
      if ($$2 != null) {
         this.a($$1, $$2);
         cgn $$3 = (cgn)$$1;
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
   protected cgn gD() {
      return bsc.an.a(this.dP());
   }

   private void k(bsq $$0) {
      cmp $$1 = new cmp(this.dP(), this);
      double $$2 = $$0.du() - this.du();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dw();
      double $$4 = $$0.dA() - this.dA();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aW()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), avi.oe, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dP().b($$1);
      this.ce = true;
   }

   void D(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bqp $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bS()) {
               for (brw $$4 : this.cW()) {
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

   public void a(cgn $$0) {
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
   public cgn hc() {
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
   public void a(bsq $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public eum cM() {
      return new eum(0.0, 0.75 * (double)this.cL(), (double)this.dj() * 0.5);
   }

   @Override
   public brz e(btc $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   protected eum a(brw $$0, brz $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cbh<cfj> {
      public a(cgn $$0) {
         super($$0, cfj.class, 16, false, true, $$0x -> !((cfj)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends brq.a {
      public final cgn.d a;

      b(cgn.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cbg {
      public c(cgn $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cgn $$0 && $$0.ce) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements ayz {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cgn.d> e = ayz.a(cgn.d::values);
      private static final IntFunction<cgn.d> f = aww.a(cgn.d::a, values(), aww.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cgn.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
