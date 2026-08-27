import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dcx extends dha implements dfw {
   public static final MapCodec<dcx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(crs.q.fieldOf("color").forGetter(dcx::b), u()).apply($$0, dcx::new));
   public static final drf<dqu> b = dqx.bb;
   public static final dqy c = dqx.t;
   protected static final int d = 9;
   protected static final eui e = dde.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final eui f = dde.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eui g = dde.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eui h = dde.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eui i = dde.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eui j = euf.a(e, f, h);
   protected static final eui k = euf.a(e, g, i);
   protected static final eui l = euf.a(e, f, g);
   protected static final eui m = euf.a(e, h, i);
   private final crs o;

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   public dcx(crs $$0, dqg.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dqu.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static is a(czj $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      return $$2.b() instanceof dcx ? $$2.c(aE) : null;
   }

   @Override
   protected bpm a(dqh $$0, dad $$1, in $$2, clh $$3, etl $$4) {
      if ($$1.B) {
         return bpm.b;
      } else {
         if ($$0.c(b) != dqu.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bpm.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            in $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            etp $$6 = $$2.b();
            $$1.a(null, $$1.ai().a($$6), null, $$6, 5.0F, true, dad.a.b);
            return bpm.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wu.c("block.minecraft.bed.occupied"), true);
            }

            return bpm.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bpm.a;
         }
      }
   }

   public static boolean a(dad $$0) {
      return $$0.D_().l();
   }

   private boolean a(dad $$0, in $$1) {
      List<cku> $$2 = $$0.a(cku.class, new etk($$1), bsa::fJ);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fK();
         return true;
      }
   }

   @Override
   public void a(dad $$0, dqh $$1, in $$2, brh $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(czj $$0, brh $$1) {
      if ($$1.bV()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(brh $$0) {
      etp $$1 = $$0.dq();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bsa ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : ddg.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static is a(dqu $$0, is $$1) {
      return $$0 == dqu.b ? $$1 : $$1.g();
   }

   @Override
   public dqh a(dad $$0, in $$1, dqh $$2, clh $$3) {
      if (!$$0.B && $$3.f()) {
         dqu $$4 = $$2.c(b);
         if ($$4 == dqu.b) {
            in $$5 = $$1.a(a($$4, $$2.c(aE)));
            dqh $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dqu.a) {
               $$0.a($$5, ddg.a.n(), 35);
               $$0.a($$3, 2001, $$5, dde.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      is $$1 = $$0.g();
      in $$2 = $$0.a();
      in $$3 = $$2.a($$1);
      dad $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.n().a(aE, $$1) : null;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      is $$4 = g($$0).g();
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

   public static is g(dqh $$0) {
      is $$1 = $$0.c(aE);
      return $$0.c(b) == dqu.a ? $$1.g() : $$1;
   }

   public static dfl.a h(dqh $$0) {
      dqu $$1 = $$0.c(b);
      return $$1 == dqu.a ? dfl.a.b : dfl.a.c;
   }

   private static boolean b(czj $$0, in $$1) {
      return $$0.a_($$1.d()).b() instanceof dcx;
   }

   public static Optional<etp> a(brn<?> $$0, czn $$1, in $$2, is $$3, float $$4) {
      is $$5 = $$3.h();
      is $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<etp> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<etp> a(brn<?> $$0, czn $$1, in $$2, is $$3, is $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<etp> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         in $$7 = $$2.d();
         Optional<etp> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<etp> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<etp> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<etp> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<etp> a(brn<?> $$0, czn $$1, in $$2, int[][] $$3, boolean $$4) {
      in.a $$5 = new in.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         etp $$7 = cnh.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected djk a_(dqh $$0) {
      return djk.b;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dnm a(in $$0, dqh $$1) {
      return new dni($$0, $$1, this.o);
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, @Nullable bsa $$3, csz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         in $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dqu.a), 3);
         $$0.b($$1, ddg.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public crs b() {
      return this.o;
   }

   @Override
   protected long a(dqh $$0, in $$1) {
      in $$2 = $$1.a($$0.c(aE), $$0.c(b) == dqu.a ? 0 : 1);
      return axz.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }

   private static int[][] a(is $$0, is $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(is $$0, is $$1) {
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

   private static int[][] a(is $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
