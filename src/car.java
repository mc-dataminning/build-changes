import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class car extends bzx implements bph<car.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final aie<Integer> cb = aih.a(car.class, aig.b);
   private static final aiy cc = new aiy("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public car(bnw<? extends car> $$0, cvr $$1) {
      super($$0, $$1);
      this.bM = new car.c(this);
      this.bL = new car.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bO.a(1, new buz(this));
      this.bO.a(1, new buu(this, this.dM()));
      this.bO.a(1, new car.e(this, 2.2));
      this.bO.a(2, new bur(this, 0.8));
      this.bO.a(3, new bwn(this, 1.0, csc.a(cpg.ub, cpg.ug, cyu.bR), false));
      this.bO.a(4, new car.a<>(this, chl.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new car.a<>(this, cba.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new car.a<>(this, cer.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new car.f(this));
      this.bO.a(6, new bws(this, 0.6));
      this.bO.a(11, new bvn(this, chl.class, 10.0F));
   }

   @Override
   protected float eZ() {
      float $$0 = 0.3F;
      if (this.O || this.bL.b() && this.bL.e() > this.dt() + 0.5) {
         $$0 = 0.5F;
      }

      ehl $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         enz $$2 = $$1.a(this);
         if ($$2.d > this.dt() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bL.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return $$0 + this.fa();
   }

   @Override
   protected void fb() {
      super.fb();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new enz(0.0, 0.0, 1.0));
         }
      }

      if (!this.dM().B) {
         this.dM().a(this, (byte)1);
      }
   }

   public float E(float $$0) {
      return this.cf == 0 ? 0.0F : ((float)this.ce + $$0) / (float)this.cf;
   }

   public void i(double $$0) {
      this.N().a($$0);
      this.bL.a(this.bL.d(), this.bL.e(), this.bL.f(), $$0);
   }

   @Override
   public void r(boolean $$0) {
      super.r($$0);
      if ($$0) {
         this.a(this.A(), this.eW(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void u() {
      this.r(true);
      this.cf = 10;
      this.ce = 0;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cb, car.g.a.j);
   }

   @Override
   public void aa() {
      if (this.ch > 0) {
         this.ch--;
      }

      if (this.ci > 0) {
         this.ci = this.ci - this.af.a(3);
         if (this.ci < 0) {
            this.ci = 0;
         }
      }

      if (this.aC()) {
         if (!this.cg) {
            this.r(false);
            this.gp();
         }

         if (this.gg() == car.g.g && this.ch == 0) {
            boi $$0 = this.q();
            if ($$0 != null && this.f((bnq)$$0) < 16.0) {
               this.c($$0.dr(), $$0.dx());
               this.bL.a($$0.dr(), $$0.dt(), $$0.dx(), this.bL.c());
               this.u();
               this.cg = true;
            }
         }

         car.c $$1 = (car.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               ehl $$2 = this.bN.j();
               enz $$3 = new enz(this.bL.d(), this.bL.e(), this.bL.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.u();
            }
         } else if (!$$1.d()) {
            this.gm();
         }
      }

      this.cg = this.aC();
   }

   @Override
   public boolean bl() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(awi.d($$1 - this.dx(), $$0 - this.dr()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gm() {
      ((car.c)this.bM).a(true);
   }

   private void gn() {
      ((car.c)this.bM).a(false);
   }

   private void go() {
      if (this.bL.c() < 2.2) {
         this.ch = 10;
      } else {
         this.ch = 1;
      }
   }

   private void gp() {
      this.go();
      this.gn();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.ce != this.cf) {
         this.ce++;
      } else if (this.cf != 0) {
         this.ce = 0;
         this.cf = 0;
         this.r(false);
      }
   }

   public static bpo.a w() {
      return bok.C().a(bpp.n, 3.0).a(bpp.o, 0.3F);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gg().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.a(car.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected atk A() {
      return atl.uu;
   }

   @Override
   protected atk y() {
      return atl.uq;
   }

   @Override
   protected atk d(bmp $$0) {
      return atl.ut;
   }

   @Override
   protected atk n_() {
      return atl.us;
   }

   @Override
   public boolean B(bnq $$0) {
      if (this.gg() == car.g.g) {
         this.a(atl.ur, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         return $$0.a(this.dN().b((boi)this), 8.0F);
      } else {
         return $$0.a(this.dN().b((boi)this), 3.0F);
      }
   }

   @Override
   public atm db() {
      return this.gg() == car.g.g ? atm.f : atm.g;
   }

   private static boolean l(cpd $$0) {
      return $$0.a(cpg.ub) || $$0.a(cpg.ug) || $$0.a(cyu.bR.j());
   }

   @Nullable
   public car b(aow $$0, bnl $$1) {
      car $$2 = bnw.aE.a((cvr)$$0);
      if ($$2 != null) {
         car.g $$3;
         $$3 = a($$0, this.dm());
         label16:
         if (this.af.a(20) != 0) {
            if ($$1 instanceof car $$4 && this.af.h()) {
               $$3 = $$4.gg();
               break label16;
            }

            $$3 = this.gg();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean m(cpd $$0) {
      return l($$0);
   }

   public car.g gg() {
      return car.g.a(this.am.b(cb));
   }

   public void a(car.g $$0) {
      if ($$0 == car.g.g) {
         this.f(bpp.a).a(8.0);
         this.bO.a(4, new bvp(this, 1.4, true));
         this.bP.a(1, new bwx(this).a());
         this.bP.a(2, new bwy<>(this, chl.class, true));
         this.bP.a(2, new bwy<>(this, cba.class, true));
         if (!this.ae()) {
            this.b(vq.c(ac.a("entity", cc)));
         }
      }

      this.am.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      car.g $$5 = a($$0, this.dm());
      if ($$3 instanceof car.b) {
         $$5 = ((car.b)$$3).a;
      } else {
         $$3 = new car.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static car.g a(cvs $$0, hz $$1) {
      ij<cwq> $$2 = $$0.t($$1);
      int $$3 = $$0.F_().a(100);
      if ($$2.a(atz.al)) {
         return $$3 < 80 ? car.g.b : car.g.d;
      } else if ($$2.a(atz.ak)) {
         return car.g.e;
      } else {
         return $$3 < 50 ? car.g.a : ($$3 < 90 ? car.g.f : car.g.c);
      }
   }

   public static boolean c(bnw<car> $$0, cvs $$1, bom $$2, hz $$3, awp $$4) {
      return $$1.a_($$3.d()).a(aua.bW) && a((cuu)$$1, $$3);
   }

   boolean gq() {
      return this.ci <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bm();
         this.cf = 10;
         this.ce = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public enz cJ() {
      return new enz(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a<T extends boi> extends bum<T> {
      private final car i;

      public a(car $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gg() != car.g.g && super.a();
      }
   }

   public static class b extends bnl.a {
      public final car.g a;

      public b(car.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bug {
      private final car b;
      private boolean c;

      public c(car $$0) {
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
            this.b.u();
            this.a = false;
         }
      }
   }

   static class d extends bui {
      private final car l;
      private double m;

      public d(car $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bj && !((car.c)this.l.bM).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.aZ()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends bvy {
      private final car h;

      public e(car $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bvs {
      private final car g;
      private boolean h;
      private boolean i;

      public f(car $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dM().Z().b(cvn.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gq();
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
         this.g.I().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ab());
         if (this.m()) {
            cvr $$0 = this.g.dM();
            hz $$1 = this.e.c();
            dlj $$2 = $$0.a_($$1);
            cys $$3 = $$2.b();
            if (this.i && $$3 instanceof czk) {
               int $$4 = $$2.c(czk.f);
               if ($$4 == 0) {
                  $$0.a($$1, cyu.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(czk.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dpw.c, $$1, dpw.a.a(this.g));
                  $$0.c(2001, $$1, cys.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cvu $$0, hz $$1) {
         dlj $$2 = $$0.a_($$1);
         if ($$2.a(cyu.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof czk && ((czk)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements axc {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<car.g> i = ava.a(car.g::a, values(), a);
      public static final Codec<car.g> h = axc.a(car.g::values);
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

      public static car.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
