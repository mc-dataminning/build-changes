import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class djg extends dnl implements dmg {
   public static final MapCodec<djg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvn.q.fieldOf("color").forGetter(djg::b), t()).apply($$0, djg::new));
   public static final dxv<dxl> b = dxo.be;
   public static final dxp c = dxo.y;
   protected static final int d = 9;
   protected static final fbv e = djn.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fbv f = djn.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fbv g = djn.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fbv h = djn.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fbv i = djn.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fbv j = fbs.a(e, f, h);
   protected static final fbv k = fbs.a(e, g, i);
   protected static final fbv l = fbs.a(e, f, g);
   protected static final fbv m = fbs.a(e, h, i);
   private final cvn o;

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   public djg(cvn $$0, dwx.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dxl.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jn a(dfo $$0, ji $$1) {
      dwy $$2 = $$0.a_($$1);
      return $$2.b() instanceof djg ? $$2.c(aF) : null;
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$1.C) {
         return bsl.b;
      } else {
         if ($$0.c(b) != dxl.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bsl.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            ji $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fbb $$6 = $$2.b();
            $$1.a(null, $$1.ak().a($$6), null, $$6, 5.0F, true, dgj.a.b);
            return bsl.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wp.c("block.minecraft.bed.occupied"), true);
            }

            return bsl.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bsl.b;
         }
      }
   }

   public static boolean a(dgj $$0) {
      return $$0.G_().l();
   }

   private boolean a(dgj $$0, ji $$1) {
      List<coj> $$2 = $$0.a(coj.class, new faw($$1), bvi::fR);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fS();
         return true;
      }
   }

   @Override
   public void a(dgj $$0, dwy $$1, ji $$2, bum $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dfo $$0, bum $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bum $$0) {
      fbb $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bvi ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4 == a($$0.c(b), $$0.c(aF))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : djp.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jn a(dxl $$0, jn $$1) {
      return $$0 == dxl.b ? $$1 : $$1.g();
   }

   @Override
   public dwy a(dgj $$0, ji $$1, dwy $$2, coy $$3) {
      if (!$$0.C && $$3.b()) {
         dxl $$4 = $$2.c(b);
         if ($$4 == dxl.b) {
            ji $$5 = $$1.a(a($$4, $$2.c(aF)));
            dwy $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dxl.a) {
               $$0.a($$5, djp.a.m(), 35);
               $$0.a($$3, 2001, $$5, djn.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      jn $$1 = $$0.g();
      ji $$2 = $$0.a();
      ji $$3 = $$2.a($$1);
      dgj $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.F_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
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

   public static jn h(dwy $$0) {
      jn $$1 = $$0.c(aF);
      return $$0.c(b) == dxl.a ? $$1.g() : $$1;
   }

   public static dlv.a i(dwy $$0) {
      dxl $$1 = $$0.c(b);
      return $$1 == dxl.a ? dlv.a.b : dlv.a.c;
   }

   private static boolean b(dfo $$0, ji $$1) {
      return $$0.a_($$1.e()).b() instanceof djg;
   }

   public static Optional<fbb> a(but<?> $$0, dfs $$1, ji $$2, jn $$3, float $$4) {
      jn $$5 = $$3.h();
      jn $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fbb> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fbb> a(but<?> $$0, dfs $$1, ji $$2, jn $$3, jn $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fbb> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         ji $$7 = $$2.e();
         Optional<fbb> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fbb> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fbb> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fbb> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fbb> a(but<?> $$0, dfs $$1, ji $$2, int[][] $$3, boolean $$4) {
      ji.a $$5 = new ji.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fbb $$7 = crd.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public dua a(ji $$0, dwy $$1) {
      return new dtw($$0, $$1, this.o);
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, @Nullable bvi $$3, cwq $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         ji $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dxl.a), 3);
         $$0.b($$1, djp.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cvn b() {
      return this.o;
   }

   @Override
   protected long a(dwy $$0, ji $$1) {
      ji $$2 = $$1.a($$0.c(aF), $$0.c(b) == dxl.a ? 0 : 1);
      return ayz.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
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
