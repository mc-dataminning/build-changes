import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dlt extends dqa implements dot {
   public static final MapCodec<dlt> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cxw.q.fieldOf("color").forGetter(dlt::b), t()).apply($$0, dlt::new));
   public static final eax<eam> b = eap.be;
   public static final eaq c = eap.x;
   private static final Map<ja, ffc> d = af.a(() -> {
      ffc $$0 = dma.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
      ffc $$1 = fez.a($$0, h.a(0, 90));
      return fez.c(fez.a(dma.b(16.0, 3.0, 9.0), $$0, $$1));
   });
   private final cxw f;

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   public dlt(cxw $$0, dzy.d $$1) {
      super($$1);
      this.f = $$0;
      this.l(this.B.b().b(b, eam.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ja a(dib $$0, iu $$1) {
      dzz $$2 = $$0.a_($$1);
      return $$2.b() instanceof dlt ? $$2.c(e) : null;
   }

   @Override
   protected bub a(dzz $$0, div $$1, iu $$2, cqy $$3, fee $$4) {
      if ($$1.C) {
         return bub.b;
      } else {
         if ($$0.c(b) != eam.a) {
            $$2 = $$2.a($$0.c(e));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bub.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iu $$5 = $$2.a($$0.c(e).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fei $$6 = $$2.b();
            $$1.a(null, $$1.al().a($$6), null, $$6, 5.0F, true, div.a.b);
            return bub.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wy.c("block.minecraft.bed.occupied"), true);
            }

            return bub.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bub.b;
         }
      }
   }

   public static boolean a(div $$0) {
      return $$0.B_().l();
   }

   private boolean a(div $$0, iu $$1) {
      List<cqk> $$2 = $$0.a(cqk.class, new fed($$1), bxc::fQ);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fR();
         return true;
      }
   }

   @Override
   public void a(div $$0, dzz $$1, iu $$2, bwd $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5);
   }

   @Override
   public void a(dib $$0, bwd $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bwd $$0) {
      fei $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bxc ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4 == a($$0.c(b), $$0.c(e))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dmc.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static ja a(eam $$0, ja $$1) {
      return $$0 == eam.b ? $$1 : $$1.g();
   }

   @Override
   public dzz a(div $$0, iu $$1, dzz $$2, cqy $$3) {
      if (!$$0.C && $$3.gk()) {
         eam $$4 = $$2.c(b);
         if ($$4 == eam.b) {
            iu $$5 = $$1.a(a($$4, $$2.c(e)));
            dzz $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == eam.a) {
               $$0.a($$5, dmc.a.m(), 35);
               $$0.a($$3, 2001, $$5, dma.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      ja $$1 = $$0.g();
      iu $$2 = $$0.a();
      iu $$3 = $$2.a($$1);
      div $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.A_().a($$3) ? this.m().b(e, $$1) : null;
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return d.get(h($$0).g());
   }

   public static ja h(dzz $$0) {
      ja $$1 = $$0.c(e);
      return $$0.c(b) == eam.a ? $$1.g() : $$1;
   }

   public static doi.a i(dzz $$0) {
      eam $$1 = $$0.c(b);
      return $$1 == eam.a ? doi.a.b : doi.a.c;
   }

   private static boolean b(dib $$0, iu $$1) {
      return $$0.a_($$1.e()).b() instanceof dlt;
   }

   public static Optional<fei> a(bwm<?> $$0, dif $$1, iu $$2, ja $$3, float $$4) {
      ja $$5 = $$3.h();
      ja $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fei> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fei> a(bwm<?> $$0, dif $$1, iu $$2, ja $$3, ja $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fei> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iu $$7 = $$2.e();
         Optional<fei> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fei> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fei> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fei> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fei> a(bwm<?> $$0, dif $$1, iu $$2, int[][] $$3, boolean $$4) {
      iu.a $$5 = new iu.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fei $$7 = ctq.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(e, b, c);
   }

   @Override
   public dwx a(iu $$0, dzz $$1) {
      return new dwt($$0, $$1, this.f);
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, @Nullable bxc $$3, cyy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         iu $$5 = $$1.a($$2.c(e));
         $$0.a($$5, $$2.b(b, eam.a), 3);
         $$0.a($$1, dmc.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cxw b() {
      return this.f;
   }

   @Override
   protected long a(dzz $$0, iu $$1) {
      iu $$2 = $$1.a($$0.c(e), $$0.c(b) == eam.a ? 0 : 1);
      return azm.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dzz $$0, ewv $$1) {
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
