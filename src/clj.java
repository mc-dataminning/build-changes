import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class clj extends cga implements bvm<Optional<cum>>, ckv {
   private static final ale e = ale.b("covered");
   private static final bvs bY = new bvs(e, 20.0, bvs.a.a);
   protected static final akh<jk> b = akl.a(clj.class, akj.q);
   protected static final akh<Byte> c = akl.a(clj.class, akj.a);
   protected static final akh<Byte> d = akl.a(clj.class, akj.a);
   private static final int bZ = 6;
   private static final byte ca = 16;
   private static final byte cb = 16;
   private static final int cc = 8;
   private static final int cd = 8;
   private static final int ce = 5;
   private static final float cf = 0.05F;
   static final Vector3f cg = ad.a(() -> {
      kj $$0 = jk.d.q();
      return new Vector3f((float)$$0.u(), (float)$$0.v(), (float)$$0.w());
   });
   private static final float ch = 3.0F;
   private float ci;
   private float cj;
   @Nullable
   private jf ck;
   private int cl;
   private static final float cm = 1.0F;

   public clj(bty<? extends clj> $$0, dej $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new clj.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbs(this, cnx.class, 8.0F, 0.02F, true));
      this.bS.a(4, new clj.a());
      this.bS.a(7, new clj.f());
      this.bS.a(8, new ccf(this));
      this.bT.a(1, new cdc(this, this.getClass()).a());
      this.bT.a(2, new clj.e(this));
      this.bT.a(3, new clj.c(this));
   }

   @Override
   protected btr.b bf() {
      return btr.b.a;
   }

   @Override
   public awh di() {
      return awh.f;
   }

   @Override
   protected awf w() {
      return awg.wM;
   }

   @Override
   public void U() {
      if (!this.gt()) {
         super.U();
      }
   }

   @Override
   protected awf o_() {
      return awg.wS;
   }

   @Override
   protected awf d(bsj $$0) {
      return this.gt() ? awg.wU : awg.wT;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, jk.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static bvt.a q() {
      return bup.E().a(bvu.s, 30.0);
   }

   @Override
   protected cai J() {
      return new clj.b(this);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      this.a(jk.a($$0.f("AttachFace")));
      this.am.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.am.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(ug $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.am.a(c));
      $$0.a("Color", this.am.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dS().B && !this.bW() && !this.a(this.ds(), this.y())) {
         this.gq();
      }

      if (this.gr()) {
         this.gs();
      }

      if (this.dS().B) {
         if (this.cl > 0) {
            this.cl--;
         } else {
            this.ck = null;
         }
      }
   }

   private void gq() {
      jk $$0 = this.h(this.ds());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected eyr aw() {
      float $$0 = L(this.cj);
      jk $$1 = this.y().g();
      float $$2 = this.dn() / 2.0F;
      return a(this.eg(), $$1, $$0).d(this.dx() - (double)$$2, this.dz(), this.dD() - (double)$$2);
   }

   private static float L(float $$0) {
      return 0.5F - azf.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gr() {
      this.ci = this.cj;
      float $$0 = (float)this.gv() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = azf.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = azf.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gs() {
      this.ax();
      float $$0 = L(this.cj);
      float $$1 = L(this.ci);
      jk $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.eg();
      if (!($$3 <= 0.0F)) {
         for (btr $$5 : this.dS().a(this, a(this.eg(), $$2, $$1, $$0).d(this.dx() - 0.5, this.dz(), this.dD() - 0.5), btw.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof clj) && !$$5.ae) {
               $$5.a(bur.e, new eyw((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static eyr a(float $$0, jk $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static eyr a(float $$0, jk $$1, float $$2, float $$3) {
      eyr $$4 = new eyr(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(btr $$0, boolean $$1) {
      if (this.dS().x_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(jk.a);
      return super.a($$0, $$1);
   }

   @Override
   public void af() {
      super.af();
      if (this.dS().B) {
         this.ck = this.ds();
      }

      this.aU = 0.0F;
      this.aT = 0.0F;
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      this.v(0.0F);
      this.aV = this.dI();
      this.by();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bur $$0, eyw $$1) {
      if ($$0 == bur.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public eyw dv() {
      return eyw.c;
   }

   @Override
   public void h(eyw $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      jf $$3 = this.ds();
      if (this.bW()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azf.a($$0) + 0.5, (double)azf.a($$1 + 0.5), (double)azf.a($$2) + 0.5);
      }

      if (this.ag != 0) {
         jf $$4 = this.ds();
         if (!$$4.equals($$3)) {
            this.am.a(c, (byte)0);
            this.as = true;
            if (this.dS().B && !this.bW() && !$$4.equals(this.ck)) {
               this.ck = $$3;
               this.cl = 6;
               this.ab = this.dx();
               this.ac = this.dz();
               this.ad = this.dD();
            }
         }
      }
   }

   @Nullable
   protected jk h(jf $$0) {
      for (jk $$1 : jk.values()) {
         if (this.a($$0, $$1)) {
            return $$1;
         }
      }

      return null;
   }

   boolean a(jf $$0, jk $$1) {
      if (this.i($$0)) {
         return false;
      } else {
         jk $$2 = $$1.g();
         if (!this.dS().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            eyr $$3 = a(this.eg(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dS().a(this, $$3);
         }
      }
   }

   private boolean i(jf $$0) {
      dus $$1 = this.dS().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dho.bQ) && $$0.equals(this.ds());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.gd() && this.bI()) {
         jf $$0 = this.ds();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            jf $$2 = $$0.b(azf.b(this.af, -8, 8), azf.b(this.af, -8, 8), azf.b(this.af, -8, 8));
            if ($$2.v() > this.dS().H_() && this.dS().u($$2) && this.dS().B_().a($$2) && this.dS().a(this, new eyr($$2).h(1.0E-6))) {
               jk $$3 = this.h($$2);
               if ($$3 != null) {
                  this.am();
                  this.a($$3);
                  this.a(awg.wX, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dS().a(dzp.R, $$0, dzp.a.a(this));
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
      this.bn = 0;
      this.a_($$0, $$1, $$2);
      this.a($$3, $$4);
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.gt()) {
         btr $$2 = $$0.c();
         if ($$2 instanceof coe) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eB() < (double)this.eQ() * 0.5 && this.af.a(4) == 0) {
            this.t();
         } else if ($$0.a(awx.j)) {
            btr $$3 = $$0.c();
            if ($$3 != null && $$3.ao() == bty.aL) {
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
      eyw $$0 = this.dq();
      eyr $$1 = this.cO();
      if (!this.gt() && this.t()) {
         int $$2 = this.dS().a(bty.aK, $$1.g(8.0), btr::bI).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dS().z.i() < $$3)) {
            clj $$4 = bty.aK.a(this.dS(), btx.e);
            if ($$4 != null) {
               $$4.a(this.go());
               $$4.e($$0);
               this.dS().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bK() {
      return this.bI();
   }

   public jk y() {
      return this.am.a(b);
   }

   private void a(jk $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a(akh<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.aw());
      }

      super.a($$0);
   }

   private int gv() {
      return this.am.a(c);
   }

   void b(int $$0) {
      if (!this.dS().B) {
         this.g(bvu.a).c(e);
         if ($$0 == 0) {
            this.g(bvu.a).d(bY);
            this.a(awg.wR, 1.0F, 1.0F);
            this.a(dzp.j);
         } else {
            this.a(awg.wV, 1.0F, 1.0F);
            this.a(dzp.k);
         }
      }

      this.am.a(c, (byte)$$0);
   }

   public float J(float $$0) {
      return azf.h($$0, this.ci, this.cj);
   }

   @Override
   public void a(acb $$0) {
      super.a($$0);
      this.aT = 0.0F;
      this.aU = 0.0F;
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
   public void h(btr $$0) {
   }

   @Nullable
   public eyw K(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.eg();
         jf $$2 = this.ds();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return new eyw(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cum> $$0) {
      this.am.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cum> go() {
      return Optional.ofNullable(this.gp());
   }

   @Nullable
   public cum gp() {
      byte $$0 = this.am.a(d);
      return $$0 != 16 && $$0 <= 15 ? cum.a($$0) : null;
   }

   class a extends cbk {
      private int b;

      public a() {
         this.a(EnumSet.of(cbk.a.a, cbk.a.b));
      }

      @Override
      public boolean b() {
         bun $$0 = clj.this.m();
         return $$0 != null && $$0.bI() ? clj.this.dS().am() != brp.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         clj.this.b(100);
      }

      @Override
      public void e() {
         clj.this.b(0);
      }

      @Override
      public boolean U_() {
         return true;
      }

      @Override
      public void a() {
         if (clj.this.dS().am() != brp.a) {
            this.b--;
            bun $$0 = clj.this.m();
            if ($$0 != null) {
               clj.this.K().a($$0, 180.0F, 180.0F);
               double $$1 = clj.this.g((btr)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + clj.this.af.a(10) * 20 / 2;
                     clj.this.dS().b(new cou(clj.this.dS(), clj.this, $$0, clj.this.y().o()));
                     clj.this.a(awg.wW, 2.0F, (clj.this.af.i() - clj.this.af.i()) * 0.2F + 1.0F);
                  }
               } else {
                  clj.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends cai {
      public b(bup $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cdd<bun> {
      public c(clj $$0) {
         super($$0, bun.class, 10, true, false, $$0x -> $$0x instanceof ckv);
      }

      @Override
      public boolean b() {
         return this.e.co() == null ? false : super.b();
      }

      @Override
      protected eyr a(double $$0) {
         jk $$1 = ((clj)this.e).y();
         if ($$1.o() == jk.a.a) {
            return this.e.cO().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jk.a.c ? this.e.cO().c($$0, $$0, 4.0) : this.e.cO().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cam {
      public d(final bup $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jk $$0 = clj.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(clj.cg));
         kj $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dx();
         double $$5 = this.f - this.a.dB();
         double $$6 = this.g - this.a.dD();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(azf.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cdd<cnx> {
      public e(final clj $$0) {
         super($$0, cnx.class, true);
      }

      @Override
      public boolean b() {
         return clj.this.dS().am() == brp.a ? false : super.b();
      }

      @Override
      protected eyr a(double $$0) {
         jk $$1 = ((clj)this.e).y();
         if ($$1.o() == jk.a.a) {
            return this.e.cO().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jk.a.c ? this.e.cO().c($$0, $$0, 4.0) : this.e.cO().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cbk {
      private int b;

      @Override
      public boolean b() {
         return clj.this.m() == null && clj.this.af.a(b(40)) == 0 && clj.this.a(clj.this.ds(), clj.this.y());
      }

      @Override
      public boolean c() {
         return clj.this.m() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + clj.this.af.a(3)));
         clj.this.b(30);
      }

      @Override
      public void e() {
         if (clj.this.m() == null) {
            clj.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
