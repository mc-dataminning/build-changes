import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class ddr extends dhu implements dgq {
   public static final MapCodec<ddr> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(csh.q.fieldOf("color").forGetter(ddr::b), u()).apply($$0, ddr::new));
   public static final drz<dro> b = drr.bb;
   public static final drs c = drr.t;
   protected static final int d = 9;
   protected static final evd e = ddy.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final evd f = ddy.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final evd g = ddy.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final evd h = ddy.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final evd i = ddy.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final evd j = eva.a(e, f, h);
   protected static final evd k = eva.a(e, g, i);
   protected static final evd l = eva.a(e, f, g);
   protected static final evd m = eva.a(e, h, i);
   private final csh o;

   @Override
   public MapCodec<ddr> a() {
      return a;
   }

   public ddr(csh $$0, dra.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dro.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static it a(dad $$0, io $$1) {
      drb $$2 = $$0.a_($$1);
      return $$2.b() instanceof ddr ? $$2.c(aE) : null;
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.b;
      } else {
         if ($$0.c(b) != dro.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bpu.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            io $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            euk $$6 = $$2.b();
            $$1.a(null, $$1.ai().a($$6), null, $$6, 5.0F, true, dax.a.b);
            return bpu.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wx.c("block.minecraft.bed.occupied"), true);
            }

            return bpu.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bpu.a;
         }
      }
   }

   public static boolean a(dax $$0) {
      return $$0.D_().l();
   }

   private boolean a(dax $$0, io $$1) {
      List<clj> $$2 = $$0.a(clj.class, new euf($$1), bso::fL);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fM();
         return true;
      }
   }

   @Override
   public void a(dax $$0, drb $$1, io $$2, bru $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dad $$0, bru $$1) {
      if ($$1.bX()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bru $$0) {
      euk $$1 = $$0.ds();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bso ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected drb a(drb $$0, it $$1, drb $$2, day $$3, io $$4, io $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dea.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static it a(dro $$0, it $$1) {
      return $$0 == dro.b ? $$1 : $$1.g();
   }

   @Override
   public drb a(dax $$0, io $$1, drb $$2, clw $$3) {
      if (!$$0.B && $$3.f()) {
         dro $$4 = $$2.c(b);
         if ($$4 == dro.b) {
            io $$5 = $$1.a(a($$4, $$2.c(aE)));
            drb $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dro.a) {
               $$0.a($$5, dea.a.n(), 35);
               $$0.a($$3, 2001, $$5, ddy.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      it $$1 = $$0.g();
      io $$2 = $$0.a();
      io $$3 = $$2.a($$1);
      dax $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.n().a(aE, $$1) : null;
   }

   @Override
   protected evd a(drb $$0, dad $$1, io $$2, eup $$3) {
      it $$4 = g($$0).g();
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

   public static it g(drb $$0) {
      it $$1 = $$0.c(aE);
      return $$0.c(b) == dro.a ? $$1.g() : $$1;
   }

   public static dgf.a h(drb $$0) {
      dro $$1 = $$0.c(b);
      return $$1 == dro.a ? dgf.a.b : dgf.a.c;
   }

   private static boolean b(dad $$0, io $$1) {
      return $$0.a_($$1.d()).b() instanceof ddr;
   }

   public static Optional<euk> a(bsa<?> $$0, dah $$1, io $$2, it $$3, float $$4) {
      it $$5 = $$3.h();
      it $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<euk> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<euk> a(bsa<?> $$0, dah $$1, io $$2, it $$3, it $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<euk> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         io $$7 = $$2.d();
         Optional<euk> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<euk> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<euk> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<euk> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<euk> a(bsa<?> $$0, dah $$1, io $$2, int[][] $$3, boolean $$4) {
      io.a $$5 = new io.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         euk $$7 = cnw.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dke a_(drb $$0) {
      return dke.b;
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dog a(io $$0, drb $$1) {
      return new doc($$0, $$1, this.o);
   }

   @Override
   public void a(dax $$0, io $$1, drb $$2, @Nullable bso $$3, cto $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         io $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dro.a), 3);
         $$0.b($$1, dea.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public csh b() {
      return this.o;
   }

   @Override
   protected long a(drb $$0, io $$1) {
      io $$2 = $$1.a($$0.c(aE), $$0.c(b) == dro.a ? 0 : 1);
      return ayd.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(drb $$0, enj $$1) {
      return false;
   }

   private static int[][] a(it $$0, it $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(it $$0, it $$1) {
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

   private static int[][] a(it $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
