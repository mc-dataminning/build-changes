import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chg extends cgm implements bvv<chg.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final akk<Integer> ce = ako.a(chg.class, akm.b);
   private static final alh cf = alh.b("killer_bunny");
   private static final int cg = 3;
   private static final int ch = 5;
   private static final alh ci = alh.b("evil");
   private static final int cj = 8;
   private static final int ck = 40;
   private int cl;
   private int cm;
   private boolean cn;
   private int co;
   int cp;

   public chg(bug<? extends chg> $$0, dev $$1) {
      super($$0, $$1);
      this.bQ = new chg.c(this);
      this.bP = new chg.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbn(this));
      this.bS.a(1, new cbi(this, this.dX()));
      this.bS.a(1, new chg.e(this, 2.2));
      this.bS.a(2, new cbf(this, 0.8));
      this.bS.a(3, new cdb(this, 1.0, $$0 -> $$0.a(axi.at), false));
      this.bS.a(4, new chg.a<>(this, coh.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new chg.a<>(this, chp.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new chg.a<>(this, clm.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new chg.f(this));
      this.bS.a(6, new cdg(this, 0.6));
      this.bS.a(11, new ccb(this, coh.class, 10.0F));
   }

   @Override
   protected float fl() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.dE() + 0.5) {
         $$0 = 0.5F;
      }

      ers $$1 = this.bR.k();
      if ($$1 != null && !$$1.c()) {
         ezh $$2 = $$1.a(this);
         if ($$2.e > this.dE() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bP.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.A($$0 / 0.42F);
   }

   @Override
   public void v() {
      super.v();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dA().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new ezh(0.0, 0.0, 1.0));
         }
      }

      if (!this.dX().C) {
         this.dX().a(this, (byte)1);
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
         this.a(this.y(), this.fi(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void q() {
      this.t(true);
      this.cm = 10;
      this.cl = 0;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(ce, chg.g.a.j);
   }

   @Override
   public void ac() {
      if (this.co > 0) {
         this.co--;
      }

      if (this.cp > 0) {
         this.cp = this.cp - this.af.a(3);
         if (this.cp < 0) {
            this.cp = 0;
         }
      }

      if (this.aJ()) {
         if (!this.cn) {
            this.t(false);
            this.gz();
         }

         if (this.gv() == chg.g.g && this.co == 0) {
            buv $$0 = this.m();
            if ($$0 != null && this.g((btz)$$0) < 16.0) {
               this.c($$0.dC(), $$0.dI());
               this.bP.a($$0.dC(), $$0.dE(), $$0.dI(), this.bP.c());
               this.q();
               this.cn = true;
            }
         }

         chg.c $$1 = (chg.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.co == 0) {
               ers $$2 = this.bR.k();
               ezh $$3 = new ezh(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.d, $$3.f);
               this.q();
            }
         } else if (!$$1.d()) {
            this.gw();
         }
      }

      this.cn = this.aJ();
   }

   @Override
   public boolean bw() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(azj.d($$1 - this.dI(), $$0 - this.dC()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gw() {
      ((chg.c)this.bQ).a(true);
   }

   private void gx() {
      ((chg.c)this.bQ).a(false);
   }

   private void gy() {
      if (this.bP.c() < 2.2) {
         this.co = 10;
      } else {
         this.co = 1;
      }
   }

   private void gz() {
      this.gy();
      this.gx();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.cl != this.cm) {
         this.cl++;
      } else if (this.cm != 0) {
         this.cl = 0;
         this.cm = 0;
         this.t(false);
      }
   }

   public static bwc.a t() {
      return cgm.gA().a(bwd.s, 3.0).a(bwd.v, 0.3F).a(bwd.c, 3.0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gv().j);
      $$0.a("MoreCarrotTicks", this.cp);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a(chg.g.a($$0.h("RabbitType")));
      this.cp = $$0.h("MoreCarrotTicks");
   }

   protected awj y() {
      return awk.va;
   }

   @Override
   protected awj w() {
      return awk.uW;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.uZ;
   }

   @Override
   protected awj o_() {
      return awk.uY;
   }

   @Override
   public void gm() {
      if (this.gv() == chg.g.g) {
         this.a(awk.uX, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awl dn() {
      return this.gv() == chg.g.g ? awl.f : awl.g;
   }

   @Nullable
   public chg b(arm $$0, btq $$1) {
      chg $$2 = bug.aG.a($$0, buf.e);
      if ($$2 != null) {
         chg.g $$3;
         $$3 = a($$0, this.dx());
         label16:
         if (this.af.a(20) != 0) {
            if ($$1 instanceof chg $$4 && this.af.h()) {
               $$3 = $$4.gv();
               break label16;
            }

            $$3 = this.gv();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.at);
   }

   public chg.g gv() {
      return chg.g.a(this.am.a(ce));
   }

   public void a(chg.g $$0) {
      if ($$0 == chg.g.g) {
         this.g(bwd.a).a(8.0);
         this.bS.a(4, new ccd(this, 1.4, true));
         this.bT.a(1, new cdl(this).a());
         this.bT.a(2, new cdm<>(this, coh.class, true));
         this.bT.a(2, new cdm<>(this, chp.class, true));
         this.g(bwd.c).a(new bwb(ci, 5.0, bwb.a.a));
         if (!this.am()) {
            this.b(xh.c(ad.a("entity", cf)));
         }
      } else {
         this.g(bwd.c).c(ci);
      }

      this.am.a(ce, $$0.j);
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      chg.g $$4 = a($$0, this.dx());
      if ($$3 instanceof chg.b) {
         $$4 = ((chg.b)$$3).a;
      } else {
         $$3 = new chg.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static chg.g a(dew $$0, jg $$1) {
      jp<dfw> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(awy.al)) {
         return $$3 < 80 ? chg.g.b : chg.g.d;
      } else if ($$2.a(awy.ak)) {
         return chg.g.e;
      } else {
         return $$3 < 50 ? chg.g.a : ($$3 < 90 ? chg.g.f : chg.g.c);
      }
   }

   public static boolean c(bug<chg> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      return $$1.a_($$3.e()).a(awz.ce) && a((ddx)$$1, $$3);
   }

   boolean gH() {
      return this.cp <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bx();
         this.cm = 10;
         this.cl = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, (double)(0.6F * this.cT()), (double)(this.ds() * 0.4F));
   }

   static class a<T extends buv> extends cba<T> {
      private final chg i;

      public a(chg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gv() != chg.g.g && super.b();
      }
   }

   public static class b extends btq.a {
      public final chg.g a;

      public b(chg.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cau {
      private final chg b;
      private boolean c;

      public c(chg $$0) {
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
            this.b.q();
            this.a = false;
         }
      }
   }

   static class d extends caw {
      private final chg l;
      private double m;

      public d(chg $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.bk && !((chg.c)this.l.bQ).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bk()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends ccm {
      private final chg a;

      public e(chg $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends ccg {
      private final chg g;
      private boolean h;
      private boolean i;

      public f(chg $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!this.g.dX().ac().b(der.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gH();
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
         this.g.K().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ad());
         if (this.m()) {
            dev $$0 = this.g.dX();
            jg $$1 = this.e.d();
            dvd $$2 = $$0.a_($$1);
            dhy $$3 = $$2.b();
            if (this.i && $$3 instanceof diq) {
               int $$4 = $$2.c(diq.f);
               if ($$4 == 0) {
                  $$0.a($$1, dia.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(diq.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(eaa.c, $$1, eaa.a.a(this.g));
                  $$0.c(2001, $$1, dhy.j($$2));
               }

               this.g.cp = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dey $$0, jg $$1) {
         dvd $$2 = $$0.a_($$1);
         if ($$2.a(dia.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof diq && ((diq)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements baf {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<chg.g> i = aya.a(chg.g::a, values(), a);
      public static final Codec<chg.g> h = baf.a(chg.g::values);
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

      public static chg.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
