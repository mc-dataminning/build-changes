import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjc extends ciy implements bwe<cjc.d>, clz {
   private static final int bY = 5;
   private static final ako<Integer> bZ = aks.a(cjc.class, akq.b);
   private static final ako<Integer> ca = aks.a(cjc.class, akq.b);
   private static final bul cc = bup.an.n().a(buk.a().a(buj.a, 0.0F, bup.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cd;
   @Nullable
   private cjc ce;
   @Nullable
   private cjc cf;

   public cjc(bup<? extends cjc> $$0, dff $$1) {
      super($$0, $$1);
      this.P().a(40.0F);
   }

   public boolean gy() {
      return false;
   }

   private void x(int $$0) {
      this.am.a(bZ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azv $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gz() {
      return this.am.a(bZ);
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Variant", this.gI().g);
      $$0.a("Strength", this.gz());
   }

   @Override
   public void a(un $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cjc.d.a($$0.h("Variant")));
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new cdg(this, 1.2));
      this.bS.a(2, new ccj(this, 2.1F));
      this.bS.a(3, new cdb(this, 1.25, 40, 20.0F));
      this.bS.a(3, new ccv(this, 1.2));
      this.bS.a(4, new cbo(this, 1.0));
      this.bS.a(5, new cdk(this, 1.25, $$0 -> $$0.a(axm.as), false));
      this.bS.a(6, new ccb(this, 1.0));
      this.bS.a(7, new cdp(this, 0.7));
      this.bS.a(8, new cck(this, cor.class, 6.0F));
      this.bS.a(9, new ccx(this));
      this.bT.a(1, new cjc.c(this));
      this.bT.a(2, new cjc.a(this));
   }

   public static bwl.a gH() {
      return q();
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
      $$0.a(ca, 0);
   }

   public cjc.d gI() {
      return cjc.d.a(this.am.a(ca));
   }

   public void a(cjc.d $$0) {
      this.am.a(ca, $$0.g);
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.ar);
   }

   @Override
   protected boolean a(cor $$0, cwf $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cwj.px)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dil.ij.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gM() && this.g() == 0 && this.gC()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eH() < this.eW() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.p_() && $$2 > 0) {
         this.dY().a(ls.O, this.d(1.0), this.dG() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dY().C) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gM()) && this.gS() < this.gY()) {
         $$5 = true;
         if (!this.dY().C) {
            this.v($$3);
         }
      }

      if ($$5 && !this.bd()) {
         awn $$6 = this.gx();
         if ($$6 != null) {
            this.dY().a(null, this.dD(), this.dF(), this.dJ(), this.gx(), this.do(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fl() {
      return this.eI() || this.gP();
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      azv $$4 = $$0.E_();
      this.b($$4);
      cjc.d $$5;
      if ($$3 instanceof cjc.b) {
         $$5 = ((cjc.b)$$3).a;
      } else {
         $$5 = ae.a(cjc.d.values(), $$4);
         $$3 = new cjc.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   protected awn gW() {
      return awo.nY;
   }

   @Override
   protected awn w() {
      return awo.nX;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.oc;
   }

   @Override
   protected awn o_() {
      return awo.oa;
   }

   @Nullable
   @Override
   protected awn gx() {
      return awo.ob;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.oe, 0.15F, 1.0F);
   }

   @Override
   protected void y() {
      this.a(awo.nZ, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? this.gz() : 0;
   }

   @Override
   public boolean e(buq $$0) {
      return true;
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public int gY() {
      return 30;
   }

   @Override
   public boolean a(cgv $$0) {
      return $$0 != this && $$0 instanceof cjc && this.hf() && ((cjc)$$0).hf();
   }

   @Nullable
   public cjc b(arq $$0, btz $$1) {
      cjc $$2 = this.gJ();
      if ($$2 != null) {
         this.a($$1, $$2);
         cjc $$3 = (cjc)$$1;
         int $$4 = this.af.a(Math.max(this.gz(), $$3.gz())) + 1;
         if (this.af.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.af.h() ? this.gI() : $$3.gI());
      }

      return $$2;
   }

   @Nullable
   protected cjc gJ() {
      return bup.an.a(this.dY(), buo.e);
   }

   private void k(bve $$0) {
      cpj $$1 = new cpj(this.dY(), this);
      double $$2 = $$0.dD() - this.dD();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dF();
      double $$4 = $$0.dJ() - this.dJ();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dY() instanceof arq $$6) {
         cpk.a($$1, $$6, cwf.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bd()) {
         this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.od, this.do(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
      }

      this.cd = true;
   }

   void E(boolean $$0) {
      this.cd = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bsy $$2) {
      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.cc()) {
               for (bui $$4 : this.df()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eS();
         return true;
      }
   }

   public void gK() {
      if (this.ce != null) {
         this.ce.cf = null;
      }

      this.ce = null;
   }

   public void a(cjc $$0) {
      this.ce = $$0;
      this.ce.cf = this;
   }

   public boolean gL() {
      return this.cf != null;
   }

   public boolean hi() {
      return this.ce != null;
   }

   @Nullable
   public cjc hj() {
      return this.ce;
   }

   @Override
   protected double gu() {
      return 2.0;
   }

   @Override
   protected void gZ() {
      if (!this.hi() && this.p_()) {
         super.gZ();
      }
   }

   @Override
   public boolean ha() {
      return false;
   }

   @Override
   public void a(bve $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ezr cV() {
      return new ezr(0.0, 0.75 * (double)this.cU(), (double)this.dt() * 0.5);
   }

   @Override
   public bul e(bvq $$0) {
      return this.p_() ? cc : super.e($$0);
   }

   @Override
   protected ezr a(bui $$0, bul $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cdv<chy> {
      public a(cjc $$0) {
         super($$0, chy.class, 16, false, true, $$0x -> !((chy)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends btz.a {
      public final cjc.d a;

      b(cjc.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cdu {
      public c(cjc $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cjc $$0 && $$0.cd) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements baj {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cjc.d> e = baj.a(cjc.d::values);
      private static final IntFunction<cjc.d> f = aye.a(cjc.d::a, values(), aye.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cjc.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
