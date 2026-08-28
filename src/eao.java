import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class eao {
   private static final dua a = dgx.hj.o();
   private static final dua b = dgx.hk.o();
   private static final dua c = dgx.iA.o();
   private static final dua d = dgx.hn.o();
   private static final dua e = dgx.hv.o();
   private static final dua f = dgx.hx.o();
   private static final dua g = dgx.hr.o();
   private static final dua h = dgx.iC.o();
   private static final dua i = dgx.dP.o();
   private final dua j;
   private final int k;
   private final dua[] l;
   private final epe m;
   private final epe n;
   private final epe o;
   private final epe p;
   private final epe q;
   private final epe r;
   private final epe s;
   private final eaj t;
   private final epe u;
   private final epe v;

   public eao(eak $$0, dua $$1, int $$2, eaj $$3) {
      this.j = $$1;
      this.k = $$2;
      this.t = $$3;
      this.m = $$0.a(eaf.P);
      this.l = a($$3.a(alb.b("clay_bands")));
      this.u = $$0.a(eaf.N);
      this.v = $$0.a(eaf.O);
      this.n = $$0.a(eaf.Q);
      this.o = $$0.a(eaf.R);
      this.p = $$0.a(eaf.S);
      this.q = $$0.a(eaf.T);
      this.r = $$0.a(eaf.U);
      this.s = $$0.a(eaf.V);
   }

   public void a(eak $$0, dev $$1, ka<det> $$2, boolean $$3, eat $$4, final dvw $$5, eaa $$6, ean.o $$7) {
      final je.a $$8 = new je.a();
      final dcy $$9 = $$5.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dvt $$12 = new dvt() {
         @Override
         public dua a(int $$0) {
            return $$5.a_($$8.q($$0));
         }

         @Override
         public void a(int $$0, dua $$1) {
            ddu $$2 = $$5.y();
            if ($$0 >= $$2.G_() && $$0 < $$2.an()) {
               $$5.a($$8.q($$0), $$1, false);
               if (!$$1.y().c()) {
                  $$5.e($$8);
               }
            }
         }

         @Override
         public String toString() {
            return "ChunkBlockColumn " + $$9;
         }
      };
      ean.g $$13 = new ean.g(this, $$0, $$5, $$6, $$1::a, $$2, $$4);
      ean.u $$14 = $$7.apply($$13);
      je.a $$15 = new je.a();

      for (int $$16 = 0; $$16 < 16; $$16++) {
         for (int $$17 = 0; $$17 < 16; $$17++) {
            int $$18 = $$10 + $$16;
            int $$19 = $$11 + $$17;
            int $$20 = $$5.a(dzw.a.a, $$16, $$17) + 1;
            $$8.p($$18).r($$19);
            jn<det> $$21 = $$1.a($$15.d($$18, $$3 ? 0 : $$20, $$19));
            if ($$21.a(dfa.B)) {
               this.a($$12, $$18, $$19, $$20, $$5);
            }

            int $$22 = $$5.a(dzw.a.a, $$16, $$17) + 1;
            $$13.a($$18, $$19);
            int $$23 = 0;
            int $$24 = Integer.MIN_VALUE;
            int $$25 = Integer.MAX_VALUE;
            int $$26 = $$5.G_();

            for (int $$27 = $$22; $$27 >= $$26; $$27--) {
               dua $$28 = $$12.a($$27);
               if ($$28.l()) {
                  $$23 = 0;
                  $$24 = Integer.MIN_VALUE;
               } else if (!$$28.y().c()) {
                  if ($$24 == Integer.MIN_VALUE) {
                     $$24 = $$27 + 1;
                  }
               } else {
                  if ($$25 >= $$27) {
                     $$25 = dxw.g;

                     for (int $$29 = $$27 - 1; $$29 >= $$26 - 1; $$29--) {
                        dua $$30 = $$12.a($$29);
                        if (!this.a($$30)) {
                           $$25 = $$29 + 1;
                           break;
                        }
                     }
                  }

                  $$23++;
                  int $$31 = $$27 - $$25 + 1;
                  $$13.a($$23, $$31, $$24, $$18, $$27, $$19);
                  if ($$28 == this.j) {
                     dua $$32 = $$14.tryApply($$18, $$27, $$19);
                     if ($$32 != null) {
                        $$12.a($$27, $$32);
                     }
                  }
               }
            }

            if ($$21.a(dfa.W) || $$21.a(dfa.X)) {
               this.a($$13.c(), $$21.a(), $$12, $$15, $$18, $$19, $$20);
            }
         }
      }
   }

   protected int a(int $$0, int $$1) {
      double $$2 = this.u.a((double)$$0, 0.0, (double)$$1);
      return (int)($$2 * 2.75 + 3.0 + this.t.a($$0, 0, $$1).j() * 0.25);
   }

   protected double b(int $$0, int $$1) {
      return this.v.a((double)$$0, 0.0, (double)$$1);
   }

   private boolean a(dua $$0) {
      return !$$0.l() && $$0.y().c();
   }

   public int a() {
      return this.k;
   }

   @Deprecated
   public Optional<dua> a(ean.o $$0, ebx $$1, Function<je, jn<det>> $$2, dvw $$3, eaa $$4, je $$5, boolean $$6) {
      ean.g $$7 = new ean.g(this, $$1.d(), $$3, $$4, $$2, $$1.c().d(lv.aF), $$1);
      ean.u $$8 = $$0.apply($$7);
      int $$9 = $$5.u();
      int $$10 = $$5.v();
      int $$11 = $$5.w();
      $$7.a($$9, $$11);
      $$7.a(1, 1, $$6 ? $$10 + 1 : Integer.MIN_VALUE, $$9, $$10, $$11);
      dua $$12 = $$8.tryApply($$9, $$10, $$11);
      return Optional.ofNullable($$12);
   }

   private void a(dvt $$0, int $$1, int $$2, int $$3, ddu $$4) {
      double $$5 = 0.2;
      double $$6 = Math.min(Math.abs(this.p.a((double)$$1, 0.0, (double)$$2) * 8.25), this.n.a((double)$$1 * 0.2, 0.0, (double)$$2 * 0.2) * 15.0);
      if (!($$6 <= 0.0)) {
         double $$7 = 0.75;
         double $$8 = 1.5;
         double $$9 = Math.abs(this.o.a((double)$$1 * 0.75, 0.0, (double)$$2 * 0.75) * 1.5);
         double $$10 = 64.0 + Math.min($$6 * $$6 * 2.5, Math.ceil($$9 * 50.0) + 24.0);
         int $$11 = azc.a($$10);
         if ($$3 <= $$11) {
            for (int $$12 = $$11; $$12 >= $$4.G_(); $$12--) {
               dua $$13 = $$0.a($$12);
               if ($$13.a(this.j.b())) {
                  break;
               }

               if ($$13.a(dgx.G)) {
                  return;
               }
            }

            for (int $$14 = $$11; $$14 >= $$4.G_() && $$0.a($$14).l(); $$14--) {
               $$0.a($$14, this.j);
            }
         }
      }
   }

   private void a(int $$0, det $$1, dvt $$2, je.a $$3, int $$4, int $$5, int $$6) {
      double $$7 = 1.28;
      double $$8 = Math.min(Math.abs(this.s.a((double)$$4, 0.0, (double)$$5) * 8.25), this.q.a((double)$$4 * 1.28, 0.0, (double)$$5 * 1.28) * 15.0);
      if (!($$8 <= 1.8)) {
         double $$9 = 1.17;
         double $$10 = 1.5;
         double $$11 = Math.abs(this.r.a((double)$$4 * 1.17, 0.0, (double)$$5 * 1.17) * 1.5);
         double $$12 = Math.min($$8 * $$8 * 1.2, Math.ceil($$11 * 40.0) + 14.0);
         if ($$1.d($$3.d($$4, this.k, $$5), this.k)) {
            $$12 -= 2.0;
         }

         double $$13;
         if ($$12 > 2.0) {
            $$13 = (double)this.k - $$12 - 7.0;
            $$12 += (double)this.k;
         } else {
            $$12 = 0.0;
            $$13 = 0.0;
         }

         double $$15 = $$12;
         azk $$16 = this.t.a($$4, 0, $$5);
         int $$17 = 2 + $$16.a(4);
         int $$18 = this.k + 18 + $$16.a(10);
         int $$19 = 0;

         for (int $$20 = Math.max($$6, (int)$$12 + 1); $$20 >= $$0; $$20--) {
            if ($$2.a($$20).l() && $$20 < (int)$$15 && $$16.j() > 0.01
               || $$2.a($$20).a(dgx.G) && $$20 > (int)$$13 && $$20 < this.k && $$13 != 0.0 && $$16.j() > 0.15) {
               if ($$19 <= $$17 && $$20 > $$18) {
                  $$2.a($$20, i);
                  $$19++;
               } else {
                  $$2.a($$20, h);
               }
            }
         }
      }
   }

   private static dua[] a(azk $$0) {
      dua[] $$1 = new dua[192];
      Arrays.fill($$1, c);

      for (int $$2 = 0; $$2 < $$1.length; $$2++) {
         $$2 += $$0.a(5) + 1;
         if ($$2 < $$1.length) {
            $$1[$$2] = b;
         }
      }

      a($$0, $$1, 1, d);
      a($$0, $$1, 2, e);
      a($$0, $$1, 1, f);
      int $$3 = $$0.a(9, 15);
      int $$4 = 0;

      for (int $$5 = 0; $$4 < $$3 && $$5 < $$1.length; $$5 += $$0.a(16) + 4) {
         $$1[$$5] = a;
         if ($$5 - 1 > 0 && $$0.h()) {
            $$1[$$5 - 1] = g;
         }

         if ($$5 + 1 < $$1.length && $$0.h()) {
            $$1[$$5 + 1] = g;
         }

         $$4++;
      }

      return $$1;
   }

   private static void a(azk $$0, dua[] $$1, int $$2, dua $$3) {
      int $$4 = $$0.a(6, 15);

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         int $$6 = $$2 + $$0.a(3);
         int $$7 = $$0.a($$1.length);

         for (int $$8 = 0; $$7 + $$8 < $$1.length && $$8 < $$6; $$8++) {
            $$1[$$7 + $$8] = $$3;
         }
      }
   }

   protected dua a(int $$0, int $$1, int $$2) {
      int $$3 = (int)Math.round(this.m.a((double)$$0, 0.0, (double)$$2) * 4.0);
      return this.l[($$1 + $$3 + this.l.length) % this.l.length];
   }
}
