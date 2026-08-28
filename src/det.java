import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class det extends diw implements dhs {
   public static final MapCodec<det> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ctj.q.fieldOf("color").forGetter(det::b), u()).apply($$0, det::new));
   public static final dtb<dsq> b = dst.bb;
   public static final dsu c = dst.t;
   protected static final int d = 9;
   protected static final ewl e = dfa.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ewl f = dfa.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ewl g = dfa.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ewl h = dfa.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ewl i = dfa.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ewl j = ewi.a(e, f, h);
   protected static final ewl k = ewi.a(e, g, i);
   protected static final ewl l = ewi.a(e, f, g);
   protected static final ewl m = ewi.a(e, h, i);
   private final ctj o;

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public det(ctj $$0, dsc.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dsq.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static je a(dbf $$0, iz $$1) {
      dsd $$2 = $$0.a_($$1);
      return $$2.b() instanceof det ? $$2.c(aE) : null;
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.c;
      } else {
         if ($$0.c(b) != dsq.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bqv.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iz $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            evs $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dbz.a.b);
            return bqv.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xp.c("block.minecraft.bed.occupied"), true);
            }

            return bqv.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bqv.a;
         }
      }
   }

   public static boolean a(dbz $$0) {
      return $$0.D_().l();
   }

   private boolean a(dbz $$0, iz $$1) {
      List<cml> $$2 = $$0.a(cml.class, new evn($$1), btq::fL);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fM();
         return true;
      }
   }

   @Override
   public void a(dbz $$0, dsd $$1, iz $$2, bsv $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dbf $$0, bsv $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bsv $$0) {
      evs $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof btq ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dfc.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static je a(dsq $$0, je $$1) {
      return $$0 == dsq.b ? $$1 : $$1.g();
   }

   @Override
   public dsd a(dbz $$0, iz $$1, dsd $$2, cmy $$3) {
      if (!$$0.B && $$3.f()) {
         dsq $$4 = $$2.c(b);
         if ($$4 == dsq.b) {
            iz $$5 = $$1.a(a($$4, $$2.c(aE)));
            dsd $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dsq.a) {
               $$0.a($$5, dfc.a.o(), 35);
               $$0.a($$3, 2001, $$5, dfa.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      je $$1 = $$0.g();
      iz $$2 = $$0.a();
      iz $$3 = $$2.a($$1);
      dbz $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
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

   public static je g(dsd $$0) {
      je $$1 = $$0.c(aE);
      return $$0.c(b) == dsq.a ? $$1.g() : $$1;
   }

   public static dhh.a h(dsd $$0) {
      dsq $$1 = $$0.c(b);
      return $$1 == dsq.a ? dhh.a.b : dhh.a.c;
   }

   private static boolean b(dbf $$0, iz $$1) {
      return $$0.a_($$1.d()).b() instanceof det;
   }

   public static Optional<evs> a(btb<?> $$0, dbj $$1, iz $$2, je $$3, float $$4) {
      je $$5 = $$3.h();
      je $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<evs> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<evs> a(btb<?> $$0, dbj $$1, iz $$2, je $$3, je $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<evs> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iz $$7 = $$2.d();
         Optional<evs> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<evs> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<evs> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<evs> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<evs> a(btb<?> $$0, dbj $$1, iz $$2, int[][] $$3, boolean $$4) {
      iz.a $$5 = new iz.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         evs $$7 = coz.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dlg a_(dsd $$0) {
      return dlg.b;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dpi a(iz $$0, dsd $$1) {
      return new dpe($$0, $$1, this.o);
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, @Nullable btq $$3, cuq $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         iz $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dsq.a), 3);
         $$0.b($$1, dfc.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public ctj b() {
      return this.o;
   }

   @Override
   protected long a(dsd $$0, iz $$1) {
      iz $$2 = $$1.a($$0.c(aE), $$0.c(b) == dsq.a ? 0 : 1);
      return ayz.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
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
