import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvw extends bkd implements bjp {
   private static final aeg<Boolean> bX = aej.a(bvw.class, aei.k);
   private static final aeg<Integer> bY = aej.a(bvw.class, aei.b);
   private static final aeg<Integer> bZ = aej.a(bvw.class, aei.b);
   public static final Predicate<bji> bW = $$0 -> {
      biw<?> $$1 = $$0.ag();
      return $$1 == biw.aF || $$1 == biw.aC || $$1 == biw.N;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bgl ci = asw.a(20, 39);
   @Nullable
   private UUID cj;

   public bvw(biw<? extends bvw> $$0, cpx $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(eaz.f, -1.0F);
      this.a(eaz.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bpx(this));
      this.bO.a(1, new bvw.b(1.5));
      this.bO.a(2, new bri(this));
      this.bO.a(3, new bvw.a<>(this, bwv.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new bqj(this, 0.4F));
      this.bO.a(5, new bqn(this, 1.0, true));
      this.bO.a(6, new bqb(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new bpp(this, 1.0));
      this.bO.a(8, new brq(this, 1.0));
      this.bO.a(9, new bpl(this, 8.0F));
      this.bO.a(10, new bql(this, cbw.class, 8.0F));
      this.bO.a(10, new bqy(this));
      this.bP.a(1, new bsa(this));
      this.bP.a(2, new bsb(this));
      this.bP.a(3, new brv(this).a());
      this.bP.a(4, new brw<>(this, cbw.class, 10, true, false, this::a_));
      this.bP.a(5, new brz<>(this, but.class, false, bW));
      this.bP.a(6, new brz<>(this, bvu.class, false, bvu.bU));
      this.bP.a(7, new brw<>(this, byt.class, false));
      this.bP.a(8, new bsc<>(this, true));
   }

   public static bkn.a gj() {
      return bjk.A().a(bko.d, 0.3F).a(bko.a, 8.0).a(bko.f, 2.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, false);
      this.an.a(bY, chv.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.AA, 0.15F, 1.0F);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gm().a());
      this.c($$0);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(chv.a($$0.h("CollarColor")));
      }

      this.a(this.dL(), $$0);
   }

   @Override
   protected ape w() {
      if (this.X_()) {
         return apf.Av;
      } else if (this.ag.a(3) == 0) {
         return this.s() && this.eu() < 10.0F ? apf.AB : apf.Ay;
      } else {
         return apf.At;
      }
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.Ax;
   }

   @Override
   protected ape l_() {
      return apf.Au;
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
         this.a((aks)this.dL(), true);
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
               this.a(apf.Az, this.eV(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(djv.u);
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
               int $$1 = (int)(ary.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               ehp $$2 = this.do();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  this.dL().a(ix.ag, this.dq() + (double)$$4, (double)($$0 + 0.8F), this.dw() + (double)$$5, $$2.c, $$2.d, $$2.e);
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
   public void a(bhq $$0) {
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
      return Math.min(0.5F + ary.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (ary.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ary.a($$2 * (float) Math.PI) * ary.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return ary.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int Y() {
      return this.y() ? 20 : super.Y();
   }

   @Override
   public boolean a(bhq $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         bis $$2 = $$0.d();
         if (!this.dL().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cbw) && !($$2 instanceof ccc)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(bis $$0) {
      boolean $$1 = $$0.a(this.dM().b((bji)this), (float)((int)this.b(bko.f)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bko.a).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bko.a).a(8.0);
      }

      this.a(bko.f).a(4.0);
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      cjc $$3 = $$2.d();
      if (this.dL().B) {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cjk.qL) && !this.s() && !this.X_();
         return $$4 ? bha.b : bha.d;
      } else if (this.s()) {
         if (this.m($$2) && this.eu() < this.eL()) {
            if (!$$0.fS().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bha.a;
         } else {
            if ($$3 instanceof chw $$5 && this.j($$0)) {
               chv $$6 = $$5.d();
               if ($$6 != this.gm()) {
                  this.a($$6);
                  if (!$$0.fS().d) {
                     $$2.h(1);
                  }

                  return bha.a;
               }

               return super.b($$0, $$1);
            }

            bha $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.m_()) && this.j($$0)) {
               this.z(!this.gd());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bha.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(cjk.qL) && !this.X_()) {
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

         return bha.a;
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
   public boolean m(cjh $$0) {
      cjc $$1 = $$0.d();
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

   public chv gm() {
      return chv.a(this.an.b(bY));
   }

   public void a(chv $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public bvw b(aks $$0, bin $$1) {
      bvw $$2 = biw.bn.a((cpx)$$0);
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
   public boolean a(but $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof bvw $$1)) {
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
   public boolean a(bji $$0, bji $$1) {
      if ($$0 instanceof byw || $$0 instanceof bze) {
         return false;
      } else if ($$0 instanceof bvw $$2) {
         return !$$2.s() || $$2.O_() != $$1;
      } else if ($$0 instanceof cbw && $$1 instanceof cbw && !((cbw)$$1).a((cbw)$$0)) {
         return false;
      } else {
         return $$0 instanceof bws && ((bws)$$0).gs() ? false : !($$0 instanceof bkd) || !((bkd)$$0).s();
      }
   }

   @Override
   public boolean a(cbw $$0) {
      return !this.X_() && super.a($$0);
   }

   @Override
   public ehp cI() {
      return new ehp(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(biw<bvw> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$1.a_($$3.d()).a(apu.bX) && a($$1, $$3);
   }

   class a<T extends bji> extends bpk<T> {
      private final bvw j;

      public a(bvw $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof bwv ? !this.j.s() && this.a((bwv)this.b) : false;
      }

      private boolean a(bwv $$0) {
         return $$0.gn() >= bvw.this.ag.a(5);
      }

      @Override
      public void c() {
         bvw.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bvw.this.h(null);
         super.e();
      }
   }

   class b extends bqw {
      public b(double $$0) {
         super(bvw.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dA() || this.b.bM();
      }
   }
}
