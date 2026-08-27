import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cbx extends cbd implements bqn<cbx.g> {
   public static final double bX = 0.6;
   public static final double bY = 0.8;
   public static final double ca = 1.0;
   public static final double cb = 2.2;
   public static final double cc = 1.4;
   private static final aim<Integer> cf = aiq.a(cbx.class, aio.b);
   private static final ajh cg = new ajh("killer_bunny");
   public static final int cd = 8;
   public static final int ce = 8;
   private static final int ch = 40;
   private int ci;
   private int cj;
   private boolean ck;
   private int cl;
   int cm;

   public cbx(bpc<? extends cbx> $$0, cwz $$1) {
      super($$0, $$1);
      this.bP = new cbx.c(this);
      this.bO = new cbx.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bwf(this));
      this.bR.a(1, new bwa(this, this.dM()));
      this.bR.a(1, new cbx.e(this, 2.2));
      this.bR.a(2, new bvx(this, 0.8));
      this.bR.a(3, new bxt(this, 1.0, ctk.a(cqn.uc, cqn.uh, dac.bR), false));
      this.bR.a(4, new cbx.a<>(this, cis.class, 8.0F, 2.2, 2.2));
      this.bR.a(4, new cbx.a<>(this, ccg.class, 10.0F, 2.2, 2.2));
      this.bR.a(4, new cbx.a<>(this, cfy.class, 4.0F, 2.2, 2.2));
      this.bR.a(5, new cbx.f(this));
      this.bR.a(6, new bxy(this, 0.6));
      this.bR.a(11, new bwt(this, cis.class, 10.0F));
   }

   @Override
   protected float fe() {
      float $$0 = 0.3F;
      if (this.P || this.bO.b() && this.bO.e() > this.dt() + 0.5) {
         $$0 = 0.5F;
      }

      ejc $$1 = this.bQ.j();
      if ($$1 != null && !$$1.c()) {
         epr $$2 = $$1.a(this);
         if ($$2.d > this.dt() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.bO.c() <= 0.6) {
         $$0 = 0.2F;
      }

      return super.w($$0 / 0.42F);
   }

   @Override
   protected void fg() {
      super.fg();
      double $$0 = this.bO.c();
      if ($$0 > 0.0) {
         double $$1 = this.dp().i();
         if ($$1 < 0.01) {
            this.a(0.1F, new epr(0.0, 0.0, 1.0));
         }
      }

      if (!this.dM().B) {
         this.dM().a(this, (byte)1);
      }
   }

   public float G(float $$0) {
      return this.cj == 0 ? 0.0F : ((float)this.ci + $$0) / (float)this.cj;
   }

   public void i(double $$0) {
      this.K().a($$0);
      this.bO.a(this.bO.d(), this.bO.e(), this.bO.f(), $$0);
   }

   @Override
   public void r(boolean $$0) {
      super.r($$0);
      if ($$0) {
         this.a(this.y(), this.fb(), ((this.ag.i() - this.ag.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void r() {
      this.r(true);
      this.cj = 10;
      this.ci = 0;
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(cf, cbx.g.a.j);
   }

   @Override
   public void Y() {
      if (this.cl > 0) {
         this.cl--;
      }

      if (this.cm > 0) {
         this.cm = this.cm - this.ag.a(3);
         if (this.cm < 0) {
            this.cm = 0;
         }
      }

      if (this.aC()) {
         if (!this.ck) {
            this.r(false);
            this.gw();
         }

         if (this.gn() == cbx.g.g && this.cl == 0) {
            bpo $$0 = this.p();
            if ($$0 != null && this.g((bow)$$0) < 16.0) {
               this.c($$0.dr(), $$0.dx());
               this.bO.a($$0.dr(), $$0.dt(), $$0.dx(), this.bO.c());
               this.r();
               this.ck = true;
            }
         }

         cbx.c $$1 = (cbx.c)this.bP;
         if (!$$1.c()) {
            if (this.bO.b() && this.cl == 0) {
               ejc $$2 = this.bQ.j();
               epr $$3 = new epr(this.bO.d(), this.bO.e(), this.bO.f());
               if ($$2 != null && !$$2.c()) {
                  $$3 = $$2.a(this);
               }

               this.c($$3.c, $$3.e);
               this.r();
            }
         } else if (!$$1.d()) {
            this.gt();
         }
      }

      this.ck = this.aC();
   }

   @Override
   public boolean bo() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.r((float)(aww.d($$1 - this.dx(), $$0 - this.dr()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gt() {
      ((cbx.c)this.bP).a(true);
   }

   private void gu() {
      ((cbx.c)this.bP).a(false);
   }

   private void gv() {
      if (this.bO.c() < 2.2) {
         this.cl = 10;
      } else {
         this.cl = 1;
      }
   }

   private void gw() {
      this.gv();
      this.gu();
   }

   @Override
   public void m_() {
      super.m_();
      if (this.ci != this.cj) {
         this.ci++;
      } else if (this.cj != 0) {
         this.ci = 0;
         this.cj = 0;
         this.r(false);
      }
   }

   public static bqu.a s() {
      return bpq.A().a(bqv.q, 3.0).a(bqv.r, 0.3F);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gn().j);
      $$0.a("MoreCarrotTicks", this.cm);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a(cbx.g.a($$0.h("RabbitType")));
      this.cm = $$0.h("MoreCarrotTicks");
   }

   protected atx y() {
      return aty.ux;
   }

   @Override
   protected atx v() {
      return aty.ut;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.uw;
   }

   @Override
   protected atx n_() {
      return aty.uv;
   }

   @Override
   public boolean C(bow $$0) {
      if (this.gn() == cbx.g.g) {
         this.a(aty.uu, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dN().b((bpo)this), 8.0F);
      } else {
         return $$0.a(this.dN().b((bpo)this), 3.0F);
      }
   }

   @Override
   public atz db() {
      return this.gn() == cbx.g.g ? atz.f : atz.g;
   }

   private static boolean n(cqk $$0) {
      return $$0.a(cqn.uc) || $$0.a(cqn.uh) || $$0.a(dac.bR.l());
   }

   @Nullable
   public cbx b(apf $$0, bor $$1) {
      cbx $$2 = bpc.aF.a((cwz)$$0);
      if ($$2 != null) {
         cbx.g $$3;
         $$3 = a($$0, this.dm());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof cbx $$4 && this.ag.h()) {
               $$3 = $$4.gn();
               break label16;
            }

            $$3 = this.gn();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean o(cqk $$0) {
      return n($$0);
   }

   public cbx.g gn() {
      return cbx.g.a(this.an.a(cf));
   }

   public void a(cbx.g $$0) {
      if ($$0 == cbx.g.g) {
         this.f(bqv.a).a(8.0);
         this.bR.a(4, new bwv(this, 1.4, true));
         this.bS.a(1, new byd(this).a());
         this.bS.a(2, new bye<>(this, cis.class, true));
         this.bS.a(2, new bye<>(this, ccg.class, true));
         if (!this.ae()) {
            this.b(vu.c(ac.a("entity", cg)));
         }
      }

      this.an.a(cf, $$0.j);
   }

   @Nullable
   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      cbx.g $$4 = a($$0, this.dm());
      if ($$3 instanceof cbx.b) {
         $$4 = ((cbx.b)$$3).a;
      } else {
         $$3 = new cbx.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cbx.g a(cxa $$0, ib $$1) {
      il<cxy> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(aum.al)) {
         return $$3 < 80 ? cbx.g.b : cbx.g.d;
      } else if ($$2.a(aum.ak)) {
         return cbx.g.e;
      } else {
         return $$3 < 50 ? cbx.g.a : ($$3 < 90 ? cbx.g.f : cbx.g.c);
      }
   }

   public static boolean c(bpc<cbx> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      return $$1.a_($$3.d()).a(aun.bX) && a((cwc)$$1, $$3);
   }

   boolean gx() {
      return this.cm <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bp();
         this.cj = 10;
         this.ci = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public epr cJ() {
      return new epr(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a<T extends bpo> extends bvs<T> {
      private final cbx i;

      public a(cbx $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() != cbx.g.g && super.a();
      }
   }

   public static class b extends bor.a {
      public final cbx.g a;

      public b(cbx.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bvm {
      private final cbx b;
      private boolean c;

      public c(cbx $$0) {
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
            this.b.r();
            this.a = false;
         }
      }
   }

   static class d extends bvo {
      private final cbx l;
      private double m;

      public d(cbx $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bm && !((cbx.c)this.l.bP).c()) {
            this.l.i(0.0);
         } else if (this.b()) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bc()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends bxe {
      private final cbx h;

      public e(cbx $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bwy {
      private final cbx g;
      private boolean h;
      private boolean i;

      public f(cbx $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dM().Z().b(cwv.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gx();
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
         this.g.G().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.Z());
         if (this.m()) {
            cwz $$0 = this.g.dM();
            ib $$1 = this.e.c();
            dmz $$2 = $$0.a_($$1);
            daa $$3 = $$2.b();
            if (this.i && $$3 instanceof das) {
               int $$4 = $$2.c(das.f);
               if ($$4 == 0) {
                  $$0.a($$1, dac.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(das.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(drn.c, $$1, drn.a.a(this.g));
                  $$0.c(2001, $$1, daa.i($$2));
               }

               this.g.cm = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cxc $$0, ib $$1) {
         dmz $$2 = $$0.a_($$1);
         if ($$2.a(dac.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof das && ((das)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements axq {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cbx.g> i = avn.a(cbx.g::a, values(), a);
      public static final Codec<cbx.g> h = axq.a(cbx.g::values);
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

      public static cbx.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
