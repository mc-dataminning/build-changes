import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cbg extends cam implements bpw<cbg.g> {
   public static final double bV = 0.6;
   public static final double bW = 0.8;
   public static final double bY = 1.0;
   public static final double bZ = 2.2;
   public static final double ca = 1.4;
   private static final aii<Integer> cd = ail.a(cbg.class, aik.b);
   private static final ajc ce = new ajc("killer_bunny");
   public static final int cb = 8;
   public static final int cc = 8;
   private static final int cf = 40;
   private int cg;
   private int ch;
   private boolean ci;
   private int cj;
   int ck;

   public cbg(bol<? extends cbg> $$0, cwe $$1) {
      super($$0, $$1);
      this.bN = new cbg.c(this);
      this.bM = new cbg.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bP.a(1, new bvo(this));
      this.bP.a(1, new bvj(this, this.dJ()));
      this.bP.a(1, new cbg.e(this, 2.2));
      this.bP.a(2, new bvg(this, 0.8));
      this.bP.a(3, new bxc(this, 1.0, csp.a(cpt.ub, cpt.ug, czh.bR), false));
      this.bP.a(4, new cbg.a<>(this, cia.class, 8.0F, 2.2, 2.2));
      this.bP.a(4, new cbg.a<>(this, cbp.class, 10.0F, 2.2, 2.2));
      this.bP.a(4, new cbg.a<>(this, cfg.class, 4.0F, 2.2, 2.2));
      this.bP.a(5, new cbg.f(this));
      this.bP.a(6, new bxh(this, 0.6));
      this.bP.a(11, new bwc(this, cia.class, 10.0F));
   }

   @Override
   protected float fb() {
      float $$0 = 0.3F;
      if (this.O || this.bM.b() && this.bM.e() > this.dq() + 0.5) {
         $$0 = 0.5F;
      }

      eig $$1 = this.bO.j();
      if ($$1 != null && !$$1.c()) {
         eov $$2 = $$1.a(this);
         if ($$2.d > this.dq() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bM.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return $$0 + this.fc();
   }

   @Override
   protected void fd() {
      super.fd();
      double $$0 = this.bM.c();
      if ($$0 > 0.0) {
         double $$1 = this.dm().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new eov(0.0, 0.0, 1.0));
         }
      }

      if (!this.dJ().B) {
         this.dJ().a(this, (byte)1);
      }
   }

   public float E(float $$0) {
      return this.ch == 0 ? 0.0F : ((float)this.cg + $$0) / (float)this.ch;
   }

   public void i(double $$0) {
      this.N().a($$0);
      this.bM.a(this.bM.d(), this.bM.e(), this.bM.f(), $$0);
   }

   @Override
   public void r(boolean $$0) {
      super.r($$0);
      if ($$0) {
         this.a(this.A(), this.eY(), ((this.af.i() - this.af.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void u() {
      this.r(true);
      this.ch = 10;
      this.cg = 0;
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cd, cbg.g.a.j);
   }

   @Override
   public void aa() {
      if (this.cj > 0) {
         this.cj--;
      }

      if (this.ck > 0) {
         this.ck = this.ck - this.af.a(3);
         if (this.ck < 0) {
            this.ck = 0;
         }
      }

      if (this.aC()) {
         if (!this.ci) {
            this.r(false);
            this.gu();
         }

         if (this.gl() == cbg.g.g && this.cj == 0) {
            box $$0 = this.q();
            if ($$0 != null && this.f((bof)$$0) < 16.0) {
               this.c($$0.do(), $$0.du());
               this.bM.a($$0.do(), $$0.dq(), $$0.du(), this.bM.c());
               this.u();
               this.ci = true;
            }
         }

         cbg.c $$1 = (cbg.c)this.bN;
         if (!$$1.c()) {
            if (this.bM.b() && this.cj == 0) {
               eig $$2 = this.bO.j();
               eov $$3 = new eov(this.bM.d(), this.bM.e(), this.bM.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.u();
            }
         } else if (!$$1.d()) {
            this.gr();
         }
      }

      this.ci = this.aC();
   }

   @Override
   public boolean bl() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(awm.d($$1 - this.du(), $$0 - this.do()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gr() {
      ((cbg.c)this.bN).a(true);
   }

   private void gs() {
      ((cbg.c)this.bN).a(false);
   }

   private void gt() {
      if (this.bM.c() < 2.2) {
         this.cj = 10;
      } else {
         this.cj = 1;
      }
   }

   private void gu() {
      this.gt();
      this.gs();
   }

   @Override
   public void d_() {
      super.d_();
      if (this.cg != this.ch) {
         this.cg++;
      } else if (this.ch != 0) {
         this.cg = 0;
         this.ch = 0;
         this.r(false);
      }
   }

   public static bqd.a w() {
      return boz.C().a(bqe.n, 3.0).a(bqe.o, 0.3F);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gl().j);
      $$0.a("MoreCarrotTicks", this.ck);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.a(cbg.g.a($$0.h("RabbitType")));
      this.ck = $$0.h("MoreCarrotTicks");
   }

   protected ato A() {
      return atp.uu;
   }

   @Override
   protected ato y() {
      return atp.uq;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.ut;
   }

   @Override
   protected ato n_() {
      return atp.us;
   }

   @Override
   public boolean B(bof $$0) {
      if (this.gl() == cbg.g.g) {
         this.a(atp.ur, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
         return $$0.a(this.dK().b((box)this), 8.0F);
      } else {
         return $$0.a(this.dK().b((box)this), 3.0F);
      }
   }

   @Override
   public atq cY() {
      return this.gl() == cbg.g.g ? atq.f : atq.g;
   }

   private static boolean n(cpq $$0) {
      return $$0.a(cpt.ub) || $$0.a(cpt.ug) || $$0.a(czh.bR.l());
   }

   @Nullable
   public cbg b(apa $$0, boa $$1) {
      cbg $$2 = bol.aE.a((cwe)$$0);
      if ($$2 != null) {
         cbg.g $$3;
         $$3 = a($$0, this.dj());
         label16:
         if (this.af.a(20) != 0) {
            if ($$1 instanceof cbg $$4 && this.af.h()) {
               $$3 = $$4.gl();
               break label16;
            }

            $$3 = this.gl();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean o(cpq $$0) {
      return n($$0);
   }

   public cbg.g gl() {
      return cbg.g.a(this.am.b(cd));
   }

   public void a(cbg.g $$0) {
      if ($$0 == cbg.g.g) {
         this.f(bqe.a).a(8.0);
         this.bP.a(4, new bwe(this, 1.4, true));
         this.bQ.a(1, new bxm(this).a());
         this.bQ.a(2, new bxn<>(this, cia.class, true));
         this.bQ.a(2, new bxn<>(this, cbp.class, true));
         if (!this.ae()) {
            this.b(vs.c(ac.a("entity", ce)));
         }
      }

      this.am.b(cd, $$0.j);
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      cbg.g $$4 = a($$0, this.dj());
      if ($$3 instanceof cbg.b) {
         $$4 = ((cbg.b)$$3).a;
      } else {
         $$3 = new cbg.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cbg.g a(cwf $$0, ib $$1) {
      il<cxd> $$2 = $$0.t($$1);
      int $$3 = $$0.F_().a(100);
      if ($$2.a(aud.al)) {
         return $$3 < 80 ? cbg.g.b : cbg.g.d;
      } else if ($$2.a(aud.ak)) {
         return cbg.g.e;
      } else {
         return $$3 < 50 ? cbg.g.a : ($$3 < 90 ? cbg.g.f : cbg.g.c);
      }
   }

   public static boolean c(bol<cbg> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.a_($$3.d()).a(aue.bW) && a((cvh)$$1, $$3);
   }

   boolean gv() {
      return this.ck <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bm();
         this.ch = 10;
         this.cg = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public eov cG() {
      return new eov(0.0, (double)(0.6F * this.cF()), (double)(this.dd() * 0.4F));
   }

   static class a<T extends box> extends bvb<T> {
      private final cbg i;

      public a(cbg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gl() != cbg.g.g && super.a();
      }
   }

   public static class b extends boa.a {
      public final cbg.g a;

      public b(cbg.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends buv {
      private final cbg b;
      private boolean c;

      public c(cbg $$0) {
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

   static class d extends bux {
      private final cbg l;
      private double m;

      public d(cbg $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bk && !((cbg.c)this.l.bN).c()) {
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

   static class e extends bwn {
      private final cbg h;

      public e(cbg $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bwh {
      private final cbg g;
      private boolean h;
      private boolean i;

      public f(cbg $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dJ().Z().b(cwa.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gv();
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
            cwe $$0 = this.g.dJ();
            ib $$1 = this.e.c();
            dme $$2 = $$0.a_($$1);
            czf $$3 = $$2.b();
            if (this.i && $$3 instanceof czx) {
               int $$4 = $$2.c(czx.f);
               if ($$4 == 0) {
                  $$0.a($$1, czh.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(czx.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dqr.c, $$1, dqr.a.a(this.g));
                  $$0.c(2001, $$1, czf.i($$2));
               }

               this.g.ck = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cwh $$0, ib $$1) {
         dme $$2 = $$0.a_($$1);
         if ($$2.a(czh.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof czx && ((czx)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements axg {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cbg.g> i = ave.a(cbg.g::a, values(), a);
      public static final Codec<cbg.g> h = axg.a(cbg.g::values);
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

      public static cbg.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
