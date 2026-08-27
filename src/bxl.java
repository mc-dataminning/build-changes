import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bxl extends bwr implements bme<bxl.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final afo<Integer> cb = afr.a(bxl.class, afq.b);
   private static final agi cc = new agi("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bxl(bku<? extends bxl> $$0, csa $$1) {
      super($$0, $$1);
      this.bM = new bxl.c(this);
      this.bL = new bxl.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bO.a(1, new brv(this));
      this.bO.a(1, new brq(this, this.dN()));
      this.bO.a(1, new bxl.e(this, 2.2));
      this.bO.a(2, new brn(this, 0.8));
      this.bO.a(3, new btj(this, 1.0, cok.a(clm.tX, clm.uc, cvc.bR), false));
      this.bO.a(4, new bxl.a<>(this, cdu.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bxl.a<>(this, bxu.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bxl.a<>(this, cbi.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bxl.f(this));
      this.bO.a(6, new bto(this, 0.6));
      this.bO.a(11, new bsj(this, cdu.class, 10.0F));
   }

   @Override
   protected float fa() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.du() + 0.5) {
         $$0 = 0.5F;
      }

      edh $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         eju $$2 = $$1.a(this);
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
            this.a(0.1F, new eju(0.0, 0.0, 1.0));
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
   protected void b_() {
      super.b_();
      this.an.a(cb, bxl.g.a.j);
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

         if (this.gf() == bxl.g.g && this.ch == 0) {
            blg $$0 = this.q();
            if ($$0 != null && this.f((bkq)$$0) < 16.0) {
               this.c($$0.ds(), $$0.dy());
               this.bL.a($$0.ds(), $$0.du(), $$0.dy(), this.bL.c());
               this.u();
               this.cg = true;
            }
         }

         bxl.c $$1 = (bxl.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               edh $$2 = this.bN.j();
               eju $$3 = new eju(this.bL.d(), this.bL.e(), this.bL.f());
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
      this.r((float)(atm.d($$1 - this.dy(), $$0 - this.ds()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gl() {
      ((bxl.c)this.bM).a(true);
   }

   private void gm() {
      ((bxl.c)this.bM).a(false);
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

   public static bml.a w() {
      return bli.C().a(bmm.l, 3.0).a(bmm.m, 0.3F);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gf().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(bxl.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected aqq A() {
      return aqr.tJ;
   }

   @Override
   protected aqq y() {
      return aqr.tF;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.tI;
   }

   @Override
   protected aqq m_() {
      return aqr.tH;
   }

   @Override
   public boolean C(bkq $$0) {
      if (this.gf() == bxl.g.g) {
         this.a(aqr.tG, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dO().b((blg)this), 8.0F);
      } else {
         return $$0.a(this.dO().b((blg)this), 3.0F);
      }
   }

   @Override
   public aqs dc() {
      return this.gf() == bxl.g.g ? aqs.f : aqs.g;
   }

   private static boolean l(clj $$0) {
      return $$0.a(clm.tX) || $$0.a(clm.uc) || $$0.a(cvc.bR.k());
   }

   @Nullable
   public bxl b(ame $$0, bkl $$1) {
      bxl $$2 = bku.aC.a((csa)$$0);
      if ($$2 != null) {
         bxl.g $$3;
         $$3 = a($$0, this.dn());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bxl $$4 && this.ag.h()) {
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
   public boolean m(clj $$0) {
      return l($$0);
   }

   public bxl.g gf() {
      return bxl.g.a(this.an.b(cb));
   }

   public void a(bxl.g $$0) {
      if ($$0 == bxl.g.g) {
         this.a(bmm.a).a(8.0);
         this.bO.a(4, new bsl(this, 1.4, true));
         this.bP.a(1, new btt(this).a());
         this.bP.a(2, new btu<>(this, cdu.class, true));
         this.bP.a(2, new btu<>(this, bxu.class, true));
         if (!this.ae()) {
            this.b(ur.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      bxl.g $$5 = a($$0, this.dn());
      if ($$3 instanceof bxl.b) {
         $$5 = ((bxl.b)$$3).a;
      } else {
         $$3 = new bxl.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bxl.g a(csb $$0, ht $$1) {
      ib<csy> $$2 = $$0.s($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(arf.ak)) {
         return $$3 < 80 ? bxl.g.b : bxl.g.d;
      } else if ($$2.a(arf.aj)) {
         return bxl.g.e;
      } else {
         return $$3 < 50 ? bxl.g.a : ($$3 < 90 ? bxl.g.f : bxl.g.c);
      }
   }

   public static boolean c(bku<bxl> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.a_($$3.d()).a(arg.bV) && a((crd)$$1, $$3);
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
   public eju cJ() {
      return new eju(0.0, (double)(0.6F * this.cI()), (double)(this.dh() * 0.4F));
   }

   static class a<T extends blg> extends bri<T> {
      private final bxl i;

      public a(bxl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gf() != bxl.g.g && super.a();
      }
   }

   public static class b extends bkl.a {
      public final bxl.g a;

      public b(bxl.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends brc {
      private final bxl b;
      private boolean c;

      public c(bxl $$0) {
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

   static class d extends bre {
      private final bxl l;
      private double m;

      public d(bxl $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bj && !((bxl.c)this.l.bM).c()) {
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

   static class e extends bsu {
      private final bxl h;

      public e(bxl $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bso {
      private final bxl g;
      private boolean h;
      private boolean i;

      public f(bxl $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dN().Y().b(crw.c)) {
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
            csa $$0 = this.g.dN();
            ht $$1 = this.e.c();
            dhi $$2 = $$0.a_($$1);
            cva $$3 = $$2.b();
            if (this.i && $$3 instanceof cvs) {
               int $$4 = $$2.c(cvs.f);
               if ($$4 == 0) {
                  $$0.a($$1, cvc.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cvs.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dls.c, $$1, dls.a.a(this.g));
                  $$0.c(2001, $$1, cva.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(csd $$0, ht $$1) {
         dhi $$2 = $$0.a_($$1);
         if ($$2.a(cvc.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof cvs && ((cvs)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements aug {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bxl.g> i = asf.a(bxl.g::a, values(), a);
      public static final Codec<bxl.g> h = aug.a(bxl.g::values);
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

      public static bxl.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
