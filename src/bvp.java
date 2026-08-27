import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvp extends bjw implements bji {
   private static final aec<Boolean> bX = aef.a(bvp.class, aee.k);
   private static final aec<Integer> bY = aef.a(bvp.class, aee.b);
   private static final aec<Integer> bZ = aef.a(bvp.class, aee.b);
   public static final Predicate<bjb> bW = $$0 -> {
      bip<?> $$1 = $$0.ag();
      return $$1 == bip.aF || $$1 == bip.aC || $$1 == bip.N;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bge ci = asp.a(20, 39);
   @Nullable
   private UUID cj;

   public bvp(bip<? extends bvp> $$0, cpq $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(eas.f, -1.0F);
      this.a(eas.g, -1.0F);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpq(this));
      this.bO.a(1, new bvp.b(1.5));
      this.bO.a(2, new brb(this));
      this.bO.a(3, new bvp.a<>(this, bwo.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new bqc(this, 0.4F));
      this.bO.a(5, new bqg(this, 1.0, true));
      this.bO.a(6, new bpu(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new bpi(this, 1.0));
      this.bO.a(8, new brj(this, 1.0));
      this.bO.a(9, new bpe(this, 8.0F));
      this.bO.a(10, new bqe(this, cbp.class, 8.0F));
      this.bO.a(10, new bqr(this));
      this.bP.a(1, new brt(this));
      this.bP.a(2, new bru(this));
      this.bP.a(3, new bro(this).a());
      this.bP.a(4, new brp<>(this, cbp.class, 10, true, false, this::a_));
      this.bP.a(5, new brs<>(this, bum.class, false, bW));
      this.bP.a(6, new brs<>(this, bvn.class, false, bvn.bU));
      this.bP.a(7, new brp<>(this, bym.class, false));
      this.bP.a(8, new brv<>(this, true));
   }

   public static bkg.a gg() {
      return bjd.x().a(bkh.d, 0.3F).a(bkh.a, 8.0).a(bkh.f, 2.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, false);
      this.an.a(bY, cho.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.AA, 0.15F, 1.0F);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gj().a());
      this.c($$0);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(cho.a($$0.h("CollarColor")));
      }

      this.a(this.dK(), $$0);
   }

   @Override
   protected aoy r() {
      if (this.S_()) {
         return aoz.Av;
      } else if (this.ag.a(3) == 0) {
         return this.p() && this.et() < 10.0F ? aoz.AB : aoz.Ay;
      } else {
         return aoz.At;
      }
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.Ax;
   }

   @Override
   protected aoy h_() {
      return aoz.Au;
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B && this.ce && !this.cf && !this.fW() && this.aA()) {
         this.cf = true;
         this.cg = 0.0F;
         this.ch = 0.0F;
         this.dK().a(this, (byte)8);
      }

      if (!this.dK().B) {
         this.a((akn)this.dK(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bv()) {
         this.cd = this.cc;
         if (this.gk()) {
            this.cc = this.cc + (1.0F - this.cc) * 0.4F;
         } else {
            this.cc = this.cc + (0.0F - this.cc) * 0.4F;
         }

         if (this.aZ()) {
            this.ce = true;
            if (this.cf && !this.dK().B) {
               this.dK().a(this, (byte)56);
               this.gl();
            }
         } else if ((this.ce || this.cf) && this.cf) {
            if (this.cg == 0.0F) {
               this.a(aoz.Az, this.eU(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(djo.u);
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
               float $$0 = (float)this.dr();
               int $$1 = (int)(ars.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               ehi $$2 = this.dn();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  this.dK().a(ix.ag, this.dp() + (double)$$4, (double)($$0 + 0.8F), this.dv() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gl() {
      this.cf = false;
      this.cg = 0.0F;
      this.ch = 0.0F;
   }

   @Override
   public void a(bhj $$0) {
      this.ce = false;
      this.cf = false;
      this.ch = 0.0F;
      this.cg = 0.0F;
      super.a($$0);
   }

   public boolean gh() {
      return this.ce;
   }

   public float E(float $$0) {
      return Math.min(0.5F + ars.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (ars.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return ars.a($$2 * (float) Math.PI) * ars.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return ars.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int W() {
      return this.t() ? 20 : super.W();
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         bil $$2 = $$0.d();
         if (!this.dK().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cbp) && !($$2 instanceof cbv)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(bil $$0) {
      boolean $$1 = $$0.a(this.dL().b((bjb)this), (float)((int)this.b(bkh.f)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bkh.a).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bkh.a).a(8.0);
      }

      this.a(bkh.f).a(4.0);
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      civ $$3 = $$2.d();
      if (this.dK().B) {
         boolean $$4 = this.j($$0) || this.p() || $$2.a(cjd.qL) && !this.p() && !this.S_();
         return $$4 ? bgt.b : bgt.d;
      } else if (this.p()) {
         if (this.m($$2) && this.et() < this.eK()) {
            if (!$$0.fR().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bgt.a;
         } else {
            if ($$3 instanceof chp $$5 && this.j($$0)) {
               cho $$6 = $$5.d();
               if ($$6 != this.gj()) {
                  this.a($$6);
                  if (!$$0.fR().d) {
                     $$2.h(1);
                  }

                  return bgt.a;
               }

               return super.b($$0, $$1);
            }

            bgt $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.i_()) && this.j($$0)) {
               this.z(!this.ga());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bgt.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(cjd.qL) && !this.S_()) {
         if (!$$0.fR().d) {
            $$2.h(1);
         }

         if (this.ag.a(3) == 0) {
            this.f($$0);
            this.bN.n();
            this.h(null);
            this.z(true);
            this.dK().a(this, (byte)7);
         } else {
            this.dK().a(this, (byte)6);
         }

         return bgt.a;
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
         this.gl();
      } else {
         super.b($$0);
      }
   }

   public float gi() {
      if (this.S_()) {
         return 1.5393804F;
      } else {
         return this.p() ? (0.55F - (this.eK() - this.et()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean m(cja $$0) {
      civ $$1 = $$0.d();
      return $$1.u() && $$1.v().c();
   }

   @Override
   public int Z() {
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

   public cho gj() {
      return cho.a(this.an.b(bY));
   }

   public void a(cho $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public bvp b(akn $$0, big $$1) {
      bvp $$2 = bip.bn.a((cpq)$$0);
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
   public boolean a(bum $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.p()) {
         return false;
      } else if (!($$0 instanceof bvp $$1)) {
         return false;
      } else if (!$$1.p()) {
         return false;
      } else {
         return $$1.t() ? false : this.ge() && $$1.ge();
      }
   }

   public boolean gk() {
      return this.an.b(bX);
   }

   @Override
   public boolean a(bjb $$0, bjb $$1) {
      if ($$0 instanceof byp || $$0 instanceof byx) {
         return false;
      } else if ($$0 instanceof bvp $$2) {
         return !$$2.p() || $$2.I_() != $$1;
      } else if ($$0 instanceof cbp && $$1 instanceof cbp && !((cbp)$$1).a((cbp)$$0)) {
         return false;
      } else {
         return $$0 instanceof bwl && ((bwl)$$0).gp() ? false : !($$0 instanceof bjw) || !((bjw)$$0).p();
      }
   }

   @Override
   public boolean a(cbp $$0) {
      return !this.S_() && super.a($$0);
   }

   @Override
   public ehi cI() {
      return new ehi(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(bip<bvp> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.a_($$3.d()).a(apo.bX) && a($$1, $$3);
   }

   class a<T extends bjb> extends bpd<T> {
      private final bvp j;

      public a(bvp $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof bwo ? !this.j.p() && this.a((bwo)this.b) : false;
      }

      private boolean a(bwo $$0) {
         return $$0.gk() >= bvp.this.ag.a(5);
      }

      @Override
      public void c() {
         bvp.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bvp.this.h(null);
         super.e();
      }
   }

   class b extends bqp {
      public b(double $$0) {
         super(bvp.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dz() || this.b.bM();
      }
   }
}
