import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ckq extends ckm implements cnn {
   private static final int bE = 5;
   private static final akg<Integer> bF = akk.a(ckq.class, aki.b);
   private static final akg<Integer> bG = akk.a(ckq.class, aki.b);
   private static final bvv bI = bwb.ax.n().a(bvu.a().a(bvt.a, 0.0F, bwb.ax.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean bJ;
   @Nullable
   private ckq bK;
   @Nullable
   private ckq bL;

   public ckq(bwb<? extends ckq> $$0, dhp $$1) {
      super($$0, $$1);
      this.O().a(40.0F);
   }

   public boolean gt() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bF, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azs $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gu() {
      return this.al.a(bF);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gD().h);
      $$0.a("Strength", this.gu());
   }

   @Override
   public void a(tw $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(ckq.d.a($$0.h("Variant")));
   }

   @Override
   protected void D() {
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new cer(this, 1.2));
      this.bB.a(2, new cdu(this, 2.1F));
      this.bB.a(3, new cem(this, 1.25, 40, 20.0F));
      this.bB.a(3, new ceg(this, 1.2));
      this.bB.a(4, new ccz(this, 1.0));
      this.bB.a(5, new cev(this, 1.25, $$0 -> $$0.a(axi.ar), false));
      this.bB.a(6, new cdm(this, 1.0));
      this.bB.a(7, new cfa(this, 0.7));
      this.bB.a(8, new cdv(this, cqi.class, 6.0F));
      this.bB.a(9, new cei(this));
      this.bC.a(1, new ckq.c(this));
      this.bC.a(2, new ckq.a(this));
   }

   public static bxw.a gC() {
      return q();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bF, 0);
      $$0.a(bG, 0);
   }

   public ckq.d gD() {
      return ckq.d.a(this.al.a(bG));
   }

   private void a(ckq.d $$0) {
      this.al.a(bG, $$0.h);
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.aH ? b((kw<T>)$$0, this.gD()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aH);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aH) {
         this.a(b(kx.aH, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.aq);
   }

   @Override
   protected boolean a(cqi $$0, cxy $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cyc.qf)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dkw.iH.i())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gH() && this.g() == 0 && this.gx()) {
            $$5 = true;
            this.e($$0);
         }
      }

      if (this.eF() < this.eT() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.n_() && $$2 > 0) {
         this.dV().a(lv.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dV().C) {
            this.b_($$2);
            $$5 = true;
         }
      }

      if ($$3 > 0 && ($$5 || !this.gH()) && this.gN() < this.gS() && !this.dV().C) {
         this.u($$3);
         $$5 = true;
      }

      if ($$5 && !this.bb()) {
         awj $$6 = this.gs();
         if ($$6 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), this.gs(), this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean ff() {
      return this.eG() || this.gK();
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      azs $$4 = $$0.C_();
      this.b($$4);
      ckq.d $$5;
      if ($$3 instanceof ckq.b) {
         $$5 = ((ckq.b)$$3).a;
      } else {
         $$5 = af.a(ckq.d.values(), $$4);
         $$3 = new ckq.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   protected awj gQ() {
      return awk.oH;
   }

   @Override
   protected awj u() {
      return awk.oG;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.oL;
   }

   @Override
   protected awj l_() {
      return awk.oJ;
   }

   @Nullable
   @Override
   protected awj gs() {
      return awk.oK;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.oN, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awk.oI, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int aa_() {
      return this.t() ? this.gu() : 0;
   }

   @Override
   public boolean e(bwc $$0) {
      return true;
   }

   @Override
   public int gS() {
      return 30;
   }

   @Override
   public boolean a(cig $$0) {
      return $$0 != this && $$0 instanceof ckq && this.gY() && ((ckq)$$0).gY();
   }

   @Nullable
   public ckq b(arn $$0, bvi $$1) {
      ckq $$2 = this.gE();
      if ($$2 != null) {
         this.a($$1, $$2);
         ckq $$3 = (ckq)$$1;
         int $$4 = this.ae.a(Math.max(this.gu(), $$3.gu())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gD() : $$3.gD());
      }

      return $$2;
   }

   @Nullable
   protected ckq gE() {
      return bwb.ax.a(this.dV(), bwa.e);
   }

   private void l(bwr $$0) {
      cra $$1 = new cra(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof arn $$6) {
         crb.a($$1, $$6, cxy.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.oM, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.bJ = true;
   }

   void D(boolean $$0) {
      this.bJ = $$0;
   }

   @Override
   public boolean a(double $$0, float $$1, buh $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0) {
            this.a($$2, (float)$$3);
            if (this.ca()) {
               for (bvs $$4 : this.dc()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eP();
         return true;
      }
   }

   public void gF() {
      if (this.bK != null) {
         this.bK.bL = null;
      }

      this.bK = null;
   }

   public void a(ckq $$0) {
      this.bK = $$0;
      this.bK.bL = this;
   }

   public boolean gG() {
      return this.bL != null;
   }

   public boolean ha() {
      return this.bK != null;
   }

   @Nullable
   public ckq hb() {
      return this.bK;
   }

   @Override
   protected double gp() {
      return 2.0;
   }

   @Override
   protected void g(arn $$0) {
      if (!this.ha() && this.n_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gT() {
      return false;
   }

   @Override
   public void a(bwr $$0, float $$1) {
      this.l($$0);
   }

   @Override
   public fcu cT() {
      return new fcu(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? bI : super.e($$0);
   }

   @Override
   protected fcu a(bvs $$0, bvv $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cfg<cjm> {
      public a(ckq $$0) {
         super($$0, cjm.class, 16, false, true, ($$0x, $$1) -> !((cjm)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bvi.a {
      public final ckq.d a;

      b(ckq.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cff {
      public c(ckq $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof ckq $$0 && $$0.bJ) {
            $$0.D(false);
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

      public static final Codec<ckq.d> e = bag.a(ckq.d::values);
      private static final IntFunction<ckq.d> g = aya.a(ckq.d::a, values(), aya.a.c);
      public static final yt<ByteBuf, ckq.d> f = yr.a(g, ckq.d::a);
      final int h;
      private final String i;

      private d(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static ckq.d a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
