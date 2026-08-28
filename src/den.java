import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class den extends diq implements dhm {
   public static final MapCodec<den> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctd.q.fieldOf("color").forGetter(den::b), u()).apply($$0, den::new));
   public static final dsv<dsk> b = dsn.bb;
   public static final dso c = dsn.t;
   protected static final int d = 9;
   protected static final ewf e = deu.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ewf f = deu.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ewf g = deu.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ewf h = deu.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ewf i = deu.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ewf j = ewc.a(e, f, h);
   protected static final ewf k = ewc.a(e, g, i);
   protected static final ewf l = ewc.a(e, f, g);
   protected static final ewf m = ewc.a(e, h, i);
   private final ctd o;

   @Override
   public MapCodec<den> a() {
      return a;
   }

   public den(ctd $$0, drw.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dsk.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static je a(daz $$0, iz $$1) {
      drx $$2 = $$0.a_($$1);
      return $$2.b() instanceof den ? $$2.c(aE) : null;
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.c;
      } else {
         if ($$0.c(b) != dsk.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqp.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iz $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            evm $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dbt.a.b);
            return bqp.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xl.c("block.minecraft.bed.occupied"), true);
            }

            return bqp.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqp.a;
         }
      }
   }

   public static boolean a(dbt $$0) {
      return $$0.D_().l();
   }

   private boolean a(dbt $$0, iz $$1) {
      List<cmf> $$2 = $$0.a(cmf.class, new evh($$1), btk::fL);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fM();
         return true;
      }
   }

   @Override
   public void a(dbt $$0, drx $$1, iz $$2, bsp $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(daz $$0, bsp $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsp $$0) {
      evm $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btk ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dew.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static je a(dsk $$0, je $$1) {
      return $$0 == dsk.b ? $$1 : $$1.g();
   }

   @Override
   public drx a(dbt $$0, iz $$1, drx $$2, cms $$3) {
      if (!$$0.B && $$3.f()) {
         dsk $$4 = $$2.c(b);
         if ($$4 == dsk.b) {
            iz $$5 = $$1.a(a($$4, $$2.c(aE)));
            drx $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dsk.a) {
               $$0.a($$5, dew.a.n(), 35);
               $$0.a($$3, 2001, $$5, deu.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public drx a(cxv $$0) {
      je $$1 = $$0.g();
      iz $$2 = $$0.a();
      iz $$3 = $$2.a($$1);
      dbt $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.n().a(aE, $$1) : null;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      je $$4 = g($$0).g();
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

   public static je g(drx $$0) {
      je $$1 = $$0.c(aE);
      return $$0.c(b) == dsk.a ? $$1.g() : $$1;
   }

   public static dhb.a h(drx $$0) {
      dsk $$1 = $$0.c(b);
      return $$1 == dsk.a ? dhb.a.b : dhb.a.c;
   }

   private static boolean b(daz $$0, iz $$1) {
      return $$0.a_($$1.d()).b() instanceof den;
   }

   public static Optional<evm> a(bsv<?> $$0, dbd $$1, iz $$2, je $$3, float $$4) {
      je $$5 = $$3.h();
      je $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<evm> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<evm> a(bsv<?> $$0, dbd $$1, iz $$2, je $$3, je $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<evm> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iz $$7 = $$2.d();
         Optional<evm> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<evm> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<evm> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<evm> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<evm> a(bsv<?> $$0, dbd $$1, iz $$2, int[][] $$3, boolean $$4) {
      iz.a $$5 = new iz.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         evm $$7 = cot.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.b;
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new doy($$0, $$1, this.o);
   }

   @Override
   public void a(dbt $$0, iz $$1, drx $$2, @Nullable btk $$3, cuk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         iz $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dsk.a), 3);
         $$0.b($$1, dew.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public ctd b() {
      return this.o;
   }

   @Override
   protected long a(drx $$0, iz $$1) {
      iz $$2 = $$1.a($$0.c(aE), $$0.c(b) == dsk.a ? 0 : 1);
      return ayu.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }

   private static int[][] a(je $$0, je $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(je $$0, je $$1) {
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

   private static int[][] a(je $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
