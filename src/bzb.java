import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzb extends bng implements bms {
   private static final agm<Boolean> bX = agp.a(bzb.class, ago.k);
   private static final agm<Integer> bY = agp.a(bzb.class, ago.b);
   private static final agm<Integer> bZ = agp.a(bzb.class, ago.b);
   public static final Predicate<bml> bW = $$0 -> {
      blz<?> $$1 = $$0.ai();
      return $$1 == blz.aG || $$1 == blz.aD || $$1 == blz.O;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bjm ci = avp.a(20, 39);
   @Nullable
   private UUID cj;

   public bzb(blz<? extends bzb> $$0, ctp $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(efc.f, -1.0F);
      this.a(efc.g, -1.0F);
   }

   @Override
   protected void B() {
      this.bO.a(1, new btb(this));
      this.bO.a(1, new bzb.b(1.5));
      this.bO.a(2, new bum(this));
      this.bO.a(3, new bzb.a<>(this, caa.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new btn(this, 0.4F));
      this.bO.a(5, new btr(this, 1.0, true));
      this.bO.a(6, new btf(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new bst(this, 1.0));
      this.bO.a(8, new buu(this, 1.0));
      this.bO.a(9, new bsp(this, 8.0F));
      this.bO.a(10, new btp(this, cfi.class, 8.0F));
      this.bO.a(10, new buc(this));
      this.bP.a(1, new bve(this));
      this.bP.a(2, new bvf(this));
      this.bP.a(3, new buz(this).a());
      this.bP.a(4, new bva<>(this, cfi.class, 10, true, false, this::a_));
      this.bP.a(5, new bvd<>(this, bxy.class, false, bW));
      this.bP.a(6, new bvd<>(this, byz.class, false, byz.bU));
      this.bP.a(7, new bva<>(this, cby.class, false));
      this.bP.a(8, new bvg<>(this, true));
   }

   public static bnq.a gk() {
      return bmn.C().a(bnr.m, 0.3F).a(bnr.l, 8.0).a(bnr.c, 2.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, false);
      this.an.a(bY, clm.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.BC, 0.15F, 1.0F);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gn().a());
      this.c($$0);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(clm.a($$0.h("CollarColor")));
      }

      this.a(this.dM(), $$0);
   }

   @Override
   protected arr y() {
      if (this.aa_()) {
         return ars.Bx;
      } else if (this.ag.a(3) == 0) {
         return this.u() && this.ev() < 10.0F ? ars.BD : ars.BA;
      } else {
         return ars.Bv;
      }
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.Bz;
   }

   @Override
   protected arr n_() {
      return ars.Bw;
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
         this.a((and)this.dM(), true);
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
               this.a(ars.BB, this.eW(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(dnr.u);
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
               int $$1 = (int)(auo.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               elt $$2 = this.dp();

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
   public void a(bkt $$0) {
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
      return Math.min(0.5F + auo.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (auo.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return auo.a($$2 * (float) Math.PI) * auo.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return auo.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int aa() {
      return this.A() ? 20 : super.aa();
   }

   @Override
   public boolean a(bkt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         blv $$2 = $$0.d();
         if (!this.dM().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cfi) && !($$2 instanceof cfo)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(blv $$0) {
      boolean $$1 = $$0.a(this.dN().b((bml)this), (float)((int)this.b(bnr.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bnr.l).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bnr.l).a(8.0);
      }

      this.a(bnr.c).a(4.0);
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      cmt $$3 = $$2.d();
      if (this.dM().B) {
         boolean $$4 = this.j($$0) || this.u() || $$2.a(cnb.rw) && !this.u() && !this.aa_();
         return $$4 ? bkb.b : bkb.d;
      } else if (this.u()) {
         if (this.m($$2) && this.ev() < this.eM()) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bkb.a;
         } else {
            if ($$3 instanceof cln $$5 && this.j($$0)) {
               clm $$6 = $$5.d();
               if ($$6 != this.gn()) {
                  this.a($$6);
                  if (!$$0.fT().d) {
                     $$2.h(1);
                  }

                  return bkb.a;
               }

               return super.b($$0, $$1);
            }

            bkb $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.o_()) && this.j($$0)) {
               this.z(!this.ge());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bkb.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(cnb.rw) && !this.aa_()) {
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

         return bkb.a;
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
   public boolean m(cmy $$0) {
      cmt $$1 = $$0.d();
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

   public clm gn() {
      return clm.a(this.an.b(bY));
   }

   public void a(clm $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public bzb b(and $$0, blq $$1) {
      bzb $$2 = blz.bp.a((ctp)$$0);
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
   public boolean a(bxy $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.u()) {
         return false;
      } else if (!($$0 instanceof bzb $$1)) {
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
   public boolean a(bml $$0, bml $$1) {
      if ($$0 instanceof ccb || $$0 instanceof ccj) {
         return false;
      } else if ($$0 instanceof bzb $$2) {
         return !$$2.u() || $$2.R_() != $$1;
      } else if ($$0 instanceof cfi && $$1 instanceof cfi && !((cfi)$$1).a((cfi)$$0)) {
         return false;
      } else {
         return $$0 instanceof bzx && ((bzx)$$0).gt() ? false : !($$0 instanceof bng) || !((bng)$$0).u();
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return !this.aa_() && super.a($$0);
   }

   @Override
   public elt cJ() {
      return new elt(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(blz<bzb> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.a_($$3.d()).a(ash.bX) && a($$1, $$3);
   }

   class a<T extends bml> extends bso<T> {
      private final bzb j;

      public a(bzb $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof caa ? !this.j.u() && this.a((caa)this.b) : false;
      }

      private boolean a(caa $$0) {
         return $$0.go() >= bzb.this.ag.a(5);
      }

      @Override
      public void c() {
         bzb.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bzb.this.h(null);
         super.e();
      }
   }

   class b extends bua {
      public b(double $$0) {
         super(bzb.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dB() || this.b.bN();
      }
   }
}
