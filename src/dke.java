import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dke extends doj implements dnf {
   public static final MapCodec<dke> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cwl.q.fieldOf("color").forGetter(dke::b), t()).apply($$0, dke::new));
   public static final dyr<dyh> b = dyk.bc;
   public static final dyl c = dyk.u;
   protected static final int d = 9;
   protected static final fcr e = dkl.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fcr f = dkl.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fcr g = dkl.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fcr h = dkl.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fcr i = dkl.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fcr j = fco.a(e, f, h);
   protected static final fcr k = fco.a(e, g, i);
   protected static final fcr l = fco.a(e, f, g);
   protected static final fcr m = fco.a(e, h, i);
   private final cwl o;

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   public dke(cwl $$0, dxt.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dyh.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jm a(dgm $$0, jh $$1) {
      dxu $$2 = $$0.a_($$1);
      return $$2.b() instanceof dke ? $$2.c(aF) : null;
   }

   @Override
   protected bti a(dxu $$0, dhh $$1, jh $$2, cpw $$3, fbt $$4) {
      if ($$1.C) {
         return bti.b;
      } else {
         if ($$0.c(b) != dyh.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bti.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jh $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            fbx $$6 = $$2.b();
            $$1.a(null, $$1.aj().a($$6), null, $$6, 5.0F, true, dhh.a.b);
            return bti.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xv.c("block.minecraft.bed.occupied"), true);
            }

            return bti.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bti.b;
         }
      }
   }

   public static boolean a(dhh $$0) {
      return $$0.G_().l();
   }

   private boolean a(dhh $$0, jh $$1) {
      List<cpi> $$2 = $$0.a(cpi.class, new fbs($$1), bwf::fR);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fS();
         return true;
      }
   }

   @Override
   public void a(dhh $$0, dxu $$1, jh $$2, bvj $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(dgm $$0, bvj $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bvj $$0) {
      fbx $$1 = $$0.dz();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bwf ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$4 == a($$0.c(b), $$0.c(aF))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dkn.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jm a(dyh $$0, jm $$1) {
      return $$0 == dyh.b ? $$1 : $$1.g();
   }

   @Override
   public dxu a(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      if (!$$0.C && $$3.b()) {
         dyh $$4 = $$2.c(b);
         if ($$4 == dyh.b) {
            jh $$5 = $$1.a(a($$4, $$2.c(aF)));
            dxu $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dyh.a) {
               $$0.a($$5, dkn.a.m(), 35);
               $$0.a($$3, 2001, $$5, dkl.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      jm $$1 = $$0.g();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$1);
      dhh $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.F_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
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

   public static jm h(dxu $$0) {
      jm $$1 = $$0.c(aF);
      return $$0.c(b) == dyh.a ? $$1.g() : $$1;
   }

   public static dmu.a i(dxu $$0) {
      dyh $$1 = $$0.c(b);
      return $$1 == dyh.a ? dmu.a.b : dmu.a.c;
   }

   private static boolean b(dgm $$0, jh $$1) {
      return $$0.a_($$1.e()).b() instanceof dke;
   }

   public static Optional<fbx> a(bvq<?> $$0, dgq $$1, jh $$2, jm $$3, float $$4) {
      jm $$5 = $$3.h();
      jm $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<fbx> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<fbx> a(bvq<?> $$0, dgq $$1, jh $$2, jm $$3, jm $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<fbx> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jh $$7 = $$2.e();
         Optional<fbx> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<fbx> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<fbx> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<fbx> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<fbx> a(bvq<?> $$0, dgq $$1, jh $$2, int[][] $$3, boolean $$4) {
      jh.a $$5 = new jh.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         fbx $$7 = csb.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.b;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public duw a(jh $$0, dxu $$1) {
      return new dus($$0, $$1, this.o);
   }

   @Override
   public void a(dhh $$0, jh $$1, dxu $$2, @Nullable bwf $$3, cxo $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         jh $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dyh.a), 3);
         $$0.b($$1, dkn.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cwl b() {
      return this.o;
   }

   @Override
   protected long a(dxu $$0, jh $$1) {
      jh $$2 = $$1.a($$0.c(aF), $$0.c(b) == dyh.a ? 0 : 1);
      return bae.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
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
