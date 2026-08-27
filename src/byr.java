import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class byr extends bxx implements bni<byr.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final agm<Integer> cb = agp.a(byr.class, ago.b);
   private static final ahg cc = new ahg("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public byr(bly<? extends byr> $$0, cto $$1) {
      super($$0, $$1);
      this.bM = new byr.c(this);
      this.bL = new byr.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bta(this));
      this.bO.a(1, new bsv(this, this.dM()));
      this.bO.a(1, new byr.e(this, 2.2));
      this.bO.a(2, new bss(this, 0.8));
      this.bO.a(3, new buo(this, 1.0, cpy.a(cna.tY, cna.ud, cwr.bR), false));
      this.bO.a(4, new byr.a<>(this, cfh.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new byr.a<>(this, bza.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new byr.a<>(this, cco.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new byr.f(this));
      this.bO.a(6, new but(this, 0.6));
      this.bO.a(11, new bto(this, cfh.class, 10.0F));
   }

   @Override
   protected float eZ() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.dt() + 0.5) {
         $$0 = 0.5F;
      }

      eff $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         els $$2 = $$1.a(this);
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
            this.a(0.1F, new els(0.0, 0.0, 1.0));
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
      this.an.a(cb, byr.g.a.j);
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

         if (this.ge() == byr.g.g && this.ch == 0) {
            bmk $$0 = this.q();
            if ($$0 != null && this.f((blu)$$0) < 16.0) {
               this.c($$0.dr(), $$0.dx());
               this.bL.a($$0.dr(), $$0.dt(), $$0.dx(), this.bL.c());
               this.u();
               this.cg = true;
            }
         }

         byr.c $$1 = (byr.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               eff $$2 = this.bN.j();
               els $$3 = new els(this.bL.d(), this.bL.e(), this.bL.f());
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
      this.r((float)(aun.d($$1 - this.dx(), $$0 - this.dr()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gk() {
      ((byr.c)this.bM).a(true);
   }

   private void gl() {
      ((byr.c)this.bM).a(false);
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

   public static bnp.a w() {
      return bmm.C().a(bnq.l, 3.0).a(bnq.m, 0.3F);
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
      this.a(byr.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected arq A() {
      return arr.ue;
   }

   @Override
   protected arq y() {
      return arr.ua;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.ud;
   }

   @Override
   protected arq n_() {
      return arr.uc;
   }

   @Override
   public boolean C(blu $$0) {
      if (this.ge() == byr.g.g) {
         this.a(arr.ub, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dN().b((bmk)this), 8.0F);
      } else {
         return $$0.a(this.dN().b((bmk)this), 3.0F);
      }
   }

   @Override
   public ars db() {
      return this.ge() == byr.g.g ? ars.f : ars.g;
   }

   private static boolean l(cmx $$0) {
      return $$0.a(cna.tY) || $$0.a(cna.ud) || $$0.a(cwr.bR.k());
   }

   @Nullable
   public byr b(and $$0, blp $$1) {
      byr $$2 = bly.aD.a((cto)$$0);
      if ($$2 != null) {
         byr.g $$3;
         $$3 = a($$0, this.dm());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof byr $$4 && this.ag.h()) {
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
   public boolean m(cmx $$0) {
      return l($$0);
   }

   public byr.g ge() {
      return byr.g.a(this.an.b(cb));
   }

   public void a(byr.g $$0) {
      if ($$0 == byr.g.g) {
         this.a(bnq.a).a(8.0);
         this.bO.a(4, new btq(this, 1.4, true));
         this.bP.a(1, new buy(this).a());
         this.bP.a(2, new buz<>(this, cfh.class, true));
         this.bP.a(2, new buz<>(this, bza.class, true));
         if (!this.ae()) {
            this.b(vf.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      byr.g $$5 = a($$0, this.dm());
      if ($$3 instanceof byr.b) {
         $$5 = ((byr.b)$$3).a;
      } else {
         $$3 = new byr.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static byr.g a(ctp $$0, hx $$1) {
      ih<cun> $$2 = $$0.t($$1);
      int $$3 = $$0.F_().a(100);
      if ($$2.a(asf.al)) {
         return $$3 < 80 ? byr.g.b : byr.g.d;
      } else if ($$2.a(asf.ak)) {
         return byr.g.e;
      } else {
         return $$3 < 50 ? byr.g.a : ($$3 < 90 ? byr.g.f : byr.g.c);
      }
   }

   public static boolean c(bly<byr> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      return $$1.a_($$3.d()).a(asg.bV) && a((csr)$$1, $$3);
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
   public els cJ() {
      return new els(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a<T extends bmk> extends bsn<T> {
      private final byr i;

      public a(byr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() != byr.g.g && super.a();
      }
   }

   public static class b extends blp.a {
      public final byr.g a;

      public b(byr.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bsh {
      private final byr b;
      private boolean c;

      public c(byr $$0) {
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

   static class d extends bsj {
      private final byr l;
      private double m;

      public d(byr $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bj && !((byr.c)this.l.bM).c()) {
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

   static class e extends btz {
      private final byr h;

      public e(byr $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends btt {
      private final byr g;
      private boolean h;
      private boolean i;

      public f(byr $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dM().Z().b(ctk.c)) {
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
            cto $$0 = this.g.dM();
            hx $$1 = this.e.c();
            djg $$2 = $$0.a_($$1);
            cwp $$3 = $$2.b();
            if (this.i && $$3 instanceof cxh) {
               int $$4 = $$2.c(cxh.f);
               if ($$4 == 0) {
                  $$0.a($$1, cwr.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cxh.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dnq.c, $$1, dnq.a.a(this.g));
                  $$0.c(2001, $$1, cwp.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(ctr $$0, hx $$1) {
         djg $$2 = $$0.a_($$1);
         if ($$2.a(cwr.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof cxh && ((cxh)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements avj {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<byr.g> i = atf.a(byr.g::a, values(), a);
      public static final Codec<byr.g> h = avj.a(byr.g::values);
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

      public static byr.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
