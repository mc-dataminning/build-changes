import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cil extends chp implements bwy<cil.g> {
   public static final double bF = 0.6;
   public static final double bG = 0.8;
   public static final double bH = 1.0;
   public static final double bJ = 2.2;
   public static final double bK = 1.4;
   private static final ajx<Integer> bL = akb.a(cil.class, ajz.b);
   private static final aku bM = aku.b("killer_bunny");
   private static final int bN = 3;
   private static final int bO = 5;
   private static final aku bP = aku.b("evil");
   private static final int bQ = 8;
   private static final int bR = 40;
   private int bS;
   private int bT;
   private boolean bU;
   private int bV;
   int bW;

   public cil(bvi<? extends cil> $$0, dgz $$1) {
      super($$0, $$1);
      this.bA = new cil.c(this);
      this.bz = new cil.d(this);
      this.i(0.0);
   }

   @Override
   protected void D() {
      this.bC.a(1, new ccq(this));
      this.bC.a(1, new ccl(this, this.dU()));
      this.bC.a(1, new cil.e(this, 2.2));
      this.bC.a(2, new cci(this, 0.8));
      this.bC.a(3, new cee(this, 1.0, $$0 -> $$0.a(awy.aw), false));
      this.bC.a(4, new cil.a<>(this, cpr.class, 8.0F, 2.2, 2.2));
      this.bC.a(4, new cil.a<>(this, civ.class, 10.0F, 2.2, 2.2));
      this.bC.a(4, new cil.a<>(this, cms.class, 4.0F, 2.2, 2.2));
      this.bC.a(5, new cil.f(this));
      this.bC.a(6, new cej(this, 0.6));
      this.bC.a(11, new cde(this, cpr.class, 10.0F));
   }

   @Override
   protected float fj() {
      float $$0 = 0.3F;
      if (this.bz.c() <= 0.6) {
         $$0 = 0.2F;
      }

      euk $$1 = this.bB.i();
      if ($$1 != null && !$$1.c()) {
         fbx $$2 = $$1.a(this);
         if ($$2.e > this.dB() + 0.5) {
            $$0 = 0.5F;
         }
      }

      if (this.P || this.bf && this.bz.e() > this.dB() + 0.5) {
         $$0 = 0.5F;
      }

      return super.A($$0 / 0.42F);
   }

   @Override
   public void s() {
      super.s();
      double $$0 = this.bz.c();
      if ($$0 > 0.0) {
         double $$1 = this.dx().j();
         if ($$1 < 0.01) {
            this.a(0.1F, new fbx(0.0, 0.0, 1.0));
         }
      }

      if (!this.dU().C) {
         this.dU().a(this, (byte)1);
      }
   }

   public float K(float $$0) {
      return this.bT == 0 ? 0.0F : ((float)this.bS + $$0) / (float)this.bT;
   }

   public void i(double $$0) {
      this.O().a($$0);
      this.bz.a(this.bz.d(), this.bz.e(), this.bz.f(), $$0);
   }

   @Override
   public void s(boolean $$0) {
      super.s($$0);
      if ($$0) {
         this.a(this.x(), this.fg(), ((this.ae.i() - this.ae.i()) * 0.2F + 1.0F) * 0.8F);
      }
   }

   @Override
   public void q() {
      this.s(true);
      this.bT = 10;
      this.bS = 0;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bL, cil.g.a.j);
   }

   @Override
   public void a(ard $$0) {
      if (this.bV > 0) {
         this.bV--;
      }

      if (this.bW > 0) {
         this.bW = this.bW - this.ae.a(3);
         if (this.bW < 0) {
            this.bW = 0;
         }
      }

      if (this.aJ()) {
         if (!this.bU) {
            this.s(false);
            this.gw();
         }

         if (this.gs() == cil.g.g && this.bV == 0) {
            bvy $$1 = this.f();
            if ($$1 != null && this.g((bva)$$1) < 16.0) {
               this.c($$1.dz(), $$1.dF());
               this.bz.a($$1.dz(), $$1.dB(), $$1.dF(), this.bz.c());
               this.q();
               this.bU = true;
            }
         }

         cil.c $$2 = (cil.c)this.bA;
         if (!$$2.c()) {
            if (this.bz.b() && this.bV == 0) {
               euk $$3 = this.bB.i();
               fbx $$4 = new fbx(this.bz.d(), this.bz.e(), this.bz.f());
               if ($$3 != null && !$$3.c()) {
                  $$4 = $$3.a(this);
               }

               this.c($$4.d, $$4.f);
               this.q();
            }
         } else if (!$$2.d()) {
            this.gt();
         }
      }

      this.bU = this.aJ();
   }

   @Override
   public boolean bt() {
      return false;
   }

   private void c(double $$0, double $$1) {
      this.w((float)(ayz.d($$1 - this.dF(), $$0 - this.dz()) * 180.0F / (float)Math.PI) - 90.0F);
   }

   private void gt() {
      ((cil.c)this.bA).a(true);
   }

   private void gu() {
      ((cil.c)this.bA).a(false);
   }

   private void gv() {
      if (this.bz.c() < 2.2) {
         this.bV = 10;
      } else {
         this.bV = 1;
      }
   }

   private void gw() {
      this.gv();
      this.gu();
   }

   @Override
   public void k_() {
      super.k_();
      if (this.bS != this.bT) {
         this.bS++;
      } else if (this.bT != 0) {
         this.bS = 0;
         this.bT = 0;
         this.s(false);
      }
   }

   public static bxf.a t() {
      return chp.gx().a(bxg.s, 3.0).a(bxg.v, 0.3F).a(bxg.c, 3.0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("RabbitType", this.gs().j);
      $$0.a("MoreCarrotTicks", this.bW);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(cil.g.a($$0.h("RabbitType")));
      this.bW = $$0.h("MoreCarrotTicks");
   }

   protected avz x() {
      return awa.vL;
   }

   @Override
   protected avz u() {
      return awa.vH;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.vK;
   }

   @Override
   protected avz l_() {
      return awa.vJ;
   }

   @Override
   public void gl() {
      if (this.gs() == cil.g.g) {
         this.a(awa.vI, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
      }
   }

   @Override
   public awb dl() {
      return this.gs() == cil.g.g ? awb.f : awb.g;
   }

   @Nullable
   public cil b(ard $$0, buq $$1) {
      cil $$2 = bvi.aX.a($$0, bvh.e);
      if ($$2 != null) {
         cil.g $$3;
         $$3 = a($$0, this.du());
         label16:
         if (this.ae.a(20) != 0) {
            if ($$1 instanceof cil $$4 && this.ae.h()) {
               $$3 = $$4.gs();
               break label16;
            }

            $$3 = this.gs();
         }

         $$2.a($$3);
      }

      return $$2;
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.aw);
   }

   public cil.g gs() {
      return cil.g.a(this.al.a(bL));
   }

   public void a(cil.g $$0) {
      if ($$0 == cil.g.g) {
         this.g(bxg.a).a(8.0);
         this.bC.a(4, new cdg(this, 1.4, true));
         this.bD.a(1, new ceo(this).a());
         this.bD.a(2, new cep<>(this, cpr.class, true));
         this.bD.a(2, new cep<>(this, civ.class, true));
         this.g(bxg.c).a(new bxe(bP, 5.0, bxe.a.a));
         if (!this.h_()) {
            this.b(wp.c(af.a("entity", bM)));
         }
      } else {
         this.g(bxg.c).c(bP);
      }

      this.al.a(bL, $$0.j);
   }

   @Nullable
   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      cil.g $$4 = a($$0, this.du());
      if ($$3 instanceof cil.b) {
         $$4 = ((cil.b)$$3).a;
      } else {
         $$3 = new cil.b($$4);
      }

      this.a($$4);
      return super.a($$0, $$1, $$2, $$3);
   }

   private static cil.g a(dha $$0, ji $$1) {
      jr<dic> $$2 = $$0.t($$1);
      int $$3 = $$0.C_().a(100);
      if ($$2.a(awo.an)) {
         return $$3 < 80 ? cil.g.b : cil.g.d;
      } else if ($$2.a(awo.am)) {
         return cil.g.e;
      } else {
         return $$3 < 50 ? cil.g.a : ($$3 < 90 ? cil.g.f : cil.g.c);
      }
   }

   public static boolean c(bvi<cil> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      return $$1.a_($$3.e()).a(awp.cg) && a((dgc)$$1, $$3);
   }

   boolean gE() {
      return this.bW <= 0;
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 1) {
         this.bu();
         this.bT = 10;
         this.bS = 0;
      } else {
         super.b($$0);
      }
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)(0.6F * this.cR()), (double)(this.dp() * 0.4F));
   }

   static class a<T extends bvy> extends ccd<T> {
      private final cil i;

      public a(cil $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return this.i.gs() != cil.g.g && super.b();
      }
   }

   public static class b extends buq.a {
      public final cil.g a;

      public b(cil.g $$0) {
         super(1.0F);
         this.a = $$0;
      }
   }

   public static class c extends cbx {
      private final cil b;
      private boolean c;

      public c(cil $$0) {
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
            this.b.q();
            this.a = false;
         }
      }
   }

   static class d extends cbz {
      private final cil l;
      private double m;

      public d(cil $$0) {
         super($$0);
         this.l = $$0;
      }

      @Override
      public void a() {
         if (this.l.aJ() && !this.l.bf && !((cil.c)this.l.bA).c()) {
            this.l.i(0.0);
         } else if (this.b() || this.k == cbz.a.d) {
            this.l.i(this.m);
         }

         super.a();
      }

      @Override
      public void a(double $$0, double $$1, double $$2, double $$3) {
         if (this.l.bj()) {
            $$3 = 1.5;
         }

         super.a($$0, $$1, $$2, $$3);
         if ($$3 > 0.0) {
            this.m = $$3;
         }
      }
   }

   static class e extends cdp {
      private final cil a;

      public e(cil $$0, double $$1) {
         super($$0, $$1);
         this.a = $$0;
      }

      @Override
      public void a() {
         super.a();
         this.a.i(this.d);
      }
   }

   static class f extends cdj {
      private final cil g;
      private boolean h;
      private boolean i;

      public f(cil $$0) {
         super($$0, 0.7F, 16);
         this.g = $$0;
      }

      @Override
      public boolean b() {
         if (this.c <= 0) {
            if (!a(this.g).O().b(dgv.c)) {
               return false;
            }

            this.i = false;
            this.h = this.g.gE();
         }

         return super.b();
      }

      @Override
      public boolean c() {
         return this.i && super.c();
      }

      @Override
      public void a() {
         super.a();
         this.g.J().a((double)this.e.u() + 0.5, (double)(this.e.v() + 1), (double)this.e.w() + 0.5, 10.0F, (float)this.g.ac());
         if (this.m()) {
            dgz $$0 = this.g.dU();
            ji $$1 = this.e.d();
            dxq $$2 = $$0.a_($$1);
            dke $$3 = $$2.b();
            if (this.i && $$3 instanceof dkx) {
               int $$4 = $$2.c(dkx.f);
               if ($$4 == 0) {
                  $$0.a($$1, dkg.a.m(), 2);
                  $$0.a($$1, true, this.g);
               } else {
                  $$0.a($$1, $$2.b(dkx.f, Integer.valueOf($$4 - 1)), 2);
                  $$0.a(ecp.c, $$1, ecp.a.a(this.g));
                  $$0.c(2001, $$1, dke.j($$2));
               }

               this.g.bW = 40;
            }

            this.i = false;
            this.c = 10;
         }
      }

      @Override
      protected boolean a(dhc $$0, ji $$1) {
         dxq $$2 = $$0.a_($$1);
         if ($$2.a(dkg.cK) && this.h && !this.i) {
            $$2 = $$0.a_($$1.d());
            if ($$2.b() instanceof dkx && ((dkx)$$2.b()).i($$2)) {
               this.i = true;
               return true;
            }
         }

         return false;
      }
   }

   public static enum g implements azv {
      a(0, "brown"),
      b(1, "white"),
      c(2, "black"),
      d(3, "white_splotched"),
      e(4, "gold"),
      f(5, "salt"),
      g(99, "evil");

      private static final IntFunction<cil.g> i = axq.a(cil.g::a, values(), a);
      public static final Codec<cil.g> h = azv.a(cil.g::values);
      final int j;
      private final String k;

      private g(final int $$0, final String $$1) {
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

      public static cil.g a(int $$0) {
         return i.apply($$0);
      }
   }
}
