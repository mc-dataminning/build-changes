import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cdc extends cci implements brs<cdc.g> {
   public static final double bX = 0.6;
   public static final double bY = 0.8;
   public static final double ca = 1.0;
   public static final double cb = 2.2;
   public static final double cc = 1.4;
   private static final aja<Integer> cf = aje.a(cdc.class, ajc.b);
   private static final ajv cg = new ajv("killer_bunny");
   public static final int cd = 8;
   public static final int ce = 8;
   private static final int ch = 40;
   private int ci;
   private int cj;
   private boolean ck;
   private int cl;
   int cm;

   public cdc(bqg<? extends cdc> $$0, czg $$1) {
      super($$0, $$1);
      this.bP = new cdc.c(this);
      this.bO = new cdc.d(this);
      this.i(0.0);
   }

   @Override
   protected void z() {
      this.bR.a(1, new bxk(this));
      this.bR.a(1, new bxf(this, this.dM()));
      this.bR.a(1, new cdc.e(this, 2.2));
      this.bR.a(2, new bxc(this, 0.8));
      this.bR.a(3, new byy(this, 1.0, cvp.a(crv.ud, crv.ui, dcj.bR), false));
      this.bR.a(4, new cdc.a<>(this, cka.class, 8.0F, 2.2, 2.2));
      this.bR.a(4, new cdc.a<>(this, cdl.class, 10.0F, 2.2, 2.2));
      this.bR.a(4, new cdc.a<>(this, chg.class, 4.0F, 2.2, 2.2));
      this.bR.a(5, new cdc.f(this));
      this.bR.a(6, new bzd(this, 0.6));
      this.bR.a(11, new bxy(this, cka.class, 10.0F));
   }

   @Override
   protected float fe() {
      float $$0 = 0.3F;
      if (this.P || this.bO.b() && this.bO.e() > this.dt() + 0.5) {
         $$0 = 0.5F;
      }

      elp $$1 = this.bQ.j();
      if ($$1 != null && !$$1.c()) {
         esj $$2 = $$1.a(this);
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
            this.a(0.1F, new esj(0.0, 0.0, 1.0));
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
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(cf, cdc.g.a.j);
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

         if (this.gn() == cdc.g.g && this.cl == 0) {
            bqt $$0 = this.p();
            if ($$0 != null && this.g((bqa)$$0) < 16.0) {
               this.c($$0.dr(), $$0.dx());
               this.bO.a($$0.dr(), $$0.dt(), $$0.dx(), this.bO.c());
               this.r();
               this.ck = true;
            }
         }

         cdc.c $$1 = (cdc.c)this.bP;
         if (!$$1.c()) {
            if (this.bO.b() && this.cl == 0) {
               elp $$2 = this.bQ.j();
               esj $$3 = new esj(this.bO.d(), this.bO.e(), this.bO.f());
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
      this.r((float)(axm.d($$1 - this.dx(), $$0 - this.dr()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gt() {
      ((cdc.c)this.bP).a(true);
   }

   private void gu() {
      ((cdc.c)this.bP).a(false);
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

   public static brz.a u() {
      return bqv.A().a(bsa.q, 3.0).a(bsa.r, 0.3F);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gn().j);
      $$0.a("MoreCarrotTicks", this.cm);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a(cdc.g.a($$0.h("RabbitType")));
      this.cm = $$0.h("MoreCarrotTicks");
   }

   protected aun y() {
      return auo.uF;
   }

   @Override
   protected aun v() {
      return auo.uB;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.uE;
   }

   @Override
   protected aun o_() {
      return auo.uD;
   }

   @Override
   public boolean C(bqa $$0) {
      if (this.gn() == cdc.g.g) {
         this.a(auo.uC, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dN().b((bqt)this), 8.0F);
      } else {
         return $$0.a(this.dN().b((bqt)this), 3.0F);
      }
   }

   @Override
   public aup db() {
      return this.gn() == cdc.g.g ? aup.f : aup.g;
   }

   private static boolean n(crs $$0) {
      return $$0.a(crv.ud) || $$0.a(crv.ui) || $$0.a(dcj.bR.p());
   }

   @Nullable
   public cdc b(apu $$0, bpu $$1) {
      cdc $$2 = bqg.aF.a((czg)$$0);
      if ($$2 != null) {
         cdc.g $$3;
         $$3 = a($$0, this.dm());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof cdc $$4 && this.ag.h()) {
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
   public boolean o(crs $$0) {
      return n($$0);
   }

   public cdc.g gn() {
      return cdc.g.a(this.an.a(cf));
   }

   public void a(cdc.g $$0) {
      if ($$0 == cdc.g.g) {
         this.f(bsa.a).a(8.0);
         this.bR.a(4, new bya(this, 1.4, true));
         this.bS.a(1, new bzi(this).a());
         this.bS.a(2, new bzj<>(this, cka.class, true));
         this.bS.a(2, new bzj<>(this, cdl.class, true));
         if (!this.ae()) {
            this.b(wi.c(ac.a("entity", cg)));
         }
      }

      this.an.a(cf, $$0.j);
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      cdc.g $$4 = a($$0, this.dm());
      if ($$3 instanceof cdc.b) {
         $$4 = ((cdc.b)$$3).a;
      } else {
         $$3 = new cdc.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cdc.g a(czh $$0, id $$1) {
      in<daf> $$2 = $$0.t($$1);
      int $$3 = $$0.E_().a(100);
      if ($$2.a(avd.al)) {
         return $$3 < 80 ? cdc.g.b : cdc.g.d;
      } else if ($$2.a(avd.ak)) {
         return cdc.g.e;
      } else {
         return $$3 < 50 ? cdc.g.a : ($$3 < 90 ? cdc.g.f : cdc.g.c);
      }
   }

   public static boolean c(bqg<cdc> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.a_($$3.d()).a(ave.bX) && a((cyj)$$1, $$3);
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
   public esj cJ() {
      return new esj(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a<T extends bqt> extends bwx<T> {
      private final cdc i;

      public a(cdc $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.gn() != cdc.g.g && super.a();
      }
   }

   public static class b extends bpu.a {
      public final cdc.g a;

      public b(cdc.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bwr {
      private final cdc b;
      private boolean c;

      public c(cdc $$0) {
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

   static class d extends bwt {
      private final cdc l;
      private double m;

      public d(cdc $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bm && !((cdc.c)this.l.bP).c()) {
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

   static class e extends byj {
      private final cdc h;

      public e(cdc $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends byd {
      private final cdc g;
      private boolean h;
      private boolean i;

      public f(cdc $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dM().aa().b(czc.c)) {
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
            czg $$0 = this.g.dM();
            id $$1 = this.e.c();
            dpi $$2 = $$0.a_($$1);
            dch $$3 = $$2.b();
            if (this.i && $$3 instanceof dcz) {
               int $$4 = $$2.c(dcz.f);
               if ($$4 == 0) {
                  $$0.a($$1, dcj.a.n(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(dcz.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dub.c, $$1, dub.a.a(this.g));
                  $$0.c(2001, $$1, dch.i($$2));
               }

               this.g.cm = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(czj $$0, id $$1) {
         dpi $$2 = $$0.a_($$1);
         if ($$2.a(dcj.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof dcz && ((dcz)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements ayg {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cdc.g> i = awd.a(cdc.g::a, values(), a);
      public static final Codec<cdc.g> h = ayg.a(cdc.g::values);
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

      public static cdc.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
