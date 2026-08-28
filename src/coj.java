import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class coj extends cir implements cnv {
   private static final alg d = alg.b("covered");
   private static final byi bG = new byi(d, 20.0, byi.a.a);
   protected static final akj<ja> a = akn.a(coj.class, akl.q);
   protected static final akj<Byte> b = akn.a(coj.class, akl.a);
   protected static final akj<Byte> c = akn.a(coj.class, akl.a);
   private static final int bH = 6;
   private static final byte bI = 16;
   private static final byte bJ = 16;
   private static final int bK = 8;
   private static final int bL = 8;
   private static final int bM = 5;
   private static final float bN = 0.05F;
   static final Vector3f bO = af.a(() -> {
      jz $$0 = ja.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float bP = 3.0F;
   private float bQ;
   private float bR;
   @Nullable
   private iu bS;
   private int bT;
   private static final float bU = 1.0F;

   public coj(bwo<? extends coj> $$0, dja $$1) {
      super($$0, $$1);
      this.by = 5;
      this.bz = new coj.d(this);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cei(this, crc.class, 8.0F, 0.02F, true));
      this.bD.a(4, new coj.a());
      this.bD.a(7, new coj.f());
      this.bD.a(8, new cev(this));
      this.bE.a(1, new cfs(this, this.getClass()).a());
      this.bE.a(2, new coj.e(this));
      this.bE.a(3, new coj.c(this));
   }

   @Override
   protected bwf.d bg() {
      return bwf.d.a;
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm u() {
      return awn.xB;
   }

   @Override
   public void T() {
      if (!this.gt()) {
         super.T();
      }
   }

   @Override
   protected awm l_() {
      return awn.xH;
   }

   @Override
   protected awm e(buu $$0) {
      return this.gt() ? awn.xJ : awn.xI;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, ja.a);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static byj.a j() {
      return bxg.E().a(byk.s, 30.0);
   }

   @Override
   protected ccy I() {
      return new coj.b(this);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(ja.a($$0.f("AttachFace")));
      this.al.a(b, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.al.a(c, $$0.f("Color"));
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.n().d());
      $$0.a("Peek", this.al.a(b).byteValue());
      $$0.a("Color", this.al.a(c).byteValue());
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C && !this.bZ() && !this.a(this.dv(), this.n())) {
         this.x();
      }

      if (this.gr()) {
         this.gs();
      }

      if (this.dV().C) {
         if (this.bT > 0) {
            this.bT--;
         } else {
            this.bS = null;
         }
      }
   }

   private void x() {
      ja $$0 = this.h(this.dv());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.m();
      }
   }

   @Override
   protected fel c(feq $$0) {
      float $$1 = L(this.bR);
      ja $$2 = this.n().g();
      return a(this.el(), $$2, $$1, $$0);
   }

   private static float L(float $$0) {
      return 0.5F - azm.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gr() {
      this.bQ = this.bR;
      float $$0 = (float)this.gv() * 0.01F;
      if (this.bR == $$0) {
         return false;
      } else {
         if (this.bR > $$0) {
            this.bR = azm.a(this.bR - 0.05F, $$0, 1.0F);
         } else {
            this.bR = azm.a(this.bR + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gs() {
      this.ay();
      float $$0 = L(this.bR);
      float $$1 = L(this.bQ);
      ja $$2 = this.n().g();
      float $$3 = ($$0 - $$1) * this.el();
      if (!($$3 <= 0.0F)) {
         for (bwf $$5 : this.dV().a(this, a(this.el(), $$2, $$1, $$0, this.dt()), bwm.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof coj) && !$$5.ad) {
               $$5.a(bxi.e, new feq((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static fel a(float $$0, ja $$1, float $$2, feq $$3) {
      return a($$0, $$1, -1.0F, $$2, $$3);
   }

   public static fel a(float $$0, ja $$1, float $$2, float $$3, feq $$4) {
      fel $$5 = new fel((double)(-$$0) * 0.5, 0.0, (double)(-$$0) * 0.5, (double)$$0 * 0.5, (double)$$0, (double)$$0 * 0.5);
      double $$6 = (double)Math.max($$2, $$3);
      double $$7 = (double)Math.min($$2, $$3);
      fel $$8 = $$5.b((double)$$1.j() * $$6 * (double)$$0, (double)$$1.k() * $$6 * (double)$$0, (double)$$1.l() * $$6 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$7) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$7) * (double)$$0);
      return $$8.d($$4.d, $$4.e, $$4.f);
   }

   @Override
   public boolean a(bwf $$0, boolean $$1) {
      if (this.dV().w_()) {
         this.bS = null;
         this.bT = 0;
      }

      this.a(ja.a);
      return super.a($$0, $$1);
   }

   @Override
   public void bP() {
      super.bP();
      if (this.dV().C) {
         this.bS = this.dv();
      }

      this.aW = 0.0F;
      this.aV = 0.0F;
   }

   @Nullable
   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      this.w(0.0F);
      this.aX = this.dL();
      this.by();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bxi $$0, feq $$1) {
      if ($$0 == bxi.d) {
         this.m();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public feq dy() {
      return feq.c;
   }

   @Override
   public void i(feq $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      iu $$3 = this.dv();
      if (this.bZ()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azm.a($$0) + 0.5, (double)azm.a($$1 + 0.5), (double)azm.a($$2) + 0.5);
      }

      if (this.af != 0) {
         iu $$4 = this.dv();
         if (!$$4.equals($$3)) {
            this.al.a(b, (byte)0);
            this.ar = true;
            if (this.dV().C && !this.bZ() && !$$4.equals(this.bS)) {
               this.bS = $$3;
               this.bT = 6;
               this.aa = this.dA();
               this.ab = this.dC();
               this.ac = this.dG();
            }
         }
      }
   }

   @Nullable
   protected ja h(iu $$0) {
      for (ja $$1 : ja.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(iu $$0, ja $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         ja $$2 = $$1.g();
         if (!this.dV().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            fel $$3 = a(this.el(), $$2, 1.0F, $$0.c()).h(1.0E-6);
            return this.dV().a(this, $$3);
         }
      }
   }

   private boolean i(iu $$0) {
      eah $$1 = this.dV().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dmh.ca) && $$0.equals(this.dv());
         return !$$2;
      }
   }

   protected boolean m() {
      if (!this.gg() && this.bK()) {
         iu $$0 = this.dv();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            iu $$2 = $$0.b(azm.b(this.ae, -8, 8), azm.b(this.ae, -8, 8), azm.b(this.ae, -8, 8));
            if ($$2.v() > this.dV().G_() && this.dV().v($$2) && this.dV().A_().a($$2) && this.dV().a(this, new fel($$2).h(1.0E-6))) {
               ja $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ao();
                  this.a($$3);
                  this.a(awn.xM, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dV().a(efh.R, $$0, efh.a.a(this));
                  this.al.a(b, (byte)0);
                  this.g(null);
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
   public bwz N_() {
      return null;
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.gt()) {
         bwf $$3 = $$1.c();
         if ($$3 instanceof crk) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eG() < (double)this.eU() * 0.5 && this.ae.a(4) == 0) {
            this.m();
         } else if ($$1.a(axd.j)) {
            bwf $$4 = $$1.c();
            if ($$4 != null && $$4.aq() == bwo.bd) {
               this.gu();
            }
         }

         return true;
      }
   }

   private boolean gt() {
      return this.gv() == 0;
   }

   private void gu() {
      feq $$0 = this.dt();
      fel $$1 = this.cR();
      if (!this.gt() && this.m()) {
         int $$2 = this.dV().a(bwo.bc, $$1.g(8.0), bwf::bK).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dV().A.i() < $$3)) {
            coj $$4 = bwo.bc.a(this.dV(), bwn.e);
            if ($$4 != null) {
               $$4.a(this.q());
               $$4.f($$0);
               this.dV().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bM() {
      return this.bK();
   }

   public ja n() {
      return this.al.a(a);
   }

   private void a(ja $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(akj<?> $$0) {
      if (a.equals($$0)) {
         this.a(this.ax());
      }

      super.a($$0);
   }

   private int gv() {
      return this.al.a(b);
   }

   void b(int $$0) {
      if (!this.dV().C) {
         this.g(byk.a).c(d);
         if ($$0 == 0) {
            this.g(byk.a).d(bG);
            this.a(awn.xG, 1.0F, 1.0F);
            this.a(efh.j);
         } else {
            this.a(awn.xK, 1.0F, 1.0F);
            this.a(efh.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return azm.h($$0, this.bQ, this.bR);
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.aV = 0.0F;
      this.aW = 0.0F;
   }

   @Override
   public int ac() {
      return 180;
   }

   @Override
   public int ad() {
      return 180;
   }

   @Override
   public void h(bwf $$0) {
   }

   @Nullable
   public feq K(float $$0) {
      if (this.bS != null && this.bT > 0) {
         double $$1 = (double)((float)this.bT - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.el();
         iu $$2 = this.dv();
         double $$3 = (double)($$2.u() - this.bS.u()) * $$1;
         double $$4 = (double)($$2.v() - this.bS.v()) * $$1;
         double $$5 = (double)($$2.w() - this.bS.w()) * $$1;
         return new feq(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   private void a(Optional<cyb> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cyb> q() {
      return Optional.ofNullable(this.t());
   }

   @Nullable
   public cyb t() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cyb.a($$0) : null;
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aR ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aR);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aR) {
         this.a(Optional.of(c(kj.aR, $$1)));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   class a extends cea {
      private int b;

      public a() {
         this.a(EnumSet.of(cea.a.a, cea.a.b));
      }

      @Override
      public boolean b() {
         bxe $$0 = coj.this.f();
         return $$0 != null && $$0.bK() ? coj.this.dV().an() != bua.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         coj.this.b(100);
      }

      @Override
      public void e() {
         coj.this.b(0);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void a() {
         if (coj.this.dV().an() != bua.a) {
            this.b--;
            bxe $$0 = coj.this.f();
            if ($$0 != null) {
               coj.this.J().a($$0, 180.0F, 180.0F);
               double $$1 = coj.this.g((bwf)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + coj.this.ae.a(10) * 20 / 2;
                     coj.this.dV().b(new csa(coj.this.dV(), coj.this, $$0, coj.this.n().o()));
                     coj.this.a(awn.xL, 2.0F, (coj.this.ae.i() - coj.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  coj.this.g(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends ccy {
      public b(bxg $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cft<bxe> {
      public c(coj $$0) {
         super($$0, bxe.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof cnv);
      }

      @Override
      public boolean b() {
         return this.e.cr() == null ? false : super.b();
      }

      @Override
      protected fel a(double $$0) {
         ja $$1 = ((coj)this.e).n();
         if ($$1.o() == ja.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ja.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cdc {
      public d(final bxg $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         ja $$0 = coj.this.n().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(coj.bO));
         jz $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dA();
         double $$5 = this.f - this.a.dE();
         double $$6 = this.g - this.a.dG();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(azm.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cft<crc> {
      public e(final coj $$0) {
         super($$0, crc.class, true);
      }

      @Override
      public boolean b() {
         return coj.this.dV().an() == bua.a ? false : super.b();
      }

      @Override
      protected fel a(double $$0) {
         ja $$1 = ((coj)this.e).n();
         if ($$1.o() == ja.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == ja.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cea {
      private int b;

      @Override
      public boolean b() {
         return coj.this.f() == null && coj.this.ae.a(b(40)) == 0 && coj.this.a(coj.this.dv(), coj.this.n());
      }

      @Override
      public boolean c() {
         return coj.this.f() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + coj.this.ae.a(3)));
         coj.this.b(30);
      }

      @Override
      public void e() {
         if (coj.this.f() == null) {
            coj.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
