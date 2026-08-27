import java.util.Comparator;
import java.util.Optional;

public class emp {
   public static final int a = 3;
   private static final int b = 128;
   private static final int c = 16;
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
   private final aqe n;

   public emp(aqe $$0) {
      this.n = $$0;
   }

   public Optional<l.a> a(im $$0, boolean $$1, drp $$2) {
      cch $$3 = this.n.y();
      int $$4 = $$1 ? 16 : 128;
      $$3.a(this.n, $$0, $$4);
      Optional<cci> $$5 = $$3.b($$0x -> $$0x.a(ccl.r), $$0, $$4, cch.b.c)
         .filter($$1x -> $$2.a($$1x.f()))
         .sorted(Comparator.<cci>comparingDouble($$1x -> $$1x.f().j($$0)).thenComparingInt($$0x -> $$0x.f().v()))
         .filter($$0x -> this.n.a_($$0x.f()).b(dqo.H))
         .findFirst();
      return $$5.map($$0x -> {
         im $$1x = $$0x.f();
         this.n.l().a(aqj.f, new czb($$1x), 3, $$1x);
         dpy $$2x = this.n.a_($$1x);
         return l.a($$1x, $$2x.c(dqo.H), 21, ir.a.b, 21, $$1xx -> this.n.a_($$1xx) == $$2x);
      });
   }

   public Optional<l.a> a(im $$0, ir.a $$1) {
      ir $$2 = ir.a(ir.b.a, $$1);
      double $$3 = -1.0;
      im $$4 = null;
      double $$5 = -1.0;
      im $$6 = null;
      drp $$7 = this.n.C_();
      int $$8 = Math.min(this.n.al(), this.n.I_() + this.n.k()) - 1;
      im.a $$9 = $$0.j();

      for (im.a $$10 : im.a($$0, 16, ir.f, ir.d)) {
         int $$11 = Math.min($$8, this.n.a(dvq.a.e, $$10.u(), $$10.w()));
         int $$12 = 1;
         if ($$7.a($$10) && $$7.a($$10.c($$2, 1))) {
            $$10.c($$2.g(), 1);

            for (int $$13 = $$11; $$13 >= this.n.I_(); $$13--) {
               $$10.q($$13);
               if (this.a($$10)) {
                  int $$14 = $$13;

                  while ($$13 > this.n.I_() && this.a($$10.c(ir.a))) {
                     $$13--;
                  }

                  if ($$13 + 4 <= $$8) {
                     int $$15 = $$14 - $$13;
                     if ($$15 <= 0 || $$15 >= 3) {
                        $$10.q($$13);
                        if (this.a($$10, $$9, $$2, 0)) {
                           double $$16 = $$0.j($$10);
                           if (this.a($$10, $$9, $$2, -1) && this.a($$10, $$9, $$2, 1) && ($$3 == -1.0 || $$3 > $$16)) {
                              $$3 = $$16;
                              $$4 = $$10.i();
                           }

                           if ($$3 == -1.0 && ($$5 == -1.0 || $$5 > $$16)) {
                              $$5 = $$16;
                              $$6 = $$10.i();
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
         int $$17 = Math.max(this.n.I_() - -1, 70);
         int $$18 = $$8 - 9;
         if ($$18 < $$17) {
            return Optional.empty();
         }

         $$4 = new im($$0.u(), axw.a($$0.v(), $$17, $$18), $$0.w()).i();
         ir $$19 = $$2.h();
         if (!$$7.a($$4)) {
            return Optional.empty();
         }

         for (int $$20 = -1; $$20 < 2; $$20++) {
            for (int $$21 = 0; $$21 < 2; $$21++) {
               for (int $$22 = -1; $$22 < 3; $$22++) {
                  dpy $$23 = $$22 < 0 ? dcx.co.n() : dcx.a.n();
                  $$9.a($$4, $$21 * $$2.j() + $$20 * $$19.j(), $$22, $$21 * $$2.l() + $$20 * $$19.l());
                  this.n.b($$9, $$23);
               }
            }
         }
      }

      for (int $$24 = -1; $$24 < 3; $$24++) {
         for (int $$25 = -1; $$25 < 4; $$25++) {
            if ($$24 == -1 || $$24 == 2 || $$25 == -1 || $$25 == 3) {
               $$9.a($$4, $$24 * $$2.j(), $$25, $$24 * $$2.l());
               this.n.a($$9, dcx.co.n(), 3);
            }
         }
      }

      dpy $$26 = dcx.ed.n().a(dhz.b, $$1);

      for (int $$27 = 0; $$27 < 2; $$27++) {
         for (int $$28 = 0; $$28 < 3; $$28++) {
            $$9.a($$4, $$27 * $$2.j(), $$28, $$27 * $$2.l());
            this.n.a($$9, $$26, 18);
         }
      }

      return Optional.of(new l.a($$4.i(), 2, 3));
   }

   private boolean a(im.a $$0) {
      dpy $$1 = this.n.a_($$0);
      return $$1.r() && $$1.u().c();
   }

   private boolean a(im $$0, im.a $$1, ir $$2, int $$3) {
      ir $$4 = $$2.h();

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
