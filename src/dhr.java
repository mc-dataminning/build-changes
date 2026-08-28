import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dhr extends dlt implements dkq {
   public static final MapCodec<dhr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cuu.q.fieldOf("color").forGetter(dhr::b), t()).apply($$0, dhr::new));
   public static final dwb<dvq> b = dvt.bb;
   public static final dvu c = dvt.t;
   protected static final int d = 9;
   protected static final fab e = dhy.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fab f = dhy.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fab g = dhy.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fab h = dhy.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fab i = dhy.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fab j = ezy.a(e, f, h);
   protected static final fab k = ezy.a(e, g, i);
   protected static final fab l = ezy.a(e, f, g);
   protected static final fab m = ezy.a(e, h, i);
   private final cuu o;

   @Override
   public MapCodec<dhr> a() {
      return a;
   }

   public dhr(cuu $$0, dvc.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dvq.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jl a(dea $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      return $$2.b() instanceof dhr ? $$2.c(aF) : null;
   }

   @Override
   protected bry a(dvd $$0, dev $$1, jg $$2, coh $$3, ezd $$4) {
      if ($$1.C) {
         return bry.b;
      } else {
         if ($$0.c(b) != dvq.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bry.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jg $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ezh $$6 = $$2.b();
            $$1.a(null, $$1.ak().a($$6), null, $$6, 5.0F, true, dev.a.b);
            return bry.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xh.c("block.minecraft.bed.occupied"), true);
            }

            return bry.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bry.b;
         }
      }
   }

   public static boolean a(dev $$0) {
      return $$0.D_().l();
   }

   private boolean a(dev $$0, jg $$1) {
      List<cnt> $$2 = $$0.a(cnt.class, new ezc($$1), buv::fT);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fU();
         return true;
      }
   }

   @Override
   public void a(dev $$0, dvd $$1, jg $$2, btz $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dea $$0, btz $$1) {
      if ($$1.cg()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(btz $$0) {
      ezh $$1 = $$0.dA();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof buv ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aF))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.b(c, $$2.c(c)) : dia.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static jl a(dvq $$0, jl $$1) {
      return $$0 == dvq.b ? $$1 : $$1.g();
   }

   @Override
   public dvd a(dev $$0, jg $$1, dvd $$2, coh $$3) {
      if (!$$0.C && $$3.f()) {
         dvq $$4 = $$2.c(b);
         if ($$4 == dvq.b) {
            jg $$5 = $$1.a(a($$4, $$2.c(aF)));
            dvd $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dvq.a) {
               $$0.a($$5, dia.a.m(), 35);
               $$0.a($$3, 2001, $$5, dhy.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      jl $$1 = $$0.g();
      jg $$2 = $$0.a();
      jg $$3 = $$2.a($$1);
      dev $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      jl $$4 = h($$0).g();
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

   public static jl h(dvd $$0) {
      jl $$1 = $$0.c(aF);
      return $$0.c(b) == dvq.a ? $$1.g() : $$1;
   }

   public static dkf.a i(dvd $$0) {
      dvq $$1 = $$0.c(b);
      return $$1 == dvq.a ? dkf.a.b : dkf.a.c;
   }

   private static boolean b(dea $$0, jg $$1) {
      return $$0.a_($$1.e()).b() instanceof dhr;
   }

   public static Optional<ezh> a(bug<?> $$0, dee $$1, jg $$2, jl $$3, float $$4) {
      jl $$5 = $$3.h();
      jl $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ezh> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ezh> a(bug<?> $$0, dee $$1, jg $$2, jl $$3, jl $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ezh> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jg $$7 = $$2.e();
         Optional<ezh> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ezh> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ezh> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ezh> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ezh> a(bug<?> $$0, dee $$1, jg $$2, int[][] $$3, boolean $$4) {
      jg.a $$5 = new jg.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ezh $$7 = cqk.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected doe a_(dvd $$0) {
      return doe.b;
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public dsg a(jg $$0, dvd $$1) {
      return new dsc($$0, $$1, this.o);
   }

   @Override
   public void a(dev $$0, jg $$1, dvd $$2, @Nullable buv $$3, cvx $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         jg $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dvq.a), 3);
         $$0.b($$1, dia.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cuu b() {
      return this.o;
   }

   @Override
   protected long a(dvd $$0, jg $$1) {
      jg $$2 = $$1.a($$0.c(aF), $$0.c(b) == dvq.a ? 0 : 1);
      return azj.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }

   private static int[][] a(jl $$0, jl $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jl $$0, jl $$1) {
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

   private static int[][] a(jl $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
