import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgz extends cgv implements buc<cgz.d>, cjv {
   private static final int cb = 5;
   private static final ajp<Integer> cd = ajt.a(cgz.class, ajr.b);
   private static final ajp<Integer> ce = ajt.a(cgz.class, ajr.b);
   private static final bsk cf = bsn.an.n().a(bsj.a().a(bsi.a, 0.0F, bsn.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cg;
   @Nullable
   private cgz ch;
   @Nullable
   private cgz ci;

   public cgz(bsn<? extends cgz> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public boolean gw() {
      return false;
   }

   private void w(int $$0) {
      this.ao.a(cd, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ayo $$0) {
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
      this.a(cgz.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzu(this));
      this.bU.a(1, new cbe(this, 1.2));
      this.bU.a(2, new cah(this, 2.1F));
      this.bU.a(3, new caz(this, 1.25, 40, 20.0F));
      this.bU.a(3, new cat(this, 1.2));
      this.bU.a(4, new bzm(this, 1.0));
      this.bU.a(5, new cbi(this, 1.25, $$0 -> $$0.a(awf.ao), false));
      this.bU.a(6, new bzz(this, 1.0));
      this.bU.a(7, new cbn(this, 0.7));
      this.bU.a(8, new cai(this, cml.class, 6.0F));
      this.bU.a(9, new cav(this));
      this.bV.a(1, new cgz.c(this));
      this.bV.a(2, new cgz.a(this));
   }

   public static buj.a gy() {
      return s().a(buk.m, 40.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, 0);
   }

   public cgz.d gz() {
      return cgz.d.a(this.ao.a(ce));
   }

   public void a(cgz.d $$0) {
      this.ao.a(ce, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.t() ? 1 + 3 * this.gv() : super.ab_();
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.an);
   }

   @Override
   protected boolean a(cml $$0, cud $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cug.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dfk.ij.r())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gC() && this.g() == 0 && this.go()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ey() < this.eP() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dR().a(lj.O, this.d(1.0), this.dz() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dR().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gC()) && this.gI() < this.gN()) {
         $$5 = true;
         if (!this.dR().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aY()) {
         avg $$6 = this.gu();
         if ($$6 != null) {
            this.dR().a(null, this.dw(), this.dy(), this.dC(), this.gu(), this.dg(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fe() {
      return this.ez() || this.gF();
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      ayo $$4 = $$0.E_();
      this.b($$4);
      cgz.d $$5;
      if ($$3 instanceof cgz.b) {
         $$5 = ((cgz.b)$$3).a;
      } else {
         $$5 = ac.a(cgz.d.values(), $$4);
         $$3 = new cgz.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   protected avg gL() {
      return avh.nZ;
   }

   @Override
   protected avg v() {
      return avh.nY;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.od;
   }

   @Override
   protected avg n_() {
      return avh.ob;
   }

   @Nullable
   @Override
   protected avg gu() {
      return avh.oc;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.of, 0.15F, 1.0F);
   }

   @Override
   protected void gn() {
      this.a(avh.oa, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gv() {
      return this.gx();
   }

   @Override
   public boolean d(bso $$0) {
      return true;
   }

   @Override
   public boolean l(cud $$0) {
      return $$0.a(awf.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Nullable
   private static csw n(cud $$0) {
      dfi $$1 = dfi.a($$0.g());
      return $$1 instanceof dpd ? ((dpd)$$1).b() : null;
   }

   @Nullable
   public csw gA() {
      return n(this.a(bso.g));
   }

   @Override
   public int gN() {
      return 30;
   }

   @Override
   public boolean a(ces $$0) {
      return $$0 != this && $$0 instanceof cgz && this.gU() && ((cgz)$$0).gU();
   }

   @Nullable
   public cgz b(aqm $$0, bsb $$1) {
      cgz $$2 = this.gB();
      if ($$2 != null) {
         this.a($$1, $$2);
         cgz $$3 = (cgz)$$1;
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
   protected cgz gB() {
      return bsn.an.a(this.dR());
   }

   private void k(btc $$0) {
      cnc $$1 = new cnc(this.dR(), this);
      double $$2 = $$0.dw() - this.dw();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dy();
      double $$4 = $$0.dC() - this.dC();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aY()) {
         this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.oe, this.dg(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dR().b($$1);
      this.cg = true;
   }

   void D(boolean $$0) {
      this.cg = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bra $$2) {
      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bU()) {
               for (bsh $$4 : this.cY()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eL();
         return true;
      }
   }

   public void gX() {
      if (this.ch != null) {
         this.ch.ci = null;
      }

      this.ch = null;
   }

   public void a(cgz $$0) {
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
   public cgz ha() {
      return this.ch;
   }

   @Override
   protected double gm() {
      return 2.0;
   }

   @Override
   protected void gO() {
      if (!this.gZ() && this.o_()) {
         super.gO();
      }
   }

   @Override
   public boolean gP() {
      return false;
   }

   @Override
   public void a(btc $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ewh cO() {
      return new ewh(0.0, 0.75 * (double)this.cN(), (double)this.dl() * 0.5);
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? cf : super.e($$0);
   }

   @Override
   protected ewh a(bsh $$0, bsk $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cbt<cfv> {
      public a(cgz $$0) {
         super($$0, cfv.class, 16, false, true, $$0x -> !((cfv)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bsb.a {
      public final cgz.d a;

      b(cgz.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cbs {
      public c(cgz $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cgz $$0 && $$0.cg) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements azc {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cgz.d> e = azc.a(cgz.d::values);
      private static final IntFunction<cgz.d> f = aww.a(cgz.d::a, values(), aww.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cgz.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
