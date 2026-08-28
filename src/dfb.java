import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dfb extends dje implements dia {
   public static final MapCodec<dfb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csw.q.fieldOf("color").forGetter(dfb::b), u()).apply($$0, dfb::new));
   public static final dtj<dsy> b = dtb.bb;
   public static final dtc c = dtb.t;
   protected static final int d = 9;
   protected static final exa e = dfi.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final exa f = dfi.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final exa g = dfi.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final exa h = dfi.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final exa i = dfi.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final exa j = ewx.a(e, f, h);
   protected static final exa k = ewx.a(e, g, i);
   protected static final exa l = ewx.a(e, f, g);
   protected static final exa m = ewx.a(e, h, i);
   private final csw o;

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public dfb(csw $$0, dsk.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dsy.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jf a(dbm $$0, ja $$1) {
      dsl $$2 = $$0.a_($$1);
      return $$2.b() instanceof dfb ? $$2.c(aE) : null;
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.c;
      } else {
         if ($$0.c(b) != dsy.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqh.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ja $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ewh $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dcg.a.b);
            return bqh.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wu.c("block.minecraft.bed.occupied"), true);
            }

            return bqh.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqh.a;
         }
      }
   }

   public static boolean a(dcg $$0) {
      return $$0.D_().l();
   }

   private boolean a(dcg $$0, ja $$1) {
      List<cly> $$2 = $$0.a(cly.class, new ewc($$1), btc::fJ);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fK();
         return true;
      }
   }

   @Override
   public void a(dcg $$0, dsl $$1, ja $$2, bsh $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dbm $$0, bsh $$1) {
      if ($$1.bZ()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsh $$0) {
      ewh $$1 = $$0.du();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btc ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dfk.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static jf a(dsy $$0, jf $$1) {
      return $$0 == dsy.b ? $$1 : $$1.g();
   }

   @Override
   public dsl a(dcg $$0, ja $$1, dsl $$2, cml $$3) {
      if (!$$0.B && $$3.f()) {
         dsy $$4 = $$2.c(b);
         if ($$4 == dsy.b) {
            ja $$5 = $$1.a(a($$4, $$2.c(aE)));
            dsl $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dsy.a) {
               $$0.a($$5, dfk.a.o(), 35);
               $$0.a($$3, 2001, $$5, dfi.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      jf $$1 = $$0.g();
      ja $$2 = $$0.a();
      ja $$3 = $$2.a($$1);
      dcg $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
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

   public static jf g(dsl $$0) {
      jf $$1 = $$0.c(aE);
      return $$0.c(b) == dsy.a ? $$1.g() : $$1;
   }

   public static dhp.a h(dsl $$0) {
      dsy $$1 = $$0.c(b);
      return $$1 == dsy.a ? dhp.a.b : dhp.a.c;
   }

   private static boolean b(dbm $$0, ja $$1) {
      return $$0.a_($$1.d()).b() instanceof dfb;
   }

   public static Optional<ewh> a(bsn<?> $$0, dbq $$1, ja $$2, jf $$3, float $$4) {
      jf $$5 = $$3.h();
      jf $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ewh> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ewh> a(bsn<?> $$0, dbq $$1, ja $$2, jf $$3, jf $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ewh> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ja $$7 = $$2.d();
         Optional<ewh> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ewh> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ewh> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ewh> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ewh> a(bsn<?> $$0, dbq $$1, ja $$2, int[][] $$3, boolean $$4) {
      ja.a $$5 = new ja.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ewh $$7 = col.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.b;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dpm($$0, $$1, this.o);
   }

   @Override
   public void a(dcg $$0, ja $$1, dsl $$2, @Nullable btc $$3, cud $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         ja $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dsy.a), 3);
         $$0.b($$1, dfk.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public csw b() {
      return this.o;
   }

   @Override
   protected long a(dsl $$0, ja $$1) {
      ja $$2 = $$1.a($$0.c(aE), $$0.c(b) == dsy.a ? 0 : 1);
      return ayg.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
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
