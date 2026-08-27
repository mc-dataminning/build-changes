import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxu extends bmb implements bln {
   private static final afo<Boolean> bX = afr.a(bxu.class, afq.k);
   private static final afo<Integer> bY = afr.a(bxu.class, afq.b);
   private static final afo<Integer> bZ = afr.a(bxu.class, afq.b);
   public static final Predicate<blg> bW = $$0 -> {
      bku<?> $$1 = $$0.ai();
      return $$1 == bku.aF || $$1 == bku.aC || $$1 == bku.N;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bii ci = aul.a(20, 39);
   @Nullable
   private UUID cj;

   public bxu(bku<? extends bxu> $$0, csa $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(edd.f, -1.0F);
      this.a(edd.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(1, new brv(this));
      this.bO.a(1, new bxu.b(1.5));
      this.bO.a(2, new btg(this));
      this.bO.a(3, new bxu.a<>(this, byt.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new bsh(this, 0.4F));
      this.bO.a(5, new bsl(this, 1.0, true));
      this.bO.a(6, new brz(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new brn(this, 1.0));
      this.bO.a(8, new bto(this, 1.0));
      this.bO.a(9, new brj(this, 8.0F));
      this.bO.a(10, new bsj(this, cdu.class, 8.0F));
      this.bO.a(10, new bsw(this));
      this.bP.a(1, new bty(this));
      this.bP.a(2, new btz(this));
      this.bP.a(3, new btt(this).a());
      this.bP.a(4, new btu<>(this, cdu.class, 10, true, false, this::a_));
      this.bP.a(5, new btx<>(this, bwr.class, false, bW));
      this.bP.a(6, new btx<>(this, bxs.class, false, bxs.bU));
      this.bP.a(7, new btu<>(this, car.class, false));
      this.bP.a(8, new bua<>(this, true));
   }

   public static bml.a gl() {
      return bli.C().a(bmm.m, 0.3F).a(bmm.l, 8.0).a(bmm.c, 2.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bX, false);
      this.an.a(bY, cjx.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.Bg, 0.15F, 1.0F);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.go().a());
      this.c($$0);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(cjx.a($$0.h("CollarColor")));
      }

      this.a(this.dN(), $$0);
   }

   @Override
   protected aqq y() {
      if (this.Z_()) {
         return aqr.Bb;
      } else if (this.ag.a(3) == 0) {
         return this.u() && this.ew() < 10.0F ? aqr.Bh : aqr.Be;
      } else {
         return aqr.AZ;
      }
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.Bd;
   }

   @Override
   protected aqq m_() {
      return aqr.Ba;
   }

   @Override
   protected float eX() {
      return 0.4F;
   }

   @Override
   public void c_() {
      super.c_();
      if (!this.dN().B && this.ce && !this.cf && !this.gb() && this.aC()) {
         this.cf = true;
         this.cg = 0.0F;
         this.ch = 0.0F;
         this.dN().a(this, (byte)8);
      }

      if (!this.dN().B) {
         this.a((ame)this.dN(), true);
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
               this.a(aqr.Bf, this.eX(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(dls.u);
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
               int $$1 = (int)(atm.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               eju $$2 = this.dq();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.dh() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.dh() * 0.5F;
                  this.dN().a(js.ah, this.ds() + (double)$$4, (double)($$0 + 0.8F), this.dy() + (double)$$5, $$2.c, $$2.d, $$2.e);
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
   public void a(bjo $$0) {
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
      return Math.min(0.5F + atm.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (atm.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return atm.a($$2 * (float) Math.PI) * atm.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return atm.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int aa() {
      return this.A() ? 20 : super.aa();
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         bkq $$2 = $$0.d();
         if (!this.dN().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cdu) && !($$2 instanceof cea)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(bkq $$0) {
      boolean $$1 = $$0.a(this.dO().b((blg)this), (float)((int)this.b(bmm.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bmm.l).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bmm.l).a(8.0);
      }

      this.a(bmm.c).a(4.0);
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      cle $$3 = $$2.d();
      if (this.dN().B) {
         boolean $$4 = this.j($$0) || this.u() || $$2.a(clm.rw) && !this.u() && !this.Z_();
         return $$4 ? bix.b : bix.d;
      } else if (this.u()) {
         if (this.m($$2) && this.ew() < this.eN()) {
            if (!$$0.fU().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bix.a;
         } else {
            if ($$3 instanceof cjy $$5 && this.j($$0)) {
               cjx $$6 = $$5.d();
               if ($$6 != this.go()) {
                  this.a($$6);
                  if (!$$0.fU().d) {
                     $$2.h(1);
                  }

                  return bix.a;
               }

               return super.b($$0, $$1);
            }

            bix $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.n_()) && this.j($$0)) {
               this.z(!this.gf());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bix.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(clm.rw) && !this.Z_()) {
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

         return bix.a;
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
      if (this.Z_()) {
         return 1.5393804F;
      } else {
         return this.u() ? (0.55F - (this.eN() - this.ew()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean m(clj $$0) {
      cle $$1 = $$0.d();
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

   public cjx go() {
      return cjx.a(this.an.b(bY));
   }

   public void a(cjx $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public bxu b(ame $$0, bkl $$1) {
      bxu $$2 = bku.bn.a((csa)$$0);
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
   public boolean a(bwr $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.u()) {
         return false;
      } else if (!($$0 instanceof bxu $$1)) {
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
   public boolean a(blg $$0, blg $$1) {
      if ($$0 instanceof cau || $$0 instanceof cbc) {
         return false;
      } else if ($$0 instanceof bxu $$2) {
         return !$$2.u() || $$2.Q_() != $$1;
      } else if ($$0 instanceof cdu && $$1 instanceof cdu && !((cdu)$$1).a((cdu)$$0)) {
         return false;
      } else {
         return $$0 instanceof byq && ((byq)$$0).gu() ? false : !($$0 instanceof bmb) || !((bmb)$$0).u();
      }
   }

   @Override
   public boolean a(cdu $$0) {
      return !this.Z_() && super.a($$0);
   }

   @Override
   public eju cJ() {
      return new eju(0.0, (double)(0.6F * this.cI()), (double)(this.dh() * 0.4F));
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(bku<bxu> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$1.a_($$3.d()).a(arg.bX) && a($$1, $$3);
   }

   class a<T extends blg> extends bri<T> {
      private final bxu j;

      public a(bxu $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof byt ? !this.j.u() && this.a((byt)this.b) : false;
      }

      private boolean a(byt $$0) {
         return $$0.gp() >= bxu.this.ag.a(5);
      }

      @Override
      public void c() {
         bxu.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bxu.this.h(null);
         super.e();
      }
   }

   class b extends bsu {
      public b(double $$0) {
         super(bxu.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dC() || this.b.bN();
      }
   }
}
