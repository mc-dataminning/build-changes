import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bys extends bxy implements bnj<bys.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final agm<Integer> cb = agp.a(bys.class, ago.b);
   private static final ahg cc = new ahg("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bys(blz<? extends bys> $$0, ctp $$1) {
      super($$0, $$1);
      this.bM = new bys.c(this);
      this.bL = new bys.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bO.a(1, new btb(this));
      this.bO.a(1, new bsw(this, this.dM()));
      this.bO.a(1, new bys.e(this, 2.2));
      this.bO.a(2, new bst(this, 0.8));
      this.bO.a(3, new bup(this, 1.0, cpz.a(cnb.tY, cnb.ud, cws.bR), false));
      this.bO.a(4, new bys.a<>(this, cfi.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bys.a<>(this, bzb.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bys.a<>(this, ccp.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bys.f(this));
      this.bO.a(6, new buu(this, 0.6));
      this.bO.a(11, new btp(this, cfi.class, 10.0F));
   }

   @Override
   protected float eZ() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.dt() + 0.5) {
         $$0 = 0.5F;
      }

      efg $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         elt $$2 = $$1.a(this);
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
            this.a(0.1F, new elt(0.0, 0.0, 1.0));
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
         this.a(this.A(), this.eW(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * 0.8F);
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
      this.an.a(cb, bys.g.a.j);
   }

   @Override
   public void Z() {
      if (this.ch > 0) {
         this.ch--;
      }

      if (this.ci > 0) {
         this.ci = this.ci - this.ag.a(3);
         if (this.ci < 0) {
            this.ci = 0;
         }
      }

      if (this.aC()) {
         if (!this.cg) {
            this.r(false);
            this.gn();
         }

         if (this.ge() == bys.g.g && this.ch == 0) {
            bml $$0 = this.q();
            if ($$0 != null && this.f((blv)$$0) < 16.0) {
               this.c($$0.dr(), $$0.dx());
               this.bL.a($$0.dr(), $$0.dt(), $$0.dx(), this.bL.c());
               this.u();
               this.cg = true;
            }
         }

         bys.c $$1 = (bys.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               efg $$2 = this.bN.j();
               elt $$3 = new elt(this.bL.d(), this.bL.e(), this.bL.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.u();
            }
         } else if (!$$1.d()) {
            this.gk();
         }
      }

      this.cg = this.aC();
   }

   @Override
   public boolean bl() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(auo.d($$1 - this.dx(), $$0 - this.dr()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gk() {
      ((bys.c)this.bM).a(true);
   }

   private void gl() {
      ((bys.c)this.bM).a(false);
   }

   private void gm() {
      if (this.bL.c() < 2.2) {
         this.ch = 10;
      } else {
         this.ch = 1;
      }
   }

   private void gn() {
      this.gm();
      this.gl();
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

   public static bnq.a w() {
      return bmn.C().a(bnr.l, 3.0).a(bnr.m, 0.3F);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.ge().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a(bys.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected arr A() {
      return ars.ue;
   }

   @Override
   protected arr y() {
      return ars.ua;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.ud;
   }

   @Override
   protected arr n_() {
      return ars.uc;
   }

   @Override
   public boolean C(blv $$0) {
      if (this.ge() == bys.g.g) {
         this.a(ars.ub, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dN().b((bml)this), 8.0F);
      } else {
         return $$0.a(this.dN().b((bml)this), 3.0F);
      }
   }

   @Override
   public art db() {
      return this.ge() == bys.g.g ? art.f : art.g;
   }

   private static boolean l(cmy $$0) {
      return $$0.a(cnb.tY) || $$0.a(cnb.ud) || $$0.a(cws.bR.k());
   }

   @Nullable
   public bys b(and $$0, blq $$1) {
      bys $$2 = blz.aD.a((ctp)$$0);
      if ($$2 != null) {
         bys.g $$3;
         $$3 = a($$0, this.dm());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bys $$4 && this.ag.h()) {
               $$3 = $$4.ge();
               break label16;
            }

            $$3 = this.ge();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean m(cmy $$0) {
      return l($$0);
   }

   public bys.g ge() {
      return bys.g.a(this.an.b(cb));
   }

   public void a(bys.g $$0) {
      if ($$0 == bys.g.g) {
         this.a(bnr.a).a(8.0);
         this.bO.a(4, new btr(this, 1.4, true));
         this.bP.a(1, new buz(this).a());
         this.bP.a(2, new bva<>(this, cfi.class, true));
         this.bP.a(2, new bva<>(this, bzb.class, true));
         if (!this.ae()) {
            this.b(vf.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      bys.g $$5 = a($$0, this.dm());
      if ($$3 instanceof bys.b) {
         $$5 = ((bys.b)$$3).a;
      } else {
         $$3 = new bys.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bys.g a(ctq $$0, hx $$1) {
      ih<cuo> $$2 = $$0.t($$1);
      int $$3 = $$0.F_().a(100);
      if ($$2.a(asg.al)) {
         return $$3 < 80 ? bys.g.b : bys.g.d;
      } else if ($$2.a(asg.ak)) {
         return bys.g.e;
      } else {
         return $$3 < 50 ? bys.g.a : ($$3 < 90 ? bys.g.f : bys.g.c);
      }
   }

   public static boolean c(blz<bys> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.a_($$3.d()).a(ash.bV) && a((css)$$1, $$3);
   }

   boolean go() {
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
   public elt cJ() {
      return new elt(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a<T extends bml> extends bso<T> {
      private final bys i;

      public a(bys $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() != bys.g.g && super.a();
      }
   }

   public static class b extends blq.a {
      public final bys.g a;

      public b(bys.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bsi {
      private final bys b;
      private boolean c;

      public c(bys $$0) {
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

   static class d extends bsk {
      private final bys l;
      private double m;

      public d(bys $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bj && !((bys.c)this.l.bM).c()) {
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

   static class e extends bua {
      private final bys h;

      public e(bys $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends btu {
      private final bys g;
      private boolean h;
      private boolean i;

      public f(bys $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dM().Z().b(ctl.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.go();
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
         this.g.I().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.aa());
         if (this.m()) {
            ctp $$0 = this.g.dM();
            hx $$1 = this.e.c();
            djh $$2 = $$0.a_($$1);
            cwq $$3 = $$2.b();
            if (this.i && $$3 instanceof cxi) {
               int $$4 = $$2.c(cxi.f);
               if ($$4 == 0) {
                  $$0.a($$1, cws.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cxi.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dnr.c, $$1, dnr.a.a(this.g));
                  $$0.c(2001, $$1, cwq.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cts $$0, hx $$1) {
         djh $$2 = $$0.a_($$1);
         if ($$2.a(cws.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof cxi && ((cxi)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements avk {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bys.g> i = atg.a(bys.g::a, values(), a);
      public static final Codec<bys.g> h = avk.a(bys.g::values);
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

      public static bys.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
