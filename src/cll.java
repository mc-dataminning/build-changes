import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cll extends clh implements cos {
   private static final int bG = 5;
   private static final akj<Integer> bH = akn.a(cll.class, akl.b);
   private static final akj<Integer> bI = akn.a(cll.class, akl.b);
   private static final bwl bK = bwr.ax.n().a(bwk.a().a(bwj.a, 0.0F, bwr.ax.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean bL;
   @Nullable
   private cll bM;
   @Nullable
   private cll bN;

   public cll(bwr<? extends cll> $$0, djm $$1) {
      super($$0, $$1);
      this.O().a(40.0F);
   }

   public boolean gw() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bH, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azv $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gx() {
      return this.al.a(bH);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Variant", cll.d.f, this.gG());
      $$0.a("Strength", this.gx());
   }

   @Override
   public void a(tz $$0) {
      this.w($$0.f("Strength"));
      super.a($$0);
      this.a($$0.<cll.d>a("Variant", cll.d.f).orElse(cll.d.a));
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cfj(this, 1.2));
      this.bD.a(2, new cem(this, 2.1F));
      this.bD.a(3, new cfe(this, 1.25, 40, 20.0F));
      this.bD.a(3, new cey(this, 1.2));
      this.bD.a(4, new cdr(this, 1.0));
      this.bD.a(5, new cfn(this, 1.25, $$0 -> $$0.a(axk.as), false));
      this.bD.a(6, new cee(this, 1.0));
      this.bD.a(7, new cfs(this, 0.7));
      this.bD.a(8, new cen(this, crm.class, 6.0F));
      this.bD.a(9, new cfa(this));
      this.bE.a(1, new cll.c(this));
      this.bE.a(2, new cll.a(this));
   }

   public static byo.a gF() {
      return q();
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bH, 0);
      $$0.a(bI, 0);
   }

   public cll.d gG() {
      return cll.d.a(this.al.a(bI));
   }

   private void a(cll.d $$0) {
      this.al.a(bI, $$0.i);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aN ? c((kj<T>)$$0, this.gG()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aN);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aN) {
         this.a(c(kk.aN, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean i(czn $$0) {
      return $$0.a(axk.ar);
   }

   @Override
   protected boolean a(crm $$0, czn $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(czr.qk)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dmt.iL.h())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gK() && this.g() == 0 && this.gA()) {
            $$5 = true;
            this.e($$0);
         }
      }

      if (this.eF() < this.eT() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.n_() && $$2 > 0) {
         this.dU().a(ly.Q, this.d(1.0), this.dC() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dU().C) {
            this.b_($$2);
            $$5 = true;
         }
      }

      if ($$3 > 0 && ($$5 || !this.gK()) && this.gQ() < this.gV() && !this.dU().C) {
         this.u($$3);
         $$5 = true;
      }

      if ($$5 && !this.aZ()) {
         awm $$6 = this.gv();
         if ($$6 != null) {
            this.dU().a(null, this.dz(), this.dB(), this.dF(), this.gv(), this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean ff() {
      return this.eG() || this.gN();
   }

   @Nullable
   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      azv $$4 = $$0.C_();
      this.b($$4);
      cll.d $$5;
      if ($$3 instanceof cll.b) {
         $$5 = ((cll.b)$$3).a;
      } else {
         $$5 = ag.a(cll.d.values(), $$4);
         $$3 = new cll.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gu() {
      return false;
   }

   @Override
   protected awm gT() {
      return awn.oL;
   }

   @Override
   protected awm u() {
      return awn.oK;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.oP;
   }

   @Override
   protected awm l_() {
      return awn.oN;
   }

   @Nullable
   @Override
   protected awm gv() {
      return awn.oO;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.oR, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awn.oM, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int Z_() {
      return this.t() ? this.gx() : 0;
   }

   @Override
   public boolean e(bws $$0) {
      return true;
   }

   @Override
   public int gV() {
      return 30;
   }

   @Override
   public boolean a(ciz $$0) {
      return $$0 != this && $$0 instanceof cll && this.hb() && ((cll)$$0).hb();
   }

   @Nullable
   public cll b(arq $$0, bvy $$1) {
      cll $$2 = this.gH();
      if ($$2 != null) {
         this.a($$1, $$2);
         cll $$3 = (cll)$$1;
         int $$4 = this.ae.a(Math.max(this.gx(), $$3.gx())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gG() : $$3.gG());
      }

      return $$2;
   }

   @Nullable
   protected cll gH() {
      return bwr.ax.a(this.dU(), bwq.e);
   }

   private void k(bxj $$0) {
      csg $$1 = new csg(this.dU(), this);
      double $$2 = $$0.dz() - this.dz();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dB();
      double $$4 = $$0.dF() - this.dF();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dU() instanceof arq $$6) {
         csh.a($$1, $$6, czn.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.aZ()) {
         this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.oQ, this.dl(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.bL = true;
   }

   void D(boolean $$0) {
      this.bL = $$0;
   }

   @Override
   public boolean a(double $$0, float $$1, bux $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0) {
            this.a($$2, (float)$$3);
            this.b($$0, $$1, $$2);
         }

         this.eP();
         return true;
      }
   }

   public void gI() {
      if (this.bM != null) {
         this.bM.bN = null;
      }

      this.bM = null;
   }

   public void a(cll $$0) {
      this.bM = $$0;
      this.bM.bN = this;
   }

   public boolean gJ() {
      return this.bN != null;
   }

   public boolean hd() {
      return this.bM != null;
   }

   @Nullable
   public cll he() {
      return this.bM;
   }

   @Override
   protected double gs() {
      return 2.0;
   }

   @Override
   protected void g(arq $$0) {
      if (!this.hd() && this.n_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gW() {
      return false;
   }

   @Override
   public void a(bxj $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ffc cS() {
      return new ffc(0.0, 0.75 * (double)this.cR(), (double)this.dp() * 0.5);
   }

   @Override
   public bwl e(bxv $$0) {
      return this.n_() ? bK : super.e($$0);
   }

   @Override
   protected ffc a(bwi $$0, bwl $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cfy<cmb> {
      public a(cll $$0) {
         super($$0, cmb.class, 16, false, true, ($$0x, $$1) -> !((cmb)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bvy.a {
      public final cll.d a;

      b(cll.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cfx {
      public c(cll $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cll $$0 && $$0.bL) {
            $$0.D(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bak {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      private static final IntFunction<cll.d> h = ayc.a(cll.d::a, values(), ayc.a.c);
      public static final Codec<cll.d> e = bak.a(cll.d::values);
      @Deprecated
      public static final Codec<cll.d> f = Codec.INT.xmap(h::apply, cll.d::a);
      public static final yw<ByteBuf, cll.d> g = yu.a(h, cll.d::a);
      final int i;
      private final String j;

      private d(final int $$0, final String $$1) {
         this.i = $$0;
         this.j = $$1;
      }

      public int a() {
         return this.i;
      }

      public static cll.d a(int $$0) {
         return h.apply($$0);
      }

      @Override
      public String c() {
         return this.j;
      }
   }
}
