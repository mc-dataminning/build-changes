import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfu extends cfa implements buk<cfu.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final akg<Integer> cg = akk.a(cfu.class, aki.b);
   private static final alb ch = new alb("killer_bunny");
   public static final int ce = 8;
   public static final int cf = 8;
   private static final int ci = 40;
   private int cj;
   private int ck;
   private boolean cl;
   private int cm;
   int cn;

   public cfu(bsv<? extends cfu> $$0, dbt $$1) {
      super($$0, $$1);
      this.bQ = new cfu.c(this);
      this.bP = new cfu.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bS.a(1, new cac(this));
      this.bS.a(1, new bzx(this, this.dP()));
      this.bS.a(1, new cfu.e(this, 2.2));
      this.bS.a(2, new bzu(this, 0.8));
      this.bS.a(3, new cbq(this, 1.0, $$0 -> $$0.a(awu.as), false));
      this.bS.a(4, new cfu.a<>(this, cms.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new cfu.a<>(this, cgd.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new cfu.a<>(this, cjy.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new cfu.f(this));
      this.bS.a(6, new cbv(this, 0.6));
      this.bS.a(11, new caq(this, cms.class, 10.0F));
   }

   @Override
   protected float fh() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.dw() + 0.5) {
         $$0 = 0.5F;
      }

      eoe $$1 = this.bR.j();
      if ($$1 != null && !$$1.c()) {
         evm $$2 = $$1.a(this);
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
            this.a(0.1F, new evm(0.0, 0.0, 1.0));
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
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cg, cfu.g.a.j);
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

         if (this.gq() == cfu.g.g && this.cm == 0) {
            btk $$0 = this.p();
            if ($$0 != null && this.g((bsp)$$0) < 16.0) {
               this.c($$0.du(), $$0.dA());
               this.bP.a($$0.du(), $$0.dw(), $$0.dA(), this.bP.c());
               this.s();
               this.cl = true;
            }
         }

         cfu.c $$1 = (cfu.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.cm == 0) {
               eoe $$2 = this.bR.j();
               evm $$3 = new evm(this.bP.d(), this.bP.e(), this.bP.f());
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
      this.r((float)(ayu.d($$1 - this.dA(), $$0 - this.du()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gw() {
      ((cfu.c)this.bQ).a(true);
   }

   private void gx() {
      ((cfu.c)this.bQ).a(false);
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

   public static bur.a u() {
      return btm.A().a(bus.q, 3.0).a(bus.r, 0.3F);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gq().j);
      $$0.a("MoreCarrotTicks", this.cn);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a(cfu.g.a($$0.h("RabbitType")));
      this.cn = $$0.h("MoreCarrotTicks");
   }

   protected avv y() {
      return avw.uY;
   }

   @Override
   protected avv v() {
      return avw.uU;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.uX;
   }

   @Override
   protected avv o_() {
      return avw.uW;
   }

   @Override
   public boolean C(bsp $$0) {
      if (this.gq() == cfu.g.g) {
         this.a(avw.uV, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         return $$0.a(this.dQ().b((btk)this), 8.0F);
      } else {
         return $$0.a(this.dQ().b((btk)this), 3.0F);
      }
   }

   @Override
   public avx de() {
      return this.gq() == cfu.g.g ? avx.f : avx.g;
   }

   @Nullable
   public cfu b(arb $$0, bsj $$1) {
      cfu $$2 = bsv.aG.a((dbt)$$0);
      if ($$2 != null) {
         cfu.g $$3;
         $$3 = a($$0, this.dp());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cfu $$4 && this.ah.h()) {
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
   public boolean o(cuk $$0) {
      return $$0.a(awu.as);
   }

   public cfu.g gq() {
      return cfu.g.a(this.ao.a(cg));
   }

   public void a(cfu.g $$0) {
      if ($$0 == cfu.g.g) {
         this.f(bus.a).a(8.0);
         this.bS.a(4, new cas(this, 1.4, true));
         this.bT.a(1, new cca(this).a());
         this.bT.a(2, new ccb<>(this, cms.class, true));
         this.bT.a(2, new ccb<>(this, cgd.class, true));
         if (!this.ag()) {
            this.b(xl.c(ac.a("entity", ch)));
         }
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      cfu.g $$4 = a($$0, this.dp());
      if ($$3 instanceof cfu.b) {
         $$4 = ((cfu.b)$$3).a;
      } else {
         $$3 = new cfu.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cfu.g a(dbu $$0, iz $$1) {
      ji<dcs> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(awk.al)) {
         return $$3 < 80 ? cfu.g.b : cfu.g.d;
      } else if ($$2.a(awk.ak)) {
         return cfu.g.e;
      } else {
         return $$3 < 50 ? cfu.g.a : ($$3 < 90 ? cfu.g.f : cfu.g.c);
      }
   }

   public static boolean c(bsv<cfu> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      return $$1.a_($$3.d()).a(awl.cd) && a((daw)$$1, $$3);
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
   public evm cM() {
      return new evm(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a<T extends btk> extends bzp<T> {
      private final cfu i;

      public a(cfu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gq() != cfu.g.g && super.a();
      }
   }

   public static class b extends bsj.a {
      public final cfu.g a;

      public b(cfu.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bzj {
      private final cfu b;
      private boolean c;

      public c(cfu $$0) {
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

   static class d extends bzl {
      private final cfu l;
      private double m;

      public d(cfu $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aE() && !this.l.bn && !((cfu.c)this.l.bQ).c()) {
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

   static class e extends cbb {
      private final cfu h;

      public e(cfu $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends cav {
      private final cfu g;
      private boolean h;
      private boolean i;

      public f(cfu $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dP().ab().b(dbp.c)) {
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
            dbt $$0 = this.g.dP();
            iz $$1 = this.e.c();
            drx $$2 = $$0.a_($$1);
            deu $$3 = $$2.b();
            if (this.i && $$3 instanceof dfm) {
               int $$4 = $$2.c(dfm.f);
               if ($$4 == 0) {
                  $$0.a($$1, dew.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dfm.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dwq.c, $$1, dwq.a.a(this.g));
                  $$0.c(2001, $$1, deu.i($$2));
               }

               this.g.cn = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dbw $$0, iz $$1) {
         drx $$2 = $$0.a_($$1);
         if ($$2.a(dew.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof dfm && ((dfm)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements azp {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cfu.g> i = axl.a(cfu.g::a, values(), a);
      public static final Codec<cfu.g> h = azp.a(cfu.g::values);
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

      public static cfu.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
