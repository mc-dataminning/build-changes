import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cme extends cgv implements bwh<Optional<cvj>>, clq {
   private static final alj d = alj.b("covered");
   private static final bwn bY = new bwn(d, 20.0, bwn.a.a);
   protected static final akm<jm> a = akq.a(cme.class, ako.q);
   protected static final akm<Byte> b = akq.a(cme.class, ako.a);
   protected static final akm<Byte> c = akq.a(cme.class, ako.a);
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

   public cme(bus<? extends cme> $$0, dfm $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new cme.d(this);
   }

   @Override
   protected void B() {
      this.bS.a(1, new ccn(this, cou.class, 8.0F, 0.02F, true));
      this.bS.a(4, new cme.a());
      this.bS.a(7, new cme.f());
      this.bS.a(8, new cda(this));
      this.bT.a(1, new cdx(this, this.getClass()).a());
      this.bT.a(2, new cme.e(this));
      this.bT.a(3, new cme.c(this));
   }

   @Override
   protected bul.b bg() {
      return bul.b.a;
   }

   @Override
   public awo dm() {
      return awo.f;
   }

   @Override
   protected awm t() {
      return awn.wK;
   }

   @Override
   public void R() {
      if (!this.gr()) {
         super.R();
      }
   }

   @Override
   protected awm n_() {
      return awn.wQ;
   }

   @Override
   protected awm e(btb $$0) {
      return this.gr() ? awn.wS : awn.wR;
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(a, jm.a);
      $$0.a(b, (byte)0);
      $$0.a(c, (byte)16);
   }

   public static bwo.a n() {
      return bvj.C().a(bwp.s, 30.0);
   }

   @Override
   protected cbd G() {
      return new cme.b(this);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.a(jm.a($$0.f("AttachFace")));
      this.al.a(b, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.al.a(c, $$0.f("Color"));
      }
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.v().d());
      $$0.a("Peek", this.al.a(b));
      $$0.a("Color", this.al.a(c));
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C && !this.bZ() && !this.a(this.dv(), this.v())) {
         this.go();
      }

      if (this.gp()) {
         this.gq();
      }

      if (this.dV().C) {
         if (this.cl > 0) {
            this.cl--;
         } else {
            this.ck = null;
         }
      }
   }

   private void go() {
      jm $$0 = this.h(this.dv());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.q();
      }
   }

   @Override
   protected ezt ax() {
      float $$0 = L(this.cj);
      jm $$1 = this.v().g();
      float $$2 = this.dq() / 2.0F;
      return a(this.ej(), $$1, $$0).d(this.dA() - (double)$$2, this.dC(), this.dG() - (double)$$2);
   }

   private static float L(float $$0) {
      return 0.5F - azm.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gp() {
      this.ci = this.cj;
      float $$0 = (float)this.gt() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = azm.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = azm.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gq() {
      this.ay();
      float $$0 = L(this.cj);
      float $$1 = L(this.ci);
      jm $$2 = this.v().g();
      float $$3 = ($$0 - $$1) * this.ej();
      if (!($$3 <= 0.0F)) {
         for (bul $$5 : this.dV().a(this, a(this.ej(), $$2, $$1, $$0).d(this.dA() - 0.5, this.dC(), this.dG() - 0.5), buq.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof cme) && !$$5.ad) {
               $$5.a(bvl.e, new ezy((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ezt a(float $$0, jm $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static ezt a(float $$0, jm $$1, float $$2, float $$3) {
      ezt $$4 = new ezt(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bul $$0, boolean $$1) {
      if (this.dV().A_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(jm.a);
      return super.a($$0, $$1);
   }

   @Override
   public void ae() {
      super.ae();
      if (this.dV().C) {
         this.ck = this.dv();
      }

      this.aX = 0.0F;
      this.aW = 0.0F;
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.v(0.0F);
      this.aY = this.dL();
      this.bz();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bvl $$0, ezy $$1) {
      if ($$0 == bvl.d) {
         this.q();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ezy dy() {
      return ezy.c;
   }

   @Override
   public void h(ezy $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      jh $$3 = this.dv();
      if (this.bZ()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azm.a($$0) + 0.5, (double)azm.a($$1 + 0.5), (double)azm.a($$2) + 0.5);
      }

      if (this.af != 0) {
         jh $$4 = this.dv();
         if (!$$4.equals($$3)) {
            this.al.a(b, (byte)0);
            this.ar = true;
            if (this.dV().C && !this.bZ() && !$$4.equals(this.ck)) {
               this.ck = $$3;
               this.cl = 6;
               this.aa = this.dA();
               this.ab = this.dC();
               this.ac = this.dG();
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
         if (!this.dV().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ezt $$3 = a(this.ej(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dV().a(this, $$3);
         }
      }
   }

   private boolean i(jh $$0) {
      dvv $$1 = this.dV().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dis.bQ) && $$0.equals(this.dv());
         return !$$2;
      }
   }

   protected boolean q() {
      if (!this.fZ() && this.bL()) {
         jh $$0 = this.dv();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            jh $$2 = $$0.b(azm.b(this.ae, -8, 8), azm.b(this.ae, -8, 8), azm.b(this.ae, -8, 8));
            if ($$2.v() > this.dV().K_() && this.dV().u($$2) && this.dV().E_().a($$2) && this.dV().a(this, new ezt($$2).h(1.0E-6))) {
               jm $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ao();
                  this.a($$3);
                  this.a(awn.wV, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dV().a(ear.R, $$0, ear.a.a(this));
                  this.al.a(b, (byte)0);
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
      this.bq = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.gr()) {
         bul $$3 = $$1.c();
         if ($$3 instanceof cpb) {
            return false;
         }
      }

      if (!super.a($$0, $$1, $$2)) {
         return false;
      } else {
         if ((double)this.eD() < (double)this.eR() * 0.5 && this.ae.a(4) == 0) {
            this.q();
         } else if ($$1.a(axe.j)) {
            bul $$4 = $$1.c();
            if ($$4 != null && $$4.aq() == bus.aZ) {
               this.gs();
            }
         }

         return true;
      }
   }

   private boolean gr() {
      return this.gt() == 0;
   }

   private void gs() {
      ezy $$0 = this.dt();
      ezt $$1 = this.cR();
      if (!this.gr() && this.q()) {
         int $$2 = this.dV().a(bus.aY, $$1.g(8.0), bul::bL).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dV().A.i() < $$3)) {
            cme $$4 = bus.aY.a(this.dV(), bur.e);
            if ($$4 != null) {
               $$4.a(this.gm());
               $$4.e($$0);
               this.dV().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bN() {
      return this.bL();
   }

   public jm v() {
      return this.al.a(a);
   }

   private void a(jm $$0) {
      this.al.a(a, $$0);
   }

   @Override
   public void a(akm<?> $$0) {
      if (a.equals($$0)) {
         this.a(this.ax());
      }

      super.a($$0);
   }

   private int gt() {
      return this.al.a(b);
   }

   void b(int $$0) {
      if (!this.dV().C) {
         this.g(bwp.a).c(d);
         if ($$0 == 0) {
            this.g(bwp.a).d(bY);
            this.a(awn.wP, 1.0F, 1.0F);
            this.a(ear.j);
         } else {
            this.a(awn.wT, 1.0F, 1.0F);
            this.a(ear.k);
         }
      }

      this.al.a(b, (byte)$$0);
   }

   public float J(float $$0) {
      return azm.h($$0, this.ci, this.cj);
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      this.aW = 0.0F;
      this.aX = 0.0F;
   }

   @Override
   public int Z() {
      return 180;
   }

   @Override
   public int aa() {
      return 180;
   }

   @Override
   public void h(bul $$0) {
   }

   @Nullable
   public ezy K(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.ej();
         jh $$2 = this.dv();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return new ezy(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cvj> $$0) {
      this.al.a(c, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cvj> gm() {
      return Optional.ofNullable(this.gn());
   }

   @Nullable
   public cvj gn() {
      byte $$0 = this.al.a(c);
      return $$0 != 16 && $$0 <= 15 ? cvj.a($$0) : null;
   }

   class a extends ccf {
      private int b;

      public a() {
         this.a(EnumSet.of(ccf.a.a, ccf.a.b));
      }

      @Override
      public boolean b() {
         bvh $$0 = cme.this.aa_();
         return $$0 != null && $$0.bL() ? cme.this.dV().ak() != bsh.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         cme.this.b(100);
      }

      @Override
      public void e() {
         cme.this.b(0);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         if (cme.this.dV().ak() != bsh.a) {
            this.b--;
            bvh $$0 = cme.this.aa_();
            if ($$0 != null) {
               cme.this.H().a($$0, 180.0F, 180.0F);
               double $$1 = cme.this.g((bul)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + cme.this.ae.a(10) * 20 / 2;
                     cme.this.dV().b(new cpq(cme.this.dV(), cme.this, $$0, cme.this.v().o()));
                     cme.this.a(awn.wU, 2.0F, (cme.this.ae.i() - cme.this.ae.i()) * 0.2F + 1.0F);
                  }
               } else {
                  cme.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cbd {
      public b(bvj $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cdy<bvh> {
      public c(cme $$0) {
         super($$0, bvh.class, 10, true, false, ($$0x, $$1) -> $$0x instanceof clq);
      }

      @Override
      public boolean b() {
         return this.e.cr() == null ? false : super.b();
      }

      @Override
      protected ezt a(double $$0) {
         jm $$1 = ((cme)this.e).v();
         if ($$1.o() == jm.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jm.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cbh {
      public d(final bvj $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jm $$0 = cme.this.v().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(cme.cg));
         kl $$2 = $$0.q();
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

   class e extends cdy<cou> {
      public e(final cme $$0) {
         super($$0, cou.class, true);
      }

      @Override
      public boolean b() {
         return cme.this.dV().ak() == bsh.a ? false : super.b();
      }

      @Override
      protected ezt a(double $$0) {
         jm $$1 = ((cme)this.e).v();
         if ($$1.o() == jm.a.a) {
            return this.e.cR().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jm.a.c ? this.e.cR().c($$0, $$0, 4.0) : this.e.cR().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends ccf {
      private int b;

      @Override
      public boolean b() {
         return cme.this.aa_() == null && cme.this.ae.a(b(40)) == 0 && cme.this.a(cme.this.dv(), cme.this.v());
      }

      @Override
      public boolean c() {
         return cme.this.aa_() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + cme.this.ae.a(3)));
         cme.this.b(30);
      }

      @Override
      public void e() {
         if (cme.this.aa_() == null) {
            cme.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
