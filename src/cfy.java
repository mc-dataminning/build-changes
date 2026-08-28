import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfy extends cfe implements buo<cfy.g> {
   public static final double ca = 0.6;
   public static final double cb = 0.8;
   public static final double cc = 1.0;
   public static final double ce = 2.2;
   public static final double cf = 1.4;
   private static final ajw<Integer> cg = aka.a(cfy.class, ajy.b);
   private static final akr ch = akr.b("killer_bunny");
   private static final int ci = 3;
   private static final int cj = 5;
   private static final akr ck = akr.b("evil");
   private static final int cl = 8;
   private static final int cm = 40;
   private int cn;
   private int co;
   private boolean cp;
   private int cq;
   int cr;

   public cfy(bsx<? extends cfy> $$0, dcw $$1) {
      super($$0, $$1);
      this.bS = new cfy.c(this);
      this.bR = new cfy.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bU.a(1, new cag(this));
      this.bU.a(1, new cab(this, this.dP()));
      this.bU.a(1, new cfy.e(this, 2.2));
      this.bU.a(2, new bzy(this, 0.8));
      this.bU.a(3, new cbu(this, 1.0, $$0 -> $$0.a(awn.as), false));
      this.bU.a(4, new cfy.a<>(this, cmx.class, 8.0F, 2.2, 2.2));
      this.bU.a(4, new cfy.a<>(this, cgh.class, 10.0F, 2.2, 2.2));
      this.bU.a(4, new cfy.a<>(this, ckd.class, 4.0F, 2.2, 2.2));
      this.bU.a(5, new cfy.f(this));
      this.bU.a(6, new cbz(this, 0.6));
      this.bU.a(11, new cau(this, cmx.class, 10.0F));
   }

   @Override
   protected float fe() {
      float $$0 = 0.3F;
      if (this.Q || this.bR.b() && this.bR.e() > this.dw() + 0.5) {
         $$0 = 0.5F;
      }

      epq $$1 = this.bT.j();
      if ($$1 != null && !$$1.c()) {
         exa $$2 = $$1.a(this);
         if ($$2.d > this.dw() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bR.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.y($$0 / 0.42F);
   }

   @Override
   protected void fg() {
      super.fg();
      double $$0 = this.bR.c();
      if ($$0 > 0.0) {
         double $$1 = this.ds().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new exa(0.0, 0.0, 1.0));
         }
      }

      if (!this.dP().B) {
         this.dP().a(this, (byte)1);
      }
   }

   public float H(float $$0) {
      return this.co == 0 ? 0.0F : ((float)this.cn + $$0) / (float)this.co;
   }

   public void i(double $$0) {
      this.N().a($$0);
      this.bR.a(this.bR.d(), this.bR.e(), this.bR.f(), $$0);
   }

   @Override
   public void s(boolean $$0) {
      super.s($$0);
      if ($$0) {
         this.a(this.x(), this.fb(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void s() {
      this.s(true);
      this.co = 10;
      this.cn = 0;
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cg, cfy.g.a.j);
   }

   @Override
   public void ab() {
      if (this.cq > 0) {
         this.cq--;
      }

      if (this.cr > 0) {
         this.cr = this.cr - this.ah.a(3);
         if (this.cr < 0) {
            this.cr = 0;
         }
      }

      if (this.aF()) {
         if (!this.cp) {
            this.s(false);
            this.gp();
         }

         if (this.gl() == cfy.g.g && this.cq == 0) {
            btn $$0 = this.p();
            if ($$0 != null && this.g((bsr)$$0) < 16.0) {
               this.c($$0.du(), $$0.dA());
               this.bR.a($$0.du(), $$0.dw(), $$0.dA(), this.bR.c());
               this.s();
               this.cp = true;
            }
         }

         cfy.c $$1 = (cfy.c)this.bS;
         if (!$$1.c()) {
            if (this.bR.b() && this.cq == 0) {
               epq $$2 = this.bT.j();
               exa $$3 = new exa(this.bR.d(), this.bR.e(), this.bR.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.s();
            }
         } else if (!$$1.d()) {
            this.gm();
         }
      }

      this.cp = this.aF();
   }

   @Override
   public boolean br() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.t((float)(ayo.d($$1 - this.dA(), $$0 - this.du()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gm() {
      ((cfy.c)this.bS).a(true);
   }

   private void gn() {
      ((cfy.c)this.bS).a(false);
   }

   private void go() {
      if (this.bR.c() < 2.2) {
         this.cq = 10;
      } else {
         this.cq = 1;
      }
   }

   private void gp() {
      this.go();
      this.gn();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.cn != this.co) {
         this.cn++;
      } else if (this.co != 0) {
         this.cn = 0;
         this.co = 0;
         this.s(false);
      }
   }

   public static buv.a t() {
      return btp.C().a(buw.s, 3.0).a(buw.v, 0.3F).a(buw.c, 3.0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gl().j);
      $$0.a("MoreCarrotTicks", this.cr);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a(cfy.g.a($$0.h("RabbitType")));
      this.cr = $$0.h("MoreCarrotTicks");
   }

   protected avo x() {
      return avp.vb;
   }

   @Override
   protected avo v() {
      return avp.uX;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.va;
   }

   @Override
   protected avo n_() {
      return avp.uZ;
   }

   @Override
   public void ge() {
      if (this.gl() == cfy.g.g) {
         this.a(avp.uY, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public avq df() {
      return this.gl() == cfy.g.g ? avq.f : avq.g;
   }

   @Nullable
   public cfy b(aqu $$0, bsl $$1) {
      cfy $$2 = bsx.aG.a((dcw)$$0);
      if ($$2 != null) {
         cfy.g $$3;
         $$3 = a($$0, this.dp());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cfy $$4 && this.ah.h()) {
               $$3 = $$4.gl();
               break label16;
            }

            $$3 = this.gl();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awn.as);
   }

   public cfy.g gl() {
      return cfy.g.a(this.ao.a(cg));
   }

   public void a(cfy.g $$0) {
      if ($$0 == cfy.g.g) {
         this.f(buw.a).a(8.0);
         this.bU.a(4, new caw(this, 1.4, true));
         this.bV.a(1, new cce(this).a());
         this.bV.a(2, new ccf<>(this, cmx.class, true));
         this.bV.a(2, new ccf<>(this, cgh.class, true));
         this.f(buw.c).a(new buu(ck, 5.0, buu.a.a));
         if (!this.ai()) {
            this.b(wz.c(ad.a("entity", ch)));
         }
      } else {
         this.f(buw.c).c(ck);
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      cfy.g $$4 = a($$0, this.dp());
      if ($$3 instanceof cfy.b) {
         $$4 = ((cfy.b)$$3).a;
      } else {
         $$3 = new cfy.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cfy.g a(dcx $$0, jd $$1) {
      jm<ddw> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(awd.al)) {
         return $$3 < 80 ? cfy.g.b : cfy.g.d;
      } else if ($$2.a(awd.ak)) {
         return cfy.g.e;
      } else {
         return $$3 < 50 ? cfy.g.a : ($$3 < 90 ? cfy.g.f : cfy.g.c);
      }
   }

   public static boolean c(bsx<cfy> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      return $$1.a_($$3.e()).a(awe.cd) && a((dbz)$$1, $$3);
   }

   boolean gv() {
      return this.cr <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bs();
         this.co = 10;
         this.cn = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public exa cN() {
      return new exa(0.0, (double)(0.6F * this.cM()), (double)(this.dk() * 0.4F));
   }

   static class a<T extends btn> extends bzt<T> {
      private final cfy i;

      public a(cfy $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gl() != cfy.g.g && super.b();
      }
   }

   public static class b extends bsl.a {
      public final cfy.g a;

      public b(cfy.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bzn {
      private final cfy b;
      private boolean c;

      public c(cfy $$0) {
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

   static class d extends bzp {
      private final cfy l;
      private double m;

      public d(cfy $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aF() && !this.l.bn && !((cfy.c)this.l.bS).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bf()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cbf {
      private final cfy a;

      public e(cfy $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends caz {
      private final cfy g;
      private boolean h;
      private boolean i;

      public f(cfy $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!this.g.dP().ab().b(dcs.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gv();
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
         this.g.I().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ac());
         if (this.m()) {
            dcw $$0 = this.g.dP();
            jd $$1 = this.e.d();
            dtc $$2 = $$0.a_($$1);
            dfy $$3 = $$2.b();
            if (this.i && $$3 instanceof dgq) {
               int $$4 = $$2.c(dgq.f);
               if ($$4 == 0) {
                  $$0.a($$1, dga.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dgq.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dxz.c, $$1, dxz.a.a(this.g));
                  $$0.c(2001, $$1, dfy.i($$2));
               }

               this.g.cr = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dcz $$0, jd $$1) {
         dtc $$2 = $$0.a_($$1);
         if ($$2.a(dga.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dgq && ((dgq)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements azk {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cfy.g> i = axe.a(cfy.g::a, values(), a);
      public static final Codec<cfy.g> h = azk.a(cfy.g::values);
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

      public static cfy.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
