import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dje extends dnj implements dme {
   public static final MapCodec<dje> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvl.q.fieldOf("color").forGetter(dje::b), t()).apply($$0, dje::new));
   public static final dxt<dxj> b = dxm.be;
   public static final dxn c = dxm.y;
   protected static final int d = 9;
   protected static final fbt e = djl.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fbt f = djl.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fbt g = djl.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fbt h = djl.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fbt i = djl.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fbt j = fbq.a(e, f, h);
   protected static final fbt k = fbq.a(e, g, i);
   protected static final fbt l = fbq.a(e, f, g);
   protected static final fbt m = fbq.a(e, h, i);
   private final cvl o;

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   public dje(cvl $$0, dwv.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dxj.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jn a(dfm $$0, ji $$1) {
      dww $$2 = $$0.a_($$1);
      return $$2.b() instanceof dje ? $$2.c(aF) : null;
   }

   @Override
   protected bsj a(dww $$0, dgh $$1, ji $$2, cow $$3, fav $$4) {
      if ($$1.C) {
         return bsj.b;
      } else {
         if ($$0.c(b) != dxj.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bsj.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ji $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            faz $$6 = $$2.b();
            $$1.a(null, $$1.ak().a($$6), null, $$6, 5.0F, true, dgh.a.b);
            return bsj.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wp.c("block.minecraft.bed.occupied"), true);
            }

            return bsj.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bsj.b;
         }
      }
   }

   public static boolean a(dgh $$0) {
      return $$0.G_().l();
   }

   private boolean a(dgh $$0, ji $$1) {
      List<coh> $$2 = $$0.a(coh.class, new fau($$1), bvg::fR);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fS();
         return true;
      }
   }

   @Override
   public void a(dgh $$0, dww $$1, ji $$2, buk $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dfm $$0, buk $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(buk $$0) {
      faz $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bvg ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 == a($$0.c(b), $$0.c(aF))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : djn.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jn a(dxj $$0, jn $$1) {
      return $$0 == dxj.b ? $$1 : $$1.g();
   }

   @Override
   public dww a(dgh $$0, ji $$1, dww $$2, cow $$3) {
      if (!$$0.C && $$3.b()) {
         dxj $$4 = $$2.c(b);
         if ($$4 == dxj.b) {
            ji $$5 = $$1.a(a($$4, $$2.c(aF)));
            dww $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dxj.a) {
               $$0.a($$5, djn.a.m(), 35);
               $$0.a($$3, 2001, $$5, djl.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      jn $$1 = $$0.g();
      ji $$2 = $$0.a();
      ji $$3 = $$2.a($$1);
      dgh $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.F_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      jn $$4 = h($$0).g();
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

   public static jn h(dww $$0) {
      jn $$1 = $$0.c(aF);
      return $$0.c(b) == dxj.a ? $$1.g() : $$1;
   }

   public static dlt.a i(dww $$0) {
      dxj $$1 = $$0.c(b);
      return $$1 == dxj.a ? dlt.a.b : dlt.a.c;
   }

   private static boolean b(dfm $$0, ji $$1) {
      return $$0.a_($$1.e()).b() instanceof dje;
   }

   public static Optional<faz> a(bur<?> $$0, dfq $$1, ji $$2, jn $$3, float $$4) {
      jn $$5 = $$3.h();
      jn $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<faz> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<faz> a(bur<?> $$0, dfq $$1, ji $$2, jn $$3, jn $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<faz> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ji $$7 = $$2.e();
         Optional<faz> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<faz> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<faz> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<faz> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<faz> a(bur<?> $$0, dfq $$1, ji $$2, int[][] $$3, boolean $$4) {
      ji.a $$5 = new ji.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         faz $$7 = crb.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public dty a(ji $$0, dww $$1) {
      return new dtu($$0, $$1, this.o);
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, @Nullable bvg $$3, cwo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         ji $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dxj.a), 3);
         $$0.b($$1, djn.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cvl b() {
      return this.o;
   }

   @Override
   protected long a(dww $$0, ji $$1) {
      ji $$2 = $$1.a($$0.c(aF), $$0.c(b) == dxj.a ? 0 : 1);
      return ayz.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }

   private static int[][] a(jn $$0, jn $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jn $$0, jn $$1) {
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

   private static int[][] a(jn $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
