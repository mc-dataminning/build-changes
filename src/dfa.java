import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dfa extends djd implements dhz {
   public static final MapCodec<dfa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csv.q.fieldOf("color").forGetter(dfa::b), u()).apply($$0, dfa::new));
   public static final dti<dsx> b = dta.bb;
   public static final dtb c = dta.t;
   protected static final int d = 9;
   protected static final ewy e = dfh.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ewy f = dfh.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ewy g = dfh.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ewy h = dfh.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ewy i = dfh.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ewy j = ewv.a(e, f, h);
   protected static final ewy k = ewv.a(e, g, i);
   protected static final ewy l = ewv.a(e, f, g);
   protected static final ewy m = ewv.a(e, h, i);
   private final csv o;

   @Override
   public MapCodec<dfa> a() {
      return a;
   }

   public dfa(csv $$0, dsj.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dsx.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jf a(dbl $$0, ja $$1) {
      dsk $$2 = $$0.a_($$1);
      return $$2.b() instanceof dfa ? $$2.c(aE) : null;
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         return bqg.c;
      } else {
         if ($$0.c(b) != dsx.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqg.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ja $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ewf $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dcf.a.b);
            return bqg.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wu.c("block.minecraft.bed.occupied"), true);
            }

            return bqg.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqg.a;
         }
      }
   }

   public static boolean a(dcf $$0) {
      return $$0.D_().l();
   }

   private boolean a(dcf $$0, ja $$1) {
      List<clx> $$2 = $$0.a(clx.class, new ewa($$1), btb::fI);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fJ();
         return true;
      }
   }

   @Override
   public void a(dcf $$0, dsk $$1, ja $$2, bsg $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dbl $$0, bsg $$1) {
      if ($$1.bY()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsg $$0) {
      ewf $$1 = $$0.dt();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btb ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dfj.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static jf a(dsx $$0, jf $$1) {
      return $$0 == dsx.b ? $$1 : $$1.g();
   }

   @Override
   public dsk a(dcf $$0, ja $$1, dsk $$2, cmk $$3) {
      if (!$$0.B && $$3.f()) {
         dsx $$4 = $$2.c(b);
         if ($$4 == dsx.b) {
            ja $$5 = $$1.a(a($$4, $$2.c(aE)));
            dsk $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dsx.a) {
               $$0.a($$5, dfj.a.o(), 35);
               $$0.a($$3, 2001, $$5, dfh.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      jf $$1 = $$0.g();
      ja $$2 = $$0.a();
      ja $$3 = $$2.a($$1);
      dcf $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      jf $$4 = g($$0).g();
      switch ($$4) {
         case c:
            return j;
         case d:
            return k;
         case e:
            return l;
         default:
            return m;
      }
   }

   public static jf g(dsk $$0) {
      jf $$1 = $$0.c(aE);
      return $$0.c(b) == dsx.a ? $$1.g() : $$1;
   }

   public static dho.a h(dsk $$0) {
      dsx $$1 = $$0.c(b);
      return $$1 == dsx.a ? dho.a.b : dho.a.c;
   }

   private static boolean b(dbl $$0, ja $$1) {
      return $$0.a_($$1.d()).b() instanceof dfa;
   }

   public static Optional<ewf> a(bsm<?> $$0, dbp $$1, ja $$2, jf $$3, float $$4) {
      jf $$5 = $$3.h();
      jf $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ewf> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ewf> a(bsm<?> $$0, dbp $$1, ja $$2, jf $$3, jf $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ewf> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ja $$7 = $$2.d();
         Optional<ewf> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ewf> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ewf> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ewf> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ewf> a(bsm<?> $$0, dbp $$1, ja $$2, int[][] $$3, boolean $$4) {
      ja.a $$5 = new ja.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ewf $$7 = cok.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.b;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dpl($$0, $$1, this.o);
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, @Nullable btb $$3, cuc $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         ja $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dsx.a), 3);
         $$0.b($$1, dfj.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public csv b() {
      return this.o;
   }

   @Override
   protected long a(dsk $$0, ja $$1) {
      ja $$2 = $$1.a($$0.c(aE), $$0.c(b) == dsx.a ? 0 : 1);
      return ayg.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   private static int[][] a(jf $$0, jf $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jf $$0, jf $$1) {
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

   private static int[][] a(jf $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
