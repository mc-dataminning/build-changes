import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cqt extends crl {
   private static final ezy b = new ezy(0.0, 0.0, 0.0);
   private static final akm<Integer> c = akq.a(cqt.class, ako.b);
   private static final akm<Integer> d = akq.a(cqt.class, ako.b);
   private static final akm<Boolean> h = akq.a(cqt.class, ako.k);
   private static final ImmutableMap<bvt, ImmutableList<Integer>> i = ImmutableMap.of(
      bvt.a, ImmutableList.of(0, 1, -1), bvt.f, ImmutableList.of(0, 1, -1), bvt.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private boolean j;
   private boolean k;
   private final crb l;
   private static final Map<dwy, Pair<kl, kl>> m = ae.a(Maps.newEnumMap(dwy.class), $$0 -> {
      kl $$1 = jm.e.q();
      kl $$2 = jm.f.q();
      kl $$3 = jm.c.q();
      kl $$4 = jm.d.q();
      kl $$5 = $$1.p();
      kl $$6 = $$2.p();
      kl $$7 = $$3.p();
      kl $$8 = $$4.p();
      $$0.put(dwy.a, Pair.of($$3, $$4));
      $$0.put(dwy.b, Pair.of($$1, $$2));
      $$0.put(dwy.c, Pair.of($$5, $$2));
      $$0.put(dwy.d, Pair.of($$1, $$6));
      $$0.put(dwy.e, Pair.of($$3, $$8));
      $$0.put(dwy.f, Pair.of($$7, $$4));
      $$0.put(dwy.g, Pair.of($$4, $$2));
      $$0.put(dwy.h, Pair.of($$4, $$1));
      $$0.put(dwy.i, Pair.of($$3, $$1));
      $$0.put(dwy.j, Pair.of($$3, $$2));
   });

   protected cqt(bus<?> $$0, dfm $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.l = new cri(this);
      } else {
         this.l = new crj(this);
      }
   }

   protected cqt(bus<?> $$0, dfm $$1, double $$2, double $$3, double $$4) {
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
   public static <T extends cqt> T a(dfm $$0, double $$1, double $$2, double $$3, bus<T> $$4, bur $$5, cwm $$6, @Nullable cou $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         bus.a($$0, $$6, $$7).accept($$8);
         if ($$8.j() instanceof cri $$9) {
            jh $$10 = $$8.n();
            dvv $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public crb j() {
      return this.l;
   }

   @Override
   protected bul.b bg() {
      return bul.b.c;
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(c, diq.j(dis.a.m()));
      $$0.a(d, 6);
      $$0.a(h, false);
   }

   @Override
   public boolean i(bul $$0) {
      return cqr.a(this, $$0);
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   public ezy a(jm.a $$0, l.a $$1) {
      return bvh.j(super.a($$0, $$1));
   }

   @Override
   protected ezy a(bul $$0, buo $$1, float $$2) {
      boolean $$3 = $$0 instanceof cof || $$0 instanceof col;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public ezy b(bvh $$0) {
      jm $$1 = this.cP();
      if ($$1.o() == jm.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cqz.a($$1);
         jh $$3 = this.dv();
         jh.a $$4 = new jh.a();
         ImmutableList<bvt> $$5 = $$0.fM();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bvt $$6 = (bvt)$$14.next();
            buo $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dV().a(cqz.a(this.dV(), $$4), () -> cqz.a(this.dV(), $$4.e()));
                  if (cqz.a($$11)) {
                     ezt $$12 = new ezt((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     ezy $$13 = ezy.a($$4, $$11);
                     if (cqz.a(this.dV(), $$0, $$12.c($$13))) {
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
            bvt $$15 = (bvt)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azm.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cqz.a($$4, $$17, $$0x -> this.dV().a_($$0x).g(this.dV(), $$0x));
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
      dvv $$0 = this.dV().a_(this.dv());
      return $$0.a(axc.O) ? 1.0F : super.aT();
   }

   @Override
   public void p(float $$0) {
      this.l(-this.N());
      this.d(10);
      this.b(this.K() + this.K() * 10.0F);
   }

   @Override
   public boolean bH() {
      return !this.dQ();
   }

   public static Pair<kl, kl> a(dwy $$0) {
      return m.get($$0);
   }

   @Override
   public jm cP() {
      return this.l.p();
   }

   @Override
   protected double bd() {
      return this.bj() ? 0.005 : 0.04;
   }

   @Override
   public void h() {
      if (this.L() > 0) {
         this.d(this.L() - 1);
      }

      if (this.K() > 0.0F) {
         this.b(this.K() - 1.0F);
      }

      this.aA();
      this.bW();
      this.l.f();
      this.bq();
      if (this.bx()) {
         this.aE();
         this.Z *= 0.5F;
      }

      this.ak = false;
   }

   public boolean l() {
      return this.ak;
   }

   public jh n() {
      int $$0 = azm.a(this.dA());
      int $$1 = azm.a(this.dC());
      int $$2 = azm.a(this.dG());
      if (b(this.dV())) {
         double $$3 = this.dC() - 0.1 - 1.0E-5F;
         if (this.dV().a_(jh.a((double)$$0, $$3, (double)$$2)).a(axc.O)) {
            $$1 = azm.a($$3);
         }
      } else if (this.dV().a_(new jh($$0, $$1 - 1, $$2)).a(axc.O)) {
         $$1--;
      }

      return new jh($$0, $$1, $$2);
   }

   protected double a(arp $$0) {
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
   public boolean bq() {
      return super.bq();
   }

   @Override
   public ezy ah() {
      return this.l.c(super.ah());
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.l.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public double f_() {
      return this.l.a();
   }

   @Override
   public double P_() {
      return this.l.b();
   }

   @Override
   public double Q_() {
      return this.l.c();
   }

   @Override
   public float g_() {
      return this.l.d();
   }

   @Override
   public float q_() {
      return this.l.e();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.l.a($$0, $$1, $$2);
   }

   protected void b(arp $$0) {
      this.l.a($$0);
   }

   protected void e(arp $$0) {
      double $$1 = this.a($$0);
      ezy $$2 = this.dy();
      this.n(azm.a($$2.d, -$$1, $$1), $$2.e, azm.a($$2.f, -$$1, $$1));
      if (this.aJ()) {
         this.h(this.dy().c(0.5));
      }

      this.a(bvl.a, this.dy());
      if (!this.aJ()) {
         this.h(this.dy().c(0.95));
      }
   }

   protected double a(jh $$0, dwy $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(bvl $$0, ezy $$1) {
      if (b(this.dV())) {
         ezy $$2 = this.dt().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.h();
         if ($$3) {
            super.a($$0, $$2.d(this.dt()));
         }

         if ($$0.equals(bvl.c)) {
            this.j = false;
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean cq() {
      return this.j;
   }

   public void a(boolean $$0) {
      this.j = $$0;
   }

   public boolean q() {
      return this.k;
   }

   public void b(boolean $$0) {
      this.k = $$0;
   }

   public ezy a(jh $$0) {
      dvv $$1 = this.dV().a_($$0);
      if ($$1.a(dis.bp) && $$1.c(dom.f)) {
         dwy $$2 = $$1.c(((dif)$$1.b()).c());
         if ($$2 == dwy.b) {
            if (this.b($$0.h())) {
               return new ezy(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new ezy(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dwy.a) {
            if (this.b($$0.f())) {
               return new ezy(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new ezy(0.0, 0.0, -1.0);
            }
         }

         return ezy.c;
      } else {
         return ezy.c;
      }
   }

   public boolean b(jh $$0) {
      return this.dV().a_($$0).d(this.dV(), $$0);
   }

   @Override
   protected ezy a(ezy $$0) {
      double $$1 = this.l.q();
      ezy $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bj()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(ul $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(va.a(this.dV().a(ma.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.k = $$0.q("FlippedRotation");
      this.ak = $$0.q("HasTicked");
   }

   @Override
   protected void b(ul $$0) {
      if (this.z()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", va.a(this.s()));
         $$0.a("DisplayOffset", this.x());
      }

      $$0.a("FlippedRotation", this.k);
      $$0.a("HasTicked", this.ak);
   }

   @Override
   public void h(bul $$0) {
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
                  if ($$0 instanceof cqt $$5) {
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

   private void a(cqt $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dV())) {
         $$3 = this.dy().d;
         $$4 = this.dy().f;
      } else {
         $$3 = $$0.dA() - this.dA();
         $$4 = $$0.dG() - this.dG();
      }

      ezy $$7 = new ezy($$3, 0.0, $$4).d();
      ezy $$8 = new ezy((double)azm.b(this.dL() * (float) (Math.PI / 180.0)), 0.0, (double)azm.a(this.dL() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dV())) {
         ezy $$10 = this.dy();
         ezy $$11 = $$0.dy();
         if ($$0.D() && !this.D()) {
            this.h($$10.d(0.2, 1.0, 0.2));
            this.j($$11.d - $$1, 0.0, $$11.f - $$2);
            $$0.h($$11.d(0.95, 1.0, 0.95));
         } else if (!$$0.D() && this.D()) {
            $$0.h($$11.d(0.2, 1.0, 0.2));
            $$0.j($$10.d + $$1, 0.0, $$10.f + $$2);
            this.h($$10.d(0.95, 1.0, 0.95));
         } else {
            double $$12 = ($$11.d + $$10.d) / 2.0;
            double $$13 = ($$11.f + $$10.f) / 2.0;
            this.h($$10.d(0.2, 1.0, 0.2));
            this.j($$12 - $$1, 0.0, $$13 - $$2);
            $$0.h($$11.d(0.2, 1.0, 0.2));
            $$0.j($$12 + $$1, 0.0, $$13 + $$2);
         }
      }
   }

   public dvv s() {
      return !this.z() ? this.w() : diq.a(this.au().a(c));
   }

   public dvv w() {
      return dis.a.m();
   }

   public int x() {
      return !this.z() ? this.y() : this.au().a(d);
   }

   public int y() {
      return 6;
   }

   public void c(dvv $$0) {
      this.au().a(c, diq.j($$0));
      this.r(true);
   }

   public void c(int $$0) {
      this.au().a(d, $$0);
      this.r(true);
   }

   public boolean z() {
      return this.au().a(h);
   }

   public void r(boolean $$0) {
      this.au().a(h, $$0);
   }

   public static boolean b(dfm $$0) {
      return $$0.J().b(crs.d);
   }

   @Override
   public abstract cwm dI();

   public boolean A() {
      return false;
   }

   public boolean D() {
      return false;
   }
}
