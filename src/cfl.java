import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class cfl extends cfy {
   private static final float c = 0.0F;
   private static final float d = 0.1875F;
   private static final afo<Integer> e = afr.a(cfl.class, afq.b);
   private static final afo<Integer> i = afr.a(cfl.class, afq.b);
   private static final afo<Boolean> j = afr.a(cfl.class, afq.k);
   private static final ImmutableMap<bls, ImmutableList<Integer>> k = ImmutableMap.of(
      bls.a, ImmutableList.of(0, 1, -1), bls.f, ImmutableList.of(0, 1, -1), bls.d, ImmutableList.of(0, 1)
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
   private eju t = eju.b;
   private static final Map<dim, Pair<iw, iw>> u = ac.a(Maps.newEnumMap(dim.class), $$0 -> {
      iw $$1 = hx.e.q();
      iw $$2 = hx.f.q();
      iw $$3 = hx.c.q();
      iw $$4 = hx.d.q();
      iw $$5 = $$1.o();
      iw $$6 = $$2.o();
      iw $$7 = $$3.o();
      iw $$8 = $$4.o();
      $$0.put(dim.a, Pair.of($$3, $$4));
      $$0.put(dim.b, Pair.of($$1, $$2));
      $$0.put(dim.c, Pair.of($$5, $$2));
      $$0.put(dim.d, Pair.of($$1, $$6));
      $$0.put(dim.e, Pair.of($$3, $$8));
      $$0.put(dim.f, Pair.of($$7, $$4));
      $$0.put(dim.g, Pair.of($$4, $$2));
      $$0.put(dim.h, Pair.of($$4, $$1));
      $$0.put(dim.i, Pair.of($$3, $$1));
      $$0.put(dim.j, Pair.of($$3, $$2));
   });

   protected cfl(bku<?> $$0, csa $$1) {
      super($$0, $$1);
      this.I = true;
   }

   protected cfl(bku<?> $$0, csa $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.K = $$2;
      this.L = $$3;
      this.M = $$4;
   }

   public static cfl a(ame $$0, double $$1, double $$2, double $$3, cfl.a $$4, clj $$5, @Nullable cdu $$6) {
      cfl $$7 = (cfl)(switch ($$4) {
         case b -> new cfs($$0, $$1, $$2, $$3);
         case c -> new cfu($$0, $$1, $$2, $$3);
         case d -> new cfx($$0, $$1, $$2, $$3);
         case e -> new cfw($$0, $$1, $$2, $$3);
         case f -> new cfv($$0, $$1, $$2, $$3);
         case g -> new cft($$0, $$1, $$2, $$3);
         default -> new cfr($$0, $$1, $$2, $$3);
      });
      bku.<cfl>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.c;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(e, cva.i(cvc.a.o()));
      this.an.a(i, 6);
      this.an.a(j, false);
   }

   @Override
   public boolean h(bkq $$0) {
      return cfn.a(this, $$0);
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected eju a(hx.a $$0, l.a $$1) {
      return blg.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      boolean $$3 = $$0 instanceof cdh || $$0 instanceof cdn;
      return new Vector3f(0.0F, $$3 ? 0.0F : 0.1875F, 0.0F);
   }

   @Override
   public eju b(blg $$0) {
      hx $$1 = this.cF();
      if ($$1.o() == hx.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cfq.a($$1);
         ht $$3 = this.dn();
         ht.a $$4 = new ht.a();
         ImmutableList<bls> $$5 = $$0.fB();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bls $$6 = (bls)$$14.next();
            bkr $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a, 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)k.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dN().a(cfq.a(this.dN(), $$4), () -> cfq.a(this.dN(), $$4.d()));
                  if (cfq.a($$11)) {
                     ejp $$12 = new ejp((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b, (double)$$8);
                     eju $$13 = eju.a($$4, $$11);
                     if (cfq.a(this.dN(), $$0, $$12.c($$13))) {
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
            bls $$15 = (bls)var22.next();
            double $$16 = (double)$$0.a($$15).b;
            int $$17 = atm.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cfq.a($$4, $$17, $$0x -> this.dN().a_($$0x).k(this.dN(), $$0x));
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
      dhi $$0 = this.dN().a_(this.dn());
      return $$0.a(arg.N) ? 1.0F : super.aL();
   }

   @Override
   public void m(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bt() {
      return !this.dI();
   }

   private static Pair<iw, iw> a(dim $$0) {
      return u.get($$0);
   }

   @Override
   public hx cF() {
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
      if (this.dN().B) {
         if (this.n > 0) {
            this.a(this.n, this.o, this.p, this.q, this.r, this.s);
            this.n--;
         } else {
            this.ar();
            this.a(this.dD(), this.dF());
         }
      } else {
         if (!this.aV()) {
            double $$0 = this.aZ() ? -0.005 : -0.04;
            this.g(this.dq().b(0.0, $$0, 0.0));
         }

         int $$1 = atm.a(this.ds());
         int $$2 = atm.a(this.du());
         int $$3 = atm.a(this.dy());
         if (this.dN().a_(new ht($$1, $$2 - 1, $$3)).a(arg.N)) {
            $$2--;
         }

         ht $$4 = new ht($$1, $$2, $$3);
         dhi $$5 = this.dN().a_($$4);
         this.m = cup.g($$5);
         if (this.m) {
            this.c($$4, $$5);
            if ($$5.a(cvc.hh)) {
               this.a($$1, $$2, $$3, $$5.c(dav.f));
            }
         } else {
            this.s();
         }

         this.aQ();
         this.s(0.0F);
         double $$6 = this.K - this.ds();
         double $$7 = this.M - this.dy();
         if ($$6 * $$6 + $$7 * $$7 > 0.001) {
            this.r((float)(atm.d($$7, $$6) * 180.0 / Math.PI));
            if (this.l) {
               this.r(this.dD() + 180.0F);
            }
         }

         double $$8 = (double)atm.g(this.dD() - this.N);
         if ($$8 < -170.0 || $$8 >= 170.0) {
            this.r(this.dD() + 180.0F);
            this.l = !this.l;
         }

         this.a(this.dD(), this.dF());
         if (this.w() == cfl.a.a && this.dq().i() > 0.01) {
            List<bkq> $$9 = this.dN().a(this, this.cH().c(0.2F, 0.0, 0.2F), bkt.a(this));
            if (!$$9.isEmpty()) {
               for (bkq $$10 : $$9) {
                  if (!($$10 instanceof cdu) && !($$10 instanceof bxd) && !($$10 instanceof cfl) && !this.bP() && !$$10.bO()) {
                     $$10.n(this);
                  } else {
                     $$10.g(this);
                  }
               }
            }
         } else {
            for (bkq $$11 : this.dN().a_(this, this.cH().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$11) && $$11.bu() && $$11 instanceof cfl) {
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
      eju $$1 = this.dq();
      this.o(atm.a($$1.c, -$$0, $$0), $$1.d, atm.a($$1.e, -$$0, $$0));
      if (this.aC()) {
         this.g(this.dq().a(0.5));
      }

      this.a(blm.a, this.dq());
      if (!this.aC()) {
         this.g(this.dq().a(0.95));
      }
   }

   @Override
   protected void c(ht $$0, dhi $$1) {
      this.n();
      double $$2 = this.ds();
      double $$3 = this.du();
      double $$4 = this.dy();
      eju $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(cvc.bp)) {
         $$6 = $$1.c(dav.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.aZ()) {
         $$8 *= 0.2;
      }

      eju $$9 = this.dq();
      dim $$10 = $$1.c(((cup)$$1.b()).c());
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

      $$9 = this.dq();
      Pair<iw, iw> $$11 = a($$10);
      iw $$12 = (iw)$$11.getFirst();
      iw $$13 = (iw)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new eju($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.g($$9);
      bkq $$19 = this.cR();
      if ($$19 instanceof cdu) {
         eju $$20 = $$19.dq();
         double $$21 = $$20.i();
         double $$22 = this.dq().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.g(this.dq().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.dq().h();
         if ($$23 < 0.03) {
            this.g(eju.b);
         } else {
            this.g(this.dq().d(0.5, 0.0, 0.5));
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
      $$9 = this.dq();
      this.a(blm.a, new eju(atm.a($$33 * $$9.c, -$$34, $$34), 0.0, atm.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && atm.a(this.ds()) - $$0.u() == $$12.u() && atm.a(this.dy()) - $$0.w() == $$12.w()) {
         this.a_(this.ds(), this.du() + (double)$$12.v(), this.dy());
      } else if ($$13.v() != 0 && atm.a(this.ds()) - $$0.u() == $$13.u() && atm.a(this.dy()) - $$0.w() == $$13.w()) {
         this.a_(this.ds(), this.du() + (double)$$13.v(), this.dy());
      }

      this.u();
      eju $$35 = this.q(this.ds(), this.du(), this.dy());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         eju $$37 = this.dq();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.g($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.ds(), $$35.d, this.dy());
      }

      int $$39 = atm.a(this.ds());
      int $$40 = atm.a(this.dy());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         eju $$41 = this.dq();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         eju $$43 = this.dq();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.g($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            eju $$46 = this.dq();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dim.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dim.a) {
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

   private boolean a(ht $$0) {
      return this.dN().a_($$0).g(this.dN(), $$0);
   }

   protected void u() {
      double $$0 = this.bP() ? 0.997 : 0.96;
      eju $$1 = this.dq();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.aZ()) {
         $$1 = $$1.a(0.95F);
      }

      this.g($$1);
   }

   @Nullable
   public eju a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = atm.a($$0);
      int $$5 = atm.a($$1);
      int $$6 = atm.a($$2);
      if (this.dN().a_(new ht($$4, $$5 - 1, $$6)).a(arg.N)) {
         $$5--;
      }

      dhi $$7 = this.dN().a_(new ht($$4, $$5, $$6));
      if (cup.g($$7)) {
         dim $$8 = $$7.c(((cup)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<iw, iw> $$9 = a($$8);
         iw $$10 = (iw)$$9.getFirst();
         iw $$11 = (iw)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && atm.a($$0) - $$4 == $$10.u() && atm.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && atm.a($$0) - $$4 == $$11.u() && atm.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public eju q(double $$0, double $$1, double $$2) {
      int $$3 = atm.a($$0);
      int $$4 = atm.a($$1);
      int $$5 = atm.a($$2);
      if (this.dN().a_(new ht($$3, $$4 - 1, $$5)).a(arg.N)) {
         $$4--;
      }

      dhi $$6 = this.dN().a_(new ht($$3, $$4, $$5));
      if (cup.g($$6)) {
         dim $$7 = $$6.c(((cup)$$6.b()).c());
         Pair<iw, iw> $$8 = a($$7);
         iw $$9 = (iw)$$8.getFirst();
         iw $$10 = (iw)$$8.getSecond();
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

         return new eju($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public ejp h_() {
      ejp $$0 = this.cH();
      return this.B() ? $$0.g((double)Math.abs(this.z()) / 16.0) : $$0;
   }

   @Override
   protected void a(rz $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(so.a(this.dN().a(jz.e), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(rz $$0) {
      if (this.B()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", so.a(this.x()));
         $$0.a("DisplayOffset", this.z());
      }
   }

   @Override
   public void g(bkq $$0) {
      if (!this.dN().B) {
         if (!$$0.af && !this.af) {
            if (!this.x($$0)) {
               double $$1 = $$0.ds() - this.ds();
               double $$2 = $$0.dy() - this.dy();
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
                  if ($$0 instanceof cfl) {
                     double $$5 = $$0.ds() - this.ds();
                     double $$6 = $$0.dy() - this.dy();
                     eju $$7 = new eju($$5, 0.0, $$6).d();
                     eju $$8 = new eju((double)atm.b(this.dD() * (float) (Math.PI / 180.0)), 0.0, (double)atm.a(this.dD() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     eju $$10 = this.dq();
                     eju $$11 = $$0.dq();
                     if (((cfl)$$0).w() == cfl.a.c && this.w() != cfl.a.c) {
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.g($$11.d(0.95, 1.0, 0.95));
                     } else if (((cfl)$$0).w() != cfl.a.c && this.w() == cfl.a.c) {
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
   public double o_() {
      return this.n > 0 ? this.o : this.ds();
   }

   @Override
   public double M_() {
      return this.n > 0 ? this.p : this.du();
   }

   @Override
   public double N_() {
      return this.n > 0 ? this.q : this.dy();
   }

   @Override
   public float e_() {
      return this.n > 0 ? (float)this.s : this.dF();
   }

   @Override
   public float p_() {
      return this.n > 0 ? (float)this.r : this.dD();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.t = new eju($$0, $$1, $$2);
      this.g(this.t);
   }

   public abstract cfl.a w();

   public dhi x() {
      return !this.B() ? this.y() : cva.a(this.an().b(e));
   }

   public dhi y() {
      return cvc.a.o();
   }

   public int z() {
      return !this.B() ? this.A() : this.an().b(i);
   }

   public int A() {
      return 6;
   }

   public void c(dhi $$0) {
      this.an().b(e, cva.i($$0));
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
   public clj dA() {
      return new clj(switch (this.w()) {
         case b -> clm.nM;
         case c -> clm.nN;
         case d -> clm.nO;
         default -> clm.nL;
         case f -> clm.nP;
         case g -> clm.uE;
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
