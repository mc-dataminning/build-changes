import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bxd extends bwj implements blw<bxd.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final afm<Integer> cb = afp.a(bxd.class, afo.b);
   private static final agg cc = new agg("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bxd(bkm<? extends bxd> $$0, crs $$1) {
      super($$0, $$1);
      this.bM = new bxd.c(this);
      this.bL = new bxd.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bO.a(1, new brn(this));
      this.bO.a(1, new bri(this, this.dL()));
      this.bO.a(1, new bxd.e(this, 2.2));
      this.bO.a(2, new brf(this, 0.8));
      this.bO.a(3, new btb(this, 1.0, coc.a(cle.tm, cle.tr, cuv.bR), false));
      this.bO.a(4, new bxd.a<>(this, cdm.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bxd.a<>(this, bxm.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bxd.a<>(this, cba.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bxd.f(this));
      this.bO.a(6, new btg(this, 0.6));
      this.bO.a(11, new bsb(this, cdm.class, 10.0F));
   }

   @Override
   protected float eY() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.ds() + 0.5) {
         $$0 = 0.5F;
      }

      ecv $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         eji $$2 = $$1.a(this);
         if ($$2.d > this.ds() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bL.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return $$0 + this.eZ();
   }

   @Override
   protected void fa() {
      super.fa();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.do().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new eji(0.0, 0.0, 1.0));
         }
      }

      if (!this.dL().B) {
         this.dL().a(this, (byte)1);
      }
   }

   public float E(float $$0) {
      return this.cf == 0 ? 0.0F : ((float)this.ce + $$0) / (float)this.cf;
   }

   public void i(double $$0) {
      this.L().a($$0);
      this.bL.a(this.bL.d(), this.bL.e(), this.bL.f(), $$0);
   }

   @Override
   public void r(boolean $$0) {
      super.r($$0);
      if ($$0) {
         this.a(this.y(), this.eV(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void s() {
      this.r(true);
      this.cf = 10;
      this.ce = 0;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(cb, bxd.g.a.j);
   }

   @Override
   public void X() {
      if (this.ch > 0) {
         this.ch--;
      }

      if (this.ci > 0) {
         this.ci = this.ci - this.ag.a(3);
         if (this.ci < 0) {
            this.ci = 0;
         }
      }

      if (this.aA()) {
         if (!this.cg) {
            this.r(false);
            this.gn();
         }

         if (this.ge() == bxd.g.g && this.ch == 0) {
            bky $$0 = this.q();
            if ($$0 != null && this.f((bki)$$0) < 16.0) {
               this.c($$0.dq(), $$0.dw());
               this.bL.a($$0.dq(), $$0.ds(), $$0.dw(), this.bL.c());
               this.s();
               this.cg = true;
            }
         }

         bxd.c $$1 = (bxd.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               ecv $$2 = this.bN.j();
               eji $$3 = new eji(this.bL.d(), this.bL.e(), this.bL.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.s();
            }
         } else if (!$$1.d()) {
            this.gk();
         }
      }

      this.cg = this.aA();
   }

   @Override
   public boolean bj() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(ati.d($$1 - this.dw(), $$0 - this.dq()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gk() {
      ((bxd.c)this.bM).a(true);
   }

   private void gl() {
      ((bxd.c)this.bM).a(false);
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
   public void c_() {
      super.c_();
      if (this.ce != this.cf) {
         this.ce++;
      } else if (this.cf != 0) {
         this.ce = 0;
         this.cf = 0;
         this.r(false);
      }
   }

   public static bmd.a t() {
      return bla.A().a(bme.l, 3.0).a(bme.m, 0.3F);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.ge().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(bxd.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected aqm y() {
      return aqn.ts;
   }

   @Override
   protected aqm w() {
      return aqn.to;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.tr;
   }

   @Override
   protected aqm m_() {
      return aqn.tq;
   }

   @Override
   public boolean C(bki $$0) {
      if (this.ge() == bxd.g.g) {
         this.a(aqn.tp, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dM().b((bky)this), 8.0F);
      } else {
         return $$0.a(this.dM().b((bky)this), 3.0F);
      }
   }

   @Override
   public aqo da() {
      return this.ge() == bxd.g.g ? aqo.f : aqo.g;
   }

   private static boolean l(clb $$0) {
      return $$0.a(cle.tm) || $$0.a(cle.tr) || $$0.a(cuv.bR.k());
   }

   @Nullable
   public bxd b(ama $$0, bkd $$1) {
      bxd $$2 = bkm.aC.a((crs)$$0);
      if ($$2 != null) {
         bxd.g $$3;
         $$3 = a($$0, this.dl());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bxd $$4 && this.ag.h()) {
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
   public boolean m(clb $$0) {
      return l($$0);
   }

   public bxd.g ge() {
      return bxd.g.a(this.an.b(cb));
   }

   public void a(bxd.g $$0) {
      if ($$0 == bxd.g.g) {
         this.a(bme.a).a(8.0);
         this.bO.a(4, new bsd(this, 1.4, true));
         this.bP.a(1, new btl(this).a());
         this.bP.a(2, new btm<>(this, cdm.class, true));
         this.bP.a(2, new btm<>(this, bxm.class, true));
         if (!this.ac()) {
            this.b(ur.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      bxd.g $$5 = a($$0, this.dl());
      if ($$3 instanceof bxd.b) {
         $$5 = ((bxd.b)$$3).a;
      } else {
         $$3 = new bxd.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bxd.g a(crt $$0, ht $$1) {
      ib<csq> $$2 = $$0.s($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(arb.ak)) {
         return $$3 < 80 ? bxd.g.b : bxd.g.d;
      } else if ($$2.a(arb.aj)) {
         return bxd.g.e;
      } else {
         return $$3 < 50 ? bxd.g.a : ($$3 < 90 ? bxd.g.f : bxd.g.c);
      }
   }

   public static boolean c(bkm<bxd> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.a_($$3.d()).a(arc.bV) && a((cqv)$$1, $$3);
   }

   boolean go() {
      return this.ci <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bk();
         this.cf = 10;
         this.ce = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public eji cI() {
      return new eji(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   static class a<T extends bky> extends bra<T> {
      private final bxd i;

      public a(bxd $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() != bxd.g.g && super.a();
      }
   }

   public static class b extends bkd.a {
      public final bxd.g a;

      public b(bxd.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bqu {
      private final bxd b;
      private boolean c;

      public c(bxd $$0) {
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

   static class d extends bqw {
      private final bxd l;
      private double m;

      public d(bxd $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aA() && !this.l.bj && !((bxd.c)this.l.bM).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.aX()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends bsm {
      private final bxd h;

      public e(bxd $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bsg {
      private final bxd g;
      private boolean h;
      private boolean i;

      public f(bxd $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dL().X().b(cro.c)) {
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
         this.g.G().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.Y());
         if (this.m()) {
            crs $$0 = this.g.dL();
            ht $$1 = this.e.c();
            dgw $$2 = $$0.a_($$1);
            cut $$3 = $$2.b();
            if (this.i && $$3 instanceof cvl) {
               int $$4 = $$2.c(cvl.f);
               if ($$4 == 0) {
                  $$0.a($$1, cuv.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cvl.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dlg.c, $$1, dlg.a.a(this.g));
                  $$0.c(2001, $$1, cut.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(crv $$0, ht $$1) {
         dgw $$2 = $$0.a_($$1);
         if ($$2.a(cuv.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof cvl && ((cvl)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements aub {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bxd.g> i = asb.a(bxd.g::a, values(), a);
      public static final Codec<bxd.g> h = aub.a(bxd.g::values);
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

      public static bxd.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
