import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class crq extends csi {
   private static final fbx b = new fbx(0.0, 0.0, 0.0);
   private static final ajx<Integer> c = akb.a(crq.class, ajz.b);
   private static final ajx<Integer> d = akb.a(crq.class, ajz.b);
   private static final ajx<Boolean> h = akb.a(crq.class, ajz.k);
   private static final ImmutableMap<bwk, ImmutableList<Integer>> i = ImmutableMap.of(
      bwk.a, ImmutableList.of(0, 1, -1), bwk.f, ImmutableList.of(0, 1, -1), bwk.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private boolean j;
   private boolean k;
   private final cry l;
   private static final Map<dyu, Pair<km, km>> m = Maps.newEnumMap(
      (Map)af.a(
         () -> {
            km $$0 = jn.e.q();
            km $$1 = jn.f.q();
            km $$2 = jn.c.q();
            km $$3 = jn.d.q();
            km $$4 = $$0.p();
            km $$5 = $$1.p();
            km $$6 = $$2.p();
            km $$7 = $$3.p();
            return ImmutableMap.of(
               dyu.a,
               Pair.of($$2, $$3),
               dyu.b,
               Pair.of($$0, $$1),
               dyu.c,
               Pair.of($$4, $$1),
               dyu.d,
               Pair.of($$0, $$5),
               dyu.e,
               Pair.of($$2, $$7),
               dyu.f,
               Pair.of($$6, $$3),
               dyu.g,
               Pair.of($$3, $$1),
               dyu.h,
               Pair.of($$3, $$0),
               dyu.i,
               Pair.of($$2, $$0),
               dyu.j,
               Pair.of($$2, $$1)
            );
         }
      )
   );

   protected crq(bvi<?> $$0, dgz $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.l = new csf(this);
      } else {
         this.l = new csg(this);
      }
   }

   protected crq(bvi<?> $$0, dgz $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.p($$2, $$3, $$4);
   }

   public void p(double $$0, double $$1, double $$2) {
      this.a_($$0, $$1, $$2);
      this.K = $$0;
      this.L = $$1;
      this.M = $$2;
   }

   @Nullable
   public static <T extends crq> T a(dgz $$0, double $$1, double $$2, double $$3, bvi<T> $$4, bvh $$5, cxh $$6, @Nullable cpr $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bvi.a($$0, $$6, $$7).accept($$8);
         if ($$8.f() instanceof csf $$9) {
            ji $$10 = $$8.j();
            dxq $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public cry f() {
      return this.l;
   }

   @Override
   protected bva.c bg() {
      return bva.c.c;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, dke.j(dkg.a.m()));
      $$0.a(d, 6);
      $$0.a(h, false);
   }

   @Override
   public boolean i(bva $$0) {
      return cro.a(this, $$0);
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public fbx a(jn.a $$0, l.a $$1) {
      return bvy.k(super.a($$0, $$1));
   }

   @Override
   protected fbx a(bva $$0, bvd $$1, float $$2) {
      boolean $$3 = $$0 instanceof cpd || $$0 instanceof cpj;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public fbx b(bvy $$0) {
      jn $$1 = this.cO();
      if ($$1.o() == jn.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = crw.a($$1);
         ji $$3 = this.du();
         ji.a $$4 = new ji.a();
         ImmutableList<bwk> $$5 = $$0.fQ();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bwk $$6 = (bwk)$$14.next();
            bvd $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dU().a(crw.a(this.dU(), $$4), () -> crw.a(this.dU(), $$4.e()));
                  if (crw.a($$11)) {
                     fbs $$12 = new fbs((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     fbx $$13 = fbx.a($$4, $$11);
                     if (crw.a(this.dU(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cQ().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bwk $$15 = (bwk)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = ayz.c($$14x - (double)$$4.v() + $$16);
            double $$18 = crw.a($$4, $$17, $$0x -> this.dU().a_($$0x).g(this.dU(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aT() {
      dxq $$0 = this.dU().a_(this.du());
      return $$0.a(awp.P) ? 1.0F : super.aT();
   }

   @Override
   public void q(float $$0) {
      this.l(-this.J());
      this.d(10);
      this.b(this.H() + this.H() * 10.0F);
   }

   @Override
   public boolean bF() {
      return !this.dP();
   }

   public static Pair<km, km> a(dyu $$0) {
      return m.get($$0);
   }

   @Override
   public jn cO() {
      return this.l.l();
   }

   @Override
   protected double bd() {
      return this.bj() ? 0.005 : 0.04;
   }

   @Override
   public void h() {
      if (this.I() > 0) {
         this.d(this.I() - 1);
      }

      if (this.H() > 0.0F) {
         this.b(this.H() - 1.0F);
      }

      this.aA();
      this.bV();
      this.l.b();
      this.bo();
      if (this.bv()) {
         this.aE();
         this.Z *= 0.5F;
      }

      this.ak = false;
   }

   public boolean g() {
      return this.ak;
   }

   public ji j() {
      int $$0 = ayz.a(this.dz());
      int $$1 = ayz.a(this.dB());
      int $$2 = ayz.a(this.dF());
      if (b(this.dU())) {
         double $$3 = this.dB() - 0.1 - 1.0E-5F;
         if (this.dU().a_(ji.a((double)$$0, $$3, (double)$$2)).a(awp.P)) {
            $$1 = ayz.a($$3);
         }
      } else if (this.dU().a_(new ji($$0, $$1 - 1, $$2)).a(awp.P)) {
         $$1--;
      }

      return new ji($$0, $$1, $$2);
   }

   protected double a(ard $$0) {
      return this.l.b($$0);
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   public void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void bf() {
      super.bf();
   }

   @Override
   public void ay() {
      super.ay();
   }

   @Override
   public boolean bo() {
      return super.bo();
   }

   @Override
   public fbx ah() {
      return this.l.c(super.ah());
   }

   @Override
   public bvt N_() {
      return this.l.a();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.l.a($$0, $$1, $$2);
   }

   protected void b(ard $$0) {
      this.l.a($$0);
   }

   protected void e(ard $$0) {
      double $$1 = this.a($$0);
      fbx $$2 = this.dx();
      this.n(ayz.a($$2.d, -$$1, $$1), $$2.e, ayz.a($$2.f, -$$1, $$1));
      if (this.aJ()) {
         this.i(this.dx().c(0.5));
      }

      this.a(bwc.a, this.dx());
      if (!this.aJ()) {
         this.i(this.dx().c(0.95));
      }
   }

   protected double a(ji $$0, dyu $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(bwc $$0, fbx $$1) {
      if (b(this.dU())) {
         fbx $$2 = this.ds().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.d();
         if ($$3) {
            super.a($$0, $$2.d(this.ds()));
         }

         if ($$0.equals(bwc.c)) {
            this.j = false;
         }
      } else {
         super.a($$0, $$1);
         this.aK();
      }
   }

   @Override
   public void aK() {
      if (!b(this.dU())) {
         this.a(this.ds(), this.ds());
      } else {
         super.aK();
      }
   }

   @Override
   public boolean cp() {
      return this.j;
   }

   public void a(boolean $$0) {
      this.j = $$0;
   }

   public boolean m() {
      return this.k;
   }

   public void b(boolean $$0) {
      this.k = $$0;
   }

   public fbx a(ji $$0) {
      dxq $$1 = this.dU().a_($$0);
      if ($$1.a(dkg.bw) && $$1.c(dqf.d)) {
         dyu $$2 = $$1.c(((djt)$$1.b()).c());
         if ($$2 == dyu.b) {
            if (this.b($$0.h())) {
               return new fbx(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new fbx(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dyu.a) {
            if (this.b($$0.f())) {
               return new fbx(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new fbx(0.0, 0.0, -1.0);
            }
         }

         return fbx.c;
      } else {
         return fbx.c;
      }
   }

   public boolean b(ji $$0) {
      return this.dU().a_($$0).d(this.dU(), $$0);
   }

   @Override
   protected fbx a(fbx $$0) {
      double $$1 = this.l.m();
      fbx $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bj()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(tq $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(uf.a(this.dU().a(mc.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.k = $$0.q("FlippedRotation");
      this.ak = $$0.q("HasTicked");
   }

   @Override
   protected void b(tq $$0) {
      if (this.y()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", uf.a(this.n()));
         $$0.a("DisplayOffset", this.w());
      }

      $$0.a("FlippedRotation", this.k);
      $$0.a("HasTicked", this.ak);
   }

   @Override
   public void h(bva $$0) {
      if (!this.dU().C) {
         if (!$$0.ad && !this.ad) {
            if (!this.y($$0)) {
               double $$1 = $$0.dz() - this.dz();
               double $$2 = $$0.dF() - this.dF();
               double $$3 = $$1 * $$1 + $$2 * $$2;
               if ($$3 >= 1.0E-4F) {
                  $$3 = Math.sqrt($$3);
                  $$1 /= $$3;
                  $$2 /= $$3;
                  double $$4 = 1.0 / $$3;
                  if ($$4 > 1.0) {
                     $$4 = 1.0;
                  }

                  $$1 *= $$4;
                  $$2 *= $$4;
                  $$1 *= 0.1F;
                  $$2 *= 0.1F;
                  $$1 *= 0.5;
                  $$2 *= 0.5;
                  if ($$0 instanceof crq $$5) {
                     this.a($$5, $$1, $$2);
                  } else {
                     this.j(-$$1, 0.0, -$$2);
                     $$0.j($$1 / 4.0, 0.0, $$2 / 4.0);
                  }
               }
            }
         }
      }
   }

   private void a(crq $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dU())) {
         $$3 = this.dx().d;
         $$4 = this.dx().f;
      } else {
         $$3 = $$0.dz() - this.dz();
         $$4 = $$0.dF() - this.dF();
      }

      fbx $$7 = new fbx($$3, 0.0, $$4).d();
      fbx $$8 = new fbx((double)ayz.b(this.dK() * (float) (Math.PI / 180.0)), 0.0, (double)ayz.a(this.dK() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dU())) {
         fbx $$10 = this.dx();
         fbx $$11 = $$0.dx();
         if ($$0.A() && !this.A()) {
            this.i($$10.d(0.2, 1.0, 0.2));
            this.j($$11.d - $$1, 0.0, $$11.f - $$2);
            $$0.i($$11.d(0.95, 1.0, 0.95));
         } else if (!$$0.A() && this.A()) {
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.j($$10.d + $$1, 0.0, $$10.f + $$2);
            this.i($$10.d(0.95, 1.0, 0.95));
         } else {
            double $$12 = ($$11.d + $$10.d) / 2.0;
            double $$13 = ($$11.f + $$10.f) / 2.0;
            this.i($$10.d(0.2, 1.0, 0.2));
            this.j($$12 - $$1, 0.0, $$13 - $$2);
            $$0.i($$11.d(0.2, 1.0, 0.2));
            $$0.j($$12 + $$1, 0.0, $$13 + $$2);
         }
      }
   }

   public dxq n() {
      return !this.y() ? this.v() : dke.a(this.au().a(c));
   }

   public dxq v() {
      return dkg.a.m();
   }

   public int w() {
      return !this.y() ? this.x() : this.au().a(d);
   }

   public int x() {
      return 6;
   }

   public void c(dxq $$0) {
      this.au().a(c, dke.j($$0));
      this.q(true);
   }

   public void c(int $$0) {
      this.au().a(d, $$0);
      this.q(true);
   }

   public boolean y() {
      return this.au().a(h);
   }

   public void q(boolean $$0) {
      this.au().a(h, $$0);
   }

   public static boolean b(dgz $$0) {
      return $$0.K().b(csp.d);
   }

   @Override
   public abstract cxh dH();

   public boolean z() {
      return false;
   }

   public boolean A() {
      return false;
   }
}
