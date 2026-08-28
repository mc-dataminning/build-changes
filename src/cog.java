import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cog extends cou {
   private static final ewh c = new ewh(0.0, 0.0, 0.0);
   private static final ajp<Integer> d = ajt.a(cog.class, ajr.b);
   private static final ajp<Integer> e = ajt.a(cog.class, ajr.b);
   private static final ajp<Boolean> i = ajt.a(cog.class, ajr.k);
   private static final ImmutableMap<bto, ImmutableList<Integer>> j = ImmutableMap.of(
      bto.a, ImmutableList.of(0, 1, -1), bto.f, ImmutableList.of(0, 1, -1), bto.d, ImmutableList.of(0, 1)
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
   private ewh s = ewh.b;
   private static final Map<dtp, Pair<ke, ke>> t = ac.a(Maps.newEnumMap(dtp.class), $$0 -> {
      ke $$1 = jf.e.q();
      ke $$2 = jf.f.q();
      ke $$3 = jf.c.q();
      ke $$4 = jf.d.q();
      ke $$5 = $$1.o();
      ke $$6 = $$2.o();
      ke $$7 = $$3.o();
      ke $$8 = $$4.o();
      $$0.put(dtp.a, Pair.of($$3, $$4));
      $$0.put(dtp.b, Pair.of($$1, $$2));
      $$0.put(dtp.c, Pair.of($$5, $$2));
      $$0.put(dtp.d, Pair.of($$1, $$6));
      $$0.put(dtp.e, Pair.of($$3, $$8));
      $$0.put(dtp.f, Pair.of($$7, $$4));
      $$0.put(dtp.g, Pair.of($$4, $$2));
      $$0.put(dtp.h, Pair.of($$4, $$1));
      $$0.put(dtp.i, Pair.of($$3, $$1));
      $$0.put(dtp.j, Pair.of($$3, $$2));
   });

   protected cog(bsn<?> $$0, dcg $$1) {
      super($$0, $$1);
      this.J = true;
   }

   protected cog(bsn<?> $$0, dcg $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cog a(aqm $$0, double $$1, double $$2, double $$3, cog.a $$4, cud $$5, @Nullable cml $$6) {
      cog $$7 = (cog)(switch ($$4) {
         case b -> new coo($$0, $$1, $$2, $$3);
         case c -> new coq($$0, $$1, $$2, $$3);
         case d -> new cot($$0, $$1, $$2, $$3);
         case e -> new cos($$0, $$1, $$2, $$3);
         case f -> new cor($$0, $$1, $$2, $$3);
         case g -> new cop($$0, $$1, $$2, $$3);
         default -> new com($$0, $$1, $$2, $$3);
      });
      bsn.<cog>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.c;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, dfi.i(dfk.a.o()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(bsh $$0) {
      return coi.a(this, $$0);
   }

   @Override
   public boolean bC() {
      return true;
   }

   @Override
   protected ewh a(jf.a $$0, l.a $$1) {
      return btc.l(super.a($$0, $$1));
   }

   @Override
   protected ewh a(bsh $$0, bsk $$1, float $$2) {
      boolean $$3 = $$0 instanceof cly || $$0 instanceof cme;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public ewh b(btc $$0) {
      jf $$1 = this.cK();
      if ($$1.o() == jf.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = col.a($$1);
         ja $$3 = this.dr();
         ja.a $$4 = new ja.a();
         ImmutableList<bto> $$5 = $$0.fG();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            bto $$6 = (bto)$$14.next();
            bsk $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dR().a(col.a(this.dR(), $$4), () -> col.a(this.dR(), $$4.d()));
                  if (col.a($$11)) {
                     ewc $$12 = new ewc((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     ewh $$13 = ewh.a($$4, $$11);
                     if (col.a(this.dR(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cM().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            bto $$15 = (bto)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = ayg.c($$14x - (double)$$4.v() + $$16);
            double $$18 = col.a($$4, $$17, $$0x -> this.dR().a_($$0x).k(this.dR(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aP() {
      dsl $$0 = this.dR().a_(this.dr());
      return $$0.a(avw.N) ? 1.0F : super.aP();
   }

   @Override
   public void n(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bB() {
      return !this.dM();
   }

   private static Pair<ke, ke> a(dtp $$0) {
      return t.get($$0);
   }

   @Override
   public jf cK() {
      return this.k ? this.cJ().g().h() : this.cJ().h();
   }

   @Override
   protected double ba() {
      return this.bg() ? 0.005 : 0.04;
   }

   @Override
   public void l() {
      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      this.ax();
      this.bQ();
      if (this.dR().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.av();
            this.a(this.dH(), this.dJ());
         }
      } else {
         this.bc();
         int $$0 = ayg.a(this.dw());
         int $$1 = ayg.a(this.dy());
         int $$2 = ayg.a(this.dC());
         if (this.dR().a_(new ja($$0, $$1 - 1, $$2)).a(avw.N)) {
            $$1--;
         }

         ja $$3 = new ja($$0, $$1, $$2);
         dsl $$4 = this.dR().a_($$3);
         this.l = dex.g($$4);
         if (this.l) {
            this.c($$3, $$4);
            if ($$4.a(dfk.hh)) {
               this.a($$0, $$1, $$2, $$4.c(dle.f));
            }
         } else {
            this.s();
         }

         this.aU();
         this.t(0.0F);
         double $$5 = this.L - this.dw();
         double $$6 = this.N - this.dC();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.s((float)(ayg.d($$6, $$5) * 180.0 / Math.PI));
            if (this.k) {
               this.s(this.dH() + 180.0F);
            }
         }

         double $$7 = (double)ayg.g(this.dH() - this.O);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.s(this.dH() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dH(), this.dJ());
         if (this.v() == cog.a.a && this.du().i() > 0.01) {
            List<bsh> $$8 = this.dR().a(this, this.cM().c(0.2F, 0.0, 0.2F), bsm.a(this));
            if (!$$8.isEmpty()) {
               for (bsh $$9 : $$8) {
                  if (!($$9 instanceof cml) && !($$9 instanceof cfe) && !($$9 instanceof cog) && !this.bU() && !$$9.bT()) {
                     $$9.n(this);
                  } else {
                     $$9.h(this);
                  }
               }
            }
         } else {
            for (bsh $$10 : this.dR().a_(this, this.cM().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$10) && $$10.bC() && $$10 instanceof cog) {
                  $$10.h(this);
               }
            }
         }

         this.bn();
         if (this.bu()) {
            this.aC();
            this.ac *= 0.5F;
         }

         this.an = false;
      }
   }

   protected double p() {
      return (this.bg() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   protected void s() {
      double $$0 = this.p();
      ewh $$1 = this.du();
      this.o(ayg.a($$1.c, -$$0, $$0), $$1.d, ayg.a($$1.e, -$$0, $$0));
      if (this.aG()) {
         this.j(this.du().a(0.5));
      }

      this.a(bth.a, this.du());
      if (!this.aG()) {
         this.j(this.du().a(0.95));
      }
   }

   @Override
   protected void c(ja $$0, dsl $$1) {
      this.n();
      double $$2 = this.dw();
      double $$3 = this.dy();
      double $$4 = this.dC();
      ewh $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dfk.bp)) {
         $$6 = $$1.c(dle.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.bg()) {
         $$8 *= 0.2;
      }

      ewh $$9 = this.du();
      dtp $$10 = $$1.c(((dex)$$1.b()).c());
      switch ($$10) {
         case c:
            this.j($$9.b(-$$8, 0.0, 0.0));
            $$3++;
            break;
         case d:
            this.j($$9.b($$8, 0.0, 0.0));
            $$3++;
            break;
         case e:
            this.j($$9.b(0.0, 0.0, $$8));
            $$3++;
            break;
         case f:
            this.j($$9.b(0.0, 0.0, -$$8));
            $$3++;
      }

      $$9 = this.du();
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
      $$9 = new ewh($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.j($$9);
      bsh $$19 = this.cV();
      if ($$19 instanceof cml) {
         ewh $$20 = $$19.du();
         double $$21 = $$20.i();
         double $$22 = this.du().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.j(this.du().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.du().h();
         if ($$23 < 0.03) {
            this.j(ewh.b);
         } else {
            this.j(this.du().d(0.5, 0.0, 0.5));
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
      double $$33 = this.bU() ? 0.75 : 1.0;
      double $$34 = this.p();
      $$9 = this.du();
      this.a(bth.a, new ewh(ayg.a($$33 * $$9.c, -$$34, $$34), 0.0, ayg.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && ayg.a(this.dw()) - $$0.u() == $$12.u() && ayg.a(this.dC()) - $$0.w() == $$12.w()) {
         this.a_(this.dw(), this.dy() + (double)$$12.v(), this.dC());
      } else if ($$13.v() != 0 && ayg.a(this.dw()) - $$0.u() == $$13.u() && ayg.a(this.dC()) - $$0.w() == $$13.w()) {
         this.a_(this.dw(), this.dy() + (double)$$13.v(), this.dC());
      }

      this.t();
      ewh $$35 = this.q(this.dw(), this.dy(), this.dC());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         ewh $$37 = this.du();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.j($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.dw(), $$35.d, this.dC());
      }

      int $$39 = ayg.a(this.dw());
      int $$40 = ayg.a(this.dC());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         ewh $$41 = this.du();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         ewh $$43 = this.du();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.j($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            ewh $$46 = this.du();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dtp.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dtp.a) {
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
   public boolean ck() {
      return this.l;
   }

   private boolean a(ja $$0) {
      return this.dR().a_($$0).g(this.dR(), $$0);
   }

   protected void t() {
      double $$0 = this.bU() ? 0.997 : 0.96;
      ewh $$1 = this.du();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.bg()) {
         $$1 = $$1.a(0.95F);
      }

      this.j($$1);
   }

   @Nullable
   public ewh a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = ayg.a($$0);
      int $$5 = ayg.a($$1);
      int $$6 = ayg.a($$2);
      if (this.dR().a_(new ja($$4, $$5 - 1, $$6)).a(avw.N)) {
         $$5--;
      }

      dsl $$7 = this.dR().a_(new ja($$4, $$5, $$6));
      if (dex.g($$7)) {
         dtp $$8 = $$7.c(((dex)$$7.b()).c());
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
         if ($$10.v() != 0 && ayg.a($$0) - $$4 == $$10.u() && ayg.a($$2) - $$6 == $$10.w()) {
            $$1 += (double)$$10.v();
         } else if ($$11.v() != 0 && ayg.a($$0) - $$4 == $$11.u() && ayg.a($$2) - $$6 == $$11.w()) {
            $$1 += (double)$$11.v();
         }

         return this.q($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Nullable
   public ewh q(double $$0, double $$1, double $$2) {
      int $$3 = ayg.a($$0);
      int $$4 = ayg.a($$1);
      int $$5 = ayg.a($$2);
      if (this.dR().a_(new ja($$3, $$4 - 1, $$5)).a(avw.N)) {
         $$4--;
      }

      dsl $$6 = this.dR().a_(new ja($$3, $$4, $$5));
      if (dex.g($$6)) {
         dtp $$7 = $$6.c(((dex)$$6.b()).c());
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

         return new ewh($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public ewc h_() {
      ewc $$0 = this.cM();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(tx $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(um.a(this.dR().a(lr.f), $$0.p("DisplayState")));
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
   public void h(bsh $$0) {
      if (!this.dR().B) {
         if (!$$0.ag && !this.ag) {
            if (!this.x($$0)) {
               double $$1 = $$0.dw() - this.dw();
               double $$2 = $$0.dC() - this.dC();
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
                  if ($$0 instanceof cog) {
                     double $$5 = $$0.dw() - this.dw();
                     double $$6 = $$0.dC() - this.dC();
                     ewh $$7 = new ewh($$5, 0.0, $$6).d();
                     ewh $$8 = new ewh((double)ayg.b(this.dH() * (float) (Math.PI / 180.0)), 0.0, (double)ayg.a(this.dH() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     ewh $$10 = this.du();
                     ewh $$11 = $$0.du();
                     if (((cog)$$0).v() == cog.a.c && this.v() != cog.a.c) {
                        this.j($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.j($$11.d(0.95, 1.0, 0.95));
                     } else if (((cog)$$0).v() != cog.a.c && this.v() == cog.a.c) {
                        $$0.j($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$10.c + $$1, 0.0, $$10.e + $$2);
                        this.j($$10.d(0.95, 1.0, 0.95));
                     } else {
                        double $$12 = ($$11.c + $$10.c) / 2.0;
                        double $$13 = ($$11.e + $$10.e) / 2.0;
                        this.j($$10.d(0.2, 1.0, 0.2));
                        this.j($$12 - $$1, 0.0, $$13 - $$2);
                        $$0.j($$11.d(0.2, 1.0, 0.2));
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
      this.j(this.s);
   }

   @Override
   public double c_() {
      return this.m > 0 ? this.n : this.dw();
   }

   @Override
   public double d_() {
      return this.m > 0 ? this.o : this.dy();
   }

   @Override
   public double L_() {
      return this.m > 0 ? this.p : this.dC();
   }

   @Override
   public float M_() {
      return this.m > 0 ? (float)this.r : this.dJ();
   }

   @Override
   public float e_() {
      return this.m > 0 ? (float)this.q : this.dH();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new ewh($$0, $$1, $$2);
      this.j(this.s);
   }

   public abstract cog.a v();

   public dsl w() {
      return !this.A() ? this.x() : dfi.a(this.ar().a(d));
   }

   public dsl x() {
      return dfk.a.o();
   }

   public int y() {
      return !this.A() ? this.z() : this.ar().a(e);
   }

   public int z() {
      return 6;
   }

   public void c(dsl $$0) {
      this.ar().a(d, dfi.i($$0));
      this.a(true);
   }

   public void c(int $$0) {
      this.ar().a(e, $$0);
      this.a(true);
   }

   public boolean A() {
      return this.ar().a(i);
   }

   public void a(boolean $$0) {
      this.ar().a(i, $$0);
   }

   @Override
   public cud dE() {
      return new cud(switch (this.v()) {
         case b -> cug.nN;
         case c -> cug.nO;
         case d -> cug.nP;
         default -> cug.nM;
         case f -> cug.nQ;
         case g -> cug.uM;
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
