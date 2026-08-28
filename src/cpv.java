import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cpv extends cql {
   private static final eyw c = new eyw(0.0, 0.0, 0.0);
   private static final akh<Integer> d = akl.a(cpv.class, akj.b);
   private static final akh<Integer> e = akl.a(cpv.class, akj.b);
   private static final akh<Boolean> i = akl.a(cpv.class, akj.k);
   private static final ImmutableMap<buz, ImmutableList<Integer>> j = ImmutableMap.of(
      buz.a, ImmutableList.of(0, 1, -1), buz.f, ImmutableList.of(0, 1, -1), buz.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean k;
   private boolean l;
   private eyw m = eyw.c;
   private final cqc n;
   private static final Map<dvw, Pair<kj, kj>> o = ad.a(Maps.newEnumMap(dvw.class), $$0 -> {
      kj $$1 = jk.e.q();
      kj $$2 = jk.f.q();
      kj $$3 = jk.c.q();
      kj $$4 = jk.d.q();
      kj $$5 = $$1.p();
      kj $$6 = $$2.p();
      kj $$7 = $$3.p();
      kj $$8 = $$4.p();
      $$0.put(dvw.a, Pair.of($$3, $$4));
      $$0.put(dvw.b, Pair.of($$1, $$2));
      $$0.put(dvw.c, Pair.of($$5, $$2));
      $$0.put(dvw.d, Pair.of($$1, $$6));
      $$0.put(dvw.e, Pair.of($$3, $$8));
      $$0.put(dvw.f, Pair.of($$7, $$4));
      $$0.put(dvw.g, Pair.of($$4, $$2));
      $$0.put(dvw.h, Pair.of($$4, $$1));
      $$0.put(dvw.i, Pair.of($$3, $$1));
      $$0.put(dvw.j, Pair.of($$3, $$2));
   });

   protected cpv(bty<?> $$0, dej $$1) {
      super($$0, $$1);
      this.J = true;
      if (b($$1)) {
         this.n = new cqj(this);
      } else {
         this.n = new cqk(this);
      }
   }

   protected cpv(bty<?> $$0, dej $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cpv a(dej $$0, double $$1, double $$2, double $$3, cpv.a $$4, cvs $$5, @Nullable cnx $$6) {
      cpv $$7 = (cpv)(switch ($$4) {
         case b -> new cqd($$0, $$1, $$2, $$3);
         case c -> new cqf($$0, $$1, $$2, $$3);
         case d -> new cqi($$0, $$1, $$2, $$3);
         case e -> new cqh($$0, $$1, $$2, $$3);
         case f -> new cqg($$0, $$1, $$2, $$3);
         case g -> new cqe($$0, $$1, $$2, $$3);
         default -> new cqb($$0, $$1, $$2, $$3);
      });
      bty.<cpv>a($$0, $$5, $$6).accept($$7);
      if ($$7.m() instanceof cqj $$8) {
         jf $$9 = $$7.q();
         dus $$10 = $$0.a_($$9);
         $$8.a($$9, $$10, true);
      }

      return $$7;
   }

   public cqc m() {
      return this.n;
   }

   @Override
   protected btr.b bf() {
      return btr.b.c;
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(d, dhm.j(dho.a.n()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(btr $$0) {
      return cpx.a(this, $$0);
   }

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public eyw a(jk.a $$0, l.a $$1) {
      return bun.j(super.a($$0, $$1));
   }

   @Override
   protected eyw a(btr $$0, btu $$1, float $$2) {
      boolean $$3 = $$0 instanceof cnk || $$0 instanceof cnq;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public eyw b(bun $$0) {
      jk $$1 = this.cM();
      if ($$1.o() == jk.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cqa.a($$1);
         jf $$3 = this.ds();
         jf.a $$4 = new jf.a();
         ImmutableList<buz> $$5 = $$0.fK();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            buz $$6 = (buz)$$14.next();
            btu $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dS().a(cqa.a(this.dS(), $$4), () -> cqa.a(this.dS(), $$4.e()));
                  if (cqa.a($$11)) {
                     eyr $$12 = new eyr((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     eyw $$13 = eyw.a($$4, $$11);
                     if (cqa.a(this.dS(), $$0, $$12.c($$13))) {
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
            buz $$15 = (buz)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = azf.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cqa.a($$4, $$17, $$0x -> this.dS().a_($$0x).g(this.dS(), $$0x));
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
      dus $$0 = this.dS().a_(this.ds());
      return $$0.a(awv.O) ? 1.0F : super.aR();
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

   public static Pair<kj, kj> a(dvw $$0) {
      return o.get($$0);
   }

   @Override
   public jk cM() {
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

   public jf q() {
      int $$0 = azf.a(this.dx());
      int $$1 = azf.a(this.dz());
      int $$2 = azf.a(this.dD());
      if (b(this.dS())) {
         double $$3 = this.dz() - 0.1 - 1.0E-5F;
         if (this.dS().a_(jf.a((double)$$0, $$3, (double)$$2)).a(awv.O)) {
            $$1 = azf.a($$3);
         }
      } else if (this.dS().a_(new jf($$0, $$1 - 1, $$2)).a(awv.O)) {
         $$1--;
      }

      return new jf($$0, $$1, $$2);
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
   public eyw ai() {
      return this.n.c(super.ai());
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.n.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public double d_() {
      return this.n.a();
   }

   @Override
   public double e_() {
      return this.n.b();
   }

   @Override
   public double O_() {
      return this.n.c();
   }

   @Override
   public float P_() {
      return this.n.d();
   }

   @Override
   public float f_() {
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
      eyw $$1 = this.dv();
      this.n(azf.a($$1.d, -$$0, $$0), $$1.e, azf.a($$1.f, -$$0, $$0));
      if (this.aH()) {
         this.h(this.dv().c(0.5));
      }

      this.a(bur.a, this.dv());
      if (!this.aH()) {
         this.h(this.dv().c(0.95));
      }
   }

   protected double a(jf $$0, dvw $$1, double $$2) {
      return this.n.a($$0, $$1, $$2);
   }

   @Override
   public void a(bur $$0, eyw $$1) {
      if (b(this.dS())) {
         eyw $$2 = this.dq().e($$1);
         super.a($$0, $$1);
         boolean $$3 = this.n.i();
         if ($$3) {
            super.a($$0, $$2.d(this.dq()));
         }

         if ($$0.equals(bur.c)) {
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

   public eyw a(jf $$0) {
      dus $$1 = this.dS().a_($$0);
      if ($$1.a(dho.bp) && $$1.c(dnj.f)) {
         dvw $$2 = $$1.c(((dhb)$$1.b()).c());
         if ($$2 == dvw.b) {
            if (this.b($$0.h())) {
               return new eyw(1.0, 0.0, 0.0);
            }

            if (this.b($$0.i())) {
               return new eyw(-1.0, 0.0, 0.0);
            }
         } else if ($$2 == dvw.a) {
            if (this.b($$0.f())) {
               return new eyw(0.0, 0.0, 1.0);
            }

            if (this.b($$0.g())) {
               return new eyw(0.0, 0.0, -1.0);
            }
         }

         return eyw.c;
      } else {
         return eyw.c;
      }
   }

   public boolean b(jf $$0) {
      return this.dS().a_($$0).d(this.dS(), $$0);
   }

   @Override
   protected eyw a(eyw $$0) {
      double $$1 = this.n.s();
      eyw $$2 = $$0.d($$1, 0.0, $$1);
      if (this.bi()) {
         $$2 = $$2.c(0.95F);
      }

      return $$2;
   }

   @Override
   protected void a(ug $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(uv.a(this.dS().a(lw.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }

      this.l = $$0.q("FlippedRotation");
      this.al = $$0.q("HasTicked");
   }

   @Override
   protected void b(ug $$0) {
      if (this.D()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", uv.a(this.z()));
         $$0.a("DisplayOffset", this.B());
      }

      $$0.a("FlippedRotation", this.l);
      $$0.a("HasTicked", this.al);
   }

   @Override
   public void h(btr $$0) {
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
                  if ($$0 instanceof cpv) {
                     double $$5;
                     double $$6;
                     if (b(this.dS())) {
                        $$5 = this.dv().d;
                        $$6 = this.dv().f;
                     } else {
                        $$5 = $$0.dx() - this.dx();
                        $$6 = $$0.dD() - this.dD();
                     }

                     eyw $$9 = new eyw($$5, 0.0, $$6).d();
                     eyw $$10 = new eyw((double)azf.b(this.dI() * (float) (Math.PI / 180.0)), 0.0, (double)azf.a(this.dI() * (float) (Math.PI / 180.0))).d();
                     double $$11 = Math.abs($$9.b($$10));
                     if ($$11 < 0.8F && !b(this.dS())) {
                        return;
                     }

                     eyw $$12 = this.dv();
                     eyw $$13 = $$0.dv();
                     if (((cpv)$$0).y() == cpv.a.c && this.y() != cpv.a.c) {
                        this.h($$12.d(0.2, 1.0, 0.2));
                        this.j($$13.d - $$1, 0.0, $$13.f - $$2);
                        $$0.h($$13.d(0.95, 1.0, 0.95));
                     } else if (((cpv)$$0).y() != cpv.a.c && this.y() == cpv.a.c) {
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

   public abstract cpv.a y();

   public dus z() {
      return !this.D() ? this.A() : dhm.a(this.at().a(d));
   }

   public dus A() {
      return dho.a.n();
   }

   public int B() {
      return !this.D() ? this.C() : this.at().a(e);
   }

   public int C() {
      return 6;
   }

   public void c(dus $$0) {
      this.at().a(d, dhm.j($$0));
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
   public cvs dF() {
      return new cvs(switch (this.y()) {
         case b -> cvw.nN;
         case c -> cvw.nO;
         case d -> cvw.nP;
         default -> cvw.nM;
         case f -> cvw.nQ;
         case g -> cvw.uO;
      });
   }

   public void a(bun $$0, eyw $$1) {
      eyw $$2 = a($$1, 1.0F, $$0.dI());
      this.j($$2);
   }

   public void j(eyw $$0) {
      this.m = $$0;
   }

   public eyw E() {
      return this.m;
   }

   public static boolean b(dej $$0) {
      return $$0.J().b(cqs.e);
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
