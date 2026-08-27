import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dca extends dgc implements dez {
   public static final MapCodec<dca> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cql.q.fieldOf("color").forGetter(dca::b), u()).apply($$0, dca::new));
   public static final dqg<dpv> b = dpy.bb;
   public static final dpz c = dpy.t;
   protected static final int d = 9;
   protected static final etc e = dch.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final etc f = dch.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final etc g = dch.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final etc h = dch.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final etc i = dch.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final etc j = esz.a(e, f, h);
   protected static final etc k = esz.a(e, g, i);
   protected static final etc l = esz.a(e, f, g);
   protected static final etc m = esz.a(e, h, i);
   private final cql o;

   @Override
   public MapCodec<dca> a() {
      return a;
   }

   public dca(cql $$0, dph.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dpv.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ij a(cym $$0, id $$1) {
      dpi $$2 = $$0.a_($$1);
      return $$2.b() instanceof dca ? $$2.c(aE) : null;
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.b;
      } else {
         if ($$0.c(b) != dpv.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bof.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            id $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            esj $$6 = $$2.b();
            $$1.a(null, $$1.ai().a($$6), null, $$6, 5.0F, true, czg.a.b);
            return bof.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(wi.c("block.minecraft.bed.occupied"), true);
            }

            return bof.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bof.a;
         }
      }
   }

   public static boolean a(czg $$0) {
      return $$0.D_().l();
   }

   private boolean a(czg $$0, id $$1) {
      List<cjn> $$2 = $$0.a(cjn.class, new ese($$1), bqt::fI);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fJ();
         return true;
      }
   }

   @Override
   public void a(czg $$0, dpi $$1, id $$2, bqa $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cym $$0, bqa $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bqa $$0) {
      esj $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bqt ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dcj.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ij a(dpv $$0, ij $$1) {
      return $$0 == dpv.b ? $$1 : $$1.g();
   }

   @Override
   public dpi a(czg $$0, id $$1, dpi $$2, cka $$3) {
      if (!$$0.B && $$3.f()) {
         dpv $$4 = $$2.c(b);
         if ($$4 == dpv.b) {
            id $$5 = $$1.a(a($$4, $$2.c(aE)));
            dpi $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dpv.a) {
               $$0.a($$5, dcj.a.n(), 35);
               $$0.a($$3, 2001, $$5, dch.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      ij $$1 = $$0.g();
      id $$2 = $$0.a();
      id $$3 = $$2.a($$1);
      czg $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.n().a(aE, $$1) : null;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      ij $$4 = g($$0).g();
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

   public static ij g(dpi $$0) {
      ij $$1 = $$0.c(aE);
      return $$0.c(b) == dpv.a ? $$1.g() : $$1;
   }

   public static deo.a h(dpi $$0) {
      dpv $$1 = $$0.c(b);
      return $$1 == dpv.a ? deo.a.b : deo.a.c;
   }

   private static boolean b(cym $$0, id $$1) {
      return $$0.a_($$1.d()).b() instanceof dca;
   }

   public static Optional<esj> a(bqg<?> $$0, cyq $$1, id $$2, ij $$3, float $$4) {
      ij $$5 = $$3.h();
      ij $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<esj> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<esj> a(bqg<?> $$0, cyq $$1, id $$2, ij $$3, ij $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<esj> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         id $$7 = $$2.d();
         Optional<esj> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<esj> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<esj> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<esj> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<esj> a(bqg<?> $$0, cyq $$1, id $$2, int[][] $$3, boolean $$4) {
      id.a $$5 = new id.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         esj $$7 = cma.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.b;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dmk($$0, $$1, this.o);
   }

   @Override
   public void a(czg $$0, id $$1, dpi $$2, @Nullable bqt $$3, crs $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         id $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dpv.a), 3);
         $$0.b($$1, dcj.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cql b() {
      return this.o;
   }

   @Override
   protected long a(dpi $$0, id $$1) {
      id $$2 = $$1.a($$0.c(aE), $$0.c(b) == dpv.a ? 0 : 1);
      return axm.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   private static int[][] a(ij $$0, ij $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ij $$0, ij $$1) {
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

   private static int[][] a(ij $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
