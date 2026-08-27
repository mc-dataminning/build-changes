import java.util.UUID;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvl extends bjs implements bjd {
   private static final adx<Boolean> bX = aea.a(bvl.class, adz.k);
   private static final adx<Integer> bY = aea.a(bvl.class, adz.b);
   private static final adx<Integer> bZ = aea.a(bvl.class, adz.b);
   public static final Predicate<biw> bW = $$0 -> {
      bik<?> $$1 = $$0.ag();
      return $$1 == bik.aF || $$1 == bik.aC || $$1 == bik.N;
   };
   private static final float ca = 8.0F;
   private static final float cb = 20.0F;
   private float cc;
   private float cd;
   private boolean ce;
   private boolean cf;
   private float cg;
   private float ch;
   private static final bfz ci = ask.a(20, 39);
   @Nullable
   private UUID cj;

   public bvl(bik<? extends bvl> $$0, cpk $$1) {
      super($$0, $$1);
      this.x(false);
      this.a(eam.f, -1.0F);
      this.a(eam.g, -1.0F);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpm(this));
      this.bO.a(1, new bvl.b(1.5));
      this.bO.a(2, new bqx(this));
      this.bO.a(3, new bvl.a<>(this, bwk.class, 24.0F, 1.5, 1.5));
      this.bO.a(4, new bpy(this, 0.4F));
      this.bO.a(5, new bqc(this, 1.0, true));
      this.bO.a(6, new bpq(this, 1.0, 10.0F, 2.0F, false));
      this.bO.a(7, new bpe(this, 1.0));
      this.bO.a(8, new brf(this, 1.0));
      this.bO.a(9, new bpa(this, 8.0F));
      this.bO.a(10, new bqa(this, cbl.class, 8.0F));
      this.bO.a(10, new bqn(this));
      this.bP.a(1, new brp(this));
      this.bP.a(2, new brq(this));
      this.bP.a(3, new brk(this).a());
      this.bP.a(4, new brl<>(this, cbl.class, 10, true, false, this::a_));
      this.bP.a(5, new bro<>(this, bui.class, false, bW));
      this.bP.a(6, new bro<>(this, bvj.class, false, bvj.bU));
      this.bP.a(7, new brl<>(this, byi.class, false));
      this.bP.a(8, new brr<>(this, true));
   }

   public static bkc.a gf() {
      return biy.x().a(bkd.d, 0.3F).a(bkd.a, 8.0).a(bkd.f, 2.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, false);
      this.an.a(bY, chk.o.a());
      this.an.a(bZ, 0);
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.Aq, 0.15F, 1.0F);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("CollarColor", (byte)this.gi().a());
      this.c($$0);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("CollarColor", 99)) {
         this.a(chk.a($$0.h("CollarColor")));
      }

      this.a(this.dK(), $$0);
   }

   @Override
   protected aot r() {
      if (this.S_()) {
         return aou.Al;
      } else if (this.ag.a(3) == 0) {
         return this.p() && this.et() < 10.0F ? aou.Ar : aou.Ao;
      } else {
         return aou.Aj;
      }
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.An;
   }

   @Override
   protected aot h_() {
      return aou.Ak;
   }

   @Override
   protected float eU() {
      return 0.4F;
   }

   @Override
   public void b_() {
      super.b_();
      if (!this.dK().B && this.ce && !this.cf && !this.fV() && this.aA()) {
         this.cf = true;
         this.cg = 0.0F;
         this.ch = 0.0F;
         this.dK().a(this, (byte)8);
      }

      if (!this.dK().B) {
         this.a((aki)this.dK(), true);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.bv()) {
         this.cd = this.cc;
         if (this.gj()) {
            this.cc = this.cc + (1.0F - this.cc) * 0.4F;
         } else {
            this.cc = this.cc + (0.0F - this.cc) * 0.4F;
         }

         if (this.aZ()) {
            this.ce = true;
            if (this.cf && !this.dK().B) {
               this.dK().a(this, (byte)56);
               this.gk();
            }
         } else if ((this.ce || this.cf) && this.cf) {
            if (this.cg == 0.0F) {
               this.a(aou.Ap, this.eU(), (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
               this.a(dji.u);
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
               int $$1 = (int)(aro.a((this.cg - 0.4F) * (float) Math.PI) * 7.0F);
               ehf $$2 = this.dn();

               for (int $$3 = 0; $$3 < $$1; $$3++) {
                  float $$4 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  float $$5 = (this.ag.i() * 2.0F - 1.0F) * this.df() * 0.5F;
                  this.dK().a(iw.ag, this.dp() + (double)$$4, (double)($$0 + 0.8F), this.dv() + (double)$$5, $$2.c, $$2.d, $$2.e);
               }
            }
         }
      }
   }

   private void gk() {
      this.cf = false;
      this.cg = 0.0F;
      this.ch = 0.0F;
   }

   @Override
   public void a(bhe $$0) {
      this.ce = false;
      this.cf = false;
      this.ch = 0.0F;
      this.cg = 0.0F;
      super.a($$0);
   }

   public boolean gg() {
      return this.ce;
   }

   public float E(float $$0) {
      return Math.min(0.5F + aro.i($$0, this.ch, this.cg) / 2.0F * 0.5F, 1.0F);
   }

   public float f(float $$0, float $$1) {
      float $$2 = (aro.i($$0, this.ch, this.cg) + $$1) / 1.8F;
      if ($$2 < 0.0F) {
         $$2 = 0.0F;
      } else if ($$2 > 1.0F) {
         $$2 = 1.0F;
      }

      return aro.a($$2 * (float) Math.PI) * aro.a($$2 * (float) Math.PI * 11.0F) * 0.15F * (float) Math.PI;
   }

   public float F(float $$0) {
      return aro.i($$0, this.cd, this.cc) * 0.15F * (float) Math.PI;
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return $$1.b * 0.8F;
   }

   @Override
   public int W() {
      return this.t() ? 20 : super.W();
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         big $$2 = $$0.d();
         if (!this.dK().B) {
            this.z(false);
         }

         if ($$2 != null && !($$2 instanceof cbl) && !($$2 instanceof cbr)) {
            $$1 = ($$1 + 1.0F) / 2.0F;
         }

         return super.a($$0, $$1);
      }
   }

   @Override
   public boolean C(big $$0) {
      boolean $$1 = $$0.a(this.dL().b((biw)this), (float)((int)this.b(bkd.f)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   @Override
   public void x(boolean $$0) {
      super.x($$0);
      if ($$0) {
         this.a(bkd.a).a(20.0);
         this.c(20.0F);
      } else {
         this.a(bkd.a).a(8.0);
      }

      this.a(bkd.f).a(4.0);
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      cir $$3 = $$2.d();
      if (this.dK().B) {
         boolean $$4 = this.l($$0) || this.p() || $$2.a(ciz.qL) && !this.p() && !this.S_();
         return $$4 ? bgo.b : bgo.d;
      } else if (this.p()) {
         if (this.m($$2) && this.et() < this.eK()) {
            if (!$$0.fR().d) {
               $$2.h(1);
            }

            this.b((float)$$3.v().a());
            return bgo.a;
         } else {
            if ($$3 instanceof chl $$5 && this.l($$0)) {
               chk $$6 = $$5.d();
               if ($$6 != this.gi()) {
                  this.a($$6);
                  if (!$$0.fR().d) {
                     $$2.h(1);
                  }

                  return bgo.a;
               }

               return super.b($$0, $$1);
            }

            bgo $$7 = super.b($$0, $$1);
            if ((!$$7.a() || this.i_()) && this.l($$0)) {
               this.z(!this.fZ());
               this.bj = false;
               this.bN.n();
               this.h(null);
               return bgo.a;
            } else {
               return $$7;
            }
         }
      } else if ($$2.a(ciz.qL) && !this.S_()) {
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

         return bgo.a;
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
         this.gk();
      } else {
         super.b($$0);
      }
   }

   public float gh() {
      if (this.S_()) {
         return 1.5393804F;
      } else {
         return this.p() ? (0.55F - (this.eK() - this.et()) * 0.02F) * (float) Math.PI : (float) (Math.PI / 5);
      }
   }

   @Override
   public boolean m(ciw $$0) {
      cir $$1 = $$0.d();
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

   public chk gi() {
      return chk.a(this.an.b(bY));
   }

   public void a(chk $$0) {
      this.an.b(bY, $$0.a());
   }

   @Nullable
   public bvl b(aki $$0, bib $$1) {
      bvl $$2 = bik.bn.a((cpk)$$0);
      if ($$2 != null) {
         UUID $$3 = this.U_();
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
   public boolean a(bui $$0) {
      if ($$0 == this) {
         return false;
      } else if (!this.p()) {
         return false;
      } else if (!($$0 instanceof bvl $$1)) {
         return false;
      } else if (!$$1.p()) {
         return false;
      } else {
         return $$1.t() ? false : this.gd() && $$1.gd();
      }
   }

   public boolean gj() {
      return this.an.b(bX);
   }

   @Override
   public boolean a(biw $$0, biw $$1) {
      if ($$0 instanceof byl || $$0 instanceof byt) {
         return false;
      } else if ($$0 instanceof bvl $$2) {
         return !$$2.p() || $$2.I_() != $$1;
      } else if ($$0 instanceof cbl && $$1 instanceof cbl && !((cbl)$$1).a((cbl)$$0)) {
         return false;
      } else {
         return $$0 instanceof bwh && ((bwh)$$0).go() ? false : !($$0 instanceof bjs) || !((bjs)$$0).p();
      }
   }

   @Override
   public boolean a(cbl $$0) {
      return !this.S_() && super.a($$0);
   }

   @Override
   public ehf cI() {
      return new ehf(0.0, (double)(0.6F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.03125F * $$2, -0.0625F * $$2);
   }

   public static boolean c(bik<bvl> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.a_($$3.d()).a(apj.bX) && a($$1, $$3);
   }

   class a<T extends biw> extends boz<T> {
      private final bvl j;

      public a(bvl $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4);
         this.j = $$0;
      }

      @Override
      public boolean a() {
         return super.a() && this.b instanceof bwk ? !this.j.p() && this.a((bwk)this.b) : false;
      }

      private boolean a(bwk $$0) {
         return $$0.gj() >= bvl.this.ag.a(5);
      }

      @Override
      public void c() {
         bvl.this.h(null);
         super.c();
      }

      @Override
      public void e() {
         bvl.this.h(null);
         super.e();
      }
   }

   class b extends bql {
      public b(double $$0) {
         super(bvl.this, $$0);
      }

      @Override
      protected boolean h() {
         return this.b.dz() || this.b.bM();
      }
   }
}
