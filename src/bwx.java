import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwx extends ble implements bkq {
   private static final afc<Boolean> bX = aff.a(bwx.class, afe.k);
   private static final afc<Integer> bY = aff.a(bwx.class, afe.b);
   private static final afc<Integer> bZ = aff.a(bwx.class, afe.b);
   public static final Predicate<bkj> bW = $$0 -> {
      bjx<?> $$1 = $$0.ag();
      return $$1 == bjx.aF || $$1 == bjx.aC || $$1 == bjx.N;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bhm ci = atw.a(20, 39);
   @Nullable
   private UUID cj;

   public bwx(bjx<? extends bwx> $$0, cqz $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(ebp.f, -1.0F);
      this.a(ebp.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqy(this));
      this.bO.a(1, new bwx.b(1.5));
      this.bO.a(2, new bsj(this));
      this.bO.a(3, new bwx.a<>(this, bxw.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new brk(this, 0.4F));
      this.bO.a(5, new bro(this, 1.0, true));
      this.bO.a(6, new brc(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new bqq(this, 1.0));
      this.bO.a(8, new bsr(this, 1.0));
      this.bO.a(9, new bqm(this, 8.0F));
      this.bO.a(10, new brm(this, ccx.class, 8.0F));
      this.bO.a(10, new brz(this));
      this.bP.a(1, new btb(this));
      this.bP.a(2, new btc(this));
      this.bP.a(3, new bsw(this).a());
      this.bP.a(4, new bsx<>(this, ccx.class, 10, true, false, this::a_));
      this.bP.a(5, new bta<>(this, bvu.class, false, bW));
      this.bP.a(6, new bta<>(this, bwv.class, false, bwv.bU));
      this.bP.a(7, new bsx<>(this, bzu.class, false));
      this.bP.a(8, new btd<>(this, true));
   }

   public static blo.a gk() {
      return bkl.A().a(blp.m, 0.3F).a(blp.l, 8.0).a(blp.c, 2.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bX, false);
      this.an.a(bY, cix.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.AD, 0.15F, 1.0F);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gn().a());
      this.c($$0);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(cix.a($$0.h("CollarColor")));
      }

      this.a(this.dL(), $$0);
   }

   @Override
   protected aqc w() {
      if (this.Y_()) {
         return aqd.Ay;
      } else if (this.ag.a(3) == 0) {
         return this.s() && this.eu() < 10.0F ? aqd.AE : aqd.AB;
      } else {
         return aqd.Aw;
      }
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.AA;
   }

   @Override
   protected aqc m_() {
      return aqd.Ax;
   }

   @Override
   protected float eV() {
      return 0.4F;
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dL().B && this.ce && !this.cf && !this.ga() && this.aA()) {
         this.cf = true;
         this.cg = 0.0F;
         this.ch = 0.0F;
         this.dL().a(this, (byte)8);
      }

      if (!this.dL().B) {
         this.a((alq)this.dL(), true);
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
               this.a(aqd.AC, this.eV(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(dkl.u);
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
               int $$1 = (int)(asy.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               eif $$2 = this.do();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  this.dL().a(js.ag, this.dq() + (double)$$4, (double)($$0 + 0.8F), this.dw() + (double)$$5, $$2.c, $$2.d, $$2.e);
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
   public void a(bir $$0) {
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
      return Math.min(0.5F + asy.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (asy.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return asy.a($$2 * (float) Math.PI) * asy.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return asy.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int Y() {
      return this.y() ? 20 : super.Y();
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         bjt $$2 = $$0.d();
         if (!this.dL().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof ccx) && !($$2 instanceof cdd)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(bjt $$0) {
      boolean $$1 = $$0.a(this.dM().b((bkj)this), (float)((int)this.b(blp.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(blp.l).a(20.0);
         this.c(20.0F);
      } else {
         this.a(blp.l).a(8.0);
      }

      this.a(blp.c).a(4.0);
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      cke $$3 = $$2.d();
      if (this.dL().B) {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(ckm.qL) && !this.s() && !this.Y_();
         return $$4 ? bib.b : bib.d;
      } else if (this.s()) {
         if (this.m($$2) && this.eu() < this.eL()) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bib.a;
         } else {
            if ($$3 instanceof ciy $$5 && this.j($$0)) {
               cix $$6 = $$5.d();
               if ($$6 != this.gn()) {
                  this.a($$6);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  return bib.a;
               }

               return super.b($$0, $$1);
            }

            bib $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.n_()) && this.j($$0)) {
               this.z(!this.ge());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bib.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(ckm.qL) && !this.Y_()) {
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

         return bib.a;
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
      if (this.Y_()) {
         return 1.5393804F;
      } else {
         return this.s() ? (0.55F - (this.eL() - this.eu()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean m(ckj $$0) {
      cke $$1 = $$0.d();
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

   public cix gn() {
      return cix.a(this.an.b(bY));
   }

   public void a(cix $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public bwx b(alq $$0, bjo $$1) {
      bwx $$2 = bjx.bn.a((cqz)$$0);
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
   public boolean a(bvu $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof bwx $$1)) {
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
   public boolean a(bkj $$0, bkj $$1) {
      if ($$0 instanceof bzx || $$0 instanceof caf) {
         return false;
      } else if ($$0 instanceof bwx $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else if ($$0 instanceof ccx && $$1 instanceof ccx && !((ccx)$$1).a((ccx)$$0)) {
         return false;
      } else {
         return $$0 instanceof bxt && ((bxt)$$0).gt() ? false : !($$0 instanceof ble) || !((ble)$$0).s();
      }
   }

   @Override
   public boolean a(ccx $$0) {
      return !this.Y_() && super.a($$0);
   }

   @Override
   public eif cI() {
      return new eif(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(bjx<bwx> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$1.a_($$3.d()).a(aqs.bX) && a($$1, $$3);
   }

   class a<T extends bkj> extends bql<T> {
      private final bwx j;

      public a(bwx $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof bxw ? !this.j.s() && this.a((bxw)this.b) : false;
      }

      private boolean a(bxw $$0) {
         return $$0.go() >= bwx.this.ag.a(5);
      }

      @Override
      public void c() {
         bwx.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bwx.this.h(null);
         super.e();
      }
   }

   class b extends brx {
      public b(double $$0) {
         super(bwx.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dA() || this.b.bM();
      }
   }
}
