import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class coc extends coq {
   private static final evz c = new evz(0.0, 0.0, 0.0);
   private static final ajp<Integer> d = ajt.a(coc.class, ajr.b);
   private static final ajp<Integer> e = ajt.a(coc.class, ajr.b);
   private static final ajp<Boolean> i = ajt.a(coc.class, ajr.k);
   private static final ImmutableMap<btk, ImmutableList<Integer>> j = ImmutableMap.of(
      btk.a, ImmutableList.of(0, 1, -1), btk.f, ImmutableList.of(0, 1, -1), btk.d, ImmutableList.of(0, 1)
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
   private evz s = evz.b;
   private static final Map<dtl, Pair<ke, ke>> t = ac.a(Maps.newEnumMap(dtl.class), $$0 -> {
      ke $$1 = jf.e.q();
      ke $$2 = jf.f.q();
      ke $$3 = jf.c.q();
      ke $$4 = jf.d.q();
      ke $$5 = $$1.o();
      ke $$6 = $$2.o();
      ke $$7 = $$3.o();
      ke $$8 = $$4.o();
      $$0.put(dtl.a, Pair.of($$3, $$4));
      $$0.put(dtl.b, Pair.of($$1, $$2));
      $$0.put(dtl.c, Pair.of($$5, $$2));
      $$0.put(dtl.d, Pair.of($$1, $$6));
      $$0.put(dtl.e, Pair.of($$3, $$8));
      $$0.put(dtl.f, Pair.of($$7, $$4));
      $$0.put(dtl.g, Pair.of($$4, $$2));
      $$0.put(dtl.h, Pair.of($$4, $$1));
      $$0.put(dtl.i, Pair.of($$3, $$1));
      $$0.put(dtl.j, Pair.of($$3, $$2));
   });

   protected coc(bsj<?> $$0, dcd $$1) {
      super($$0, $$1);
      this.J = true;
   }

   protected coc(bsj<?> $$0, dcd $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static coc a(aqk $$0, double $$1, double $$2, double $$3, coc.a $$4, cua $$5, @Nullable cmh $$6) {
      coc $$7 = (coc)(switch ($$4) {
         case b -> new coj($$0, $$1, $$2, $$3);
         case c -> new col($$0, $$1, $$2, $$3);
         case d -> new cop($$0, $$1, $$2, $$3);
         case e -> new coo($$0, $$1, $$2, $$3);
         case f -> new com($$0, $$1, $$2, $$3);
         case g -> new cok($$0, $$1, $$2, $$3);
         default -> new coi($$0, $$1, $$2, $$3);
      });
      bsj.<coc>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bsd.b bb() {
      return bsd.b.c;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, dff.i(dfh.a.o()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(bsd $$0) {
      return coe.a(this, $$0);
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   protected evz a(jf.a $$0, l.a $$1) {
      return bsy.j(super.a($$0, $$1));
   }

   @Override
   protected evz a(bsd $$0, bsg $$1, float $$2) {
      boolean $$3 = $$0 instanceof clu || $$0 instanceof cma;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public evz b(bsy $$0) {
      jf $$1 = this.cI();
      if ($$1.o() == jf.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = coh.a($$1);
         ja $$3 = this.dp();
         ja.a $$4 = new ja.a();
         ImmutableList<btk> $$5 = $$0.fE();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            btk $$6 = (btk)$$14.next();
            bsg $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dP().a(coh.a(this.dP(), $$4), () -> coh.a(this.dP(), $$4.d()));
                  if (coh.a($$11)) {
                     evu $$12 = new evu((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     evz $$13 = evz.a($$4, $$11);
                     if (coh.a(this.dP(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cK().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            btk $$15 = (btk)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = aye.c($$14x - (double)$$4.v() + $$16);
            double $$18 = coh.a($$4, $$17, $$0x -> this.dP().a_($$0x).k(this.dP(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aN() {
      dsh $$0 = this.dP().a_(this.dp());
      return $$0.a(avu.N) ? 1.0F : super.aN();
   }

   @Override
   public void n(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bz() {
      return !this.dK();
   }

   private static Pair<ke, ke> a(dtl $$0) {
      return t.get($$0);
   }

   @Override
   public jf cI() {
      return this.k ? this.cH().g().h() : this.cH().h();
   }

   @Override
   protected double aY() {
      return this.be() ? 0.005 : 0.04;
   }

   @Override
   public void l() {
      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      this.av();
      this.bO();
      if (this.dP().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.at();
            this.a(this.dF(), this.dH());
         }
      } else {
         this.ba();
         int $$0 = aye.a(this.du());
         int $$1 = aye.a(this.dw());
         int $$2 = aye.a(this.dA());
         if (this.dP().a_(new ja($$0, $$1 - 1, $$2)).a(avu.N)) {
            $$1--;
         }

         ja $$3 = new ja($$0, $$1, $$2);
         dsh $$4 = this.dP().a_($$3);
         this.l = deu.g($$4);
         if (this.l) {
            this.c($$3, $$4);
            if ($$4.a(dfh.hh)) {
               this.a($$0, $$1, $$2, $$4.c(dlb.f));
            }
         } else {
            this.s();
         }

         this.aS();
         this.t(0.0F);
         double $$5 = this.L - this.du();
         double $$6 = this.N - this.dA();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.s((float)(aye.d($$6, $$5) * 180.0 / Math.PI));
            if (this.k) {
               this.s(this.dF() + 180.0F);
            }
         }

         double $$7 = (double)aye.g(this.dF() - this.O);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.s(this.dF() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dF(), this.dH());
         if (this.v() == coc.a.a && this.ds().i() > 0.01) {
            List<bsd> $$8 = this.dP().a(this, this.cK().c(0.2F, 0.0, 0.2F), bsi.a(this));
            if (!$$8.isEmpty()) {
               for (bsd $$9 : $$8) {
                  if (!($$9 instanceof cmh) && !($$9 instanceof cfa) && !($$9 instanceof coc) && !this.bS() && !$$9.bR()) {
                     $$9.n(this);
                  } else {
                     $$9.h(this);
                  }
               }
            }
         } else {
            for (bsd $$10 : this.dP().a_(this, this.cK().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$10) && $$10.bA() && $$10 instanceof coc) {
                  $$10.h(this);
               }
            }
         }

         this.bl();
         if (this.bs()) {
            this.aA();
            this.ac *= 0.5F;
         }

         this.an = false;
      }
   }

   protected double p() {
      return (this.be() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   protected void s() {
      double $$0 = this.p();
      evz $$1 = this.ds();
      this.o(aye.a($$1.c, -$$0, $$0), $$1.d, aye.a($$1.e, -$$0, $$0));
      if (this.aE()) {
         this.h(this.ds().a(0.5));
      }

      this.a(btd.a, this.ds());
      if (!this.aE()) {
         this.h(this.ds().a(0.95));
      }
   }

   @Override
   protected void c(ja $$0, dsh $$1) {
      this.n();
      double $$2 = this.du();
      double $$3 = this.dw();
      double $$4 = this.dA();
      evz $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dfh.bp)) {
         $$6 = $$1.c(dlb.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.be()) {
         $$8 *= 0.2;
      }

      evz $$9 = this.ds();
      dtl $$10 = $$1.c(((deu)$$1.b()).c());
      switch ($$10) {
         case c:
            this.h($$9.b(-$$8, 0.0, 0.0));
            $$3++;
            break;
         case d:
            this.h($$9.b($$8, 0.0, 0.0));
            $$3++;
            break;
         case e:
            this.h($$9.b(0.0, 0.0, $$8));
            $$3++;
            break;
         case f:
            this.h($$9.b(0.0, 0.0, -$$8));
            $$3++;
      }

      $$9 = this.ds();
      Pair<ke, ke> $$11 = a($$10);
      ke $$12 = (ke)$$11.getFirst();
      ke $$13 = (ke)$$11.getSecond();
      double $$14 = (double)($$13.u() - $$12.u());
      double $$15 = (double)($$13.w() - $$12.w());
      double $$16 = Math.sqrt($$14 * $$14 + $$15 * $$15);
      double $$17 = $$9.c * $$14 + $$9.e * $$15;
      if ($$17 < 0.0) {
         $$14 = -$$14;
         $$15 = -$$15;
      }

      double $$18 = Math.min(2.0, $$9.h());
      $$9 = new evz($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.h($$9);
      bsd $$19 = this.cT();
      if ($$19 instanceof cmh) {
         evz $$20 = $$19.ds();
         double $$21 = $$20.i();
         double $$22 = this.ds().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.h(this.ds().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.ds().h();
         if ($$23 < 0.03) {
            this.h(evz.b);
         } else {
            this.h(this.ds().d(0.5, 0.0, 0.5));
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
      double $$33 = this.bS() ? 0.75 : 1.0;
      double $$34 = this.p();
      $$9 = this.ds();
      this.a(btd.a, new evz(aye.a($$33 * $$9.c, -$$34, $$34), 0.0, aye.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && aye.a(this.du()) - $$0.u() == $$12.u() && aye.a(this.dA()) - $$0.w() == $$12.w()) {
         this.a_(this.du(), this.dw() + (double)$$12.v(), this.dA());
      } else if ($$13.v() != 0 && aye.a(this.du()) - $$0.u() == $$13.u() && aye.a(this.dA()) - $$0.w() == $$13.w()) {
         this.a_(this.du(), this.dw() + (double)$$13.v(), this.dA());
      }

      this.u();
      evz $$35 = this.q(this.du(), this.dw(), this.dA());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         evz $$37 = this.ds();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.h($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.du(), $$35.d, this.dA());
      }

      int $$39 = aye.a(this.du());
      int $$40 = aye.a(this.dA());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         evz $$41 = this.ds();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         evz $$43 = this.ds();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.h($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            evz $$46 = this.ds();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dtl.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dtl.a) {
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
   public boolean ci() {
      return this.l;
   }

   private boolean a(ja $$0) {
      return this.dP().a_($$0).g(this.dP(), $$0);
   }

   protected void u() {
      double $$0 = this.bS() ? 0.997 : 0.96;
      evz $$1 = this.ds();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.be()) {
         $$1 = $$1.a(0.95F);
      }

      this.h($$1);
   }

   @Nullable
   public evz a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = aye.a($$0);
      int $$5 = aye.a($$1);
      int $$6 = aye.a($$2);
      if (this.dP().a_(new ja($$4, $$5 - 1, $$6)).a(avu.N)) {
         $$5--;
      }

      dsh $$7 = this.dP().a_(new ja($$4, $$5, $$6));
      if (deu.g($$7)) {
         dtl $$8 = $$7.c(((deu)$$7.b()).c());
         $$1 = (double)$$5;
         if ($$8.b()) {
            $$1 = (double)($$5 + 1);
         }

         Pair<ke, ke> $$9 = a($$8);
         ke $$10 = (ke)$$9.getFirst();
         ke $$11 = (ke)$$9.getSecond();
         double $$12 = (double)($$11.u() - $$10.u());
         double $$13 = (double)($$11.w() - $$10.w());
         double $$14 = Math.sqrt($$12 * $$12 + $$13 * $$13);
         $$12 /= $$14;
         $$13 /= $$14;
         $$0 += $$12 * $$3;
         $$2 += $$13 * $$3;
         if ($$10.v() != 0 && aye.a($$0) - $$4 == $$10.u() && aye.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && aye.a($$0) - $$4 == $$11.u() && aye.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public evz q(double $$0, double $$1, double $$2) {
      int $$3 = aye.a($$0);
      int $$4 = aye.a($$1);
      int $$5 = aye.a($$2);
      if (this.dP().a_(new ja($$3, $$4 - 1, $$5)).a(avu.N)) {
         $$4--;
      }

      dsh $$6 = this.dP().a_(new ja($$3, $$4, $$5));
      if (deu.g($$6)) {
         dtl $$7 = $$6.c(((deu)$$6.b()).c());
         Pair<ke, ke> $$8 = a($$7);
         ke $$9 = (ke)$$8.getFirst();
         ke $$10 = (ke)$$8.getSecond();
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

         return new evz($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public evu h_() {
      evu $$0 = this.cK();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(tx $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(um.a(this.dP().a(lr.f), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(tx $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", um.a(this.w()));
         $$0.a("DisplayOffset", this.y());
      }
   }

   @Override
   public void h(bsd $$0) {
      if (!this.dP().B) {
         if (!$$0.ag && !this.ag) {
            if (!this.x($$0)) {
               double $$1 = $$0.du() - this.du();
               double $$2 = $$0.dA() - this.dA();
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
                  if ($$0 instanceof coc) {
                     double $$5 = $$0.du() - this.du();
                     double $$6 = $$0.dA() - this.dA();
                     evz $$7 = new evz($$5, 0.0, $$6).d();
                     evz $$8 = new evz((double)aye.b(this.dF() * (float) (Math.PI / 180.0)), 0.0, (double)aye.a(this.dF() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     evz $$10 = this.ds();
                     evz $$11 = $$0.ds();
                     if (((coc)$$0).v() == coc.a.c && this.v() != coc.a.c) {
                        this.h($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.h($$11.d(0.95, 1.0, 0.95));
                     } else if (((coc)$$0).v() != coc.a.c && this.v() == coc.a.c) {
                        $$0.h($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$10.c + $$1, 0.0, $$10.e + $$2);
                        this.h($$10.d(0.95, 1.0, 0.95));
                     } else {
                        double $$12 = ($$11.c + $$10.c) / 2.0;
                        double $$13 = ($$11.e + $$10.e) / 2.0;
                        this.h($$10.d(0.2, 1.0, 0.2));
                        this.j($$12 - $$1, 0.0, $$13 - $$2);
                        $$0.h($$11.d(0.2, 1.0, 0.2));
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
      this.h(this.s);
   }

   @Override
   public double c_() {
      return this.m > 0 ? this.n : this.du();
   }

   @Override
   public double d_() {
      return this.m > 0 ? this.o : this.dw();
   }

   @Override
   public double L_() {
      return this.m > 0 ? this.p : this.dA();
   }

   @Override
   public float M_() {
      return this.m > 0 ? (float)this.r : this.dH();
   }

   @Override
   public float e_() {
      return this.m > 0 ? (float)this.q : this.dF();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new evz($$0, $$1, $$2);
      this.h(this.s);
   }

   public abstract coc.a v();

   public dsh w() {
      return !this.A() ? this.x() : dff.a(this.ap().a(d));
   }

   public dsh x() {
      return dfh.a.o();
   }

   public int y() {
      return !this.A() ? this.z() : this.ap().a(e);
   }

   public int z() {
      return 6;
   }

   public void c(dsh $$0) {
      this.ap().a(d, dff.i($$0));
      this.a(true);
   }

   public void c(int $$0) {
      this.ap().a(e, $$0);
      this.a(true);
   }

   public boolean A() {
      return this.ap().a(i);
   }

   public void a(boolean $$0) {
      this.ap().a(i, $$0);
   }

   @Override
   public cua dC() {
      return new cua(switch (this.v()) {
         case b -> cud.nN;
         case c -> cud.nO;
         case d -> cud.nP;
         default -> cud.nM;
         case f -> cud.nQ;
         case g -> cud.uM;
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
