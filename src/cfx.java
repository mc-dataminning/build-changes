import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfx extends cfd implements bun<cfx.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final akj<Integer> cg = akn.a(cfx.class, akl.b);
   private static final ale ch = new ale("killer_bunny");
   public static final int ce = 8;
   public static final int cf = 8;
   private static final int ci = 40;
   private int cj;
   private int ck;
   private boolean cl;
   private int cm;
   int cn;

   public cfx(bsy<? extends cfx> $$0, dbw $$1) {
      super($$0, $$1);
      this.bQ = new cfx.c(this);
      this.bP = new cfx.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bS.a(1, new caf(this));
      this.bS.a(1, new caa(this, this.dP()));
      this.bS.a(1, new cfx.e(this, 2.2));
      this.bS.a(2, new bzx(this, 0.8));
      this.bS.a(3, new cbt(this, 1.0, $$0 -> $$0.a(awx.as), false));
      this.bS.a(4, new cfx.a<>(this, cmv.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new cfx.a<>(this, cgg.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new cfx.a<>(this, ckb.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new cfx.f(this));
      this.bS.a(6, new cby(this, 0.6));
      this.bS.a(11, new cat(this, cmv.class, 10.0F));
   }

   @Override
   protected float fh() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.dw() + 0.5) {
         $$0 = 0.5F;
      }

      eoh $$1 = this.bR.j();
      if ($$1 != null && !$$1.c()) {
         evp $$2 = $$1.a(this);
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
            this.a(0.1F, new evp(0.0, 0.0, 1.0));
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
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cg, cfx.g.a.j);
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

         if (this.gq() == cfx.g.g && this.cm == 0) {
            btn $$0 = this.p();
            if ($$0 != null && this.g((bss)$$0) < 16.0) {
               this.c($$0.du(), $$0.dA());
               this.bP.a($$0.du(), $$0.dw(), $$0.dA(), this.bP.c());
               this.s();
               this.cl = true;
            }
         }

         cfx.c $$1 = (cfx.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.cm == 0) {
               eoh $$2 = this.bR.j();
               evp $$3 = new evp(this.bP.d(), this.bP.e(), this.bP.f());
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
      this.r((float)(ayx.d($$1 - this.dA(), $$0 - this.du()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gw() {
      ((cfx.c)this.bQ).a(true);
   }

   private void gx() {
      ((cfx.c)this.bQ).a(false);
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

   public static buu.a u() {
      return btp.A().a(buv.q, 3.0).a(buv.r, 0.3F);
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
      this.a(cfx.g.a($$0.h("RabbitType")));
      this.cn = $$0.h("MoreCarrotTicks");
   }

   protected avy y() {
      return avz.uY;
   }

   @Override
   protected avy v() {
      return avz.uU;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.uX;
   }

   @Override
   protected avy o_() {
      return avz.uW;
   }

   @Override
   public boolean C(bss $$0) {
      if (this.gq() == cfx.g.g) {
         this.a(avz.uV, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         return $$0.a(this.dQ().b((btn)this), 8.0F);
      } else {
         return $$0.a(this.dQ().b((btn)this), 3.0F);
      }
   }

   @Override
   public awa de() {
      return this.gq() == cfx.g.g ? awa.f : awa.g;
   }

   @Nullable
   public cfx b(are $$0, bsm $$1) {
      cfx $$2 = bsy.aG.a((dbw)$$0);
      if ($$2 != null) {
         cfx.g $$3;
         $$3 = a($$0, this.dp());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cfx $$4 && this.ah.h()) {
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
   public boolean o(cun $$0) {
      return $$0.a(awx.as);
   }

   public cfx.g gq() {
      return cfx.g.a(this.ao.a(cg));
   }

   public void a(cfx.g $$0) {
      if ($$0 == cfx.g.g) {
         this.f(buv.a).a(8.0);
         this.bS.a(4, new cav(this, 1.4, true));
         this.bT.a(1, new ccd(this).a());
         this.bT.a(2, new cce<>(this, cmv.class, true));
         this.bT.a(2, new cce<>(this, cgg.class, true));
         if (!this.ag()) {
            this.b(xo.c(ac.a("entity", ch)));
         }
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      cfx.g $$4 = a($$0, this.dp());
      if ($$3 instanceof cfx.b) {
         $$4 = ((cfx.b)$$3).a;
      } else {
         $$3 = new cfx.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cfx.g a(dbx $$0, iz $$1) {
      ji<dcv> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(awn.al)) {
         return $$3 < 80 ? cfx.g.b : cfx.g.d;
      } else if ($$2.a(awn.ak)) {
         return cfx.g.e;
      } else {
         return $$3 < 50 ? cfx.g.a : ($$3 < 90 ? cfx.g.f : cfx.g.c);
      }
   }

   public static boolean c(bsy<cfx> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return $$1.a_($$3.d()).a(awo.cd) && a((daz)$$1, $$3);
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
   public evp cM() {
      return new evp(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a<T extends btn> extends bzs<T> {
      private final cfx i;

      public a(cfx $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gq() != cfx.g.g && super.a();
      }
   }

   public static class b extends bsm.a {
      public final cfx.g a;

      public b(cfx.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bzm {
      private final cfx b;
      private boolean c;

      public c(cfx $$0) {
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

   static class d extends bzo {
      private final cfx l;
      private double m;

      public d(cfx $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aE() && !this.l.bn && !((cfx.c)this.l.bQ).c()) {
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

   static class e extends cbe {
      private final cfx h;

      public e(cfx $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends cay {
      private final cfx g;
      private boolean h;
      private boolean i;

      public f(cfx $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dP().ab().b(dbs.c)) {
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
            dbw $$0 = this.g.dP();
            iz $$1 = this.e.c();
            dsa $$2 = $$0.a_($$1);
            dex $$3 = $$2.b();
            if (this.i && $$3 instanceof dfp) {
               int $$4 = $$2.c(dfp.f);
               if ($$4 == 0) {
                  $$0.a($$1, dez.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dfp.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dwt.c, $$1, dwt.a.a(this.g));
                  $$0.c(2001, $$1, dex.i($$2));
               }

               this.g.cn = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dbz $$0, iz $$1) {
         dsa $$2 = $$0.a_($$1);
         if ($$2.a(dez.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof dfp && ((dfp)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements azs {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cfx.g> i = axo.a(cfx.g::a, values(), a);
      public static final Codec<cfx.g> h = azs.a(cfx.g::values);
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

      public static cfx.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
