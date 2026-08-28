import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dkf extends dok implements dng {
   public static final MapCodec<dkf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwm.q.fieldOf("color").forGetter(dkf::b), t()).apply($$0, dkf::new));
   public static final dys<dyi> b = dyl.bc;
   public static final dym c = dyl.u;
   protected static final int d = 9;
   protected static final fcs e = dkm.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fcs f = dkm.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fcs g = dkm.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fcs h = dkm.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fcs i = dkm.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fcs j = fcp.a(e, f, h);
   protected static final fcs k = fcp.a(e, g, i);
   protected static final fcs l = fcp.a(e, f, g);
   protected static final fcs m = fcp.a(e, h, i);
   private final cwm o;

   @Override
   public MapCodec<dkf> a() {
      return a;
   }

   public dkf(cwm $$0, dxu.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dyi.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jm a(dgn $$0, jh $$1) {
      dxv $$2 = $$0.a_($$1);
      return $$2.b() instanceof dkf ? $$2.c(aF) : null;
   }

   @Override
   protected btj a(dxv $$0, dhi $$1, jh $$2, cpx $$3, fbu $$4) {
      if ($$1.C) {
         return btj.b;
      } else {
         if ($$0.c(b) != dyi.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return btj.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jh $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fby $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dhi.a.b);
            return btj.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xv.c("block.minecraft.bed.occupied"), true);
            }

            return btj.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return btj.b;
         }
      }
   }

   public static boolean a(dhi $$0) {
      return $$0.G_().l();
   }

   private boolean a(dhi $$0, jh $$1) {
      List<cpj> $$2 = $$0.a(cpj.class, new fbt($$1), bwg::fR);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fS();
         return true;
      }
   }

   @Override
   public void a(dhi $$0, dxv $$1, jh $$2, bvk $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dgn $$0, bvk $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bvk $$0) {
      fby $$1 = $$0.dz();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bwg ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if ($$4 == a($$0.c(b), $$0.c(aF))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dko.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jm a(dyi $$0, jm $$1) {
      return $$0 == dyi.b ? $$1 : $$1.g();
   }

   @Override
   public dxv a(dhi $$0, jh $$1, dxv $$2, cpx $$3) {
      if (!$$0.C && $$3.b()) {
         dyi $$4 = $$2.c(b);
         if ($$4 == dyi.b) {
            jh $$5 = $$1.a(a($$4, $$2.c(aF)));
            dxv $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dyi.a) {
               $$0.a($$5, dko.a.m(), 35);
               $$0.a($$3, 2001, $$5, dkm.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dxv a(dbg $$0) {
      jm $$1 = $$0.g();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$1);
      dhi $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.F_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
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

   public static jm h(dxv $$0) {
      jm $$1 = $$0.c(aF);
      return $$0.c(b) == dyi.a ? $$1.g() : $$1;
   }

   public static dmv.a i(dxv $$0) {
      dyi $$1 = $$0.c(b);
      return $$1 == dyi.a ? dmv.a.b : dmv.a.c;
   }

   private static boolean b(dgn $$0, jh $$1) {
      return $$0.a_($$1.e()).b() instanceof dkf;
   }

   public static Optional<fby> a(bvr<?> $$0, dgr $$1, jh $$2, jm $$3, float $$4) {
      jm $$5 = $$3.h();
      jm $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fby> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fby> a(bvr<?> $$0, dgr $$1, jh $$2, jm $$3, jm $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fby> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jh $$7 = $$2.e();
         Optional<fby> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fby> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fby> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fby> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fby> a(bvr<?> $$0, dgr $$1, jh $$2, int[][] $$3, boolean $$4) {
      jh.a $$5 = new jh.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fby $$7 = csc.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.b;
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public dux a(jh $$0, dxv $$1) {
      return new dut($$0, $$1, this.o);
   }

   @Override
   public void a(dhi $$0, jh $$1, dxv $$2, @Nullable bwg $$3, cxp $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         jh $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dyi.a), 3);
         $$0.b($$1, dko.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cwm b() {
      return this.o;
   }

   @Override
   protected long a(dxv $$0, jh $$1) {
      jh $$2 = $$1.a($$0.c(aF), $$0.c(b) == dyi.a ? 0 : 1);
      return bae.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
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
