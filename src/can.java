import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class can extends bzt implements bpd<can.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final aie<Integer> cb = aih.a(can.class, aig.b);
   private static final aiy cc = new aiy("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public can(bnu<? extends can> $$0, cvn $$1) {
      super($$0, $$1);
      this.bM = new can.c(this);
      this.bL = new can.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bO.a(1, new buv(this));
      this.bO.a(1, new buq(this, this.dM()));
      this.bO.a(1, new can.e(this, 2.2));
      this.bO.a(2, new bun(this, 0.8));
      this.bO.a(3, new bwj(this, 1.0, cry.a(cpc.ub, cpc.ug, cyq.bR), false));
      this.bO.a(4, new can.a<>(this, chh.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new can.a<>(this, caw.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new can.a<>(this, cen.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new can.f(this));
      this.bO.a(6, new bwo(this, 0.6));
      this.bO.a(11, new bvj(this, chh.class, 10.0F));
   }

   @Override
   protected float eZ() {
      float $$0 = 0.3F;
      if (this.O || this.bL.b() && this.bL.e() > this.dt() + 0.5) {
         $$0 = 0.5F;
      }

      ehe $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         ens $$2 = $$1.a(this);
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
            this.a(0.1F, new ens(0.0, 0.0, 1.0));
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
      this.am.a(cb, can.g.a.j);
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

         if (this.gg() == can.g.g && this.ch == 0) {
            bog $$0 = this.q();
            if ($$0 != null && this.f((bno)$$0) < 16.0) {
               this.c($$0.dr(), $$0.dx());
               this.bL.a($$0.dr(), $$0.dt(), $$0.dx(), this.bL.c());
               this.u();
               this.cg = true;
            }
         }

         can.c $$1 = (can.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               ehe $$2 = this.bN.j();
               ens $$3 = new ens(this.bL.d(), this.bL.e(), this.bL.f());
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
      this.r((float)(awh.d($$1 - this.dx(), $$0 - this.dr()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gm() {
      ((can.c)this.bM).a(true);
   }

   private void gn() {
      ((can.c)this.bM).a(false);
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

   public static bpk.a w() {
      return boi.C().a(bpl.n, 3.0).a(bpl.o, 0.3F);
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
      this.a(can.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected atj A() {
      return atk.ut;
   }

   @Override
   protected atj y() {
      return atk.up;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.us;
   }

   @Override
   protected atj n_() {
      return atk.ur;
   }

   @Override
   public boolean B(bno $$0) {
      if (this.gg() == can.g.g) {
         this.a(atk.uq, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         return $$0.a(this.dN().b((bog)this), 8.0F);
      } else {
         return $$0.a(this.dN().b((bog)this), 3.0F);
      }
   }

   @Override
   public atl db() {
      return this.gg() == can.g.g ? atl.f : atl.g;
   }

   private static boolean l(coz $$0) {
      return $$0.a(cpc.ub) || $$0.a(cpc.ug) || $$0.a(cyq.bR.j());
   }

   @Nullable
   public can b(aov $$0, bnj $$1) {
      can $$2 = bnu.aE.a((cvn)$$0);
      if ($$2 != null) {
         can.g $$3;
         $$3 = a($$0, this.dm());
         label16:
         if (this.af.a(20) != 0) {
            if ($$1 instanceof can $$4 && this.af.h()) {
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
   public boolean m(coz $$0) {
      return l($$0);
   }

   public can.g gg() {
      return can.g.a(this.am.b(cb));
   }

   public void a(can.g $$0) {
      if ($$0 == can.g.g) {
         this.f(bpl.a).a(8.0);
         this.bO.a(4, new bvl(this, 1.4, true));
         this.bP.a(1, new bwt(this).a());
         this.bP.a(2, new bwu<>(this, chh.class, true));
         this.bP.a(2, new bwu<>(this, caw.class, true));
         if (!this.ae()) {
            this.b(vq.c(ac.a("entity", cc)));
         }
      }

      this.am.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      can.g $$5 = a($$0, this.dm());
      if ($$3 instanceof can.b) {
         $$5 = ((can.b)$$3).a;
      } else {
         $$3 = new can.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static can.g a(cvo $$0, hz $$1) {
      ij<cwm> $$2 = $$0.t($$1);
      int $$3 = $$0.F_().a(100);
      if ($$2.a(aty.al)) {
         return $$3 < 80 ? can.g.b : can.g.d;
      } else if ($$2.a(aty.ak)) {
         return can.g.e;
      } else {
         return $$3 < 50 ? can.g.a : ($$3 < 90 ? can.g.f : can.g.c);
      }
   }

   public static boolean c(bnu<can> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.a_($$3.d()).a(atz.bW) && a((cuq)$$1, $$3);
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
   public ens cJ() {
      return new ens(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a<T extends bog> extends bui<T> {
      private final can i;

      public a(can $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gg() != can.g.g && super.a();
      }
   }

   public static class b extends bnj.a {
      public final can.g a;

      public b(can.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends buc {
      private final can b;
      private boolean c;

      public c(can $$0) {
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

   static class d extends bue {
      private final can l;
      private double m;

      public d(can $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bj && !((can.c)this.l.bM).c()) {
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

   static class e extends bvu {
      private final can h;

      public e(can $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bvo {
      private final can g;
      private boolean h;
      private boolean i;

      public f(can $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dM().Z().b(cvj.c)) {
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
            cvn $$0 = this.g.dM();
            hz $$1 = this.e.c();
            dlf $$2 = $$0.a_($$1);
            cyo $$3 = $$2.b();
            if (this.i && $$3 instanceof czg) {
               int $$4 = $$2.c(czg.f);
               if ($$4 == 0) {
                  $$0.a($$1, cyq.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(czg.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dpp.c, $$1, dpp.a.a(this.g));
                  $$0.c(2001, $$1, cyo.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cvq $$0, hz $$1) {
         dlf $$2 = $$0.a_($$1);
         if ($$2.a(cyq.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof czg && ((czg)$$2.b()).h($$2)) {
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

      private static final IntFunction<can.g> i = auz.a(can.g::a, values(), a);
      public static final Codec<can.g> h = axc.a(can.g::values);
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

      public static can.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
