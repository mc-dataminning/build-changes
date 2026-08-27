import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public abstract class ceo extends cfb {
   private static final float c = 0.0F;
   private static final float d = 0.1875F;
   private static final afc<Integer> e = aff.a(ceo.class, afe.b);
   private static final afc<Integer> i = aff.a(ceo.class, afe.b);
   private static final afc<Boolean> j = aff.a(ceo.class, afe.k);
   private static final ImmutableMap<bkv, ImmutableList<Integer>> k = ImmutableMap.of(
      bkv.a, ImmutableList.of(0, 1, -1), bkv.f, ImmutableList.of(0, 1, -1), bkv.d, ImmutableList.of(0, 1)
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
   private eif t = eif.b;
   private static final Map<dhf, Pair<iw, iw>> u = ac.a(Maps.newEnumMap(dhf.class), $$0 -> {
      iw $$1 = hx.e.q();
      iw $$2 = hx.f.q();
      iw $$3 = hx.c.q();
      iw $$4 = hx.d.q();
      iw $$5 = $$1.o();
      iw $$6 = $$2.o();
      iw $$7 = $$3.o();
      iw $$8 = $$4.o();
      $$0.put(dhf.a, Pair.of($$3, $$4));
      $$0.put(dhf.b, Pair.of($$1, $$2));
      $$0.put(dhf.c, Pair.of($$5, $$2));
      $$0.put(dhf.d, Pair.of($$1, $$6));
      $$0.put(dhf.e, Pair.of($$3, $$8));
      $$0.put(dhf.f, Pair.of($$7, $$4));
      $$0.put(dhf.g, Pair.of($$4, $$2));
      $$0.put(dhf.h, Pair.of($$4, $$1));
      $$0.put(dhf.i, Pair.of($$3, $$1));
      $$0.put(dhf.j, Pair.of($$3, $$2));
   });

   protected ceo(bjx<?> $$0, cqz $$1) {
      super($$0, $$1);
      this.I = true;
   }

   protected ceo(bjx<?> $$0, cqz $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.e($$2, $$3, $$4);
      this.K = $$2;
      this.L = $$3;
      this.M = $$4;
   }

   public static ceo a(alq $$0, double $$1, double $$2, double $$3, ceo.a $$4, ckj $$5, @Nullable ccx $$6) {
      ceo $$7 = (ceo)(switch ($$4) {
         case b -> new cev($$0, $$1, $$2, $$3);
         case c -> new cex($$0, $$1, $$2, $$3);
         case d -> new cfa($$0, $$1, $$2, $$3);
         case e -> new cez($$0, $$1, $$2, $$3);
         case f -> new cey($$0, $$1, $$2, $$3);
         case g -> new cew($$0, $$1, $$2, $$3);
         default -> new ceu($$0, $$1, $$2, $$3);
      });
      bjx.<ceo>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bjt.b aU() {
      return bjt.b.c;
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(e, cua.i(cuc.a.o()));
      this.an.a(i, 6);
      this.an.a(j, false);
   }

   @Override
   public boolean h(bjt $$0) {
      return ceq.a(this, $$0);
   }

   @Override
   public boolean bs() {
      return true;
   }

   @Override
   protected eif a(hx.a $$0, l.a $$1) {
      return bkj.i(super.a($$0, $$1));
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      boolean $$3 = $$0 instanceof cck || $$0 instanceof ccq;
      return new Vector3f(0.0F, $$3 ? 0.0F : 0.1875F, 0.0F);
   }

   @Override
   public eif b(bkj $$0) {
      hx $$1 = this.cE();
      if ($$1.o() == hx.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cet.a($$1);
         ht $$3 = this.dl();
         ht.a $$4 = new ht.a();
         ImmutableList<bkv> $$5 = $$0.fA();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bkv $$6 = (bkv)$$14.next();
            bju $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a, 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)k.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dL().a(cet.a(this.dL(), $$4), () -> cet.a(this.dL(), $$4.d()));
                  if (cet.a($$11)) {
                     eia $$12 = new eia((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b, (double)$$8);
                     eif $$13 = eif.a($$4, $$11);
                     if (cet.a(this.dL(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cG().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bkv $$15 = (bkv)var22.next();
            double $$16 = (double)$$0.a($$15).b;
            int $$17 = asy.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cet.a($$4, $$17, $$0x -> this.dL().a_($$0x).k(this.dL(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aJ() {
      dgb $$0 = this.dL().a_(this.dl());
      return $$0.a(aqs.N) ? 1.0F : super.aJ();
   }

   @Override
   public void m(float $$0) {
      this.m(-this.O());
      this.d(10);
      this.b(this.M() + this.M() * 10.0F);
   }

   @Override
   public boolean br() {
      return !this.dG();
   }

   private static Pair<iw, iw> a(dhf $$0) {
      return u.get($$0);
   }

   @Override
   public hx cE() {
      return this.l ? this.cD().g().h() : this.cD().h();
   }

   @Override
   public void l() {
      if (this.N() > 0) {
         this.d(this.N() - 1);
      }

      if (this.M() > 0.0F) {
         this.b(this.M() - 1.0F);
      }

      this.ar();
      this.bH();
      if (this.dL().B) {
         if (this.n > 0) {
            this.a(this.n, this.o, this.p, this.q, this.r, this.s);
            this.n--;
         } else {
            this.ap();
            this.a(this.dB(), this.dD());
         }
      } else {
         if (!this.aT()) {
            double $$0 = this.aX() ? -0.005 : -0.04;
            this.f(this.do().b(0.0, $$0, 0.0));
         }

         int $$1 = asy.a(this.dq());
         int $$2 = asy.a(this.ds());
         int $$3 = asy.a(this.dw());
         if (this.dL().a_(new ht($$1, $$2 - 1, $$3)).a(aqs.N)) {
            $$2--;
         }

         ht $$4 = new ht($$1, $$2, $$3);
         dgb $$5 = this.dL().a_($$4);
         this.m = ctp.g($$5);
         if (this.m) {
            this.c($$4, $$5);
            if ($$5.a(cuc.hh)) {
               this.a($$1, $$2, $$3, $$5.c(czu.f));
            }
         } else {
            this.s();
         }

         this.aO();
         this.s(0.0F);
         double $$6 = this.K - this.dq();
         double $$7 = this.M - this.dw();
         if ($$6 * $$6 + $$7 * $$7 > 0.001) {
            this.r((float)(asy.d($$7, $$6) * 180.0 / Math.PI));
            if (this.l) {
               this.r(this.dB() + 180.0F);
            }
         }

         double $$8 = (double)asy.g(this.dB() - this.N);
         if ($$8 < -170.0 || $$8 >= 170.0) {
            this.r(this.dB() + 180.0F);
            this.l = !this.l;
         }

         this.a(this.dB(), this.dD());
         if (this.v() == ceo.a.a && this.do().i() > 0.01) {
            List<bjt> $$9 = this.dL().a(this, this.cG().c(0.2F, 0.0, 0.2F), bjw.a(this));
            if (!$$9.isEmpty()) {
               for (bjt $$10 : $$9) {
                  if (!($$10 instanceof ccx) && !($$10 instanceof bwg) && !($$10 instanceof ceo) && !this.bO() && !$$10.bN()) {
                     $$10.n(this);
                  } else {
                     $$10.g(this);
                  }
               }
            }
         } else {
            for (bjt $$11 : this.dL().a_(this, this.cG().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$11) && $$11.bs() && $$11 instanceof ceo) {
                  $$11.g(this);
               }
            }
         }

         this.be();
         if (this.bl()) {
            this.aw();
            this.ab *= 0.5F;
         }

         this.am = false;
      }
   }

   protected double q() {
      return (this.aX() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   @Override
   protected void s() {
      double $$0 = this.q();
      eif $$1 = this.do();
      this.o(asy.a($$1.c, -$$0, $$0), $$1.d, asy.a($$1.e, -$$0, $$0));
      if (this.aA()) {
         this.f(this.do().a(0.5));
      }

      this.a(bkp.a, this.do());
      if (!this.aA()) {
         this.f(this.do().a(0.95));
      }
   }

   @Override
   protected void c(ht $$0, dgb $$1) {
      this.n();
      double $$2 = this.dq();
      double $$3 = this.ds();
      double $$4 = this.dw();
      eif $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(cuc.bp)) {
         $$6 = $$1.c(czu.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.aX()) {
         $$8 *= 0.2;
      }

      eif $$9 = this.do();
      dhf $$10 = $$1.c(((ctp)$$1.b()).c());
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

      $$9 = this.do();
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
      $$9 = new eif($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.f($$9);
      bjt $$19 = this.cQ();
      if ($$19 instanceof ccx) {
         eif $$20 = $$19.do();
         double $$21 = $$20.i();
         double $$22 = this.do().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.f(this.do().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.do().h();
         if ($$23 < 0.03) {
            this.f(eif.b);
         } else {
            this.f(this.do().d(0.5, 0.0, 0.5));
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
      double $$33 = this.bO() ? 0.75 : 1.0;
      double $$34 = this.q();
      $$9 = this.do();
      this.a(bkp.a, new eif(asy.a($$33 * $$9.c, -$$34, $$34), 0.0, asy.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && asy.a(this.dq()) - $$0.u() == $$12.u() && asy.a(this.dw()) - $$0.w() == $$12.w()) {
         this.e(this.dq(), this.ds() + (double)$$12.v(), this.dw());
      } else if ($$13.v() != 0 && asy.a(this.dq()) - $$0.u() == $$13.u() && asy.a(this.dw()) - $$0.w() == $$13.w()) {
         this.e(this.dq(), this.ds() + (double)$$13.v(), this.dw());
      }

      this.t();
      eif $$35 = this.q(this.dq(), this.ds(), this.dw());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         eif $$37 = this.do();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.f($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.e(this.dq(), $$35.d, this.dw());
      }

      int $$39 = asy.a(this.dq());
      int $$40 = asy.a(this.dw());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         eif $$41 = this.do();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         eif $$43 = this.do();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.f($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            eif $$46 = this.do();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dhf.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dhf.a) {
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
   public boolean ce() {
      return this.m;
   }

   private boolean a(ht $$0) {
      return this.dL().a_($$0).g(this.dL(), $$0);
   }

   protected void t() {
      double $$0 = this.bO() ? 0.997 : 0.96;
      eif $$1 = this.do();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.aX()) {
         $$1 = $$1.a(0.95F);
      }

      this.f($$1);
   }

   @Nullable
   public eif a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = asy.a($$0);
      int $$5 = asy.a($$1);
      int $$6 = asy.a($$2);
      if (this.dL().a_(new ht($$4, $$5 - 1, $$6)).a(aqs.N)) {
         $$5--;
      }

      dgb $$7 = this.dL().a_(new ht($$4, $$5, $$6));
      if (ctp.g($$7)) {
         dhf $$8 = $$7.c(((ctp)$$7.b()).c());
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
         if ($$10.v() != 0 && asy.a($$0) - $$4 == $$10.u() && asy.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && asy.a($$0) - $$4 == $$11.u() && asy.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public eif q(double $$0, double $$1, double $$2) {
      int $$3 = asy.a($$0);
      int $$4 = asy.a($$1);
      int $$5 = asy.a($$2);
      if (this.dL().a_(new ht($$3, $$4 - 1, $$5)).a(aqs.N)) {
         $$4--;
      }

      dgb $$6 = this.dL().a_(new ht($$3, $$4, $$5));
      if (ctp.g($$6)) {
         dhf $$7 = $$6.c(((ctp)$$6.b()).c());
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

         return new eif($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public eia h_() {
      eia $$0 = this.cG();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(rt $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(sg.a(this.dL().a(jz.e), $$0.p("DisplayState")));
         this.c($$0.h("DisplayOffset"));
      }
   }

   @Override
   protected void b(rt $$0) {
      if (this.A()) {
         $$0.a("CustomDisplayTile", true);
         $$0.a("DisplayState", sg.a(this.w()));
         $$0.a("DisplayOffset", this.y());
      }
   }

   @Override
   public void g(bjt $$0) {
      if (!this.dL().B) {
         if (!$$0.af && !this.af) {
            if (!this.x($$0)) {
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
                  if ($$0 instanceof ceo) {
                     double $$5 = $$0.dq() - this.dq();
                     double $$6 = $$0.dw() - this.dw();
                     eif $$7 = new eif($$5, 0.0, $$6).d();
                     eif $$8 = new eif((double)asy.b(this.dB() * (float) (Math.PI / 180.0)), 0.0, (double)asy.a(this.dB() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     eif $$10 = this.do();
                     eif $$11 = $$0.do();
                     if (((ceo)$$0).v() == ceo.a.c && this.v() != ceo.a.c) {
                        this.f($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.f($$11.d(0.95, 1.0, 0.95));
                     } else if (((ceo)$$0).v() != ceo.a.c && this.v() == ceo.a.c) {
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
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.o = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = (double)$$3;
      this.s = (double)$$4;
      this.n = $$5 + 2;
      this.f(this.t);
   }

   @Override
   public double o_() {
      return this.n > 0 ? this.o : this.dq();
   }

   @Override
   public double L_() {
      return this.n > 0 ? this.p : this.ds();
   }

   @Override
   public double M_() {
      return this.n > 0 ? this.q : this.dw();
   }

   @Override
   public float e_() {
      return this.n > 0 ? (float)this.s : this.dD();
   }

   @Override
   public float p_() {
      return this.n > 0 ? (float)this.r : this.dB();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.t = new eif($$0, $$1, $$2);
      this.f(this.t);
   }

   public abstract ceo.a v();

   public dgb w() {
      return !this.A() ? this.x() : cua.a(this.al().b(e));
   }

   public dgb x() {
      return cuc.a.o();
   }

   public int y() {
      return !this.A() ? this.z() : this.al().b(i);
   }

   public int z() {
      return 6;
   }

   public void c(dgb $$0) {
      this.al().b(e, cua.i($$0));
      this.a(true);
   }

   public void c(int $$0) {
      this.al().b(i, $$0);
      this.a(true);
   }

   public boolean A() {
      return this.al().b(j);
   }

   public void a(boolean $$0) {
      this.al().b(j, $$0);
   }

   @Override
   public ckj dy() {
      return new ckj(switch (this.v()) {
         case b -> ckm.nb;
         case c -> ckm.nc;
         case d -> ckm.nd;
         default -> ckm.na;
         case f -> ckm.ne;
         case g -> ckm.tS;
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
