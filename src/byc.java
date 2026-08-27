import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class byc extends bxi implements bmt<byc.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final afz<Integer> cb = agc.a(byc.class, agb.b);
   private static final agt cc = new agt("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public byc(blj<? extends byc> $$0, csy $$1) {
      super($$0, $$1);
      this.bM = new byc.c(this);
      this.bL = new byc.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsl(this));
      this.bO.a(1, new bsg(this, this.dM()));
      this.bO.a(1, new byc.e(this, 2.2));
      this.bO.a(2, new bsd(this, 0.8));
      this.bO.a(3, new btz(this, 1.0, cpi.a(cmk.tY, cmk.ud, cwb.bR), false));
      this.bO.a(4, new byc.a<>(this, cer.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new byc.a<>(this, byl.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new byc.a<>(this, cbz.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new byc.f(this));
      this.bO.a(6, new bue(this, 0.6));
      this.bO.a(11, new bsz(this, cer.class, 10.0F));
   }

   @Override
   protected float eZ() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.dt() + 0.5) {
         $$0 = 0.5F;
      }

      eeo $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         elb $$2 = $$1.a(this);
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
            this.a(0.1F, new elb(0.0, 0.0, 1.0));
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
      this.an.a(cb, byc.g.a.j);
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

         if (this.ge() == byc.g.g && this.ch == 0) {
            blv $$0 = this.q();
            if ($$0 != null && this.f((blf)$$0) < 16.0) {
               this.c($$0.dr(), $$0.dx());
               this.bL.a($$0.dr(), $$0.dt(), $$0.dx(), this.bL.c());
               this.u();
               this.cg = true;
            }
         }

         byc.c $$1 = (byc.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               eeo $$2 = this.bN.j();
               elb $$3 = new elb(this.bL.d(), this.bL.e(), this.bL.f());
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
      this.r((float)(aty.d($$1 - this.dx(), $$0 - this.dr()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gk() {
      ((byc.c)this.bM).a(true);
   }

   private void gl() {
      ((byc.c)this.bM).a(false);
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

   public static bna.a w() {
      return blx.C().a(bnb.l, 3.0).a(bnb.m, 0.3F);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.ge().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.a(byc.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected arb A() {
      return arc.ue;
   }

   @Override
   protected arb y() {
      return arc.ua;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.ud;
   }

   @Override
   protected arb n_() {
      return arc.uc;
   }

   @Override
   public boolean C(blf $$0) {
      if (this.ge() == byc.g.g) {
         this.a(arc.ub, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dN().b((blv)this), 8.0F);
      } else {
         return $$0.a(this.dN().b((blv)this), 3.0F);
      }
   }

   @Override
   public ard db() {
      return this.ge() == byc.g.g ? ard.f : ard.g;
   }

   private static boolean l(cmh $$0) {
      return $$0.a(cmk.tY) || $$0.a(cmk.ud) || $$0.a(cwb.bR.k());
   }

   @Nullable
   public byc b(amp $$0, bla $$1) {
      byc $$2 = blj.aD.a((csy)$$0);
      if ($$2 != null) {
         byc.g $$3;
         $$3 = a($$0, this.dm());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof byc $$4 && this.ag.h()) {
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
   public boolean m(cmh $$0) {
      return l($$0);
   }

   public byc.g ge() {
      return byc.g.a(this.an.b(cb));
   }

   public void a(byc.g $$0) {
      if ($$0 == byc.g.g) {
         this.a(bnb.a).a(8.0);
         this.bO.a(4, new btb(this, 1.4, true));
         this.bP.a(1, new buj(this).a());
         this.bP.a(2, new buk<>(this, cer.class, true));
         this.bP.a(2, new buk<>(this, byl.class, true));
         if (!this.ae()) {
            this.b(vb.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      byc.g $$5 = a($$0, this.dm());
      if ($$3 instanceof byc.b) {
         $$5 = ((byc.b)$$3).a;
      } else {
         $$3 = new byc.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static byc.g a(csz $$0, hv $$1) {
      ie<ctx> $$2 = $$0.s($$1);
      int $$3 = $$0.F_().a(100);
      if ($$2.a(arq.al)) {
         return $$3 < 80 ? byc.g.b : byc.g.d;
      } else if ($$2.a(arq.ak)) {
         return byc.g.e;
      } else {
         return $$3 < 50 ? byc.g.a : ($$3 < 90 ? byc.g.f : byc.g.c);
      }
   }

   public static boolean c(blj<byc> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.a_($$3.d()).a(arr.bV) && a((csb)$$1, $$3);
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
   public elb cJ() {
      return new elb(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a<T extends blv> extends bry<T> {
      private final byc i;

      public a(byc $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() != byc.g.g && super.a();
      }
   }

   public static class b extends bla.a {
      public final byc.g a;

      public b(byc.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends brs {
      private final byc b;
      private boolean c;

      public c(byc $$0) {
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

   static class d extends bru {
      private final byc l;
      private double m;

      public d(byc $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bj && !((byc.c)this.l.bM).c()) {
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

   static class e extends btk {
      private final byc h;

      public e(byc $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bte {
      private final byc g;
      private boolean h;
      private boolean i;

      public f(byc $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dM().Y().b(csu.c)) {
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
            csy $$0 = this.g.dM();
            hv $$1 = this.e.c();
            dip $$2 = $$0.a_($$1);
            cvz $$3 = $$2.b();
            if (this.i && $$3 instanceof cwr) {
               int $$4 = $$2.c(cwr.f);
               if ($$4 == 0) {
                  $$0.a($$1, cwb.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cwr.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dmz.c, $$1, dmz.a.a(this.g));
                  $$0.c(2001, $$1, cvz.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(ctb $$0, hv $$1) {
         dip $$2 = $$0.a_($$1);
         if ($$2.a(cwb.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof cwr && ((cwr)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements aut {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<byc.g> i = asq.a(byc.g::a, values(), a);
      public static final Codec<byc.g> h = aut.a(byc.g::values);
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

      public static byc.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
