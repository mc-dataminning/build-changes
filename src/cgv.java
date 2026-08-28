import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgv extends cgr implements bty<cgv.d>, cjr {
   private static final int cb = 5;
   private static final ajp<Integer> cd = ajt.a(cgv.class, ajr.b);
   private static final ajp<Integer> ce = ajt.a(cgv.class, ajr.b);
   private static final bsg cf = bsj.an.n().a(bsf.a().a(bse.a, 0.0F, bsj.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cg;
   @Nullable
   private cgv ch;
   @Nullable
   private cgv ci;

   public cgv(bsj<? extends cgv> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public boolean gw() {
      return false;
   }

   private void w(int $$0) {
      this.ao.a(cd, Math.max(1, Math.min(5, $$0)));
   }

   private void b(aym $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gx() {
      return this.ao.a(cd);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz().g);
      $$0.a("Strength", this.gx());
   }

   @Override
   public void a(tx $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cgv.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzq(this));
      this.bU.a(1, new cba(this, 1.2));
      this.bU.a(2, new cad(this, 2.1F));
      this.bU.a(3, new cav(this, 1.25, 40, 20.0F));
      this.bU.a(3, new cap(this, 1.2));
      this.bU.a(4, new bzi(this, 1.0));
      this.bU.a(5, new cbe(this, 1.25, $$0 -> $$0.a(awd.ao), false));
      this.bU.a(6, new bzv(this, 1.0));
      this.bU.a(7, new cbj(this, 0.7));
      this.bU.a(8, new cae(this, cmh.class, 6.0F));
      this.bU.a(9, new car(this));
      this.bV.a(1, new cgv.c(this));
      this.bV.a(2, new cgv.a(this));
   }

   public static buf.a gy() {
      return s().a(bug.m, 40.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, 0);
   }

   public cgv.d gz() {
      return cgv.d.a(this.ao.a(ce));
   }

   public void a(cgv.d $$0) {
      this.ao.a(ce, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.u() ? 1 + 3 * this.gv() : super.ab_();
   }

   @Override
   public boolean o(cua $$0) {
      return $$0.a(awd.an);
   }

   @Override
   protected boolean a(cmh $$0, cua $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cud.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dfh.ij.r())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gC() && this.g() == 0 && this.go()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ew() < this.eN() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.p_() && $$2 > 0) {
         this.dP().a(lj.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dP().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gC()) && this.gI() < this.gN()) {
         $$5 = true;
         if (!this.dP().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aW()) {
         ave $$6 = this.gu();
         if ($$6 != null) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), this.gu(), this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fc() {
      return this.ex() || this.gF();
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      aym $$4 = $$0.E_();
      this.b($$4);
      cgv.d $$5;
      if ($$3 instanceof cgv.b) {
         $$5 = ((cgv.b)$$3).a;
      } else {
         $$5 = ac.a(cgv.d.values(), $$4);
         $$3 = new cgv.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   protected ave gL() {
      return avf.nZ;
   }

   @Override
   protected ave v() {
      return avf.nY;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.od;
   }

   @Override
   protected ave o_() {
      return avf.ob;
   }

   @Nullable
   @Override
   protected ave gu() {
      return avf.oc;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.of, 0.15F, 1.0F);
   }

   @Override
   protected void gn() {
      this.a(avf.oa, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gv() {
      return this.gx();
   }

   @Override
   public boolean fO() {
      return true;
   }

   @Override
   public boolean l(cua $$0) {
      return $$0.a(awd.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Nullable
   private static cst n(cua $$0) {
      dff $$1 = dff.a($$0.g());
      return $$1 instanceof dpa ? ((dpa)$$1).b() : null;
   }

   @Nullable
   public cst gA() {
      return n(this.a(bsk.g));
   }

   @Override
   public int gN() {
      return 30;
   }

   @Override
   public boolean a(ceo $$0) {
      return $$0 != this && $$0 instanceof cgv && this.gU() && ((cgv)$$0).gU();
   }

   @Nullable
   public cgv b(aqk $$0, brx $$1) {
      cgv $$2 = this.gB();
      if ($$2 != null) {
         this.a($$1, $$2);
         cgv $$3 = (cgv)$$1;
         int $$4 = this.ah.a(Math.max(this.gx(), $$3.gx())) + 1;
         if (this.ah.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ah.h() ? this.gz() : $$3.gz());
      }

      return $$2;
   }

   @Nullable
   protected cgv gB() {
      return bsj.an.a(this.dP());
   }

   private void k(bsy $$0) {
      cmy $$1 = new cmy(this.dP(), this);
      double $$2 = $$0.du() - this.du();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dw();
      double $$4 = $$0.dA() - this.dA();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aW()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), avf.oe, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dP().b($$1);
      this.cg = true;
   }

   void D(boolean $$0) {
      this.cg = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bqw $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bS()) {
               for (bsd $$4 : this.cW()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eJ();
         return true;
      }
   }

   public void gX() {
      if (this.ch != null) {
         this.ch.ci = null;
      }

      this.ch = null;
   }

   public void a(cgv $$0) {
      this.ch = $$0;
      this.ch.ci = this;
   }

   public boolean gY() {
      return this.ci != null;
   }

   public boolean gZ() {
      return this.ch != null;
   }

   @Nullable
   public cgv ha() {
      return this.ch;
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
   public void a(bsy $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public evz cM() {
      return new evz(0.0, 0.75 * (double)this.cL(), (double)this.dj() * 0.5);
   }

   @Override
   public bsg e(btk $$0) {
      return this.p_() ? cf : super.e($$0);
   }

   @Override
   protected evz a(bsd $$0, bsg $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cbp<cfr> {
      public a(cgv $$0) {
         super($$0, cfr.class, 16, false, true, $$0x -> !((cfr)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends brx.a {
      public final cgv.d a;

      b(cgv.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cbo {
      public c(cgv $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cgv $$0 && $$0.cg) {
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

      public static final Codec<cgv.d> e = ayz.a(cgv.d::values);
      private static final IntFunction<cgv.d> f = awu.a(cgv.d::a, values(), awu.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cgv.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
