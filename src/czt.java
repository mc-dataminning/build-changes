import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class czt extends ddv implements dcs {
   public static final MapCodec<czt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cpb.q.fieldOf("color").forGetter(czt::b), u()).apply($$0, czt::new));
   public static final dnx<dnm> b = dnp.bb;
   public static final dnq c = dnp.t;
   protected static final int d = 9;
   protected static final eqk e = daa.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final eqk f = daa.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eqk g = daa.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eqk h = daa.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eqk i = daa.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eqk j = eqh.a(e, f, h);
   protected static final eqk k = eqh.a(e, g, i);
   protected static final eqk l = eqh.a(e, f, g);
   protected static final eqk m = eqh.a(e, h, i);
   private final cpb o;

   @Override
   public MapCodec<czt> a() {
      return a;
   }

   public czt(cpb $$0, dmy.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dnm.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ih a(cwf $$0, ib $$1) {
      dmz $$2 = $$0.a_($$1);
      return $$2.b() instanceof czt ? $$2.c(aE) : null;
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.B) {
         return bnc.b;
      } else {
         if ($$0.c(b) != dnm.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bnc.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ib $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            epr $$6 = $$2.b();
            $$1.a(null, $$1.ah().a($$6), null, $$6, 5.0F, true, cwz.a.b);
            return bnc.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(vu.c("block.minecraft.bed.occupied"), true);
            }

            return bnc.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bnc.a;
         }
      }
   }

   public static boolean a(cwz $$0) {
      return $$0.D_().l();
   }

   private boolean a(cwz $$0, ib $$1) {
      List<cif> $$2 = $$0.a(cif.class, new epm($$1), bpo::fI);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fJ();
         return true;
      }
   }

   @Override
   public void a(cwz $$0, dmz $$1, ib $$2, bow $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cwf $$0, bow $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bow $$0) {
      epr $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bpo ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dac.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ih a(dnm $$0, ih $$1) {
      return $$0 == dnm.b ? $$1 : $$1.g();
   }

   @Override
   public dmz a(cwz $$0, ib $$1, dmz $$2, cis $$3) {
      if (!$$0.B && $$3.f()) {
         dnm $$4 = $$2.c(b);
         if ($$4 == dnm.b) {
            ib $$5 = $$1.a(a($$4, $$2.c(aE)));
            dmz $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dnm.a) {
               $$0.a($$5, dac.a.o(), 35);
               $$0.a($$3, 2001, $$5, daa.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      ih $$1 = $$0.g();
      ib $$2 = $$0.a();
      ib $$3 = $$2.a($$1);
      cwz $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
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

   public static ih g(dmz $$0) {
      ih $$1 = $$0.c(aE);
      return $$0.c(b) == dnm.a ? $$1.g() : $$1;
   }

   public static dch.a h(dmz $$0) {
      dnm $$1 = $$0.c(b);
      return $$1 == dnm.a ? dch.a.b : dch.a.c;
   }

   private static boolean b(cwf $$0, ib $$1) {
      return $$0.a_($$1.d()).b() instanceof czt;
   }

   public static Optional<epr> a(bpc<?> $$0, cwj $$1, ib $$2, ih $$3, float $$4) {
      ih $$5 = $$3.h();
      ih $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<epr> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<epr> a(bpc<?> $$0, cwj $$1, ib $$2, ih $$3, ih $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<epr> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ib $$7 = $$2.d();
         Optional<epr> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<epr> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<epr> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<epr> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<epr> a(bpc<?> $$0, cwj $$1, ib $$2, int[][] $$3, boolean $$4) {
      ib.a $$5 = new ib.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         epr $$7 = cks.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dgf b_(dmz $$0) {
      return dgf.b;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dkc($$0, $$1, this.o);
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, @Nullable bpo $$3, cqk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         ib $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dnm.a), 3);
         $$0.b($$1, dac.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cpb b() {
      return this.o;
   }

   @Override
   protected long a(dmz $$0, ib $$1) {
      ib $$2 = $$1.a($$0.c(aE), $$0.c(b) == dnm.a ? 0 : 1);
      return aww.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
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
