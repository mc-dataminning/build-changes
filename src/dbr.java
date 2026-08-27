import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dbr extends dft implements deq {
   public static final MapCodec<dbr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqc.q.fieldOf("color").forGetter(dbr::b), u()).apply($$0, dbr::new));
   public static final dpx<dpm> b = dpp.bb;
   public static final dpq c = dpp.t;
   protected static final int d = 9;
   protected static final est e = dby.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final est f = dby.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final est g = dby.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final est h = dby.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final est i = dby.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final est j = esq.a(e, f, h);
   protected static final est k = esq.a(e, g, i);
   protected static final est l = esq.a(e, f, g);
   protected static final est m = esq.a(e, h, i);
   private final cqc o;

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   public dbr(cqc $$0, doy.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dpm.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ih a(cyd $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      return $$2.b() instanceof dbr ? $$2.c(aE) : null;
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.b;
      } else {
         if ($$0.c(b) != dpm.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return boa.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ib $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            esa $$6 = $$2.b();
            $$1.a(null, $$1.ai().a($$6), null, $$6, 5.0F, true, cyx.a.b);
            return boa.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wg.c("block.minecraft.bed.occupied"), true);
            }

            return boa.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return boa.a;
         }
      }
   }

   public static boolean a(cyx $$0) {
      return $$0.D_().l();
   }

   private boolean a(cyx $$0, ib $$1) {
      List<cjg> $$2 = $$0.a(cjg.class, new erv($$1), bqo::fI);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fJ();
         return true;
      }
   }

   @Override
   public void a(cyx $$0, doz $$1, ib $$2, bpv $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cyd $$0, bpv $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bpv $$0) {
      esa $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bqo ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dca.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ih a(dpm $$0, ih $$1) {
      return $$0 == dpm.b ? $$1 : $$1.g();
   }

   @Override
   public doz a(cyx $$0, ib $$1, doz $$2, cjt $$3) {
      if (!$$0.B && $$3.f()) {
         dpm $$4 = $$2.c(b);
         if ($$4 == dpm.b) {
            ib $$5 = $$1.a(a($$4, $$2.c(aE)));
            doz $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dpm.a) {
               $$0.a($$5, dca.a.n(), 35);
               $$0.a($$3, 2001, $$5, dby.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      ih $$1 = $$0.g();
      ib $$2 = $$0.a();
      ib $$3 = $$2.a($$1);
      cyx $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.n().a(aE, $$1) : null;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      ih $$4 = g($$0).g();
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

   public static ih g(doz $$0) {
      ih $$1 = $$0.c(aE);
      return $$0.c(b) == dpm.a ? $$1.g() : $$1;
   }

   public static def.a h(doz $$0) {
      dpm $$1 = $$0.c(b);
      return $$1 == dpm.a ? def.a.b : def.a.c;
   }

   private static boolean b(cyd $$0, ib $$1) {
      return $$0.a_($$1.d()).b() instanceof dbr;
   }

   public static Optional<esa> a(bqb<?> $$0, cyh $$1, ib $$2, ih $$3, float $$4) {
      ih $$5 = $$3.h();
      ih $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<esa> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<esa> a(bqb<?> $$0, cyh $$1, ib $$2, ih $$3, ih $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<esa> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ib $$7 = $$2.d();
         Optional<esa> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<esa> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<esa> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<esa> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<esa> a(bqb<?> $$0, cyh $$1, ib $$2, int[][] $$3, boolean $$4) {
      ib.a $$5 = new ib.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         esa $$7 = clt.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected did b_(doz $$0) {
      return did.b;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dmb($$0, $$1, this.o);
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, @Nullable bqo $$3, crj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         ib $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dpm.a), 3);
         $$0.b($$1, dca.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cqc b() {
      return this.o;
   }

   @Override
   protected long a(doz $$0, ib $$1) {
      ib $$2 = $$1.a($$0.c(aE), $$0.c(b) == dpm.a ? 0 : 1);
      return axk.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }

   private static int[][] a(ih $$0, ih $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ih $$0, ih $$1) {
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

   private static int[][] a(ih $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
