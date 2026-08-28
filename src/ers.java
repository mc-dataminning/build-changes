import java.util.Comparator;
import java.util.Optional;

public class ers {
   public static final int a = 3;
   private static final int b = 16;
   private static final int c = 128;
   private static final int d = 5;
   private static final int e = 4;
   private static final int f = 3;
   private static final int g = -1;
   private static final int h = 4;
   private static final int i = -1;
   private static final int j = 3;
   private static final int k = -1;
   private static final int l = 2;
   private static final int m = -1;
   private final arj n;

   public ers(arj $$0) {
      this.n = $$0;
   }

   public Optional<jf> a(jf $$0, boolean $$1, dwj $$2) {
      cfq $$3 = this.n.y();
      int $$4 = $$1 ? 16 : 128;
      $$3.a(this.n, $$0, $$4);
      return $$3.b($$0x -> $$0x.a(cfu.r), $$0, $$4, cfq.b.c)
         .map(cfr::g)
         .filter($$2::a)
         .filter($$0x -> this.n.a_($$0x).b(dvi.H))
         .min(Comparator.<jf>comparingDouble($$1x -> $$1x.j($$0)).thenComparingInt(kj::v));
   }

   public Optional<l.a> a(jf $$0, jk.a $$1) {
      jk $$2 = jk.a(jk.b.a, $$1);
      double $$3 = -1.0;
      jf $$4 = null;
      double $$5 = -1.0;
      jf $$6 = null;
      dwj $$7 = this.n.B_();
      int $$8 = Math.min(this.n.an(), this.n.H_() + this.n.k() - 1);
      int $$9 = 1;
      jf.a $$10 = $$0.k();

      for (jf.a $$11 : jf.a($$0, 16, jk.f, jk.d)) {
         int $$12 = Math.min($$8, this.n.a(eao.a.e, $$11.u(), $$11.w()));
         if ($$7.a($$11) && $$7.a($$11.c($$2, 1))) {
            $$11.c($$2.g(), 1);

            for (int $$13 = $$12; $$13 >= this.n.H_(); $$13--) {
               $$11.q($$13);
               if (this.a($$11)) {
                  int $$14 = $$13;

                  while ($$13 > this.n.H_() && this.a($$11.c(jk.a))) {
                     $$13--;
                  }

                  if ($$13 + 4 <= $$8) {
                     int $$15 = $$14 - $$13;
                     if ($$15 <= 0 || $$15 >= 3) {
                        $$11.q($$13);
                        if (this.a($$11, $$10, $$2, 0)) {
                           double $$16 = $$0.j($$11);
                           if (this.a($$11, $$10, $$2, -1) && this.a($$11, $$10, $$2, 1) && ($$3 == -1.0 || $$3 > $$16)) {
                              $$3 = $$16;
                              $$4 = $$11.j();
                           }

                           if ($$3 == -1.0 && ($$5 == -1.0 || $$5 > $$16)) {
                              $$5 = $$16;
                              $$6 = $$11.j();
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      if ($$3 == -1.0 && $$5 != -1.0) {
         $$4 = $$6;
         $$3 = $$5;
      }

      if ($$3 == -1.0) {
         int $$17 = Math.max(this.n.H_() - -1, 70);
         int $$18 = $$8 - 9;
         if ($$18 < $$17) {
            return Optional.empty();
         }

         $$4 = new jf($$0.u() - $$2.j() * 1, azf.a($$0.v(), $$17, $$18), $$0.w() - $$2.l() * 1).j();
         $$4 = $$7.b($$4);
         jk $$19 = $$2.h();

         for (int $$20 = -1; $$20 < 2; $$20++) {
            for (int $$21 = 0; $$21 < 2; $$21++) {
               for (int $$22 = -1; $$22 < 3; $$22++) {
                  dus $$23 = $$22 < 0 ? dho.co.n() : dho.a.n();
                  $$10.a($$4, $$21 * $$2.j() + $$20 * $$19.j(), $$22, $$21 * $$2.l() + $$20 * $$19.l());
                  this.n.b($$10, $$23);
               }
            }
         }
      }

      for (int $$24 = -1; $$24 < 3; $$24++) {
         for (int $$25 = -1; $$25 < 4; $$25++) {
            if ($$24 == -1 || $$24 == 2 || $$25 == -1 || $$25 == 3) {
               $$10.a($$4, $$24 * $$2.j(), $$25, $$24 * $$2.l());
               this.n.a($$10, dho.co.n(), 3);
            }
         }
      }

      dus $$26 = dho.ed.n().b(dmq.b, $$1);

      for (int $$27 = 0; $$27 < 2; $$27++) {
         for (int $$28 = 0; $$28 < 3; $$28++) {
            $$10.a($$4, $$27 * $$2.j(), $$28, $$27 * $$2.l());
            this.n.a($$10, $$26, 18);
         }
      }

      return Optional.of(new l.a($$4.j(), 2, 3));
   }

   private boolean a(jf.a $$0) {
      dus $$1 = this.n.a_($$0);
      return $$1.v() && $$1.y().c();
   }

   private boolean a(jf $$0, jf.a $$1, jk $$2, int $$3) {
      jk $$4 = $$2.h();

      for (int $$5 = -1; $$5 < 3; $$5++) {
         for (int $$6 = -1; $$6 < 4; $$6++) {
            $$1.a($$0, $$2.j() * $$5 + $$4.j() * $$3, $$6, $$2.l() * $$5 + $$4.l() * $$3);
            if ($$6 < 0 && !this.n.a_($$1).e()) {
               return false;
            }

            if ($$6 >= 0 && !this.a($$1)) {
               return false;
            }
         }
      }

      return true;
   }
}
