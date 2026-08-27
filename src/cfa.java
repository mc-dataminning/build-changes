import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfa extends ceg implements btq<cfa.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final ajs<Integer> cg = ajw.a(cfa.class, aju.b);
   private static final akn ch = new akn("killer_bunny");
   public static final int ce = 8;
   public static final int cf = 8;
   private static final int ci = 40;
   private int cj;
   private int ck;
   private boolean cl;
   private int cm;
   int cn;

   public cfa(bsc<? extends cfa> $$0, daz $$1) {
      super($$0, $$1);
      this.bQ = new cfa.c(this);
      this.bP = new cfa.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzi(this));
      this.bS.a(1, new bzd(this, this.dP()));
      this.bS.a(1, new cfa.e(this, 2.2));
      this.bS.a(2, new bza(this, 0.8));
      this.bS.a(3, new caw(this, 1.0, $$0 -> $$0.a(awf.as), false));
      this.bS.a(4, new cfa.a<>(this, cly.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new cfa.a<>(this, cfj.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new cfa.a<>(this, cje.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new cfa.f(this));
      this.bS.a(6, new cbb(this, 0.6));
      this.bS.a(11, new bzw(this, cly.class, 10.0F));
   }

   @Override
   protected float fh() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.dw() + 0.5) {
         $$0 = 0.5F;
      }

      enk $$1 = this.bR.j();
      if ($$1 != null && !$$1.c()) {
         eum $$2 = $$1.a(this);
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
            this.a(0.1F, new eum(0.0, 0.0, 1.0));
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
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cg, cfa.g.a.j);
   }

   @Override
   public void Y() {
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
            this.gy();
         }

         if (this.gp() == cfa.g.g && this.cm == 0) {
            bsq $$0 = this.p();
            if ($$0 != null && this.g((brw)$$0) < 16.0) {
               this.c($$0.du(), $$0.dA());
               this.bP.a($$0.du(), $$0.dw(), $$0.dA(), this.bP.c());
               this.s();
               this.cl = true;
            }
         }

         cfa.c $$1 = (cfa.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.cm == 0) {
               enk $$2 = this.bR.j();
               eum $$3 = new eum(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.s();
            }
         } else if (!$$1.d()) {
            this.gv();
         }
      }

      this.cl = this.aE();
   }

   @Override
   public boolean bq() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(ayf.d($$1 - this.dA(), $$0 - this.du()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gv() {
      ((cfa.c)this.bQ).a(true);
   }

   private void gw() {
      ((cfa.c)this.bQ).a(false);
   }

   private void gx() {
      if (this.bP.c() < 2.2) {
         this.cm = 10;
      } else {
         this.cm = 1;
      }
   }

   private void gy() {
      this.gx();
      this.gw();
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

   public static btx.a u() {
      return bss.A().a(bty.q, 3.0).a(bty.r, 0.3F);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gp().j);
      $$0.a("MoreCarrotTicks", this.cn);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a(cfa.g.a($$0.h("RabbitType")));
      this.cn = $$0.h("MoreCarrotTicks");
   }

   protected avh y() {
      return avi.uY;
   }

   @Override
   protected avh v() {
      return avi.uU;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.uX;
   }

   @Override
   protected avh o_() {
      return avi.uW;
   }

   @Override
   public boolean C(brw $$0) {
      if (this.gp() == cfa.g.g) {
         this.a(avi.uV, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         return $$0.a(this.dQ().b((bsq)this), 8.0F);
      } else {
         return $$0.a(this.dQ().b((bsq)this), 3.0F);
      }
   }

   @Override
   public avj de() {
      return this.gp() == cfa.g.g ? avj.f : avj.g;
   }

   @Nullable
   public cfa b(aqn $$0, brq $$1) {
      cfa $$2 = bsc.aG.a((daz)$$0);
      if ($$2 != null) {
         cfa.g $$3;
         $$3 = a($$0, this.dp());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cfa $$4 && this.ah.h()) {
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
   public boolean o(ctq $$0) {
      return $$0.a(awf.as);
   }

   public cfa.g gp() {
      return cfa.g.a(this.ao.a(cg));
   }

   public void a(cfa.g $$0) {
      if ($$0 == cfa.g.g) {
         this.f(bty.a).a(8.0);
         this.bS.a(4, new bzy(this, 1.4, true));
         this.bT.a(1, new cbg(this).a());
         this.bT.a(2, new cbh<>(this, cly.class, true));
         this.bT.a(2, new cbh<>(this, cfj.class, true));
         if (!this.ag()) {
            this.b(wx.c(ac.a("entity", ch)));
         }
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      cfa.g $$4 = a($$0, this.dp());
      if ($$3 instanceof cfa.b) {
         $$4 = ((cfa.b)$$3).a;
      } else {
         $$3 = new cfa.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cfa.g a(dba $$0, io $$1) {
      ix<dby> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(avw.al)) {
         return $$3 < 80 ? cfa.g.b : cfa.g.d;
      } else if ($$2.a(avw.ak)) {
         return cfa.g.e;
      } else {
         return $$3 < 50 ? cfa.g.a : ($$3 < 90 ? cfa.g.f : cfa.g.c);
      }
   }

   public static boolean c(bsc<cfa> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avx.cd) && a((dac)$$1, $$3);
   }

   boolean gz() {
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
   public eum cM() {
      return new eum(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a<T extends bsq> extends byv<T> {
      private final cfa i;

      public a(cfa $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gp() != cfa.g.g && super.a();
      }
   }

   public static class b extends brq.a {
      public final cfa.g a;

      public b(cfa.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends byp {
      private final cfa b;
      private boolean c;

      public c(cfa $$0) {
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

   static class d extends byr {
      private final cfa l;
      private double m;

      public d(cfa $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aE() && !this.l.bn && !((cfa.c)this.l.bQ).c()) {
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

   static class e extends cah {
      private final cfa h;

      public e(cfa $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends cab {
      private final cfa g;
      private boolean h;
      private boolean i;

      public f(cfa $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dP().aa().b(dav.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gz();
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
         this.g.G().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.Z());
         if (this.m()) {
            daz $$0 = this.g.dP();
            io $$1 = this.e.c();
            drd $$2 = $$0.a_($$1);
            dea $$3 = $$2.b();
            if (this.i && $$3 instanceof des) {
               int $$4 = $$2.c(des.f);
               if ($$4 == 0) {
                  $$0.a($$1, dec.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(des.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dvw.c, $$1, dvw.a.a(this.g));
                  $$0.c(2001, $$1, dea.i($$2));
               }

               this.g.cn = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dbc $$0, io $$1) {
         drd $$2 = $$0.a_($$1);
         if ($$2.a(dec.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof des && ((des)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements ayz {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cfa.g> i = aww.a(cfa.g::a, values(), a);
      public static final Codec<cfa.g> h = ayz.a(cfa.g::values);
      final int j;
      private final String k;

      private g(int $$0, String $$1) {
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

      public static cfa.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
