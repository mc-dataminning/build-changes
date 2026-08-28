import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dly extends dqg implements doz {
   public static final MapCodec<dly> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyb.q.fieldOf("color").forGetter(dly::b), t()).apply($$0, dly::new));
   public static final ebf<eau> b = eax.be;
   public static final eay c = eax.x;
   private static final Map<ja, ffk> d = af.a(() -> {
      ffk $$0 = dmf.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
      ffk $$1 = ffh.a($$0, h.a(0, 90));
      return ffh.c(ffh.a(dmf.b(16.0, 3.0, 9.0), $$0, $$1));
   });
   private final cyb f;

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   public dly(cyb $$0, eag.d $$1) {
      super($$1);
      this.f = $$0;
      this.l(this.C.b().b(b, eau.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ja a(dig $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      return $$2.b() instanceof dly ? $$2.c(e) : null;
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if ($$1.C) {
         return bud.b;
      } else {
         if ($$0.c(b) != eau.a) {
            $$2 = $$2.a($$0.c(e));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bud.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            iu $$5 = $$2.a($$0.c(e).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            feq $$6 = $$2.b();
            $$1.a(null, $$1.al().a($$6), null, $$6, 5.0F, true, dja.a.b);
            return bud.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wy.c("block.minecraft.bed.occupied"), true);
            }

            return bud.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bud.b;
         }
      }
   }

   public static boolean a(dja $$0) {
      return $$0.B_().l();
   }

   private boolean a(dja $$0, iu $$1) {
      List<cqo> $$2 = $$0.a(cqo.class, new fel($$1), bxe::fR);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fS();
         return true;
      }
   }

   @Override
   public void a(dja $$0, eah $$1, iu $$2, bwf $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5);
   }

   @Override
   public void a(dig $$0, bwf $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bwf $$0) {
      feq $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bxe ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$4 == a($$0.c(b), $$0.c(e))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dmh.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static ja a(eau $$0, ja $$1) {
      return $$0 == eau.b ? $$1 : $$1.g();
   }

   @Override
   public eah a(dja $$0, iu $$1, eah $$2, crc $$3) {
      if (!$$0.C && $$3.gl()) {
         eau $$4 = $$2.c(b);
         if ($$4 == eau.b) {
            iu $$5 = $$1.a(a($$4, $$2.c(e)));
            eah $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == eau.a) {
               $$0.a($$5, dmh.a.m(), 35);
               $$0.a($$3, 2001, $$5, dmf.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      ja $$1 = $$0.g();
      iu $$2 = $$0.a();
      iu $$3 = $$2.a($$1);
      dja $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.A_().a($$3) ? this.m().b(e, $$1) : null;
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return d.get(h($$0).g());
   }

   public static ja h(eah $$0) {
      ja $$1 = $$0.c(e);
      return $$0.c(b) == eau.a ? $$1.g() : $$1;
   }

   public static don.a i(eah $$0) {
      eau $$1 = $$0.c(b);
      return $$1 == eau.a ? don.a.b : don.a.c;
   }

   private static boolean b(dig $$0, iu $$1) {
      return $$0.a_($$1.e()).b() instanceof dly;
   }

   public static Optional<feq> a(bwo<?> $$0, dik $$1, iu $$2, ja $$3, float $$4) {
      ja $$5 = $$3.h();
      ja $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<feq> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<feq> a(bwo<?> $$0, dik $$1, iu $$2, ja $$3, ja $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<feq> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         iu $$7 = $$2.e();
         Optional<feq> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<feq> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<feq> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<feq> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<feq> a(bwo<?> $$0, dik $$1, iu $$2, int[][] $$3, boolean $$4) {
      iu.a $$5 = new iu.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         feq $$7 = ctv.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(e, b, c);
   }

   @Override
   public dxf a(iu $$0, eah $$1) {
      return new dxb($$0, $$1, this.f);
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, @Nullable bxe $$3, czd $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         iu $$5 = $$1.a($$2.c(e));
         $$0.a($$5, $$2.b(b, eau.a), 3);
         $$0.a($$1, dmh.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cyb b() {
      return this.f;
   }

   @Override
   protected long a(eah $$0, iu $$1) {
      iu $$2 = $$1.a($$0.c(e), $$0.c(b) == eau.a ? 0 : 1);
      return azm.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
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
