import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class csj extends cwj implements cve {
   public static final dgc<dfr> a = dfu.bb;
   public static final dfv b = dfu.t;
   protected static final int c = 9;
   protected static final eib d = csq.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int m = 3;
   protected static final eib e = csq.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eib f = csq.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eib g = csq.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eib h = csq.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eib i = ehy.a(d, e, g);
   protected static final eib j = ehy.a(d, f, h);
   protected static final eib k = ehy.a(d, e, f);
   protected static final eib l = ehy.a(d, g, h);
   private final cho n;

   public csj(cho $$0, dfd.d $$1) {
      super($$1);
      this.n = $$0;
      this.k(this.C.b().a(a, dfr.b).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   public static hc a(cow $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      return $$2.b() instanceof csj ? $$2.c(aC) : null;
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      if ($$1.B) {
         return bgt.b;
      } else {
         if ($$0.c(a) != dfr.a) {
            $$2 = $$2.a($$0.c(aC));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bgt.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            gw $$6 = $$2.a($$0.c(aC).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            ehi $$7 = $$2.b();
            $$1.a(null, $$1.ag().a($$7), null, $$7, 5.0F, true, cpq.a.b);
            return bgt.a;
         } else if ($$0.c(b)) {
            if (!this.a($$1, $$2)) {
               $$3.a(ti.c("block.minecraft.bed.occupied"), true);
            }

            return bgt.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bgt.a;
         }
      }
   }

   public static boolean a(cpq $$0) {
      return $$0.x_().l();
   }

   private boolean a(cpq $$0, gw $$1) {
      List<cbc> $$2 = $$0.a(cbc.class, new ehd($$1), bjb::fB);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fC();
         return true;
      }
   }

   @Override
   public void a(cpq $$0, dfe $$1, gw $$2, bil $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cow $$0, bil $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bil $$0) {
      ehi $$1 = $$0.dn();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bjb ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$1 == a($$0.c(a), $$0.c(aC))) {
         return $$2.a(this) && $$2.c(a) != $$0.c(a) ? $$0.a(b, $$2.c(b)) : csr.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static hc a(dfr $$0, hc $$1) {
      return $$0 == dfr.b ? $$1 : $$1.g();
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, cbp $$3) {
      if (!$$0.B && $$3.f()) {
         dfr $$4 = $$2.c(a);
         if ($$4 == dfr.b) {
            gw $$5 = $$1.a(a($$4, $$2.c(aC)));
            dfe $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(a) == dfr.a) {
               $$0.a($$5, csr.a.n(), 35);
               $$0.a($$3, 2001, $$5, csq.i($$6));
            }
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      hc $$1 = $$0.g();
      gw $$2 = $$0.a();
      gw $$3 = $$2.a($$1);
      cpq $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.w_().a($$3) ? this.n().a(aC, $$1) : null;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      hc $$4 = g($$0).g();
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

   public static hc g(dfe $$0) {
      hc $$1 = $$0.c(aC);
      return $$0.c(a) == dfr.a ? $$1.g() : $$1;
   }

   public static cut.a h(dfe $$0) {
      dfr $$1 = $$0.c(a);
      return $$1 == dfr.a ? cut.a.b : cut.a.c;
   }

   private static boolean b(cow $$0, gw $$1) {
      return $$0.a_($$1.d()).b() instanceof csj;
   }

   public static Optional<ehi> a(bip<?> $$0, cpa $$1, gw $$2, hc $$3, float $$4) {
      hc $$5 = $$3.h();
      hc $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ehi> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ehi> a(bip<?> $$0, cpa $$1, gw $$2, hc $$3, hc $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ehi> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         gw $$7 = $$2.d();
         Optional<ehi> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ehi> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ehi> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ehi> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ehi> a(bip<?> $$0, cpa $$1, gw $$2, int[][] $$3, boolean $$4) {
      gw.a $$5 = new gw.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ehi $$7 = cdl.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public cyv b_(dfe $$0) {
      return cyv.b;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(aC, a, b);
   }

   @Override
   public dcq a(gw $$0, dfe $$1) {
      return new dcm($$0, $$1, this.n);
   }

   @Override
   public void a(cpq $$0, gw $$1, dfe $$2, @Nullable bjb $$3, cja $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         gw $$5 = $$1.a($$2.c(aC));
         $$0.a($$5, $$2.a(a, dfr.a), 3);
         $$0.b($$1, csr.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cho a() {
      return this.n;
   }

   @Override
   public long a(dfe $$0, gw $$1) {
      gw $$2 = $$1.a($$0.c(aC), $$0.c(a) == dfr.a ? 0 : 1);
      return ars.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   private static int[][] a(hc $$0, hc $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(hc $$0, hc $$1) {
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

   private static int[][] a(hc $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
