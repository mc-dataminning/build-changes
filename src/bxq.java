import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bxq extends bww implements bmj<bxq.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final afs<Integer> cb = afv.a(bxq.class, afu.b);
   private static final agm cc = new agm("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bxq(bkz<? extends bxq> $$0, csf $$1) {
      super($$0, $$1);
      this.bM = new bxq.c(this);
      this.bL = new bxq.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsa(this));
      this.bO.a(1, new brv(this, this.dN()));
      this.bO.a(1, new bxq.e(this, 2.2));
      this.bO.a(2, new brs(this, 0.8));
      this.bO.a(3, new bto(this, 1.0, coq.a(clr.tX, clr.uc, cvh.bR), false));
      this.bO.a(4, new bxq.a<>(this, cdz.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bxq.a<>(this, bxz.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bxq.a<>(this, cbn.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bxq.f(this));
      this.bO.a(6, new btt(this, 0.6));
      this.bO.a(11, new bso(this, cdz.class, 10.0F));
   }

   @Override
   protected float fa() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.du() + 0.5) {
         $$0 = 0.5F;
      }

      edm $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         ejz $$2 = $$1.a(this);
         if ($$2.d > this.du() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bL.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return $$0 + this.fb();
   }

   @Override
   protected void fc() {
      super.fc();
      double $$0 = this.bL.c();
      if ($$0 > 0.0) {
         double $$1 = this.dq().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new ejz(0.0, 0.0, 1.0));
         }
      }

      if (!this.dN().B) {
         this.dN().a(this, (byte)1);
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
         this.a(this.A(), this.eX(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * 0.8F);
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
      this.an.a(cb, bxq.g.a.j);
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
            this.go();
         }

         if (this.gf() == bxq.g.g && this.ch == 0) {
            bll $$0 = this.q();
            if ($$0 != null && this.f((bkv)$$0) < 16.0) {
               this.c($$0.ds(), $$0.dy());
               this.bL.a($$0.ds(), $$0.du(), $$0.dy(), this.bL.c());
               this.u();
               this.cg = true;
            }
         }

         bxq.c $$1 = (bxq.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               edm $$2 = this.bN.j();
               ejz $$3 = new ejz(this.bL.d(), this.bL.e(), this.bL.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.u();
            }
         } else if (!$$1.d()) {
            this.gl();
         }
      }

      this.cg = this.aC();
   }

   @Override
   public boolean bl() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(atq.d($$1 - this.dy(), $$0 - this.ds()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gl() {
      ((bxq.c)this.bM).a(true);
   }

   private void gm() {
      ((bxq.c)this.bM).a(false);
   }

   private void gn() {
      if (this.bL.c() < 2.2) {
         this.ch = 10;
      } else {
         this.ch = 1;
      }
   }

   private void go() {
      this.gn();
      this.gm();
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

   public static bmq.a w() {
      return bln.C().a(bmr.l, 3.0).a(bmr.m, 0.3F);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gf().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a(bxq.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected aqu A() {
      return aqv.tJ;
   }

   @Override
   protected aqu y() {
      return aqv.tF;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.tI;
   }

   @Override
   protected aqu n_() {
      return aqv.tH;
   }

   @Override
   public boolean C(bkv $$0) {
      if (this.gf() == bxq.g.g) {
         this.a(aqv.tG, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dO().b((bll)this), 8.0F);
      } else {
         return $$0.a(this.dO().b((bll)this), 3.0F);
      }
   }

   @Override
   public aqw dc() {
      return this.gf() == bxq.g.g ? aqw.f : aqw.g;
   }

   private static boolean l(clo $$0) {
      return $$0.a(clr.tX) || $$0.a(clr.uc) || $$0.a(cvh.bR.k());
   }

   @Nullable
   public bxq b(ami $$0, bkq $$1) {
      bxq $$2 = bkz.aC.a((csf)$$0);
      if ($$2 != null) {
         bxq.g $$3;
         $$3 = a($$0, this.dn());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bxq $$4 && this.ag.h()) {
               $$3 = $$4.gf();
               break label16;
            }

            $$3 = this.gf();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean m(clo $$0) {
      return l($$0);
   }

   public bxq.g gf() {
      return bxq.g.a(this.an.b(cb));
   }

   public void a(bxq.g $$0) {
      if ($$0 == bxq.g.g) {
         this.a(bmr.a).a(8.0);
         this.bO.a(4, new bsq(this, 1.4, true));
         this.bP.a(1, new bty(this).a());
         this.bP.a(2, new btz<>(this, cdz.class, true));
         this.bP.a(2, new btz<>(this, bxz.class, true));
         if (!this.ae()) {
            this.b(uv.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      bxq.g $$5 = a($$0, this.dn());
      if ($$3 instanceof bxq.b) {
         $$5 = ((bxq.b)$$3).a;
      } else {
         $$3 = new bxq.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bxq.g a(csg $$0, hx $$1) {
      ig<ctd> $$2 = $$0.s($$1);
      int $$3 = $$0.F_().a(100);
      if ($$2.a(arj.ak)) {
         return $$3 < 80 ? bxq.g.b : bxq.g.d;
      } else if ($$2.a(arj.aj)) {
         return bxq.g.e;
      } else {
         return $$3 < 50 ? bxq.g.a : ($$3 < 90 ? bxq.g.f : bxq.g.c);
      }
   }

   public static boolean c(bkz<bxq> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.a_($$3.d()).a(ark.bV) && a((cri)$$1, $$3);
   }

   boolean gp() {
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
   public ejz cJ() {
      return new ejz(0.0, (double)(0.6F * this.cI()), (double)(this.dh() * 0.4F));
   }

   static class a<T extends bll> extends brn<T> {
      private final bxq i;

      public a(bxq $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gf() != bxq.g.g && super.a();
      }
   }

   public static class b extends bkq.a {
      public final bxq.g a;

      public b(bxq.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends brh {
      private final bxq b;
      private boolean c;

      public c(bxq $$0) {
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

   static class d extends brj {
      private final bxq l;
      private double m;

      public d(bxq $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bj && !((bxq.c)this.l.bM).c()) {
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

   static class e extends bsz {
      private final bxq h;

      public e(bxq $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bst {
      private final bxq g;
      private boolean h;
      private boolean i;

      public f(bxq $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dN().Y().b(csb.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gp();
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
            csf $$0 = this.g.dN();
            hx $$1 = this.e.c();
            dhn $$2 = $$0.a_($$1);
            cvf $$3 = $$2.b();
            if (this.i && $$3 instanceof cvx) {
               int $$4 = $$2.c(cvx.f);
               if ($$4 == 0) {
                  $$0.a($$1, cvh.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cvx.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dlx.c, $$1, dlx.a.a(this.g));
                  $$0.c(2001, $$1, cvf.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(csi $$0, hx $$1) {
         dhn $$2 = $$0.a_($$1);
         if ($$2.a(cvh.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof cvx && ((cvx)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements auk {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bxq.g> i = asj.a(bxq.g::a, values(), a);
      public static final Codec<bxq.g> h = auk.a(bxq.g::values);
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

      public static bxq.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
