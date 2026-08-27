import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class csq extends cwq implements cvl {
   public static final dgj<dfy> a = dgb.bb;
   public static final dgc b = dgb.t;
   protected static final int c = 9;
   protected static final eii d = csx.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int m = 3;
   protected static final eii e = csx.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eii f = csx.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eii g = csx.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eii h = csx.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eii i = eif.a(d, e, g);
   protected static final eii j = eif.a(d, f, h);
   protected static final eii k = eif.a(d, e, f);
   protected static final eii l = eif.a(d, g, h);
   private final chv n;

   public csq(chv $$0, dfk.d $$1) {
      super($$1);
      this.n = $$0;
      this.k(this.C.b().a(a, dfy.b).a(b, Boolean.valueOf(false)));
   }

   @Nullable
   public static hc a(cpd $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1);
      return $$2.b() instanceof csq ? $$2.c(aC) : null;
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      if ($$1.B) {
         return bha.b;
      } else {
         if ($$0.c(a) != dfy.a) {
            $$2 = $$2.a($$0.c(aC));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bha.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            gw $$6 = $$2.a($$0.c(aC).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            ehp $$7 = $$2.b();
            $$1.a(null, $$1.ag().a($$7), null, $$7, 5.0F, true, cpx.a.b);
            return bha.a;
         } else if ($$0.c(b)) {
            if (!this.a($$1, $$2)) {
               $$3.a(tn.c("block.minecraft.bed.occupied"), true);
            }

            return bha.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bha.a;
         }
      }
   }

   public static boolean a(cpx $$0) {
      return $$0.C_().l();
   }

   private boolean a(cpx $$0, gw $$1) {
      List<cbj> $$2 = $$0.a(cbj.class, new ehk($$1), bji::fC);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fD();
         return true;
      }
   }

   @Override
   public void a(cpx $$0, dfl $$1, gw $$2, bis $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cpd $$0, bis $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bis $$0) {
      ehp $$1 = $$0.do();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bji ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$1 == a($$0.c(a), $$0.c(aC))) {
         return $$2.a(this) && $$2.c(a) != $$0.c(a) ? $$0.a(b, $$2.c(b)) : csy.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static hc a(dfy $$0, hc $$1) {
      return $$0 == dfy.b ? $$1 : $$1.g();
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, cbw $$3) {
      if (!$$0.B && $$3.f()) {
         dfy $$4 = $$2.c(a);
         if ($$4 == dfy.b) {
            gw $$5 = $$1.a(a($$4, $$2.c(aC)));
            dfl $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(a) == dfy.a) {
               $$0.a($$5, csy.a.n(), 35);
               $$0.a($$3, 2001, $$5, csx.i($$6));
            }
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      hc $$1 = $$0.g();
      gw $$2 = $$0.a();
      gw $$3 = $$2.a($$1);
      cpx $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.B_().a($$3) ? this.n().a(aC, $$1) : null;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
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

   public static hc g(dfl $$0) {
      hc $$1 = $$0.c(aC);
      return $$0.c(a) == dfy.a ? $$1.g() : $$1;
   }

   public static cva.a h(dfl $$0) {
      dfy $$1 = $$0.c(a);
      return $$1 == dfy.a ? cva.a.b : cva.a.c;
   }

   private static boolean b(cpd $$0, gw $$1) {
      return $$0.a_($$1.d()).b() instanceof csq;
   }

   public static Optional<ehp> a(biw<?> $$0, cph $$1, gw $$2, hc $$3, float $$4) {
      hc $$5 = $$3.h();
      hc $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ehp> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ehp> a(biw<?> $$0, cph $$1, gw $$2, hc $$3, hc $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ehp> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         gw $$7 = $$2.d();
         Optional<ehp> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ehp> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ehp> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ehp> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ehp> a(biw<?> $$0, cph $$1, gw $$2, int[][] $$3, boolean $$4) {
      gw.a $$5 = new gw.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ehp $$7 = cds.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.b;
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(aC, a, b);
   }

   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new dct($$0, $$1, this.n);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, @Nullable bji $$3, cjh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         gw $$5 = $$1.a($$2.c(aC));
         $$0.a($$5, $$2.a(a, dfy.a), 3);
         $$0.b($$1, csy.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public chv a() {
      return this.n;
   }

   @Override
   public long a(dfl $$0, gw $$1) {
      gw $$2 = $$1.a($$0.c(aC), $$0.c(a) == dfy.a ? 0 : 1);
      return ary.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
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
