import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class csh extends csz {
   private static final fcu b = new fcu(0.0, 0.0, 0.0);
   private static final akg<Integer> c = akk.a(csh.class, aki.b);
   private static final akg<Integer> d = akk.a(csh.class, aki.b);
   private static final akg<Boolean> h = akk.a(csh.class, aki.k);
   private static final ImmutableMap<bxd, ImmutableList<Integer>> i = ImmutableMap.of(
      bxd.a, ImmutableList.of(0, 1, -1), bxd.f, ImmutableList.of(0, 1, -1), bxd.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private boolean j;
   private boolean k;
   private final csp l;
   private static final Map<dzq, Pair<kn, kn>> m = Maps.newEnumMap(
      (Map)af.a(
         () -> {
            kn $$0 = jo.e.q();
            kn $$1 = jo.f.q();
            kn $$2 = jo.c.q();
            kn $$3 = jo.d.q();
            kn $$4 = $$0.p();
            kn $$5 = $$1.p();
            kn $$6 = $$2.p();
            kn $$7 = $$3.p();
            return ImmutableMap.of(
               dzq.a,
               Pair.of($$2, $$3),
               dzq.b,
               Pair.of($$0, $$1),
               dzq.c,
               Pair.of($$4, $$1),
               dzq.d,
               Pair.of($$0, $$5),
               dzq.e,
               Pair.of($$2, $$7),
               dzq.f,
               Pair.of($$6, $$3),
               dzq.g,
               Pair.of($$3, $$1),
               dzq.h,
               Pair.of($$3, $$0),
               dzq.i,
               Pair.of($$2, $$0),
               dzq.j,
               Pair.of($$2, $$1)
            );
         }
      )
   );

   protected csh(bwb<?> $$0, dhp $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.l = new csw(this);
      } else {
         this.l = new csx(this);
      }
   }

   protected csh(bwb<?> $$0, dhp $$1, double $$2, double $$3, double $$4) {
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
   public static <T extends csh> T a(dhp $$0, double $$1, double $$2, double $$3, bwb<T> $$4, bwa $$5, cxy $$6, @Nullable cqi $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bwb.a($$0, $$6, $$7).accept($$8);
         if ($$8.f() instanceof csw $$9) {
            jj $$10 = $$8.j();
            dym $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public csp f() {
      return this.l;
   }

   @Override
   protected bvs.d bg() {
      return bvs.d.c;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, dku.j(dkw.a.m()));
      $$0.a(d, 6);
      $$0.a(h, false);
   }

   @Override
   public boolean i(bvs $$0) {
      return csf.a(this, $$0);
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public fcu a(jo.a $$0, l.a $$1) {
      return bwr.k(super.a($$0, $$1));
   }

   @Override
   protected fcu a(bvs $$0, bvv $$1, float $$2) {
      boolean $$3 = $$0 instanceof cpu || $$0 instanceof cqa;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public fcu b(bwr $$0) {
      jo $$1 = this.cP();
      if ($$1.o() == jo.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = csn.a($$1);
         jj $$3 = this.dv();
         jj.a $$4 = new jj.a();
         ImmutableList<bxd> $$5 = $$0.fN();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bxd $$6 = (bxd)$$14.next();
            bvv $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dV().a(csn.a(this.dV(), $$4), () -> csn.a(this.dV(), $$4.e()));
                  if (csn.a($$11)) {
                     fcp $$12 = new fcp((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     fcu $$13 = fcu.a($$4, $$11);
                     if (csn.a(this.dV(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cR().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bxd $$15 = (bxd)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azk.c($$14x - (double)$$4.v() + $$16);
            double $$18 = csn.a($$4, $$17, $$0x -> this.dV().a_($$0x).g(this.dV(), $$0x));
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
      dym $$0 = this.dV().a_(this.dv());
      return $$0.a(awz.P) ? 1.0F : super.aT();
   }

   @Override
   public void q(float $$0) {
      this.l(-this.J());
      this.d(10);
      this.b(this.H() + this.H() * 10.0F);
   }

   @Override
   public boolean bG() {
      return !this.dQ();
   }

   public static Pair<kn, kn> a(dzq $$0) {
      return m.get($$0);
   }

   @Override
   public jo cP() {
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
      this.bW();
      this.l.b();
      this.bp();
      if (this.bw()) {
         this.aE();
         this.Z *= 0.5;
      }

      this.ak = false;
   }

   public boolean g() {
      return this.ak;
   }

   public jj j() {
      int $$0 = azk.a(this.dA());
      int $$1 = azk.a(this.dC());
      int $$2 = azk.a(this.dG());
      if (b(this.dV())) {
         double $$3 = this.dC() - 0.1 - 1.0E-5F;
         if (this.dV().a_(jj.a((double)$$0, $$3, (double)$$2)).a(awz.P)) {
            $$1 = azk.a($$3);
         }
      } else if (this.dV().a_(new jj($$0, $$1 - 1, $$2)).a(awz.P)) {
         $$1--;
      }

      return new jj($$0, $$1, $$2);
   }

   protected double a(arn $$0) {
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
   public boolean bp() {
      return super.bp();
   }

   @Override
   public fcu ah() {
      return this.l.c(super.ah());
   }

   @Override
   public bwm N_() {
      return this.l.a();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.l.a($$0, $$1, $$2);
   }

   protected void b(arn $$0) {
      this.l.a($$0);
   }

   protected void e(arn $$0) {
      double $$1 = this.a($$0);
      fcu $$2 = this.dy();
      this.n(azk.a($$2.d, -$$1, $$1), $$2.e, azk.a($$2.f, -$$1, $$1));
      if (this.aJ()) {
         this.i(this.dy().c(0.5));
      }

      this.a(bwv.a, this.dy());
      if (!this.aJ()) {
         this.i(this.dy().c(0.95));
      }
   }

   protected double a(jj $$0, dzq $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(bwv $$0, fcu $$1) {
      if (b(this.dV())) {
         fcu $$2 = this.dt().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.d();
         if ($$3) {
            super.a($$0, $$2.d(this.dt()));
         }

         if ($$0.equals(bwv.c)) {
            this.j = false;
         }
      } else {
         super.a($$0, $$1);
         this.aK();
      }
   }

   @Override
   public void aK() {
      if (!b(this.dV())) {
         this.a(this.dt(), this.dt());
      } else {
         super.aK();
      }
   }

   @Override
   public boolean cq() {
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

   public fcu a(jj $$0) {
      dym $$1 = this.dV().a_($$0);
      if ($$1.a(dkw.bw) && $$1.c(dqv.d)) {
         dzq $$2 = $$1.c(((dkj)$$1.b()).c());
         if ($$2 == dzq.b) {
            if (this.b($$0.h())) {
               return new fcu(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new fcu(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dzq.a) {
            if (this.b($$0.f())) {
               return new fcu(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new fcu(0.0, 0.0, -1.0);
            }
         }

         return fcu.c;
      } else {
         return fcu.c;
      }
   }

   public boolean b(jj $$0) {
      return this.dV().a_($$0).d(this.dV(), $$0);
   }

   @Override
   protected fcu a(fcu $$0) {
      double $$1 = this.l.m();
      fcu $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bj()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(tw $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(ul.a(this.dV().a(me.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.k = $$0.q("FlippedRotation");
      this.ak = $$0.q("HasTicked");
   }

   @Override
   protected void b(tw $$0) {
      if (this.y()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", ul.a(this.n()));
         $$0.a("DisplayOffset", this.w());
      }

      $$0.a("FlippedRotation", this.k);
      $$0.a("HasTicked", this.ak);
   }

   @Override
   public void h(bvs $$0) {
      if (!this.dV().C) {
         if (!$$0.ad && !this.ad) {
            if (!this.y($$0)) {
               double $$1 = $$0.dA() - this.dA();
               double $$2 = $$0.dG() - this.dG();
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
                  if ($$0 instanceof csh $$5) {
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

   private void a(csh $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dV())) {
         $$3 = this.dy().d;
         $$4 = this.dy().f;
      } else {
         $$3 = $$0.dA() - this.dA();
         $$4 = $$0.dG() - this.dG();
      }

      fcu $$7 = new fcu($$3, 0.0, $$4).d();
      fcu $$8 = new fcu((double)azk.b(this.dL() * (float) (Math.PI / 180.0)), 0.0, (double)azk.a(this.dL() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dV())) {
         fcu $$10 = this.dy();
         fcu $$11 = $$0.dy();
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

   public dym n() {
      return !this.y() ? this.v() : dku.a(this.au().a(c));
   }

   public dym v() {
      return dkw.a.m();
   }

   public int w() {
      return !this.y() ? this.x() : this.au().a(d);
   }

   public int x() {
      return 6;
   }

   public void c(dym $$0) {
      this.au().a(c, dku.j($$0));
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

   public static boolean b(dhp $$0) {
      return $$0.K().b(ctg.d);
   }

   @Override
   public abstract cxy dI();

   public boolean z() {
      return false;
   }

   public boolean A() {
      return false;
   }
}
