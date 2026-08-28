import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cgp extends cfv implements bve<cgp.g> {
   public static final double bZ = 0.6;
   public static final double ca = 0.8;
   public static final double cb = 1.0;
   public static final double cd = 2.2;
   public static final double ce = 1.4;
   private static final akg<Integer> cf = akk.a(cgp.class, aki.b);
   private static final alb cg = alb.b("killer_bunny");
   private static final int ch = 3;
   private static final int ci = 5;
   private static final alb cj = alb.b("evil");
   private static final int ck = 8;
   private static final int cl = 40;
   private int cm;
   private int cn;
   private boolean co;
   private int cp;
   int cq;

   public cgp(btq<? extends cgp> $$0, dds $$1) {
      super($$0, $$1);
      this.bR = new cgp.c(this);
      this.bQ = new cgp.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bT.a(1, new caw(this));
      this.bT.a(1, new car(this, this.dS()));
      this.bT.a(1, new cgp.e(this, 2.2));
      this.bT.a(2, new cao(this, 0.8));
      this.bT.a(3, new cck(this, 1.0, $$0 -> $$0.a(axb.as), false));
      this.bT.a(4, new cgp.a<>(this, cnp.class, 8.0F, 2.2, 2.2));
      this.bT.a(4, new cgp.a<>(this, cgy.class, 10.0F, 2.2, 2.2));
      this.bT.a(4, new cgp.a<>(this, ckv.class, 4.0F, 2.2, 2.2));
      this.bT.a(5, new cgp.f(this));
      this.bT.a(6, new ccp(this, 0.6));
      this.bT.a(11, new cbk(this, cnp.class, 10.0F));
   }

   @Override
   protected float fg() {
      float $$0 = 0.3F;
      if (this.Q || this.bQ.b() && this.bQ.e() > this.dz() + 0.5) {
         $$0 = 0.5F;
      }

      eqp $$1 = this.bS.k();
      if ($$1 != null && !$$1.c()) {
         eye $$2 = $$1.a(this);
         if ($$2.e > this.dz() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bQ.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.A($$0 / 0.42F);
   }

   @Override
   public void v() {
      super.v();
      double $$0 = this.bQ.c();
      if ($$0 > 0.0) {
         double $$1 = this.dv().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new eye(0.0, 0.0, 1.0));
         }
      }

      if (!this.dS().B) {
         this.dS().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.cn == 0 ? 0.0F : ((float)this.cm + $$0) / (float)this.cn;
   }

   public void i(double $$0) {
      this.P().a($$0);
      this.bQ.a(this.bQ.d(), this.bQ.e(), this.bQ.f(), $$0);
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
      this.cn = 10;
      this.cm = 0;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cf, cgp.g.a.j);
   }

   @Override
   public void ad() {
      if (this.cp > 0) {
         this.cp--;
      }

      if (this.cq > 0) {
         this.cq = this.cq - this.af.a(3);
         if (this.cq < 0) {
            this.cq = 0;
         }
      }

      if (this.aH()) {
         if (!this.co) {
            this.t(false);
            this.gs();
         }

         if (this.go() == cgp.g.g && this.cp == 0) {
            buf $$0 = this.m();
            if ($$0 != null && this.g((btj)$$0) < 16.0) {
               this.c($$0.dx(), $$0.dD());
               this.bQ.a($$0.dx(), $$0.dz(), $$0.dD(), this.bQ.c());
               this.q();
               this.co = true;
            }
         }

         cgp.c $$1 = (cgp.c)this.bR;
         if (!$$1.c()) {
            if (this.bQ.b() && this.cp == 0) {
               eqp $$2 = this.bS.k();
               eye $$3 = new eye(this.bQ.d(), this.bQ.e(), this.bQ.f());
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

      this.co = this.aH();
   }

   @Override
   public boolean bu() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(azc.d($$1 - this.dD(), $$0 - this.dx()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gp() {
      ((cgp.c)this.bR).a(true);
   }

   private void gq() {
      ((cgp.c)this.bR).a(false);
   }

   private void gr() {
      if (this.bQ.c() < 2.2) {
         this.cp = 10;
      } else {
         this.cp = 1;
      }
   }

   private void gs() {
      this.gr();
      this.gq();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.cm != this.cn) {
         this.cm++;
      } else if (this.cn != 0) {
         this.cm = 0;
         this.cn = 0;
         this.t(false);
      }
   }

   public static bvl.a t() {
      return cfv.gt().a(bvm.s, 3.0).a(bvm.v, 0.3F).a(bvm.c, 3.0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.go().j);
      $$0.a("MoreCarrotTicks", this.cq);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(cgp.g.a($$0.h("RabbitType")));
      this.cq = $$0.h("MoreCarrotTicks");
   }

   protected awc y() {
      return awd.vc;
   }

   @Override
   protected awc w() {
      return awd.uY;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.vb;
   }

   @Override
   protected awc n_() {
      return awd.va;
   }

   @Override
   public void gh() {
      if (this.go() == cgp.g.g) {
         this.a(awd.uZ, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awe di() {
      return this.go() == cgp.g.g ? awe.f : awe.g;
   }

   @Nullable
   public cgp b(arg $$0, btc $$1) {
      cgp $$2 = btq.aG.a($$0, btp.e);
      if ($$2 != null) {
         cgp.g $$3;
         $$3 = a($$0, this.ds());
         label16:
         if (this.af.a(20) != 0) {
            if ($$1 instanceof cgp $$4 && this.af.h()) {
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
   public boolean p(cvl $$0) {
      return $$0.a(axb.as);
   }

   public cgp.g go() {
      return cgp.g.a(this.am.a(cf));
   }

   public void a(cgp.g $$0) {
      if ($$0 == cgp.g.g) {
         this.g(bvm.a).a(8.0);
         this.bT.a(4, new cbm(this, 1.4, true));
         this.bU.a(1, new ccu(this).a());
         this.bU.a(2, new ccv<>(this, cnp.class, true));
         this.bU.a(2, new ccv<>(this, cgy.class, true));
         this.g(bvm.c).a(new bvk(cj, 5.0, bvk.a.a));
         if (!this.ak()) {
            this.b(xd.c(ad.a("entity", cg)));
         }
      } else {
         this.g(bvm.c).c(cj);
      }

      this.am.a(cf, $$0.j);
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      cgp.g $$4 = a($$0, this.ds());
      if ($$3 instanceof cgp.b) {
         $$4 = ((cgp.b)$$3).a;
      } else {
         $$3 = new cgp.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cgp.g a(ddt $$0, je $$1) {
      jn<det> $$2 = $$0.t($$1);
      int $$3 = $$0.C_().a(100);
      if ($$2.a(awr.al)) {
         return $$3 < 80 ? cgp.g.b : cgp.g.d;
      } else if ($$2.a(awr.ak)) {
         return cgp.g.e;
      } else {
         return $$3 < 50 ? cgp.g.a : ($$3 < 90 ? cgp.g.f : cgp.g.c);
      }
   }

   public static boolean c(btq<cgp> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      return $$1.a_($$3.e()).a(aws.ce) && a((dcu)$$1, $$3);
   }

   boolean gA() {
      return this.cq <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bv();
         this.cn = 10;
         this.cm = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public eye cQ() {
      return new eye(0.0, (double)(0.6F * this.cP()), (double)(this.dn() * 0.4F));
   }

   static class a<T extends buf> extends caj<T> {
      private final cgp i;

      public a(cgp $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.go() != cgp.g.g && super.b();
      }
   }

   public static class b extends btc.a {
      public final cgp.g a;

      public b(cgp.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cad {
      private final cgp b;
      private boolean c;

      public c(cgp $$0) {
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

   static class d extends caf {
      private final cgp l;
      private double m;

      public d(cgp $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aH() && !this.l.bk && !((cgp.c)this.l.bR).c()) {
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

   static class e extends cbv {
      private final cgp a;

      public e(cgp $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cbp {
      private final cgp g;
      private boolean h;
      private boolean i;

      public f(cgp $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!this.g.dS().ac().b(ddo.c)) {
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
         this.g.K().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ae());
         if (this.m()) {
            dds $$0 = this.g.dS();
            je $$1 = this.e.d();
            dua $$2 = $$0.a_($$1);
            dgv $$3 = $$2.b();
            if (this.i && $$3 instanceof dhn) {
               int $$4 = $$2.c(dhn.f);
               if ($$4 == 0) {
                  $$0.a($$1, dgx.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dhn.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dyx.c, $$1, dyx.a.a(this.g));
                  $$0.c(2001, $$1, dgv.j($$2));
               }

               this.g.cq = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(ddv $$0, je $$1) {
         dua $$2 = $$0.a_($$1);
         if ($$2.a(dgx.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dhn && ((dhn)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements azy {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cgp.g> i = axt.a(cgp.g::a, values(), a);
      public static final Codec<cgp.g> h = azy.a(cgp.g::values);
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

      public static cgp.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
