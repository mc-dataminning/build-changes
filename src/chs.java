import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chs extends cgy implements bwh<chs.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final ajy<Integer> ce = akc.a(chs.class, aka.b);
   private static final akv cf = akv.b("killer_bunny");
   private static final int cg = 3;
   private static final int ch = 5;
   private static final akv ci = akv.b("evil");
   private static final int cj = 8;
   private static final int ck = 40;
   private int cl;
   private int cm;
   private boolean cn;
   private int co;
   int cp;

   public chs(bus<? extends chs> $$0, dgi $$1) {
      super($$0, $$1);
      this.bQ = new chs.c(this);
      this.bP = new chs.d(this);
      this.i(0.0);
   }

   @Override
   protected void E() {
      this.bS.a(1, new cbz(this));
      this.bS.a(1, new cbu(this, this.dV()));
      this.bS.a(1, new chs.e(this, 2.2));
      this.bS.a(2, new cbr(this, 0.8));
      this.bS.a(3, new cdn(this, 1.0, $$0 -> $$0.a(awy.aw), false));
      this.bS.a(4, new chs.a<>(this, cox.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new chs.a<>(this, cib.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new chs.a<>(this, cly.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new chs.f(this));
      this.bS.a(6, new cds(this, 0.6));
      this.bS.a(11, new ccn(this, cox.class, 10.0F));
   }

   @Override
   protected float fj() {
      float $$0 = 0.3F;
      if (this.bP.c() <= 0.6) {
         $$0 = 0.2F;
      }

      etn $$1 = this.bR.i();
      if ($$1 != null && !$$1.c()) {
         fba $$2 = $$1.a(this);
         if ($$2.e > this.dC() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.P || this.bm && this.bP.e() > this.dC() + 0.5) {
         $$0 = 0.5F;
      }

      return super.A($$0 / 0.42F);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dy().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fba(0.0, 0.0, 1.0));
         }
      }

      if (!this.dV().C) {
         this.dV().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.cm == 0 ? 0.0F : ((float)this.cl + $$0) / (float)this.cm;
   }

   public void i(double $$0) {
      this.P().a($$0);
      this.bP.a(this.bP.d(), this.bP.e(), this.bP.f(), $$0);
   }

   @Override
   public void t(boolean $$0) {
      super.t($$0);
      if ($$0) {
         this.a(this.x(), this.fg(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   public void p() {
      this.t(true);
      this.cm = 10;
      this.cl = 0;
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ce, chs.g.a.j);
   }

   @Override
   public void a(ard $$0) {
      if (this.co > 0) {
         this.co--;
      }

      if (this.cp > 0) {
         this.cp = this.cp - this.ae.a(3);
         if (this.cp < 0) {
            this.cp = 0;
         }
      }

      if (this.aJ()) {
         if (!this.cn) {
            this.t(false);
            this.gw();
         }

         if (this.gs() == chs.g.g && this.co == 0) {
            bvh $$1 = this.O_();
            if ($$1 != null && this.g((bul)$$1) < 16.0) {
               this.c($$1.dA(), $$1.dG());
               this.bP.a($$1.dA(), $$1.dC(), $$1.dG(), this.bP.c());
               this.p();
               this.cn = true;
            }
         }

         chs.c $$2 = (chs.c)this.bQ;
         if (!$$2.c()) {
            if (this.bP.b() && this.co == 0) {
               etn $$3 = this.bR.i();
               fba $$4 = new fba(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.p();
            }
         } else if (!$$2.d()) {
            this.gt();
         }
      }

      this.cn = this.aJ();
   }

   @Override
   public boolean bv() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(ayz.d($$1 - this.dG(), $$0 - this.dA()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gt() {
      ((chs.c)this.bQ).a(true);
   }

   private void gu() {
      ((chs.c)this.bQ).a(false);
   }

   private void gv() {
      if (this.bP.c() < 2.2) {
         this.co = 10;
      } else {
         this.co = 1;
      }
   }

   private void gw() {
      this.gv();
      this.gu();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.cl != this.cm) {
         this.cl++;
      } else if (this.cm != 0) {
         this.cl = 0;
         this.cm = 0;
         this.t(false);
      }
   }

   public static bwo.a t() {
      return cgy.gx().a(bwp.s, 3.0).a(bwp.v, 0.3F).a(bwp.c, 3.0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gs().j);
      $$0.a("MoreCarrotTicks", this.cp);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(chs.g.a($$0.h("RabbitType")));
      this.cp = $$0.h("MoreCarrotTicks");
   }

   protected avz x() {
      return awa.vB;
   }

   @Override
   protected avz u() {
      return awa.vx;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.vA;
   }

   @Override
   protected avz o_() {
      return awa.vz;
   }

   @Override
   public void gj() {
      if (this.gs() == chs.g.g) {
         this.a(awa.vy, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awb dm() {
      return this.gs() == chs.g.g ? awb.f : awb.g;
   }

   @Nullable
   public chs b(ard $$0, buc $$1) {
      chs $$2 = bus.aX.a($$0, bur.e);
      if ($$2 != null) {
         chs.g $$3;
         $$3 = a($$0, this.dv());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof chs $$4 && this.ae.h()) {
               $$3 = $$4.gs();
               break label16;
            }

            $$3 = this.gs();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean j(cwp $$0) {
      return $$0.a(awy.aw);
   }

   public chs.g gs() {
      return chs.g.a(this.al.a(ce));
   }

   public void a(chs.g $$0) {
      if ($$0 == chs.g.g) {
         this.g(bwp.a).a(8.0);
         this.bS.a(4, new ccp(this, 1.4, true));
         this.bT.a(1, new cdx(this).a());
         this.bT.a(2, new cdy<>(this, cox.class, true));
         this.bT.a(2, new cdy<>(this, cib.class, true));
         this.g(bwp.c).a(new bwn(ci, 5.0, bwn.a.a));
         if (!this.l_()) {
            this.b(wp.c(af.a("entity", cf)));
         }
      } else {
         this.g(bwp.c).c(ci);
      }

      this.al.a(ce, $$0.j);
   }

   @Nullable
   @Override
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      chs.g $$4 = a($$0, this.dv());
      if ($$3 instanceof chs.b) {
         $$4 = ((chs.b)$$3).a;
      } else {
         $$3 = new chs.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static chs.g a(dgj $$0, ji $$1) {
      jr<dhk> $$2 = $$0.t($$1);
      int $$3 = $$0.H_().a(100);
      if ($$2.a(awo.al)) {
         return $$3 < 80 ? chs.g.b : chs.g.d;
      } else if ($$2.a(awo.ak)) {
         return chs.g.e;
      } else {
         return $$3 < 50 ? chs.g.a : ($$3 < 90 ? chs.g.f : chs.g.c);
      }
   }

   public static boolean c(bus<chs> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cf) && a((dfk)$$1, $$3);
   }

   boolean gE() {
      return this.cp <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bw();
         this.cm = 10;
         this.cl = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public fba cT() {
      return new fba(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   static class a<T extends bvh> extends cbm<T> {
      private final chs i;

      public a(chs $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gs() != chs.g.g && super.b();
      }
   }

   public static class b extends buc.a {
      public final chs.g a;

      public b(chs.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cbg {
      private final chs b;
      private boolean c;

      public c(chs $$0) {
         super($$0);
         this.b = $$0;
      }

      public boolean c() {
         return this.a;
      }

      public boolean d() {
         return this.c;
      }

      public void a(boolean $$0) {
         this.c = $$0;
      }

      @Override
      public void b() {
         if (this.a) {
            this.b.p();
            this.a = false;
         }
      }
   }

   static class d extends cbi {
      private final chs l;
      private double m;

      public d(chs $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.bm && !((chs.c)this.l.bQ).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == cbi.a.d) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bj()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends ccy {
      private final chs a;

      public e(chs $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends ccs {
      private final chs g;
      private boolean h;
      private boolean i;

      public f(chs $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().b(dge.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gE();
         }

         return super.b();
      }

      @Override
      public boolean c() {
         return this.i && super.c();
      }

      @Override
      public void a() {
         super.a();
         this.g.L().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ad());
         if (this.m()) {
            dgi $$0 = this.g.dV();
            ji $$1 = this.e.d();
            dwx $$2 = $$0.a_($$1);
            djm $$3 = $$2.b();
            if (this.i && $$3 instanceof dkf) {
               int $$4 = $$2.c(dkf.f);
               if ($$4 == 0) {
                  $$0.a($$1, djo.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dkf.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(ebt.c, $$1, ebt.a.a(this.g));
                  $$0.c(2001, $$1, djm.j($$2));
               }

               this.g.cp = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dgl $$0, ji $$1) {
         dwx $$2 = $$0.a_($$1);
         if ($$2.a(djo.cK) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dkf && ((dkf)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements azv {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<chs.g> i = axq.a(chs.g::a, values(), a);
      public static final Codec<chs.g> h = azv.a(chs.g::values);
      final int j;
      private final String k;

      private g(final int $$0, final String $$1) {
         this.j = $$0;
         this.k = $$1;
      }

      @Override
      public String c() {
         return this.k;
      }

      public int a() {
         return this.j;
      }

      public static chs.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
