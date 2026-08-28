import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class djf extends dnk implements dmf {
   public static final MapCodec<djf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvm.q.fieldOf("color").forGetter(djf::b), t()).apply($$0, djf::new));
   public static final dxu<dxk> b = dxn.be;
   public static final dxo c = dxn.y;
   protected static final int d = 9;
   protected static final fbu e = djm.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fbu f = djm.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fbu g = djm.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fbu h = djm.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fbu i = djm.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fbu j = fbr.a(e, f, h);
   protected static final fbu k = fbr.a(e, g, i);
   protected static final fbu l = fbr.a(e, f, g);
   protected static final fbu m = fbr.a(e, h, i);
   private final cvm o;

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(cvm $$0, dww.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dxk.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jn a(dfn $$0, ji $$1) {
      dwx $$2 = $$0.a_($$1);
      return $$2.b() instanceof djf ? $$2.c(aF) : null;
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if ($$1.C) {
         return bsj.b;
      } else {
         if ($$0.c(b) != dxk.a) {
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

            fba $$6 = $$2.b();
            $$1.a(null, $$1.ak().a($$6), null, $$6, 5.0F, true, dgi.a.b);
            return bsj.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wo.c("block.minecraft.bed.occupied"), true);
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

   public static boolean a(dgi $$0) {
      return $$0.G_().l();
   }

   private boolean a(dgi $$0, ji $$1) {
      List<coi> $$2 = $$0.a(coi.class, new fav($$1), bvg::fR);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fS();
         return true;
      }
   }

   @Override
   public void a(dgi $$0, dwx $$1, ji $$2, buk $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dfn $$0, buk $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(buk $$0) {
      fba $$1 = $$0.dz();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bvg ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if ($$4 == a($$0.c(b), $$0.c(aF))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : djo.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jn a(dxk $$0, jn $$1) {
      return $$0 == dxk.b ? $$1 : $$1.g();
   }

   @Override
   public dwx a(dgi $$0, ji $$1, dwx $$2, cox $$3) {
      if (!$$0.C && $$3.b()) {
         dxk $$4 = $$2.c(b);
         if ($$4 == dxk.b) {
            ji $$5 = $$1.a(a($$4, $$2.c(aF)));
            dwx $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dxk.a) {
               $$0.a($$5, djo.a.m(), 35);
               $$0.a($$3, 2001, $$5, djm.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      jn $$1 = $$0.g();
      ji $$2 = $$0.a();
      ji $$3 = $$2.a($$1);
      dgi $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.F_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
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

   public static jn h(dwx $$0) {
      jn $$1 = $$0.c(aF);
      return $$0.c(b) == dxk.a ? $$1.g() : $$1;
   }

   public static dlu.a i(dwx $$0) {
      dxk $$1 = $$0.c(b);
      return $$1 == dxk.a ? dlu.a.b : dlu.a.c;
   }

   private static boolean b(dfn $$0, ji $$1) {
      return $$0.a_($$1.e()).b() instanceof djf;
   }

   public static Optional<fba> a(bur<?> $$0, dfr $$1, ji $$2, jn $$3, float $$4) {
      jn $$5 = $$3.h();
      jn $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fba> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fba> a(bur<?> $$0, dfr $$1, ji $$2, jn $$3, jn $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fba> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ji $$7 = $$2.e();
         Optional<fba> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fba> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fba> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fba> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fba> a(bur<?> $$0, dfr $$1, ji $$2, int[][] $$3, boolean $$4) {
      ji.a $$5 = new ji.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fba $$7 = crc.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dpx a_(dwx $$0) {
      return dpx.b;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public dtz a(ji $$0, dwx $$1) {
      return new dtv($$0, $$1, this.o);
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, @Nullable bvg $$3, cwp $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         ji $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dxk.a), 3);
         $$0.b($$1, djo.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cvm b() {
      return this.o;
   }

   @Override
   protected long a(dwx $$0, ji $$1) {
      ji $$2 = $$1.a($$0.c(aF), $$0.c(b) == dxk.a ? 0 : 1);
      return ayz.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
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
