import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cmg extends cmt {
   private static final etf c = new etf(0.0, 0.0, 0.0);
   private static final ajk<Integer> d = ajo.a(cmg.class, ajm.b);
   private static final ajk<Integer> e = ajo.a(cmg.class, ajm.b);
   private static final ajk<Boolean> i = ajo.a(cmg.class, ajm.k);
   private static final ImmutableMap<brp, ImmutableList<Integer>> j = ImmutableMap.of(
      brp.a, ImmutableList.of(0, 1, -1), brp.f, ImmutableList.of(0, 1, -1), brp.d, ImmutableList.of(0, 1)
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
   private etf s = etf.b;
   private static final Map<drc, Pair<jq, jq>> t = ac.a(Maps.newEnumMap(drc.class), $$0 -> {
      jq $$1 = ir.e.q();
      jq $$2 = ir.f.q();
      jq $$3 = ir.c.q();
      jq $$4 = ir.d.q();
      jq $$5 = $$1.o();
      jq $$6 = $$2.o();
      jq $$7 = $$3.o();
      jq $$8 = $$4.o();
      $$0.put(drc.a, Pair.of($$3, $$4));
      $$0.put(drc.b, Pair.of($$1, $$2));
      $$0.put(drc.c, Pair.of($$5, $$2));
      $$0.put(drc.d, Pair.of($$1, $$6));
      $$0.put(drc.e, Pair.of($$3, $$8));
      $$0.put(drc.f, Pair.of($$7, $$4));
      $$0.put(drc.g, Pair.of($$4, $$2));
      $$0.put(drc.h, Pair.of($$4, $$1));
      $$0.put(drc.i, Pair.of($$3, $$1));
      $$0.put(drc.j, Pair.of($$3, $$2));
   });

   protected cmg(bqr<?> $$0, czu $$1) {
      super($$0, $$1);
      this.J = true;
   }

   protected cmg(bqr<?> $$0, czu $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cmg a(aqe $$0, double $$1, double $$2, double $$3, cmg.a $$4, csd $$5, @Nullable ckl $$6) {
      cmg $$7 = (cmg)(switch ($$4) {
         case b -> new cmn($$0, $$1, $$2, $$3);
         case c -> new cmp($$0, $$1, $$2, $$3);
         case d -> new cms($$0, $$1, $$2, $$3);
         case e -> new cmr($$0, $$1, $$2, $$3);
         case f -> new cmq($$0, $$1, $$2, $$3);
         case g -> new cmo($$0, $$1, $$2, $$3);
         default -> new cmm($$0, $$1, $$2, $$3);
      });
      bqr.<cmg>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bql.b aZ() {
      return bql.b.c;
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(d, dcv.i(dcx.a.n()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(bql $$0) {
      return cmi.a(this, $$0);
   }

   @Override
   public boolean by() {
      return true;
   }

   @Override
   protected etf a(ir.a $$0, l.a $$1) {
      return bre.i(super.a($$0, $$1));
   }

   @Override
   protected etf a(bql $$0, bqo $$1, float $$2) {
      boolean $$3 = $$0 instanceof cjy || $$0 instanceof cke;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public etf b(bre $$0) {
      ir $$1 = this.cG();
      if ($$1.o() == ir.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cml.a($$1);
         im $$3 = this.dn();
         im.a $$4 = new im.a();
         ImmutableList<brp> $$5 = $$0.fG();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            brp $$6 = (brp)$$14.next();
            bqo $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dN().a(cml.a(this.dN(), $$4), () -> cml.a(this.dN(), $$4.d()));
                  if (cml.a($$11)) {
                     eta $$12 = new eta((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     etf $$13 = etf.a($$4, $$11);
                     if (cml.a(this.dN(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cI().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            brp $$15 = (brp)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = axw.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cml.a($$4, $$17, $$0x -> this.dN().a_($$0x).k(this.dN(), $$0x));
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
      dpy $$0 = this.dN().a_(this.dn());
      return $$0.a(avo.N) ? 1.0F : super.aL();
   }

   @Override
   public void m(float $$0) {
      this.n(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bx() {
      return !this.dI();
   }

   private static Pair<jq, jq> a(drc $$0) {
      return t.get($$0);
   }

   @Override
   public ir cG() {
      return this.k ? this.cF().g().h() : this.cF().h();
   }

   @Override
   protected double aW() {
      return this.bc() ? 0.005 : 0.04;
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
      this.bM();
      if (this.dN().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.ar();
            this.a(this.dD(), this.dF());
         }
      } else {
         this.aY();
         int $$0 = axw.a(this.ds());
         int $$1 = axw.a(this.du());
         int $$2 = axw.a(this.dy());
         if (this.dN().a_(new im($$0, $$1 - 1, $$2)).a(avo.N)) {
            $$1--;
         }

         im $$3 = new im($$0, $$1, $$2);
         dpy $$4 = this.dN().a_($$3);
         this.l = dck.g($$4);
         if (this.l) {
            this.c($$3, $$4);
            if ($$4.a(dcx.hh)) {
               this.a($$0, $$1, $$2, $$4.c(dir.f));
            }
         } else {
            this.r();
         }

         this.aQ();
         this.s(0.0F);
         double $$5 = this.L - this.ds();
         double $$6 = this.N - this.dy();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.r((float)(axw.d($$6, $$5) * 180.0 / Math.PI));
            if (this.k) {
               this.r(this.dD() + 180.0F);
            }
         }

         double $$7 = (double)axw.g(this.dD() - this.O);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.r(this.dD() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dD(), this.dF());
         if (this.v() == cmg.a.a && this.dq().i() > 0.01) {
            List<bql> $$8 = this.dN().a(this, this.cI().c(0.2F, 0.0, 0.2F), bqq.a(this));
            if (!$$8.isEmpty()) {
               for (bql $$9 : $$8) {
                  if (!($$9 instanceof ckl) && !($$9 instanceof cdf) && !($$9 instanceof cmg) && !this.bQ() && !$$9.bP()) {
                     $$9.n(this);
                  } else {
                     $$9.h(this);
                  }
               }
            }
         } else {
            for (bql $$10 : this.dN().a_(this, this.cI().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$10) && $$10.by() && $$10 instanceof cmg) {
                  $$10.h(this);
               }
            }
         }

         this.bj();
         if (this.bq()) {
            this.ay();
            this.ac *= 0.5F;
         }

         this.an = false;
      }
   }

   protected double p() {
      return (this.bc() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   protected void r() {
      double $$0 = this.p();
      etf $$1 = this.dq();
      this.o(axw.a($$1.c, -$$0, $$0), $$1.d, axw.a($$1.e, -$$0, $$0));
      if (this.aC()) {
         this.g(this.dq().a(0.5));
      }

      this.a(brj.a, this.dq());
      if (!this.aC()) {
         this.g(this.dq().a(0.95));
      }
   }

   @Override
   protected void c(im $$0, dpy $$1) {
      this.n();
      double $$2 = this.ds();
      double $$3 = this.du();
      double $$4 = this.dy();
      etf $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dcx.bp)) {
         $$6 = $$1.c(dir.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.bc()) {
         $$8 *= 0.2;
      }

      etf $$9 = this.dq();
      drc $$10 = $$1.c(((dck)$$1.b()).c());
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
      Pair<jq, jq> $$11 = a($$10);
      jq $$12 = (jq)$$11.getFirst();
      jq $$13 = (jq)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new etf($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.g($$9);
      bql $$19 = this.cR();
      if ($$19 instanceof ckl) {
         etf $$20 = $$19.dq();
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
            this.g(etf.b);
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
      double $$33 = this.bQ() ? 0.75 : 1.0;
      double $$34 = this.p();
      $$9 = this.dq();
      this.a(brj.a, new etf(axw.a($$33 * $$9.c, -$$34, $$34), 0.0, axw.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && axw.a(this.ds()) - $$0.u() == $$12.u() && axw.a(this.dy()) - $$0.w() == $$12.w()) {
         this.a_(this.ds(), this.du() + (double)$$12.v(), this.dy());
      } else if ($$13.v() != 0 && axw.a(this.ds()) - $$0.u() == $$13.u() && axw.a(this.dy()) - $$0.w() == $$13.w()) {
         this.a_(this.ds(), this.du() + (double)$$13.v(), this.dy());
      }

      this.u();
      etf $$35 = this.q(this.ds(), this.du(), this.dy());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         etf $$37 = this.dq();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.g($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.ds(), $$35.d, this.dy());
      }

      int $$39 = axw.a(this.ds());
      int $$40 = axw.a(this.dy());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         etf $$41 = this.dq();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         etf $$43 = this.dq();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.g($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            etf $$46 = this.dq();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == drc.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != drc.a) {
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
   public boolean cg() {
      return this.l;
   }

   private boolean a(im $$0) {
      return this.dN().a_($$0).g(this.dN(), $$0);
   }

   protected void u() {
      double $$0 = this.bQ() ? 0.997 : 0.96;
      etf $$1 = this.dq();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.bc()) {
         $$1 = $$1.a(0.95F);
      }

      this.g($$1);
   }

   @Nullable
   public etf a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = axw.a($$0);
      int $$5 = axw.a($$1);
      int $$6 = axw.a($$2);
      if (this.dN().a_(new im($$4, $$5 - 1, $$6)).a(avo.N)) {
         $$5--;
      }

      dpy $$7 = this.dN().a_(new im($$4, $$5, $$6));
      if (dck.g($$7)) {
         drc $$8 = $$7.c(((dck)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<jq, jq> $$9 = a($$8);
         jq $$10 = (jq)$$9.getFirst();
         jq $$11 = (jq)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && axw.a($$0) - $$4 == $$10.u() && axw.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && axw.a($$0) - $$4 == $$11.u() && axw.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public etf q(double $$0, double $$1, double $$2) {
      int $$3 = axw.a($$0);
      int $$4 = axw.a($$1);
      int $$5 = axw.a($$2);
      if (this.dN().a_(new im($$3, $$4 - 1, $$5)).a(avo.N)) {
         $$4--;
      }

      dpy $$6 = this.dN().a_(new im($$3, $$4, $$5));
      if (dck.g($$6)) {
         drc $$7 = $$6.c(((dck)$$6.b()).c());
         Pair<jq, jq> $$8 = a($$7);
         jq $$9 = (jq)$$8.getFirst();
         jq $$10 = (jq)$$8.getSecond();
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

         return new etf($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public eta h_() {
      eta $$0 = this.cI();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(ty $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(un.a(this.dN().a(ld.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(ty $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", un.a(this.w()));
         $$0.a("DisplayOffset", this.y());
      }
   }

   @Override
   public void h(bql $$0) {
      if (!this.dN().B) {
         if (!$$0.ag && !this.ag) {
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
                  if ($$0 instanceof cmg) {
                     double $$5 = $$0.ds() - this.ds();
                     double $$6 = $$0.dy() - this.dy();
                     etf $$7 = new etf($$5, 0.0, $$6).d();
                     etf $$8 = new etf((double)axw.b(this.dD() * (float) (Math.PI / 180.0)), 0.0, (double)axw.a(this.dD() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     etf $$10 = this.dq();
                     etf $$11 = $$0.dq();
                     if (((cmg)$$0).v() == cmg.a.c && this.v() != cmg.a.c) {
                        this.g($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.g($$11.d(0.95, 1.0, 0.95));
                     } else if (((cmg)$$0).v() != cmg.a.c && this.v() == cmg.a.c) {
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
   public double c_() {
      return this.m > 0 ? this.n : this.ds();
   }

   @Override
   public double d_() {
      return this.m > 0 ? this.o : this.du();
   }

   @Override
   public double L_() {
      return this.m > 0 ? this.p : this.dy();
   }

   @Override
   public float M_() {
      return this.m > 0 ? (float)this.r : this.dF();
   }

   @Override
   public float e_() {
      return this.m > 0 ? (float)this.q : this.dD();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new etf($$0, $$1, $$2);
      this.g(this.s);
   }

   public abstract cmg.a v();

   public dpy w() {
      return !this.A() ? this.x() : dcv.a(this.an().a(d));
   }

   public dpy x() {
      return dcx.a.n();
   }

   public int y() {
      return !this.A() ? this.z() : this.an().a(e);
   }

   public int z() {
      return 6;
   }

   public void c(dpy $$0) {
      this.an().a(d, dcv.i($$0));
      this.a(true);
   }

   public void c(int $$0) {
      this.an().a(e, $$0);
      this.a(true);
   }

   public boolean A() {
      return this.an().a(i);
   }

   public void a(boolean $$0) {
      this.an().a(i, $$0);
   }

   @Override
   public csd dA() {
      return new csd(switch (this.v()) {
         case b -> csg.nN;
         case c -> csg.nO;
         case d -> csg.nP;
         default -> csg.nM;
         case f -> csg.nQ;
         case g -> csg.uM;
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
