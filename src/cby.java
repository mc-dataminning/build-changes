import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cby extends cbe implements bqo<cby.g> {
   public static final double bX = 0.6;
   public static final double bY = 0.8;
   public static final double ca = 1.0;
   public static final double cb = 2.2;
   public static final double cc = 1.4;
   private static final aim<Integer> cf = aiq.a(cby.class, aio.b);
   private static final ajh cg = new ajh("killer_bunny");
   public static final int cd = 8;
   public static final int ce = 8;
   private static final int ch = 40;
   private int ci;
   private int cj;
   private boolean ck;
   private int cl;
   int cm;

   public cby(bpd<? extends cby> $$0, cxb $$1) {
      super($$0, $$1);
      this.bP = new cby.c(this);
      this.bO = new cby.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bwg(this));
      this.bR.a(1, new bwb(this, this.dM()));
      this.bR.a(1, new cby.e(this, 2.2));
      this.bR.a(2, new bvy(this, 0.8));
      this.bR.a(3, new bxu(this, 1.0, ctm.a(cqp.ud, cqp.ui, dae.bR), false));
      this.bR.a(4, new cby.a<>(this, ciu.class, 8.0F, 2.2, 2.2));
      this.bR.a(4, new cby.a<>(this, cch.class, 10.0F, 2.2, 2.2));
      this.bR.a(4, new cby.a<>(this, cga.class, 4.0F, 2.2, 2.2));
      this.bR.a(5, new cby.f(this));
      this.bR.a(6, new bxz(this, 0.6));
      this.bR.a(11, new bwu(this, ciu.class, 10.0F));
   }

   @Override
   protected float fe() {
      float $$0 = 0.3F;
      if (this.P || this.bO.b() && this.bO.e() > this.dt() + 0.5) {
         $$0 = 0.5F;
      }

      ejd $$1 = this.bQ.j();
      if ($$1 != null && !$$1.c()) {
         ept $$2 = $$1.a(this);
         if ($$2.d > this.dt() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bO.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.w($$0 / 0.42F);
   }

   @Override
   protected void fg() {
      super.fg();
      double $$0 = this.bO.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ept(0.0, 0.0, 1.0));
         }
      }

      if (!this.dM().B) {
         this.dM().a(this, (byte)1);
      }
   }

   public float G(float $$0) {
      return this.cj == 0 ? 0.0F : ((float)this.ci + $$0) / (float)this.cj;
   }

   public void i(double $$0) {
      this.K().a($$0);
      this.bO.a(this.bO.d(), this.bO.e(), this.bO.f(), $$0);
   }

   @Override
   public void r(boolean $$0) {
      super.r($$0);
      if ($$0) {
         this.a(this.y(), this.fb(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void r() {
      this.r(true);
      this.cj = 10;
      this.ci = 0;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cf, cby.g.a.j);
   }

   @Override
   public void Y() {
      if (this.cl > 0) {
         this.cl--;
      }

      if (this.cm > 0) {
         this.cm = this.cm - this.ag.a(3);
         if (this.cm < 0) {
            this.cm = 0;
         }
      }

      if (this.aC()) {
         if (!this.ck) {
            this.r(false);
            this.gw();
         }

         if (this.gn() == cby.g.g && this.cl == 0) {
            bpp $$0 = this.p();
            if ($$0 != null && this.g((box)$$0) < 16.0) {
               this.c($$0.dr(), $$0.dx());
               this.bO.a($$0.dr(), $$0.dt(), $$0.dx(), this.bO.c());
               this.r();
               this.ck = true;
            }
         }

         cby.c $$1 = (cby.c)this.bP;
         if (!$$1.c()) {
            if (this.bO.b() && this.cl == 0) {
               ejd $$2 = this.bQ.j();
               ept $$3 = new ept(this.bO.d(), this.bO.e(), this.bO.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.r();
            }
         } else if (!$$1.d()) {
            this.gt();
         }
      }

      this.ck = this.aC();
   }

   @Override
   public boolean bo() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(aww.d($$1 - this.dx(), $$0 - this.dr()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gt() {
      ((cby.c)this.bP).a(true);
   }

   private void gu() {
      ((cby.c)this.bP).a(false);
   }

   private void gv() {
      if (this.bO.c() < 2.2) {
         this.cl = 10;
      } else {
         this.cl = 1;
      }
   }

   private void gw() {
      this.gv();
      this.gu();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.ci != this.cj) {
         this.ci++;
      } else if (this.cj != 0) {
         this.ci = 0;
         this.cj = 0;
         this.r(false);
      }
   }

   public static bqv.a s() {
      return bpr.A().a(bqw.q, 3.0).a(bqw.r, 0.3F);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gn().j);
      $$0.a("MoreCarrotTicks", this.cm);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a(cby.g.a($$0.h("RabbitType")));
      this.cm = $$0.h("MoreCarrotTicks");
   }

   protected atx y() {
      return aty.uC;
   }

   @Override
   protected atx v() {
      return aty.uy;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.uB;
   }

   @Override
   protected atx n_() {
      return aty.uA;
   }

   @Override
   public boolean C(box $$0) {
      if (this.gn() == cby.g.g) {
         this.a(aty.uz, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dN().b((bpp)this), 8.0F);
      } else {
         return $$0.a(this.dN().b((bpp)this), 3.0F);
      }
   }

   @Override
   public atz db() {
      return this.gn() == cby.g.g ? atz.f : atz.g;
   }

   private static boolean n(cqm $$0) {
      return $$0.a(cqp.ud) || $$0.a(cqp.ui) || $$0.a(dae.bR.l());
   }

   @Nullable
   public cby b(apf $$0, bos $$1) {
      cby $$2 = bpd.aG.a((cxb)$$0);
      if ($$2 != null) {
         cby.g $$3;
         $$3 = a($$0, this.dm());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof cby $$4 && this.ag.h()) {
               $$3 = $$4.gn();
               break label16;
            }

            $$3 = this.gn();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean o(cqm $$0) {
      return n($$0);
   }

   public cby.g gn() {
      return cby.g.a(this.an.a(cf));
   }

   public void a(cby.g $$0) {
      if ($$0 == cby.g.g) {
         this.f(bqw.a).a(8.0);
         this.bR.a(4, new bww(this, 1.4, true));
         this.bS.a(1, new bye(this).a());
         this.bS.a(2, new byf<>(this, ciu.class, true));
         this.bS.a(2, new byf<>(this, cch.class, true));
         if (!this.ae()) {
            this.b(vu.c(ac.a("entity", cg)));
         }
      }

      this.an.a(cf, $$0.j);
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      cby.g $$4 = a($$0, this.dm());
      if ($$3 instanceof cby.b) {
         $$4 = ((cby.b)$$3).a;
      } else {
         $$3 = new cby.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cby.g a(cxc $$0, ib $$1) {
      il<cya> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(aum.al)) {
         return $$3 < 80 ? cby.g.b : cby.g.d;
      } else if ($$2.a(aum.ak)) {
         return cby.g.e;
      } else {
         return $$3 < 50 ? cby.g.a : ($$3 < 90 ? cby.g.f : cby.g.c);
      }
   }

   public static boolean c(bpd<cby> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bX) && a((cwe)$$1, $$3);
   }

   boolean gx() {
      return this.cm <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bp();
         this.cj = 10;
         this.ci = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public ept cJ() {
      return new ept(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a<T extends bpp> extends bvt<T> {
      private final cby i;

      public a(cby $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() != cby.g.g && super.a();
      }
   }

   public static class b extends bos.a {
      public final cby.g a;

      public b(cby.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bvn {
      private final cby b;
      private boolean c;

      public c(cby $$0) {
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
            this.b.r();
            this.a = false;
         }
      }
   }

   static class d extends bvp {
      private final cby l;
      private double m;

      public d(cby $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bm && !((cby.c)this.l.bP).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bc()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends bxf {
      private final cby h;

      public e(cby $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bwz {
      private final cby g;
      private boolean h;
      private boolean i;

      public f(cby $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dM().Z().b(cwx.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gx();
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
            cxb $$0 = this.g.dM();
            ib $$1 = this.e.c();
            dnb $$2 = $$0.a_($$1);
            dac $$3 = $$2.b();
            if (this.i && $$3 instanceof dau) {
               int $$4 = $$2.c(dau.f);
               if ($$4 == 0) {
                  $$0.a($$1, dae.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dau.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(drp.c, $$1, drp.a.a(this.g));
                  $$0.c(2001, $$1, dac.i($$2));
               }

               this.g.cm = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cxe $$0, ib $$1) {
         dnb $$2 = $$0.a_($$1);
         if ($$2.a(dae.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof dau && ((dau)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements axq {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cby.g> i = avn.a(cby.g::a, values(), a);
      public static final Codec<cby.g> h = axq.a(cby.g::values);
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

      public static cby.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
