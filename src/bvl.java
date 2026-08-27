import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvl extends bur implements bke<bvl.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final aee<Integer> cb = aeh.a(bvl.class, aeg.b);
   private static final aew cc = new aew("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bvl(biu<? extends bvl> $$0, cpv $$1) {
      super($$0, $$1);
      this.bM = new bvl.c(this);
      this.bL = new bvl.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bpv(this));
      this.bO.a(1, new bpq(this, this.dL()));
      this.bO.a(1, new bvl.e(this, 2.2));
      this.bO.a(2, new bpn(this, 0.8));
      this.bO.a(3, new brj(this, 1.0, cmg.a(cji.tl, cji.tq, csw.bR), false));
      this.bO.a(4, new bvl.a<>(this, cbu.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bvl.a<>(this, bvu.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bvl.a<>(this, bzi.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bvl.f(this));
      this.bO.a(6, new bro(this, 0.6));
      this.bO.a(11, new bqj(this, cbu.class, 10.0F));
   }

   @Override
   protected float eY() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.ds() + 0.5) {
         $$0 = 0.5F;
      }

      ebb $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         ehn $$2 = $$1.a(this);
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
            this.a(0.1F, new ehn(0.0, 0.0, 1.0));
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
   protected void a_() {
      super.a_();
      this.an.a(cb, bvl.g.a.j);
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
            this.gm();
         }

         if (this.gd() == bvl.g.g && this.ch == 0) {
            bjg $$0 = this.q();
            if ($$0 != null && this.f((biq)$$0) < 16.0) {
               this.c($$0.dq(), $$0.dw());
               this.bL.a($$0.dq(), $$0.ds(), $$0.dw(), this.bL.c());
               this.s();
               this.cg = true;
            }
         }

         bvl.c $$1 = (bvl.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               ebb $$2 = this.bN.j();
               ehn $$3 = new ehn(this.bL.d(), this.bL.e(), this.bL.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.s();
            }
         } else if (!$$1.d()) {
            this.gj();
         }
      }

      this.cg = this.aA();
   }

   @Override
   public boolean bj() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(arw.d($$1 - this.dw(), $$0 - this.dq()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gj() {
      ((bvl.c)this.bM).a(true);
   }

   private void gk() {
      ((bvl.c)this.bM).a(false);
   }

   private void gl() {
      if (this.bL.c() < 2.2) {
         this.ch = 10;
      } else {
         this.ch = 1;
      }
   }

   private void gm() {
      this.gl();
      this.gk();
   }

   @Override
   public void b_() {
      super.b_();
      if (this.ce != this.cf) {
         this.ce++;
      } else if (this.cf != 0) {
         this.ce = 0;
         this.cf = 0;
         this.r(false);
      }
   }

   public static bkl.a t() {
      return bji.A().a(bkm.a, 3.0).a(bkm.d, 0.3F);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gd().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a(bvl.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected apc y() {
      return apd.to;
   }

   @Override
   protected apc w() {
      return apd.tk;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.tn;
   }

   @Override
   protected apc l_() {
      return apd.tm;
   }

   @Override
   public boolean C(biq $$0) {
      if (this.gd() == bvl.g.g) {
         this.a(apd.tl, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dM().b((bjg)this), 8.0F);
      } else {
         return $$0.a(this.dM().b((bjg)this), 3.0F);
      }
   }

   @Override
   public ape da() {
      return this.gd() == bvl.g.g ? ape.f : ape.g;
   }

   private static boolean l(cjf $$0) {
      return $$0.a(cji.tl) || $$0.a(cji.tq) || $$0.a(csw.bR.k());
   }

   @Nullable
   public bvl b(akq $$0, bil $$1) {
      bvl $$2 = biu.aC.a((cpv)$$0);
      if ($$2 != null) {
         bvl.g $$3;
         $$3 = a($$0, this.dl());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bvl $$4 && this.ag.h()) {
               $$3 = $$4.gd();
               break label16;
            }

            $$3 = this.gd();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean m(cjf $$0) {
      return l($$0);
   }

   public bvl.g gd() {
      return bvl.g.a(this.an.b(cb));
   }

   public void a(bvl.g $$0) {
      if ($$0 == bvl.g.g) {
         this.a(bkm.i).a(8.0);
         this.bO.a(4, new bql(this, 1.4, true));
         this.bP.a(1, new brt(this).a());
         this.bP.a(2, new bru<>(this, cbu.class, true));
         this.bP.a(2, new bru<>(this, bvu.class, true));
         if (!this.ac()) {
            this.b(tl.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      bvl.g $$5 = a($$0, this.dl());
      if ($$3 instanceof bvl.b) {
         $$5 = ((bvl.b)$$3).a;
      } else {
         $$3 = new bvl.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bvl.g a(cpw $$0, gw $$1) {
      he<cqt> $$2 = $$0.s($$1);
      int $$3 = $$0.D_().a(100);
      if ($$2.a(apr.ak)) {
         return $$3 < 80 ? bvl.g.b : bvl.g.d;
      } else if ($$2.a(apr.aj)) {
         return bvl.g.e;
      } else {
         return $$3 < 50 ? bvl.g.a : ($$3 < 90 ? bvl.g.f : bvl.g.c);
      }
   }

   public static boolean c(biu<bvl> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.a_($$3.d()).a(aps.bV) && a((coy)$$1, $$3);
   }

   boolean gn() {
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
   public ehn cI() {
      return new ehn(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   static class a<T extends bjg> extends bpi<T> {
      private final bvl i;

      public a(bvl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gd() != bvl.g.g && super.a();
      }
   }

   public static class b extends bil.a {
      public final bvl.g a;

      public b(bvl.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bpc {
      private final bvl b;
      private boolean c;

      public c(bvl $$0) {
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

   static class d extends bpe {
      private final bvl l;
      private double m;

      public d(bvl $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aA() && !this.l.bj && !((bvl.c)this.l.bM).c()) {
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

   static class e extends bqu {
      private final bvl h;

      public e(bvl $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bqo {
      private final bvl g;
      private boolean h;
      private boolean i;

      public f(bvl $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dL().X().b(cpr.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gn();
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
            cpv $$0 = this.g.dL();
            gw $$1 = this.e.c();
            dfj $$2 = $$0.a_($$1);
            csv $$3 = $$2.b();
            if (this.i && $$3 instanceof ctm) {
               int $$4 = $$2.c(ctm.d);
               if ($$4 == 0) {
                  $$0.a($$1, csw.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(ctm.d, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(djt.c, $$1, djt.a.a(this.g));
                  $$0.c(2001, $$1, csv.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cpy $$0, gw $$1) {
         dfj $$2 = $$0.a_($$1);
         if ($$2.a(csw.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof ctm && ((ctm)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements asp {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bvl.g> i = aqr.a(bvl.g::a, values(), a);
      public static final Codec<bvl.g> h = asp.a(bvl.g::values);
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

      public static bvl.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
