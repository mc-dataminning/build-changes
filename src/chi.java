import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class chi extends chv {
   private static final emc c = new emc(0.0, 0.0, 0.0);
   private static final agn<Integer> d = agq.a(chi.class, agp.b);
   private static final agn<Integer> e = agq.a(chi.class, agp.b);
   private static final agn<Boolean> i = agq.a(chi.class, agp.k);
   private static final ImmutableMap<bna, ImmutableList<Integer>> j = ImmutableMap.of(
      bna.a, ImmutableList.of(0, 1, -1), bna.f, ImmutableList.of(0, 1, -1), bna.d, ImmutableList.of(0, 1)
   );
   protected static final float b = 0.95F;
   private boolean k;
   private boolean l;
   private int m;
   private double n;
   private double o;
   private double p;
   private double q;
   private double r;
   private emc s = emc.b;
   private static final Map<dkt, Pair<jb, jb>> t = ac.a(Maps.newEnumMap(dkt.class), $$0 -> {
      jb $$1 = ic.e.q();
      jb $$2 = ic.f.q();
      jb $$3 = ic.c.q();
      jb $$4 = ic.d.q();
      jb $$5 = $$1.o();
      jb $$6 = $$2.o();
      jb $$7 = $$3.o();
      jb $$8 = $$4.o();
      $$0.put(dkt.a, Pair.of($$3, $$4));
      $$0.put(dkt.b, Pair.of($$1, $$2));
      $$0.put(dkt.c, Pair.of($$5, $$2));
      $$0.put(dkt.d, Pair.of($$1, $$6));
      $$0.put(dkt.e, Pair.of($$3, $$8));
      $$0.put(dkt.f, Pair.of($$7, $$4));
      $$0.put(dkt.g, Pair.of($$4, $$2));
      $$0.put(dkt.h, Pair.of($$4, $$1));
      $$0.put(dkt.i, Pair.of($$3, $$1));
      $$0.put(dkt.j, Pair.of($$3, $$2));
   });

   protected chi(bmc<?> $$0, ctx $$1) {
      super($$0, $$1);
      this.I = true;
   }

   protected chi(bmc<?> $$0, ctx $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.K = $$2;
      this.L = $$3;
      this.M = $$4;
   }

   public static chi a(ane $$0, double $$1, double $$2, double $$3, chi.a $$4, cng $$5, @Nullable cfq $$6) {
      chi $$7 = (chi)(switch ($$4) {
         case b -> new chp($$0, $$1, $$2, $$3);
         case c -> new chr($$0, $$1, $$2, $$3);
         case d -> new chu($$0, $$1, $$2, $$3);
         case e -> new cht($$0, $$1, $$2, $$3);
         case f -> new chs($$0, $$1, $$2, $$3);
         case g -> new chq($$0, $$1, $$2, $$3);
         default -> new cho($$0, $$1, $$2, $$3);
      });
      bmc.<chi>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected blw.b aW() {
      return blw.b.c;
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, cwy.i(cxa.a.o()));
      this.an.a(e, 6);
      this.an.a(i, false);
   }

   @Override
   public boolean h(blw $$0) {
      return chk.a(this, $$0);
   }

   @Override
   public boolean bu() {
      return true;
   }

   @Override
   protected emc a(ic.a $$0, l.a $$1) {
      return bmo.i(super.a($$0, $$1));
   }

   @Override
   protected emc a(blw $$0, blz $$1, float $$2) {
      boolean $$3 = $$0 instanceof cfd || $$0 instanceof cfj;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public emc b(bmo $$0) {
      ic $$1 = this.cF();
      if ($$1.o() == ic.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = chn.a($$1);
         hx $$3 = this.dl();
         hx.a $$4 = new hx.a();
         ImmutableList<bna> $$5 = $$0.fA();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bna $$6 = (bna)$$14.next();
            blz $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dL().a(chn.a(this.dL(), $$4), () -> chn.a(this.dL(), $$4.d()));
                  if (chn.a($$11)) {
                     elx $$12 = new elx((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     emc $$13 = emc.a($$4, $$11);
                     if (chn.a(this.dL(), $$0, $$12.c($$13))) {
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
            bna $$15 = (bna)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = aup.c($$14x - (double)$$4.v() + $$16);
            double $$18 = chn.a($$4, $$17, $$0x -> this.dL().a_($$0x).k(this.dL(), $$0x));
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
      djp $$0 = this.dL().a_(this.dl());
      return $$0.a(asi.N) ? 1.0F : super.aL();
   }

   @Override
   public void m(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bt() {
      return !this.dG();
   }

   private static Pair<jb, jb> a(dkt $$0) {
      return t.get($$0);
   }

   @Override
   public ic cF() {
      return this.k ? this.cE().g().h() : this.cE().h();
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
      if (this.dL().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.ar();
            this.a(this.dB(), this.dD());
         }
      } else {
         if (!this.aV()) {
            double $$0 = this.aZ() ? -0.005 : -0.04;
            this.g(this.do().b(0.0, $$0, 0.0));
         }

         int $$1 = aup.a(this.dq());
         int $$2 = aup.a(this.ds());
         int $$3 = aup.a(this.dw());
         if (this.dL().a_(new hx($$1, $$2 - 1, $$3)).a(asi.N)) {
            $$2--;
         }

         hx $$4 = new hx($$1, $$2, $$3);
         djp $$5 = this.dL().a_($$4);
         this.l = cwn.g($$5);
         if (this.l) {
            this.c($$4, $$5);
            if ($$5.a(cxa.hh)) {
               this.a($$1, $$2, $$3, $$5.c(dct.f));
            }
         } else {
            this.s();
         }

         this.aQ();
         this.s(0.0F);
         double $$6 = this.K - this.dq();
         double $$7 = this.M - this.dw();
         if ($$6 * $$6 + $$7 * $$7 > 0.001) {
            this.r((float)(aup.d($$7, $$6) * 180.0 / Math.PI));
            if (this.k) {
               this.r(this.dB() + 180.0F);
            }
         }

         double $$8 = (double)aup.g(this.dB() - this.N);
         if ($$8 < -170.0 || $$8 >= 170.0) {
            this.r(this.dB() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dB(), this.dD());
         if (this.w() == chi.a.a && this.do().i() > 0.01) {
            List<blw> $$9 = this.dL().a(this, this.cH().c(0.2F, 0.0, 0.2F), bmb.a(this));
            if (!$$9.isEmpty()) {
               for (blw $$10 : $$9) {
                  if (!($$10 instanceof cfq) && !($$10 instanceof byo) && !($$10 instanceof chi) && !this.bP() && !$$10.bO()) {
                     $$10.m(this);
                  } else {
                     $$10.g(this);
                  }
               }
            }
         } else {
            for (blw $$11 : this.dL().a_(this, this.cH().c(0.2F, 0.0, 0.2F))) {
               if (!this.w($$11) && $$11.bu() && $$11 instanceof chi) {
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
      emc $$1 = this.do();
      this.o(aup.a($$1.c, -$$0, $$0), $$1.d, aup.a($$1.e, -$$0, $$0));
      if (this.aC()) {
         this.g(this.do().a(0.5));
      }

      this.a(bmu.a, this.do());
      if (!this.aC()) {
         this.g(this.do().a(0.95));
      }
   }

   @Override
   protected void c(hx $$0, djp $$1) {
      this.n();
      double $$2 = this.dq();
      double $$3 = this.ds();
      double $$4 = this.dw();
      emc $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(cxa.bp)) {
         $$6 = $$1.c(dct.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.aZ()) {
         $$8 *= 0.2;
      }

      emc $$9 = this.do();
      dkt $$10 = $$1.c(((cwn)$$1.b()).c());
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

      $$9 = this.do();
      Pair<jb, jb> $$11 = a($$10);
      jb $$12 = (jb)$$11.getFirst();
      jb $$13 = (jb)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new emc($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.g($$9);
      blw $$19 = this.cQ();
      if ($$19 instanceof cfq) {
         emc $$20 = $$19.do();
         double $$21 = $$20.i();
         double $$22 = this.do().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.g(this.do().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.do().h();
         if ($$23 < 0.03) {
            this.g(emc.b);
         } else {
            this.g(this.do().d(0.5, 0.0, 0.5));
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
      $$9 = this.do();
      this.a(bmu.a, new emc(aup.a($$33 * $$9.c, -$$34, $$34), 0.0, aup.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && aup.a(this.dq()) - $$0.u() == $$12.u() && aup.a(this.dw()) - $$0.w() == $$12.w()) {
         this.a_(this.dq(), this.ds() + (double)$$12.v(), this.dw());
      } else if ($$13.v() != 0 && aup.a(this.dq()) - $$0.u() == $$13.u() && aup.a(this.dw()) - $$0.w() == $$13.w()) {
         this.a_(this.dq(), this.ds() + (double)$$13.v(), this.dw());
      }

      this.u();
      emc $$35 = this.q(this.dq(), this.ds(), this.dw());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         emc $$37 = this.do();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.g($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.dq(), $$35.d, this.dw());
      }

      int $$39 = aup.a(this.dq());
      int $$40 = aup.a(this.dw());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         emc $$41 = this.do();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         emc $$43 = this.do();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.g($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            emc $$46 = this.do();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dkt.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dkt.a) {
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
      return this.l;
   }

   private boolean a(hx $$0) {
      return this.dL().a_($$0).g(this.dL(), $$0);
   }

   protected void u() {
      double $$0 = this.bP() ? 0.997 : 0.96;
      emc $$1 = this.do();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.aZ()) {
         $$1 = $$1.a(0.95F);
      }

      this.g($$1);
   }

   @Nullable
   public emc a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = aup.a($$0);
      int $$5 = aup.a($$1);
      int $$6 = aup.a($$2);
      if (this.dL().a_(new hx($$4, $$5 - 1, $$6)).a(asi.N)) {
         $$5--;
      }

      djp $$7 = this.dL().a_(new hx($$4, $$5, $$6));
      if (cwn.g($$7)) {
         dkt $$8 = $$7.c(((cwn)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<jb, jb> $$9 = a($$8);
         jb $$10 = (jb)$$9.getFirst();
         jb $$11 = (jb)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && aup.a($$0) - $$4 == $$10.u() && aup.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && aup.a($$0) - $$4 == $$11.u() && aup.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public emc q(double $$0, double $$1, double $$2) {
      int $$3 = aup.a($$0);
      int $$4 = aup.a($$1);
      int $$5 = aup.a($$2);
      if (this.dL().a_(new hx($$3, $$4 - 1, $$5)).a(asi.N)) {
         $$4--;
      }

      djp $$6 = this.dL().a_(new hx($$3, $$4, $$5));
      if (cwn.g($$6)) {
         dkt $$7 = $$6.c(((cwn)$$6.b()).c());
         Pair<jb, jb> $$8 = a($$7);
         jb $$9 = (jb)$$8.getFirst();
         jb $$10 = (jb)$$8.getSecond();
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

         return new emc($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public elx i_() {
      elx $$0 = this.cH();
      return this.B() ? $$0.g((double)Math.abs(this.z()) / 16.0) : $$0;
   }

   @Override
   protected void a(so $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(td.a(this.dL().a(ke.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(so $$0) {
      if (this.B()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", td.a(this.x()));
         $$0.a("DisplayOffset", this.z());
      }
   }

   @Override
   public void g(blw $$0) {
      if (!this.dL().B) {
         if (!$$0.af && !this.af) {
            if (!this.w($$0)) {
               double $$1 = $$0.dq() - this.dq();
               double $$2 = $$0.dw() - this.dw();
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
                  if ($$0 instanceof chi) {
                     double $$5 = $$0.dq() - this.dq();
                     double $$6 = $$0.dw() - this.dw();
                     emc $$7 = new emc($$5, 0.0, $$6).d();
                     emc $$8 = new emc((double)aup.b(this.dB() * (float) (Math.PI / 180.0)), 0.0, (double)aup.a(this.dB() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     emc $$10 = this.do();
                     emc $$11 = $$0.do();
                     if (((chi)$$0).w() == chi.a.c && this.w() != chi.a.c) {
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.g($$11.d(0.95, 1.0, 0.95));
                     } else if (((chi)$$0).w() != chi.a.c && this.w() == chi.a.c) {
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
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = (double)$$3;
      this.r = (double)$$4;
      this.m = $$5 + 2;
      this.g(this.s);
   }

   @Override
   public double p_() {
      return this.m > 0 ? this.n : this.dq();
   }

   @Override
   public double N_() {
      return this.m > 0 ? this.o : this.ds();
   }

   @Override
   public double O_() {
      return this.m > 0 ? this.p : this.dw();
   }

   @Override
   public float f_() {
      return this.m > 0 ? (float)this.r : this.dD();
   }

   @Override
   public float q_() {
      return this.m > 0 ? (float)this.q : this.dB();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new emc($$0, $$1, $$2);
      this.g(this.s);
   }

   public abstract chi.a w();

   public djp x() {
      return !this.B() ? this.y() : cwy.a(this.an().b(d));
   }

   public djp y() {
      return cxa.a.o();
   }

   public int z() {
      return !this.B() ? this.A() : this.an().b(e);
   }

   public int A() {
      return 6;
   }

   public void c(djp $$0) {
      this.an().b(d, cwy.i($$0));
      this.a(true);
   }

   public void c(int $$0) {
      this.an().b(e, $$0);
      this.a(true);
   }

   public boolean B() {
      return this.an().b(i);
   }

   public void a(boolean $$0) {
      this.an().b(i, $$0);
   }

   @Override
   public cng dy() {
      return new cng(switch (this.w()) {
         case b -> cnj.nM;
         case c -> cnj.nN;
         case d -> cnj.nO;
         default -> cnj.nL;
         case f -> cnj.nP;
         case g -> cnj.uI;
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
