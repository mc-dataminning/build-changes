import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cey extends cee implements bto<cey.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final ajr<Integer> cg = ajv.a(cey.class, ajt.b);
   private static final akm ch = new akm("killer_bunny");
   public static final int ce = 8;
   public static final int cf = 8;
   private static final int ci = 40;
   private int cj;
   private int ck;
   private boolean cl;
   private int cm;
   int cn;

   public cey(bsa<? extends cey> $$0, dax $$1) {
      super($$0, $$1);
      this.bQ = new cey.c(this);
      this.bP = new cey.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bS.a(1, new bzg(this));
      this.bS.a(1, new bzb(this, this.dP()));
      this.bS.a(1, new cey.e(this, 2.2));
      this.bS.a(2, new byy(this, 0.8));
      this.bS.a(3, new cau(this, 1.0, $$0 -> $$0.a(awe.as), false));
      this.bS.a(4, new cey.a<>(this, clw.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new cey.a<>(this, cfh.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new cey.a<>(this, cjc.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new cey.f(this));
      this.bS.a(6, new caz(this, 0.6));
      this.bS.a(11, new bzu(this, clw.class, 10.0F));
   }

   @Override
   protected float fh() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.dw() + 0.5) {
         $$0 = 0.5F;
      }

      eni $$1 = this.bR.j();
      if ($$1 != null && !$$1.c()) {
         euk $$2 = $$1.a(this);
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
            this.a(0.1F, new euk(0.0, 0.0, 1.0));
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
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(cg, cey.g.a.j);
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

         if (this.gp() == cey.g.g && this.cm == 0) {
            bso $$0 = this.p();
            if ($$0 != null && this.g((bru)$$0) < 16.0) {
               this.c($$0.du(), $$0.dA());
               this.bP.a($$0.du(), $$0.dw(), $$0.dA(), this.bP.c());
               this.s();
               this.cl = true;
            }
         }

         cey.c $$1 = (cey.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.cm == 0) {
               eni $$2 = this.bR.j();
               euk $$3 = new euk(this.bP.d(), this.bP.e(), this.bP.f());
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
      this.r((float)(ayd.d($$1 - this.dA(), $$0 - this.du()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gv() {
      ((cey.c)this.bQ).a(true);
   }

   private void gw() {
      ((cey.c)this.bQ).a(false);
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

   public static btv.a u() {
      return bsq.A().a(btw.q, 3.0).a(btw.r, 0.3F);
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
      this.a(cey.g.a($$0.h("RabbitType")));
      this.cn = $$0.h("MoreCarrotTicks");
   }

   protected avg y() {
      return avh.uY;
   }

   @Override
   protected avg v() {
      return avh.uU;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.uX;
   }

   @Override
   protected avg o_() {
      return avh.uW;
   }

   @Override
   public boolean C(bru $$0) {
      if (this.gp() == cey.g.g) {
         this.a(avh.uV, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         return $$0.a(this.dQ().b((bso)this), 8.0F);
      } else {
         return $$0.a(this.dQ().b((bso)this), 3.0F);
      }
   }

   @Override
   public avi de() {
      return this.gp() == cey.g.g ? avi.f : avi.g;
   }

   @Nullable
   public cey b(aqm $$0, bro $$1) {
      cey $$2 = bsa.aG.a((dax)$$0);
      if ($$2 != null) {
         cey.g $$3;
         $$3 = a($$0, this.dp());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cey $$4 && this.ah.h()) {
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
   public boolean o(cto $$0) {
      return $$0.a(awe.as);
   }

   public cey.g gp() {
      return cey.g.a(this.ao.a(cg));
   }

   public void a(cey.g $$0) {
      if ($$0 == cey.g.g) {
         this.f(btw.a).a(8.0);
         this.bS.a(4, new bzw(this, 1.4, true));
         this.bT.a(1, new cbe(this).a());
         this.bT.a(2, new cbf<>(this, clw.class, true));
         this.bT.a(2, new cbf<>(this, cfh.class, true));
         if (!this.ag()) {
            this.b(wx.c(ac.a("entity", ch)));
         }
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      cey.g $$4 = a($$0, this.dp());
      if ($$3 instanceof cey.b) {
         $$4 = ((cey.b)$$3).a;
      } else {
         $$3 = new cey.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cey.g a(day $$0, io $$1) {
      ix<dbw> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(avv.al)) {
         return $$3 < 80 ? cey.g.b : cey.g.d;
      } else if ($$2.a(avv.ak)) {
         return cey.g.e;
      } else {
         return $$3 < 50 ? cey.g.a : ($$3 < 90 ? cey.g.f : cey.g.c);
      }
   }

   public static boolean c(bsa<cey> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.a_($$3.d()).a(avw.cd) && a((daa)$$1, $$3);
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
   public euk cM() {
      return new euk(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   static class a<T extends bso> extends byt<T> {
      private final cey i;

      public a(cey $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gp() != cey.g.g && super.a();
      }
   }

   public static class b extends bro.a {
      public final cey.g a;

      public b(cey.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends byn {
      private final cey b;
      private boolean c;

      public c(cey $$0) {
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

   static class d extends byp {
      private final cey l;
      private double m;

      public d(cey $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aE() && !this.l.bo && !((cey.c)this.l.bQ).c()) {
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

   static class e extends caf {
      private final cey h;

      public e(cey $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bzz {
      private final cey g;
      private boolean h;
      private boolean i;

      public f(cey $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dP().aa().b(dat.c)) {
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
            dax $$0 = this.g.dP();
            io $$1 = this.e.c();
            drb $$2 = $$0.a_($$1);
            ddy $$3 = $$2.b();
            if (this.i && $$3 instanceof deq) {
               int $$4 = $$2.c(deq.f);
               if ($$4 == 0) {
                  $$0.a($$1, dea.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(deq.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dvu.c, $$1, dvu.a.a(this.g));
                  $$0.c(2001, $$1, ddy.i($$2));
               }

               this.g.cn = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dba $$0, io $$1) {
         drb $$2 = $$0.a_($$1);
         if ($$2.a(dea.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof deq && ((deq)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements ayx {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cey.g> i = awv.a(cey.g::a, values(), a);
      public static final Codec<cey.g> h = ayx.a(cey.g::values);
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

      public static cey.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
