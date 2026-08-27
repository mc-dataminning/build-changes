import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bym extends bxs implements bnd<bym.g> {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.0;
   public static final double bX = 2.2;
   public static final double bY = 1.4;
   private static final agj<Integer> cb = agm.a(bym.class, agl.b);
   private static final ahd cc = new ahd("killer_bunny");
   public static final int bZ = 8;
   public static final int ca = 8;
   private static final int cd = 40;
   private int ce;
   private int cf;
   private boolean cg;
   private int ch;
   int ci;

   public bym(blt<? extends bym> $$0, cti $$1) {
      super($$0, $$1);
      this.bM = new bym.c(this);
      this.bL = new bym.d(this);
      this.i(0.0);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsv(this));
      this.bO.a(1, new bsq(this, this.dM()));
      this.bO.a(1, new bym.e(this, 2.2));
      this.bO.a(2, new bsn(this, 0.8));
      this.bO.a(3, new buj(this, 1.0, cps.a(cmu.tY, cmu.ud, cwl.bR), false));
      this.bO.a(4, new bym.a<>(this, cfb.class, 8.0F, 2.2, 2.2));
      this.bO.a(4, new bym.a<>(this, byv.class, 10.0F, 2.2, 2.2));
      this.bO.a(4, new bym.a<>(this, ccj.class, 4.0F, 2.2, 2.2));
      this.bO.a(5, new bym.f(this));
      this.bO.a(6, new buo(this, 0.6));
      this.bO.a(11, new btj(this, cfb.class, 10.0F));
   }

   @Override
   protected float eZ() {
      float $$0 = 0.3F;
      if (this.P || this.bL.b() && this.bL.e() > this.dt() + 0.5) {
         $$0 = 0.5F;
      }

      eez $$1 = this.bN.j();
      if ($$1 != null && !$$1.c()) {
         elm $$2 = $$1.a(this);
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
            this.a(0.1F, new elm(0.0, 0.0, 1.0));
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
      this.an.a(cb, bym.g.a.j);
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

         if (this.ge() == bym.g.g && this.ch == 0) {
            bmf $$0 = this.q();
            if ($$0 != null && this.f((blp)$$0) < 16.0) {
               this.c($$0.dr(), $$0.dx());
               this.bL.a($$0.dr(), $$0.dt(), $$0.dx(), this.bL.c());
               this.u();
               this.cg = true;
            }
         }

         bym.c $$1 = (bym.c)this.bM;
         if (!$$1.c()) {
            if (this.bL.b() && this.ch == 0) {
               eez $$2 = this.bN.j();
               elm $$3 = new elm(this.bL.d(), this.bL.e(), this.bL.f());
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
      this.r((float)(aui.d($$1 - this.dx(), $$0 - this.dr()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gk() {
      ((bym.c)this.bM).a(true);
   }

   private void gl() {
      ((bym.c)this.bM).a(false);
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

   public static bnk.a w() {
      return bmh.C().a(bnl.l, 3.0).a(bnl.m, 0.3F);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.ge().j);
      $$0.a("MoreCarrotTicks", this.ci);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.a(bym.g.a($$0.h("RabbitType")));
      this.ci = $$0.h("MoreCarrotTicks");
   }

   protected arl A() {
      return arm.ue;
   }

   @Override
   protected arl y() {
      return arm.ua;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.ud;
   }

   @Override
   protected arl n_() {
      return arm.uc;
   }

   @Override
   public boolean C(blp $$0) {
      if (this.ge() == bym.g.g) {
         this.a(arm.ub, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
         return $$0.a(this.dN().b((bmf)this), 8.0F);
      } else {
         return $$0.a(this.dN().b((bmf)this), 3.0F);
      }
   }

   @Override
   public arn db() {
      return this.ge() == bym.g.g ? arn.f : arn.g;
   }

   private static boolean l(cmr $$0) {
      return $$0.a(cmu.tY) || $$0.a(cmu.ud) || $$0.a(cwl.bR.k());
   }

   @Nullable
   public bym b(amz $$0, blk $$1) {
      bym $$2 = blt.aD.a((cti)$$0);
      if ($$2 != null) {
         bym.g $$3;
         $$3 = a($$0, this.dm());
         label16:
         if (this.ag.a(20) != 0) {
            if ($$1 instanceof bym $$4 && this.ag.h()) {
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
   public boolean m(cmr $$0) {
      return l($$0);
   }

   public bym.g ge() {
      return bym.g.a(this.an.b(cb));
   }

   public void a(bym.g $$0) {
      if ($$0 == bym.g.g) {
         this.a(bnl.a).a(8.0);
         this.bO.a(4, new btl(this, 1.4, true));
         this.bP.a(1, new but(this).a());
         this.bP.a(2, new buu<>(this, cfb.class, true));
         this.bP.a(2, new buu<>(this, byv.class, true));
         if (!this.ae()) {
            this.b(vd.c(ac.a("entity", cc)));
         }
      }

      this.an.b(cb, $$0.j);
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      bym.g $$5 = a($$0, this.dm());
      if ($$3 instanceof bym.b) {
         $$5 = ((bym.b)$$3).a;
      } else {
         $$3 = new bym.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   private static bym.g a(ctj $$0, hx $$1) {
      ih<cuh> $$2 = $$0.t($$1);
      int $$3 = $$0.F_().a(100);
      if ($$2.a(asa.al)) {
         return $$3 < 80 ? bym.g.b : bym.g.d;
      } else if ($$2.a(asa.ak)) {
         return bym.g.e;
      } else {
         return $$3 < 50 ? bym.g.a : ($$3 < 90 ? bym.g.f : bym.g.c);
      }
   }

   public static boolean c(blt<bym> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.a_($$3.d()).a(asb.bV) && a((csl)$$1, $$3);
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
   public elm cJ() {
      return new elm(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   static class a<T extends bmf> extends bsi<T> {
      private final bym i;

      public a(bym $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return this.i.ge() != bym.g.g && super.a();
      }
   }

   public static class b extends blk.a {
      public final bym.g a;

      public b(bym.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends bsc {
      private final bym b;
      private boolean c;

      public c(bym $$0) {
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

   static class d extends bse {
      private final bym l;
      private double m;

      public d(bym $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aC() && !this.l.bj && !((bym.c)this.l.bM).c()) {
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

   static class e extends btu {
      private final bym h;

      public e(bym $$0, double $$1) {
         super($$0, $$1);
         this.h = $$0;
      }

      @Override
      public void e() {
         super.e();
         this.h.i(this.c);
      }
   }

   static class f extends bto {
      private final bym g;
      private boolean h;
      private boolean i;

      public f(bym $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean a() {
         if (this.c <= 0) {
            if (!this.g.dM().Z().b(cte.c)) {
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
            cti $$0 = this.g.dM();
            hx $$1 = this.e.c();
            dja $$2 = $$0.a_($$1);
            cwj $$3 = $$2.b();
            if (this.i && $$3 instanceof cxb) {
               int $$4 = $$2.c(cxb.f);
               if ($$4 == 0) {
                  $$0.a($$1, cwl.a.o(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.a(cxb.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(dnk.c, $$1, dnk.a.a(this.g));
                  $$0.c(2001, $$1, cwj.i($$2));
               }

               this.g.ci = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(ctl $$0, hx $$1) {
         dja $$2 = $$0.a_($$1);
         if ($$2.a(cwl.cC) && this.h && !this.i) {
            $$2 = $$0.a_($$1.c());
            if ($$2.b() instanceof cxb && ((cxb)$$2.b()).h($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements ave {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<bym.g> i = ata.a(bym.g::a, values(), a);
      public static final Codec<bym.g> h = ave.a(bym.g::values);
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

      public static bym.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
