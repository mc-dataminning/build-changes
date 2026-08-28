import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cqu extends crm {
   private static final fay b = new fay(0.0, 0.0, 0.0);
   private static final ajx<Integer> c = akb.a(cqu.class, ajz.b);
   private static final ajx<Integer> d = akb.a(cqu.class, ajz.b);
   private static final ajx<Boolean> h = akb.a(cqu.class, ajz.k);
   private static final ImmutableMap<bvr, ImmutableList<Integer>> i = ImmutableMap.of(
      bvr.a, ImmutableList.of(0, 1, -1), bvr.f, ImmutableList.of(0, 1, -1), bvr.d, ImmutableList.of(0, 1)
   );
   protected static final float a = 0.95F;
   private boolean j;
   private boolean k;
   private final crc l;
   private static final Map<dxy, Pair<km, km>> m = af.a(Maps.newEnumMap(dxy.class), $$0 -> {
      km $$1 = jn.e.q();
      km $$2 = jn.f.q();
      km $$3 = jn.c.q();
      km $$4 = jn.d.q();
      km $$5 = $$1.p();
      km $$6 = $$2.p();
      km $$7 = $$3.p();
      km $$8 = $$4.p();
      $$0.put(dxy.a, Pair.of($$3, $$4));
      $$0.put(dxy.b, Pair.of($$1, $$2));
      $$0.put(dxy.c, Pair.of($$5, $$2));
      $$0.put(dxy.d, Pair.of($$1, $$6));
      $$0.put(dxy.e, Pair.of($$3, $$8));
      $$0.put(dxy.f, Pair.of($$7, $$4));
      $$0.put(dxy.g, Pair.of($$4, $$2));
      $$0.put(dxy.h, Pair.of($$4, $$1));
      $$0.put(dxy.i, Pair.of($$3, $$1));
      $$0.put(dxy.j, Pair.of($$3, $$2));
   });

   protected cqu(buq<?> $$0, dgg $$1) {
      super($$0, $$1);
      this.I = true;
      if (b($$1)) {
         this.l = new crj(this);
      } else {
         this.l = new crk(this);
      }
   }

   protected cqu(buq<?> $$0, dgg $$1, double $$2, double $$3, double $$4) {
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
   public static <T extends cqu> T a(dgg $$0, double $$1, double $$2, double $$3, buq<T> $$4, bup $$5, cwn $$6, @Nullable cov $$7) {
      T $$8 = (T)$$4.a($$0, $$5);
      if ($$8 != null) {
         $$8.p($$1, $$2, $$3);
         buq.a($$0, $$6, $$7).accept($$8);
         if ($$8.l() instanceof crj $$9) {
            ji $$10 = $$8.p();
            dwv $$11 = $$0.a_($$10);
            $$9.a($$10, $$11, true);
         }
      }

      return $$8;
   }

   public crc l() {
      return this.l;
   }

   @Override
   protected buj.c bg() {
      return buj.c.c;
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(c, djk.j(djm.a.m()));
      $$0.a(d, 6);
      $$0.a(h, false);
   }

   @Override
   public boolean i(buj $$0) {
      return cqs.a(this, $$0);
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   public fay a(jn.a $$0, l.a $$1) {
      return bvf.j(super.a($$0, $$1));
   }

   @Override
   protected fay a(buj $$0, bum $$1, float $$2) {
      boolean $$3 = $$0 instanceof cog || $$0 instanceof com;
      return $$3 ? b : super.a($$0, $$1, $$2);
   }

   @Override
   public fay b(bvf $$0) {
      jn $$1 = this.cP();
      if ($$1.o() == jn.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cra.a($$1);
         ji $$3 = this.dw();
         ji.a $$4 = new ji.a();
         ImmutableList<bvr> $$5 = $$0.fO();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bvr $$6 = (bvr)$$14.next();
            bum $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dW().a(cra.a(this.dW(), $$4), () -> cra.a(this.dW(), $$4.e()));
                  if (cra.a($$11)) {
                     fat $$12 = new fat((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     fay $$13 = fay.a($$4, $$11);
                     if (cra.a(this.dW(), $$0, $$12.c($$13))) {
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
            bvr $$15 = (bvr)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = ayy.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cra.a($$4, $$17, $$0x -> this.dW().a_($$0x).g(this.dW(), $$0x));
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
      dwv $$0 = this.dW().a_(this.dw());
      return $$0.a(awo.P) ? 1.0F : super.aT();
   }

   @Override
   public void p(float $$0) {
      this.l(-this.O());
      this.d(10);
      this.b(this.L() + this.L() * 10.0F);
   }

   @Override
   public boolean bH() {
      return !this.dR();
   }

   public static Pair<km, km> a(dxy $$0) {
      return m.get($$0);
   }

   @Override
   public jn cP() {
      return this.l.q();
   }

   @Override
   protected double bd() {
      return this.bj() ? 0.005 : 0.04;
   }

   @Override
   public void h() {
      if (this.N() > 0) {
         this.d(this.N() - 1);
      }

      if (this.L() > 0.0F) {
         this.b(this.L() - 1.0F);
      }

      this.aA();
      this.bW();
      this.l.g();
      this.bq();
      if (this.bx()) {
         this.aE();
         this.Z *= 0.5F;
      }

      this.ak = false;
   }

   public boolean m() {
      return this.ak;
   }

   public ji p() {
      int $$0 = ayy.a(this.dB());
      int $$1 = ayy.a(this.dD());
      int $$2 = ayy.a(this.dH());
      if (b(this.dW())) {
         double $$3 = this.dD() - 0.1 - 1.0E-5F;
         if (this.dW().a_(ji.a((double)$$0, $$3, (double)$$2)).a(awo.P)) {
            $$1 = ayy.a($$3);
         }
      } else if (this.dW().a_(new ji($$0, $$1 - 1, $$2)).a(awo.P)) {
         $$1--;
      }

      return new ji($$0, $$1, $$2);
   }

   protected double a(arc $$0) {
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
   public fay ah() {
      return this.l.c(super.ah());
   }

   @Override
   public void f_() {
      this.l.a();
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.l.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public double R_() {
      return this.l.b();
   }

   @Override
   public double S_() {
      return this.l.c();
   }

   @Override
   public double g_() {
      return this.l.d();
   }

   @Override
   public float r_() {
      return this.l.e();
   }

   @Override
   public float h_() {
      return this.l.f();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.l.a($$0, $$1, $$2);
   }

   protected void b(arc $$0) {
      this.l.a($$0);
   }

   protected void e(arc $$0) {
      double $$1 = this.a($$0);
      fay $$2 = this.dz();
      this.n(ayy.a($$2.d, -$$1, $$1), $$2.e, ayy.a($$2.f, -$$1, $$1));
      if (this.aJ()) {
         this.h(this.dz().c(0.5));
      }

      this.a(bvj.a, this.dz());
      if (!this.aJ()) {
         this.h(this.dz().c(0.95));
      }
   }

   protected double a(ji $$0, dxy $$1, double $$2) {
      return this.l.a($$0, $$1, $$2);
   }

   @Override
   public void a(bvj $$0, fay $$1) {
      if (b(this.dW())) {
         fay $$2 = this.du().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.l.i();
         if ($$3) {
            super.a($$0, $$2.d(this.du()));
         }

         if ($$0.equals(bvj.c)) {
            this.j = false;
         }
      } else {
         super.a($$0, $$1);
         this.aK();
      }
   }

   @Override
   public void aK() {
      if (!b(this.dW())) {
         this.a(this.du(), this.du());
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

   @Override
   public boolean s() {
      return this.k;
   }

   public void b(boolean $$0) {
      this.k = $$0;
   }

   public fay a(ji $$0) {
      dwv $$1 = this.dW().a_($$0);
      if ($$1.a(djm.bw) && $$1.c(dpl.f)) {
         dxy $$2 = $$1.c(((diz)$$1.b()).c());
         if ($$2 == dxy.b) {
            if (this.b($$0.h())) {
               return new fay(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new fay(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dxy.a) {
            if (this.b($$0.f())) {
               return new fay(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new fay(0.0, 0.0, -1.0);
            }
         }

         return fay.c;
      } else {
         return fay.c;
      }
   }

   public boolean b(ji $$0) {
      return this.dW().a_($$0).d(this.dW(), $$0);
   }

   protected fay a(fay $$0) {
      double $$1 = this.l.r();
      fay $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bj()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(tq $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(uf.a(this.dW().a(mc.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.k = $$0.q("FlippedRotation");
      this.ak = $$0.q("HasTicked");
   }

   @Override
   protected void b(tq $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", uf.a(this.t()));
         $$0.a("DisplayOffset", this.y());
      }

      $$0.a("FlippedRotation", this.k);
      $$0.a("HasTicked", this.ak);
   }

   @Override
   public void h(buj $$0) {
      if (!this.dW().C) {
         if (!$$0.ad && !this.ad) {
            if (!this.y($$0)) {
               double $$1 = $$0.dB() - this.dB();
               double $$2 = $$0.dH() - this.dH();
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
                  if ($$0 instanceof cqu $$5) {
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

   private void a(cqu $$0, double $$1, double $$2) {
      double $$3;
      double $$4;
      if (b(this.dW())) {
         $$3 = this.dz().d;
         $$4 = this.dz().f;
      } else {
         $$3 = $$0.dB() - this.dB();
         $$4 = $$0.dH() - this.dH();
      }

      fay $$7 = new fay($$3, 0.0, $$4).d();
      fay $$8 = new fay((double)ayy.b(this.dM() * (float) (Math.PI / 180.0)), 0.0, (double)ayy.a(this.dM() * (float) (Math.PI / 180.0))).d();
      double $$9 = Math.abs($$7.b($$8));
      if (!($$9 < 0.8F) || b(this.dW())) {
         fay $$10 = this.dz();
         fay $$11 = $$0.dz();
         if ($$0.E() && !this.E()) {
            this.h($$10.d(0.2, 1.0, 0.2));
            this.j($$11.d - $$1, 0.0, $$11.f - $$2);
            $$0.h($$11.d(0.95, 1.0, 0.95));
         } else if (!$$0.E() && this.E()) {
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

   public dwv t() {
      return !this.A() ? this.w() : djk.a(this.au().a(c));
   }

   public dwv w() {
      return djm.a.m();
   }

   public int y() {
      return !this.A() ? this.z() : this.au().a(d);
   }

   public int z() {
      return 6;
   }

   public void c(dwv $$0) {
      this.au().a(c, djk.j($$0));
      this.r(true);
   }

   public void c(int $$0) {
      this.au().a(d, $$0);
      this.r(true);
   }

   public boolean A() {
      return this.au().a(h);
   }

   public void r(boolean $$0) {
      this.au().a(h, $$0);
   }

   public static boolean b(dgg $$0) {
      return $$0.K().b(crt.d);
   }

   @Override
   public abstract cwn dJ();

   public boolean D() {
      return false;
   }

   public boolean E() {
      return false;
   }
}
