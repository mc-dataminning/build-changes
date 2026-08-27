import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class ccx extends ccd implements brn<ccx.g> {
   public static final double bX = 0.6;
   public static final double bY = 0.8;
   public static final double ca = 1.0;
   public static final double cb = 2.2;
   public static final double cc = 1.4;
   private static final aiy<Integer> cf = ajc.a(ccx.class, aja.b);
   private static final ajt cg = new ajt("killer_bunny");
   public static final int cd = 8;
   public static final int ce = 8;
   private static final int ch = 40;
   private int ci;
   private int cj;
   private boolean ck;
   private int cl;
   int cm;

   public ccx(bqb<? extends ccx> $$0, cyx $$1) {
      super($$0, $$1);
      this.bP = new ccx.c(this);
      this.bO = new ccx.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxf(this));
      this.bR.a(1, new bxa(this, this.dM()));
      this.bR.a(1, new ccx.e(this, 2.2));
      this.bR.a(2, new bwx(this, 0.8));
      this.bR.a(3, new byt(this, 1.0, cvg.a(crm.ud, crm.ui, dca.bR), false));
      this.bR.a(4, new ccx.a<>(this, cjt.class, 8.0F, 2.2, 2.2));
      this.bR.a(4, new ccx.a<>(this, cdg.class, 10.0F, 2.2, 2.2));
      this.bR.a(4, new ccx.a<>(this, cgz.class, 4.0F, 2.2, 2.2));
      this.bR.a(5, new ccx.f(this));
      this.bR.a(6, new byy(this, 0.6));
      this.bR.a(11, new bxt(this, cjt.class, 10.0F));
   }

   @Override
   protected float fe() {
      float $$0 = 0.3F;
      if (this.P || this.bO.b() && this.bO.e() > this.dt() + 0.5) {
         $$0 = 0.5F;
      }

      elg $$1 = this.bQ.j();
      if ($$1 != null && !$$1.c()) {
         esa $$2 = $$1.a(this);
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
            this.a(0.1F, new esa(0.0, 0.0, 1.0));
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
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(cf, ccx.g.a.j);
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

         if (this.gn() == ccx.g.g && this.cl == 0) {
            bqo $$0 = this.p();
            if ($$0 != null && this.g((bpv)$$0) < 16.0) {
               this.c($$0.dr(), $$0.dx());
               this.bO.a($$0.dr(), $$0.dt(), $$0.dx(), this.bO.c());
               this.r();
               this.ck = true;
            }
         }

         ccx.c $$1 = (ccx.c)this.bP;
         if (!$$1.c()) {
            if (this.bO.b() && this.cl == 0) {
               elg $$2 = this.bQ.j();
               esa $$3 = new esa(this.bO.d(), this.bO.e(), this.bO.f());
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
      this.r((float)(axk.d($$1 - this.dx(), $$0 - this.dr()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gt() {
      ((ccx.c)this.bP).a(true);
   }

   private void gu() {
      ((ccx.c)this.bP).a(false);
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
   public void n_() {
      super.n_();
      if (this.ci != this.cj) {
         this.ci++;
      } else if (this.cj != 0) {
         this.ci = 0;
         this.cj = 0;
         this.r(false);
      }
   }

   public static bru.a u() {
      return bqq.A().a(brv.q, 3.0).a(brv.r, 0.3F);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gn().j);
      $$0.a("MoreCarrotTicks", this.cm);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a(ccx.g.a($$0.h("RabbitType")));
      this.cm = $$0.h("MoreCarrotTicks");
   }

   protected aul y() {
      return aum.uF;
   }

   @Override
   protected aul v() {
      return aum.uB;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.uE;
   }

   @Override
   protected aul o_() {
      return aum.uD;
   }

   @Override
   public boolean C(bpv $$0) {
      if (this.gn() == ccx.g.g) {
         this.a(aum.uC, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dN().b((bqo)this), 8.0F);
      } else {
         return $$0.a(this.dN().b((bqo)this), 3.0F);
      }
   }

   @Override
   public aun db() {
      return this.gn() == ccx.g.g ? aun.f : aun.g;
   }

   private static boolean n(crj $$0) {
      return $$0.a(crm.ud) || $$0.a(crm.ui) || $$0.a(dca.bR.p());
   }

   @Nullable
   public ccx b(aps $$0, bpp $$1) {
      ccx $$2 = bqb.aF.a((cyx)$$0);
      if ($$2 != null) {
         ccx.g $$3;
         $$3 = a($$0, this.dm());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof ccx $$4 && this.ag.h()) {
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
   public boolean o(crj $$0) {
      return n($$0);
   }

   public ccx.g gn() {
      return ccx.g.a(this.an.a(cf));
   }

   public void a(ccx.g $$0) {
      if ($$0 == ccx.g.g) {
         this.f(brv.a).a(8.0);
         this.bR.a(4, new bxv(this, 1.4, true));
         this.bS.a(1, new bzd(this).a());
         this.bS.a(2, new bze<>(this, cjt.class, true));
         this.bS.a(2, new bze<>(this, cdg.class, true));
         if (!this.ae()) {
            this.b(wg.c(ac.a("entity", cg)));
         }
      }

      this.an.a(cf, $$0.j);
   }

   @Nullable
   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      ccx.g $$4 = a($$0, this.dm());
      if ($$3 instanceof ccx.b) {
         $$4 = ((ccx.b)$$3).a;
      } else {
         $$3 = new ccx.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static ccx.g a(cyy $$0, ib $$1) {
      il<czw> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(avb.al)) {
         return $$3 < 80 ? ccx.g.b : ccx.g.d;
      } else if ($$2.a(avb.ak)) {
         return ccx.g.e;
      } else {
         return $$3 < 50 ? ccx.g.a : ($$3 < 90 ? ccx.g.f : ccx.g.c);
      }
   }

   public static boolean c(bqb<ccx> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      return $$1.a_($$3.d()).a(avc.bX) && a((cya)$$1, $$3);
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
   public esa cJ() {
      return new esa(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a<T extends bqo> extends bws<T> {
      private final ccx i;

      public a(ccx $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() != ccx.g.g && super.a();
      }
   }

   public static class b extends bpp.a {
      public final ccx.g a;

      public b(ccx.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bwm {
      private final ccx b;
      private boolean c;

      public c(ccx $$0) {
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

   static class d extends bwo {
      private final ccx l;
      private double m;

      public d(ccx $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bm && !((ccx.c)this.l.bP).c()) {
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

   static class e extends bye {
      private final ccx h;

      public e(ccx $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bxy {
      private final ccx g;
      private boolean h;
      private boolean i;

      public f(ccx $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dM().aa().b(cyt.c)) {
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
            cyx $$0 = this.g.dM();
            ib $$1 = this.e.c();
            doz $$2 = $$0.a_($$1);
            dby $$3 = $$2.b();
            if (this.i && $$3 instanceof dcq) {
               int $$4 = $$2.c(dcq.f);
               if ($$4 == 0) {
                  $$0.a($$1, dca.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dcq.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dts.c, $$1, dts.a.a(this.g));
                  $$0.c(2001, $$1, dby.i($$2));
               }

               this.g.cm = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(cza $$0, ib $$1) {
         doz $$2 = $$0.a_($$1);
         if ($$2.a(dca.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof dcq && ((dcq)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements aye {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<ccx.g> i = awb.a(ccx.g::a, values(), a);
      public static final Codec<ccx.g> h = aye.a(ccx.g::values);
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

      public static ccx.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
