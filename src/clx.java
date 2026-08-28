import java.util.EnumSet;
import java.util.Optional;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class clx extends cgo implements bwa<Optional<cuy>>, clj {
   private static final ali e = ali.b("covered");
   private static final bwg bY = new bwg(e, 20.0, bwg.a.a);
   protected static final akl<jm> b = akp.a(clx.class, akn.q);
   protected static final akl<Byte> c = akp.a(clx.class, akn.a);
   protected static final akl<Byte> d = akp.a(clx.class, akn.a);
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

   public clx(bul<? extends clx> $$0, dfb $$1) {
      super($$0, $$1);
      this.bN = 5;
      this.bO = new clx.d(this);
   }

   @Override
   protected void D() {
      this.bS.a(1, new ccg(this, com.class, 8.0F, 0.02F, true));
      this.bS.a(4, new clx.a());
      this.bS.a(7, new clx.f());
      this.bS.a(8, new cct(this));
      this.bT.a(1, new cdq(this, this.getClass()).a());
      this.bT.a(2, new clx.e(this));
      this.bT.a(3, new clx.c(this));
   }

   @Override
   protected bue.b bh() {
      return bue.b.a;
   }

   @Override
   public awm dn() {
      return awm.f;
   }

   @Override
   protected awk w() {
      return awl.wK;
   }

   @Override
   public void U() {
      if (!this.gz()) {
         super.U();
      }
   }

   @Override
   protected awk o_() {
      return awl.wQ;
   }

   @Override
   protected awk d(bsu $$0) {
      return this.gz() ? awl.wS : awl.wR;
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(b, jm.a);
      $$0.a(c, (byte)0);
      $$0.a(d, (byte)16);
   }

   public static bwh.a q() {
      return bvc.E().a(bwi.s, 30.0);
   }

   @Override
   protected caw J() {
      return new clx.b(this);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(jm.a($$0.f("AttachFace")));
      this.am.a(c, $$0.f("Peek"));
      if ($$0.b("Color", 99)) {
         this.am.a(d, $$0.f("Color"));
      }
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("AttachFace", (byte)this.y().d());
      $$0.a("Peek", this.am.a(c));
      $$0.a("Color", this.am.a(d));
   }

   @Override
   public void l() {
      super.l();
      if (!this.dX().C && !this.ca() && !this.a(this.dx(), this.y())) {
         this.gw();
      }

      if (this.gx()) {
         this.gy();
      }

      if (this.dX().C) {
         if (this.cl > 0) {
            this.cl--;
         } else {
            this.ck = null;
         }
      }
   }

   private void gw() {
      jm $$0 = this.h(this.dx());
      if ($$0 != null) {
         this.a($$0);
      } else {
         this.t();
      }
   }

   @Override
   protected ezi az() {
      float $$0 = L(this.cj);
      jm $$1 = this.y().g();
      float $$2 = this.ds() / 2.0F;
      return a(this.el(), $$1, $$0).d(this.dC() - (double)$$2, this.dE(), this.dI() - (double)$$2);
   }

   private static float L(float $$0) {
      return 0.5F - azk.a((0.5F + $$0) * (float) Math.PI) * 0.5F;
   }

   private boolean gx() {
      this.ci = this.cj;
      float $$0 = (float)this.gB() * 0.01F;
      if (this.cj == $$0) {
         return false;
      } else {
         if (this.cj > $$0) {
            this.cj = azk.a(this.cj - 0.05F, $$0, 1.0F);
         } else {
            this.cj = azk.a(this.cj + 0.05F, 0.0F, $$0);
         }

         return true;
      }
   }

   private void gy() {
      this.aA();
      float $$0 = L(this.cj);
      float $$1 = L(this.ci);
      jm $$2 = this.y().g();
      float $$3 = ($$0 - $$1) * this.el();
      if (!($$3 <= 0.0F)) {
         for (bue $$5 : this.dX().a(this, a(this.el(), $$2, $$1, $$0).d(this.dC() - 0.5, this.dE(), this.dI() - 0.5), buj.f.and($$0x -> !$$0x.z(this)))) {
            if (!($$5 instanceof clx) && !$$5.ae) {
               $$5.a(bve.e, new ezn((double)($$3 * (float)$$2.j()), (double)($$3 * (float)$$2.k()), (double)($$3 * (float)$$2.l())));
            }
         }
      }
   }

   public static ezi a(float $$0, jm $$1, float $$2) {
      return a($$0, $$1, -1.0F, $$2);
   }

   public static ezi a(float $$0, jm $$1, float $$2, float $$3) {
      ezi $$4 = new ezi(0.0, 0.0, 0.0, (double)$$0, (double)$$0, (double)$$0);
      double $$5 = (double)Math.max($$2, $$3);
      double $$6 = (double)Math.min($$2, $$3);
      return $$4.b((double)$$1.j() * $$5 * (double)$$0, (double)$$1.k() * $$5 * (double)$$0, (double)$$1.l() * $$5 * (double)$$0)
         .a((double)(-$$1.j()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.k()) * (1.0 + $$6) * (double)$$0, (double)(-$$1.l()) * (1.0 + $$6) * (double)$$0);
   }

   @Override
   public boolean a(bue $$0, boolean $$1) {
      if (this.dX().y_()) {
         this.ck = null;
         this.cl = 0;
      }

      this.a(jm.a);
      return super.a($$0, $$1);
   }

   @Override
   public void af() {
      super.af();
      if (this.dX().C) {
         this.ck = this.dx();
      }

      this.aY = 0.0F;
      this.aX = 0.0F;
   }

   @Nullable
   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      this.v(0.0F);
      this.aZ = this.dN();
      this.bA();
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(bve $$0, ezn $$1) {
      if ($$0 == bve.d) {
         this.t();
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public ezn dA() {
      return ezn.c;
   }

   @Override
   public void h(ezn $$0) {
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      jh $$3 = this.dx();
      if (this.ca()) {
         super.a_($$0, $$1, $$2);
      } else {
         super.a_((double)azk.a($$0) + 0.5, (double)azk.a($$1 + 0.5), (double)azk.a($$2) + 0.5);
      }

      if (this.ag != 0) {
         jh $$4 = this.dx();
         if (!$$4.equals($$3)) {
            this.am.a(c, (byte)0);
            this.as = true;
            if (this.dX().C && !this.ca() && !$$4.equals(this.ck)) {
               this.ck = $$3;
               this.cl = 6;
               this.ab = this.dC();
               this.ac = this.dE();
               this.ad = this.dI();
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
         if (!this.dX().a($$0.a($$1), this, $$2)) {
            return false;
         } else {
            ezi $$3 = a(this.el(), $$2, 1.0F).a($$0).h(1.0E-6);
            return this.dX().a(this, $$3);
         }
      }
   }

   private boolean i(jh $$0) {
      dvj $$1 = this.dX().a_($$0);
      if ($$1.l()) {
         return false;
      } else {
         boolean $$2 = $$1.a(dig.bQ) && $$0.equals(this.dx());
         return !$$2;
      }
   }

   protected boolean t() {
      if (!this.gh() && this.bM()) {
         jh $$0 = this.dx();

         for (int $$1 = 0; $$1 < 5; $$1++) {
            jh $$2 = $$0.b(azk.b(this.af, -8, 8), azk.b(this.af, -8, 8), azk.b(this.af, -8, 8));
            if ($$2.v() > this.dX().I_() && this.dX().u($$2) && this.dX().C_().a($$2) && this.dX().a(this, new ezi($$2).h(1.0E-6))) {
               jm $$3 = this.h($$2);
               if ($$3 != null) {
                  this.ap();
                  this.a($$3);
                  this.a(awl.wV, 1.0F, 1.0F);
                  this.a_((double)$$2.u() + 0.5, (double)$$2.v(), (double)$$2.w() + 0.5);
                  this.dX().a(eag.R, $$0, eag.a.a(this));
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
   public boolean a(bsu $$0, float $$1) {
      if (this.gz()) {
         bue $$2 = $$0.c();
         if ($$2 instanceof cou) {
            return false;
         }
      }

      if (!super.a($$0, $$1)) {
         return false;
      } else {
         if ((double)this.eG() < (double)this.eV() * 0.5 && this.af.a(4) == 0) {
            this.t();
         } else if ($$0.a(axc.j)) {
            bue $$3 = $$0.c();
            if ($$3 != null && $$3.ar() == bul.aL) {
               this.gA();
            }
         }

         return true;
      }
   }

   private boolean gz() {
      return this.gB() == 0;
   }

   private void gA() {
      ezn $$0 = this.dv();
      ezi $$1 = this.cS();
      if (!this.gz() && this.t()) {
         int $$2 = this.dX().a(bul.aK, $$1.g(8.0), bue::bM).size();
         float $$3 = (float)($$2 - 1) / 5.0F;
         if (!(this.dX().A.i() < $$3)) {
            clx $$4 = bul.aK.a(this.dX(), buk.e);
            if ($$4 != null) {
               $$4.a(this.gu());
               $$4.e($$0);
               this.dX().b($$4);
            }
         }
      }
   }

   @Override
   public boolean bO() {
      return this.bM();
   }

   public jm y() {
      return this.am.a(b);
   }

   private void a(jm $$0) {
      this.am.a(b, $$0);
   }

   @Override
   public void a(akl<?> $$0) {
      if (b.equals($$0)) {
         this.a(this.az());
      }

      super.a($$0);
   }

   private int gB() {
      return this.am.a(c);
   }

   void b(int $$0) {
      if (!this.dX().C) {
         this.g(bwi.a).c(e);
         if ($$0 == 0) {
            this.g(bwi.a).d(bY);
            this.a(awl.wP, 1.0F, 1.0F);
            this.a(eag.j);
         } else {
            this.a(awl.wT, 1.0F, 1.0F);
            this.a(eag.k);
         }
      }

      this.am.a(c, (byte)$$0);
   }

   public float J(float $$0) {
      return azk.h($$0, this.ci, this.cj);
   }

   @Override
   public void a(acf $$0) {
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
   public void h(bue $$0) {
   }

   @Nullable
   public ezn K(float $$0) {
      if (this.ck != null && this.cl > 0) {
         double $$1 = (double)((float)this.cl - $$0) / 6.0;
         $$1 *= $$1;
         $$1 *= (double)this.el();
         jh $$2 = this.dx();
         double $$3 = (double)($$2.u() - this.ck.u()) * $$1;
         double $$4 = (double)($$2.v() - this.ck.v()) * $$1;
         double $$5 = (double)($$2.w() - this.ck.w()) * $$1;
         return new ezn(-$$3, -$$4, -$$5);
      } else {
         return null;
      }
   }

   @Override
   protected float b(float $$0) {
      return Math.min($$0, 3.0F);
   }

   public void a(Optional<cuy> $$0) {
      this.am.a(d, $$0.<Byte>map($$0x -> (byte)$$0x.a()).orElse((byte)16));
   }

   public Optional<cuy> gu() {
      return Optional.ofNullable(this.gv());
   }

   @Nullable
   public cuy gv() {
      byte $$0 = this.am.a(d);
      return $$0 != 16 && $$0 <= 15 ? cuy.a($$0) : null;
   }

   class a extends cby {
      private int b;

      public a() {
         this.a(EnumSet.of(cby.a.a, cby.a.b));
      }

      @Override
      public boolean b() {
         bva $$0 = clx.this.m();
         return $$0 != null && $$0.bM() ? clx.this.dX().ak() != bsa.a : false;
      }

      @Override
      public void d() {
         this.b = 20;
         clx.this.b(100);
      }

      @Override
      public void e() {
         clx.this.b(0);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         if (clx.this.dX().ak() != bsa.a) {
            this.b--;
            bva $$0 = clx.this.m();
            if ($$0 != null) {
               clx.this.K().a($$0, 180.0F, 180.0F);
               double $$1 = clx.this.g((bue)$$0);
               if ($$1 < 400.0) {
                  if (this.b <= 0) {
                     this.b = 20 + clx.this.af.a(10) * 20 / 2;
                     clx.this.dX().b(new cpj(clx.this.dX(), clx.this, $$0, clx.this.y().o()));
                     clx.this.a(awl.wU, 2.0F, (clx.this.af.i() - clx.this.af.i()) * 0.2F + 1.0F);
                  }
               } else {
                  clx.this.h(null);
               }

               super.a();
            }
         }
      }
   }

   static class b extends caw {
      public b(bvc $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   static class c extends cdr<bva> {
      public c(clx $$0) {
         super($$0, bva.class, 10, true, false, $$0x -> $$0x instanceof clj);
      }

      @Override
      public boolean b() {
         return this.e.cs() == null ? false : super.b();
      }

      @Override
      protected ezi a(double $$0) {
         jm $$1 = ((clx)this.e).y();
         if ($$1.o() == jm.a.a) {
            return this.e.cS().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jm.a.c ? this.e.cS().c($$0, $$0, 4.0) : this.e.cS().c($$0, 4.0, $$0);
         }
      }
   }

   class d extends cba {
      public d(final bvc $$0) {
         super($$0);
      }

      @Override
      protected void b() {
      }

      @Override
      protected Optional<Float> i() {
         jm $$0 = clx.this.y().g();
         Vector3f $$1 = $$0.b().transform(new Vector3f(clx.cg));
         kl $$2 = $$0.q();
         Vector3f $$3 = new Vector3f((float)$$2.u(), (float)$$2.v(), (float)$$2.w());
         $$3.cross($$1);
         double $$4 = this.e - this.a.dC();
         double $$5 = this.f - this.a.dG();
         double $$6 = this.g - this.a.dI();
         Vector3f $$7 = new Vector3f((float)$$4, (float)$$5, (float)$$6);
         float $$8 = $$3.dot($$7);
         float $$9 = $$1.dot($$7);
         return !(Math.abs($$8) > 1.0E-5F) && !(Math.abs($$9) > 1.0E-5F)
            ? Optional.empty()
            : Optional.of((float)(azk.d((double)(-$$8), (double)$$9) * 180.0F / (float)Math.PI));
      }

      @Override
      protected Optional<Float> h() {
         return Optional.of(0.0F);
      }
   }

   class e extends cdr<com> {
      public e(final clx $$0) {
         super($$0, com.class, true);
      }

      @Override
      public boolean b() {
         return clx.this.dX().ak() == bsa.a ? false : super.b();
      }

      @Override
      protected ezi a(double $$0) {
         jm $$1 = ((clx)this.e).y();
         if ($$1.o() == jm.a.a) {
            return this.e.cS().c(4.0, $$0, $$0);
         } else {
            return $$1.o() == jm.a.c ? this.e.cS().c($$0, $$0, 4.0) : this.e.cS().c($$0, 4.0, $$0);
         }
      }
   }

   class f extends cby {
      private int b;

      @Override
      public boolean b() {
         return clx.this.m() == null && clx.this.af.a(b(40)) == 0 && clx.this.a(clx.this.dx(), clx.this.y());
      }

      @Override
      public boolean c() {
         return clx.this.m() == null && this.b > 0;
      }

      @Override
      public void d() {
         this.b = this.a(20 * (1 + clx.this.af.a(3)));
         clx.this.b(30);
      }

      @Override
      public void e() {
         if (clx.this.m() == null) {
            clx.this.b(0);
         }
      }

      @Override
      public void a() {
         this.b--;
      }
   }
}
