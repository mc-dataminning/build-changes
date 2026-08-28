import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class deu extends dix implements dht {
   public static final MapCodec<deu> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctk.q.fieldOf("color").forGetter(deu::b), u()).apply($$0, deu::new));
   public static final dtc<dsr> b = dsu.bb;
   public static final dsv c = dsu.t;
   protected static final int d = 9;
   protected static final ewm e = dfb.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ewm f = dfb.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ewm g = dfb.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ewm h = dfb.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ewm i = dfb.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ewm j = ewj.a(e, f, h);
   protected static final ewm k = ewj.a(e, g, i);
   protected static final ewm l = ewj.a(e, f, g);
   protected static final ewm m = ewj.a(e, h, i);
   private final ctk o;

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   public deu(ctk $$0, dsd.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dsr.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static je a(dbg $$0, iz $$1) {
      dse $$2 = $$0.a_($$1);
      return $$2.b() instanceof deu ? $$2.c(aE) : null;
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.c;
      } else {
         if ($$0.c(b) != dsr.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqw.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iz $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            evt $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dca.a.b);
            return bqw.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xp.c("block.minecraft.bed.occupied"), true);
            }

            return bqw.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqw.a;
         }
      }
   }

   public static boolean a(dca $$0) {
      return $$0.D_().l();
   }

   private boolean a(dca $$0, iz $$1) {
      List<cmm> $$2 = $$0.a(cmm.class, new evo($$1), btr::fL);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fM();
         return true;
      }
   }

   @Override
   public void a(dca $$0, dse $$1, iz $$2, bsw $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dbg $$0, bsw $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsw $$0) {
      evt $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btr ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dfd.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static je a(dsr $$0, je $$1) {
      return $$0 == dsr.b ? $$1 : $$1.g();
   }

   @Override
   public dse a(dca $$0, iz $$1, dse $$2, cmz $$3) {
      if (!$$0.B && $$3.f()) {
         dsr $$4 = $$2.c(b);
         if ($$4 == dsr.b) {
            iz $$5 = $$1.a(a($$4, $$2.c(aE)));
            dse $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dsr.a) {
               $$0.a($$5, dfd.a.o(), 35);
               $$0.a($$3, 2001, $$5, dfb.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      je $$1 = $$0.g();
      iz $$2 = $$0.a();
      iz $$3 = $$2.a($$1);
      dca $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
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

   public static je g(dse $$0) {
      je $$1 = $$0.c(aE);
      return $$0.c(b) == dsr.a ? $$1.g() : $$1;
   }

   public static dhi.a h(dse $$0) {
      dsr $$1 = $$0.c(b);
      return $$1 == dsr.a ? dhi.a.b : dhi.a.c;
   }

   private static boolean b(dbg $$0, iz $$1) {
      return $$0.a_($$1.d()).b() instanceof deu;
   }

   public static Optional<evt> a(btc<?> $$0, dbk $$1, iz $$2, je $$3, float $$4) {
      je $$5 = $$3.h();
      je $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<evt> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<evt> a(btc<?> $$0, dbk $$1, iz $$2, je $$3, je $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<evt> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iz $$7 = $$2.d();
         Optional<evt> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<evt> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<evt> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<evt> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<evt> a(btc<?> $$0, dbk $$1, iz $$2, int[][] $$3, boolean $$4) {
      iz.a $$5 = new iz.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         evt $$7 = cpa.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.b;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpf($$0, $$1, this.o);
   }

   @Override
   public void a(dca $$0, iz $$1, dse $$2, @Nullable btr $$3, cur $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         iz $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dsr.a), 3);
         $$0.b($$1, dfd.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public ctk b() {
      return this.o;
   }

   @Override
   protected long a(dse $$0, iz $$1) {
      iz $$2 = $$1.a($$0.c(aE), $$0.c(b) == dsr.a ? 0 : 1);
      return ayz.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
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
