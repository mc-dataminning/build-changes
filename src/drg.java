import java.util.Arrays;
import java.util.Optional;
import java.util.function.Function;

public class drg {
   private static final dlf a = cyq.hj.o();
   private static final dlf b = cyq.hk.o();
   private static final dlf c = cyq.iA.o();
   private static final dlf d = cyq.hn.o();
   private static final dlf e = cyq.hv.o();
   private static final dlf f = cyq.hx.o();
   private static final dlf g = cyq.hr.o();
   private static final dlf h = cyq.iC.o();
   private static final dlf i = cyq.dP.o();
   private final dlf j;
   private final int k;
   private final dlf[] l;
   private final efs m;
   private final efs n;
   private final efs o;
   private final efs p;
   private final efs q;
   private final efs r;
   private final efs s;
   private final drb t;
   private final efs u;
   private final efs v;

   public drg(drc $$0, dlf $$1, int $$2, drb $$3) {
      this.j = $$1;
      this.k = $$2;
      this.t = $$3;
      this.m = $$0.a(dqx.P);
      this.l = a($$3.a(new aiy("clay_bands")));
      this.u = $$0.a(dqx.N);
      this.v = $$0.a(dqx.O);
      this.n = $$0.a(dqx.Q);
      this.o = $$0.a(dqx.R);
      this.p = $$0.a(dqx.S);
      this.q = $$0.a(dqx.T);
      this.r = $$0.a(dqx.U);
      this.s = $$0.a(dqx.V);
   }

   public void a(drc $$0, cwo $$1, iv<cwm> $$2, boolean $$3, drl $$4, final dnb $$5, dqs $$6, drf.o $$7) {
      final hz.a $$8 = new hz.a();
      final cuu $$9 = $$5.f();
      int $$10 = $$9.d();
      int $$11 = $$9.e();
      dmy $$12 = new dmy() {
         @Override
         public dlf a(int $$0) {
            return $$5.a_($$8.q($$0));
         }

         @Override
         public void a(int $$0, dlf $$1) {
            cvp $$2 = $$5.z();
            if ($$0 >= $$2.J_() && $$0 < $$2.al()) {
               $$5.a($$8.q($$0), $$1, false);
               if (!$$1.u().c()) {
                  $$5.e($$8);
               }
            }
         }

         @Override
         public String toString() {
            return "ChunkBlockColumn " + $$9;
         }
      };
      drf.g $$13 = new drf.g(this, $$0, $$5, $$6, $$1::a, $$2, $$4);
      drf.u $$14 = $$7.apply($$13);
      hz.a $$15 = new hz.a();

      for (int $$16 = 0; $$16 < 16; $$16++) {
         for (int $$17 = 0; $$17 < 16; $$17++) {
            int $$18 = $$10 + $$16;
            int $$19 = $$11 + $$17;
            int $$20 = $$5.a(dqo.a.a, $$16, $$17) + 1;
            $$8.p($$18).r($$19);
            ij<cwm> $$21 = $$1.a($$15.d($$18, $$3 ? 0 : $$20, $$19));
            if ($$21.a(cwt.B)) {
               this.a($$12, $$18, $$19, $$20, $$5);
            }

            int $$22 = $$5.a(dqo.a.a, $$16, $$17) + 1;
            $$13.a($$18, $$19);
            int $$23 = 0;
            int $$24 = Integer.MIN_VALUE;
            int $$25 = Integer.MAX_VALUE;
            int $$26 = $$5.J_();

            for (int $$27 = $$22; $$27 >= $$26; $$27--) {
               dlf $$28 = $$12.a($$27);
               if ($$28.i()) {
                  $$23 = 0;
                  $$24 = Integer.MIN_VALUE;
               } else if (!$$28.u().c()) {
                  if ($$24 == Integer.MIN_VALUE) {
                     $$24 = $$27 + 1;
                  }
               } else {
                  if ($$25 >= $$27) {
                     $$25 = doo.g;

                     for (int $$29 = $$27 - 1; $$29 >= $$26 - 1; $$29--) {
                        dlf $$30 = $$12.a($$29);
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
                     dlf $$32 = $$14.tryApply($$18, $$27, $$19);
                     if ($$32 != null) {
                        $$12.a($$27, $$32);
                     }
                  }
               }
            }

            if ($$21.a(cwt.W) || $$21.a(cwt.X)) {
               this.a($$13.b(), $$21.a(), $$12, $$15, $$18, $$19, $$20);
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

   private boolean a(dlf $$0) {
      return !$$0.i() && $$0.u().c();
   }

   @Deprecated
   public Optional<dlf> a(drf.o $$0, dso $$1, Function<hz, ij<cwm>> $$2, dnb $$3, dqs $$4, hz $$5, boolean $$6) {
      drf.g $$7 = new drf.g(this, $$1.d(), $$3, $$4, $$2, $$1.c().d(kg.at), $$1);
      drf.u $$8 = $$0.apply($$7);
      int $$9 = $$5.u();
      int $$10 = $$5.v();
      int $$11 = $$5.w();
      $$7.a($$9, $$11);
      $$7.a(1, 1, $$6 ? $$10 + 1 : Integer.MIN_VALUE, $$9, $$10, $$11);
      dlf $$12 = $$8.tryApply($$9, $$10, $$11);
      return Optional.ofNullable($$12);
   }

   private void a(dmy $$0, int $$1, int $$2, int $$3, cvp $$4) {
      double $$5 = 0.2;
      double $$6 = Math.min(Math.abs(this.p.a((double)$$1, 0.0, (double)$$2) * 8.25), this.n.a((double)$$1 * 0.2, 0.0, (double)$$2 * 0.2) * 15.0);
      if (!($$6 <= 0.0)) {
         double $$7 = 0.75;
         double $$8 = 1.5;
         double $$9 = Math.abs(this.o.a((double)$$1 * 0.75, 0.0, (double)$$2 * 0.75) * 1.5);
         double $$10 = 64.0 + Math.min($$6 * $$6 * 2.5, Math.ceil($$9 * 50.0) + 24.0);
         int $$11 = awh.a($$10);
         if ($$3 <= $$11) {
            for (int $$12 = $$11; $$12 >= $$4.J_(); $$12--) {
               dlf $$13 = $$0.a($$12);
               if ($$13.a(this.j.b())) {
                  break;
               }

               if ($$13.a(cyq.G)) {
                  return;
               }
            }

            for (int $$14 = $$11; $$14 >= $$4.J_() && $$0.a($$14).i(); $$14--) {
               $$0.a($$14, this.j);
            }
         }
      }
   }

   private void a(int $$0, cwm $$1, dmy $$2, hz.a $$3, int $$4, int $$5, int $$6) {
      double $$7 = 1.28;
      double $$8 = Math.min(Math.abs(this.s.a((double)$$4, 0.0, (double)$$5) * 8.25), this.q.a((double)$$4 * 1.28, 0.0, (double)$$5 * 1.28) * 15.0);
      if (!($$8 <= 1.8)) {
         double $$9 = 1.17;
         double $$10 = 1.5;
         double $$11 = Math.abs(this.r.a((double)$$4 * 1.17, 0.0, (double)$$5 * 1.17) * 1.5);
         double $$12 = Math.min($$8 * $$8 * 1.2, Math.ceil($$11 * 40.0) + 14.0);
         if ($$1.d($$3.d($$4, 63, $$5))) {
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
         awo $$16 = this.t.a($$4, 0, $$5);
         int $$17 = 2 + $$16.a(4);
         int $$18 = this.k + 18 + $$16.a(10);
         int $$19 = 0;

         for (int $$20 = Math.max($$6, (int)$$12 + 1); $$20 >= $$0; $$20--) {
            if ($$2.a($$20).i() && $$20 < (int)$$15 && $$16.j() > 0.01
               || $$2.a($$20).a(cyq.G) && $$20 > (int)$$13 && $$20 < this.k && $$13 != 0.0 && $$16.j() > 0.15) {
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

   private static dlf[] a(awo $$0) {
      dlf[] $$1 = new dlf[192];
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

   private static void a(awo $$0, dlf[] $$1, int $$2, dlf $$3) {
      int $$4 = $$0.a(6, 15);

      for (int $$5 = 0; $$5 < $$4; $$5++) {
         int $$6 = $$2 + $$0.a(3);
         int $$7 = $$0.a($$1.length);

         for (int $$8 = 0; $$7 + $$8 < $$1.length && $$8 < $$6; $$8++) {
            $$1[$$7 + $$8] = $$3;
         }
      }
   }

   protected dlf a(int $$0, int $$1, int $$2) {
      int $$3 = (int)Math.round(this.m.a((double)$$0, 0.0, (double)$$2) * 4.0);
      return this.l[($$1 + $$3 + this.l.length) % this.l.length];
   }
}
