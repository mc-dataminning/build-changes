import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class caf extends bfj {
   private static final aby<Integer> c = acb.a(caf.class, aca.b);
   private static final aby<Integer> d = acb.a(caf.class, aca.b);
   private static final aby<Float> e = acb.a(caf.class, aca.d);
   private static final aby<Integer> f = acb.a(caf.class, aca.b);
   private static final aby<Integer> g = acb.a(caf.class, aca.b);
   private static final aby<Boolean> h = acb.a(caf.class, aca.k);
   private static final ImmutableMap<bgl, ImmutableList<Integer>> i = ImmutableMap.of(
      bgl.a, ImmutableList.of(0, 1, -1), bgl.f, ImmutableList.of(0, 1, -1), bgl.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean j;
   private boolean k;
   private static final Map<ddf, Pair<hz, hz>> l = ac.a(Maps.newEnumMap(ddf.class), $$0 -> {
      hz $$1 = ha.e.q();
      hz $$2 = ha.f.q();
      hz $$3 = ha.c.q();
      hz $$4 = ha.d.q();
      hz $$5 = $$1.o();
      hz $$6 = $$2.o();
      hz $$7 = $$3.o();
      hz $$8 = $$4.o();
      $$0.put(ddf.a, Pair.of($$3, $$4));
      $$0.put(ddf.b, Pair.of($$1, $$2));
      $$0.put(ddf.c, Pair.of($$5, $$2));
      $$0.put(ddf.d, Pair.of($$1, $$6));
      $$0.put(ddf.e, Pair.of($$3, $$8));
      $$0.put(ddf.f, Pair.of($$7, $$4));
      $$0.put(ddf.g, Pair.of($$4, $$2));
      $$0.put(ddf.h, Pair.of($$4, $$1));
      $$0.put(ddf.i, Pair.of($$3, $$1));
      $$0.put(ddf.j, Pair.of($$3, $$2));
   });
   private int m;
   private double n;
   private double o;
   private double p;
   private double q;
   private double r;
   private double s;
   private double t;
   private double u;

   protected caf(bfn<?> $$0, cmm $$1) {
      super($$0, $$1);
      this.H = true;
   }

   protected caf(bfn<?> $$0, cmm $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.e($$2, $$3, $$4);
      this.J = $$2;
      this.K = $$3;
      this.L = $$4;
   }

   public static caf a(cmm $$0, double $$1, double $$2, double $$3, caf.a $$4) {
      if ($$4 == caf.a.b) {
         return new cam($$0, $$1, $$2, $$3);
      } else if ($$4 == caf.a.c) {
         return new cao($$0, $$1, $$2, $$3);
      } else if ($$4 == caf.a.d) {
         return new car($$0, $$1, $$2, $$3);
      } else if ($$4 == caf.a.e) {
         return new caq($$0, $$1, $$2, $$3);
      } else if ($$4 == caf.a.f) {
         return new cap($$0, $$1, $$2, $$3);
      } else {
         return (caf)($$4 == caf.a.g ? new can($$0, $$1, $$2, $$3) : new cal($$0, $$1, $$2, $$3));
      }
   }

   @Override
   protected bfj.b aS() {
      return bfj.b.c;
   }

   @Override
   protected void a_() {
      this.am.a(c, 0);
      this.am.a(d, 1);
      this.am.a(e, 0.0F);
      this.am.a(f, cpn.i(cpo.a.n()));
      this.am.a(g, 6);
      this.am.a(h, false);
   }

   @Override
   public boolean h(bfj $$0) {
      return cah.a(this, $$0);
   }

   @Override
   public boolean bp() {
      return true;
   }

   @Override
   protected eei a(ha.a $$0, l.a $$1) {
      return bfz.i(super.a($$0, $$1));
   }

   @Override
   public double bx() {
      return 0.0;
   }

   @Override
   public eei b(bfz $$0) {
      ha $$1 = this.cC();
      if ($$1.o() == ha.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cak.a($$1);
         gu $$3 = this.di();
         gu.a $$4 = new gu.a();
         ImmutableList<bgl> $$5 = $$0.fv();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bgl $$6 = (bgl)$$14.next();
            bfk $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a, 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)i.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dI().a(cak.a(this.dI(), $$4), () -> cak.a(this.dI(), $$4.d()));
                  if (cak.a($$11)) {
                     eed $$12 = new eed((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b, (double)$$8);
                     eei $$13 = eei.a($$4, $$11);
                     if (cak.a(this.dI(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cE().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bgl $$15 = (bgl)var22.next();
            double $$16 = (double)$$0.a($$15).b;
            int $$17 = apa.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cak.a($$4, $$17, $$0x -> this.dI().a_($$0x).k(this.dI(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.dI().B || this.dD()) {
         return true;
      } else if (this.b($$0)) {
         return false;
      } else {
         this.d(-this.s());
         this.c(10);
         this.bl();
         this.a(this.q() + $$1 * 10.0F);
         this.a(dgl.o, $$0.d());
         boolean $$2 = $$0.d() instanceof byo && ((byo)$$0.d()).fO().d;
         if ($$2 || this.q() > 40.0F) {
            this.bz();
            if ($$2 && !this.aa()) {
               this.ai();
            } else {
               this.a($$0);
            }
         }

         return true;
      }
   }

   @Override
   protected float aH() {
      dcb $$0 = this.dI().a_(this.di());
      return $$0.a(amw.N) ? 1.0F : super.aH();
   }

   public void a(ben $$0) {
      this.ah();
      if (this.dI().X().b(cmi.h)) {
         cfz $$1 = new cfz(this.j());
         if (this.aa()) {
            $$1.a(this.ab());
         }

         this.b($$1);
      }
   }

   abstract cfu j();

   @Override
   public void m(float $$0) {
      this.d(-this.s());
      this.c(10);
      this.a(this.q() + this.q() * 10.0F);
   }

   @Override
   public boolean bo() {
      return !this.dD();
   }

   private static Pair<hz, hz> a(ddf $$0) {
      return l.get($$0);
   }

   @Override
   public ha cC() {
      return this.j ? this.cB().g().h() : this.cB().h();
   }

   @Override
   public void l() {
      if (this.r() > 0) {
         this.c(this.r() - 1);
      }

      if (this.q() > 0.0F) {
         this.a(this.q() - 1.0F);
      }

      this.ap();
      this.bG();
      if (this.dI().B) {
         if (this.m > 0) {
            double $$0 = this.dn() + (this.n - this.dn()) / (double)this.m;
            double $$1 = this.dp() + (this.o - this.dp()) / (double)this.m;
            double $$2 = this.dt() + (this.p - this.dt()) / (double)this.m;
            double $$3 = apa.d(this.q - (double)this.dy());
            this.a_(this.dy() + (float)$$3 / (float)this.m);
            this.b_(this.dA() + (float)(this.r - (double)this.dA()) / (float)this.m);
            this.m--;
            this.e($$0, $$1, $$2);
            this.a(this.dy(), this.dA());
         } else {
            this.an();
            this.a(this.dy(), this.dA());
         }
      } else {
         if (!this.aR()) {
            double $$4 = this.aV() ? -0.005 : -0.04;
            this.f(this.dl().b(0.0, $$4, 0.0));
         }

         int $$5 = apa.a(this.dn());
         int $$6 = apa.a(this.dp());
         int $$7 = apa.a(this.dt());
         if (this.dI().a_(new gu($$5, $$6 - 1, $$7)).a(amw.N)) {
            $$6--;
         }

         gu $$8 = new gu($$5, $$6, $$7);
         dcb $$9 = this.dI().a_($$8);
         this.k = cpd.g($$9);
         if (this.k) {
            this.c($$8, $$9);
            if ($$9.a(cpo.hh)) {
               this.a($$5, $$6, $$7, $$9.c(cvi.e));
            }
         } else {
            this.o();
         }

         this.aM();
         this.b_(0.0F);
         double $$10 = this.J - this.dn();
         double $$11 = this.L - this.dt();
         if ($$10 * $$10 + $$11 * $$11 > 0.001) {
            this.a_((float)(apa.d($$11, $$10) * 180.0 / Math.PI));
            if (this.j) {
               this.a_(this.dy() + 180.0F);
            }
         }

         double $$12 = (double)apa.g(this.dy() - this.M);
         if ($$12 < -170.0 || $$12 >= 170.0) {
            this.a_(this.dy() + 180.0F);
            this.j = !this.j;
         }

         this.a(this.dy(), this.dA());
         if (this.t() == caf.a.a && this.dl().i() > 0.01) {
            List<bfj> $$13 = this.dI().a(this, this.cE().c(0.2F, 0.0, 0.2F), bfm.a(this));
            if (!$$13.isEmpty()) {
               for (int $$14 = 0; $$14 < $$13.size(); $$14++) {
                  bfj $$15 = $$13.get($$14);
                  if (!($$15 instanceof byo) && !($$15 instanceof brx) && !($$15 instanceof caf) && !this.bN() && !$$15.bM()) {
                     $$15.k(this);
                  } else {
                     $$15.g(this);
                  }
               }
            }
         } else {
            for (bfj $$16 : this.dI().a_(this, this.cE().c(0.2F, 0.0, 0.2F))) {
               if (!this.u($$16) && $$16.bp() && $$16 instanceof caf) {
                  $$16.g(this);
               }
            }
         }

         this.bb();
         if (this.bi()) {
            this.au();
            this.aa *= 0.5F;
         }

         this.al = false;
      }
   }

   protected double k() {
      return (this.aV() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   protected void o() {
      double $$0 = this.k();
      eei $$1 = this.dl();
      this.o(apa.a($$1.c, -$$0, $$0), $$1.d, apa.a($$1.e, -$$0, $$0));
      if (this.ay()) {
         this.f(this.dl().a(0.5));
      }

      this.a(bgf.a, this.dl());
      if (!this.ay()) {
         this.f(this.dl().a(0.95));
      }
   }

   @Override
   protected void c(gu $$0, dcb $$1) {
      this.n();
      double $$2 = this.dn();
      double $$3 = this.dp();
      double $$4 = this.dt();
      eei $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(cpo.bp)) {
         $$6 = $$1.c(cvi.e);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.aV()) {
         $$8 *= 0.2;
      }

      eei $$9 = this.dl();
      ddf $$10 = $$1.c(((cpd)$$1.b()).b());
      switch ($$10) {
         case c:
            this.f($$9.b(-$$8, 0.0, 0.0));
            $$3++;
            break;
         case d:
            this.f($$9.b($$8, 0.0, 0.0));
            $$3++;
            break;
         case e:
            this.f($$9.b(0.0, 0.0, $$8));
            $$3++;
            break;
         case f:
            this.f($$9.b(0.0, 0.0, -$$8));
            $$3++;
      }

      $$9 = this.dl();
      Pair<hz, hz> $$11 = a($$10);
      hz $$12 = (hz)$$11.getFirst();
      hz $$13 = (hz)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new eei($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.f($$9);
      bfj $$19 = this.cO();
      if ($$19 instanceof byo) {
         eei $$20 = $$19.dl();
         double $$21 = $$20.i();
         double $$22 = this.dl().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.f(this.dl().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.dl().h();
         if ($$23 < 0.03) {
            this.f(eei.b);
         } else {
            this.f(this.dl().d(0.5, 0.0, 0.5));
         }
      }

      double $$24 = (double)$$0.u() + 0.5 + (double)$$12.u() * 0.5;
      double $$25 = (double)$$0.w() + 0.5 + (double)$$12.w() * 0.5;
      double $$26 = (double)$$0.u() + 0.5 + (double)$$13.u() * 0.5;
      double $$27 = (double)$$0.w() + 0.5 + (double)$$13.w() * 0.5;
      $$14 = $$26 - $$24;
      $$15 = $$27 - $$25;
      double $$28;
      if ($$14 == 0.0) {
         $$28 = $$4 - (double)$$0.w();
      } else if ($$15 == 0.0) {
         $$28 = $$2 - (double)$$0.u();
      } else {
         double $$30 = $$2 - $$24;
         double $$31 = $$4 - $$25;
         $$28 = ($$30 * $$14 + $$31 * $$15) * 2.0;
      }

      $$2 = $$24 + $$14 * $$28;
      $$4 = $$25 + $$15 * $$28;
      this.e($$2, $$3, $$4);
      double $$33 = this.bN() ? 0.75 : 1.0;
      double $$34 = this.k();
      $$9 = this.dl();
      this.a(bgf.a, new eei(apa.a($$33 * $$9.c, -$$34, $$34), 0.0, apa.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && apa.a(this.dn()) - $$0.u() == $$12.u() && apa.a(this.dt()) - $$0.w() == $$12.w()) {
         this.e(this.dn(), this.dp() + (double)$$12.v(), this.dt());
      } else if ($$13.v() != 0 && apa.a(this.dn()) - $$0.u() == $$13.u() && apa.a(this.dt()) - $$0.w() == $$13.w()) {
         this.e(this.dn(), this.dp() + (double)$$13.v(), this.dt());
      }

      this.p();
      eei $$35 = this.q(this.dn(), this.dp(), this.dt());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         eei $$37 = this.dl();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.f($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.e(this.dn(), $$35.d, this.dt());
      }

      int $$39 = apa.a(this.dn());
      int $$40 = apa.a(this.dt());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         eei $$41 = this.dl();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         eei $$43 = this.dl();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.f($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            eei $$46 = this.dl();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == ddf.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != ddf.a) {
                  return;
               }

               if (this.a($$0.e())) {
                  $$48 = 0.02;
               } else if (this.a($$0.f())) {
                  $$48 = -0.02;
               }
            }

            this.o($$47, $$46.d, $$48);
         }
      }
   }

   @Override
   public boolean cc() {
      return this.k;
   }

   private boolean a(gu $$0) {
      return this.dI().a_($$0).g(this.dI(), $$0);
   }

   protected void p() {
      double $$0 = this.bN() ? 0.997 : 0.96;
      eei $$1 = this.dl();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.aV()) {
         $$1 = $$1.a(0.95F);
      }

      this.f($$1);
   }

   @Nullable
   public eei a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = apa.a($$0);
      int $$5 = apa.a($$1);
      int $$6 = apa.a($$2);
      if (this.dI().a_(new gu($$4, $$5 - 1, $$6)).a(amw.N)) {
         $$5--;
      }

      dcb $$7 = this.dI().a_(new gu($$4, $$5, $$6));
      if (cpd.g($$7)) {
         ddf $$8 = $$7.c(((cpd)$$7.b()).b());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<hz, hz> $$9 = a($$8);
         hz $$10 = (hz)$$9.getFirst();
         hz $$11 = (hz)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && apa.a($$0) - $$4 == $$10.u() && apa.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && apa.a($$0) - $$4 == $$11.u() && apa.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public eei q(double $$0, double $$1, double $$2) {
      int $$3 = apa.a($$0);
      int $$4 = apa.a($$1);
      int $$5 = apa.a($$2);
      if (this.dI().a_(new gu($$3, $$4 - 1, $$5)).a(amw.N)) {
         $$4--;
      }

      dcb $$6 = this.dI().a_(new gu($$3, $$4, $$5));
      if (cpd.g($$6)) {
         ddf $$7 = $$6.c(((cpd)$$6.b()).b());
         Pair<hz, hz> $$8 = a($$7);
         hz $$9 = (hz)$$8.getFirst();
         hz $$10 = (hz)$$8.getSecond();
         double $$11 = (double)$$3 + 0.5 + (double)$$9.u() * 0.5;
         double $$12 = (double)$$4 + 0.0625 + (double)$$9.v() * 0.5;
         double $$13 = (double)$$5 + 0.5 + (double)$$9.w() * 0.5;
         double $$14 = (double)$$3 + 0.5 + (double)$$10.u() * 0.5;
         double $$15 = (double)$$4 + 0.0625 + (double)$$10.v() * 0.5;
         double $$16 = (double)$$5 + 0.5 + (double)$$10.w() * 0.5;
         double $$17 = $$14 - $$11;
         double $$18 = ($$15 - $$12) * 2.0;
         double $$19 = $$16 - $$13;
         double $$20;
         if ($$17 == 0.0) {
            $$20 = $$2 - (double)$$5;
         } else if ($$19 == 0.0) {
            $$20 = $$0 - (double)$$3;
         } else {
            double $$22 = $$0 - $$11;
            double $$23 = $$2 - $$13;
            $$20 = ($$22 * $$17 + $$23 * $$19) * 2.0;
         }

         $$0 = $$11 + $$17 * $$20;
         $$1 = $$12 + $$18 * $$20;
         $$2 = $$13 + $$19 * $$20;
         if ($$18 < 0.0) {
            $$1++;
         } else if ($$18 > 0.0) {
            $$1 += 0.5;
         }

         return new eei($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public eed j_() {
      eed $$0 = this.cE();
      return this.z() ? $$0.g((double)Math.abs(this.x()) / 16.0) : $$0;
   }

   @Override
   protected void a(qr $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(rd.a(this.dI().a(jc.e), $$0.p("DisplayState")));
         this.m($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(qr $$0) {
      if (this.z()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", rd.a(this.v()));
         $$0.a("DisplayOffset", this.x());
      }
   }

   @Override
   public void g(bfj $$0) {
      if (!this.dI().B) {
         if (!$$0.ae && !this.ae) {
            if (!this.u($$0)) {
               double $$1 = $$0.dn() - this.dn();
               double $$2 = $$0.dt() - this.dt();
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
                  if ($$0 instanceof caf) {
                     double $$5 = $$0.dn() - this.dn();
                     double $$6 = $$0.dt() - this.dt();
                     eei $$7 = new eei($$5, 0.0, $$6).d();
                     eei $$8 = new eei((double)apa.b(this.dy() * (float) (Math.PI / 180.0)), 0.0, (double)apa.a(this.dy() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     eei $$10 = this.dl();
                     eei $$11 = $$0.dl();
                     if (((caf)$$0).t() == caf.a.c && this.t() != caf.a.c) {
                        this.f($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.f($$11.d(0.95, 1.0, 0.95));
                     } else if (((caf)$$0).t() != caf.a.c && this.t() == caf.a.c) {
                        $$0.f($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$10.c + $$1, 0.0, $$10.e + $$2);
                        this.f($$10.d(0.95, 1.0, 0.95));
                     } else {
                        double $$12 = ($$11.c + $$10.c) / 2.0;
                        double $$13 = ($$11.e + $$10.e) / 2.0;
                        this.f($$10.d(0.2, 1.0, 0.2));
                        this.j($$12 - $$1, 0.0, $$13 - $$2);
                        $$0.f($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$12 + $$1, 0.0, $$13 + $$2);
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

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5, boolean $$6) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = (double)$$3;
      this.r = (double)$$4;
      this.m = $$5 + 2;
      this.o(this.s, this.t, this.u);
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = $$0;
      this.t = $$1;
      this.u = $$2;
      this.o(this.s, this.t, this.u);
   }

   public void a(float $$0) {
      this.am.b(e, $$0);
   }

   public float q() {
      return this.am.b(e);
   }

   public void c(int $$0) {
      this.am.b(c, $$0);
   }

   public int r() {
      return this.am.b(c);
   }

   public void d(int $$0) {
      this.am.b(d, $$0);
   }

   public int s() {
      return this.am.b(d);
   }

   public abstract caf.a t();

   public dcb v() {
      return !this.z() ? this.w() : cpn.a(this.aj().b(f));
   }

   public dcb w() {
      return cpo.a.n();
   }

   public int x() {
      return !this.z() ? this.y() : this.aj().b(g);
   }

   public int y() {
      return 6;
   }

   public void c(dcb $$0) {
      this.aj().b(f, cpn.i($$0));
      this.a(true);
   }

   public void m(int $$0) {
      this.aj().b(g, $$0);
      this.a(true);
   }

   public boolean z() {
      return this.aj().b(h);
   }

   public void a(boolean $$0) {
      this.aj().b(h, $$0);
   }

   @Override
   public cfz dv() {
      return new cfz(switch (this.t()) {
         case c -> cgc.nc;
         case b -> cgc.nb;
         case d -> cgc.nd;
         case f -> cgc.ne;
         case g -> cgc.tS;
         default -> cgc.na;
      });
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
