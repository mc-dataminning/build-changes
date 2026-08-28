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

   public boolean gn() {
      return false;
   }

   private void x(int $$0) {
      this.ao.a(cb, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ayw $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int go() {
      return this.ao.a(cb);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("Variant", this.gv().g);
      $$0.a("Strength", this.go());
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

   public static buv.a gu() {
      return s().a(buw.m, 40.0);
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cb, 0);
      $$0.a(cc, 0);
   }

   public chl.d gv() {
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
         if (this.gz() && this.g() == 0 && this.gp()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.ew() < this.eN() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dO().a(lm.O, this.d(1.0), this.dw() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dO().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gz()) && this.gF() < this.gL()) {
         $$5 = true;
         if (!this.dO().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aX()) {
         avo $$6 = this.gm();
         if ($$6 != null) {
            this.dO().a(null, this.dt(), this.dv(), this.dz(), this.gm(), this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fc() {
      return this.ex() || this.gC();
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
   protected boolean gl() {
      return false;
   }

   @Override
   protected avo gJ() {
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
   protected avo gm() {
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
      return this.t() ? this.go() : 0;
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
   public cti gw() {
      return n(this.a(bsy.g));
   }

   @Override
   public int gL() {
      return 30;
   }

   @Override
   public boolean a(cfe $$0) {
      return $$0 != this && $$0 instanceof chl && this.gS() && ((chl)$$0).gS();
   }

   @Nullable
   public chl b(aqu $$0, bsl $$1) {
      chl $$2 = this.gx();
      if ($$2 != null) {
         this.a($$1, $$2);
         chl $$3 = (chl)$$1;
         int $$4 = this.ah.a(Math.max(this.go(), $$3.go())) + 1;
         if (this.ah.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.ah.h() ? this.gv() : $$3.gv());
      }

      return $$2;
   }

   @Nullable
   protected chl gx() {
      return bsx.an.a(this.dO());
   }

   private void k(btn $$0) {
      cno $$1 = new cno(this.dO(), this);
      double $$2 = $$0.dt() - this.dt();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dv();
      double $$4 = $$0.dz() - this.dz();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aX()) {
         this.dO().a(null, this.dt(), this.dv(), this.dz(), avp.oe, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dO().b($$1);
      this.cf = true;
   }

   void E(boolean $$0) {
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
               for (bsr $$4 : this.cW()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eJ();
         return true;
      }
   }

   public void gy() {
      if (this.cg != null) {
         this.cg.ch = null;
      }

      this.cg = null;
   }

   public void a(chl $$0) {
      this.cg = $$0;
      this.cg.ch = this;
   }

   public boolean gV() {
      return this.ch != null;
   }

   public boolean gW() {
      return this.cg != null;
   }

   @Nullable
   public chl gX() {
      return this.cg;
   }

   @Override
   protected double gj() {
      return 2.0;
   }

   @Override
   protected void gM() {
      if (!this.gW() && this.o_()) {
         super.gM();
      }
   }

   @Override
   public boolean gN() {
      return false;
   }

   @Override
   public void a(btn $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public exc cM() {
      return new exc(0.0, 0.75 * (double)this.cL(), (double)this.dj() * 0.5);
   }

   @Override
   public bsu e(bua $$0) {
      return this.o_() ? ce : super.e($$0);
   }

   @Override
   protected exc a(bsr $$0, bsu $$1, float $$2) {
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
            $$0.E(false);
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
