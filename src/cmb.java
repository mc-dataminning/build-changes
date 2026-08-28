import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cmb extends cgs implements bwe<Optional<cvc>>, cln {
   private static final all e = all.b("covered");
   private static final bwk bY = new bwk(e, 20.0, bwk.a.a);
   protected static final ako<jm> b = aks.a(cmb.class, akq.q);
   protected static final ako<Byte> c = aks.a(cmb.class, akq.a);
   protected static final ako<Byte> d = aks.a(cmb.class, akq.a);
   private static final int bZ = 6;
   private static final byte ca = 16;
   private static final byte cb = 16;
   private static final int cc = 8;
   private static final int cd = 8;
   private static final int ce = 5;
   private static final float cf = 0.05F;
   static final Vector3f cg = ae.a(() -> {
      kl $$0 = jm.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ch = 3.0F;
   private float ci;
   private float cj;
   @Nullable
   private jh ck;
   private int cl;
   private static final float cm = 1.0F;

   public cmb(bup<? extends cmb> $$0, dff $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new cmb.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cck(this, cor.class, 8.0F, 0.02F, true));
      this.bS.a(4, new cmb.a());
      this.bS.a(7, new cmb.f());
      this.bS.a(8, new ccx(this));
      this.bT.a(1, new cdu(this, this.getClass()).a());
      this.bT.a(2, new cmb.e(this));
      this.bT.a(3, new cmb.c(this));
   }

   @Override
   protected bui.b bi() {
      return bui.b.a;
   }

   @Override
   public awp do() {
      return awp.f;
   }

   @Override
   protected awn w() {
      return awo.wK;
   }

   @Override
   public void U() {
      if (!this.gA()) {
         super.U();
      }
   }

   @Override
   protected awn o_() {
      return awo.wQ;
   }

   @Override
   protected awn d(bsy $$0) {
      return this.gA() ? awo.wS : awo.wR;
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(b, jm.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static bwl.a q() {
      return bvg.E().a(bwm.s, 30.0);
   }

   @Override
   protected cba J() {
      return new cmb.b(this);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.a(jm.a($$0.f("AttachFace")));
      this.am.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.am.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.am.a(c));
      $$0.a("Color", this.am.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dY().C && !this.cb() && !this.a(this.dy(), this.y())) {
         this.gx();
      }

      if (this.gy()) {
         this.gz();
      }

      if (this.dY().C) {
         if (this.cl > 0) {
            this.cl--;
         } else {
            this.ck = null;
         }
      }
   }

   private void gx() {
      jm $$0 = this.h(this.dy());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected ezm az() {
      float $$0 = L(this.cj);
      jm $$1 = this.y().g();
      float $$2 = this.dt() / 2.0F;
      return a(this.em(), $$1, $$0).d(this.dD() - (double)$$2, this.dF(), this.dJ() - (double)$$2);
   }

   private static float L(float $$0) {
      return 0.5F - azn.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gy() {
      this.ci = this.cj;
      float $$0 = (float)this.gC() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = azn.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = azn.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gz() {
      this.aA();
      float $$0 = L(this.cj);
      float $$1 = L(this.ci);
      jm $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.em();
      if (!($$3 <= 0.0F)) {
         for (bui $$5 : this.dY().a(this, a(this.em(), $$2, $$1, $$0).d(this.dD() - 0.5, this.dF(), this.dJ() - 0.5), bun.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cmb) && !$$5.ae) {
               $$5.a(bvi.e, new ezr((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ezm a(float $$0, jm $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static ezm a(float $$0, jm $$1, float $$2, float $$3) {
      ezm $$4 = new ezm(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bui $$0, boolean $$1) {
      if (this.dY().y_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(jm.a);
      return super.a($$0, $$1);
   }

   @Override
   public void af() {
      super.af();
      if (this.dY().C) {
         this.ck = this.dy();
      }

      this.aY = 0.0F;
      this.aX = 0.0F;
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      this.v(0.0F);
      this.aZ = this.dO();
      this.bB();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bvi $$0, ezr $$1) {
      if ($$0 == bvi.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ezr dB() {
      return ezr.c;
   }

   @Override
   public void h(ezr $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      jh $$3 = this.dy();
      if (this.cb()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azn.a($$0) + 0.5, (double)azn.a($$1 + 0.5), (double)azn.a($$2) + 0.5);
      }

      if (this.ag != 0) {
         jh $$4 = this.dy();
         if (!$$4.equals($$3)) {
            this.am.a(c, (byte)0);
            this.as = true;
            if (this.dY().C && !this.cb() && !$$4.equals(this.ck)) {
               this.ck = $$3;
               this.cl = 6;
               this.ab = this.dD();
               this.ac = this.dF();
               this.ad = this.dJ();
            }
         }
      }
   }

   @Nullable
   protected jm h(jh $$0) {
      for (jm $$1 : jm.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(jh $$0, jm $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jm $$2 = $$1.g();
         if (!this.dY().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ezm $$3 = a(this.em(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dY().a(this, $$3);
         }
      }
   }

   private boolean i(jh $$0) {
      dvo $$1 = this.dY().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dil.bQ) && $$0.equals(this.dy());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.gi() && this.bN()) {
         jh $$0 = this.dy();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            jh $$2 = $$0.b(azn.b(this.af, -8, 8), azn.b(this.af, -8, 8), azn.b(this.af, -8, 8));
            if ($$2.v() > this.dY().I_() && this.dY().u($$2) && this.dY().C_().a($$2) && this.dY().a(this, new ezm($$2).h(1.0E-6))) {
               jm $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ap();
                  this.a($$3);
                  this.a(awo.wV, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dY().a(eak.R, $$0, eak.a.a(this));
                  this.am.a(c, (byte)0);
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
      this.br = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.gA()) {
         bui $$2 = $$0.c();
         if ($$2 instanceof coy) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eH() < (double)this.eW() * 0.5 && this.af.a(4) == 0) {
            this.t();
         } else if ($$0.a(axf.j)) {
            bui $$3 = $$0.c();
            if ($$3 != null && $$3.ar() == bup.aL) {
               this.gB();
            }
         }

         return true;
      }
   }

   private boolean gA() {
      return this.gC() == 0;
   }

   private void gB() {
      ezr $$0 = this.dw();
      ezm $$1 = this.cT();
      if (!this.gA() && this.t()) {
         int $$2 = this.dY().a(bup.aK, $$1.g(8.0), bui::bN).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dY().A.i() < $$3)) {
            cmb $$4 = bup.aK.a(this.dY(), buo.e);
            if ($$4 != null) {
               $$4.a(this.gv());
               $$4.e($$0);
               this.dY().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bP() {
      return this.bN();
   }

   public jm y() {
      return this.am.a(b);
   }

   private void a(jm $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a(ako<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.az());
      }

      super.a($$0);
   }

   private int gC() {
      return this.am.a(c);
   }

   void b(int $$0) {
      if (!this.dY().C) {
         this.g(bwm.a).c(e);
         if ($$0 == 0) {
            this.g(bwm.a).d(bY);
            this.a(awo.wP, 1.0F, 1.0F);
            this.a(eak.j);
         } else {
            this.a(awo.wT, 1.0F, 1.0F);
            this.a(eak.k);
         }
      }

      this.am.a(c, (byte)$$0);
   }

   public float J(float $$0) {
      return azn.h($$0, this.ci, this.cj);
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      this.aX = 0.0F;
      this.aY = 0.0F;
   }

   @Override
   public int ad() {
      return 180;
   }

   @Override
   public int ae() {
      return 180;
   }

   @Override
   public void h(bui $$0) {
   }

   @Nullable
   public ezr K(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.em();
         jh $$2 = this.dy();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return new ezr(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cvc> $$0) {
      this.am.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cvc> gv() {
      return Optional.ofNullable(this.gw());
   }

   @Nullable
   public cvc gw() {
      byte $$0 = this.am.a(d);
      return $$0 != 16 && $$0 <= 15 ? cvc.a($$0) : null;
   }

   class a extends ccc {
      private int b;

      public a() {
         this.a(EnumSet.of(ccc.a.a, ccc.a.b));
      }

      @Override
      public boolean b() {
         bve $$0 = cmb.this.m();
         return $$0 != null && $$0.bN() ? cmb.this.dY().ak() != bse.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cmb.this.b(100);
      }

      @Override
      public void e() {
         cmb.this.b(0);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (cmb.this.dY().ak() != bse.a) {
            this.b--;
            bve $$0 = cmb.this.m();
            if ($$0 != null) {
               cmb.this.K().a($$0, 180.0F, 180.0F);
               double $$1 = cmb.this.g((bui)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cmb.this.af.a(10) * 20 / 2;
                     cmb.this.dY().b(new cpn(cmb.this.dY(), cmb.this, $$0, cmb.this.y().o()));
                     cmb.this.a(awo.wU, 2.0F, (cmb.this.af.i() - cmb.this.af.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cmb.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cba {
      public b(bvg $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cdv<bve> {
      public c(cmb $$0) {
         super($$0, bve.class, 10, true, false, $$0x -> $$0x instanceof cln);
      }

      @Override
      public boolean b() {
         return this.e.ct() == null ? false : super.b();
      }

      @Override
      protected ezm a(double $$0) {
         jm $$1 = ((cmb)this.e).y();
         if ($$1.o() == jm.a.a) {
            return this.e.cT().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jm.a.c ? this.e.cT().c($$0, $$0, 4.0) : this.e.cT().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cbe {
      public d(final bvg $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jm $$0 = cmb.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cmb.cg));
         kl $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dD();
         double $$5 = this.f - this.a.dH();
         double $$6 = this.g - this.a.dJ();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(azn.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cdv<cor> {
      public e(final cmb $$0) {
         super($$0, cor.class, true);
      }

      @Override
      public boolean b() {
         return cmb.this.dY().ak() == bse.a ? false : super.b();
      }

      @Override
      protected ezm a(double $$0) {
         jm $$1 = ((cmb)this.e).y();
         if ($$1.o() == jm.a.a) {
            return this.e.cT().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jm.a.c ? this.e.cT().c($$0, $$0, 4.0) : this.e.cT().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends ccc {
      private int b;

      @Override
      public boolean b() {
         return cmb.this.m() == null && cmb.this.af.a(b(40)) == 0 && cmb.this.a(cmb.this.dy(), cmb.this.y());
      }

      @Override
      public boolean c() {
         return cmb.this.m() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cmb.this.af.a(3)));
         cmb.this.b(30);
      }

      @Override
      public void e() {
         if (cmb.this.m() == null) {
            cmb.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
