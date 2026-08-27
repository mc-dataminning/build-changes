import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byv extends bna implements bmm {
   private static final agj<Boolean> bX = agm.a(byv.class, agl.k);
   private static final agj<Integer> bY = agm.a(byv.class, agl.b);
   private static final agj<Integer> bZ = agm.a(byv.class, agl.b);
   public static final Predicate<bmf> bW = $$0 -> {
      blt<?> $$1 = $$0.ai();
      return $$1 == blt.aG || $$1 == blt.aD || $$1 == blt.O;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bjg ci = avj.a(20, 39);
   @Nullable
   private UUID cj;

   public byv(blt<? extends byv> $$0, cti $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(eev.f, -1.0F);
      this.a(eev.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsv(this));
      this.bO.a(1, new byv.b(1.5));
      this.bO.a(2, new bug(this));
      this.bO.a(3, new byv.a<>(this, bzu.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new bth(this, 0.4F));
      this.bO.a(5, new btl(this, 1.0, true));
      this.bO.a(6, new bsz(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new bsn(this, 1.0));
      this.bO.a(8, new buo(this, 1.0));
      this.bO.a(9, new bsj(this, 8.0F));
      this.bO.a(10, new btj(this, cfb.class, 8.0F));
      this.bO.a(10, new btw(this));
      this.bP.a(1, new buy(this));
      this.bP.a(2, new buz(this));
      this.bP.a(3, new but(this).a());
      this.bP.a(4, new buu<>(this, cfb.class, 10, true, false, this::a_));
      this.bP.a(5, new bux<>(this, bxs.class, false, bW));
      this.bP.a(6, new bux<>(this, byt.class, false, byt.bU));
      this.bP.a(7, new buu<>(this, cbs.class, false));
      this.bP.a(8, new bva<>(this, true));
   }

   public static bnk.a gk() {
      return bmh.C().a(bnl.m, 0.3F).a(bnl.l, 8.0).a(bnl.c, 2.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, false);
      this.an.a(bY, clf.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.BC, 0.15F, 1.0F);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gn().a());
      this.c($$0);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(clf.a($$0.h("CollarColor")));
      }

      this.a(this.dM(), $$0);
   }

   @Override
   protected arl y() {
      if (this.aa_()) {
         return arm.Bx;
      } else if (this.ag.a(3) == 0) {
         return this.u() && this.ev() < 10.0F ? arm.BD : arm.BA;
      } else {
         return arm.Bv;
      }
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.Bz;
   }

   @Override
   protected arl n_() {
      return arm.Bw;
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
         this.a((amz)this.dM(), true);
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
               this.a(arm.BB, this.eW(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(dnk.u);
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
               int $$1 = (int)(aui.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               elm $$2 = this.dp();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.dg() * 0.5F;
                  this.dM().a(jx.aj, this.dr() + (double)$$4, (double)($$0 + 0.8F), this.dx() + (double)$$5, $$2.c, $$2.d, $$2.e);
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
   public void a(bkn $$0) {
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
      return Math.min(0.5F + aui.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (aui.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return aui.a($$2 * (float) Math.PI) * aui.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return aui.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int aa() {
      return this.A() ? 20 : super.aa();
   }

   @Override
   public boolean a(bkn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         blp $$2 = $$0.d();
         if (!this.dM().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cfb) && !($$2 instanceof cfh)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(blp $$0) {
      boolean $$1 = $$0.a(this.dN().b((bmf)this), (float)((int)this.b(bnl.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bnl.l).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bnl.l).a(8.0);
      }

      this.a(bnl.c).a(4.0);
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      cmm $$3 = $$2.d();
      if (this.dM().B) {
         boolean $$4 = this.j($$0) || this.u() || $$2.a(cmu.rw) && !this.u() && !this.aa_();
         return $$4 ? bjv.b : bjv.d;
      } else if (this.u()) {
         if (this.m($$2) && this.ev() < this.eM()) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bjv.a;
         } else {
            if ($$3 instanceof clg $$5 && this.j($$0)) {
               clf $$6 = $$5.d();
               if ($$6 != this.gn()) {
                  this.a($$6);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  return bjv.a;
               }

               return super.b($$0, $$1);
            }

            bjv $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.o_()) && this.j($$0)) {
               this.z(!this.ge());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bjv.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(cmu.rw) && !this.aa_()) {
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

         return bjv.a;
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
   public boolean m(cmr $$0) {
      cmm $$1 = $$0.d();
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

   public clf gn() {
      return clf.a(this.an.b(bY));
   }

   public void a(clf $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public byv b(amz $$0, blk $$1) {
      byv $$2 = blt.bp.a((cti)$$0);
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
   public boolean a(bxs $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.u()) {
         return false;
      } else if (!($$0 instanceof byv $$1)) {
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
   public boolean a(bmf $$0, bmf $$1) {
      if ($$0 instanceof cbv || $$0 instanceof ccd) {
         return false;
      } else if ($$0 instanceof byv $$2) {
         return !$$2.u() || $$2.R_() != $$1;
      } else if ($$0 instanceof cfb && $$1 instanceof cfb && !((cfb)$$1).a((cfb)$$0)) {
         return false;
      } else {
         return $$0 instanceof bzr && ((bzr)$$0).gt() ? false : !($$0 instanceof bna) || !((bna)$$0).u();
      }
   }

   @Override
   public boolean a(cfb $$0) {
      return !this.aa_() && super.a($$0);
   }

   @Override
   public elm cJ() {
      return new elm(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(blt<byv> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$1.a_($$3.d()).a(asb.bX) && a($$1, $$3);
   }

   class a<T extends bmf> extends bsi<T> {
      private final byv j;

      public a(byv $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof bzu ? !this.j.u() && this.a((bzu)this.b) : false;
      }

      private boolean a(bzu $$0) {
         return $$0.go() >= byv.this.ag.a(5);
      }

      @Override
      public void c() {
         byv.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         byv.this.h(null);
         super.e();
      }
   }

   class b extends btu {
      public b(double $$0) {
         super(byv.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dB() || this.b.bN();
      }
   }
}
