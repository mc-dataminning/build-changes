import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cei extends cee implements brn<cei.d>, chd {
   private static final int bY = 5;
   private static final cvg ca = cvg.a(crm.pv, dca.ij.p());
   private static final aiy<Integer> cb = ajc.a(cei.class, aja.b);
   private static final aiy<Integer> cc = ajc.a(cei.class, aja.b);
   private static final bpy cd = bqb.am.n().a(bpx.a().a(bpw.a, 0.0F, bqb.am.l() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private cei cf;
   @Nullable
   private cei cg;

   public cei(bqb<? extends cei> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public boolean gw() {
      return false;
   }

   private void x(int $$0) {
      this.an.a(cb, Math.max(1, Math.min(5, $$0)));
   }

   private void b(axr $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gx() {
      return this.an.a(cb);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz().g);
      $$0.a("Strength", this.gx());
   }

   @Override
   public void a(tm $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cei.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bR.a(0, new bxf(this));
      this.bR.a(1, new byp(this, 1.2));
      this.bR.a(2, new bxs(this, 2.1F));
      this.bR.a(3, new byk(this, 1.25, 40, 20.0F));
      this.bR.a(3, new bye(this, 1.2));
      this.bR.a(4, new bwx(this, 1.0));
      this.bR.a(5, new byt(this, 1.25, cvg.a(crm.hC), false));
      this.bR.a(6, new bxk(this, 1.0));
      this.bR.a(7, new byy(this, 0.7));
      this.bR.a(8, new bxt(this, cjt.class, 6.0F));
      this.bR.a(9, new byg(this));
      this.bS.a(1, new cei.c(this));
      this.bS.a(2, new cei.a(this));
   }

   public static bru.a gy() {
      return r().a(brv.k, 40.0);
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
   }

   public cei.d gz() {
      return cei.d.a(this.an.a(cc));
   }

   public void a(cei.d $$0) {
      this.an.a(cc, $$0.g);
   }

   @Override
   protected int aa_() {
      return this.u() ? 1 + 3 * this.gv() : super.aa_();
   }

   @Override
   public boolean o(crj $$0) {
      return ca.a($$0);
   }

   @Override
   protected boolean a(cjt $$0, crj $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(crm.pv)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dca.ij.p())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gC() && this.g() == 0 && this.go()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ex() < this.eO() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.p_() && $$2 > 0) {
         this.dM().a(kl.N, this.d(1.0), this.du() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dM().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gC()) && this.gI() < this.gN()) {
         $$5 = true;
         if (!this.dM().B) {
            this.w($$3);
         }
      }

      if ($$5 && !this.aU()) {
         aul $$6 = this.gu();
         if ($$6 != null) {
            this.dM().a(null, this.dr(), this.dt(), this.dx(), this.gu(), this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fd() {
      return this.ey() || this.gF();
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      axr $$4 = $$0.E_();
      this.b($$4);
      cei.d $$5;
      if ($$3 instanceof cei.b) {
         $$5 = ((cei.b)$$3).a;
      } else {
         $$5 = ac.a(cei.d.values(), $$4);
         $$3 = new cei.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   protected aul gL() {
      return aum.nK;
   }

   @Override
   protected aul v() {
      return aum.nJ;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.nO;
   }

   @Override
   protected aul o_() {
      return aum.nM;
   }

   @Nullable
   @Override
   protected aul gu() {
      return aum.nN;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.nQ, 0.15F, 1.0F);
   }

   @Override
   protected void gn() {
      this.a(aum.nL, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gv() {
      return this.gx();
   }

   @Override
   public boolean fQ() {
      return true;
   }

   @Override
   public boolean l(crj $$0) {
      return $$0.a(avk.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public void a(bnt $$0) {
      cqc $$1 = this.gA();
      super.a($$0);
      cqc $$2 = this.gA();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(aum.nR, 0.5F, 1.0F);
      }
   }

   @Nullable
   private static cqc n(crj $$0) {
      dby $$1 = dby.a($$0.f());
      return $$1 instanceof dls ? ((dls)$$1).b() : null;
   }

   @Nullable
   public cqc gA() {
      return n(this.d(bqc.g));
   }

   @Override
   public int gN() {
      return 30;
   }

   @Override
   public boolean a(ccd $$0) {
      return $$0 != this && $$0 instanceof cei && this.gU() && ((cei)$$0).gU();
   }

   @Nullable
   public cei b(aps $$0, bpp $$1) {
      cei $$2 = this.gB();
      if ($$2 != null) {
         this.a($$1, $$2);
         cei $$3 = (cei)$$1;
         int $$4 = this.ag.a(Math.max(this.gx(), $$3.gx())) + 1;
         if (this.ag.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.ag.h() ? this.gz() : $$3.gz());
      }

      return $$2;
   }

   @Nullable
   protected cei gB() {
      return bqb.am.a(this.dM());
   }

   private void k(bqo $$0) {
      ckk $$1 = new ckk(this.dM(), this);
      double $$2 = $$0.dr() - this.dr();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dt();
      double $$4 = $$0.dx() - this.dx();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.nP, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dM().b($$1);
      this.ce = true;
   }

   void D(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bot $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bP()) {
               for (bpv $$4 : this.cT()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eK();
         return true;
      }
   }

   public void gX() {
      if (this.cf != null) {
         this.cf.cg = null;
      }

      this.cf = null;
   }

   public void a(cei $$0) {
      this.cf = $$0;
      this.cf.cg = this;
   }

   public boolean gY() {
      return this.cg != null;
   }

   public boolean gZ() {
      return this.cf != null;
   }

   @Nullable
   public cei ha() {
      return this.cf;
   }

   @Override
   protected double gm() {
      return 2.0;
   }

   @Override
   protected void gO() {
      if (!this.gZ() && this.p_()) {
         super.gO();
      }
   }

   @Override
   public boolean gP() {
      return false;
   }

   @Override
   public void a(bqo $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public esa cJ() {
      return new esa(0.0, 0.75 * (double)this.cI(), (double)this.dg() * 0.5);
   }

   @Override
   public bpy e(bqz $$0) {
      return this.p_() ? cd : super.e($$0);
   }

   @Override
   protected esa a(bpv $$0, bpy $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends bze<cdg> {
      public a(cei $$0) {
         super($$0, cdg.class, 16, false, true, $$0x -> !((cdg)$$0x).r());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bpp.a {
      public final cei.d a;

      b(cei.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends bzd {
      public c(cei $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cei $$0 && $$0.ce) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements aye {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cei.d> e = aye.a(cei.d::values);
      private static final IntFunction<cei.d> f = awb.a(cei.d::a, values(), awb.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cei.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
