import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cso extends cwo implements cvj {
   public static final dgh<dfw> a = dfz.bb;
   public static final dga b = dfz.t;
   protected static final int c = 9;
   protected static final eig d = csv.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int m = 3;
   protected static final eig e = csv.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eig f = csv.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eig g = csv.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eig h = csv.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eig i = eid.a(d, e, g);
   protected static final eig j = eid.a(d, f, h);
   protected static final eig k = eid.a(d, e, f);
   protected static final eig l = eid.a(d, g, h);
   private final cht n;

   public cso(cht $$0, dfi.d $$1) {
      super($$1);
      this.n = $$0;
      this.k(this.C.b().a(a, dfw.b).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   public static hc a(cpb $$0, gw $$1) {
      dfj $$2 = $$0.a_($$1);
      return $$2.b() instanceof cso ? $$2.c(aC) : null;
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      if ($$1.B) {
         return bgy.b;
      } else {
         if ($$0.c(a) != dfw.a) {
            $$2 = $$2.a($$0.c(aC));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bgy.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            gw $$6 = $$2.a($$0.c(aC).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            ehn $$7 = $$2.b();
            $$1.a(null, $$1.ag().a($$7), null, $$7, 5.0F, true, cpv.a.b);
            return bgy.a;
         } else if ($$0.c(b)) {
            if (!this.a($$1, $$2)) {
               $$3.a(tm.c("block.minecraft.bed.occupied"), true);
            }

            return bgy.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bgy.a;
         }
      }
   }

   public static boolean a(cpv $$0) {
      return $$0.C_().l();
   }

   private boolean a(cpv $$0, gw $$1) {
      List<cbh> $$2 = $$0.a(cbh.class, new ehi($$1), bjg::fC);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fD();
         return true;
      }
   }

   @Override
   public void a(cpv $$0, dfj $$1, gw $$2, biq $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cpb $$0, biq $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(biq $$0) {
      ehn $$1 = $$0.do();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bjg ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if ($$1 == a($$0.c(a), $$0.c(aC))) {
         return $$2.a(this) && $$2.c(a) != $$0.c(a) ? $$0.a(b, $$2.c(b)) : csw.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static hc a(dfw $$0, hc $$1) {
      return $$0 == dfw.b ? $$1 : $$1.g();
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, cbu $$3) {
      if (!$$0.B && $$3.f()) {
         dfw $$4 = $$2.c(a);
         if ($$4 == dfw.b) {
            gw $$5 = $$1.a(a($$4, $$2.c(aC)));
            dfj $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(a) == dfw.a) {
               $$0.a($$5, csw.a.n(), 35);
               $$0.a($$3, 2001, $$5, csv.i($$6));
            }
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dfj a(cln $$0) {
      hc $$1 = $$0.g();
      gw $$2 = $$0.a();
      gw $$3 = $$2.a($$1);
      cpv $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.B_().a($$3) ? this.n().a(aC, $$1) : null;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
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

   public static hc g(dfj $$0) {
      hc $$1 = $$0.c(aC);
      return $$0.c(a) == dfw.a ? $$1.g() : $$1;
   }

   public static cuy.a h(dfj $$0) {
      dfw $$1 = $$0.c(a);
      return $$1 == dfw.a ? cuy.a.b : cuy.a.c;
   }

   private static boolean b(cpb $$0, gw $$1) {
      return $$0.a_($$1.d()).b() instanceof cso;
   }

   public static Optional<ehn> a(biu<?> $$0, cpf $$1, gw $$2, hc $$3, float $$4) {
      hc $$5 = $$3.h();
      hc $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ehn> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ehn> a(biu<?> $$0, cpf $$1, gw $$2, hc $$3, hc $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ehn> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         gw $$7 = $$2.d();
         Optional<ehn> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ehn> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ehn> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ehn> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ehn> a(biu<?> $$0, cpf $$1, gw $$2, int[][] $$3, boolean $$4) {
      gw.a $$5 = new gw.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ehn $$7 = cdq.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public cza b_(dfj $$0) {
      return cza.b;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(aC, a, b);
   }

   @Override
   public dcv a(gw $$0, dfj $$1) {
      return new dcr($$0, $$1, this.n);
   }

   @Override
   public void a(cpv $$0, gw $$1, dfj $$2, @Nullable bjg $$3, cjf $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         gw $$5 = $$1.a($$2.c(aC));
         $$0.a($$5, $$2.a(a, dfw.a), 3);
         $$0.b($$1, csw.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cht a() {
      return this.n;
   }

   @Override
   public long a(dfj $$0, gw $$1) {
      gw $$2 = $$1.a($$0.c(aC), $$0.c(a) == dfw.a ? 0 : 1);
      return arx.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
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
