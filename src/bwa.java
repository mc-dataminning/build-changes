import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwa extends bkh implements bjt {
   private static final aef<Boolean> bX = aei.a(bwa.class, aeh.k);
   private static final aef<Integer> bY = aei.a(bwa.class, aeh.b);
   private static final aef<Integer> bZ = aei.a(bwa.class, aeh.b);
   public static final Predicate<bjm> bW = $$0 -> {
      bja<?> $$1 = $$0.ag();
      return $$1 == bja.aF || $$1 == bja.aC || $$1 == bja.N;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bgp ci = asz.a(20, 39);
   @Nullable
   private UUID cj;

   public bwa(bja<? extends bwa> $$0, cqb $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(ear.f, -1.0F);
      this.a(ear.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqb(this));
      this.bO.a(1, new bwa.b(1.5));
      this.bO.a(2, new brm(this));
      this.bO.a(3, new bwa.a<>(this, bwz.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new bqn(this, 0.4F));
      this.bO.a(5, new bqr(this, 1.0, true));
      this.bO.a(6, new bqf(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new bpt(this, 1.0));
      this.bO.a(8, new bru(this, 1.0));
      this.bO.a(9, new bpp(this, 8.0F));
      this.bO.a(10, new bqp(this, cca.class, 8.0F));
      this.bO.a(10, new brc(this));
      this.bP.a(1, new bse(this));
      this.bP.a(2, new bsf(this));
      this.bP.a(3, new brz(this).a());
      this.bP.a(4, new bsa<>(this, cca.class, 10, true, false, this::a_));
      this.bP.a(5, new bsd<>(this, bux.class, false, bW));
      this.bP.a(6, new bsd<>(this, bvy.class, false, bvy.bU));
      this.bP.a(7, new bsa<>(this, byx.class, false));
      this.bP.a(8, new bsg<>(this, true));
   }

   public static bkr.a gk() {
      return bjo.A().a(bks.m, 0.3F).a(bks.l, 8.0).a(bks.c, 2.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, false);
      this.an.a(bY, chz.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.AA, 0.15F, 1.0F);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gn().a());
      this.c($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(chz.a($$0.h("CollarColor")));
      }

      this.a(this.dL(), $$0);
   }

   @Override
   protected apf w() {
      if (this.X_()) {
         return apg.Av;
      } else if (this.ag.a(3) == 0) {
         return this.s() && this.eu() < 10.0F ? apg.AB : apg.Ay;
      } else {
         return apg.At;
      }
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.Ax;
   }

   @Override
   protected apf l_() {
      return apg.Au;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B && this.ce && !this.cf && !this.ga() && this.aA()) {
         this.cf = true;
         this.cg = 0.0F;
         this.ch = 0.0F;
         this.dL().a(this, (byte)8);
      }

      if (!this.dL().B) {
         this.a((akt)this.dL(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bv()) {
         this.cd = this.cc;
         if (this.go()) {
            this.cc = this.cc + (1.0F - this.cc) * 0.4F;
         } else {
            this.cc = this.cc + (0.0F - this.cc) * 0.4F;
         }

         if (this.aZ()) {
            this.ce = true;
            if (this.cf && !this.dL().B) {
               this.dL().a(this, (byte)56);
               this.gp();
            }
         } else if ((this.ce || this.cf) && this.cf) {
            if (this.cg == 0.0F) {
               this.a(apg.Az, this.eV(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(djn.u);
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
               float $$0 = (float)this.ds();
               int $$1 = (int)(asb.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               ehh $$2 = this.do();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  this.dL().a(iv.ag, this.dq() + (double)$$4, (double)($$0 + 0.8F), this.dw() + (double)$$5, $$2.c, $$2.d, $$2.e);
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
   public void a(bhu $$0) {
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
      return Math.min(0.5F + asb.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (asb.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return asb.a($$2 * (float) Math.PI) * asb.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return asb.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int Y() {
      return this.y() ? 20 : super.Y();
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         biw $$2 = $$0.d();
         if (!this.dL().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cca) && !($$2 instanceof ccg)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(biw $$0) {
      boolean $$1 = $$0.a(this.dM().b((bjm)this), (float)((int)this.b(bks.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bks.l).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bks.l).a(8.0);
      }

      this.a(bks.c).a(4.0);
   }

   @Override
   public bhe b(cca $$0, bhd $$1) {
      cjl $$2 = $$0.b($$1);
      cjg $$3 = $$2.d();
      if (this.dL().B) {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cjo.qL) && !this.s() && !this.X_();
         return $$4 ? bhe.b : bhe.d;
      } else if (this.s()) {
         if (this.m($$2) && this.eu() < this.eL()) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bhe.a;
         } else {
            if ($$3 instanceof cia $$5 && this.j($$0)) {
               chz $$6 = $$5.d();
               if ($$6 != this.gn()) {
                  this.a($$6);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  return bhe.a;
               }

               return super.b($$0, $$1);
            }

            bhe $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.m_()) && this.j($$0)) {
               this.z(!this.ge());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bhe.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(cjo.qL) && !this.X_()) {
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         if (this.ag.a(3) == 0) {
            this.f($$0);
            this.bN.n();
            this.h(null);
            this.z(true);
            this.dL().a(this, (byte)7);
         } else {
            this.dL().a(this, (byte)6);
         }

         return bhe.a;
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
      if (this.X_()) {
         return 1.5393804F;
      } else {
         return this.s() ? (0.55F - (this.eL() - this.eu()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean m(cjl $$0) {
      cjg $$1 = $$0.d();
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

   public chz gn() {
      return chz.a(this.an.b(bY));
   }

   public void a(chz $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public bwa b(akt $$0, bir $$1) {
      bwa $$2 = bja.bn.a((cqb)$$0);
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
   public boolean a(bux $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof bwa $$1)) {
         return false;
      } else if (!$$1.s()) {
         return false;
      } else {
         return $$1.y() ? false : this.gi() && $$1.gi();
      }
   }

   public boolean go() {
      return this.an.b(bX);
   }

   @Override
   public boolean a(bjm $$0, bjm $$1) {
      if ($$0 instanceof bza || $$0 instanceof bzi) {
         return false;
      } else if ($$0 instanceof bwa $$2) {
         return !$$2.s() || $$2.O_() != $$1;
      } else if ($$0 instanceof cca && $$1 instanceof cca && !((cca)$$1).a((cca)$$0)) {
         return false;
      } else {
         return $$0 instanceof bww && ((bww)$$0).gt() ? false : !($$0 instanceof bkh) || !((bkh)$$0).s();
      }
   }

   @Override
   public boolean a(cca $$0) {
      return !this.X_() && super.a($$0);
   }

   @Override
   public ehh cI() {
      return new ehh(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(bja<bwa> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      return $$1.a_($$3.d()).a(apv.bX) && a($$1, $$3);
   }

   class a<T extends bjm> extends bpo<T> {
      private final bwa j;

      public a(bwa $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof bwz ? !this.j.s() && this.a((bwz)this.b) : false;
      }

      private boolean a(bwz $$0) {
         return $$0.go() >= bwa.this.ag.a(5);
      }

      @Override
      public void c() {
         bwa.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bwa.this.h(null);
         super.e();
      }
   }

   class b extends bra {
      public b(double $$0) {
         super(bwa.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dA() || this.b.bM();
      }
   }
}
