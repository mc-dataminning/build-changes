import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class cvs extends czu implements cyr {
   public static final MapCodec<cvs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ckv.q.fieldOf("color").forGetter(cvs::b), u()).apply($$0, cvs::new));
   public static final djn<djc> b = djf.bb;
   public static final djg c = djf.t;
   protected static final int d = 9;
   protected static final elu e = cvz.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final elu f = cvz.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final elu g = cvz.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final elu h = cvz.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final elu i = cvz.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final elu j = elr.a(e, f, h);
   protected static final elu k = elr.a(e, g, i);
   protected static final elu l = elr.a(e, f, g);
   protected static final elu m = elr.a(e, h, i);
   private final ckv o;

   @Override
   public MapCodec<cvs> a() {
      return a;
   }

   public cvs(ckv $$0, dio.d $$1) {
      super($$1);
      this.o = $$0;
      this.k(this.E.b().a(b, djc.b).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static ia a(cse $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      return $$2.b() instanceof cvs ? $$2.c(aE) : null;
   }

   @Override
   public bjl a(dip $$0, csy $$1, hv $$2, cer $$3, bjk $$4, ekx $$5) {
      if ($$1.B) {
         return bjl.b;
      } else {
         if ($$0.c(b) != djc.a) {
            $$2 = $$2.a($$0.c(aE));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bjl.b;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            hv $$6 = $$2.a($$0.c(aE).g());
            if ($$1.a_($$6).a(this)) {
               $$1.a($$6, false);
            }

            elb $$7 = $$2.b();
            $$1.a(null, $$1.ah().a($$7), null, $$7, 5.0F, true, csy.a.b);
            return bjl.a;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(vb.c("block.minecraft.bed.occupied"), true);
            }

            return bjl.a;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bjl.a;
         }
      }
   }

   public static boolean a(csy $$0) {
      return $$0.E_().l();
   }

   private boolean a(csy $$0, hv $$1) {
      List<cee> $$2 = $$0.a(cee.class, new ekw($$1), blv::fD);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fE();
         return true;
      }
   }

   @Override
   public void a(csy $$0, dip $$1, hv $$2, blf $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(cse $$0, blf $$1) {
      if ($$1.bU()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(blf $$0) {
      elb $$1 = $$0.dp();
      if ($$1.d < 0.0) {
         double $$2 = $$0 instanceof blv ? 1.0 : 0.8;
         $$0.o($$1.c, -$$1.d * 0.66F * $$2, $$1.e);
      }
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == a($$0.c(b), $$0.c(aE))) {
         return $$2.a(this) && $$2.c(b) != $$0.c(b) ? $$0.a(c, $$2.c(c)) : cwb.a.o();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   private static ia a(djc $$0, ia $$1) {
      return $$0 == djc.b ? $$1 : $$1.g();
   }

   @Override
   public dip a(csy $$0, hv $$1, dip $$2, cer $$3) {
      if (!$$0.B && $$3.f()) {
         djc $$4 = $$2.c(b);
         if ($$4 == djc.b) {
            hv $$5 = $$1.a(a($$4, $$2.c(aE)));
            dip $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == djc.a) {
               $$0.a($$5, cwb.a.o(), 35);
               $$0.a($$3, 2001, $$5, cvz.i($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      ia $$1 = $$0.g();
      hv $$2 = $$0.a();
      hv $$3 = $$2.a($$1);
      csy $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.D_().a($$3) ? this.o().a(aE, $$1) : null;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      ia $$4 = g($$0).g();
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

   public static ia g(dip $$0) {
      ia $$1 = $$0.c(aE);
      return $$0.c(b) == djc.a ? $$1.g() : $$1;
   }

   public static cyg.a h(dip $$0) {
      djc $$1 = $$0.c(b);
      return $$1 == djc.a ? cyg.a.b : cyg.a.c;
   }

   private static boolean b(cse $$0, hv $$1) {
      return $$0.a_($$1.d()).b() instanceof cvs;
   }

   public static Optional<elb> a(blj<?> $$0, csi $$1, hv $$2, ia $$3, float $$4) {
      ia $$5 = $$3.h();
      ia $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<elb> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<elb> a(blj<?> $$0, csi $$1, hv $$2, ia $$3, ia $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<elb> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         hv $$7 = $$2.d();
         Optional<elb> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<elb> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<elb> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<elb> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<elb> a(blj<?> $$0, csi $$1, hv $$2, int[][] $$3, boolean $$4) {
      hv.a $$5 = new hv.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         elb $$7 = cgo.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   public dce b_(dip $$0) {
      return dce.b;
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(aE, b, c);
   }

   @Override
   public dgd a(hv $$0, dip $$1) {
      return new dfz($$0, $$1, this.o);
   }

   @Override
   public void a(csy $$0, hv $$1, dip $$2, @Nullable blv $$3, cmh $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.B) {
         hv $$5 = $$1.a($$2.c(aE));
         $$0.a($$5, $$2.a(b, djc.a), 3);
         $$0.b($$1, cwb.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public ckv b() {
      return this.o;
   }

   @Override
   public long a(dip $$0, hv $$1) {
      hv $$2 = $$1.a($$0.c(aE), $$0.c(b) == djc.a ? 0 : 1);
      return aty.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }

   private static int[][] a(ia $$0, ia $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(ia $$0, ia $$1) {
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

   private static int[][] a(ia $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
