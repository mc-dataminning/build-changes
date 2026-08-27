import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cse extends cwe implements cuz {
   public static final dfx<dfm> a = dfp.bb;
   public static final dfq b = dfp.t;
   protected static final int c = 9;
   protected static final ehw d = csl.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int m = 3;
   protected static final ehw e = csl.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ehw f = csl.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ehw g = csl.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ehw h = csl.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ehw i = eht.a(d, e, g);
   protected static final ehw j = eht.a(d, f, h);
   protected static final ehw k = eht.a(d, e, f);
   protected static final ehw l = eht.a(d, g, h);
   private final chl n;

   public cse(chl $$0, dey.d $$1) {
      super($$1);
      this.n = $$0;
      this.k(this.C.b().a(a, dfm.b).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   public static ha a(cor $$0, gu $$1) {
      dez $$2 = $$0.a_($$1);
      return $$2.b() instanceof cse ? $$2.c(aC) : null;
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      if ($$1.B) {
         return bgq.b;
      } else {
         if ($$0.c(a) != dfm.a) {
            $$2 = $$2.a($$0.c(aC));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bgq.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            gu $$6 = $$2.a($$0.c(aC).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            ehd $$7 = $$2.b();
            $$1.a(null, $$1.ag().a($$7), null, $$7, 5.0F, true, cpl.a.b);
            return bgq.a;
         } else if ($$0.c(b)) {
            if (!this.a($$1, $$2)) {
               $$3.a(tf.c("block.minecraft.bed.occupied"), true);
            }

            return bgq.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bgq.a;
         }
      }
   }

   public static boolean a(cpl $$0) {
      return $$0.x_().l();
   }

   private boolean a(cpl $$0, gu $$1) {
      List<caz> $$2 = $$0.a(caz.class, new egy($$1), biy::fB);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fC();
         return true;
      }
   }

   @Override
   public void a(cpl $$0, dez $$1, gu $$2, bii $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cor $$0, bii $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bii $$0) {
      ehd $$1 = $$0.dn();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof biy ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$1 == a($$0.c(a), $$0.c(aC))) {
         return $$2.a(this) && $$2.c(a) != $$0.c(a) ? $$0.a(b, $$2.c(b)) : csm.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ha a(dfm $$0, ha $$1) {
      return $$0 == dfm.b ? $$1 : $$1.g();
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, cbm $$3) {
      if (!$$0.B && $$3.f()) {
         dfm $$4 = $$2.c(a);
         if ($$4 == dfm.b) {
            gu $$5 = $$1.a(a($$4, $$2.c(aC)));
            dez $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(a) == dfm.a) {
               $$0.a($$5, csm.a.n(), 35);
               $$0.a($$3, 2001, $$5, csl.i($$6));
            }
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      ha $$1 = $$0.g();
      gu $$2 = $$0.a();
      gu $$3 = $$2.a($$1);
      cpl $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.w_().a($$3) ? this.n().a(aC, $$1) : null;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      ha $$4 = g($$0).g();
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

   public static ha g(dez $$0) {
      ha $$1 = $$0.c(aC);
      return $$0.c(a) == dfm.a ? $$1.g() : $$1;
   }

   public static cuo.a h(dez $$0) {
      dfm $$1 = $$0.c(a);
      return $$1 == dfm.a ? cuo.a.b : cuo.a.c;
   }

   private static boolean b(cor $$0, gu $$1) {
      return $$0.a_($$1.d()).b() instanceof cse;
   }

   public static Optional<ehd> a(bim<?> $$0, cov $$1, gu $$2, ha $$3, float $$4) {
      ha $$5 = $$3.h();
      ha $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ehd> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ehd> a(bim<?> $$0, cov $$1, gu $$2, ha $$3, ha $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ehd> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         gu $$7 = $$2.d();
         Optional<ehd> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ehd> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ehd> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ehd> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ehd> a(bim<?> $$0, cov $$1, gu $$2, int[][] $$3, boolean $$4) {
      gu.a $$5 = new gu.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ehd $$7 = cdi.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.b;
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(aC, a, b);
   }

   @Override
   public dcl a(gu $$0, dez $$1) {
      return new dch($$0, $$1, this.n);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, @Nullable biy $$3, cix $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         gu $$5 = $$1.a($$2.c(aC));
         $$0.a($$5, $$2.a(a, dfm.a), 3);
         $$0.b($$1, csm.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public chl a() {
      return this.n;
   }

   @Override
   public long a(dez $$0, gu $$1) {
      gu $$2 = $$1.a($$0.c(aC), $$0.c(a) == dfm.a ? 0 : 1);
      return arp.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }

   private static int[][] a(ha $$0, ha $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ha $$0, ha $$1) {
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

   private static int[][] a(ha $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
