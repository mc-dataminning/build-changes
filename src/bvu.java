import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvu extends bkb implements bjn {
   private static final aee<Boolean> bX = aeh.a(bvu.class, aeg.k);
   private static final aee<Integer> bY = aeh.a(bvu.class, aeg.b);
   private static final aee<Integer> bZ = aeh.a(bvu.class, aeg.b);
   public static final Predicate<bjg> bW = $$0 -> {
      biu<?> $$1 = $$0.ag();
      return $$1 == biu.aF || $$1 == biu.aC || $$1 == biu.N;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bgj ci = asu.a(20, 39);
   @Nullable
   private UUID cj;

   public bvu(biu<? extends bvu> $$0, cpv $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(eax.f, -1.0F);
      this.a(eax.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bpv(this));
      this.bO.a(1, new bvu.b(1.5));
      this.bO.a(2, new brg(this));
      this.bO.a(3, new bvu.a<>(this, bwt.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new bqh(this, 0.4F));
      this.bO.a(5, new bql(this, 1.0, true));
      this.bO.a(6, new bpz(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new bpn(this, 1.0));
      this.bO.a(8, new bro(this, 1.0));
      this.bO.a(9, new bpj(this, 8.0F));
      this.bO.a(10, new bqj(this, cbu.class, 8.0F));
      this.bO.a(10, new bqw(this));
      this.bP.a(1, new bry(this));
      this.bP.a(2, new brz(this));
      this.bP.a(3, new brt(this).a());
      this.bP.a(4, new bru<>(this, cbu.class, 10, true, false, this::a_));
      this.bP.a(5, new brx<>(this, bur.class, false, bW));
      this.bP.a(6, new brx<>(this, bvs.class, false, bvs.bU));
      this.bP.a(7, new bru<>(this, byr.class, false));
      this.bP.a(8, new bsa<>(this, true));
   }

   public static bkl.a gj() {
      return bji.A().a(bkm.d, 0.3F).a(bkm.a, 8.0).a(bkm.f, 2.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, false);
      this.an.a(bY, cht.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(apd.AA, 0.15F, 1.0F);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gm().a());
      this.c($$0);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(cht.a($$0.h("CollarColor")));
      }

      this.a(this.dL(), $$0);
   }

   @Override
   protected apc w() {
      if (this.X_()) {
         return apd.Av;
      } else if (this.ag.a(3) == 0) {
         return this.s() && this.eu() < 10.0F ? apd.AB : apd.Ay;
      } else {
         return apd.At;
      }
   }

   @Override
   protected apc d(bho $$0) {
      return apd.Ax;
   }

   @Override
   protected apc l_() {
      return apd.Au;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dL().B && this.ce && !this.cf && !this.fZ() && this.aA()) {
         this.cf = true;
         this.cg = 0.0F;
         this.ch = 0.0F;
         this.dL().a(this, (byte)8);
      }

      if (!this.dL().B) {
         this.a((akq)this.dL(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bv()) {
         this.cd = this.cc;
         if (this.gn()) {
            this.cc = this.cc + (1.0F - this.cc) * 0.4F;
         } else {
            this.cc = this.cc + (0.0F - this.cc) * 0.4F;
         }

         if (this.aZ()) {
            this.ce = true;
            if (this.cf && !this.dL().B) {
               this.dL().a(this, (byte)56);
               this.go();
            }
         } else if ((this.ce || this.cf) && this.cf) {
            if (this.cg == 0.0F) {
               this.a(apd.Az, this.eV(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(djt.u);
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
               int $$1 = (int)(arw.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               ehn $$2 = this.do();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  this.dL().a(iv.ag, this.dq() + (double)$$4, (double)($$0 + 0.8F), this.dw() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void go() {
      this.cf = false;
      this.cg = 0.0F;
      this.ch = 0.0F;
   }

   @Override
   public void a(bho $$0) {
      this.ce = false;
      this.cf = false;
      this.ch = 0.0F;
      this.cg = 0.0F;
      super.a($$0);
   }

   public boolean gk() {
      return this.ce;
   }

   public float E(float $$0) {
      return Math.min(0.5F + arw.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (arw.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return arw.a($$2 * (float) Math.PI) * arw.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return arw.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int Y() {
      return this.y() ? 20 : super.Y();
   }

   @Override
   public boolean a(bho $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         biq $$2 = $$0.d();
         if (!this.dL().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cbu) && !($$2 instanceof cca)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(biq $$0) {
      boolean $$1 = $$0.a(this.dM().b((bjg)this), (float)((int)this.b(bkm.f)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bkm.a).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bkm.a).a(8.0);
      }

      this.a(bkm.f).a(4.0);
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      cja $$3 = $$2.d();
      if (this.dL().B) {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cji.qL) && !this.s() && !this.X_();
         return $$4 ? bgy.b : bgy.d;
      } else if (this.s()) {
         if (this.m($$2) && this.eu() < this.eL()) {
            if (!$$0.fS().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bgy.a;
         } else {
            if ($$3 instanceof chu $$5 && this.j($$0)) {
               cht $$6 = $$5.d();
               if ($$6 != this.gm()) {
                  this.a($$6);
                  if (!$$0.fS().d) {
                     $$2.h(1);
                  }

                  return bgy.a;
               }

               return super.b($$0, $$1);
            }

            bgy $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.m_()) && this.j($$0)) {
               this.z(!this.gd());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bgy.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(cji.qL) && !this.X_()) {
         if (!$$0.fS().d) {
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

         return bgy.a;
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
         this.go();
      } else {
         super.b($$0);
      }
   }

   public float gl() {
      if (this.X_()) {
         return 1.5393804F;
      } else {
         return this.s() ? (0.55F - (this.eL() - this.eu()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean m(cjf $$0) {
      cja $$1 = $$0.d();
      return $$1.u() && $$1.v().c();
   }

   @Override
   public int fH() {
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

   public cht gm() {
      return cht.a(this.an.b(bY));
   }

   public void a(cht $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public bvu b(akq $$0, bil $$1) {
      bvu $$2 = biu.bn.a((cpv)$$0);
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
   public boolean a(bur $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof bvu $$1)) {
         return false;
      } else if (!$$1.s()) {
         return false;
      } else {
         return $$1.y() ? false : this.gh() && $$1.gh();
      }
   }

   public boolean gn() {
      return this.an.b(bX);
   }

   @Override
   public boolean a(bjg $$0, bjg $$1) {
      if ($$0 instanceof byu || $$0 instanceof bzc) {
         return false;
      } else if ($$0 instanceof bvu $$2) {
         return !$$2.s() || $$2.O_() != $$1;
      } else if ($$0 instanceof cbu && $$1 instanceof cbu && !((cbu)$$1).a((cbu)$$0)) {
         return false;
      } else {
         return $$0 instanceof bwq && ((bwq)$$0).gs() ? false : !($$0 instanceof bkb) || !((bkb)$$0).s();
      }
   }

   @Override
   public boolean a(cbu $$0) {
      return !this.X_() && super.a($$0);
   }

   @Override
   public ehn cI() {
      return new ehn(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(biu<bvu> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.a_($$3.d()).a(aps.bX) && a($$1, $$3);
   }

   class a<T extends bjg> extends bpi<T> {
      private final bvu j;

      public a(bvu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof bwt ? !this.j.s() && this.a((bwt)this.b) : false;
      }

      private boolean a(bwt $$0) {
         return $$0.gn() >= bvu.this.ag.a(5);
      }

      @Override
      public void c() {
         bvu.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bvu.this.h(null);
         super.e();
      }
   }

   class b extends bqu {
      public b(double $$0) {
         super(bvu.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dA() || this.b.bM();
      }
   }
}
