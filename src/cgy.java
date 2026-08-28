import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgy extends cgu implements bub<cgy.d>, cju {
   private static final int cb = 5;
   private static final ajp<Integer> cd = ajt.a(cgy.class, ajr.b);
   private static final ajp<Integer> ce = ajt.a(cgy.class, ajr.b);
   private static final bsj cf = bsm.an.n().a(bsi.a().a(bsh.a, 0.0F, bsm.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cg;
   @Nullable
   private cgy ch;
   @Nullable
   private cgy ci;

   public cgy(bsm<? extends cgy> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public boolean gx() {
      return false;
   }

   private void w(int $$0) {
      this.ao.a(cd, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ayo $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gy() {
      return this.ao.a(cd);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Variant", this.gA().g);
      $$0.a("Strength", this.gy());
   }

   @Override
   public void a(tx $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cgy.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bU.a(0, new bzt(this));
      this.bU.a(1, new cbd(this, 1.2));
      this.bU.a(2, new cag(this, 2.1F));
      this.bU.a(3, new cay(this, 1.25, 40, 20.0F));
      this.bU.a(3, new cas(this, 1.2));
      this.bU.a(4, new bzl(this, 1.0));
      this.bU.a(5, new cbh(this, 1.25, $$0 -> $$0.a(awf.ao), false));
      this.bU.a(6, new bzy(this, 1.0));
      this.bU.a(7, new cbm(this, 0.7));
      this.bU.a(8, new cah(this, cmk.class, 6.0F));
      this.bU.a(9, new cau(this));
      this.bV.a(1, new cgy.c(this));
      this.bV.a(2, new cgy.a(this));
   }

   public static bui.a gz() {
      return s().a(buj.m, 40.0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, 0);
   }

   public cgy.d gA() {
      return cgy.d.a(this.ao.a(ce));
   }

   public void a(cgy.d $$0) {
      this.ao.a(ce, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.u() ? 1 + 3 * this.gw() : super.ab_();
   }

   @Override
   public boolean o(cuc $$0) {
      return $$0.a(awf.an);
   }

   @Override
   protected boolean a(cmk $$0, cuc $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cuf.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dfj.ij.r())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gD() && this.g() == 0 && this.gp()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ex() < this.eO() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.p_() && $$2 > 0) {
         this.dQ().a(lj.O, this.d(1.0), this.dy() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dQ().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gD()) && this.gJ() < this.gO()) {
         $$5 = true;
         if (!this.dQ().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aX()) {
         avg $$6 = this.gv();
         if ($$6 != null) {
            this.dQ().a(null, this.dv(), this.dx(), this.dB(), this.gv(), this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fd() {
      return this.ey() || this.gG();
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      ayo $$4 = $$0.E_();
      this.b($$4);
      cgy.d $$5;
      if ($$3 instanceof cgy.b) {
         $$5 = ((cgy.b)$$3).a;
      } else {
         $$5 = ac.a(cgy.d.values(), $$4);
         $$3 = new cgy.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gu() {
      return false;
   }

   @Override
   protected avg gM() {
      return avh.nZ;
   }

   @Override
   protected avg v() {
      return avh.nY;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.od;
   }

   @Override
   protected avg o_() {
      return avh.ob;
   }

   @Nullable
   @Override
   protected avg gv() {
      return avh.oc;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.of, 0.15F, 1.0F);
   }

   @Override
   protected void go() {
      this.a(avh.oa, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gw() {
      return this.gy();
   }

   @Override
   public boolean fP() {
      return true;
   }

   @Override
   public boolean l(cuc $$0) {
      return $$0.a(awf.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Nullable
   private static csv n(cuc $$0) {
      dfh $$1 = dfh.a($$0.g());
      return $$1 instanceof dpc ? ((dpc)$$1).b() : null;
   }

   @Nullable
   public csv gB() {
      return n(this.a(bsn.g));
   }

   @Override
   public int gO() {
      return 30;
   }

   @Override
   public boolean a(cer $$0) {
      return $$0 != this && $$0 instanceof cgy && this.gV() && ((cgy)$$0).gV();
   }

   @Nullable
   public cgy b(aqm $$0, bsa $$1) {
      cgy $$2 = this.gC();
      if ($$2 != null) {
         this.a($$1, $$2);
         cgy $$3 = (cgy)$$1;
         int $$4 = this.ah.a(Math.max(this.gy(), $$3.gy())) + 1;
         if (this.ah.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ah.h() ? this.gA() : $$3.gA());
      }

      return $$2;
   }

   @Nullable
   protected cgy gC() {
      return bsm.an.a(this.dQ());
   }

   private void k(btb $$0) {
      cnb $$1 = new cnb(this.dQ(), this);
      double $$2 = $$0.dv() - this.dv();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dx();
      double $$4 = $$0.dB() - this.dB();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aX()) {
         this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.oe, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dQ().b($$1);
      this.cg = true;
   }

   void D(boolean $$0) {
      this.cg = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bqz $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bT()) {
               for (bsg $$4 : this.cX()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eK();
         return true;
      }
   }

   public void gY() {
      if (this.ch != null) {
         this.ch.ci = null;
      }

      this.ch = null;
   }

   public void a(cgy $$0) {
      this.ch = $$0;
      this.ch.ci = this;
   }

   public boolean gZ() {
      return this.ci != null;
   }

   public boolean ha() {
      return this.ch != null;
   }

   @Nullable
   public cgy hb() {
      return this.ch;
   }

   @Override
   protected double gn() {
      return 2.0;
   }

   @Override
   protected void gP() {
      if (!this.ha() && this.p_()) {
         super.gP();
      }
   }

   @Override
   public boolean gQ() {
      return false;
   }

   @Override
   public void a(btb $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ewf cN() {
      return new ewf(0.0, 0.75 * (double)this.cM(), (double)this.dk() * 0.5);
   }

   @Override
   public bsj e(btn $$0) {
      return this.p_() ? cf : super.e($$0);
   }

   @Override
   protected ewf a(bsg $$0, bsj $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cbs<cfu> {
      public a(cgy $$0) {
         super($$0, cfu.class, 16, false, true, $$0x -> !((cfu)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bsa.a {
      public final cgy.d a;

      b(cgy.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cbr {
      public c(cgy $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cgy $$0 && $$0.cg) {
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

      public static final Codec<cgy.d> e = azc.a(cgy.d::values);
      private static final IntFunction<cgy.d> f = aww.a(cgy.d::a, values(), aww.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cgy.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
