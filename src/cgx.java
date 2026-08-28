import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgx extends cgd implements bvm<cgx.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final akh<Integer> ce = akl.a(cgx.class, akj.b);
   private static final ale cf = ale.b("killer_bunny");
   private static final int cg = 3;
   private static final int ch = 5;
   private static final ale ci = ale.b("evil");
   private static final int cj = 8;
   private static final int ck = 40;
   private int cl;
   private int cm;
   private boolean cn;
   private int co;
   int cp;

   public cgx(bty<? extends cgx> $$0, dej $$1) {
      super($$0, $$1);
      this.bQ = new cgx.c(this);
      this.bP = new cgx.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbe(this));
      this.bS.a(1, new caz(this, this.dS()));
      this.bS.a(1, new cgx.e(this, 2.2));
      this.bS.a(2, new caw(this, 0.8));
      this.bS.a(3, new ccs(this, 1.0, $$0 -> $$0.a(axe.as), false));
      this.bS.a(4, new cgx.a<>(this, cnx.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new cgx.a<>(this, chg.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new cgx.a<>(this, cld.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new cgx.f(this));
      this.bS.a(6, new ccx(this, 0.6));
      this.bS.a(11, new cbs(this, cnx.class, 10.0F));
   }

   @Override
   protected float fg() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.dz() + 0.5) {
         $$0 = 0.5F;
      }

      erh $$1 = this.bR.k();
      if ($$1 != null && !$$1.c()) {
         eyw $$2 = $$1.a(this);
         if ($$2.e > this.dz() + 0.5) {
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
         double $$1 = this.dv().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new eyw(0.0, 0.0, 1.0));
         }
      }

      if (!this.dS().B) {
         this.dS().a(this, (byte)1);
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
         this.a(this.y(), this.fd(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void q() {
      this.t(true);
      this.cm = 10;
      this.cl = 0;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(ce, cgx.g.a.j);
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

      if (this.aH()) {
         if (!this.cn) {
            this.t(false);
            this.gs();
         }

         if (this.go() == cgx.g.g && this.co == 0) {
            bun $$0 = this.m();
            if ($$0 != null && this.g((btr)$$0) < 16.0) {
               this.c($$0.dx(), $$0.dD());
               this.bP.a($$0.dx(), $$0.dz(), $$0.dD(), this.bP.c());
               this.q();
               this.cn = true;
            }
         }

         cgx.c $$1 = (cgx.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.co == 0) {
               erh $$2 = this.bR.k();
               eyw $$3 = new eyw(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.d, $$3.f);
               this.q();
            }
         } else if (!$$1.d()) {
            this.gp();
         }
      }

      this.cn = this.aH();
   }

   @Override
   public boolean bu() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(azf.d($$1 - this.dD(), $$0 - this.dx()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gp() {
      ((cgx.c)this.bQ).a(true);
   }

   private void gq() {
      ((cgx.c)this.bQ).a(false);
   }

   private void gr() {
      if (this.bP.c() < 2.2) {
         this.co = 10;
      } else {
         this.co = 1;
      }
   }

   private void gs() {
      this.gr();
      this.gq();
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

   public static bvt.a t() {
      return cgd.gt().a(bvu.s, 3.0).a(bvu.v, 0.3F).a(bvu.c, 3.0);
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.go().j);
      $$0.a("MoreCarrotTicks", this.cp);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a(cgx.g.a($$0.h("RabbitType")));
      this.cp = $$0.h("MoreCarrotTicks");
   }

   protected awf y() {
      return awg.vc;
   }

   @Override
   protected awf w() {
      return awg.uY;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.vb;
   }

   @Override
   protected awf o_() {
      return awg.va;
   }

   @Override
   public void gh() {
      if (this.go() == cgx.g.g) {
         this.a(awg.uZ, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awh di() {
      return this.go() == cgx.g.g ? awh.f : awh.g;
   }

   @Nullable
   public cgx b(arj $$0, btk $$1) {
      cgx $$2 = bty.aG.a($$0, btx.e);
      if ($$2 != null) {
         cgx.g $$3;
         $$3 = a($$0, this.ds());
         label16:
         if (this.af.a(20) != 0) {
            if ($$1 instanceof cgx $$4 && this.af.h()) {
               $$3 = $$4.go();
               break label16;
            }

            $$3 = this.go();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean n(cvs $$0) {
      return $$0.a(axe.as);
   }

   public cgx.g go() {
      return cgx.g.a(this.am.a(ce));
   }

   public void a(cgx.g $$0) {
      if ($$0 == cgx.g.g) {
         this.g(bvu.a).a(8.0);
         this.bS.a(4, new cbu(this, 1.4, true));
         this.bT.a(1, new cdc(this).a());
         this.bT.a(2, new cdd<>(this, cnx.class, true));
         this.bT.a(2, new cdd<>(this, chg.class, true));
         this.g(bvu.c).a(new bvs(ci, 5.0, bvs.a.a));
         if (!this.ak()) {
            this.b(xe.c(ad.a("entity", cf)));
         }
      } else {
         this.g(bvu.c).c(ci);
      }

      this.am.a(ce, $$0.j);
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      cgx.g $$4 = a($$0, this.ds());
      if ($$3 instanceof cgx.b) {
         $$4 = ((cgx.b)$$3).a;
      } else {
         $$3 = new cgx.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cgx.g a(dek $$0, jf $$1) {
      jo<dfk> $$2 = $$0.t($$1);
      int $$3 = $$0.D_().a(100);
      if ($$2.a(awu.al)) {
         return $$3 < 80 ? cgx.g.b : cgx.g.d;
      } else if ($$2.a(awu.ak)) {
         return cgx.g.e;
      } else {
         return $$3 < 50 ? cgx.g.a : ($$3 < 90 ? cgx.g.f : cgx.g.c);
      }
   }

   public static boolean c(bty<cgx> $$0, dek $$1, btx $$2, jf $$3, azn $$4) {
      return $$1.a_($$3.e()).a(awv.ce) && a((ddl)$$1, $$3);
   }

   boolean gA() {
      return this.cp <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bv();
         this.cm = 10;
         this.cl = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public eyw cQ() {
      return new eyw(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }

   static class a<T extends bun> extends car<T> {
      private final cgx i;

      public a(cgx $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.go() != cgx.g.g && super.b();
      }
   }

   public static class b extends btk.a {
      public final cgx.g a;

      public b(cgx.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cal {
      private final cgx b;
      private boolean c;

      public c(cgx $$0) {
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

   static class d extends can {
      private final cgx l;
      private double m;

      public d(cgx $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aH() && !this.l.bj && !((cgx.c)this.l.bQ).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bi()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends ccd {
      private final cgx a;

      public e(cgx $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cbx {
      private final cgx g;
      private boolean h;
      private boolean i;

      public f(cgx $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!this.g.dS().ac().b(def.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gA();
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
            dej $$0 = this.g.dS();
            jf $$1 = this.e.d();
            dus $$2 = $$0.a_($$1);
            dhm $$3 = $$2.b();
            if (this.i && $$3 instanceof die) {
               int $$4 = $$2.c(die.f);
               if ($$4 == 0) {
                  $$0.a($$1, dho.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(die.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dzp.c, $$1, dzp.a.a(this.g));
                  $$0.c(2001, $$1, dhm.j($$2));
               }

               this.g.cp = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dem $$0, jf $$1) {
         dus $$2 = $$0.a_($$1);
         if ($$2.a(dho.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof die && ((die)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements bab {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cgx.g> i = axw.a(cgx.g::a, values(), a);
      public static final Codec<cgx.g> h = bab.a(cgx.g::values);
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

      public static cgx.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
