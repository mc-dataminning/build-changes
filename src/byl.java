import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byl extends bmq implements bmc {
   private static final afz<Boolean> bX = agc.a(byl.class, agb.k);
   private static final afz<Integer> bY = agc.a(byl.class, agb.b);
   private static final afz<Integer> bZ = agc.a(byl.class, agb.b);
   public static final Predicate<blv> bW = $$0 -> {
      blj<?> $$1 = $$0.ai();
      return $$1 == blj.aG || $$1 == blj.aD || $$1 == blj.O;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final biw ci = auz.a(20, 39);
   @Nullable
   private UUID cj;

   public byl(blj<? extends byl> $$0, csy $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(eek.f, -1.0F);
      this.a(eek.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsl(this));
      this.bO.a(1, new byl.b(1.5));
      this.bO.a(2, new btw(this));
      this.bO.a(3, new byl.a<>(this, bzk.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new bsx(this, 0.4F));
      this.bO.a(5, new btb(this, 1.0, true));
      this.bO.a(6, new bsp(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new bsd(this, 1.0));
      this.bO.a(8, new bue(this, 1.0));
      this.bO.a(9, new brz(this, 8.0F));
      this.bO.a(10, new bsz(this, cer.class, 8.0F));
      this.bO.a(10, new btm(this));
      this.bP.a(1, new buo(this));
      this.bP.a(2, new bup(this));
      this.bP.a(3, new buj(this).a());
      this.bP.a(4, new buk<>(this, cer.class, 10, true, false, this::a_));
      this.bP.a(5, new bun<>(this, bxi.class, false, bW));
      this.bP.a(6, new bun<>(this, byj.class, false, byj.bU));
      this.bP.a(7, new buk<>(this, cbi.class, false));
      this.bP.a(8, new buq<>(this, true));
   }

   public static bna.a gk() {
      return blx.C().a(bnb.m, 0.3F).a(bnb.l, 8.0).a(bnb.c, 2.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, false);
      this.an.a(bY, ckv.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.BC, 0.15F, 1.0F);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gn().a());
      this.c($$0);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(ckv.a($$0.h("CollarColor")));
      }

      this.a(this.dM(), $$0);
   }

   @Override
   protected arb y() {
      if (this.aa_()) {
         return arc.Bx;
      } else if (this.ag.a(3) == 0) {
         return this.u() && this.ev() < 10.0F ? arc.BD : arc.BA;
      } else {
         return arc.Bv;
      }
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.Bz;
   }

   @Override
   protected arb n_() {
      return arc.Bw;
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dM().B && this.ce && !this.cf && !this.ga() && this.aC()) {
         this.cf = true;
         this.cg = 0.0F;
         this.ch = 0.0F;
         this.dM().a(this, (byte)8);
      }

      if (!this.dM().B) {
         this.a((amp)this.dM(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bx()) {
         this.cd = this.cc;
         if (this.go()) {
            this.cc = this.cc + (1.0F - this.cc) * 0.4F;
         } else {
            this.cc = this.cc + (0.0F - this.cc) * 0.4F;
         }

         if (this.bb()) {
            this.ce = true;
            if (this.cf && !this.dM().B) {
               this.dM().a(this, (byte)56);
               this.gp();
            }
         } else if ((this.ce || this.cf) && this.cf) {
            if (this.cg == 0.0F) {
               this.a(arc.BB, this.eW(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(dmz.u);
            }

            this.ch = this.cg;
            this.cg += 0.05F;
            if (this.ch >= 2.0F) {
               this.ce = false;
               this.cf = false;
               this.ch = 0.0F;
               this.cg = 0.0F;
            }

            if (this.cg > 0.4F) {
               float $$0 = (float)this.dt();
               int $$1 = (int)(aty.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               elb $$2 = this.dp();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  this.dM().a(jv.aj, this.dr() + (double)$$4, (double)($$0 + 0.8F), this.dx() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gp() {
      this.cf = false;
      this.cg = 0.0F;
      this.ch = 0.0F;
   }

   @Override
   public void a(bkd $$0) {
      this.ce = false;
      this.cf = false;
      this.ch = 0.0F;
      this.cg = 0.0F;
      super.a($$0);
   }

   public boolean gl() {
      return this.ce;
   }

   public float E(float $$0) {
      return Math.min(0.5F + aty.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (aty.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return aty.a($$2 * (float) Math.PI) * aty.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return aty.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int aa() {
      return this.A() ? 20 : super.aa();
   }

   @Override
   public boolean a(bkd $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         blf $$2 = $$0.d();
         if (!this.dM().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cer) && !($$2 instanceof cex)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(blf $$0) {
      boolean $$1 = $$0.a(this.dN().b((blv)this), (float)((int)this.b(bnb.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bnb.l).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bnb.l).a(8.0);
      }

      this.a(bnb.c).a(4.0);
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      cmc $$3 = $$2.d();
      if (this.dM().B) {
         boolean $$4 = this.j($$0) || this.u() || $$2.a(cmk.rw) && !this.u() && !this.aa_();
         return $$4 ? bjl.b : bjl.d;
      } else if (this.u()) {
         if (this.m($$2) && this.ev() < this.eM()) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bjl.a;
         } else {
            if ($$3 instanceof ckw $$5 && this.j($$0)) {
               ckv $$6 = $$5.d();
               if ($$6 != this.gn()) {
                  this.a($$6);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  return bjl.a;
               }

               return super.b($$0, $$1);
            }

            bjl $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.o_()) && this.j($$0)) {
               this.z(!this.ge());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bjl.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(cmk.rw) && !this.aa_()) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         if (this.ag.a(3) == 0) {
            this.f($$0);
            this.bN.n();
            this.h(null);
            this.z(true);
            this.dM().a(this, (byte)7);
         } else {
            this.dM().a(this, (byte)6);
         }

         return bjl.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 8) {
         this.cf = true;
         this.cg = 0.0F;
         this.ch = 0.0F;
      } else if ($$0 == 56) {
         this.gp();
      } else {
         super.b($$0);
      }
   }

   public float gm() {
      if (this.aa_()) {
         return 1.5393804F;
      } else {
         return this.u() ? (0.55F - (this.eM() - this.ev()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean m(cmh $$0) {
      cmc $$1 = $$0.d();
      return $$1.u() && $$1.v().c();
   }

   @Override
   public int fI() {
      return 8;
   }

   @Override
   public int a() {
      return this.an.b(bZ);
   }

   @Override
   public void a(int $$0) {
      this.an.b(bZ, $$0);
   }

   @Override
   public void c() {
      this.a(ci.a(this.ag));
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cj;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cj = $$0;
   }

   public ckv gn() {
      return ckv.a(this.an.b(bY));
   }

   public void a(ckv $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public byl b(amp $$0, bla $$1) {
      byl $$2 = blj.bp.a((csy)$$0);
      if ($$2 != null) {
         UUID $$3 = this.d();
         if ($$3 != null) {
            $$2.b($$3);
            $$2.x(true);
         }
      }

      return $$2;
   }

   public void A(boolean $$0) {
      this.an.b(bX, $$0);
   }

   @Override
   public boolean a(bxi $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.u()) {
         return false;
      } else if (!($$0 instanceof byl $$1)) {
         return false;
      } else if (!$$1.u()) {
         return false;
      } else {
         return $$1.A() ? false : this.gi() && $$1.gi();
      }
   }

   public boolean go() {
      return this.an.b(bX);
   }

   @Override
   public boolean a(blv $$0, blv $$1) {
      if ($$0 instanceof cbl || $$0 instanceof cbt) {
         return false;
      } else if ($$0 instanceof byl $$2) {
         return !$$2.u() || $$2.R_() != $$1;
      } else if ($$0 instanceof cer && $$1 instanceof cer && !((cer)$$1).a((cer)$$0)) {
         return false;
      } else {
         return $$0 instanceof bzh && ((bzh)$$0).gt() ? false : !($$0 instanceof bmq) || !((bmq)$$0).u();
      }
   }

   @Override
   public boolean a(cer $$0) {
      return !this.aa_() && super.a($$0);
   }

   @Override
   public elb cJ() {
      return new elb(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(blj<byl> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$1.a_($$3.d()).a(arr.bX) && a($$1, $$3);
   }

   class a<T extends blv> extends bry<T> {
      private final byl j;

      public a(byl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof bzk ? !this.j.u() && this.a((bzk)this.b) : false;
      }

      private boolean a(bzk $$0) {
         return $$0.go() >= byl.this.ag.a(5);
      }

      @Override
      public void c() {
         byl.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         byl.this.h(null);
         super.e();
      }
   }

   class b extends btk {
      public b(double $$0) {
         super(byl.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dB() || this.b.bN();
      }
   }
}
