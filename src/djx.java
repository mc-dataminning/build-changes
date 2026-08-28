import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class djx extends doc implements dmy {
   public static final MapCodec<djx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwh.q.fieldOf("color").forGetter(djx::b), t()).apply($$0, djx::new));
   public static final dyk<dya> b = dyd.bc;
   public static final dye c = dyd.u;
   protected static final int d = 9;
   protected static final fcm e = dke.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fcm f = dke.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fcm g = dke.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fcm h = dke.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fcm i = dke.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fcm j = fcj.a(e, f, h);
   protected static final fcm k = fcj.a(e, g, i);
   protected static final fcm l = fcj.a(e, f, g);
   protected static final fcm m = fcj.a(e, h, i);
   private final cwh o;

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   public djx(cwh $$0, dxm.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dya.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jm a(dgf $$0, jh $$1) {
      dxn $$2 = $$0.a_($$1);
      return $$2.b() instanceof djx ? $$2.c(aF) : null;
   }

   @Override
   protected bte a(dxn $$0, dha $$1, jh $$2, cps $$3, fbo $$4) {
      if ($$1.C) {
         return bte.b;
      } else {
         if ($$0.c(b) != dya.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bte.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jh $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fbs $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dha.a.b);
            return bte.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xv.c("block.minecraft.bed.occupied"), true);
            }

            return bte.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bte.b;
         }
      }
   }

   public static boolean a(dha $$0) {
      return $$0.G_().l();
   }

   private boolean a(dha $$0, jh $$1) {
      List<cpe> $$2 = $$0.a(cpe.class, new fbn($$1), bwb::fP);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fQ();
         return true;
      }
   }

   @Override
   public void a(dha $$0, dxn $$1, jh $$2, bvf $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dgf $$0, bvf $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bvf $$0) {
      fbs $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bwb ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      if ($$4 == a($$0.c(b), $$0.c(aF))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dkg.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jm a(dya $$0, jm $$1) {
      return $$0 == dya.b ? $$1 : $$1.g();
   }

   @Override
   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
      if (!$$0.C && $$3.b()) {
         dya $$4 = $$2.c(b);
         if ($$4 == dya.b) {
            jh $$5 = $$1.a(a($$4, $$2.c(aF)));
            dxn $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dya.a) {
               $$0.a($$5, dkg.a.m(), 35);
               $$0.a($$3, 2001, $$5, dke.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      jm $$1 = $$0.g();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$1);
      dha $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.F_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      jm $$4 = h($$0).g();
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

   public static jm h(dxn $$0) {
      jm $$1 = $$0.c(aF);
      return $$0.c(b) == dya.a ? $$1.g() : $$1;
   }

   public static dmn.a i(dxn $$0) {
      dya $$1 = $$0.c(b);
      return $$1 == dya.a ? dmn.a.b : dmn.a.c;
   }

   private static boolean b(dgf $$0, jh $$1) {
      return $$0.a_($$1.e()).b() instanceof djx;
   }

   public static Optional<fbs> a(bvm<?> $$0, dgj $$1, jh $$2, jm $$3, float $$4) {
      jm $$5 = $$3.h();
      jm $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fbs> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fbs> a(bvm<?> $$0, dgj $$1, jh $$2, jm $$3, jm $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fbs> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jh $$7 = $$2.e();
         Optional<fbs> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fbs> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fbs> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fbs> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fbs> a(bvm<?> $$0, dgj $$1, jh $$2, int[][] $$3, boolean $$4) {
      jh.a $$5 = new jh.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fbs $$7 = crx.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dqn a_(dxn $$0) {
      return dqn.b;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public dup a(jh $$0, dxn $$1) {
      return new dul($$0, $$1, this.o);
   }

   @Override
   public void a(dha $$0, jh $$1, dxn $$2, @Nullable bwb $$3, cxk $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         jh $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dya.a), 3);
         $$0.b($$1, dkg.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cwh b() {
      return this.o;
   }

   @Override
   protected long a(dxn $$0, jh $$1) {
      jh $$2 = $$1.a($$0.c(aF), $$0.c(b) == dya.a ? 0 : 1);
      return bae.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }

   private static int[][] a(jm $$0, jm $$1) {
      return (int[][])ArrayUtils.addAll(b($$0, $$1), a($$0));
   }

   private static int[][] b(jm $$0, jm $$1) {
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

   private static int[][] a(jm $$0) {
      return new int[][]{{0, 0}, {-$$0.j(), -$$0.l()}};
   }
}
