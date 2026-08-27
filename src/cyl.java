import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cyl extends dcn implements dbk {
   public static final MapCodec<cyl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cnr.q.fieldOf("color").forGetter(cyl::b), u()).apply($$0, cyl::new));
   public static final dmh<dlw> b = dlz.bb;
   public static final dma c = dlz.t;
   protected static final int d = 9;
   protected static final eos e = cys.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final eos f = cys.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final eos g = cys.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final eos h = cys.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final eos i = cys.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final eos j = eop.a(e, f, h);
   protected static final eos k = eop.a(e, g, i);
   protected static final eos l = eop.a(e, f, g);
   protected static final eos m = eop.a(e, h, i);
   private final cnr o;

   @Override
   public MapCodec<cyl> a() {
      return a;
   }

   public cyl(cnr $$0, dli.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dlw.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ie a(cux $$0, hz $$1) {
      dlj $$2 = $$0.a_($$1);
      return $$2.b() instanceof cyl ? $$2.c(aE) : null;
   }

   @Override
   protected blw a(dlj $$0, cvr $$1, hz $$2, chl $$3, env $$4) {
      if ($$1.B) {
         return blw.b;
      } else {
         if ($$0.c(b) != dlw.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return blw.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            hz $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            enz $$6 = $$2.b();
            $$1.a(null, $$1.ah().a($$6), null, $$6, 5.0F, true, cvr.a.b);
            return blw.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(vq.c("block.minecraft.bed.occupied"), true);
            }

            return blw.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return blw.a;
         }
      }
   }

   public static boolean a(cvr $$0) {
      return $$0.E_().l();
   }

   private boolean a(cvr $$0, hz $$1) {
      List<cgy> $$2 = $$0.a(cgy.class, new enu($$1), boi::fD);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fE();
         return true;
      }
   }

   @Override
   public void a(cvr $$0, dlj $$1, hz $$2, bnq $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cux $$0, bnq $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bnq $$0) {
      enz $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof boi ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cyu.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ie a(dlw $$0, ie $$1) {
      return $$0 == dlw.b ? $$1 : $$1.g();
   }

   @Override
   public dlj a(cvr $$0, hz $$1, dlj $$2, chl $$3) {
      if (!$$0.B && $$3.f()) {
         dlw $$4 = $$2.c(b);
         if ($$4 == dlw.b) {
            hz $$5 = $$1.a(a($$4, $$2.c(aE)));
            dlj $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dlw.a) {
               $$0.a($$5, cyu.a.o(), 35);
               $$0.a($$3, 2001, $$5, cys.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      ie $$1 = $$0.g();
      hz $$2 = $$0.a();
      hz $$3 = $$2.a($$1);
      cvr $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.D_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      ie $$4 = g($$0).g();
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

   public static ie g(dlj $$0) {
      ie $$1 = $$0.c(aE);
      return $$0.c(b) == dlw.a ? $$1.g() : $$1;
   }

   public static daz.a h(dlj $$0) {
      dlw $$1 = $$0.c(b);
      return $$1 == dlw.a ? daz.a.b : daz.a.c;
   }

   private static boolean b(cux $$0, hz $$1) {
      return $$0.a_($$1.d()).b() instanceof cyl;
   }

   public static Optional<enz> a(bnw<?> $$0, cvb $$1, hz $$2, ie $$3, float $$4) {
      ie $$5 = $$3.h();
      ie $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<enz> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<enz> a(bnw<?> $$0, cvb $$1, hz $$2, ie $$3, ie $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<enz> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         hz $$7 = $$2.d();
         Optional<enz> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<enz> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<enz> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<enz> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<enz> a(bnw<?> $$0, cvb $$1, hz $$2, int[][] $$3, boolean $$4) {
      hz.a $$5 = new hz.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         enz $$7 = cjj.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dex b_(dlj $$0) {
      return dex.b;
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dix a(hz $$0, dlj $$1) {
      return new dit($$0, $$1, this.o);
   }

   @Override
   public void a(cvr $$0, hz $$1, dlj $$2, @Nullable boi $$3, cpd $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         hz $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dlw.a), 3);
         $$0.b($$1, cyu.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cnr b() {
      return this.o;
   }

   @Override
   protected long a(dlj $$0, hz $$1) {
      hz $$2 = $$1.a($$0.c(aE), $$0.c(b) == dlw.a ? 0 : 1);
      return awi.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }

   private static int[][] a(ie $$0, ie $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ie $$0, ie $$1) {
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

   private static int[][] a(ie $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
