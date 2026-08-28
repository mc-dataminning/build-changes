import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class chr extends cgx implements bwg<chr.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final ajx<Integer> ce = akb.a(chr.class, ajz.b);
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

   public chr(bur<? extends chr> $$0, dgi $$1) {
      super($$0, $$1);
      this.bQ = new chr.c(this);
      this.bP = new chr.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bS.a(1, new cby(this));
      this.bS.a(1, new cbt(this, this.dW()));
      this.bS.a(1, new chr.e(this, 2.2));
      this.bS.a(2, new cbq(this, 0.8));
      this.bS.a(3, new cdm(this, 1.0, $$0 -> $$0.a(awy.aw), false));
      this.bS.a(4, new chr.a<>(this, cox.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new chr.a<>(this, cia.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new chr.a<>(this, clx.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new chr.f(this));
      this.bS.a(6, new cdr(this, 0.6));
      this.bS.a(11, new ccm(this, cox.class, 10.0F));
   }

   @Override
   protected float fj() {
      float $$0 = 0.3F;
      if (this.P || this.bP.b() && this.bP.e() > this.dD() + 0.5) {
         $$0 = 0.5F;
      }

      etn $$1 = this.bR.i();
      if ($$1 != null && !$$1.c()) {
         fba $$2 = $$1.a(this);
         if ($$2.e > this.dD() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bP.c() <= 0.6) {
         $$0 = 0.2F;
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
            this.a(0.1F, new fba(0.0, 0.0, 1.0));
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
      $$0.a(ce, chr.g.a.j);
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

         if (this.gp() == chr.g.g && this.co == 0) {
            bvg $$1 = this.O_();
            if ($$1 != null && this.g((buk)$$1) < 16.0) {
               this.c($$1.dB(), $$1.dH());
               this.bP.a($$1.dB(), $$1.dD(), $$1.dH(), this.bP.c());
               this.p();
               this.cn = true;
            }
         }

         chr.c $$2 = (chr.c)this.bQ;
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
      this.v((float)(ayz.d($$1 - this.dH(), $$0 - this.dB()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gq() {
      ((chr.c)this.bQ).a(true);
   }

   private void gr() {
      ((chr.c)this.bQ).a(false);
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

   public static bwn.a t() {
      return cgx.gu().a(bwo.s, 3.0).a(bwo.v, 0.3F).a(bwo.c, 3.0);
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
      this.a(chr.g.a($$0.h("RabbitType")));
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
   protected avz e(bta $$0) {
      return awa.vA;
   }

   @Override
   protected avz o_() {
      return awa.vz;
   }

   @Override
   public void gg() {
      if (this.gp() == chr.g.g) {
         this.a(awa.vy, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awb dn() {
      return this.gp() == chr.g.g ? awb.f : awb.g;
   }

   @Nullable
   public chr b(arc $$0, bub $$1) {
      chr $$2 = bur.aY.a($$0, buq.e);
      if ($$2 != null) {
         chr.g $$3;
         $$3 = a($$0, this.dw());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof chr $$4 && this.ae.h()) {
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
   public boolean j(cwp $$0) {
      return $$0.a(awy.aw);
   }

   public chr.g gp() {
      return chr.g.a(this.al.a(ce));
   }

   public void a(chr.g $$0) {
      if ($$0 == chr.g.g) {
         this.g(bwo.a).a(8.0);
         this.bS.a(4, new cco(this, 1.4, true));
         this.bT.a(1, new cdw(this).a());
         this.bT.a(2, new cdx<>(this, cox.class, true));
         this.bT.a(2, new cdx<>(this, cia.class, true));
         this.g(bwo.c).a(new bwm(ci, 5.0, bwm.a.a));
         if (!this.l_()) {
            this.b(wo.c(af.a("entity", cf)));
         }
      } else {
         this.g(bwo.c).c(ci);
      }

      this.al.a(ce, $$0.j);
   }

   @Nullable
   @Override
   public bvz a(dgz $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      chr.g $$4 = a($$0, this.dw());
      if ($$3 instanceof chr.b) {
         $$4 = ((chr.b)$$3).a;
      } else {
         $$3 = new chr.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static chr.g a(dgj $$0, ji $$1) {
      jr<dhk> $$2 = $$0.t($$1);
      int $$3 = $$0.H_().a(100);
      if ($$2.a(awo.al)) {
         return $$3 < 80 ? chr.g.b : chr.g.d;
      } else if ($$2.a(awo.ak)) {
         return chr.g.e;
      } else {
         return $$3 < 50 ? chr.g.a : ($$3 < 90 ? chr.g.f : chr.g.c);
      }
   }

   public static boolean c(bur<chr> $$0, dgj $$1, buq $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cf) && a((dfk)$$1, $$3);
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
   public fba cT() {
      return new fba(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   static class a<T extends bvg> extends cbl<T> {
      private final chr i;

      public a(chr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gp() != chr.g.g && super.b();
      }
   }

   public static class b extends bub.a {
      public final chr.g a;

      public b(chr.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cbf {
      private final chr b;
      private boolean c;

      public c(chr $$0) {
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

   static class d extends cbh {
      private final chr l;
      private double m;

      public d(chr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.bm && !((chr.c)this.l.bQ).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
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

   static class e extends ccx {
      private final chr a;

      public e(chr $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends ccr {
      private final chr g;
      private boolean h;
      private boolean i;

      public f(chr $$0) {
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
            dgi $$0 = this.g.dW();
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

      private static final IntFunction<chr.g> i = axq.a(chr.g::a, values(), a);
      public static final Codec<chr.g> h = azv.a(chr.g::values);
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

      public static chr.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
