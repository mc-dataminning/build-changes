import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dln extends dpt implements don {
   public static final MapCodec<dln> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxq.q.fieldOf("color").forGetter(dln::b), t()).apply($$0, dln::new));
   public static final eam<eab> b = eae.be;
   public static final eaf c = eae.x;
   private static final Map<ja, feq> d = af.a(() -> {
      feq $$0 = dlu.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
      feq $$1 = fen.a($$0, h.a(0, 90));
      return fen.c(fen.a(dlu.b(16.0, 3.0, 9.0), $$0, $$1));
   });
   private final cxq f;

   @Override
   public MapCodec<dln> a() {
      return a;
   }

   public dln(cxq $$0, dzn.d $$1) {
      super($$1);
      this.f = $$0;
      this.l(this.B.b().b(b, eab.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ja a(dhv $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      return $$2.b() instanceof dln ? $$2.c(e) : null;
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      if ($$1.C) {
         return bty.b;
      } else {
         if ($$0.c(b) != eab.a) {
            $$2 = $$2.a($$0.c(e));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bty.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iu $$5 = $$2.a($$0.c(e).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fdw $$6 = $$2.b();
            $$1.a(null, $$1.al().a($$6), null, $$6, 5.0F, true, dip.a.b);
            return bty.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(ww.c("block.minecraft.bed.occupied"), true);
            }

            return bty.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bty.b;
         }
      }
   }

   public static boolean a(dip $$0) {
      return $$0.B_().l();
   }

   private boolean a(dip $$0, iu $$1) {
      List<cqe> $$2 = $$0.a(cqe.class, new fdr($$1), bwz::fQ);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fR();
         return true;
      }
   }

   @Override
   public void a(dip $$0, dzo $$1, iu $$2, bwa $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5);
   }

   @Override
   public void a(dhv $$0, bwa $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bwa $$0) {
      fdw $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bwz ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$4 == a($$0.c(b), $$0.c(e))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dlw.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static ja a(eab $$0, ja $$1) {
      return $$0 == eab.b ? $$1 : $$1.g();
   }

   @Override
   public dzo a(dip $$0, iu $$1, dzo $$2, cqs $$3) {
      if (!$$0.C && $$3.gk()) {
         eab $$4 = $$2.c(b);
         if ($$4 == eab.b) {
            iu $$5 = $$1.a(a($$4, $$2.c(e)));
            dzo $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == eab.a) {
               $$0.a($$5, dlw.a.m(), 35);
               $$0.a($$3, 2001, $$5, dlu.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      ja $$1 = $$0.g();
      iu $$2 = $$0.a();
      iu $$3 = $$2.a($$1);
      dip $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.A_().a($$3) ? this.m().b(e, $$1) : null;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d.get(h($$0).g());
   }

   public static ja h(dzo $$0) {
      ja $$1 = $$0.c(e);
      return $$0.c(b) == eab.a ? $$1.g() : $$1;
   }

   public static doc.a i(dzo $$0) {
      eab $$1 = $$0.c(b);
      return $$1 == eab.a ? doc.a.b : doc.a.c;
   }

   private static boolean b(dhv $$0, iu $$1) {
      return $$0.a_($$1.e()).b() instanceof dln;
   }

   public static Optional<fdw> a(bwj<?> $$0, dhz $$1, iu $$2, ja $$3, float $$4) {
      ja $$5 = $$3.h();
      ja $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fdw> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fdw> a(bwj<?> $$0, dhz $$1, iu $$2, ja $$3, ja $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fdw> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iu $$7 = $$2.e();
         Optional<fdw> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fdw> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fdw> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fdw> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fdw> a(bwj<?> $$0, dhz $$1, iu $$2, int[][] $$3, boolean $$4) {
      iu.a $$5 = new iu.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fdw $$7 = ctk.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(e, b, c);
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dwj($$0, $$1, this.f);
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, @Nullable bwz $$3, cys $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         iu $$5 = $$1.a($$2.c(e));
         $$0.a($$5, $$2.b(b, eab.a), 3);
         $$0.a($$1, dlw.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cxq b() {
      return this.f;
   }

   @Override
   protected long a(dzo $$0, iu $$1) {
      iu $$2 = $$1.a($$0.c(e), $$0.c(b) == eab.a ? 0 : 1);
      return azk.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   private static int[][] a(ja $$0, ja $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ja $$0, ja $$1) {
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

   private static int[][] a(ja $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
