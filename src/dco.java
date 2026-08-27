import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dco extends dgr implements dfn {
   public static final MapCodec<dco> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cqw.q.fieldOf("color").forGetter(dco::b), u()).apply($$0, dco::new));
   public static final dqw<dql> b = dqo.bb;
   public static final dqp c = dqo.t;
   protected static final int d = 9;
   protected static final ety e = dcv.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final ety f = dcv.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final ety g = dcv.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final ety h = dcv.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final ety i = dcv.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final ety j = etv.a(e, f, h);
   protected static final ety k = etv.a(e, g, i);
   protected static final ety l = etv.a(e, f, g);
   protected static final ety m = etv.a(e, h, i);
   private final cqw o;

   @Override
   public MapCodec<dco> a() {
      return a;
   }

   public dco(cqw $$0, dpx.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, dql.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ir a(cza $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      return $$2.b() instanceof dco ? $$2.c(aE) : null;
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.b;
      } else {
         if ($$0.c(b) != dql.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return boq.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            im $$5 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            etf $$6 = $$2.b();
            $$1.a(null, $$1.ai().a($$6), null, $$6, 5.0F, true, czu.a.b);
            return boq.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(ws.c("block.minecraft.bed.occupied"), true);
            }

            return boq.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return boq.a;
         }
      }
   }

   public static boolean a(czu $$0) {
      return $$0.D_().l();
   }

   private boolean a(czu $$0, im $$1) {
      List<cjy> $$2 = $$0.a(cjy.class, new eta($$1), bre::fJ);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fK();
         return true;
      }
   }

   @Override
   public void a(czu $$0, dpy $$1, im $$2, bql $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cza $$0, bql $$1) {
      if ($$1.bV()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bql $$0) {
      etf $$1 = $$0.dq();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof bre ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : dcx.a.n();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ir a(dql $$0, ir $$1) {
      return $$0 == dql.b ? $$1 : $$1.g();
   }

   @Override
   public dpy a(czu $$0, im $$1, dpy $$2, ckl $$3) {
      if (!$$0.B && $$3.f()) {
         dql $$4 = $$2.c(b);
         if ($$4 == dql.b) {
            im $$5 = $$1.a(a($$4, $$2.c(aE)));
            dpy $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dql.a) {
               $$0.a($$5, dcx.a.n(), 35);
               $$0.a($$3, 2001, $$5, dcv.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      ir $$1 = $$0.g();
      im $$2 = $$0.a();
      im $$3 = $$2.a($$1);
      czu $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.C_().a($$3) ? this.n().a(aE, $$1) : null;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      ir $$4 = g($$0).g();
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

   public static ir g(dpy $$0) {
      ir $$1 = $$0.c(aE);
      return $$0.c(b) == dql.a ? $$1.g() : $$1;
   }

   public static dfc.a h(dpy $$0) {
      dql $$1 = $$0.c(b);
      return $$1 == dql.a ? dfc.a.b : dfc.a.c;
   }

   private static boolean b(cza $$0, im $$1) {
      return $$0.a_($$1.d()).b() instanceof dco;
   }

   public static Optional<etf> a(bqr<?> $$0, cze $$1, im $$2, ir $$3, float $$4) {
      ir $$5 = $$3.h();
      ir $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<etf> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<etf> a(bqr<?> $$0, cze $$1, im $$2, ir $$3, ir $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<etf> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         im $$7 = $$2.d();
         Optional<etf> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<etf> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<etf> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<etf> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<etf> a(bqr<?> $$0, cze $$1, im $$2, int[][] $$3, boolean $$4) {
      im.a $$5 = new im.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         etf $$7 = cml.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.b;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dmz($$0, $$1, this.o);
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, @Nullable bre $$3, csd $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         im $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, dql.a), 3);
         $$0.b($$1, dcx.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cqw b() {
      return this.o;
   }

   @Override
   protected long a(dpy $$0, im $$1) {
      im $$2 = $$1.a($$0.c(aE), $$0.c(b) == dql.a ? 0 : 1);
      return axw.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   private static int[][] a(ir $$0, ir $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ir $$0, ir $$1) {
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

   private static int[][] a(ir $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
