import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cgj extends cgw {
   private static final float c = 0.0F;
   private static final float d = 0.1875F;
   private static final afz<Integer> e = agc.a(cgj.class, agb.b);
   private static final afz<Integer> i = agc.a(cgj.class, agb.b);
   private static final afz<Boolean> j = agc.a(cgj.class, agb.k);
   private static final ImmutableMap<bmh, ImmutableList<Integer>> k = ImmutableMap.of(
      bmh.a, ImmutableList.of(0, 1, -1), bmh.f, ImmutableList.of(0, 1, -1), bmh.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean l;
   private boolean m;
   private int n;
   private double o;
   private double p;
   private double q;
   private double r;
   private double s;
   private elb t = elb.b;
   private static final Map<djt, Pair<iz, iz>> u = ac.a(Maps.newEnumMap(djt.class), $$0 -> {
      iz $$1 = ia.e.q();
      iz $$2 = ia.f.q();
      iz $$3 = ia.c.q();
      iz $$4 = ia.d.q();
      iz $$5 = $$1.o();
      iz $$6 = $$2.o();
      iz $$7 = $$3.o();
      iz $$8 = $$4.o();
      $$0.put(djt.a, Pair.of($$3, $$4));
      $$0.put(djt.b, Pair.of($$1, $$2));
      $$0.put(djt.c, Pair.of($$5, $$2));
      $$0.put(djt.d, Pair.of($$1, $$6));
      $$0.put(djt.e, Pair.of($$3, $$8));
      $$0.put(djt.f, Pair.of($$7, $$4));
      $$0.put(djt.g, Pair.of($$4, $$2));
      $$0.put(djt.h, Pair.of($$4, $$1));
      $$0.put(djt.i, Pair.of($$3, $$1));
      $$0.put(djt.j, Pair.of($$3, $$2));
   });

   protected cgj(blj<?> $$0, csy $$1) {
      super($$0, $$1);
      this.I = true;
   }

   protected cgj(blj<?> $$0, csy $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.K = $$2;
      this.L = $$3;
      this.M = $$4;
   }

   public static cgj a(amp $$0, double $$1, double $$2, double $$3, cgj.a $$4, cmh $$5, @Nullable cer $$6) {
      cgj $$7 = (cgj)(switch ($$4) {
         case b -> new cgq($$0, $$1, $$2, $$3);
         case c -> new cgs($$0, $$1, $$2, $$3);
         case d -> new cgv($$0, $$1, $$2, $$3);
         case e -> new cgu($$0, $$1, $$2, $$3);
         case f -> new cgt($$0, $$1, $$2, $$3);
         case g -> new cgr($$0, $$1, $$2, $$3);
         default -> new cgp($$0, $$1, $$2, $$3);
      });
      blj.<cgj>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected blf.b aW() {
      return blf.b.c;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(e, cvz.i(cwb.a.o()));
      this.an.a(i, 6);
      this.an.a(j, false);
   }

   @Override
   public boolean h(blf $$0) {
      return cgl.a(this, $$0);
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected elb a(ia.a $$0, l.a $$1) {
      return blv.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      boolean $$3 = $$0 instanceof cee || $$0 instanceof cek;
      return new Vector3f(0.0F, $$3 ? 0.0F : 0.1875F, 0.0F);
   }

   @Override
   public elb b(blv $$0) {
      ia $$1 = this.cF();
      if ($$1.o() == ia.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cgo.a($$1);
         hv $$3 = this.dm();
         hv.a $$4 = new hv.a();
         ImmutableList<bmh> $$5 = $$0.fA();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bmh $$6 = (bmh)$$14.next();
            blg $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a, 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)k.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dM().a(cgo.a(this.dM(), $$4), () -> cgo.a(this.dM(), $$4.d()));
                  if (cgo.a($$11)) {
                     ekw $$12 = new ekw((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b, (double)$$8);
                     elb $$13 = elb.a($$4, $$11);
                     if (cgo.a(this.dM(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cH().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bmh $$15 = (bmh)var22.next();
            double $$16 = (double)$$0.a($$15).b;
            int $$17 = aty.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cgo.a($$4, $$17, $$0x -> this.dM().a_($$0x).k(this.dM(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aL() {
      dip $$0 = this.dM().a_(this.dm());
      return $$0.a(arr.N) ? 1.0F : super.aL();
   }

   @Override
   public void m(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bt() {
      return !this.dH();
   }

   private static Pair<iz, iz> a(djt $$0) {
      return u.get($$0);
   }

   @Override
   public ia cF() {
      return this.l ? this.cE().g().h() : this.cE().h();
   }

   @Override
   public void l() {
      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      this.at();
      this.bI();
      if (this.dM().B) {
         if (this.n > 0) {
            this.a(this.n, this.o, this.p, this.q, this.r, this.s);
            this.n--;
         } else {
            this.ar();
            this.a(this.dC(), this.dE());
         }
      } else {
         if (!this.aV()) {
            double $$0 = this.aZ() ? -0.005 : -0.04;
            this.g(this.dp().b(0.0, $$0, 0.0));
         }

         int $$1 = aty.a(this.dr());
         int $$2 = aty.a(this.dt());
         int $$3 = aty.a(this.dx());
         if (this.dM().a_(new hv($$1, $$2 - 1, $$3)).a(arr.N)) {
            $$2--;
         }

         hv $$4 = new hv($$1, $$2, $$3);
         dip $$5 = this.dM().a_($$4);
         this.m = cvo.g($$5);
         if (this.m) {
            this.c($$4, $$5);
            if ($$5.a(cwb.hh)) {
               this.a($$1, $$2, $$3, $$5.c(dbu.f));
            }
         } else {
            this.s();
         }

         this.aQ();
         this.s(0.0F);
         double $$6 = this.K - this.dr();
         double $$7 = this.M - this.dx();
         if ($$6 * $$6 + $$7 * $$7 > 0.001) {
            this.r((float)(aty.d($$7, $$6) * 180.0 / Math.PI));
            if (this.l) {
               this.r(this.dC() + 180.0F);
            }
         }

         double $$8 = (double)aty.g(this.dC() - this.N);
         if ($$8 < -170.0 || $$8 >= 170.0) {
            this.r(this.dC() + 180.0F);
            this.l = !this.l;
         }

         this.a(this.dC(), this.dE());
         if (this.w() == cgj.a.a && this.dp().i() > 0.01) {
            List<blf> $$9 = this.dM().a(this, this.cH().c(0.2F, 0.0, 0.2F), bli.a(this));
            if (!$$9.isEmpty()) {
               for (blf $$10 : $$9) {
                  if (!($$10 instanceof cer) && !($$10 instanceof bxu) && !($$10 instanceof cgj) && !this.bP() && !$$10.bO()) {
                     $$10.n(this);
                  } else {
                     $$10.g(this);
                  }
               }
            }
         } else {
            for (blf $$11 : this.dM().a_(this, this.cH().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$11) && $$11.bu() && $$11 instanceof cgj) {
                  $$11.g(this);
               }
            }
         }

         this.bg();
         if (this.bn()) {
            this.ay();
            this.ab *= 0.5F;
         }

         this.am = false;
      }
   }

   protected double q() {
      return (this.aZ() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   protected void s() {
      double $$0 = this.q();
      elb $$1 = this.dp();
      this.o(aty.a($$1.c, -$$0, $$0), $$1.d, aty.a($$1.e, -$$0, $$0));
      if (this.aC()) {
         this.g(this.dp().a(0.5));
      }

      this.a(bmb.a, this.dp());
      if (!this.aC()) {
         this.g(this.dp().a(0.95));
      }
   }

   @Override
   protected void c(hv $$0, dip $$1) {
      this.n();
      double $$2 = this.dr();
      double $$3 = this.dt();
      double $$4 = this.dx();
      elb $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(cwb.bp)) {
         $$6 = $$1.c(dbu.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.aZ()) {
         $$8 *= 0.2;
      }

      elb $$9 = this.dp();
      djt $$10 = $$1.c(((cvo)$$1.b()).c());
      switch ($$10) {
         case c:
            this.g($$9.b(-$$8, 0.0, 0.0));
            $$3++;
            break;
         case d:
            this.g($$9.b($$8, 0.0, 0.0));
            $$3++;
            break;
         case e:
            this.g($$9.b(0.0, 0.0, $$8));
            $$3++;
            break;
         case f:
            this.g($$9.b(0.0, 0.0, -$$8));
            $$3++;
      }

      $$9 = this.dp();
      Pair<iz, iz> $$11 = a($$10);
      iz $$12 = (iz)$$11.getFirst();
      iz $$13 = (iz)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new elb($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.g($$9);
      blf $$19 = this.cQ();
      if ($$19 instanceof cer) {
         elb $$20 = $$19.dp();
         double $$21 = $$20.i();
         double $$22 = this.dp().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.g(this.dp().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.dp().h();
         if ($$23 < 0.03) {
            this.g(elb.b);
         } else {
            this.g(this.dp().d(0.5, 0.0, 0.5));
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
      this.a_($$2, $$3, $$4);
      double $$33 = this.bP() ? 0.75 : 1.0;
      double $$34 = this.q();
      $$9 = this.dp();
      this.a(bmb.a, new elb(aty.a($$33 * $$9.c, -$$34, $$34), 0.0, aty.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && aty.a(this.dr()) - $$0.u() == $$12.u() && aty.a(this.dx()) - $$0.w() == $$12.w()) {
         this.a_(this.dr(), this.dt() + (double)$$12.v(), this.dx());
      } else if ($$13.v() != 0 && aty.a(this.dr()) - $$0.u() == $$13.u() && aty.a(this.dx()) - $$0.w() == $$13.w()) {
         this.a_(this.dr(), this.dt() + (double)$$13.v(), this.dx());
      }

      this.u();
      elb $$35 = this.q(this.dr(), this.dt(), this.dx());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         elb $$37 = this.dp();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.g($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.dr(), $$35.d, this.dx());
      }

      int $$39 = aty.a(this.dr());
      int $$40 = aty.a(this.dx());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         elb $$41 = this.dp();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         elb $$43 = this.dp();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.g($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            elb $$46 = this.dp();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == djt.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != djt.a) {
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
   public boolean cf() {
      return this.m;
   }

   private boolean a(hv $$0) {
      return this.dM().a_($$0).g(this.dM(), $$0);
   }

   protected void u() {
      double $$0 = this.bP() ? 0.997 : 0.96;
      elb $$1 = this.dp();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.aZ()) {
         $$1 = $$1.a(0.95F);
      }

      this.g($$1);
   }

   @Nullable
   public elb a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = aty.a($$0);
      int $$5 = aty.a($$1);
      int $$6 = aty.a($$2);
      if (this.dM().a_(new hv($$4, $$5 - 1, $$6)).a(arr.N)) {
         $$5--;
      }

      dip $$7 = this.dM().a_(new hv($$4, $$5, $$6));
      if (cvo.g($$7)) {
         djt $$8 = $$7.c(((cvo)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<iz, iz> $$9 = a($$8);
         iz $$10 = (iz)$$9.getFirst();
         iz $$11 = (iz)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && aty.a($$0) - $$4 == $$10.u() && aty.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && aty.a($$0) - $$4 == $$11.u() && aty.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public elb q(double $$0, double $$1, double $$2) {
      int $$3 = aty.a($$0);
      int $$4 = aty.a($$1);
      int $$5 = aty.a($$2);
      if (this.dM().a_(new hv($$3, $$4 - 1, $$5)).a(arr.N)) {
         $$4--;
      }

      dip $$6 = this.dM().a_(new hv($$3, $$4, $$5));
      if (cvo.g($$6)) {
         djt $$7 = $$6.c(((cvo)$$6.b()).c());
         Pair<iz, iz> $$8 = a($$7);
         iz $$9 = (iz)$$8.getFirst();
         iz $$10 = (iz)$$8.getSecond();
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

         return new elb($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public ekw i_() {
      ekw $$0 = this.cH();
      return this.B() ? $$0.g((double)Math.abs(this.z()) / 16.0) : $$0;
   }

   @Override
   protected void a(sj $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(sy.a(this.dM().a(kc.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(sj $$0) {
      if (this.B()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", sy.a(this.x()));
         $$0.a("DisplayOffset", this.z());
      }
   }

   @Override
   public void g(blf $$0) {
      if (!this.dM().B) {
         if (!$$0.af && !this.af) {
            if (!this.x($$0)) {
               double $$1 = $$0.dr() - this.dr();
               double $$2 = $$0.dx() - this.dx();
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
                  if ($$0 instanceof cgj) {
                     double $$5 = $$0.dr() - this.dr();
                     double $$6 = $$0.dx() - this.dx();
                     elb $$7 = new elb($$5, 0.0, $$6).d();
                     elb $$8 = new elb((double)aty.b(this.dC() * (float) (Math.PI / 180.0)), 0.0, (double)aty.a(this.dC() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     elb $$10 = this.dp();
                     elb $$11 = $$0.dp();
                     if (((cgj)$$0).w() == cgj.a.c && this.w() != cgj.a.c) {
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.g($$11.d(0.95, 1.0, 0.95));
                     } else if (((cgj)$$0).w() != cgj.a.c && this.w() == cgj.a.c) {
                        $$0.g($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$10.c + $$1, 0.0, $$10.e + $$2);
                        this.g($$10.d(0.95, 1.0, 0.95));
                     } else {
                        double $$12 = ($$11.c + $$10.c) / 2.0;
                        double $$13 = ($$11.e + $$10.e) / 2.0;
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$12 - $$1, 0.0, $$13 - $$2);
                        $$0.g($$11.d(0.2, 1.0, 0.2));
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
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = (double)$$3;
      this.s = (double)$$4;
      this.n = $$5 + 2;
      this.g(this.t);
   }

   @Override
   public double p_() {
      return this.n > 0 ? this.o : this.dr();
   }

   @Override
   public double N_() {
      return this.n > 0 ? this.p : this.dt();
   }

   @Override
   public double O_() {
      return this.n > 0 ? this.q : this.dx();
   }

   @Override
   public float f_() {
      return this.n > 0 ? (float)this.s : this.dE();
   }

   @Override
   public float q_() {
      return this.n > 0 ? (float)this.r : this.dC();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.t = new elb($$0, $$1, $$2);
      this.g(this.t);
   }

   public abstract cgj.a w();

   public dip x() {
      return !this.B() ? this.y() : cvz.a(this.an().b(e));
   }

   public dip y() {
      return cwb.a.o();
   }

   public int z() {
      return !this.B() ? this.A() : this.an().b(i);
   }

   public int A() {
      return 6;
   }

   public void c(dip $$0) {
      this.an().b(e, cvz.i($$0));
      this.a(true);
   }

   public void c(int $$0) {
      this.an().b(i, $$0);
      this.a(true);
   }

   public boolean B() {
      return this.an().b(j);
   }

   public void a(boolean $$0) {
      this.an().b(j, $$0);
   }

   @Override
   public cmh dz() {
      return new cmh(switch (this.w()) {
         case b -> cmk.nM;
         case c -> cmk.nN;
         case d -> cmk.nO;
         default -> cmk.nL;
         case f -> cmk.nP;
         case g -> cmk.uF;
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
