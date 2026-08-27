import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class csv extends cww implements cvs {
   public static final MapCodec<csv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(chz.q.fieldOf("color").forGetter(csv::b), t()).apply($$0, csv::new));
   public static final dgb<dfq> b = dft.bb;
   public static final dfu c = dft.t;
   protected static final int d = 9;
   protected static final eia e = ctc.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final eia f = ctc.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eia g = ctc.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eia h = ctc.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eia i = ctc.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eia j = ehx.a(e, f, h);
   protected static final eia k = ehx.a(e, g, i);
   protected static final eia l = ehx.a(e, f, g);
   protected static final eia m = ehx.a(e, h, i);
   private final chz o;

   @Override
   public MapCodec<csv> a() {
      return a;
   }

   public csv(chz $$0, dfc.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dfq.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ha a(cph $$0, gw $$1) {
      dfd $$2 = $$0.a_($$1);
      return $$2.b() instanceof csv ? $$2.c(aE) : null;
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      if ($$1.B) {
         return bhe.b;
      } else {
         if ($$0.c(b) != dfq.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bhe.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            gw $$6 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            ehh $$7 = $$2.b();
            $$1.a(null, $$1.ag().a($$7), null, $$7, 5.0F, true, cqb.a.b);
            return bhe.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(tl.c("block.minecraft.bed.occupied"), true);
            }

            return bhe.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bhe.a;
         }
      }
   }

   public static boolean a(cqb $$0) {
      return $$0.C_().l();
   }

   private boolean a(cqb $$0, gw $$1) {
      List<cbn> $$2 = $$0.a(cbn.class, new ehc($$1), bjm::fD);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fE();
         return true;
      }
   }

   @Override
   public void a(cqb $$0, dfd $$1, gw $$2, biw $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cph $$0, biw $$1) {
      if ($$1.bT()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(biw $$0) {
      ehh $$1 = $$0.do();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bjm ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cte.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ha a(dfq $$0, ha $$1) {
      return $$0 == dfq.b ? $$1 : $$1.g();
   }

   @Override
   public dfd a(cqb $$0, gw $$1, dfd $$2, cca $$3) {
      if (!$$0.B && $$3.f()) {
         dfq $$4 = $$2.c(b);
         if ($$4 == dfq.b) {
            gw $$5 = $$1.a(a($$4, $$2.c(aE)));
            dfd $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dfq.a) {
               $$0.a($$5, cte.a.o(), 35);
               $$0.a($$3, 2001, $$5, ctc.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      ha $$1 = $$0.g();
      gw $$2 = $$0.a();
      gw $$3 = $$2.a($$1);
      cqb $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.B_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      ha $$4 = g($$0).g();
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

   public static ha g(dfd $$0) {
      ha $$1 = $$0.c(aE);
      return $$0.c(b) == dfq.a ? $$1.g() : $$1;
   }

   public static cvh.a h(dfd $$0) {
      dfq $$1 = $$0.c(b);
      return $$1 == dfq.a ? cvh.a.b : cvh.a.c;
   }

   private static boolean b(cph $$0, gw $$1) {
      return $$0.a_($$1.d()).b() instanceof csv;
   }

   public static Optional<ehh> a(bja<?> $$0, cpl $$1, gw $$2, ha $$3, float $$4) {
      ha $$5 = $$3.h();
      ha $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ehh> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ehh> a(bja<?> $$0, cpl $$1, gw $$2, ha $$3, ha $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ehh> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         gw $$7 = $$2.d();
         Optional<ehh> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ehh> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ehh> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ehh> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ehh> a(bja<?> $$0, cpl $$1, gw $$2, int[][] $$3, boolean $$4) {
      gw.a $$5 = new gw.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ehh $$7 = cdw.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public czg b_(dfd $$0) {
      return czg.b;
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dcz a(gw $$0, dfd $$1) {
      return new dcv($$0, $$1, this.o);
   }

   @Override
   public void a(cqb $$0, gw $$1, dfd $$2, @Nullable bjm $$3, cjl $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         gw $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dfq.a), 3);
         $$0.b($$1, cte.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public chz b() {
      return this.o;
   }

   @Override
   public long a(dfd $$0, gw $$1) {
      gw $$2 = $$1.a($$0.c(aE), $$0.c(b) == dfq.a ? 0 : 1);
      return asb.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
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
