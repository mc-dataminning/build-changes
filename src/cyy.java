import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cyy extends dda implements dbx {
   public static final MapCodec<cyy> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cog.q.fieldOf("color").forGetter(cyy::b), u()).apply($$0, cyy::new));
   public static final dnc<dmr> b = dmu.bb;
   public static final dmv c = dmu.t;
   protected static final int d = 9;
   protected static final epo e = czf.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final epo f = czf.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final epo g = czf.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final epo h = czf.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final epo i = czf.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final epo j = epl.a(e, f, h);
   protected static final epo k = epl.a(e, g, i);
   protected static final epo l = epl.a(e, f, g);
   protected static final epo m = epl.a(e, h, i);
   private final cog o;

   @Override
   public MapCodec<cyy> a() {
      return a;
   }

   public cyy(cog $$0, dmd.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dmr.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ih a(cvk $$0, ib $$1) {
      dme $$2 = $$0.a_($$1);
      return $$2.b() instanceof cyy ? $$2.c(aE) : null;
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.B) {
         return bml.b;
      } else {
         if ($$0.c(b) != dmr.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bml.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ib $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            eov $$6 = $$2.b();
            $$1.a(null, $$1.ah().a($$6), null, $$6, 5.0F, true, cwe.a.b);
            return bml.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(vs.c("block.minecraft.bed.occupied"), true);
            }

            return bml.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bml.a;
         }
      }
   }

   public static boolean a(cwe $$0) {
      return $$0.E_().l();
   }

   private boolean a(cwe $$0, ib $$1) {
      List<chn> $$2 = $$0.a(chn.class, new eoq($$1), box::fF);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fG();
         return true;
      }
   }

   @Override
   public void a(cwe $$0, dme $$1, ib $$2, bof $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cvk $$0, bof $$1) {
      if ($$1.bR()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bof $$0) {
      eov $$1 = $$0.dm();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof box ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : czh.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ih a(dmr $$0, ih $$1) {
      return $$0 == dmr.b ? $$1 : $$1.g();
   }

   @Override
   public dme a(cwe $$0, ib $$1, dme $$2, cia $$3) {
      if (!$$0.B && $$3.f()) {
         dmr $$4 = $$2.c(b);
         if ($$4 == dmr.b) {
            ib $$5 = $$1.a(a($$4, $$2.c(aE)));
            dme $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dmr.a) {
               $$0.a($$5, czh.a.o(), 35);
               $$0.a($$3, 2001, $$5, czf.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      ih $$1 = $$0.g();
      ib $$2 = $$0.a();
      ib $$3 = $$2.a($$1);
      cwe $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.D_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
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

   public static ih g(dme $$0) {
      ih $$1 = $$0.c(aE);
      return $$0.c(b) == dmr.a ? $$1.g() : $$1;
   }

   public static dbm.a h(dme $$0) {
      dmr $$1 = $$0.c(b);
      return $$1 == dmr.a ? dbm.a.b : dbm.a.c;
   }

   private static boolean b(cvk $$0, ib $$1) {
      return $$0.a_($$1.d()).b() instanceof cyy;
   }

   public static Optional<eov> a(bol<?> $$0, cvo $$1, ib $$2, ih $$3, float $$4) {
      ih $$5 = $$3.h();
      ih $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<eov> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<eov> a(bol<?> $$0, cvo $$1, ib $$2, ih $$3, ih $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<eov> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ib $$7 = $$2.d();
         Optional<eov> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<eov> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<eov> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<eov> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<eov> a(bol<?> $$0, cvo $$1, ib $$2, int[][] $$3, boolean $$4) {
      ib.a $$5 = new ib.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         eov $$7 = cjy.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.b;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new djh($$0, $$1, this.o);
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, @Nullable box $$3, cpq $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         ib $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dmr.a), 3);
         $$0.b($$1, czh.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cog b() {
      return this.o;
   }

   @Override
   protected long a(dme $$0, ib $$1) {
      ib $$2 = $$1.a($$0.c(aE), $$0.c(b) == dmr.a ? 0 : 1);
      return awm.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
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
