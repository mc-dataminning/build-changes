import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chq extends cgw implements bwf<chq.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final ajx<Integer> ce = akb.a(chq.class, ajz.b);
   private static final aku cf = aku.b("killer_bunny");
   private static final int cg = 3;
   private static final int ch = 5;
   private static final aku ci = aku.b("evil");
   private static final int cj = 8;
   private static final int ck = 40;
   private int cl;
   private int cm;
   private boolean cn;
   private int co;
   int cp;

   public chq(buq<? extends chq> $$0, dgg $$1) {
      super($$0, $$1);
      this.bQ = new chq.c(this);
      this.bP = new chq.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cbx(this));
      this.bS.a(1, new cbs(this, this.dW()));
      this.bS.a(1, new chq.e(this, 2.2));
      this.bS.a(2, new cbp(this, 0.8));
      this.bS.a(3, new cdl(this, 1.0, $$0 -> $$0.a(awx.aw), false));
      this.bS.a(4, new chq.a<>(this, cov.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new chq.a<>(this, chz.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new chq.a<>(this, clw.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new chq.f(this));
      this.bS.a(6, new cdq(this, 0.6));
      this.bS.a(11, new ccl(this, cov.class, 10.0F));
   }

   @Override
   protected float fj() {
      float $$0 = 0.3F;
      if (this.bP.c() <= 0.6) {
         $$0 = 0.2F;
      }

      etl $$1 = this.bR.i();
      if ($$1 != null && !$$1.c()) {
         fay $$2 = $$1.a(this);
         if ($$2.e > this.dD() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.P || this.bm && this.bP.e() > this.dD() + 0.5) {
         $$0 = 0.5F;
      }

      return super.A($$0 / 0.42F);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dz().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fay(0.0, 0.0, 1.0));
         }
      }

      if (!this.dW().C) {
         this.dW().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.cm == 0 ? 0.0F : ((float)this.cl + $$0) / (float)this.cm;
   }

   public void i(double $$0) {
      this.L().a($$0);
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
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(ce, chq.g.a.j);
   }

   @Override
   public void a(arc $$0) {
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
            this.gt();
         }

         if (this.gp() == chq.g.g && this.co == 0) {
            bvf $$1 = this.O_();
            if ($$1 != null && this.g((buj)$$1) < 16.0) {
               this.c($$1.dB(), $$1.dH());
               this.bP.a($$1.dB(), $$1.dD(), $$1.dH(), this.bP.c());
               this.p();
               this.cn = true;
            }
         }

         chq.c $$2 = (chq.c)this.bQ;
         if (!$$2.c()) {
            if (this.bP.b() && this.co == 0) {
               etl $$3 = this.bR.i();
               fay $$4 = new fay(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.p();
            }
         } else if (!$$2.d()) {
            this.gq();
         }
      }

      this.cn = this.aJ();
   }

   @Override
   public boolean bv() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(ayy.d($$1 - this.dH(), $$0 - this.dB()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gq() {
      ((chq.c)this.bQ).a(true);
   }

   private void gr() {
      ((chq.c)this.bQ).a(false);
   }

   private void gs() {
      if (this.bP.c() < 2.2) {
         this.co = 10;
      } else {
         this.co = 1;
      }
   }

   private void gt() {
      this.gs();
      this.gr();
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

   public static bwm.a t() {
      return cgw.gu().a(bwn.s, 3.0).a(bwn.v, 0.3F).a(bwn.c, 3.0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gp().j);
      $$0.a("MoreCarrotTicks", this.cp);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(chq.g.a($$0.h("RabbitType")));
      this.cp = $$0.h("MoreCarrotTicks");
   }

   protected avy x() {
      return avz.vB;
   }

   @Override
   protected avy u() {
      return avz.vx;
   }

   @Override
   protected avy e(bsz $$0) {
      return avz.vA;
   }

   @Override
   protected avy o_() {
      return avz.vz;
   }

   @Override
   public void gg() {
      if (this.gp() == chq.g.g) {
         this.a(avz.vy, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awa dn() {
      return this.gp() == chq.g.g ? awa.f : awa.g;
   }

   @Nullable
   public chq b(arc $$0, bua $$1) {
      chq $$2 = buq.aX.a($$0, bup.e);
      if ($$2 != null) {
         chq.g $$3;
         $$3 = a($$0, this.dw());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof chq $$4 && this.ae.h()) {
               $$3 = $$4.gp();
               break label16;
            }

            $$3 = this.gp();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean j(cwn $$0) {
      return $$0.a(awx.aw);
   }

   public chq.g gp() {
      return chq.g.a(this.al.a(ce));
   }

   public void a(chq.g $$0) {
      if ($$0 == chq.g.g) {
         this.g(bwn.a).a(8.0);
         this.bS.a(4, new ccn(this, 1.4, true));
         this.bT.a(1, new cdv(this).a());
         this.bT.a(2, new cdw<>(this, cov.class, true));
         this.bT.a(2, new cdw<>(this, chz.class, true));
         this.g(bwn.c).a(new bwl(ci, 5.0, bwl.a.a));
         if (!this.l_()) {
            this.b(wo.c(af.a("entity", cf)));
         }
      } else {
         this.g(bwn.c).c(ci);
      }

      this.al.a(ce, $$0.j);
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      chq.g $$4 = a($$0, this.dw());
      if ($$3 instanceof chq.b) {
         $$4 = ((chq.b)$$3).a;
      } else {
         $$3 = new chq.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static chq.g a(dgh $$0, ji $$1) {
      jr<dhi> $$2 = $$0.t($$1);
      int $$3 = $$0.H_().a(100);
      if ($$2.a(awn.al)) {
         return $$3 < 80 ? chq.g.b : chq.g.d;
      } else if ($$2.a(awn.ak)) {
         return chq.g.e;
      } else {
         return $$3 < 50 ? chq.g.a : ($$3 < 90 ? chq.g.f : chq.g.c);
      }
   }

   public static boolean c(buq<chq> $$0, dgh $$1, bup $$2, ji $$3, azg $$4) {
      return $$1.a_($$3.e()).a(awo.cf) && a((dfi)$$1, $$3);
   }

   boolean gB() {
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
   public fay cT() {
      return new fay(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   static class a<T extends bvf> extends cbk<T> {
      private final chq i;

      public a(chq $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gp() != chq.g.g && super.b();
      }
   }

   public static class b extends bua.a {
      public final chq.g a;

      public b(chq.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cbe {
      private final chq b;
      private boolean c;

      public c(chq $$0) {
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

   static class d extends cbg {
      private final chq l;
      private double m;

      public d(chq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.bm && !((chq.c)this.l.bQ).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == cbg.a.d) {
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

   static class e extends ccw {
      private final chq a;

      public e(chq $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends ccq {
      private final chq g;
      private boolean h;
      private boolean i;

      public f(chq $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().b(dgc.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gB();
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
         this.g.H().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.aa());
         if (this.m()) {
            dgg $$0 = this.g.dW();
            ji $$1 = this.e.d();
            dwv $$2 = $$0.a_($$1);
            djk $$3 = $$2.b();
            if (this.i && $$3 instanceof dkd) {
               int $$4 = $$2.c(dkd.f);
               if ($$4 == 0) {
                  $$0.a($$1, djm.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dkd.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(ebr.c, $$1, ebr.a.a(this.g));
                  $$0.c(2001, $$1, djk.j($$2));
               }

               this.g.cp = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dgj $$0, ji $$1) {
         dwv $$2 = $$0.a_($$1);
         if ($$2.a(djm.cK) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dkd && ((dkd)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements azu {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<chq.g> i = axp.a(chq.g::a, values(), a);
      public static final Codec<chq.g> h = azu.a(chq.g::values);
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

      public static chq.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
