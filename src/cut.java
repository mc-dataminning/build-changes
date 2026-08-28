import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class cut extends cvn implements byd {
   private static final aku<Boolean> j = aky.a(cut.class, akw.k);
   private static final aku<Boolean> k = aky.a(cut.class, akw.k);
   private static final aku<Integer> l = aky.a(cut.class, akw.b);
   public static final int a = 0;
   public static final int b = 1;
   private static final int m = 60;
   private static final float n = (float) (Math.PI / 8);
   public static final double c = (float) (Math.PI / 4);
   public static final int d = 60;
   private final float[] o = new float[2];
   private float p;
   private float q;
   private final bya r = new bya(this, 3);
   private boolean s;
   private boolean t;
   private boolean u;
   private boolean ay;
   private double az;
   private float aA;
   private cut.a aB;
   private cut.a aC;
   private double aD;
   private boolean aE;
   private boolean aF;
   private float aG;
   private float aH;
   private float aI;
   @Nullable
   private byd.a aJ;
   private final Supplier<dag> aK;

   public cut(bxn<? extends cut> $$0, dkj $$1, Supplier<dag> $$2) {
      super($$0, $$1);
      this.aK = $$2;
      this.I = true;
   }

   public void p(double $$0, double $$1, double $$2) {
      this.a_($$0, $$1, $$2);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
   }

   @Override
   protected bxe.c bf() {
      return bxe.c.c;
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(j, false);
      $$0.a(k, false);
      $$0.a(l, 0);
   }

   @Override
   public boolean i(bxe $$0) {
      return a(this, $$0);
   }

   public static boolean a(bxe $$0, bxe $$1) {
      return ($$1.bL() || $$1.bG()) && !$$0.z($$1);
   }

   @Override
   public boolean bL() {
      return true;
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public fgc a(jc.a $$0, m.a $$1) {
      return byf.k(super.a($$0, $$1));
   }

   protected abstract double b(bxh var1);

   @Override
   protected fgc a(bxe $$0, bxh $$1, float $$2) {
      float $$3 = this.m();
      if (this.cY().size() > 1) {
         int $$4 = this.cY().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof cjv) {
            $$3 += 0.2F;
         }
      }

      return new fgc(0.0, this.b($$1), (double)$$3).b(-this.dL() * (float) (Math.PI / 180.0));
   }

   @Override
   public void a(boolean $$0, iw $$1) {
      if (this.dV() instanceof asb) {
         this.aE = true;
         this.aF = $$0;
         if (this.K() == 0) {
            this.m(60);
         }
      }

      if (!this.bm() && this.ae.a(100) == 0) {
         this.dV().a(this.dA(), this.dC(), this.dG(), this.aV(), this.dm(), 1.0F, 0.8F + 0.4F * this.ae.i(), false);
         this.dV().a(lz.ap, this.dA() + (double)this.ae.i(), this.dC() + 0.7, this.dG() + (double)this.ae.i(), 0.0, 0.0, 0.0);
         this.a(egq.O, this.cW());
      }
   }

   @Override
   public void h(bxe $$0) {
      if ($$0 instanceof cut) {
         if ($$0.cR().b < this.cR().e) {
            super.h($$0);
         }
      } else if ($$0.cR().b <= this.cR().b) {
         super.h($$0);
      }
   }

   @Override
   public void q(float $$0) {
      this.l(-this.I());
      this.d(10);
      this.b(this.G() * 11.0F);
   }

   @Override
   public boolean bF() {
      return !this.dQ();
   }

   @Override
   public bya S_() {
      return this.r;
   }

   @Override
   public jc cP() {
      return this.cO().h();
   }

   @Override
   public void h() {
      this.aC = this.aB;
      this.aB = this.x();
      if (this.aB != cut.a.b && this.aB != cut.a.c) {
         this.p = 0.0F;
      } else {
         this.p++;
      }

      if (!this.dV().C && this.p >= 60.0F) {
         this.bN();
      }

      if (this.H() > 0) {
         this.d(this.H() - 1);
      }

      if (this.G() > 0.0F) {
         this.b(this.G() - 1.0F);
      }

      super.h();
      this.r.e();
      if (this.dg()) {
         if (!(this.cZ() instanceof csi)) {
            this.a(false, false);
         }

         this.F();
         if (this.dV().C) {
            this.J();
            this.dV().a(new aib(this.c(0), this.c(1)));
         }

         this.a(byj.a, this.dy());
      } else {
         this.i(fgc.c);
      }

      this.aI();
      this.aI();
      this.v();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.ba()
               && (double)(this.o[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.o[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               awx $$1 = this.f();
               if ($$1 != null) {
                  fgc $$2 = this.h(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.f : $$2.f;
                  double $$4 = $$0 == 1 ? $$2.d : -$$2.d;
                  this.dV().a(null, this.dA() + $$3, this.dC(), this.dG() + $$4, $$1, this.dm(), 1.0F, 0.8F + 0.4F * this.ae.i());
               }
            }

            this.o[$$0] = this.o[$$0] + (float) (Math.PI / 8);
         } else {
            this.o[$$0] = 0.0F;
         }
      }

      List<bxe> $$5 = this.dV().a(this, this.cR().c(0.2F, -0.01F, 0.2F), bxl.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dV().C && !(this.cW() instanceof csi);

         for (bxe $$7 : $$5) {
            if (!$$7.y(this)) {
               if ($$6
                  && this.cY().size() < this.n()
                  && !$$7.bY()
                  && this.b($$7)
                  && $$7 instanceof byf
                  && !($$7 instanceof cld)
                  && !($$7 instanceof csi)
                  && !($$7 instanceof cqo)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void v() {
      if (this.dV().C) {
         int $$0 = this.K();
         if ($$0 > 0) {
            this.aG += 0.05F;
         } else {
            this.aG -= 0.1F;
         }

         this.aG = azz.a(this.aG, 0.0F, 1.0F);
         this.aI = this.aH;
         this.aH = 10.0F * (float)Math.sin(0.5 * (double)this.af) * this.aG;
      } else {
         if (!this.aE) {
            this.m(0);
         }

         int $$1 = this.K();
         if ($$1 > 0) {
            this.m(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.m(0);
               fgc $$3 = this.dy();
               if (this.aF) {
                  this.i($$3.b(0.0, -0.7, 0.0));
                  this.bN();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof csi) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.aE = false;
         }
      }
   }

   @Nullable
   protected awx f() {
      return switch (this.x()) {
         case a, b, c -> awy.cm;
         case d -> awy.cl;
         default -> null;
      };
   }

   public void a(boolean $$0, boolean $$1) {
      this.al.a(j, $$0);
      this.al.a(k, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? azz.b(this.o[$$0] - (float) (Math.PI / 8), this.o[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public byd.a Z_() {
      return this.aJ;
   }

   @Override
   public void a(@Nullable byd.a $$0) {
      this.aJ = $$0;
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, (double)(0.88F * this.cS()), (double)(this.dq() * 0.64F));
   }

   @Override
   public void b(bxe $$0, float $$1) {
      fgc $$2 = $$0.dt().d(this.dt()).d().c((double)$$1 - 6.0);
      fgc $$3 = this.dy();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.i($$3.e($$2.c($$4 ? 0.15F : 0.2F)));
   }

   private cut.a x() {
      cut.a $$0 = this.E();
      if ($$0 != null) {
         this.az = this.cR().e;
         return $$0;
      } else if (this.D()) {
         return cut.a.a;
      } else {
         float $$1 = this.j();
         if ($$1 > 0.0F) {
            this.aA = $$1;
            return cut.a.d;
         } else {
            return cut.a.e;
         }
      }
   }

   public float g() {
      ffx $$0 = this.cR();
      int $$1 = azz.a($$0.a);
      int $$2 = azz.c($$0.d);
      int $$3 = azz.a($$0.e);
      int $$4 = azz.c($$0.e - this.aD);
      int $$5 = azz.a($$0.c);
      int $$6 = azz.c($$0.f);
      iw.a $$7 = new iw.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               eya $$12 = this.dV().b_($$7);
               if ($$12.a(axs.a)) {
                  $$9 = Math.max($$9, $$12.a(this.dV(), $$7));
               }

               if ($$9 >= 1.0F) {
                  continue label39;
               }
            }
         }

         if ($$9 < 1.0F) {
            return (float)$$7.v() + $$9;
         }
      }

      return (float)($$4 + 1);
   }

   public float j() {
      ffx $$0 = this.cR();
      ffx $$1 = new ffx($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = azz.a($$1.a) - 1;
      int $$3 = azz.c($$1.d) + 1;
      int $$4 = azz.a($$1.b) - 1;
      int $$5 = azz.c($$1.e) + 1;
      int $$6 = azz.a($$1.c) - 1;
      int $$7 = azz.c($$1.f) + 1;
      fgw $$8 = fgt.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      iw.a $$11 = new iw.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     ebq $$16 = this.dV().a_($$11);
                     if (!($$16.b() instanceof dxi) && fgt.c($$16.g(this.dV(), $$11).a($$11), $$8, fgg.i)) {
                        $$9 += $$16.b().g();
                        $$10++;
                     }
                  }
               }
            }
         }
      }

      return $$9 / (float)$$10;
   }

   private boolean D() {
      ffx $$0 = this.cR();
      int $$1 = azz.a($$0.a);
      int $$2 = azz.c($$0.d);
      int $$3 = azz.a($$0.b);
      int $$4 = azz.c($$0.b + 0.001);
      int $$5 = azz.a($$0.c);
      int $$6 = azz.c($$0.f);
      boolean $$7 = false;
      this.az = -Double.MAX_VALUE;
      iw.a $$8 = new iw.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               eya $$12 = this.dV().b_($$8);
               if ($$12.a(axs.a)) {
                  float $$13 = (float)$$10 + $$12.a(this.dV(), $$8);
                  this.az = Math.max((double)$$13, this.az);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private cut.a E() {
      ffx $$0 = this.cR();
      double $$1 = $$0.e + 0.001;
      int $$2 = azz.a($$0.a);
      int $$3 = azz.c($$0.d);
      int $$4 = azz.a($$0.e);
      int $$5 = azz.c($$1);
      int $$6 = azz.a($$0.c);
      int $$7 = azz.c($$0.f);
      boolean $$8 = false;
      iw.a $$9 = new iw.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               eya $$13 = this.dV().b_($$9);
               if ($$13.a(axs.a) && $$1 < (double)((float)$$9.v() + $$13.a(this.dV(), $$9))) {
                  if (!$$13.b()) {
                     return cut.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? cut.a.b : null;
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   private void F() {
      double $$0 = -this.bd();
      double $$1 = 0.0;
      float $$2 = 0.05F;
      if (this.aC == cut.a.e && this.aB != cut.a.e && this.aB != cut.a.d) {
         this.az = this.e(1.0);
         double $$3 = (double)(this.g() - this.dr()) + 0.101;
         if (this.dV().a(this, this.cR().d(0.0, $$3 - this.dC(), 0.0))) {
            this.a_(this.dA(), $$3, this.dG());
            this.i(this.dy().d(1.0, 0.0, 1.0));
            this.aD = 0.0;
         }

         this.aB = cut.a.a;
      } else {
         if (this.aB == cut.a.a) {
            $$1 = (this.az - this.dC()) / (double)this.dr();
            $$2 = 0.9F;
         } else if (this.aB == cut.a.c) {
            $$0 = -7.0E-4;
            $$2 = 0.9F;
         } else if (this.aB == cut.a.b) {
            $$1 = 0.01F;
            $$2 = 0.45F;
         } else if (this.aB == cut.a.e) {
            $$2 = 0.9F;
         } else if (this.aB == cut.a.d) {
            $$2 = this.aA;
            if (this.cW() instanceof csi) {
               this.aA /= 2.0F;
            }
         }

         fgc $$4 = this.dy();
         this.n($$4.d * (double)$$2, $$4.e + $$0, $$4.f * (double)$$2);
         this.q *= $$2;
         if ($$1 > 0.0) {
            fgc $$5 = this.dy();
            this.n($$5.d, ($$5.e + $$1 * (this.bc() / 0.65)) * 0.75, $$5.f);
         }
      }
   }

   private void J() {
      if (this.bZ()) {
         float $$0 = 0.0F;
         if (this.s) {
            this.q--;
         }

         if (this.t) {
            this.q++;
         }

         if (this.t != this.s && !this.u && !this.ay) {
            $$0 += 0.005F;
         }

         this.w(this.dL() + this.q);
         if (this.u) {
            $$0 += 0.04F;
         }

         if (this.ay) {
            $$0 -= 0.005F;
         }

         this.i(this.dy().b((double)(azz.a(-this.dL() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(azz.b(this.dL() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.t && !this.s || this.u, this.s && !this.t || this.u);
      }
   }

   protected float m() {
      return 0.0F;
   }

   public boolean b(bxe $$0) {
      return $$0.dq() < this.dq();
   }

   @Override
   protected void a(bxe $$0, bxe.a $$1) {
      super.a($$0, $$1);
      if (!$$0.an().a(axq.s)) {
         $$0.w($$0.dL() + this.q);
         $$0.r($$0.cA() + this.q);
         this.c($$0);
         if ($$0 instanceof cjv && this.cY().size() == this.n()) {
            int $$2 = $$0.ao() % 2 == 0 ? 90 : 270;
            $$0.s(((cjv)$$0).aV + (float)$$2);
            $$0.r($$0.cA() + (float)$$2);
         }
      }
   }

   @Override
   public fgc b(byf $$0) {
      fgc $$1 = a((double)(this.dq() * azz.g), (double)$$0.dq(), $$0.dL());
      double $$2 = this.dA() + $$1.d;
      double $$3 = this.dG() + $$1.f;
      iw $$4 = iw.a($$2, this.cR().e, $$3);
      iw $$5 = $$4.e();
      if (!this.dV().A($$5)) {
         List<fgc> $$6 = Lists.newArrayList();
         double $$7 = this.dV().j($$4);
         if (cvb.a($$7)) {
            $$6.add(new fgc($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dV().j($$5);
         if (cvb.a($$8)) {
            $$6.add(new fgc($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fO().iterator();

         while (var14.hasNext()) {
            byr $$9 = (byr)var14.next();

            for (fgc $$10 : $$6) {
               if (cvb.a(this.dV(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bxe $$0) {
      $$0.s(this.dL());
      float $$1 = azz.h($$0.dL() - this.dL());
      float $$2 = azz.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.w($$0.dL() + $$2 - $$1);
      $$0.r($$0.dL());
   }

   @Override
   public void k(bxe $$0) {
      this.c($$0);
   }

   @Override
   protected void b(ua $$0) {
      this.a($$0, this.aJ);
   }

   @Override
   protected void a(ua $$0) {
      this.c($$0);
   }

   @Override
   public bvc a(csi $$0, bvb $$1) {
      bvc $$2 = super.a($$0, $$1);
      if ($$2 != bvc.e) {
         return $$2;
      } else {
         return (bvc)($$0.fY() || !(this.p < 60.0F) || !this.dV().C && !$$0.n(this) ? bvc.e : bvc.a);
      }
   }

   @Override
   public void a(bxe.d $$0) {
      if (!this.dV().C && $$0.a() && this.T_()) {
         this.y();
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, ebq $$2, iw $$3) {
      this.aD = this.dy().e;
      if (!this.bY()) {
         if ($$1) {
            this.k();
         } else if (!this.dV().b_(this.dv().e()).a(axs.a) && $$0 < 0.0) {
            this.Z -= (double)((float)$$0);
         }
      }
   }

   public boolean c(int $$0) {
      return this.al.a($$0 == 0 ? j : k) && this.cW() != null;
   }

   private void m(int $$0) {
      this.al.a(l, $$0);
   }

   private int K() {
      return this.al.a(l);
   }

   public float a(float $$0) {
      return azz.h($$0, this.aI, this.aH);
   }

   @Override
   protected boolean r(bxe $$0) {
      return this.cY().size() < this.n() && !this.a(axs.a);
   }

   protected int n() {
      return 2;
   }

   @Nullable
   @Override
   public byf cW() {
      return this.cZ() instanceof byf $$0 ? $$0 : super.cW();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.s = $$0;
      this.t = $$1;
      this.u = $$2;
      this.ay = $$3;
   }

   @Override
   public boolean bm() {
      return this.aB == cut.a.b || this.aB == cut.a.c;
   }

   @Override
   protected final dag o() {
      return this.aK.get();
   }

   @Override
   public final dak dI() {
      return new dak(this.aK.get());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
