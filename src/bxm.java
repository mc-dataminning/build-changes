import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxm extends blt implements blf {
   private static final afm<Boolean> bX = afp.a(bxm.class, afo.k);
   private static final afm<Integer> bY = afp.a(bxm.class, afo.b);
   private static final afm<Integer> bZ = afp.a(bxm.class, afo.b);
   public static final Predicate<bky> bW = $$0 -> {
      bkm<?> $$1 = $$0.ag();
      return $$1 == bkm.aF || $$1 == bkm.aC || $$1 == bkm.N;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bib ci = aug.a(20, 39);
   @Nullable
   private UUID cj;

   public bxm(bkm<? extends bxm> $$0, crs $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(ecr.f, -1.0F);
      this.a(ecr.g, -1.0F);
   }

   @Override
   protected void z() {
      this.bO.a(1, new brn(this));
      this.bO.a(1, new bxm.b(1.5));
      this.bO.a(2, new bsy(this));
      this.bO.a(3, new bxm.a<>(this, byl.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new brz(this, 0.4F));
      this.bO.a(5, new bsd(this, 1.0, true));
      this.bO.a(6, new brr(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new brf(this, 1.0));
      this.bO.a(8, new btg(this, 1.0));
      this.bO.a(9, new brb(this, 8.0F));
      this.bO.a(10, new bsb(this, cdm.class, 8.0F));
      this.bO.a(10, new bso(this));
      this.bP.a(1, new btq(this));
      this.bP.a(2, new btr(this));
      this.bP.a(3, new btl(this).a());
      this.bP.a(4, new btm<>(this, cdm.class, 10, true, false, this::a_));
      this.bP.a(5, new btp<>(this, bwj.class, false, bW));
      this.bP.a(6, new btp<>(this, bxk.class, false, bxk.bU));
      this.bP.a(7, new btm<>(this, caj.class, false));
      this.bP.a(8, new bts<>(this, true));
   }

   public static bmd.a gk() {
      return bla.A().a(bme.m, 0.3F).a(bme.l, 8.0).a(bme.c, 2.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bX, false);
      this.an.a(bY, cjp.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.AF, 0.15F, 1.0F);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gn().a());
      this.c($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(cjp.a($$0.h("CollarColor")));
      }

      this.a(this.dL(), $$0);
   }

   @Override
   protected aqm w() {
      if (this.Y_()) {
         return aqn.AA;
      } else if (this.ag.a(3) == 0) {
         return this.s() && this.eu() < 10.0F ? aqn.AG : aqn.AD;
      } else {
         return aqn.Ay;
      }
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.AC;
   }

   @Override
   protected aqm m_() {
      return aqn.Az;
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
         this.a((ama)this.dL(), true);
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
               this.a(aqn.AE, this.eV(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(dlg.u);
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
               int $$1 = (int)(ati.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               eji $$2 = this.do();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  this.dL().a(js.ah, this.dq() + (double)$$4, (double)($$0 + 0.8F), this.dw() + (double)$$5, $$2.c, $$2.d, $$2.e);
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
   public void a(bjg $$0) {
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
      return Math.min(0.5F + ati.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (ati.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ati.a($$2 * (float) Math.PI) * ati.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return ati.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int Y() {
      return this.y() ? 20 : super.Y();
   }

   @Override
   public boolean a(bjg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         bki $$2 = $$0.d();
         if (!this.dL().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cdm) && !($$2 instanceof cds)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(bki $$0) {
      boolean $$1 = $$0.a(this.dM().b((bky)this), (float)((int)this.b(bme.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bme.l).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bme.l).a(8.0);
      }

      this.a(bme.c).a(4.0);
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      ckw $$3 = $$2.d();
      if (this.dL().B) {
         boolean $$4 = this.j($$0) || this.s() || $$2.a(cle.qL) && !this.s() && !this.Y_();
         return $$4 ? biq.b : biq.d;
      } else if (this.s()) {
         if (this.m($$2) && this.eu() < this.eL()) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return biq.a;
         } else {
            if ($$3 instanceof cjq $$5 && this.j($$0)) {
               cjp $$6 = $$5.d();
               if ($$6 != this.gn()) {
                  this.a($$6);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  return biq.a;
               }

               return super.b($$0, $$1);
            }

            biq $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.n_()) && this.j($$0)) {
               this.z(!this.ge());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return biq.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(cle.qL) && !this.Y_()) {
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

         return biq.a;
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
   public boolean m(clb $$0) {
      ckw $$1 = $$0.d();
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

   public cjp gn() {
      return cjp.a(this.an.b(bY));
   }

   public void a(cjp $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public bxm b(ama $$0, bkd $$1) {
      bxm $$2 = bkm.bn.a((crs)$$0);
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
   public boolean a(bwj $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.s()) {
         return false;
      } else if (!($$0 instanceof bxm $$1)) {
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
   public boolean a(bky $$0, bky $$1) {
      if ($$0 instanceof cam || $$0 instanceof cau) {
         return false;
      } else if ($$0 instanceof bxm $$2) {
         return !$$2.s() || $$2.P_() != $$1;
      } else if ($$0 instanceof cdm && $$1 instanceof cdm && !((cdm)$$1).a((cdm)$$0)) {
         return false;
      } else {
         return $$0 instanceof byi && ((byi)$$0).gt() ? false : !($$0 instanceof blt) || !((blt)$$0).s();
      }
   }

   @Override
   public boolean a(cdm $$0) {
      return !this.Y_() && super.a($$0);
   }

   @Override
   public eji cI() {
      return new eji(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(bkm<bxm> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$1.a_($$3.d()).a(arc.bX) && a($$1, $$3);
   }

   class a<T extends bky> extends bra<T> {
      private final bxm j;

      public a(bxm $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof byl ? !this.j.s() && this.a((byl)this.b) : false;
      }

      private boolean a(byl $$0) {
         return $$0.go() >= bxm.this.ag.a(5);
      }

      @Override
      public void c() {
         bxm.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bxm.this.h(null);
         super.e();
      }
   }

   class b extends bsm {
      public b(double $$0) {
         super(bxm.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dA() || this.b.bM();
      }
   }
}
