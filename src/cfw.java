import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfw extends cfs implements bsz<cfw.d>, cir {
   private static final int bZ = 5;
   private static final ajm<Integer> cb = ajq.a(cfw.class, ajo.b);
   private static final ajm<Integer> cc = ajq.a(cfw.class, ajo.b);
   private static final brk cd = brn.am.n().a(brj.a().a(bri.a, 0.0F, brn.am.l() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private cfw cf;
   @Nullable
   private cfw cg;

   public cfw(brn<? extends cfw> $$0, dad $$1) {
      super($$0, $$1);
   }

   public boolean gy() {
      return false;
   }

   private void x(int $$0) {
      this.ao.a(cb, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ayg $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gz() {
      return this.ao.a(cb);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB().g);
      $$0.a("Strength", this.gz());
   }

   @Override
   public void a(ua $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cfw.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bS.a(0, new byr(this));
      this.bS.a(1, new cab(this, 1.2));
      this.bS.a(2, new bze(this, 2.1F));
      this.bS.a(3, new bzw(this, 1.25, 40, 20.0F));
      this.bS.a(3, new bzq(this, 1.2));
      this.bS.a(4, new byj(this, 1.0));
      this.bS.a(5, new caf(this, 1.25, $$0 -> $$0.a(avz.ao), false));
      this.bS.a(6, new byw(this, 1.0));
      this.bS.a(7, new cak(this, 0.7));
      this.bS.a(8, new bzf(this, clh.class, 6.0F));
      this.bS.a(9, new bzs(this));
      this.bT.a(1, new cfw.c(this));
      this.bT.a(2, new cfw.a(this));
   }

   public static btg.a gA() {
      return r().a(bth.k, 40.0);
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
   }

   public cfw.d gB() {
      return cfw.d.a(this.ao.a(cc));
   }

   public void a(cfw.d $$0) {
      this.ao.a(cc, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.u() ? 1 + 3 * this.gx() : super.ab_();
   }

   @Override
   public boolean o(csz $$0) {
      return $$0.a(avz.an);
   }

   @Override
   protected boolean a(clh $$0, csz $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(ctc.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(ddg.ij.q())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gE() && this.g() == 0 && this.gq()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ey() < this.eP() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.p_() && $$2 > 0) {
         this.dN().a(kx.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dN().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gE()) && this.gK() < this.gP()) {
         $$5 = true;
         if (!this.dN().B) {
            this.w($$3);
         }
      }

      if ($$5 && !this.aU()) {
         avb $$6 = this.gw();
         if ($$6 != null) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), this.gw(), this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fe() {
      return this.ez() || this.gH();
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      ayg $$4 = $$0.E_();
      this.b($$4);
      cfw.d $$5;
      if ($$3 instanceof cfw.b) {
         $$5 = ((cfw.b)$$3).a;
      } else {
         $$5 = ac.a(cfw.d.values(), $$4);
         $$3 = new cfw.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   protected avb gN() {
      return avc.nP;
   }

   @Override
   protected avb v() {
      return avc.nO;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.nT;
   }

   @Override
   protected avb o_() {
      return avc.nR;
   }

   @Nullable
   @Override
   protected avb gw() {
      return avc.nS;
   }

   @Override
   protected void b(in $$0, dqh $$1) {
      this.a(avc.nV, 0.15F, 1.0F);
   }

   @Override
   protected void gp() {
      this.a(avc.nQ, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
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
   public boolean l(csz $$0) {
      return $$0.a(avz.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public void a(bpf $$0) {
      crs $$1 = this.gC();
      super.a($$0);
      crs $$2 = this.gC();
      if (this.ai > 20 && $$2 != null && $$2 != $$1) {
         this.a(avc.nW, 0.5F, 1.0F);
      }
   }

   @Nullable
   private static crs n(csz $$0) {
      dde $$1 = dde.a($$0.f());
      return $$1 instanceof dmz ? ((dmz)$$1).b() : null;
   }

   @Nullable
   public crs gC() {
      return n(this.d(bro.g));
   }

   @Override
   public int gP() {
      return 30;
   }

   @Override
   public boolean a(cdp $$0) {
      return $$0 != this && $$0 instanceof cfw && this.gW() && ((cfw)$$0).gW();
   }

   @Nullable
   public cfw b(aqh $$0, brb $$1) {
      cfw $$2 = this.gD();
      if ($$2 != null) {
         this.a($$1, $$2);
         cfw $$3 = (cfw)$$1;
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
   protected cfw gD() {
      return brn.am.a(this.dN());
   }

   private void k(bsa $$0) {
      cly $$1 = new cly(this.dN(), this);
      double $$2 = $$0.ds() - this.ds();
      double $$3 = $$0.e(0.3333333333333333) - $$1.du();
      double $$4 = $$0.dy() - this.dy();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), avc.nU, this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dN().b($$1);
      this.ce = true;
   }

   void D(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bqf $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bQ()) {
               for (brh $$4 : this.cU()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eL();
         return true;
      }
   }

   public void gZ() {
      if (this.cf != null) {
         this.cf.cg = null;
      }

      this.cf = null;
   }

   public void a(cfw $$0) {
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
   public cfw hc() {
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
   public void a(bsa $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public etp cK() {
      return new etp(0.0, 0.75 * (double)this.cJ(), (double)this.dh() * 0.5);
   }

   @Override
   public brk e(bsl $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   protected etp a(brh $$0, brk $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends caq<ces> {
      public a(cfw $$0) {
         super($$0, ces.class, 16, false, true, $$0x -> !((ces)$$0x).r());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends brb.a {
      public final cfw.d a;

      b(cfw.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cap {
      public c(cfw $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cfw $$0 && $$0.ce) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements ayt {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cfw.d> e = ayt.a(cfw.d::values);
      private static final IntFunction<cfw.d> f = awq.a(cfw.d::a, values(), awq.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cfw.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
