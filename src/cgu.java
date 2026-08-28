import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgu extends cga implements bvj<cgu.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double ca = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final akg<Integer> ce = akk.a(cgu.class, aki.b);
   private static final alc cf = alc.b("killer_bunny");
   private static final int cg = 3;
   private static final int ch = 5;
   private static final alc ci = alc.b("evil");
   private static final int cj = 8;
   private static final int ck = 40;
   private int cl;
   private int cm;
   private boolean cn;
   private int co;
   int cp;

   public cgu(btv<? extends cgu> $$0, deg $$1) {
      super($$0, $$1);
      this.bQ = new cgu.c(this);
      this.bP = new cgu.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbb(this));
      this.bS.a(1, new caw(this, this.dS()));
      this.bS.a(1, new cgu.e(this, 2.2));
      this.bS.a(2, new cat(this, 0.8));
      this.bS.a(3, new ccp(this, 1.0, $$0 -> $$0.a(axc.as), false));
      this.bS.a(4, new cgu.a<>(this, cnu.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new cgu.a<>(this, chd.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new cgu.a<>(this, cla.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new cgu.f(this));
      this.bS.a(6, new ccu(this, 0.6));
      this.bS.a(11, new cbp(this, cnu.class, 10.0F));
   }

   @Override
   protected float fg() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.dz() + 0.5) {
         $$0 = 0.5F;
      }

      erd $$1 = this.bR.k();
      if ($$1 != null && !$$1.c()) {
         eys $$2 = $$1.a(this);
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
            this.a(0.1F, new eys(0.0, 0.0, 1.0));
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
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ce, cgu.g.a.j);
   }

   @Override
   public void ad() {
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
            this.gt();
         }

         if (this.gp() == cgu.g.g && this.co == 0) {
            buk $$0 = this.m();
            if ($$0 != null && this.g((bto)$$0) < 16.0) {
               this.c($$0.dx(), $$0.dD());
               this.bP.a($$0.dx(), $$0.dz(), $$0.dD(), this.bP.c());
               this.q();
               this.cn = true;
            }
         }

         cgu.c $$1 = (cgu.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.co == 0) {
               erd $$2 = this.bR.k();
               eys $$3 = new eys(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.d, $$3.f);
               this.q();
            }
         } else if (!$$1.d()) {
            this.gq();
         }
      }

      this.cn = this.aH();
   }

   @Override
   public boolean bu() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(azd.d($$1 - this.dD(), $$0 - this.dx()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gq() {
      ((cgu.c)this.bQ).a(true);
   }

   private void gr() {
      ((cgu.c)this.bQ).a(false);
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
   public void m_() {
      super.m_();
      if (this.cl != this.cm) {
         this.cl++;
      } else if (this.cm != 0) {
         this.cl = 0;
         this.cm = 0;
         this.t(false);
      }
   }

   public static bvq.a t() {
      return cga.gu().a(bvr.s, 3.0).a(bvr.v, 0.3F).a(bvr.c, 3.0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gp().j);
      $$0.a("MoreCarrotTicks", this.cp);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(cgu.g.a($$0.h("RabbitType")));
      this.cp = $$0.h("MoreCarrotTicks");
   }

   protected awd y() {
      return awe.vc;
   }

   @Override
   protected awd w() {
      return awe.uY;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.vb;
   }

   @Override
   protected awd n_() {
      return awe.va;
   }

   @Override
   public void gi() {
      if (this.gp() == cgu.g.g) {
         this.a(awe.uZ, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awf di() {
      return this.gp() == cgu.g.g ? awf.f : awf.g;
   }

   @Nullable
   public cgu b(arh $$0, bth $$1) {
      cgu $$2 = btv.aG.a($$0, btu.e);
      if ($$2 != null) {
         cgu.g $$3;
         $$3 = a($$0, this.ds());
         label16:
         if (this.af.a(20) != 0) {
            if ($$1 instanceof cgu $$4 && this.af.h()) {
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
   public boolean n(cvp $$0) {
      return $$0.a(axc.as);
   }

   public cgu.g gp() {
      return cgu.g.a(this.am.a(ce));
   }

   public void a(cgu.g $$0) {
      if ($$0 == cgu.g.g) {
         this.g(bvr.a).a(8.0);
         this.bS.a(4, new cbr(this, 1.4, true));
         this.bT.a(1, new ccz(this).a());
         this.bT.a(2, new cda<>(this, cnu.class, true));
         this.bT.a(2, new cda<>(this, chd.class, true));
         this.g(bvr.c).a(new bvp(ci, 5.0, bvp.a.a));
         if (!this.ak()) {
            this.b(xd.c(ad.a("entity", cf)));
         }
      } else {
         this.g(bvr.c).c(ci);
      }

      this.am.a(ce, $$0.j);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      cgu.g $$4 = a($$0, this.ds());
      if ($$3 instanceof cgu.b) {
         $$4 = ((cgu.b)$$3).a;
      } else {
         $$3 = new cgu.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cgu.g a(deh $$0, je $$1) {
      jn<dfh> $$2 = $$0.t($$1);
      int $$3 = $$0.C_().a(100);
      if ($$2.a(aws.al)) {
         return $$3 < 80 ? cgu.g.b : cgu.g.d;
      } else if ($$2.a(aws.ak)) {
         return cgu.g.e;
      } else {
         return $$3 < 50 ? cgu.g.a : ($$3 < 90 ? cgu.g.f : cgu.g.c);
      }
   }

   public static boolean c(btv<cgu> $$0, deh $$1, btu $$2, je $$3, azl $$4) {
      return $$1.a_($$3.e()).a(awt.ce) && a((ddi)$$1, $$3);
   }

   boolean gB() {
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
   public eys cQ() {
      return new eys(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }

   static class a<T extends buk> extends cao<T> {
      private final cgu i;

      public a(cgu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gp() != cgu.g.g && super.b();
      }
   }

   public static class b extends bth.a {
      public final cgu.g a;

      public b(cgu.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cai {
      private final cgu b;
      private boolean c;

      public c(cgu $$0) {
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

   static class d extends cak {
      private final cgu l;
      private double m;

      public d(cgu $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aH() && !this.l.bj && !((cgu.c)this.l.bQ).c()) {
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

   static class e extends cca {
      private final cgu a;

      public e(cgu $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cbu {
      private final cgu g;
      private boolean h;
      private boolean i;

      public f(cgu $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!this.g.dS().ac().b(dec.c)) {
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
         this.g.K().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ae());
         if (this.m()) {
            deg $$0 = this.g.dS();
            je $$1 = this.e.d();
            duo $$2 = $$0.a_($$1);
            dhj $$3 = $$2.b();
            if (this.i && $$3 instanceof dib) {
               int $$4 = $$2.c(dib.f);
               if ($$4 == 0) {
                  $$0.a($$1, dhl.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dib.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dzl.c, $$1, dzl.a.a(this.g));
                  $$0.c(2001, $$1, dhj.j($$2));
               }

               this.g.cp = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dej $$0, je $$1) {
         duo $$2 = $$0.a_($$1);
         if ($$2.a(dhl.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dib && ((dib)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements azz {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cgu.g> i = axu.a(cgu.g::a, values(), a);
      public static final Codec<cgu.g> h = azz.a(cgu.g::values);
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

      public static cgu.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
