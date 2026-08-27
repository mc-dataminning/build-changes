import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cej extends cdp implements bsz<cej.g> {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.0;
   public static final double cc = 2.2;
   public static final double cd = 1.4;
   private static final ajm<Integer> cg = ajq.a(cej.class, ajo.b);
   private static final akh ch = new akh("killer_bunny");
   public static final int ce = 8;
   public static final int cf = 8;
   private static final int ci = 40;
   private int cj;
   private int ck;
   private boolean cl;
   private int cm;
   int cn;

   public cej(brn<? extends cej> $$0, dad $$1) {
      super($$0, $$1);
      this.bQ = new cej.c(this);
      this.bP = new cej.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bS.a(1, new byr(this));
      this.bS.a(1, new bym(this, this.dN()));
      this.bS.a(1, new cej.e(this, 2.2));
      this.bS.a(2, new byj(this, 0.8));
      this.bS.a(3, new caf(this, 1.0, $$0 -> $$0.a(avz.as), false));
      this.bS.a(4, new cej.a<>(this, clh.class, 8.0F, 2.2, 2.2));
      this.bS.a(4, new cej.a<>(this, ces.class, 10.0F, 2.2, 2.2));
      this.bS.a(4, new cej.a<>(this, cin.class, 4.0F, 2.2, 2.2));
      this.bS.a(5, new cej.f(this));
      this.bS.a(6, new cak(this, 0.6));
      this.bS.a(11, new bzf(this, clh.class, 10.0F));
   }

   @Override
   protected float ff() {
      float $$0 = 0.3F;
      if (this.Q || this.bP.b() && this.bP.e() > this.du() + 0.5) {
         $$0 = 0.5F;
      }

      emo $$1 = this.bR.j();
      if ($$1 != null && !$$1.c()) {
         etp $$2 = $$1.a(this);
         if ($$2.d > this.du() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bP.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.w($$0 / 0.42F);
   }

   @Override
   protected void fh() {
      super.fh();
      double $$0 = this.bP.c();
      if ($$0 > 0.0) {
         double $$1 = this.dq().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new etp(0.0, 0.0, 1.0));
         }
      }

      if (!this.dN().B) {
         this.dN().a(this, (byte)1);
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
         this.a(this.y(), this.fc(), ((this.ah.i() - this.ah.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void r() {
      this.s(true);
      this.ck = 10;
      this.cj = 0;
   }

   @Override
   protected void a(ajq.a $$0) {
      super.a($$0);
      $$0.a(cg, cej.g.a.j);
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

      if (this.aC()) {
         if (!this.cl) {
            this.s(false);
            this.gy();
         }

         if (this.gp() == cej.g.g && this.cm == 0) {
            bsa $$0 = this.p();
            if ($$0 != null && this.g((brh)$$0) < 16.0) {
               this.c($$0.ds(), $$0.dy());
               this.bP.a($$0.ds(), $$0.du(), $$0.dy(), this.bP.c());
               this.r();
               this.cl = true;
            }
         }

         cej.c $$1 = (cej.c)this.bQ;
         if (!$$1.c()) {
            if (this.bP.b() && this.cm == 0) {
               emo $$2 = this.bR.j();
               etp $$3 = new etp(this.bP.d(), this.bP.e(), this.bP.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.r();
            }
         } else if (!$$1.d()) {
            this.gv();
         }
      }

      this.cl = this.aC();
   }

   @Override
   public boolean bo() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(axz.d($$1 - this.dy(), $$0 - this.ds()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gv() {
      ((cej.c)this.bQ).a(true);
   }

   private void gw() {
      ((cej.c)this.bQ).a(false);
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

   public static btg.a u() {
      return bsc.A().a(bth.q, 3.0).a(bth.r, 0.3F);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gp().j);
      $$0.a("MoreCarrotTicks", this.cn);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(cej.g.a($$0.h("RabbitType")));
      this.cn = $$0.h("MoreCarrotTicks");
   }

   protected avb y() {
      return avc.uN;
   }

   @Override
   protected avb v() {
      return avc.uJ;
   }

   @Override
   protected avb d(bqf $$0) {
      return avc.uM;
   }

   @Override
   protected avb o_() {
      return avc.uL;
   }

   @Override
   public boolean C(brh $$0) {
      if (this.gp() == cej.g.g) {
         this.a(avc.uK, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
         return $$0.a(this.dO().b((bsa)this), 8.0F);
      } else {
         return $$0.a(this.dO().b((bsa)this), 3.0F);
      }
   }

   @Override
   public avd dc() {
      return this.gp() == cej.g.g ? avd.f : avd.g;
   }

   @Nullable
   public cej b(aqh $$0, brb $$1) {
      cej $$2 = brn.aF.a((dad)$$0);
      if ($$2 != null) {
         cej.g $$3;
         $$3 = a($$0, this.dn());
         label16:
         if (this.ah.a(20) != 0) {
            if ($$1 instanceof cej $$4 && this.ah.h()) {
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
   public boolean o(csz $$0) {
      return $$0.a(avz.as);
   }

   public cej.g gp() {
      return cej.g.a(this.ao.a(cg));
   }

   public void a(cej.g $$0) {
      if ($$0 == cej.g.g) {
         this.f(bth.a).a(8.0);
         this.bS.a(4, new bzh(this, 1.4, true));
         this.bT.a(1, new cap(this).a());
         this.bT.a(2, new caq<>(this, clh.class, true));
         this.bT.a(2, new caq<>(this, ces.class, true));
         if (!this.ae()) {
            this.b(wu.c(ac.a("entity", ch)));
         }
      }

      this.ao.a(cg, $$0.j);
   }

   @Nullable
   @Override
   public bss a(das $$0, bpk $$1, bse $$2, @Nullable bss $$3) {
      cej.g $$4 = a($$0, this.dn());
      if ($$3 instanceof cej.b) {
         $$4 = ((cej.b)$$3).a;
      } else {
         $$3 = new cej.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cej.g a(dae $$0, in $$1) {
      iw<dbc> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(avq.al)) {
         return $$3 < 80 ? cej.g.b : cej.g.d;
      } else if ($$2.a(avq.ak)) {
         return cej.g.e;
      } else {
         return $$3 < 50 ? cej.g.a : ($$3 < 90 ? cej.g.f : cej.g.c);
      }
   }

   public static boolean c(brn<cej> $$0, dae $$1, bse $$2, in $$3, ayg $$4) {
      return $$1.a_($$3.d()).a(avr.cd) && a((czg)$$1, $$3);
   }

   boolean gz() {
      return this.cn <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bp();
         this.ck = 10;
         this.cj = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public etp cK() {
      return new etp(0.0, (double)(0.6F * this.cJ()), (double)(this.dh() * 0.4F));
   }

   static class a<T extends bsa> extends bye<T> {
      private final cej i;

      public a(cej $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gp() != cej.g.g && super.a();
      }
   }

   public static class b extends brb.a {
      public final cej.g a;

      public b(cej.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bxy {
      private final cej b;
      private boolean c;

      public c(cej $$0) {
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

   static class d extends bya {
      private final cej l;
      private double m;

      public d(cej $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bo && !((cej.c)this.l.bQ).c()) {
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

   static class e extends bzq {
      private final cej h;

      public e(cej $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bzk {
      private final cej g;
      private boolean h;
      private boolean i;

      public f(cej $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dN().aa().b(czz.c)) {
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
            dad $$0 = this.g.dN();
            in $$1 = this.e.c();
            dqh $$2 = $$0.a_($$1);
            dde $$3 = $$2.b();
            if (this.i && $$3 instanceof ddw) {
               int $$4 = $$2.c(ddw.f);
               if ($$4 == 0) {
                  $$0.a($$1, ddg.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(ddw.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dva.c, $$1, dva.a.a(this.g));
                  $$0.c(2001, $$1, dde.i($$2));
               }

               this.g.cn = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dag $$0, in $$1) {
         dqh $$2 = $$0.a_($$1);
         if ($$2.a(ddg.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof ddw && ((ddw)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements ayt {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cej.g> i = awq.a(cej.g::a, values(), a);
      public static final Codec<cej.g> h = ayt.a(cej.g::values);
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

      public static cej.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
