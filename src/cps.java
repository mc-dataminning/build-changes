import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cps extends cqi {
   private static final eys c = new eys(0.0, 0.0, 0.0);
   private static final akg<Integer> d = akk.a(cps.class, aki.b);
   private static final akg<Integer> e = akk.a(cps.class, aki.b);
   private static final akg<Boolean> i = akk.a(cps.class, aki.k);
   private static final ImmutableMap<buw, ImmutableList<Integer>> j = ImmutableMap.of(
      buw.a, ImmutableList.of(0, 1, -1), buw.f, ImmutableList.of(0, 1, -1), buw.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean k;
   private boolean l;
   private eys m = eys.c;
   private final cpz n;
   private static final Map<dvs, Pair<ki, ki>> o = ad.a(Maps.newEnumMap(dvs.class), $$0 -> {
      ki $$1 = jj.e.q();
      ki $$2 = jj.f.q();
      ki $$3 = jj.c.q();
      ki $$4 = jj.d.q();
      ki $$5 = $$1.p();
      ki $$6 = $$2.p();
      ki $$7 = $$3.p();
      ki $$8 = $$4.p();
      $$0.put(dvs.a, Pair.of($$3, $$4));
      $$0.put(dvs.b, Pair.of($$1, $$2));
      $$0.put(dvs.c, Pair.of($$5, $$2));
      $$0.put(dvs.d, Pair.of($$1, $$6));
      $$0.put(dvs.e, Pair.of($$3, $$8));
      $$0.put(dvs.f, Pair.of($$7, $$4));
      $$0.put(dvs.g, Pair.of($$4, $$2));
      $$0.put(dvs.h, Pair.of($$4, $$1));
      $$0.put(dvs.i, Pair.of($$3, $$1));
      $$0.put(dvs.j, Pair.of($$3, $$2));
   });

   protected cps(btv<?> $$0, deg $$1) {
      super($$0, $$1);
      this.J = true;
      if (b($$1)) {
         this.n = new cqg(this);
      } else {
         this.n = new cqh(this);
      }
   }

   protected cps(btv<?> $$0, deg $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cps a(deg $$0, double $$1, double $$2, double $$3, cps.a $$4, cvp $$5, @Nullable cnu $$6) {
      cps $$7 = (cps)(switch ($$4) {
         case b -> new cqa($$0, $$1, $$2, $$3);
         case c -> new cqc($$0, $$1, $$2, $$3);
         case d -> new cqf($$0, $$1, $$2, $$3);
         case e -> new cqe($$0, $$1, $$2, $$3);
         case f -> new cqd($$0, $$1, $$2, $$3);
         case g -> new cqb($$0, $$1, $$2, $$3);
         default -> new cpy($$0, $$1, $$2, $$3);
      });
      btv.<cps>a($$0, $$5, $$6).accept($$7);
      if ($$7.m() instanceof cqg $$8) {
         je $$9 = $$7.q();
         duo $$10 = $$0.a_($$9);
         $$8.a($$9, $$10, true);
      }

      return $$7;
   }

   public cpz m() {
      return this.n;
   }

   @Override
   protected bto.b bf() {
      return bto.b.c;
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, dhj.j(dhl.a.o()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(bto $$0) {
      return cpu.a(this, $$0);
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public eys a(jj.a $$0, l.a $$1) {
      return buk.j(super.a($$0, $$1));
   }

   @Override
   protected eys a(bto $$0, btr $$1, float $$2) {
      boolean $$3 = $$0 instanceof cnh || $$0 instanceof cnn;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public eys b(buk $$0) {
      jj $$1 = this.cM();
      if ($$1.o() == jj.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cpx.a($$1);
         je $$3 = this.ds();
         je.a $$4 = new je.a();
         ImmutableList<buw> $$5 = $$0.fJ();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            buw $$6 = (buw)$$14.next();
            btr $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dS().a(cpx.a(this.dS(), $$4), () -> cpx.a(this.dS(), $$4.e()));
                  if (cpx.a($$11)) {
                     eyn $$12 = new eyn((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     eys $$13 = eys.a($$4, $$11);
                     if (cpx.a(this.dS(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cO().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            buw $$15 = (buw)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azd.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cpx.a($$4, $$17, $$0x -> this.dS().a_($$0x).g(this.dS(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aR() {
      duo $$0 = this.dS().a_(this.ds());
      return $$0.a(awt.O) ? 1.0F : super.aR();
   }

   @Override
   public void p(float $$0) {
      this.m(-this.T());
      this.d(10);
      this.b(this.R() + this.R() * 10.0F);
   }

   @Override
   public boolean bE() {
      return !this.dN();
   }

   public static Pair<ki, ki> a(dvs $$0) {
      return o.get($$0);
   }

   @Override
   public jj cM() {
      return this.n.q();
   }

   @Override
   protected double bc() {
      return this.bi() ? 0.005 : 0.04;
   }

   @Override
   public void l() {
      if (this.S() > 0) {
         this.d(this.S() - 1);
      }

      if (this.R() > 0.0F) {
         this.b(this.R() - 1.0F);
      }

      this.az();
      this.bT();
      this.n.f();
      this.bp();
      if (this.bw()) {
         this.aD();
         this.aa *= 0.5F;
      }

      this.al = false;
   }

   public boolean o() {
      return this.al;
   }

   public je q() {
      int $$0 = azd.a(this.dx());
      int $$1 = azd.a(this.dz());
      int $$2 = azd.a(this.dD());
      if (b(this.dS())) {
         double $$3 = this.dz() - 0.1 - 1.0E-5F;
         if (this.dS().a_(je.a((double)$$0, $$3, (double)$$2)).a(awt.O)) {
            $$1 = azd.a($$3);
         }
      } else if (this.dS().a_(new je($$0, $$1 - 1, $$2)).a(awt.O)) {
         $$1--;
      }

      return new je($$0, $$1, $$2);
   }

   protected double t() {
      return this.n.r();
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   public void a(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void be() {
      super.be();
   }

   @Override
   public void ax() {
      super.ax();
   }

   @Override
   public boolean bp() {
      return super.bp();
   }

   @Override
   public eys ai() {
      return this.n.c(super.ai());
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.n.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public double c_() {
      return this.n.a();
   }

   @Override
   public double d_() {
      return this.n.b();
   }

   @Override
   public double N_() {
      return this.n.c();
   }

   @Override
   public float O_() {
      return this.n.d();
   }

   @Override
   public float e_() {
      return this.n.e();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.n.a($$0, $$1, $$2);
   }

   protected void v() {
      this.n.h();
   }

   @Override
   protected void w() {
      double $$0 = this.t();
      eys $$1 = this.dv();
      this.n(azd.a($$1.d, -$$0, $$0), $$1.e, azd.a($$1.f, -$$0, $$0));
      if (this.aH()) {
         this.h(this.dv().c(0.5));
      }

      this.a(buo.a, this.dv());
      if (!this.aH()) {
         this.h(this.dv().c(0.95));
      }
   }

   protected double a(je $$0, dvs $$1, double $$2) {
      return this.n.a($$0, $$1, $$2);
   }

   @Override
   public void a(buo $$0, eys $$1) {
      if (b(this.dS())) {
         eys $$2 = this.dq().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.n.i();
         if ($$3) {
            super.a($$0, $$2.d(this.dq()));
         }

         if ($$0.equals(buo.c)) {
            this.k = false;
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean cn() {
      return this.k;
   }

   public void a(boolean $$0) {
      this.k = $$0;
   }

   public boolean x() {
      return this.l;
   }

   public void b(boolean $$0) {
      this.l = $$0;
   }

   public eys a(je $$0) {
      duo $$1 = this.dS().a_($$0);
      if ($$1.a(dhl.bp) && $$1.c(dng.f)) {
         dvs $$2 = $$1.c(((dgy)$$1.b()).c());
         if ($$2 == dvs.b) {
            if (this.b($$0.h())) {
               return new eys(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new eys(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dvs.a) {
            if (this.b($$0.f())) {
               return new eys(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new eys(0.0, 0.0, -1.0);
            }
         }

         return eys.c;
      } else {
         return eys.c;
      }
   }

   public boolean b(je $$0) {
      return this.dS().a_($$0).d(this.dS(), $$0);
   }

   @Override
   protected eys a(eys $$0) {
      double $$1 = this.n.s();
      eys $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bi()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(uf $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(uu.a(this.dS().a(lv.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.l = $$0.q("FlippedRotation");
      this.al = $$0.q("HasTicked");
   }

   @Override
   protected void b(uf $$0) {
      if (this.D()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", uu.a(this.z()));
         $$0.a("DisplayOffset", this.B());
      }

      $$0.a("FlippedRotation", this.l);
      $$0.a("HasTicked", this.al);
   }

   @Override
   public void h(bto $$0) {
      if (!this.dS().B) {
         if (!$$0.ae && !this.ae) {
            if (!this.y($$0)) {
               double $$1 = $$0.dx() - this.dx();
               double $$2 = $$0.dD() - this.dD();
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
                  if ($$0 instanceof cps) {
                     double $$5;
                     double $$6;
                     if (b(this.dS())) {
                        $$5 = this.dv().d;
                        $$6 = this.dv().f;
                     } else {
                        $$5 = $$0.dx() - this.dx();
                        $$6 = $$0.dD() - this.dD();
                     }

                     eys $$9 = new eys($$5, 0.0, $$6).d();
                     eys $$10 = new eys((double)azd.b(this.dI() * (float) (Math.PI / 180.0)), 0.0, (double)azd.a(this.dI() * (float) (Math.PI / 180.0))).d();
                     double $$11 = Math.abs($$9.b($$10));
                     if ($$11 < 0.8F && !b(this.dS())) {
                        return;
                     }

                     eys $$12 = this.dv();
                     eys $$13 = $$0.dv();
                     if (((cps)$$0).y() == cps.a.c && this.y() != cps.a.c) {
                        this.h($$12.d(0.2, 1.0, 0.2));
                        this.j($$13.d - $$1, 0.0, $$13.f - $$2);
                        $$0.h($$13.d(0.95, 1.0, 0.95));
                     } else if (((cps)$$0).y() != cps.a.c && this.y() == cps.a.c) {
                        $$0.h($$13.d(0.2, 1.0, 0.2));
                        $$0.j($$12.d + $$1, 0.0, $$12.f + $$2);
                        this.h($$12.d(0.95, 1.0, 0.95));
                     } else {
                        double $$14 = ($$13.d + $$12.d) / 2.0;
                        double $$15 = ($$13.f + $$12.f) / 2.0;
                        this.h($$12.d(0.2, 1.0, 0.2));
                        this.j($$14 - $$1, 0.0, $$15 - $$2);
                        $$0.h($$13.d(0.2, 1.0, 0.2));
                        $$0.j($$14 + $$1, 0.0, $$15 + $$2);
                     }
                  } else {
                     this.j(-$$1, 0.0, -$$2);
                     $$0.j($$1 / 4.0, 0.0, $$2 / 4.0);
                  }
               }
            }
         }
      }
   }

   public abstract cps.a y();

   public duo z() {
      return !this.D() ? this.A() : dhj.a(this.at().a(d));
   }

   public duo A() {
      return dhl.a.o();
   }

   public int B() {
      return !this.D() ? this.C() : this.at().a(e);
   }

   public int C() {
      return 6;
   }

   public void c(duo $$0) {
      this.at().a(d, dhj.j($$0));
      this.r(true);
   }

   public void c(int $$0) {
      this.at().a(e, $$0);
      this.r(true);
   }

   public boolean D() {
      return this.at().a(i);
   }

   public void r(boolean $$0) {
      this.at().a(i, $$0);
   }

   @Override
   public cvp dF() {
      return new cvp(switch (this.y()) {
         case b -> cvt.nN;
         case c -> cvt.nO;
         case d -> cvt.nP;
         default -> cvt.nM;
         case f -> cvt.nQ;
         case g -> cvt.uO;
      });
   }

   public void a(buk $$0, eys $$1) {
      eys $$2 = a($$1, 1.0F, $$0.dI());
      this.j($$2);
   }

   public void j(eys $$0) {
      this.m = $$0;
   }

   public eys E() {
      return this.m;
   }

   public static boolean b(deg $$0) {
      return $$0.J().b(cqp.e);
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
