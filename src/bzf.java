import java.util.EnumSet;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzf extends bug implements bjv<Optional<chk>>, byr {
   private static final UUID e = UUID.fromString("7E0292F2-9434-48D5-A29F-9583AF7DF27F");
   private static final bkb bT = new bkb(e, "Covered armor bonus", 20.0, bkb.a.a);
   protected static final adx<hb> b = aea.a(bzf.class, adz.p);
   protected static final adx<Byte> c = aea.a(bzf.class, adz.a);
   protected static final adx<Byte> d = aea.a(bzf.class, adz.a);
   private static final int bU = 6;
   private static final byte bV = 16;
   private static final byte bW = 16;
   private static final int bX = 8;
   private static final int bY = 8;
   private static final int bZ = 5;
   private static final float ca = 0.05F;
   static final Vector3f cb = ac.a(() -> {
      ia $$0 = hb.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private float cc;
   private float cd;
   @Nullable
   private gv ce;
   private int cf;
   private static final float cg = 1.0F;

   public bzf(bik<? extends bzf> $$0, cpk $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bK = new bzf.d(this);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bqa(this, cbl.class, 8.0F, 0.02F, true));
      this.bO.a(4, new bzf.a());
      this.bO.a(7, new bzf.f());
      this.bO.a(8, new bqn(this));
      this.bP.a(1, new brk(this, this.getClass()).a());
      this.bP.a(2, new bzf.e(this));
      this.bP.a(3, new bzf.c(this));
   }

   @Override
   protected big.b aU() {
      return big.b.a;
   }

   @Override
   public aov da() {
      return aov.f;
   }

   @Override
   protected aot r() {
      return aou.uY;
   }

   @Override
   public void M() {
      if (!this.ge()) {
         super.M();
      }
   }

   @Override
   protected aot h_() {
      return aou.ve;
   }

   @Override
   protected aot d(bhe $$0) {
      return this.ge() ? aou.vg : aou.vf;
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, hb.a);
      this.an.a(c, (byte)0);
      this.an.a(d, (byte)16);
   }

   public static bkc.a p() {
      return biy.x().a(bkd.a, 30.0);
   }

   @Override
   protected boq B() {
      return new bzf.b(this);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.a(hb.a($$0.f("AttachFace")));
      this.an.b(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.an.b(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.t().d());
      $$0.a("Peek", this.an.b(c));
      $$0.a("Color", this.an.b(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dK().B && !this.bN() && !this.a(this.dk(), this.t())) {
         this.gb();
      }

      if (this.gc()) {
         this.gd();
      }

      if (this.dK().B) {
         if (this.cf > 0) {
            this.cf--;
         } else {
            this.ce = null;
         }
      }
   }

   private void gb() {
      hb $$0 = this.i(this.dk());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.q();
      }
   }

   @Override
   protected eha ao() {
      float $$0 = G(this.cd);
      hb $$1 = this.t().g();
      float $$2 = this.ag().k() / 2.0F;
      return a($$1, $$0).d(this.dp() - (double)$$2, this.dr(), this.dv() - (double)$$2);
   }

   private static float G(float $$0) {
      return 0.5F - aro.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gc() {
      this.cc = this.cd;
      float $$0 = (float)this.gg() * 0.01F;
      if (this.cd == $$0) {
         return false;
      } else {
         if (this.cd > $$0) {
            this.cd = aro.a(this.cd - 0.05F, $$0, 1.0F);
         } else {
            this.cd = aro.a(this.cd + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gd() {
      this.ap();
      float $$0 = G(this.cd);
      float $$1 = G(this.cc);
      hb $$2 = this.t().g();
      float $$3 = $$0 - $$1;
      if (!($$3 <= 0.0F)) {
         for (big $$5 : this.dK().a(this, a($$2, $$1, $$0).d(this.dp() - 0.5, this.dr(), this.dv() - 0.5), bij.f.and($$0x -> !$$0x.y(this)))) {
            if (!($$5 instanceof bzf) && !$$5.af) {
               $$5.a(bjc.e, new ehf((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static eha a(hb $$0, float $$1) {
      return a($$0, -1.0F, $$1);
   }

   public static eha a(hb $$0, float $$1, float $$2) {
      double $$3 = (double)Math.max($$1, $$2);
      double $$4 = (double)Math.min($$1, $$2);
      return new eha(gv.b)
         .b((double)$$0.j() * $$3, (double)$$0.k() * $$3, (double)$$0.l() * $$3)
         .a((double)(-$$0.j()) * (1.0 + $$4), (double)(-$$0.k()) * (1.0 + $$4), (double)(-$$0.l()) * (1.0 + $$4));
   }

   @Override
   public boolean a(big $$0, boolean $$1) {
      if (this.dK().r_()) {
         this.ce = null;
         this.cf = 0;
      }

      this.a(hb.a);
      return super.a($$0, $$1);
   }

   @Override
   public void aa() {
      super.aa();
      if (this.dK().B) {
         this.ce = this.dk();
      }

      this.aV = 0.0F;
      this.aU = 0.0F;
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      this.r(0.0F);
      this.aW = this.dA();
      this.bn();
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(bjc $$0, ehf $$1) {
      if ($$0 == bjc.d) {
         this.q();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ehf dn() {
      return ehf.b;
   }

   @Override
   public void f(ehf $$0) {
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      gv $$3 = this.dk();
      if (this.bN()) {
         super.e($$0, $$1, $$2);
      } else {
         super.e((double)aro.a($$0) + 0.5, (double)aro.a($$1 + 0.5), (double)aro.a($$2) + 0.5);
      }

      if (this.ah != 0) {
         gv $$4 = this.dk();
         if (!$$4.equals($$3)) {
            this.an.b(c, (byte)0);
            this.au = true;
            if (this.dK().B && !this.bN() && !$$4.equals(this.ce)) {
               this.ce = $$3;
               this.cf = 6;
               this.ac = this.dp();
               this.ad = this.dr();
               this.ae = this.dv();
            }
         }
      }
   }

   @Nullable
   protected hb i(gv $$0) {
      for (hb $$1 : hb.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(gv $$0, hb $$1) {
      if (this.j($$0)) {
         return false;
      } else {
         hb $$2 = $$1.g();
         if (!this.dK().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            eha $$3 = a($$2, 1.0F).a($$0).h(1.0E-6);
            return this.dK().a(this, $$3);
         }
      }
   }

   private boolean j(gv $$0) {
      dey $$1 = this.dK().a_($$0);
      if ($$1.i()) {
         return false;
      } else {
         boolean $$2 = $$1.a(csl.bQ) && $$0.equals(this.dk());
         return !$$2;
      }
   }

   protected boolean q() {
      if (!this.fQ() && this.bv()) {
         gv $$0 = this.dk();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            gv $$2 = $$0.b(aro.b(this.ag, -8, 8), aro.b(this.ag, -8, 8), aro.b(this.ag, -8, 8));
            if ($$2.v() > this.dK().C_() && this.dK().t($$2) && this.dK().w_().a($$2) && this.dK().a(this, new eha($$2).h(1.0E-6))) {
               hb $$3 = this.i($$2);
               if ($$3 != null) {
                  this.ae();
                  this.a($$3);
                  this.a(aou.vj, 1.0F, 1.0F);
                  this.e((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dK().a(dji.R, $$0, dji.a.a(this));
                  this.an.b(c, (byte)0);
                  this.h(null);
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.bn = 0;
      this.e($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.ge()) {
         big $$2 = $$0.c();
         if ($$2 instanceof cbr) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.et() < (double)this.eK() * 0.5 && this.ag.a(4) == 0) {
            this.q();
         } else if ($$0.a(apl.j)) {
            big $$3 = $$0.c();
            if ($$3 != null && $$3.ag() == bik.aH) {
               this.gf();
            }
         }

         return true;
      }
   }

   private boolean ge() {
      return this.gg() == 0;
   }

   private void gf() {
      ehf $$0 = this.di();
      eha $$1 = this.cG();
      if (!this.ge() && this.q()) {
         int $$2 = this.dK().a(bik.aG, $$1.g(8.0), big::bv).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dK().z.i() < $$3)) {
            bzf $$4 = bik.aG.a(this.dK());
            if ($$4 != null) {
               $$4.a(this.fZ());
               $$4.d($$0);
               this.dK().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bx() {
      return this.bv();
   }

   public hb t() {
      return this.an.b(b);
   }

   private void a(hb $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a(adx<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.ao());
      }

      super.a($$0);
   }

   private int gg() {
      return this.an.b(c);
   }

   void b(int $$0) {
      if (!this.dK().B) {
         this.a(bkd.i).b(bT.a());
         if ($$0 == 0) {
            this.a(bkd.i).c(bT);
            this.a(aou.vd, 1.0F, 1.0F);
            this.a(dji.j);
         } else {
            this.a(aou.vh, 1.0F, 1.0F);
            this.a(dji.k);
         }
      }

      this.an.b(c, (byte)$$0);
   }

   public float E(float $$0) {
      return aro.i($$0, this.cc, this.cd);
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 0.5F;
   }

   @Override
   public void a(wp $$0) {
      super.a($$0);
      this.aU = 0.0F;
      this.aV = 0.0F;
   }

   @Override
   public int W() {
      return 180;
   }

   @Override
   public int X() {
      return 180;
   }

   @Override
   public void g(big $$0) {
   }

   @Override
   public float bD() {
      return 0.0F;
   }

   public Optional<ehf> F(float $$0) {
      if (this.ce != null && this.cf > 0) {
         double $$1 = (double)((float)this.cf - $$0) / 6.0;
         $$1 *= $$1;
         gv $$2 = this.dk();
         double $$3 = (double)($$2.u() - this.ce.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ce.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ce.w()) * $$1;
         return Optional.of(new ehf(-$$3, -$$4, -$$5));
      } else {
         return Optional.empty();
      }
   }

   public void a(Optional<chk> $$0) {
      this.an.b(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<chk> fZ() {
      return Optional.ofNullable(this.ga());
   }

   @Nullable
   public chk ga() {
      byte $$0 = this.an.b(d);
      return $$0 != 16 && $$0 <= 15 ? chk.a($$0) : null;
   }

   class a extends bps {
      private int b;

      public a() {
         this.a(EnumSet.of(bps.a.a, bps.a.b));
      }

      @Override
      public boolean a() {
         biw $$0 = bzf.this.j();
         return $$0 != null && $$0.bv() ? bzf.this.dK().ai() != bgl.a : false;
      }

      @Override
      public void c() {
         this.b = 20;
         bzf.this.b(100);
      }

      @Override
      public void d() {
         bzf.this.b(0);
      }

      @Override
      public boolean K_() {
         return true;
      }

      @Override
      public void e() {
         if (bzf.this.dK().ai() != bgl.a) {
            this.b--;
            biw $$0 = bzf.this.j();
            if ($$0 != null) {
               bzf.this.D().a($$0, 180.0F, 180.0F);
               double $$1 = bzf.this.f($$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + bzf.this.ag.a(10) * 20 / 2;
                     bzf.this.dK().b(new ccf(bzf.this.dK(), bzf.this, $$0, bzf.this.t().o()));
                     bzf.this.a(aou.vi, 2.0F, (bzf.this.ag.i() - bzf.this.ag.i()) * 0.2F + 1.0F);
                  }
               } else {
                  bzf.this.h(null);
               }

               super.e();
            }
         }
      }
   }

   static class b extends boq {
      public b(biy $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends brl<biw> {
      public c(bzf $$0) {
         super($$0, biw.class, 10, true, false, $$0x -> $$0x instanceof byr);
      }

      @Override
      public boolean a() {
         return this.e.cf() == null ? false : super.a();
      }

      @Override
      protected eha a(double $$0) {
         hb $$1 = ((bzf)this.e).t();
         if ($$1.o() == hb.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hb.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends bou {
      public d(biy $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         hb $$0 = bzf.this.t().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(bzf.cb));
         ia $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dp();
         double $$5 = this.f - this.a.dt();
         double $$6 = this.g - this.a.dv();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(aro.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends brl<cbl> {
      public e(bzf $$0) {
         super($$0, cbl.class, true);
      }

      @Override
      public boolean a() {
         return bzf.this.dK().ai() == bgl.a ? false : super.a();
      }

      @Override
      protected eha a(double $$0) {
         hb $$1 = ((bzf)this.e).t();
         if ($$1.o() == hb.a.a) {
            return this.e.cG().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == hb.a.c ? this.e.cG().c($$0, $$0, 4.0) : this.e.cG().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends bps {
      private int b;

      @Override
      public boolean a() {
         return bzf.this.j() == null && bzf.this.ag.a(b(40)) == 0 && bzf.this.a(bzf.this.dk(), bzf.this.t());
      }

      @Override
      public boolean b() {
         return bzf.this.j() == null && this.b > 0;
      }

      @Override
      public void c() {
         this.b = this.a(20 * (1 + bzf.this.ag.a(3)));
         bzf.this.b(30);
      }

      @Override
      public void d() {
         if (bzf.this.j() == null) {
            bzf.this.b(0);
         }
      }

      @Override
      public void e() {
         this.b--;
      }
   }
}
