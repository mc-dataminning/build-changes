import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cii extends cho implements bwx<cii.g> {
   public static final double bZ = 0.6;
   public static final double ca = 0.8;
   public static final double cb = 1.0;
   public static final double cd = 2.2;
   public static final double ce = 1.4;
   private static final aks<Integer> cf = akw.a(cii.class, aku.b);
   private static final alp cg = alp.b("killer_bunny");
   private static final int ch = 3;
   private static final int ci = 5;
   private static final alp cj = alp.b("evil");
   private static final int ck = 8;
   private static final int cl = 40;
   private int cm;
   private int cn;
   private boolean co;
   private int cp;
   int cq;

   public cii(bvi<? extends cii> $$0, dgz $$1) {
      super($$0, $$1);
      this.bR = new cii.c(this);
      this.bQ = new cii.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bT.a(1, new ccp(this));
      this.bT.a(1, new cck(this, this.dW()));
      this.bT.a(1, new cii.e(this, 2.2));
      this.bT.a(2, new cch(this, 0.8));
      this.bT.a(3, new ced(this, 1.0, $$0 -> $$0.a(axt.ay), false));
      this.bT.a(4, new cii.a<>(this, cpo.class, 8.0F, 2.2, 2.2));
      this.bT.a(4, new cii.a<>(this, cir.class, 10.0F, 2.2, 2.2));
      this.bT.a(4, new cii.a<>(this, cmo.class, 4.0F, 2.2, 2.2));
      this.bT.a(5, new cii.f(this));
      this.bT.a(6, new cei(this, 0.6));
      this.bT.a(11, new cdd(this, cpo.class, 10.0F));
   }

   @Override
   protected float fj() {
      float $$0 = 0.3F;
      if (this.P || this.bQ.b() && this.bQ.e() > this.dD() + 0.5) {
         $$0 = 0.5F;
      }

      eue $$1 = this.bS.k();
      if ($$1 != null && !$$1.c()) {
         fbr $$2 = $$1.a(this);
         if ($$2.e > this.dD() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bQ.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.A($$0 / 0.42F);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bQ.c();
      if ($$0 > 0.0) {
         double $$1 = this.dz().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fbr(0.0, 0.0, 1.0));
         }
      }

      if (!this.dW().C) {
         this.dW().a(this, (byte)1);
      }
   }

   public float J(float $$0) {
      return this.cn == 0 ? 0.0F : ((float)this.cm + $$0) / (float)this.cn;
   }

   public void i(double $$0) {
      this.L().a($$0);
      this.bQ.a(this.bQ.d(), this.bQ.e(), this.bQ.f(), $$0);
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
      this.cn = 10;
      this.cm = 0;
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cf, cii.g.a.j);
   }

   @Override
   public void a(arx $$0) {
      if (this.cp > 0) {
         this.cp--;
      }

      if (this.cq > 0) {
         this.cq = this.cq - this.ae.a(3);
         if (this.cq < 0) {
            this.cq = 0;
         }
      }

      if (this.aJ()) {
         if (!this.co) {
            this.t(false);
            this.gs();
         }

         if (this.go() == cii.g.g && this.cp == 0) {
            bvx $$1 = this.O_();
            if ($$1 != null && this.g((bvb)$$1) < 16.0) {
               this.c($$1.dB(), $$1.dH());
               this.bQ.a($$1.dB(), $$1.dD(), $$1.dH(), this.bQ.c());
               this.p();
               this.co = true;
            }
         }

         cii.c $$2 = (cii.c)this.bR;
         if (!$$2.c()) {
            if (this.bQ.b() && this.cp == 0) {
               eue $$3 = this.bS.k();
               fbr $$4 = new fbr(this.bQ.d(), this.bQ.e(), this.bQ.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.p();
            }
         } else if (!$$2.d()) {
            this.gp();
         }
      }

      this.co = this.aJ();
   }

   @Override
   public boolean bv() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.v((float)(azu.d($$1 - this.dH(), $$0 - this.dB()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gp() {
      ((cii.c)this.bR).a(true);
   }

   private void gq() {
      ((cii.c)this.bR).a(false);
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
   public void d_() {
      super.d_();
      if (this.cm != this.cn) {
         this.cm++;
      } else if (this.cn != 0) {
         this.cm = 0;
         this.cn = 0;
         this.t(false);
      }
   }

   public static bxe.a t() {
      return cho.gt().a(bxf.s, 3.0).a(bxf.v, 0.3F).a(bxf.c, 3.0);
   }

   @Override
   public void b(um $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.go().j);
      $$0.a("MoreCarrotTicks", this.cq);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a(cii.g.a($$0.h("RabbitType")));
      this.cq = $$0.h("MoreCarrotTicks");
   }

   protected awu x() {
      return awv.vB;
   }

   @Override
   protected awu u() {
      return awv.vx;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.vA;
   }

   @Override
   protected awu o_() {
      return awv.vz;
   }

   @Override
   public void gf() {
      if (this.go() == cii.g.g) {
         this.a(awv.vy, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public aww dn() {
      return this.go() == cii.g.g ? aww.f : aww.g;
   }

   @Nullable
   public cii b(arx $$0, bus $$1) {
      cii $$2 = bvi.aY.a($$0, bvh.e);
      if ($$2 != null) {
         cii.g $$3;
         $$3 = a($$0, this.dw());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof cii $$4 && this.ae.h()) {
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
   public boolean j(cxg $$0) {
      return $$0.a(axt.ay);
   }

   public cii.g go() {
      return cii.g.a(this.al.a(cf));
   }

   public void a(cii.g $$0) {
      if ($$0 == cii.g.g) {
         this.g(bxf.a).a(8.0);
         this.bT.a(4, new cdf(this, 1.4, true));
         this.bU.a(1, new cen(this).a());
         this.bU.a(2, new ceo<>(this, cpo.class, true));
         this.bU.a(2, new ceo<>(this, cir.class, true));
         this.g(bxf.c).a(new bxd(cj, 5.0, bxd.a.a));
         if (!this.l_()) {
            this.b(xk.c(ae.a("entity", cg)));
         }
      } else {
         this.g(bxf.c).c(cj);
      }

      this.al.a(cf, $$0.j);
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      cii.g $$4 = a($$0, this.dw());
      if ($$3 instanceof cii.b) {
         $$4 = ((cii.b)$$3).a;
      } else {
         $$3 = new cii.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cii.g a(dha $$0, jh $$1) {
      jq<dib> $$2 = $$0.t($$1);
      int $$3 = $$0.H_().a(100);
      if ($$2.a(axj.al)) {
         return $$3 < 80 ? cii.g.b : cii.g.d;
      } else if ($$2.a(axj.ak)) {
         return cii.g.e;
      } else {
         return $$3 < 50 ? cii.g.a : ($$3 < 90 ? cii.g.f : cii.g.c);
      }
   }

   public static boolean c(bvi<cii> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      return $$1.a_($$3.e()).a(axk.cf) && a((dgb)$$1, $$3);
   }

   boolean gA() {
      return this.cq <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bw();
         this.cn = 10;
         this.cm = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public fbr cT() {
      return new fbr(0.0, (double)(0.6F * this.cS()), (double)(this.dr() * 0.4F));
   }

   static class a<T extends bvx> extends ccc<T> {
      private final cii i;

      public a(cii $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.go() != cii.g.g && super.b();
      }
   }

   public static class b extends bus.a {
      public final cii.g a;

      public b(cii.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cbw {
      private final cii b;
      private boolean c;

      public c(cii $$0) {
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

   static class d extends cby {
      private final cii l;
      private double m;

      public d(cii $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.bn && !((cii.c)this.l.bR).c()) {
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

   static class e extends cdo {
      private final cii a;

      public e(cii $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cdi {
      private final cii g;
      private boolean h;
      private boolean i;

      public f(cii $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().b(dgv.c)) {
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
         this.g.H().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.Z());
         if (this.m()) {
            dgz $$0 = this.g.dW();
            jh $$1 = this.e.d();
            dxo $$2 = $$0.a_($$1);
            dkd $$3 = $$2.b();
            if (this.i && $$3 instanceof dkw) {
               int $$4 = $$2.c(dkw.f);
               if ($$4 == 0) {
                  $$0.a($$1, dkf.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dkw.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(eck.c, $$1, eck.a.a(this.g));
                  $$0.c(2001, $$1, dkd.j($$2));
               }

               this.g.cq = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dhc $$0, jh $$1) {
         dxo $$2 = $$0.a_($$1);
         if ($$2.a(dkf.cK) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dkw && ((dkw)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements baq {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cii.g> i = ayl.a(cii.g::a, values(), a);
      public static final Codec<cii.g> h = baq.a(cii.g::values);
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

      public static cii.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
