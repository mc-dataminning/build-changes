import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class csd extends cwd implements cuy {
   public static final dfw<dfl> a = dfo.bb;
   public static final dfp b = dfo.t;
   protected static final int c = 9;
   protected static final ehy d = csk.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int m = 3;
   protected static final ehy e = csk.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ehy f = csk.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ehy g = csk.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ehy h = csk.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ehy i = ehv.a(d, e, g);
   protected static final ehy j = ehv.a(d, f, h);
   protected static final ehy k = ehv.a(d, e, f);
   protected static final ehy l = ehv.a(d, g, h);
   private final chk n;

   public csd(chk $$0, dex.d $$1) {
      super($$1);
      this.n = $$0;
      this.k(this.C.b().a(a, dfl.b).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   public static hb a(coq $$0, gv $$1) {
      dey $$2 = $$0.a_($$1);
      return $$2.b() instanceof csd ? $$2.c(aC) : null;
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      if ($$1.B) {
         return bgo.b;
      } else {
         if ($$0.c(a) != dfl.a) {
            $$2 = $$2.a($$0.c(aC));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bgo.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            gv $$6 = $$2.a($$0.c(aC).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            ehf $$7 = $$2.b();
            $$1.a(null, $$1.ag().a($$7), null, $$7, 5.0F, true, cpk.a.b);
            return bgo.a;
         } else if ($$0.c(b)) {
            if (!this.a($$1, $$2)) {
               $$3.a(te.c("block.minecraft.bed.occupied"), true);
            }

            return bgo.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bgo.a;
         }
      }
   }

   public static boolean a(cpk $$0) {
      return $$0.x_().l();
   }

   private boolean a(cpk $$0, gv $$1) {
      List<cay> $$2 = $$0.a(cay.class, new eha($$1), biw::fB);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fC();
         return true;
      }
   }

   @Override
   public void a(cpk $$0, dey $$1, gv $$2, big $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(coq $$0, big $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(big $$0) {
      ehf $$1 = $$0.dn();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof biw ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$1 == a($$0.c(a), $$0.c(aC))) {
         return $$2.a(this) && $$2.c(a) != $$0.c(a) ? $$0.a(b, $$2.c(b)) : csl.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static hb a(dfl $$0, hb $$1) {
      return $$0 == dfl.b ? $$1 : $$1.g();
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, cbl $$3) {
      if (!$$0.B && $$3.f()) {
         dfl $$4 = $$2.c(a);
         if ($$4 == dfl.b) {
            gv $$5 = $$1.a(a($$4, $$2.c(aC)));
            dey $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(a) == dfl.a) {
               $$0.a($$5, csl.a.n(), 35);
               $$0.a($$3, 2001, $$5, csk.i($$6));
            }
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      hb $$1 = $$0.g();
      gv $$2 = $$0.a();
      gv $$3 = $$2.a($$1);
      cpk $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.w_().a($$3) ? this.n().a(aC, $$1) : null;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      hb $$4 = g($$0).g();
      switch ($$4) {
         case c:
            return i;
         case d:
            return j;
         case e:
            return k;
         default:
            return l;
      }
   }

   public static hb g(dey $$0) {
      hb $$1 = $$0.c(aC);
      return $$0.c(a) == dfl.a ? $$1.g() : $$1;
   }

   public static cun.a h(dey $$0) {
      dfl $$1 = $$0.c(a);
      return $$1 == dfl.a ? cun.a.b : cun.a.c;
   }

   private static boolean b(coq $$0, gv $$1) {
      return $$0.a_($$1.d()).b() instanceof csd;
   }

   public static Optional<ehf> a(bik<?> $$0, cou $$1, gv $$2, hb $$3, float $$4) {
      hb $$5 = $$3.h();
      hb $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ehf> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ehf> a(bik<?> $$0, cou $$1, gv $$2, hb $$3, hb $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ehf> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         gv $$7 = $$2.d();
         Optional<ehf> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ehf> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ehf> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ehf> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ehf> a(bik<?> $$0, cou $$1, gv $$2, int[][] $$3, boolean $$4) {
      gv.a $$5 = new gv.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ehf $$7 = cdh.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.b;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(aC, a, b);
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dcg($$0, $$1, this.n);
   }

   @Override
   public void a(cpk $$0, gv $$1, dey $$2, @Nullable biw $$3, ciw $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         gv $$5 = $$1.a($$2.c(aC));
         $$0.a($$5, $$2.a(a, dfl.a), 3);
         $$0.b($$1, csl.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public chk a() {
      return this.n;
   }

   @Override
   public long a(dey $$0, gv $$1) {
      gv $$2 = $$1.a($$0.c(aC), $$0.c(a) == dfl.a ? 0 : 1);
      return aro.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   private static int[][] a(hb $$0, hb $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(hb $$0, hb $$1) {
      return new int[][]{
         {$$1.j(), $$1.l()},
         {$$1.j() - $$0.j(), $$1.l() - $$0.l()},
         {$$1.j() - $$0.j() * 2, $$1.l() - $$0.l() * 2},
         {-$$0.j() * 2, -$$0.l() * 2},
         {-$$1.j() - $$0.j() * 2, -$$1.l() - $$0.l() * 2},
         {-$$1.j() - $$0.j(), -$$1.l() - $$0.l()},
         {-$$1.j(), -$$1.l()},
         {-$$1.j() + $$0.j(), -$$1.l() + $$0.l()},
         {$$0.j(), $$0.l()},
         {$$1.j() + $$0.j(), $$1.l() + $$0.l()}
      };
   }

   private static int[][] a(hb $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
