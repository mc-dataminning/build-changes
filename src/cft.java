import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cft extends ces {
   private static final ajp<ja> cb = ajt.a(cft.class, ajr.o);
   private static final ajp<Boolean> cd = ajt.a(cft.class, ajr.k);
   private static final ajp<Boolean> ce = ajt.a(cft.class, ajr.k);
   private static final ajp<ja> cf = ajt.a(cft.class, ajr.o);
   private static final ajp<Boolean> cg = ajt.a(cft.class, ajr.k);
   private static final ajp<Boolean> ch = ajt.a(cft.class, ajr.k);
   private static final float ci = 0.3F;
   private static final bsk cj = bsn.bh.n().a(bsj.a().a(bsi.a, 0.0F, bsn.bh.m(), -0.25F)).a(0.3F);
   int ck;
   public static final Predicate<btc> ca = $$0 -> $$0.o_() && !$$0.bg();

   public cft(bsn<? extends cft> $$0, dcg $$1) {
      super($$0, $$1);
      this.a(epa.j, 0.0F);
      this.a(epa.t, -1.0F);
      this.a(epa.s, -1.0F);
      this.a(epa.r, -1.0F);
      this.bR = new cft.e(this);
   }

   public void h(ja $$0) {
      this.ao.a(cb, $$0);
   }

   ja gn() {
      return this.ao.a(cb);
   }

   void i(ja $$0) {
      this.ao.a(cf, $$0);
   }

   ja gt() {
      return this.ao.a(cf);
   }

   public boolean s() {
      return this.ao.a(cd);
   }

   void w(boolean $$0) {
      this.ao.a(cd, $$0);
   }

   public boolean t() {
      return this.ao.a(ce);
   }

   void x(boolean $$0) {
      this.ck = $$0 ? 1 : 0;
      this.ao.a(ce, $$0);
   }

   boolean gu() {
      return this.ao.a(cg);
   }

   void y(boolean $$0) {
      this.ao.a(cg, $$0);
   }

   boolean gv() {
      return this.ao.a(ch);
   }

   void z(boolean $$0) {
      this.ao.a(ch, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(cb, ja.c);
      $$0.a(cd, false);
      $$0.a(cf, ja.c);
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ce, false);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("HomePosX", this.gn().u());
      $$0.a("HomePosY", this.gn().v());
      $$0.a("HomePosZ", this.gn().w());
      $$0.a("HasEgg", this.s());
      $$0.a("TravelPosX", this.gt().u());
      $$0.a("TravelPosY", this.gt().v());
      $$0.a("TravelPosZ", this.gt().w());
   }

   @Override
   public void a(tx $$0) {
      int $$1 = $$0.h("HomePosX");
      int $$2 = $$0.h("HomePosY");
      int $$3 = $$0.h("HomePosZ");
      this.h(new ja($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("HasEgg"));
      int $$4 = $$0.h("TravelPosX");
      int $$5 = $$0.h("TravelPosY");
      int $$6 = $$0.h("TravelPosZ");
      this.i(new ja($$4, $$5, $$6));
   }

   @Nullable
   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      this.h(this.dr());
      this.i(ja.c);
      return super.a($$0, $$1, $$2, $$3);
   }

   public static boolean c(bsn<cft> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      return $$3.v() < $$1.z_() + 4 && doa.a($$1, $$3) && a($$1, $$3);
   }

   @Override
   protected void z() {
      this.bU.a(0, new cft.f(this, 1.2));
      this.bU.a(1, new cft.a(this, 1.0));
      this.bU.a(1, new cft.d(this, 1.0));
      this.bU.a(2, new cbi(this, 1.1, $$0 -> $$0.a(awf.av), false));
      this.bU.a(3, new cft.c(this, 1.0));
      this.bU.a(4, new cft.b(this, 1.0));
      this.bU.a(7, new cft.i(this, 1.0));
      this.bU.a(8, new cai(this, cml.class, 8.0F));
      this.bU.a(9, new cft.h(this, 1.0, 100));
   }

   public static buj.a x() {
      return bte.A().a(buk.s, 30.0).a(buk.v, 0.25).a(buk.B, 1.0);
   }

   @Override
   public boolean cE() {
      return false;
   }

   @Override
   public int P() {
      return 200;
   }

   @Nullable
   @Override
   protected avg v() {
      return !this.bg() && this.aG() && !this.o_() ? avh.Af : super.v();
   }

   @Override
   protected void f(float $$0) {
      super.f($$0 * 1.5F);
   }

   @Override
   protected avg aR() {
      return avh.Aq;
   }

   @Nullable
   @Override
   protected avg d(bra $$0) {
      return this.o_() ? avh.Am : avh.Al;
   }

   @Nullable
   @Override
   protected avg n_() {
      return this.o_() ? avh.Ah : avh.Ag;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      avg $$2 = this.o_() ? avh.Ap : avh.Ao;
      this.a($$2, 0.15F, 1.0F);
   }

   @Override
   public boolean go() {
      return super.go() && !this.s();
   }

   @Override
   protected float aQ() {
      return this.aa + 0.15F;
   }

   @Override
   public float ec() {
      return this.o_() ? 0.3F : 1.0F;
   }

   @Override
   protected cco b(dcg $$0) {
      return new cft.g(this, $$0);
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      return bsn.bh.a((dcg)$$0);
   }

   @Override
   public boolean o(cud $$0) {
      return $$0.a(awf.av);
   }

   @Override
   public float a(ja $$0, dcj $$1) {
      if (!this.gu() && $$1.b_($$0).a(awc.a)) {
         return 10.0F;
      } else {
         return doa.a($$1, $$0) ? 10.0F : $$1.w($$0);
      }
   }

   @Override
   public void m_() {
      super.m_();
      if (this.bF() && this.t() && this.ck >= 1 && this.ck % 5 == 0) {
         ja $$0 = this.dr();
         if (doa.a(this.dR(), $$0)) {
            this.dR().c(2001, $$0, dfi.i(this.dR().a_($$0.d())));
            this.a(dxh.u);
         }
      }
   }

   @Override
   protected void k() {
      super.k();
      if (!this.o_() && this.dR().ab().b(dcc.f)) {
         this.a(cug.op, 1);
      }
   }

   @Override
   public void a(ewh $$0) {
      if (this.dc() && this.bg()) {
         this.a(0.1F, $$0);
         this.a(bth.a, this.du());
         this.j(this.du().a(0.9));
         if (this.p() == null && (!this.gu() || !this.gn().a(this.dp(), 20.0))) {
            this.j(this.du().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cml $$0) {
      return false;
   }

   @Override
   public void a(aqm $$0, btb $$1) {
      this.a(this.dS().c(), Float.MAX_VALUE);
   }

   @Override
   public bsk e(bto $$0) {
      return this.o_() ? cj : super.e($$0);
   }

   static class a extends bzm {
      private final cft d;

      a(cft $$0, double $$1) {
         super($$0, $$1);
         this.d = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.s();
      }

      @Override
      protected void g() {
         aqn $$0 = this.a.gq();
         if ($$0 == null && this.c.gq() != null) {
            $$0 = this.c.gq();
         }

         if ($$0 != null) {
            $$0.a(avr.P);
            am.p.a($$0, this.a, this.c, null);
         }

         this.d.w(true);
         this.a.c_(6000);
         this.c.c_(6000);
         this.a.gs();
         this.c.gs();
         ayo $$1 = this.a.dU();
         if (this.b.ab().b(dcc.f)) {
            this.b.b(new bss(this.b, this.a.dw(), this.a.dy(), this.a.dC(), $$1.a(7) + 1));
         }
      }
   }

   static class b extends caa {
      private final cft a;
      private final double b;
      private boolean c;
      private int d;
      private static final int e = 600;

      b(cft $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         if (this.a.o_()) {
            return false;
         } else if (this.a.s()) {
            return true;
         } else {
            return this.a.dU().a(b(700)) != 0 ? false : !this.a.gn().a(this.a.dp(), 64.0);
         }
      }

      @Override
      public void c() {
         this.a.y(true);
         this.c = false;
         this.d = 0;
      }

      @Override
      public void d() {
         this.a.y(false);
      }

      @Override
      public boolean b() {
         return !this.a.gn().a(this.a.dp(), 7.0) && !this.c && this.d <= this.a(600);
      }

      @Override
      public void e() {
         ja $$0 = this.a.gn();
         boolean $$1 = $$0.a(this.a.dp(), 16.0);
         if ($$1) {
            this.d++;
         }

         if (this.a.J().l()) {
            ewh $$2 = ewh.c($$0);
            ewh $$3 = cdx.a(this.a, 16, 3, $$2, (float) (Math.PI / 10));
            if ($$3 == null) {
               $$3 = cdx.a(this.a, 8, 7, $$2, (float) (Math.PI / 2));
            }

            if ($$3 != null && !$$1 && !this.a.dR().a_(ja.a($$3)).a(dfk.G)) {
               $$3 = cdx.a(this.a, 16, 5, $$2, (float) (Math.PI / 2));
            }

            if ($$3 == null) {
               this.c = true;
               return;
            }

            this.a.J().a($$3.c, $$3.d, $$3.e, this.b);
         }
      }
   }

   static class c extends can {
      private static final int g = 1200;
      private final cft h;

      c(cft $$0, double $$1) {
         super($$0, $$0.o_() ? 2.0 : $$1, 24);
         this.h = $$0;
         this.f = -1;
      }

      @Override
      public boolean b() {
         return !this.h.bg() && this.d <= 1200 && this.a(this.h.dR(), this.e);
      }

      @Override
      public boolean a() {
         if (this.h.o_() && !this.h.bg()) {
            return super.a();
         } else {
            return !this.h.gu() && !this.h.bg() && !this.h.s() ? super.a() : false;
         }
      }

      @Override
      public boolean l() {
         return this.d % 160 == 0;
      }

      @Override
      protected boolean a(dcj $$0, ja $$1) {
         return $$0.a_($$1).a(dfk.G);
      }
   }

   static class d extends can {
      private final cft g;

      d(cft $$0, double $$1) {
         super($$0, $$1, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         return this.g.s() && this.g.gn().a(this.g.dp(), 9.0) ? super.a() : false;
      }

      @Override
      public boolean b() {
         return super.b() && this.g.s() && this.g.gn().a(this.g.dp(), 9.0);
      }

      @Override
      public void e() {
         super.e();
         ja $$0 = this.g.dr();
         if (!this.g.bg() && this.m()) {
            if (this.g.ck < 1) {
               this.g.x(true);
            } else if (this.g.ck > this.a(200)) {
               dcg $$1 = this.g.dR();
               $$1.a(null, $$0, avh.An, avi.e, 0.3F, 0.9F + $$1.z.i() * 0.2F);
               ja $$2 = this.e.c();
               dsl $$3 = dfk.mf.o().a(doa.f, Integer.valueOf(this.g.ah.a(4) + 1));
               $$1.a($$2, $$3, 3);
               $$1.a(dxh.i, $$2, dxh.a.a(this.g, $$3));
               this.g.w(false);
               this.g.x(false);
               this.g.s(600);
            }

            if (this.g.t()) {
               this.g.ck++;
            }
         }
      }

      @Override
      protected boolean a(dcj $$0, ja $$1) {
         return !$$0.u($$1.c()) ? false : doa.b($$0, $$1);
      }
   }

   static class e extends bzd {
      private final cft l;

      e(cft $$0) {
         super($$0);
         this.l = $$0;
      }

      private void g() {
         if (this.l.bg()) {
            this.l.j(this.l.du().b(0.0, 0.005, 0.0));
            if (!this.l.gn().a(this.l.dp(), 16.0)) {
               this.l.z(Math.max(this.l.fl() / 2.0F, 0.08F));
            }

            if (this.l.o_()) {
               this.l.z(Math.max(this.l.fl() / 3.0F, 0.06F));
            }
         } else if (this.l.aG()) {
            this.l.z(Math.max(this.l.fl() / 2.0F, 0.06F));
         }
      }

      @Override
      public void a() {
         this.g();
         if (this.k == bzd.a.b && !this.l.J().l()) {
            double $$0 = this.e - this.l.dw();
            double $$1 = this.f - this.l.dy();
            double $$2 = this.g - this.l.dC();
            double $$3 = Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2);
            if ($$3 < 1.0E-5F) {
               this.d.z(0.0F);
            } else {
               $$1 /= $$3;
               float $$4 = (float)(ayg.d($$2, $$0) * 180.0F / (float)Math.PI) - 90.0F;
               this.l.s(this.a(this.l.dH(), $$4, 90.0F));
               this.l.aZ = this.l.dH();
               float $$5 = (float)(this.h * this.l.g(buk.v));
               this.l.z(ayg.i(0.125F, this.l.fl(), $$5));
               this.l.j(this.l.du().b(0.0, (double)this.l.fl() * $$1 * 0.1, 0.0));
            }
         } else {
            this.l.z(0.0F);
         }
      }
   }

   static class f extends cat {
      f(cft $$0, double $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a() {
         if (!this.h()) {
            return false;
         } else {
            ja $$0 = this.a(this.b.dR(), this.b, 7);
            if ($$0 != null) {
               this.d = (double)$$0.u();
               this.e = (double)$$0.v();
               this.f = (double)$$0.w();
               return true;
            } else {
               return this.i();
            }
         }
      }
   }

   static class g extends ccl {
      g(cft $$0, dcg $$1) {
         super($$0, $$1);
      }

      @Override
      public boolean a(ja $$0) {
         if (this.a instanceof cft $$1 && $$1.gv()) {
            return this.b.a_($$0).a(dfk.G);
         }

         return !this.b.a_($$0.d()).i();
      }
   }

   static class h extends cax {
      private final cft i;

      h(cft $$0, double $$1, int $$2) {
         super($$0, $$1, $$2);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.b.bg() && !this.i.gu() && !this.i.s() ? super.a() : false;
      }
   }

   static class i extends caa {
      private final cft a;
      private final double b;
      private boolean c;

      i(cft $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public boolean a() {
         return !this.a.gu() && !this.a.s() && this.a.bg();
      }

      @Override
      public void c() {
         int $$0 = 512;
         int $$1 = 4;
         ayo $$2 = this.a.ah;
         int $$3 = $$2.a(1025) - 512;
         int $$4 = $$2.a(9) - 4;
         int $$5 = $$2.a(1025) - 512;
         if ((double)$$4 + this.a.dy() > (double)(this.a.dR().z_() - 1)) {
            $$4 = 0;
         }

         ja $$6 = ja.a((double)$$3 + this.a.dw(), (double)$$4 + this.a.dy(), (double)$$5 + this.a.dC());
         this.a.i($$6);
         this.a.z(true);
         this.c = false;
      }

      @Override
      public void e() {
         if (this.a.J().l()) {
            ewh $$0 = ewh.c(this.a.gt());
            ewh $$1 = cdx.a(this.a, 16, 3, $$0, (float) (Math.PI / 10));
            if ($$1 == null) {
               $$1 = cdx.a(this.a, 8, 7, $$0, (float) (Math.PI / 2));
            }

            if ($$1 != null) {
               int $$2 = ayg.a($$1.c);
               int $$3 = ayg.a($$1.e);
               int $$4 = 34;
               if (!this.a.dR().b($$2 - 34, $$3 - 34, $$2 + 34, $$3 + 34)) {
                  $$1 = null;
               }
            }

            if ($$1 == null) {
               this.c = true;
               return;
            }

            this.a.J().a($$1.c, $$1.d, $$1.e, this.b);
         }
      }

      @Override
      public boolean b() {
         return !this.a.J().l() && !this.c && !this.a.gu() && !this.a.gr() && !this.a.s();
      }

      @Override
      public void d() {
         this.a.z(false);
         super.d();
      }
   }
}
