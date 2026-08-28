import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class der extends diu implements dhq {
   public static final MapCodec<der> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cth.q.fieldOf("color").forGetter(der::b), u()).apply($$0, der::new));
   public static final dsz<dso> b = dsr.bb;
   public static final dss c = dsr.t;
   protected static final int d = 9;
   protected static final ewj e = dey.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ewj f = dey.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ewj g = dey.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ewj h = dey.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ewj i = dey.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ewj j = ewg.a(e, f, h);
   protected static final ewj k = ewg.a(e, g, i);
   protected static final ewj l = ewg.a(e, f, g);
   protected static final ewj m = ewg.a(e, h, i);
   private final cth o;

   @Override
   public MapCodec<der> a() {
      return a;
   }

   public der(cth $$0, dsa.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dso.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static je a(dbd $$0, iz $$1) {
      dsb $$2 = $$0.a_($$1);
      return $$2.b() instanceof der ? $$2.c(aE) : null;
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.c;
      } else {
         if ($$0.c(b) != dso.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqt.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iz $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            evq $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dbx.a.b);
            return bqt.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xo.c("block.minecraft.bed.occupied"), true);
            }

            return bqt.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqt.a;
         }
      }
   }

   public static boolean a(dbx $$0) {
      return $$0.D_().l();
   }

   private boolean a(dbx $$0, iz $$1) {
      List<cmj> $$2 = $$0.a(cmj.class, new evl($$1), bto::fL);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fM();
         return true;
      }
   }

   @Override
   public void a(dbx $$0, dsb $$1, iz $$2, bst $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dbd $$0, bst $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bst $$0) {
      evq $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bto ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dfa.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static je a(dso $$0, je $$1) {
      return $$0 == dso.b ? $$1 : $$1.g();
   }

   @Override
   public dsb a(dbx $$0, iz $$1, dsb $$2, cmw $$3) {
      if (!$$0.B && $$3.f()) {
         dso $$4 = $$2.c(b);
         if ($$4 == dso.b) {
            iz $$5 = $$1.a(a($$4, $$2.c(aE)));
            dsb $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dso.a) {
               $$0.a($$5, dfa.a.o(), 35);
               $$0.a($$3, 2001, $$5, dey.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dsb a(cxz $$0) {
      je $$1 = $$0.g();
      iz $$2 = $$0.a();
      iz $$3 = $$2.a($$1);
      dbx $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
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

   public static je g(dsb $$0) {
      je $$1 = $$0.c(aE);
      return $$0.c(b) == dso.a ? $$1.g() : $$1;
   }

   public static dhf.a h(dsb $$0) {
      dso $$1 = $$0.c(b);
      return $$1 == dso.a ? dhf.a.b : dhf.a.c;
   }

   private static boolean b(dbd $$0, iz $$1) {
      return $$0.a_($$1.d()).b() instanceof der;
   }

   public static Optional<evq> a(bsz<?> $$0, dbh $$1, iz $$2, je $$3, float $$4) {
      je $$5 = $$3.h();
      je $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<evq> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<evq> a(bsz<?> $$0, dbh $$1, iz $$2, je $$3, je $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<evq> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iz $$7 = $$2.d();
         Optional<evq> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<evq> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<evq> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<evq> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<evq> a(bsz<?> $$0, dbh $$1, iz $$2, int[][] $$3, boolean $$4) {
      iz.a $$5 = new iz.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         evq $$7 = cox.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.b;
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dpc($$0, $$1, this.o);
   }

   @Override
   public void a(dbx $$0, iz $$1, dsb $$2, @Nullable bto $$3, cuo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         iz $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dso.a), 3);
         $$0.b($$1, dfa.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cth b() {
      return this.o;
   }

   @Override
   protected long a(dsb $$0, iz $$1) {
      iz $$2 = $$1.a($$0.c(aE), $$0.c(b) == dso.a ? 0 : 1);
      return ayy.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
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
