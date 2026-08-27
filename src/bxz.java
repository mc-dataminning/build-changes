import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxz extends bmg implements bls {
   private static final afs<Boolean> bX = afv.a(bxz.class, afu.k);
   private static final afs<Integer> bY = afv.a(bxz.class, afu.b);
   private static final afs<Integer> bZ = afv.a(bxz.class, afu.b);
   public static final Predicate<bll> bW = $$0 -> {
      bkz<?> $$1 = $$0.ai();
      return $$1 == bkz.aF || $$1 == bkz.aC || $$1 == bkz.N;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bim ci = aup.a(20, 39);
   @Nullable
   private UUID cj;

   public bxz(bkz<? extends bxz> $$0, csf $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(edi.f, -1.0F);
      this.a(edi.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsa(this));
      this.bO.a(1, new bxz.b(1.5));
      this.bO.a(2, new btl(this));
      this.bO.a(3, new bxz.a<>(this, byy.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new bsm(this, 0.4F));
      this.bO.a(5, new bsq(this, 1.0, true));
      this.bO.a(6, new bse(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new brs(this, 1.0));
      this.bO.a(8, new btt(this, 1.0));
      this.bO.a(9, new bro(this, 8.0F));
      this.bO.a(10, new bso(this, cdz.class, 8.0F));
      this.bO.a(10, new btb(this));
      this.bP.a(1, new bud(this));
      this.bP.a(2, new bue(this));
      this.bP.a(3, new bty(this).a());
      this.bP.a(4, new btz<>(this, cdz.class, 10, true, false, this::a_));
      this.bP.a(5, new buc<>(this, bww.class, false, bW));
      this.bP.a(6, new buc<>(this, bxx.class, false, bxx.bU));
      this.bP.a(7, new btz<>(this, caw.class, false));
      this.bP.a(8, new buf<>(this, true));
   }

   public static bmq.a gl() {
      return bln.C().a(bmr.m, 0.3F).a(bmr.l, 8.0).a(bmr.c, 2.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, false);
      this.an.a(bY, ckc.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.Bg, 0.15F, 1.0F);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.go().a());
      this.c($$0);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(ckc.a($$0.h("CollarColor")));
      }

      this.a(this.dN(), $$0);
   }

   @Override
   protected aqu y() {
      if (this.aa_()) {
         return aqv.Bb;
      } else if (this.ag.a(3) == 0) {
         return this.u() && this.ew() < 10.0F ? aqv.Bh : aqv.Be;
      } else {
         return aqv.AZ;
      }
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.Bd;
   }

   @Override
   protected aqu n_() {
      return aqv.Ba;
   }

   @Override
   protected float eX() {
      return 0.4F;
   }

   @Override
   public void d_() {
      super.d_();
      if (!this.dN().B && this.ce && !this.cf && !this.gb() && this.aC()) {
         this.cf = true;
         this.cg = 0.0F;
         this.ch = 0.0F;
         this.dN().a(this, (byte)8);
      }

      if (!this.dN().B) {
         this.a((ami)this.dN(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bx()) {
         this.cd = this.cc;
         if (this.gp()) {
            this.cc = this.cc + (1.0F - this.cc) * 0.4F;
         } else {
            this.cc = this.cc + (0.0F - this.cc) * 0.4F;
         }

         if (this.bb()) {
            this.ce = true;
            if (this.cf && !this.dN().B) {
               this.dN().a(this, (byte)56);
               this.gq();
            }
         } else if ((this.ce || this.cf) && this.cf) {
            if (this.cg == 0.0F) {
               this.a(aqv.Bf, this.eX(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(dlx.u);
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
               float $$0 = (float)this.du();
               int $$1 = (int)(atq.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               ejz $$2 = this.dq();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.dh() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.dh() * 0.5F;
                  this.dN().a(jw.ah, this.ds() + (double)$$4, (double)($$0 + 0.8F), this.dy() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gq() {
      this.cf = false;
      this.cg = 0.0F;
      this.ch = 0.0F;
   }

   @Override
   public void a(bjt $$0) {
      this.ce = false;
      this.cf = false;
      this.ch = 0.0F;
      this.cg = 0.0F;
      super.a($$0);
   }

   public boolean gm() {
      return this.ce;
   }

   public float E(float $$0) {
      return Math.min(0.5F + atq.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (atq.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return atq.a($$2 * (float) Math.PI) * atq.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return atq.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int aa() {
      return this.A() ? 20 : super.aa();
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         bkv $$2 = $$0.d();
         if (!this.dN().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cdz) && !($$2 instanceof cef)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(bkv $$0) {
      boolean $$1 = $$0.a(this.dO().b((bll)this), (float)((int)this.b(bmr.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bmr.l).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bmr.l).a(8.0);
      }

      this.a(bmr.c).a(4.0);
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      clj $$3 = $$2.d();
      if (this.dN().B) {
         boolean $$4 = this.j($$0) || this.u() || $$2.a(clr.rw) && !this.u() && !this.aa_();
         return $$4 ? bjb.b : bjb.d;
      } else if (this.u()) {
         if (this.m($$2) && this.ew() < this.eN()) {
            if (!$$0.fU().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bjb.a;
         } else {
            if ($$3 instanceof ckd $$5 && this.j($$0)) {
               ckc $$6 = $$5.d();
               if ($$6 != this.go()) {
                  this.a($$6);
                  if (!$$0.fU().d) {
                     $$2.h(1);
                  }

                  return bjb.a;
               }

               return super.b($$0, $$1);
            }

            bjb $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.o_()) && this.j($$0)) {
               this.z(!this.gf());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bjb.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(clr.rw) && !this.aa_()) {
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         if (this.ag.a(3) == 0) {
            this.f($$0);
            this.bN.n();
            this.h(null);
            this.z(true);
            this.dN().a(this, (byte)7);
         } else {
            this.dN().a(this, (byte)6);
         }

         return bjb.a;
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
         this.gq();
      } else {
         super.b($$0);
      }
   }

   public float gn() {
      if (this.aa_()) {
         return 1.5393804F;
      } else {
         return this.u() ? (0.55F - (this.eN() - this.ew()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean m(clo $$0) {
      clj $$1 = $$0.d();
      return $$1.u() && $$1.v().c();
   }

   @Override
   public int fJ() {
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

   public ckc go() {
      return ckc.a(this.an.b(bY));
   }

   public void a(ckc $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public bxz b(ami $$0, bkq $$1) {
      bxz $$2 = bkz.bn.a((csf)$$0);
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
   public boolean a(bww $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.u()) {
         return false;
      } else if (!($$0 instanceof bxz $$1)) {
         return false;
      } else if (!$$1.u()) {
         return false;
      } else {
         return $$1.A() ? false : this.gj() && $$1.gj();
      }
   }

   public boolean gp() {
      return this.an.b(bX);
   }

   @Override
   public boolean a(bll $$0, bll $$1) {
      if ($$0 instanceof caz || $$0 instanceof cbh) {
         return false;
      } else if ($$0 instanceof bxz $$2) {
         return !$$2.u() || $$2.R_() != $$1;
      } else if ($$0 instanceof cdz && $$1 instanceof cdz && !((cdz)$$1).a((cdz)$$0)) {
         return false;
      } else {
         return $$0 instanceof byv && ((byv)$$0).gu() ? false : !($$0 instanceof bmg) || !((bmg)$$0).u();
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return !this.aa_() && super.a($$0);
   }

   @Override
   public ejz cJ() {
      return new ejz(0.0, (double)(0.6F * this.cI()), (double)(this.dh() * 0.4F));
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(bkz<bxz> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.a_($$3.d()).a(ark.bX) && a($$1, $$3);
   }

   class a<T extends bll> extends brn<T> {
      private final bxz j;

      public a(bxz $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof byy ? !this.j.u() && this.a((byy)this.b) : false;
      }

      private boolean a(byy $$0) {
         return $$0.gp() >= bxz.this.ag.a(5);
      }

      @Override
      public void c() {
         bxz.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bxz.this.h(null);
         super.e();
      }
   }

   class b extends bsz {
      public b(double $$0) {
         super(bxz.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dC() || this.b.bN();
      }
   }
}
