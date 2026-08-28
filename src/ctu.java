import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public abstract class ctu extends cuo implements bxh {
   private static final akj<Boolean> h = akn.a(ctu.class, akl.k);
   private static final akj<Boolean> i = akn.a(ctu.class, akl.k);
   private static final akj<Integer> j = akn.a(ctu.class, akl.b);
   public static final int a = 0;
   public static final int b = 1;
   private static final int k = 60;
   private static final float l = (float) (Math.PI / 8);
   public static final double c = (float) (Math.PI / 4);
   public static final int d = 60;
   private final float[] m = new float[2];
   private float n;
   private float o;
   private final bxe p = new bxe(this, 3);
   private boolean q;
   private boolean r;
   private boolean s;
   private boolean t;
   private double u;
   private float ay;
   private ctu.a az;
   private ctu.a aA;
   private double aB;
   private boolean aC;
   private boolean aD;
   private float aE;
   private float aF;
   private float aG;
   @Nullable
   private bxh.a aH;
   private final Supplier<czg> aI;

   public ctu(bwr<? extends ctu> $$0, djh $$1, Supplier<czg> $$2) {
      super($$0, $$1);
      this.aI = $$2;
      this.I = true;
   }

   public void p(double $$0, double $$1, double $$2) {
      this.a_($$0, $$1, $$2);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
   }

   @Override
   protected bwi.c be() {
      return bwi.c.c;
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(h, false);
      $$0.a(i, false);
      $$0.a(j, 0);
   }

   @Override
   public boolean i(bwi $$0) {
      return a(this, $$0);
   }

   public static boolean a(bwi $$0, bwi $$1) {
      return ($$1.bK() || $$1.bF()) && !$$0.z($$1);
   }

   @Override
   public boolean bK() {
      return true;
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public fex a(jb.a $$0, m.a $$1) {
      return bxj.k(super.a($$0, $$1));
   }

   protected abstract double b(bwl var1);

   @Override
   protected fex a(bwi $$0, bwl $$1, float $$2) {
      float $$3 = this.m();
      if (this.cX().size() > 1) {
         int $$4 = this.cX().indexOf($$0);
         if ($$4 == 0) {
            $$3 = 0.2F;
         } else {
            $$3 = -0.6F;
         }

         if ($$0 instanceof ciz) {
            $$3 += 0.2F;
         }
      }

      return new fex(0.0, this.b($$1), (double)$$3).b(-this.dK() * (float) (Math.PI / 180.0));
   }

   @Override
   public void a(boolean $$0, iv $$1) {
      if (this.dU() instanceof arq) {
         this.aC = true;
         this.aD = $$0;
         if (this.K() == 0) {
            this.m(60);
         }
      }

      if (!this.bl() && this.ae.a(100) == 0) {
         this.dU().a(this.dz(), this.dB(), this.dF(), this.aU(), this.dl(), 1.0F, 0.8F + 0.4F * this.ae.i(), false);
         this.dU().a(ly.ap, this.dz() + (double)this.ae.i(), this.dB() + 0.7, this.dF() + (double)this.ae.i(), 0.0, 0.0, 0.0);
         this.a(efo.O, this.cV());
      }
   }

   @Override
   public void h(bwi $$0) {
      if ($$0 instanceof ctu) {
         if ($$0.cQ().b < this.cQ().e) {
            super.h($$0);
         }
      } else if ($$0.cQ().b <= this.cQ().b) {
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
   public boolean bE() {
      return !this.dP();
   }

   @Override
   public bxe N_() {
      return this.p;
   }

   @Override
   public jb cO() {
      return this.cN().h();
   }

   @Override
   public void h() {
      this.aA = this.az;
      this.az = this.x();
      if (this.az != ctu.a.b && this.az != ctu.a.c) {
         this.n = 0.0F;
      } else {
         this.n++;
      }

      if (!this.dU().C && this.n >= 60.0F) {
         this.bM();
      }

      if (this.H() > 0) {
         this.d(this.H() - 1);
      }

      if (this.G() > 0.0F) {
         this.b(this.G() - 1.0F);
      }

      super.h();
      this.p.e();
      if (this.df()) {
         if (!(this.cY() instanceof crj)) {
            this.a(false, false);
         }

         this.F();
         if (this.dU().C) {
            this.J();
            this.dU().a(new ahq(this.c(0), this.c(1)));
         }

         this.a(bxn.a, this.dx());
      } else {
         this.i(fex.c);
      }

      this.aI();
      this.aI();
      this.v();

      for (int $$0 = 0; $$0 <= 1; $$0++) {
         if (this.c($$0)) {
            if (!this.aZ()
               && (double)(this.m[$$0] % (float) (Math.PI * 2)) <= (float) (Math.PI / 4)
               && (double)((this.m[$$0] + (float) (Math.PI / 8)) % (float) (Math.PI * 2)) >= (float) (Math.PI / 4)) {
               awm $$1 = this.f();
               if ($$1 != null) {
                  fex $$2 = this.h(1.0F);
                  double $$3 = $$0 == 1 ? -$$2.f : $$2.f;
                  double $$4 = $$0 == 1 ? $$2.d : -$$2.d;
                  this.dU().a(null, this.dz() + $$3, this.dB(), this.dF() + $$4, $$1, this.dl(), 1.0F, 0.8F + 0.4F * this.ae.i());
               }
            }

            this.m[$$0] = this.m[$$0] + (float) (Math.PI / 8);
         } else {
            this.m[$$0] = 0.0F;
         }
      }

      List<bwi> $$5 = this.dU().a(this, this.cQ().c(0.2F, -0.01F, 0.2F), bwp.a(this));
      if (!$$5.isEmpty()) {
         boolean $$6 = !this.dU().C && !(this.cV() instanceof crj);

         for (bwi $$7 : $$5) {
            if (!$$7.y(this)) {
               if ($$6
                  && this.cX().size() < this.n()
                  && !$$7.bX()
                  && this.b($$7)
                  && $$7 instanceof bxj
                  && !($$7 instanceof ckh)
                  && !($$7 instanceof crj)
                  && !($$7 instanceof cpp)) {
                  $$7.n(this);
               } else {
                  this.h($$7);
               }
            }
         }
      }
   }

   private void v() {
      if (this.dU().C) {
         int $$0 = this.K();
         if ($$0 > 0) {
            this.aE += 0.05F;
         } else {
            this.aE -= 0.1F;
         }

         this.aE = azm.a(this.aE, 0.0F, 1.0F);
         this.aG = this.aF;
         this.aF = 10.0F * (float)Math.sin(0.5 * (double)this.af) * this.aE;
      } else {
         if (!this.aC) {
            this.m(0);
         }

         int $$1 = this.K();
         if ($$1 > 0) {
            this.m(--$$1);
            int $$2 = 60 - $$1 - 1;
            if ($$2 > 0 && $$1 == 0) {
               this.m(0);
               fex $$3 = this.dx();
               if (this.aD) {
                  this.i($$3.b(0.0, -0.7, 0.0));
                  this.bM();
               } else {
                  this.n($$3.d, this.a($$0 -> $$0 instanceof crj) ? 2.7 : 0.6, $$3.f);
               }
            }

            this.aC = false;
         }
      }
   }

   @Nullable
   protected awm f() {
      return switch (this.x()) {
         case a, b, c -> awn.cm;
         case d -> awn.cl;
         default -> null;
      };
   }

   public void a(boolean $$0, boolean $$1) {
      this.al.a(h, $$0);
      this.al.a(i, $$1);
   }

   public float a(int $$0, float $$1) {
      return this.c($$0) ? azm.b(this.m[$$0] - (float) (Math.PI / 8), this.m[$$0], $$1) : 0.0F;
   }

   @Nullable
   @Override
   public bxh.a U_() {
      return this.aH;
   }

   @Override
   public void a(@Nullable bxh.a $$0) {
      this.aH = $$0;
   }

   @Override
   public fex cS() {
      return new fex(0.0, (double)(0.88F * this.cR()), (double)(this.dp() * 0.64F));
   }

   @Override
   public void b(bwi $$0, float $$1) {
      fex $$2 = $$0.ds().d(this.ds()).d().c((double)$$1 - 6.0);
      fex $$3 = this.dx();
      boolean $$4 = $$3.b($$2) > 0.0;
      this.i($$3.e($$2.c($$4 ? 0.15F : 0.2F)));
   }

   private ctu.a x() {
      ctu.a $$0 = this.E();
      if ($$0 != null) {
         this.u = this.cQ().e;
         return $$0;
      } else if (this.D()) {
         return ctu.a.a;
      } else {
         float $$1 = this.j();
         if ($$1 > 0.0F) {
            this.ay = $$1;
            return ctu.a.d;
         } else {
            return ctu.a.e;
         }
      }
   }

   public float g() {
      fes $$0 = this.cQ();
      int $$1 = azm.a($$0.a);
      int $$2 = azm.c($$0.d);
      int $$3 = azm.a($$0.e);
      int $$4 = azm.c($$0.e - this.aB);
      int $$5 = azm.a($$0.c);
      int $$6 = azm.c($$0.f);
      iv.a $$7 = new iv.a();

      label39:
      for (int $$8 = $$3; $$8 < $$4; $$8++) {
         float $$9 = 0.0F;

         for (int $$10 = $$1; $$10 < $$2; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$7.d($$10, $$8, $$11);
               ewv $$12 = this.dU().b_($$7);
               if ($$12.a(axh.a)) {
                  $$9 = Math.max($$9, $$12.a(this.dU(), $$7));
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
      fes $$0 = this.cQ();
      fes $$1 = new fes($$0.a, $$0.b - 0.001, $$0.c, $$0.d, $$0.b, $$0.f);
      int $$2 = azm.a($$1.a) - 1;
      int $$3 = azm.c($$1.d) + 1;
      int $$4 = azm.a($$1.b) - 1;
      int $$5 = azm.c($$1.e) + 1;
      int $$6 = azm.a($$1.c) - 1;
      int $$7 = azm.c($$1.f) + 1;
      ffr $$8 = ffo.a($$1);
      float $$9 = 0.0F;
      int $$10 = 0;
      iv.a $$11 = new iv.a();

      for (int $$12 = $$2; $$12 < $$3; $$12++) {
         for (int $$13 = $$6; $$13 < $$7; $$13++) {
            int $$14 = ($$12 != $$2 && $$12 != $$3 - 1 ? 0 : 1) + ($$13 != $$6 && $$13 != $$7 - 1 ? 0 : 1);
            if ($$14 != 2) {
               for (int $$15 = $$4; $$15 < $$5; $$15++) {
                  if ($$14 <= 0 || $$15 != $$4 && $$15 != $$5 - 1) {
                     $$11.d($$12, $$15, $$13);
                     eao $$16 = this.dU().a_($$11);
                     if (!($$16.b() instanceof dwg) && ffo.c($$16.g(this.dU(), $$11).a($$11), $$8, ffb.i)) {
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
      fes $$0 = this.cQ();
      int $$1 = azm.a($$0.a);
      int $$2 = azm.c($$0.d);
      int $$3 = azm.a($$0.b);
      int $$4 = azm.c($$0.b + 0.001);
      int $$5 = azm.a($$0.c);
      int $$6 = azm.c($$0.f);
      boolean $$7 = false;
      this.u = -Double.MAX_VALUE;
      iv.a $$8 = new iv.a();

      for (int $$9 = $$1; $$9 < $$2; $$9++) {
         for (int $$10 = $$3; $$10 < $$4; $$10++) {
            for (int $$11 = $$5; $$11 < $$6; $$11++) {
               $$8.d($$9, $$10, $$11);
               ewv $$12 = this.dU().b_($$8);
               if ($$12.a(axh.a)) {
                  float $$13 = (float)$$10 + $$12.a(this.dU(), $$8);
                  this.u = Math.max((double)$$13, this.u);
                  $$7 |= $$0.b < (double)$$13;
               }
            }
         }
      }

      return $$7;
   }

   @Nullable
   private ctu.a E() {
      fes $$0 = this.cQ();
      double $$1 = $$0.e + 0.001;
      int $$2 = azm.a($$0.a);
      int $$3 = azm.c($$0.d);
      int $$4 = azm.a($$0.e);
      int $$5 = azm.c($$1);
      int $$6 = azm.a($$0.c);
      int $$7 = azm.c($$0.f);
      boolean $$8 = false;
      iv.a $$9 = new iv.a();

      for (int $$10 = $$2; $$10 < $$3; $$10++) {
         for (int $$11 = $$4; $$11 < $$5; $$11++) {
            for (int $$12 = $$6; $$12 < $$7; $$12++) {
               $$9.d($$10, $$11, $$12);
               ewv $$13 = this.dU().b_($$9);
               if ($$13.a(axh.a) && $$1 < (double)((float)$$9.v() + $$13.a(this.dU(), $$9))) {
                  if (!$$13.b()) {
                     return ctu.a.c;
                  }

                  $$8 = true;
               }
            }
         }
      }

      return $$8 ? ctu.a.b : null;
   }

   @Override
   protected double bb() {
      return 0.04;
   }

   private void F() {
      double $$0 = -this.bc();
      double $$1 = 0.0;
      float $$2 = 0.05F;
      if (this.aA == ctu.a.e && this.az != ctu.a.e && this.az != ctu.a.d) {
         this.u = this.e(1.0);
         double $$3 = (double)(this.g() - this.dq()) + 0.101;
         if (this.dU().a(this, this.cQ().d(0.0, $$3 - this.dB(), 0.0))) {
            this.a_(this.dz(), $$3, this.dF());
            this.i(this.dx().d(1.0, 0.0, 1.0));
            this.aB = 0.0;
         }

         this.az = ctu.a.a;
      } else {
         if (this.az == ctu.a.a) {
            $$1 = (this.u - this.dB()) / (double)this.dq();
            $$2 = 0.9F;
         } else if (this.az == ctu.a.c) {
            $$0 = -7.0E-4;
            $$2 = 0.9F;
         } else if (this.az == ctu.a.b) {
            $$1 = 0.01F;
            $$2 = 0.45F;
         } else if (this.az == ctu.a.e) {
            $$2 = 0.9F;
         } else if (this.az == ctu.a.d) {
            $$2 = this.ay;
            if (this.cV() instanceof crj) {
               this.ay /= 2.0F;
            }
         }

         fex $$4 = this.dx();
         this.n($$4.d * (double)$$2, $$4.e + $$0, $$4.f * (double)$$2);
         this.o *= $$2;
         if ($$1 > 0.0) {
            fex $$5 = this.dx();
            this.n($$5.d, ($$5.e + $$1 * (this.bb() / 0.65)) * 0.75, $$5.f);
         }
      }
   }

   private void J() {
      if (this.bY()) {
         float $$0 = 0.0F;
         if (this.q) {
            this.o--;
         }

         if (this.r) {
            this.o++;
         }

         if (this.r != this.q && !this.s && !this.t) {
            $$0 += 0.005F;
         }

         this.w(this.dK() + this.o);
         if (this.s) {
            $$0 += 0.04F;
         }

         if (this.t) {
            $$0 -= 0.005F;
         }

         this.i(this.dx().b((double)(azm.a(-this.dK() * (float) (Math.PI / 180.0)) * $$0), 0.0, (double)(azm.b(this.dK() * (float) (Math.PI / 180.0)) * $$0)));
         this.a(this.r && !this.q || this.s, this.q && !this.r || this.s);
      }
   }

   protected float m() {
      return 0.0F;
   }

   public boolean b(bwi $$0) {
      return $$0.dp() < this.dp();
   }

   @Override
   protected void a(bwi $$0, bwi.a $$1) {
      super.a($$0, $$1);
      if (!$$0.an().a(axf.s)) {
         $$0.w($$0.dK() + this.o);
         $$0.r($$0.cz() + this.o);
         this.c($$0);
         if ($$0 instanceof ciz && this.cX().size() == this.n()) {
            int $$2 = $$0.ao() % 2 == 0 ? 90 : 270;
            $$0.s(((ciz)$$0).aV + (float)$$2);
            $$0.r($$0.cz() + (float)$$2);
         }
      }
   }

   @Override
   public fex b(bxj $$0) {
      fex $$1 = a((double)(this.dp() * azm.g), (double)$$0.dp(), $$0.dK());
      double $$2 = this.dz() + $$1.d;
      double $$3 = this.dF() + $$1.f;
      iv $$4 = iv.a($$2, this.cQ().e, $$3);
      iv $$5 = $$4.e();
      if (!this.dU().A($$5)) {
         List<fex> $$6 = Lists.newArrayList();
         double $$7 = this.dU().j($$4);
         if (cuc.a($$7)) {
            $$6.add(new fex($$2, (double)$$4.v() + $$7, $$3));
         }

         double $$8 = this.dU().j($$5);
         if (cuc.a($$8)) {
            $$6.add(new fex($$2, (double)$$5.v() + $$8, $$3));
         }

         UnmodifiableIterator var14 = $$0.fN().iterator();

         while (var14.hasNext()) {
            bxv $$9 = (bxv)var14.next();

            for (fex $$10 : $$6) {
               if (cuc.a(this.dU(), $$10, $$0, $$9)) {
                  $$0.b($$9);
                  return $$10;
               }
            }
         }
      }

      return super.b($$0);
   }

   protected void c(bwi $$0) {
      $$0.s(this.dK());
      float $$1 = azm.h($$0.dK() - this.dK());
      float $$2 = azm.a($$1, -105.0F, 105.0F);
      $$0.N += $$2 - $$1;
      $$0.w($$0.dK() + $$2 - $$1);
      $$0.r($$0.dK());
   }

   @Override
   public void k(bwi $$0) {
      this.c($$0);
   }

   @Override
   protected void b(tz $$0) {
      this.a($$0, this.aH);
   }

   @Override
   protected void a(tz $$0) {
      this.c($$0);
   }

   @Override
   public bug a(crj $$0, buf $$1) {
      bug $$2 = super.a($$0, $$1);
      if ($$2 != bug.e) {
         return $$2;
      } else {
         return (bug)($$0.fX() || !(this.n < 60.0F) || !this.dU().C && !$$0.n(this) ? bug.e : bug.a);
      }
   }

   @Override
   public void a(bwi.d $$0) {
      if (!this.dU().C && $$0.a() && this.O_()) {
         this.y();
      }

      super.a($$0);
   }

   @Override
   protected void a(double $$0, boolean $$1, eao $$2, iv $$3) {
      this.aB = this.dx().e;
      if (!this.bX()) {
         if ($$1) {
            this.k();
         } else if (!this.dU().b_(this.du().e()).a(axh.a) && $$0 < 0.0) {
            this.Z -= (double)((float)$$0);
         }
      }
   }

   public boolean c(int $$0) {
      return this.al.a($$0 == 0 ? h : i) && this.cV() != null;
   }

   private void m(int $$0) {
      this.al.a(j, $$0);
   }

   private int K() {
      return this.al.a(j);
   }

   public float a(float $$0) {
      return azm.h($$0, this.aG, this.aF);
   }

   @Override
   protected boolean r(bwi $$0) {
      return this.cX().size() < this.n() && !this.a(axh.a);
   }

   protected int n() {
      return 2;
   }

   @Nullable
   @Override
   public bxj cV() {
      return this.cY() instanceof bxj $$0 ? $$0 : super.cV();
   }

   public void a(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
      this.t = $$3;
   }

   @Override
   public boolean bl() {
      return this.az == ctu.a.b || this.az == ctu.a.c;
   }

   @Override
   protected final czg o() {
      return this.aI.get();
   }

   @Override
   public final czk dH() {
      return new czk(this.aI.get());
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e;
   }
}
