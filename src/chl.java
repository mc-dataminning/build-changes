import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chl extends chh implements buo<chl.d>, ckh {
   private static final int ca = 5;
   private static final ajw<Integer> cb = aka.a(chl.class, ajy.b);
   private static final ajw<Integer> cc = aka.a(chl.class, ajy.b);
   private static final bsu ce = bsx.an.n().a(bst.a().a(bss.a, 0.0F, bsx.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cf;
   @Nullable
   private chl cg;
   @Nullable
   private chl ch;

   public chl(bsx<? extends chl> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public boolean go() {
      return false;
   }

   private void x(int $$0) {
      this.ao.a(cb, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ayw $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gp() {
      return this.ao.a(cb);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Variant", this.gw().g);
      $$0.a("Strength", this.gp());
   }

   @Override
   public void a(ub $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(chl.d.a($$0.h("Variant")));
   }

   @Override
   protected void B() {
      this.bU.a(0, new cag(this));
      this.bU.a(1, new cbq(this, 1.2));
      this.bU.a(2, new cat(this, 2.1F));
      this.bU.a(3, new cbl(this, 1.25, 40, 20.0F));
      this.bU.a(3, new cbf(this, 1.2));
      this.bU.a(4, new bzy(this, 1.0));
      this.bU.a(5, new cbu(this, 1.25, $$0 -> $$0.a(awn.ao), false));
      this.bU.a(6, new cal(this, 1.0));
      this.bU.a(7, new cbz(this, 0.7));
      this.bU.a(8, new cau(this, cmx.class, 6.0F));
      this.bU.a(9, new cbh(this));
      this.bV.a(1, new chl.c(this));
      this.bV.a(2, new chl.a(this));
   }

   public static buv.a gv() {
      return s().a(buw.m, 40.0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
   }

   public chl.d gw() {
      return chl.d.a(this.ao.a(cc));
   }

   public void a(chl.d $$0) {
      this.ao.a(cc, $$0.g);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.an);
   }

   @Override
   protected boolean a(cmx $$0, cuq $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cut.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dga.ij.r())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gA() && this.g() == 0 && this.gq()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.ex() < this.eO() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dP().a(lm.O, this.d(1.0), this.dx() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dP().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gA()) && this.gG() < this.gM()) {
         $$5 = true;
         if (!this.dP().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aX()) {
         avo $$6 = this.gn();
         if ($$6 != null) {
            this.dP().a(null, this.du(), this.dw(), this.dA(), this.gn(), this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fd() {
      return this.ey() || this.gD();
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      ayw $$4 = $$0.E_();
      this.b($$4);
      chl.d $$5;
      if ($$3 instanceof chl.b) {
         $$5 = ((chl.b)$$3).a;
      } else {
         $$5 = ad.a(chl.d.values(), $$4);
         $$3 = new chl.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gm() {
      return false;
   }

   @Override
   protected avo gK() {
      return avp.nZ;
   }

   @Override
   protected avo v() {
      return avp.nY;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.od;
   }

   @Override
   protected avo n_() {
      return avp.ob;
   }

   @Nullable
   @Override
   protected avo gn() {
      return avp.oc;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.of, 0.15F, 1.0F);
   }

   @Override
   protected void x() {
      this.a(avp.oa, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.t() ? this.gp() : 0;
   }

   @Override
   public boolean d(bsy $$0) {
      return true;
   }

   @Override
   public boolean l(cuq $$0) {
      return $$0.a(awn.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Nullable
   private static cti n(cuq $$0) {
      dfy $$1 = dfy.a($$0.g());
      return $$1 instanceof dpu ? ((dpu)$$1).b() : null;
   }

   @Nullable
   public cti gx() {
      return n(this.a(bsy.g));
   }

   @Override
   public int gM() {
      return 30;
   }

   @Override
   public boolean a(cfe $$0) {
      return $$0 != this && $$0 instanceof chl && this.gT() && ((chl)$$0).gT();
   }

   @Nullable
   public chl b(aqu $$0, bsl $$1) {
      chl $$2 = this.gy();
      if ($$2 != null) {
         this.a($$1, $$2);
         chl $$3 = (chl)$$1;
         int $$4 = this.ah.a(Math.max(this.gp(), $$3.gp())) + 1;
         if (this.ah.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.ah.h() ? this.gw() : $$3.gw());
      }

      return $$2;
   }

   @Nullable
   protected chl gy() {
      return bsx.an.a(this.dP());
   }

   private void k(btn $$0) {
      cno $$1 = new cno(this.dP(), this);
      double $$2 = $$0.du() - this.du();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dw();
      double $$4 = $$0.dA() - this.dA();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aX()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), avp.oe, this.df(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dP().b($$1);
      this.cf = true;
   }

   void D(boolean $$0) {
      this.cf = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, brk $$2) {
      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bT()) {
               for (bsr $$4 : this.cX()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eK();
         return true;
      }
   }

   public void gz() {
      if (this.cg != null) {
         this.cg.ch = null;
      }

      this.cg = null;
   }

   public void a(chl $$0) {
      this.cg = $$0;
      this.cg.ch = this;
   }

   public boolean gW() {
      return this.ch != null;
   }

   public boolean gX() {
      return this.cg != null;
   }

   @Nullable
   public chl gY() {
      return this.cg;
   }

   @Override
   protected double gk() {
      return 2.0;
   }

   @Override
   protected void gN() {
      if (!this.gX() && this.o_()) {
         super.gN();
      }
   }

   @Override
   public boolean gO() {
      return false;
   }

   @Override
   public void a(btn $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public exa cN() {
      return new exa(0.0, 0.75 * (double)this.cM(), (double)this.dk() * 0.5);
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? ce : super.e($$0);
   }

   @Override
   protected exa a(bsr $$0, bsu $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends ccf<cgh> {
      public a(chl $$0) {
         super($$0, cgh.class, 16, false, true, $$0x -> !((cgh)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bsl.a {
      public final chl.d a;

      b(chl.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cce {
      public c(chl $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof chl $$0 && $$0.cf) {
            $$0.D(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements azk {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<chl.d> e = azk.a(chl.d::values);
      private static final IntFunction<chl.d> f = axe.a(chl.d::a, values(), axe.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static chl.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
