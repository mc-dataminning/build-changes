import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfz extends cff implements bup<cfz.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final akk<Integer> cg = ako.a(cfz.class, akm.b);
   private static final alf ch = new alf("killer_bunny");
   public static final int ce = 8;
   public static final int cf = 8;
   private static final int ci = 40;
   private int cj;
   private int ck;
   private boolean cl;
   private int cm;
   int cn;

   public cfz(bta<? extends cfz> $$0, dby $$1) {
      super($$0, $$1);
      this.bQ = new cfz.c(this);
      this.bP = new cfz.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cah(this));
      this.bS.a(1, new cac(this, this.dP()));
      this.bS.a(1, new cfz.e(this, 2.2));
      this.bS.a(2, new bzz(this, 0.8));
      this.bS.a(3, new cbv(this, 1.0, $$0 -> $$0.a(awy.as), false));
      this.bS.a(4, new cfz.a<>(this, cmx.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new cfz.a<>(this, cgi.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new cfz.a<>(this, ckd.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new cfz.f(this));
      this.bS.a(6, new cca(this, 0.6));
      this.bS.a(11, new cav(this, cmx.class, 10.0F));
   }

   @Override
   protected float fh() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.dw() + 0.5) {
         $$0 = 0.5F;
      }

      eoj $$1 = this.bR.j();
      if ($$1 != null && !$$1.c()) {
         evr $$2 = $$1.a(this);
         if ($$2.d > this.dw() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bP.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.w($$0 / 0.42F);
   }

   @Override
   protected void fj() {
      super.fj();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new evr(0.0, 0.0, 1.0));
         }
      }

      if (!this.dP().B) {
         this.dP().a(this, (byte)1);
      }
   }

   public float G(float $$0) {
      return this.ck == 0 ? 0.0F : ((float)this.cj + $$0) / (float)this.ck;
   }

   public void i(double $$0) {
      this.K().a($$0);
      this.bP.a(this.bP.d(), this.bP.e(), this.bP.f(), $$0);
   }

   @Override
   public void s(boolean $$0) {
      super.s($$0);
      if ($$0) {
         this.a(this.y(), this.fe(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void s() {
      this.s(true);
      this.ck = 10;
      this.cj = 0;
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cg, cfz.g.a.j);
   }

   @Override
   public void Z() {
      if (this.cm > 0) {
         this.cm--;
      }

      if (this.cn > 0) {
         this.cn = this.cn - this.ah.a(3);
         if (this.cn < 0) {
            this.cn = 0;
         }
      }

      if (this.aE()) {
         if (!this.cl) {
            this.s(false);
            this.gz();
         }

         if (this.gq() == cfz.g.g && this.cm == 0) {
            btp $$0 = this.p();
            if ($$0 != null && this.g((bsu)$$0) < 16.0) {
               this.c($$0.du(), $$0.dA());
               this.bP.a($$0.du(), $$0.dw(), $$0.dA(), this.bP.c());
               this.s();
               this.cl = true;
            }
         }

         cfz.c $$1 = (cfz.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.cm == 0) {
               eoj $$2 = this.bR.j();
               evr $$3 = new evr(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.s();
            }
         } else if (!$$1.d()) {
            this.gw();
         }
      }

      this.cl = this.aE();
   }

   @Override
   public boolean bq() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(ayz.d($$1 - this.dA(), $$0 - this.du()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gw() {
      ((cfz.c)this.bQ).a(true);
   }

   private void gx() {
      ((cfz.c)this.bQ).a(false);
   }

   private void gy() {
      if (this.bP.c() < 2.2) {
         this.cm = 10;
      } else {
         this.cm = 1;
      }
   }

   private void gz() {
      this.gy();
      this.gx();
   }

   @Override
   public void n_() {
      super.n_();
      if (this.cj != this.ck) {
         this.cj++;
      } else if (this.ck != 0) {
         this.cj = 0;
         this.ck = 0;
         this.s(false);
      }
   }

   public static buw.a u() {
      return btr.A().a(bux.q, 3.0).a(bux.r, 0.3F);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gq().j);
      $$0.a("MoreCarrotTicks", this.cn);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.a(cfz.g.a($$0.h("RabbitType")));
      this.cn = $$0.h("MoreCarrotTicks");
   }

   protected avz y() {
      return awa.uY;
   }

   @Override
   protected avz v() {
      return awa.uU;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.uX;
   }

   @Override
   protected avz o_() {
      return awa.uW;
   }

   @Override
   public boolean C(bsu $$0) {
      if (this.gq() == cfz.g.g) {
         this.a(awa.uV, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         return $$0.a(this.dQ().b((btp)this), 8.0F);
      } else {
         return $$0.a(this.dQ().b((btp)this), 3.0F);
      }
   }

   @Override
   public awb de() {
      return this.gq() == cfz.g.g ? awb.f : awb.g;
   }

   @Nullable
   public cfz b(arf $$0, bso $$1) {
      cfz $$2 = bta.aG.a((dby)$$0);
      if ($$2 != null) {
         cfz.g $$3;
         $$3 = a($$0, this.dp());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cfz $$4 && this.ah.h()) {
               $$3 = $$4.gq();
               break label16;
            }

            $$3 = this.gq();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.as);
   }

   public cfz.g gq() {
      return cfz.g.a(this.ao.a(cg));
   }

   public void a(cfz.g $$0) {
      if ($$0 == cfz.g.g) {
         this.f(bux.a).a(8.0);
         this.bS.a(4, new cax(this, 1.4, true));
         this.bT.a(1, new ccf(this).a());
         this.bT.a(2, new ccg<>(this, cmx.class, true));
         this.bT.a(2, new ccg<>(this, cgi.class, true));
         if (!this.ag()) {
            this.b(xp.c(ac.a("entity", ch)));
         }
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      cfz.g $$4 = a($$0, this.dp());
      if ($$3 instanceof cfz.b) {
         $$4 = ((cfz.b)$$3).a;
      } else {
         $$3 = new cfz.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cfz.g a(dbz $$0, iz $$1) {
      ji<dcx> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(awo.al)) {
         return $$3 < 80 ? cfz.g.b : cfz.g.d;
      } else if ($$2.a(awo.ak)) {
         return cfz.g.e;
      } else {
         return $$3 < 50 ? cfz.g.a : ($$3 < 90 ? cfz.g.f : cfz.g.c);
      }
   }

   public static boolean c(bta<cfz> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
      return $$1.a_($$3.d()).a(awp.cd) && a((dbb)$$1, $$3);
   }

   boolean gA() {
      return this.cn <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.br();
         this.ck = 10;
         this.cj = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public evr cM() {
      return new evr(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a<T extends btp> extends bzu<T> {
      private final cfz i;

      public a(cfz $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gq() != cfz.g.g && super.a();
      }
   }

   public static class b extends bso.a {
      public final cfz.g a;

      public b(cfz.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bzo {
      private final cfz b;
      private boolean c;

      public c(cfz $$0) {
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
            this.b.s();
            this.a = false;
         }
      }
   }

   static class d extends bzq {
      private final cfz l;
      private double m;

      public d(cfz $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aE() && !this.l.bn && !((cfz.c)this.l.bQ).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.be()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cbg {
      private final cfz h;

      public e(cfz $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends cba {
      private final cfz g;
      private boolean h;
      private boolean i;

      public f(cfz $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dP().ab().b(dbu.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gA();
         }

         return super.a();
      }

      @Override
      public boolean b() {
         return this.i && super.b();
      }

      @Override
      public void e() {
         super.e();
         this.g.G().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.aa());
         if (this.m()) {
            dby $$0 = this.g.dP();
            iz $$1 = this.e.c();
            dsc $$2 = $$0.a_($$1);
            dez $$3 = $$2.b();
            if (this.i && $$3 instanceof dfr) {
               int $$4 = $$2.c(dfr.f);
               if ($$4 == 0) {
                  $$0.a($$1, dfb.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dfr.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dwv.c, $$1, dwv.a.a(this.g));
                  $$0.c(2001, $$1, dez.i($$2));
               }

               this.g.cn = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dcb $$0, iz $$1) {
         dsc $$2 = $$0.a_($$1);
         if ($$2.a(dfb.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof dfr && ((dfr)$$2.b()).h($$2)) {
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

      private static final IntFunction<cfz.g> i = axp.a(cfz.g::a, values(), a);
      public static final Codec<cfz.g> h = azu.a(cfz.g::values);
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

      public static cfz.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
