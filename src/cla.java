import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cla extends ckw implements cnx {
   private static final int bF = 5;
   private static final akh<Integer> bG = akl.a(cla.class, akj.b);
   private static final akh<Integer> bH = akl.a(cla.class, akj.b);
   private static final bwd bJ = bwj.ax.n().a(bwc.a().a(bwb.a, 0.0F, bwj.ax.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean bK;
   @Nullable
   private cla bL;
   @Nullable
   private cla bM;

   public cla(bwj<? extends cla> $$0, dip $$1) {
      super($$0, $$1);
      this.O().a(40.0F);
   }

   public boolean gt() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bG, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azt $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gu() {
      return this.al.a(bG);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gD().h);
      $$0.a("Strength", this.gu());
   }

   @Override
   public void a(tx $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cla.d.a($$0.h("Variant")));
   }

   @Override
   protected void D() {
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new cez(this, 1.2));
      this.bC.a(2, new cec(this, 2.1F));
      this.bC.a(3, new ceu(this, 1.25, 40, 20.0F));
      this.bC.a(3, new ceo(this, 1.2));
      this.bC.a(4, new cdh(this, 1.0));
      this.bC.a(5, new cfd(this, 1.25, $$0 -> $$0.a(axi.ar), false));
      this.bC.a(6, new cdu(this, 1.0));
      this.bC.a(7, new cfi(this, 0.7));
      this.bC.a(8, new ced(this, cqs.class, 6.0F));
      this.bC.a(9, new ceq(this));
      this.bD.a(1, new cla.c(this));
      this.bD.a(2, new cla.a(this));
   }

   public static bye.a gC() {
      return q();
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bG, 0);
      $$0.a(bH, 0);
   }

   public cla.d gD() {
      return cla.d.a(this.al.a(bH));
   }

   private void a(cla.d $$0) {
      this.al.a(bH, $$0.h);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aK ? c((ki<T>)$$0, this.gD()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aK);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aK) {
         this.a(c(kj.aK, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.aq);
   }

   @Override
   protected boolean a(cqs $$0, cys $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cyw.qf)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dlw.iH.h())) {
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
         this.dV().a(lx.Q, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
         awk $$6 = this.gs();
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
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      azt $$4 = $$0.C_();
      this.b($$4);
      cla.d $$5;
      if ($$3 instanceof cla.b) {
         $$5 = ((cla.b)$$3).a;
      } else {
         $$5 = af.a(cla.d.values(), $$4);
         $$3 = new cla.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   protected awk gQ() {
      return awl.oH;
   }

   @Override
   protected awk u() {
      return awl.oG;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.oL;
   }

   @Override
   protected awk l_() {
      return awl.oJ;
   }

   @Nullable
   @Override
   protected awk gs() {
      return awl.oK;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.oN, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(awl.oI, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int aa_() {
      return this.t() ? this.gu() : 0;
   }

   @Override
   public boolean e(bwk $$0) {
      return true;
   }

   @Override
   public int gS() {
      return 30;
   }

   @Override
   public boolean a(cio $$0) {
      return $$0 != this && $$0 instanceof cla && this.gY() && ((cla)$$0).gY();
   }

   @Nullable
   public cla b(aro $$0, bvq $$1) {
      cla $$2 = this.gE();
      if ($$2 != null) {
         this.a($$1, $$2);
         cla $$3 = (cla)$$1;
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
   protected cla gE() {
      return bwj.ax.a(this.dV(), bwi.e);
   }

   private void k(bwz $$0) {
      crl $$1 = new crl(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof aro $$6) {
         crm.a($$1, $$6, cys.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.oM, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.bK = true;
   }

   void D(boolean $$0) {
      this.bK = $$0;
   }

   @Override
   public boolean a(double $$0, float $$1, bup $$2) {
      int $$3 = this.a($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0) {
            this.a($$2, (float)$$3);
            if (this.ca()) {
               for (bwa $$4 : this.dc()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eP();
         return true;
      }
   }

   public void gF() {
      if (this.bL != null) {
         this.bL.bM = null;
      }

      this.bL = null;
   }

   public void a(cla $$0) {
      this.bL = $$0;
      this.bL.bM = this;
   }

   public boolean gG() {
      return this.bM != null;
   }

   public boolean ha() {
      return this.bL != null;
   }

   @Nullable
   public cla hb() {
      return this.bL;
   }

   @Override
   protected double gp() {
      return 2.0;
   }

   @Override
   protected void g(aro $$0) {
      if (!this.ha() && this.n_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gT() {
      return false;
   }

   @Override
   public void a(bwz $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public fdw cT() {
      return new fdw(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public bwd e(bxl $$0) {
      return this.n_() ? bJ : super.e($$0);
   }

   @Override
   protected fdw a(bwa $$0, bwd $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cfo<cju> {
      public a(cla $$0) {
         super($$0, cju.class, 16, false, true, ($$0x, $$1) -> !((cju)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bvq.a {
      public final cla.d a;

      b(cla.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cfn {
      public c(cla $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cla $$0 && $$0.bK) {
            $$0.D(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bai {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cla.d> e = bai.a(cla.d::values);
      private static final IntFunction<cla.d> g = aya.a(cla.d::a, values(), aya.a.c);
      public static final yu<ByteBuf, cla.d> f = ys.a(g, cla.d::a);
      final int h;
      private final String i;

      private d(final int $$0, final String $$1) {
         this.h = $$0;
         this.i = $$1;
      }

      public int a() {
         return this.h;
      }

      public static cla.d a(int $$0) {
         return g.apply($$0);
      }

      @Override
      public String c() {
         return this.i;
      }
   }
}
