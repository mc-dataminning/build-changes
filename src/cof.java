import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public abstract class cof extends cot {
   private static final ewf c = new ewf(0.0, 0.0, 0.0);
   private static final ajp<Integer> d = ajt.a(cof.class, ajr.b);
   private static final ajp<Integer> e = ajt.a(cof.class, ajr.b);
   private static final ajp<Boolean> i = ajt.a(cof.class, ajr.k);
   private static final ImmutableMap<btn, ImmutableList<Integer>> j = ImmutableMap.of(
      btn.a, ImmutableList.of(0, 1, -1), btn.f, ImmutableList.of(0, 1, -1), btn.d, ImmutableList.of(0, 1)
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
   private ewf s = ewf.b;
   private static final Map<dto, Pair<ke, ke>> t = ac.a(Maps.newEnumMap(dto.class), $$0 -> {
      ke $$1 = jf.e.q();
      ke $$2 = jf.f.q();
      ke $$3 = jf.c.q();
      ke $$4 = jf.d.q();
      ke $$5 = $$1.o();
      ke $$6 = $$2.o();
      ke $$7 = $$3.o();
      ke $$8 = $$4.o();
      $$0.put(dto.a, Pair.of($$3, $$4));
      $$0.put(dto.b, Pair.of($$1, $$2));
      $$0.put(dto.c, Pair.of($$5, $$2));
      $$0.put(dto.d, Pair.of($$1, $$6));
      $$0.put(dto.e, Pair.of($$3, $$8));
      $$0.put(dto.f, Pair.of($$7, $$4));
      $$0.put(dto.g, Pair.of($$4, $$2));
      $$0.put(dto.h, Pair.of($$4, $$1));
      $$0.put(dto.i, Pair.of($$3, $$1));
      $$0.put(dto.j, Pair.of($$3, $$2));
   });

   protected cof(bsm<?> $$0, dcf $$1) {
      super($$0, $$1);
      this.J = true;
   }

   protected cof(bsm<?> $$0, dcf $$1, double $$2, double $$3, double $$4) {
      this($$0, $$1);
      this.a_($$2, $$3, $$4);
      this.L = $$2;
      this.M = $$3;
      this.N = $$4;
   }

   public static cof a(aqm $$0, double $$1, double $$2, double $$3, cof.a $$4, cuc $$5, @Nullable cmk $$6) {
      cof $$7 = (cof)(switch ($$4) {
         case b -> new com($$0, $$1, $$2, $$3);
         case c -> new cop($$0, $$1, $$2, $$3);
         case d -> new cos($$0, $$1, $$2, $$3);
         case e -> new cor($$0, $$1, $$2, $$3);
         case f -> new coq($$0, $$1, $$2, $$3);
         case g -> new coo($$0, $$1, $$2, $$3);
         default -> new col($$0, $$1, $$2, $$3);
      });
      bsm.<cof>a($$0, $$5, $$6).accept($$7);
      return $$7;
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.c;
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(d, dfh.i(dfj.a.o()));
      $$0.a(e, 6);
      $$0.a(i, false);
   }

   @Override
   public boolean i(bsg $$0) {
      return coh.a(this, $$0);
   }

   @Override
   public boolean bB() {
      return true;
   }

   @Override
   protected ewf a(jf.a $$0, l.a $$1) {
      return btb.k(super.a($$0, $$1));
   }

   @Override
   protected ewf a(bsg $$0, bsj $$1, float $$2) {
      boolean $$3 = $$0 instanceof clx || $$0 instanceof cmd;
      return $$3 ? c : super.a($$0, $$1, $$2);
   }

   @Override
   public ewf b(btb $$0) {
      jf $$1 = this.cJ();
      if ($$1.o() == jf.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cok.a($$1);
         ja $$3 = this.dq();
         ja.a $$4 = new ja.a();
         ImmutableList<btn> $$5 = $$0.fF();
         UnmodifiableIterator $$14 = $$5.iterator();

         while ($$14.hasNext()) {
            btn $$6 = (btn)$$14.next();
            bsj $$7 = $$0.a($$6);
            float $$8 = Math.min($$7.a(), 1.0F) / 2.0F;
            UnmodifiableIterator $$16 = ((ImmutableList)j.get($$6)).iterator();

            while ($$16.hasNext()) {
               int $$9 = (Integer)$$16.next();

               for (int[] $$10 : $$2) {
                  $$4.d($$3.u() + $$10[0], $$3.v() + $$9, $$3.w() + $$10[1]);
                  double $$11 = this.dQ().a(cok.a(this.dQ(), $$4), () -> cok.a(this.dQ(), $$4.d()));
                  if (cok.a($$11)) {
                     ewa $$12 = new ewa((double)(-$$8), 0.0, (double)(-$$8), (double)$$8, (double)$$7.b(), (double)$$8);
                     ewf $$13 = ewf.a($$4, $$11);
                     if (cok.a(this.dQ(), $$0, $$12.c($$13))) {
                        $$0.b($$6);
                        return $$13;
                     }
                  }
               }
            }
         }

         double $$14x = this.cL().e;
         $$4.b((double)$$3.u(), $$14x, (double)$$3.w());
         UnmodifiableIterator var22 = $$5.iterator();

         while (var22.hasNext()) {
            btn $$15 = (btn)var22.next();
            double $$16 = (double)$$0.a($$15).b();
            int $$17 = ayg.c($$14x - (double)$$4.v() + $$16);
            double $$18 = cok.a($$4, $$17, $$0x -> this.dQ().a_($$0x).k(this.dQ(), $$0x));
            if ($$14x + $$16 <= $$18) {
               $$0.b($$15);
               break;
            }
         }

         return super.b($$0);
      }
   }

   @Override
   protected float aO() {
      dsk $$0 = this.dQ().a_(this.dq());
      return $$0.a(avw.N) ? 1.0F : super.aO();
   }

   @Override
   public void n(float $$0) {
      this.m(-this.P());
      this.d(10);
      this.b(this.N() + this.N() * 10.0F);
   }

   @Override
   public boolean bA() {
      return !this.dL();
   }

   private static Pair<ke, ke> a(dto $$0) {
      return t.get($$0);
   }

   @Override
   public jf cJ() {
      return this.k ? this.cI().g().h() : this.cI().h();
   }

   @Override
   protected double aZ() {
      return this.bf() ? 0.005 : 0.04;
   }

   @Override
   public void l() {
      if (this.O() > 0) {
         this.d(this.O() - 1);
      }

      if (this.N() > 0.0F) {
         this.b(this.N() - 1.0F);
      }

      this.aw();
      this.bP();
      if (this.dQ().B) {
         if (this.m > 0) {
            this.a(this.m, this.n, this.o, this.p, this.q, this.r);
            this.m--;
         } else {
            this.au();
            this.a(this.dG(), this.dI());
         }
      } else {
         this.bb();
         int $$0 = ayg.a(this.dv());
         int $$1 = ayg.a(this.dx());
         int $$2 = ayg.a(this.dB());
         if (this.dQ().a_(new ja($$0, $$1 - 1, $$2)).a(avw.N)) {
            $$1--;
         }

         ja $$3 = new ja($$0, $$1, $$2);
         dsk $$4 = this.dQ().a_($$3);
         this.l = dew.g($$4);
         if (this.l) {
            this.c($$3, $$4);
            if ($$4.a(dfj.hh)) {
               this.a($$0, $$1, $$2, $$4.c(dld.f));
            }
         } else {
            this.s();
         }

         this.aT();
         this.t(0.0F);
         double $$5 = this.L - this.dv();
         double $$6 = this.N - this.dB();
         if ($$5 * $$5 + $$6 * $$6 > 0.001) {
            this.s((float)(ayg.d($$6, $$5) * 180.0 / Math.PI));
            if (this.k) {
               this.s(this.dG() + 180.0F);
            }
         }

         double $$7 = (double)ayg.g(this.dG() - this.O);
         if ($$7 < -170.0 || $$7 >= 170.0) {
            this.s(this.dG() + 180.0F);
            this.k = !this.k;
         }

         this.a(this.dG(), this.dI());
         if (this.v() == cof.a.a && this.dt().i() > 0.01) {
            List<bsg> $$8 = this.dQ().a(this, this.cL().c(0.2F, 0.0, 0.2F), bsl.a(this));
            if (!$$8.isEmpty()) {
               for (bsg $$9 : $$8) {
                  if (!($$9 instanceof cmk) && !($$9 instanceof cfd) && !($$9 instanceof cof) && !this.bT() && !$$9.bS()) {
                     $$9.n(this);
                  } else {
                     $$9.h(this);
                  }
               }
            }
         } else {
            for (bsg $$10 : this.dQ().a_(this, this.cL().c(0.2F, 0.0, 0.2F))) {
               if (!this.x($$10) && $$10.bB() && $$10 instanceof cof) {
                  $$10.h(this);
               }
            }
         }

         this.bm();
         if (this.bt()) {
            this.aB();
            this.ac *= 0.5F;
         }

         this.an = false;
      }
   }

   protected double p() {
      return (this.bf() ? 4.0 : 8.0) / 20.0;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
   }

   protected void s() {
      double $$0 = this.p();
      ewf $$1 = this.dt();
      this.o(ayg.a($$1.c, -$$0, $$0), $$1.d, ayg.a($$1.e, -$$0, $$0));
      if (this.aF()) {
         this.i(this.dt().a(0.5));
      }

      this.a(btg.a, this.dt());
      if (!this.aF()) {
         this.i(this.dt().a(0.95));
      }
   }

   @Override
   protected void c(ja $$0, dsk $$1) {
      this.n();
      double $$2 = this.dv();
      double $$3 = this.dx();
      double $$4 = this.dB();
      ewf $$5 = this.q($$2, $$3, $$4);
      $$3 = (double)$$0.v();
      boolean $$6 = false;
      boolean $$7 = false;
      if ($$1.a(dfj.bp)) {
         $$6 = $$1.c(dld.f);
         $$7 = !$$6;
      }

      double $$8 = 0.0078125;
      if (this.bf()) {
         $$8 *= 0.2;
      }

      ewf $$9 = this.dt();
      dto $$10 = $$1.c(((dew)$$1.b()).c());
      switch ($$10) {
         case c:
            this.i($$9.b(-$$8, 0.0, 0.0));
            $$3++;
            break;
         case d:
            this.i($$9.b($$8, 0.0, 0.0));
            $$3++;
            break;
         case e:
            this.i($$9.b(0.0, 0.0, $$8));
            $$3++;
            break;
         case f:
            this.i($$9.b(0.0, 0.0, -$$8));
            $$3++;
      }

      $$9 = this.dt();
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
      $$9 = new ewf($$18 * $$14 / $$16, $$9.d, $$18 * $$15 / $$16);
      this.i($$9);
      bsg $$19 = this.cU();
      if ($$19 instanceof cmk) {
         ewf $$20 = $$19.dt();
         double $$21 = $$20.i();
         double $$22 = this.dt().i();
         if ($$21 > 1.0E-4 && $$22 < 0.01) {
            this.i(this.dt().b($$20.c * 0.1, 0.0, $$20.e * 0.1));
            $$7 = false;
         }
      }

      if ($$7) {
         double $$23 = this.dt().h();
         if ($$23 < 0.03) {
            this.i(ewf.b);
         } else {
            this.i(this.dt().d(0.5, 0.0, 0.5));
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
      double $$33 = this.bT() ? 0.75 : 1.0;
      double $$34 = this.p();
      $$9 = this.dt();
      this.a(btg.a, new ewf(ayg.a($$33 * $$9.c, -$$34, $$34), 0.0, ayg.a($$33 * $$9.e, -$$34, $$34)));
      if ($$12.v() != 0 && ayg.a(this.dv()) - $$0.u() == $$12.u() && ayg.a(this.dB()) - $$0.w() == $$12.w()) {
         this.a_(this.dv(), this.dx() + (double)$$12.v(), this.dB());
      } else if ($$13.v() != 0 && ayg.a(this.dv()) - $$0.u() == $$13.u() && ayg.a(this.dB()) - $$0.w() == $$13.w()) {
         this.a_(this.dv(), this.dx() + (double)$$13.v(), this.dB());
      }

      this.u();
      ewf $$35 = this.q(this.dv(), this.dx(), this.dB());
      if ($$35 != null && $$5 != null) {
         double $$36 = ($$5.d - $$35.d) * 0.05;
         ewf $$37 = this.dt();
         double $$38 = $$37.h();
         if ($$38 > 0.0) {
            this.i($$37.d(($$38 + $$36) / $$38, 1.0, ($$38 + $$36) / $$38));
         }

         this.a_(this.dv(), $$35.d, this.dB());
      }

      int $$39 = ayg.a(this.dv());
      int $$40 = ayg.a(this.dB());
      if ($$39 != $$0.u() || $$40 != $$0.w()) {
         ewf $$41 = this.dt();
         double $$42 = $$41.h();
         this.o($$42 * (double)($$39 - $$0.u()), $$41.d, $$42 * (double)($$40 - $$0.w()));
      }

      if ($$6) {
         ewf $$43 = this.dt();
         double $$44 = $$43.h();
         if ($$44 > 0.01) {
            double $$45 = 0.06;
            this.i($$43.b($$43.c / $$44 * 0.06, 0.0, $$43.e / $$44 * 0.06));
         } else {
            ewf $$46 = this.dt();
            double $$47 = $$46.c;
            double $$48 = $$46.e;
            if ($$10 == dto.b) {
               if (this.a($$0.g())) {
                  $$47 = 0.02;
               } else if (this.a($$0.h())) {
                  $$47 = -0.02;
               }
            } else {
               if ($$10 != dto.a) {
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
   public boolean cj() {
      return this.l;
   }

   private boolean a(ja $$0) {
      return this.dQ().a_($$0).g(this.dQ(), $$0);
   }

   protected void u() {
      double $$0 = this.bT() ? 0.997 : 0.96;
      ewf $$1 = this.dt();
      $$1 = $$1.d($$0, 0.0, $$0);
      if (this.bf()) {
         $$1 = $$1.a(0.95F);
      }

      this.i($$1);
   }

   @Nullable
   public ewf a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = ayg.a($$0);
      int $$5 = ayg.a($$1);
      int $$6 = ayg.a($$2);
      if (this.dQ().a_(new ja($$4, $$5 - 1, $$6)).a(avw.N)) {
         $$5--;
      }

      dsk $$7 = this.dQ().a_(new ja($$4, $$5, $$6));
      if (dew.g($$7)) {
         dto $$8 = $$7.c(((dew)$$7.b()).c());
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
   public ewf q(double $$0, double $$1, double $$2) {
      int $$3 = ayg.a($$0);
      int $$4 = ayg.a($$1);
      int $$5 = ayg.a($$2);
      if (this.dQ().a_(new ja($$3, $$4 - 1, $$5)).a(avw.N)) {
         $$4--;
      }

      dsk $$6 = this.dQ().a_(new ja($$3, $$4, $$5));
      if (dew.g($$6)) {
         dto $$7 = $$6.c(((dew)$$6.b()).c());
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

         return new ewf($$0, $$1, $$2);
      } else {
         return null;
      }
   }

   @Override
   public ewa h_() {
      ewa $$0 = this.cL();
      return this.A() ? $$0.g((double)Math.abs(this.y()) / 16.0) : $$0;
   }

   @Override
   protected void a(tx $$0) {
      if ($$0.q("CustomDisplayTile")) {
         this.c(um.a(this.dQ().a(lr.f), $$0.p("DisplayState")));
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
   public void h(bsg $$0) {
      if (!this.dQ().B) {
         if (!$$0.ag && !this.ag) {
            if (!this.x($$0)) {
               double $$1 = $$0.dv() - this.dv();
               double $$2 = $$0.dB() - this.dB();
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
                  if ($$0 instanceof cof) {
                     double $$5 = $$0.dv() - this.dv();
                     double $$6 = $$0.dB() - this.dB();
                     ewf $$7 = new ewf($$5, 0.0, $$6).d();
                     ewf $$8 = new ewf((double)ayg.b(this.dG() * (float) (Math.PI / 180.0)), 0.0, (double)ayg.a(this.dG() * (float) (Math.PI / 180.0))).d();
                     double $$9 = Math.abs($$7.b($$8));
                     if ($$9 < 0.8F) {
                        return;
                     }

                     ewf $$10 = this.dt();
                     ewf $$11 = $$0.dt();
                     if (((cof)$$0).v() == cof.a.c && this.v() != cof.a.c) {
                        this.i($$10.d(0.2, 1.0, 0.2));
                        this.j($$11.c - $$1, 0.0, $$11.e - $$2);
                        $$0.i($$11.d(0.95, 1.0, 0.95));
                     } else if (((cof)$$0).v() != cof.a.c && this.v() == cof.a.c) {
                        $$0.i($$11.d(0.2, 1.0, 0.2));
                        $$0.j($$10.c + $$1, 0.0, $$10.e + $$2);
                        this.i($$10.d(0.95, 1.0, 0.95));
                     } else {
                        double $$12 = ($$11.c + $$10.c) / 2.0;
                        double $$13 = ($$11.e + $$10.e) / 2.0;
                        this.i($$10.d(0.2, 1.0, 0.2));
                        this.j($$12 - $$1, 0.0, $$13 - $$2);
                        $$0.i($$11.d(0.2, 1.0, 0.2));
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
      this.i(this.s);
   }

   @Override
   public double c_() {
      return this.m > 0 ? this.n : this.dv();
   }

   @Override
   public double d_() {
      return this.m > 0 ? this.o : this.dx();
   }

   @Override
   public double L_() {
      return this.m > 0 ? this.p : this.dB();
   }

   @Override
   public float M_() {
      return this.m > 0 ? (float)this.r : this.dI();
   }

   @Override
   public float e_() {
      return this.m > 0 ? (float)this.q : this.dG();
   }

   @Override
   public void l(double $$0, double $$1, double $$2) {
      this.s = new ewf($$0, $$1, $$2);
      this.i(this.s);
   }

   public abstract cof.a v();

   public dsk w() {
      return !this.A() ? this.x() : dfh.a(this.aq().a(d));
   }

   public dsk x() {
      return dfj.a.o();
   }

   public int y() {
      return !this.A() ? this.z() : this.aq().a(e);
   }

   public int z() {
      return 6;
   }

   public void c(dsk $$0) {
      this.aq().a(d, dfh.i($$0));
      this.a(true);
   }

   public void c(int $$0) {
      this.aq().a(e, $$0);
      this.a(true);
   }

   public boolean A() {
      return this.aq().a(i);
   }

   public void a(boolean $$0) {
      this.aq().a(i, $$0);
   }

   @Override
   public cuc dD() {
      return new cuc(switch (this.v()) {
         case b -> cuf.nN;
         case c -> cuf.nO;
         case d -> cuf.nP;
         default -> cuf.nM;
         case f -> cuf.nQ;
         case g -> cuf.uM;
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
