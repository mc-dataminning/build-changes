import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class djd extends dni implements dmd {
   public static final MapCodec<djd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvk.q.fieldOf("color").forGetter(djd::b), t()).apply($$0, djd::new));
   public static final dxs<dxi> b = dxl.be;
   public static final dxm c = dxl.y;
   protected static final int d = 9;
   protected static final fbs e = djk.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fbs f = djk.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fbs g = djk.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fbs h = djk.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fbs i = djk.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fbs j = fbp.a(e, f, h);
   protected static final fbs k = fbp.a(e, g, i);
   protected static final fbs l = fbp.a(e, f, g);
   protected static final fbs m = fbp.a(e, h, i);
   private final cvk o;

   @Override
   public MapCodec<djd> a() {
      return a;
   }

   public djd(cvk $$0, dwu.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dxi.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jn a(dfl $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1);
      return $$2.b() instanceof djd ? $$2.c(aF) : null;
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$1.C) {
         return bsi.b;
      } else {
         if ($$0.c(b) != dxi.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bsi.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ji $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fay $$6 = $$2.b();
            $$1.a(null, $$1.ak().a($$6), null, $$6, 5.0F, true, dgg.a.b);
            return bsi.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wo.c("block.minecraft.bed.occupied"), true);
            }

            return bsi.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bsi.b;
         }
      }
   }

   public static boolean a(dgg $$0) {
      return $$0.G_().l();
   }

   private boolean a(dgg $$0, ji $$1) {
      List<cog> $$2 = $$0.a(cog.class, new fat($$1), bvf::fR);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fS();
         return true;
      }
   }

   @Override
   public void a(dgg $$0, dwv $$1, ji $$2, buj $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dfl $$0, buj $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(buj $$0) {
      fay $$1 = $$0.dz();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bvf ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4 == a($$0.c(b), $$0.c(aF))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : djm.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jn a(dxi $$0, jn $$1) {
      return $$0 == dxi.b ? $$1 : $$1.g();
   }

   @Override
   public dwv a(dgg $$0, ji $$1, dwv $$2, cov $$3) {
      if (!$$0.C && $$3.b()) {
         dxi $$4 = $$2.c(b);
         if ($$4 == dxi.b) {
            ji $$5 = $$1.a(a($$4, $$2.c(aF)));
            dwv $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dxi.a) {
               $$0.a($$5, djm.a.m(), 35);
               $$0.a($$3, 2001, $$5, djk.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      jn $$1 = $$0.g();
      ji $$2 = $$0.a();
      ji $$3 = $$2.a($$1);
      dgg $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.F_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
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

   public static jn h(dwv $$0) {
      jn $$1 = $$0.c(aF);
      return $$0.c(b) == dxi.a ? $$1.g() : $$1;
   }

   public static dls.a i(dwv $$0) {
      dxi $$1 = $$0.c(b);
      return $$1 == dxi.a ? dls.a.b : dls.a.c;
   }

   private static boolean b(dfl $$0, ji $$1) {
      return $$0.a_($$1.e()).b() instanceof djd;
   }

   public static Optional<fay> a(buq<?> $$0, dfp $$1, ji $$2, jn $$3, float $$4) {
      jn $$5 = $$3.h();
      jn $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fay> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fay> a(buq<?> $$0, dfp $$1, ji $$2, jn $$3, jn $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fay> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ji $$7 = $$2.e();
         Optional<fay> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fay> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fay> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fay> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fay> a(buq<?> $$0, dfp $$1, ji $$2, int[][] $$3, boolean $$4) {
      ji.a $$5 = new ji.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fay $$7 = cra.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dtt($$0, $$1, this.o);
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, @Nullable bvf $$3, cwn $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         ji $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dxi.a), 3);
         $$0.b($$1, djm.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cvk b() {
      return this.o;
   }

   @Override
   protected long a(dwv $$0, ji $$1) {
      ji $$2 = $$1.a($$0.c(aF), $$0.c(b) == dxi.a ? 0 : 1);
      return ayy.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
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
