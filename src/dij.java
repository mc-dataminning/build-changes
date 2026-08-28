import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;
import org.apache.commons.lang3.ArrayUtils;

public class dij extends dml implements dli {
   public static final MapCodec<dij> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvj.q.fieldOf("color").forGetter(dij::b), t()).apply($$0, dij::new));
   public static final dws<dwi> b = dwl.bb;
   public static final dwm c = dwl.t;
   protected static final int d = 9;
   protected static final fas e = diq.a(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
   private static final int n = 3;
   protected static final fas f = diq.a(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
   protected static final fas g = diq.a(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
   protected static final fas h = diq.a(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
   protected static final fas i = diq.a(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
   protected static final fas j = fap.a(e, f, h);
   protected static final fas k = fap.a(e, g, i);
   protected static final fas l = fap.a(e, f, g);
   protected static final fas m = fap.a(e, h, i);
   private final cvj o;

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   public dij(cvj $$0, dvu.d $$1) {
      super($$1);
      this.o = $$0;
      this.l(this.F.b().b(b, dwi.b).b(c, Boolean.valueOf(false)));
   }

   @Nullable
   public static jm a(der $$0, jh $$1) {
      dvv $$2 = $$0.a_($$1);
      return $$2.b() instanceof dij ? $$2.c(aF) : null;
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if ($$1.C) {
         return bsk.b;
      } else {
         if ($$0.c(b) != dwi.a) {
            $$2 = $$2.a($$0.c(aF));
            $$0 = $$1.a_($$2);
            if (!$$0.a(this)) {
               return bsk.c;
            }
         }

         if (!a($$1)) {
            $$1.a($$2, false);
            jh $$5 = $$2.a($$0.c(aF).g());
            if ($$1.a_($$5).a(this)) {
               $$1.a($$5, false);
            }

            ezy $$6 = $$2.b();
            $$1.a(null, $$1.ai().a($$6), null, $$6, 5.0F, true, dfm.a.b);
            return bsk.b;
         } else if ($$0.c(c)) {
            if (!this.a($$1, $$2)) {
               $$3.a(xj.c("block.minecraft.bed.occupied"), true);
            }

            return bsk.b;
         } else {
            $$3.a($$2).ifLeft($$1x -> {
               if ($$1x.a() != null) {
                  $$3.a($$1x.a(), true);
               }
            });
            return bsk.b;
         }
      }
   }

   public static boolean a(dfm $$0) {
      return $$0.F_().l();
   }

   private boolean a(dfm $$0, jh $$1) {
      List<cof> $$2 = $$0.a(cof.class, new ezt($$1), bvh::fP);
      if ($$2.isEmpty()) {
         return false;
      } else {
         $$2.get(0).fQ();
         return true;
      }
   }

   @Override
   public void a(dfm $$0, dvv $$1, jh $$2, bul $$3, float $$4) {
      super.a($$0, $$1, $$2, $$3, $$4 * 0.5F);
   }

   @Override
   public void a(der $$0, bul $$1) {
      if ($$1.cf()) {
         super.a($$0, $$1);
      } else {
         this.a($$1);
      }
   }

   private void a(bul $$0) {
      ezy $$1 = $$0.dy();
      if ($$1.e < 0.0) {
         double $$2 = $$0 instanceof bvh ? 1.0 : 0.8;
         $$0.n($$1.d, -$$1.e * 0.66F * $$2, $$1.f);
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if ($$4 == a($$0.c(b), $$0.c(aF))) {
         return $$6.a(this) && $$6.c(b) != $$0.c(b) ? $$0.b(c, $$6.c(c)) : dis.a.m();
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static jm a(dwi $$0, jm $$1) {
      return $$0 == dwi.b ? $$1 : $$1.g();
   }

   @Override
   public dvv a(dfm $$0, jh $$1, dvv $$2, cou $$3) {
      if (!$$0.C && $$3.b()) {
         dwi $$4 = $$2.c(b);
         if ($$4 == dwi.b) {
            jh $$5 = $$1.a(a($$4, $$2.c(aF)));
            dvv $$6 = $$0.a_($$5);
            if ($$6.a(this) && $$6.c(b) == dwi.a) {
               $$0.a($$5, dis.a.m(), 35);
               $$0.a($$3, 2001, $$5, diq.j($$6));
            }
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      jm $$1 = $$0.g();
      jh $$2 = $$0.a();
      jh $$3 = $$2.a($$1);
      dfm $$4 = $$0.q();
      return $$4.a_($$3).a($$0) && $$4.E_().a($$3) ? this.m().b(aF, $$1) : null;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
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

   public static jm h(dvv $$0) {
      jm $$1 = $$0.c(aF);
      return $$0.c(b) == dwi.a ? $$1.g() : $$1;
   }

   public static dkx.a i(dvv $$0) {
      dwi $$1 = $$0.c(b);
      return $$1 == dwi.a ? dkx.a.b : dkx.a.c;
   }

   private static boolean b(der $$0, jh $$1) {
      return $$0.a_($$1.e()).b() instanceof dij;
   }

   public static Optional<ezy> a(bus<?> $$0, dev $$1, jh $$2, jm $$3, float $$4) {
      jm $$5 = $$3.h();
      jm $$6 = $$5.a($$4) ? $$5.g() : $$5;
      if (b($$1, $$2)) {
         return a($$0, $$1, $$2, $$3, $$6);
      } else {
         int[][] $$7 = a($$3, $$6);
         Optional<ezy> $$8 = a($$0, $$1, $$2, $$7, true);
         return $$8.isPresent() ? $$8 : a($$0, $$1, $$2, $$7, false);
      }
   }

   private static Optional<ezy> a(bus<?> $$0, dev $$1, jh $$2, jm $$3, jm $$4) {
      int[][] $$5 = b($$3, $$4);
      Optional<ezy> $$6 = a($$0, $$1, $$2, $$5, true);
      if ($$6.isPresent()) {
         return $$6;
      } else {
         jh $$7 = $$2.e();
         Optional<ezy> $$8 = a($$0, $$1, $$7, $$5, true);
         if ($$8.isPresent()) {
            return $$8;
         } else {
            int[][] $$9 = a($$3);
            Optional<ezy> $$10 = a($$0, $$1, $$2, $$9, true);
            if ($$10.isPresent()) {
               return $$10;
            } else {
               Optional<ezy> $$11 = a($$0, $$1, $$2, $$5, false);
               if ($$11.isPresent()) {
                  return $$11;
               } else {
                  Optional<ezy> $$12 = a($$0, $$1, $$7, $$5, false);
                  return $$12.isPresent() ? $$12 : a($$0, $$1, $$2, $$9, false);
               }
            }
         }
      }
   }

   private static Optional<ezy> a(bus<?> $$0, dev $$1, jh $$2, int[][] $$3, boolean $$4) {
      jh.a $$5 = new jh.a();

      for (int[] $$6 : $$3) {
         $$5.d($$2.u() + $$6[0], $$2.v(), $$2.w() + $$6[1]);
         ezy $$7 = cqz.a($$0, $$1, $$5, $$4);
         if ($$7 != null) {
            return Optional.of($$7);
         }
      }

      return Optional.empty();
   }

   @Override
   protected dow a_(dvv $$0) {
      return dow.b;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(aF, b, c);
   }

   @Override
   public dsy a(jh $$0, dvv $$1) {
      return new dsu($$0, $$1, this.o);
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, @Nullable bvh $$3, cwm $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if (!$$0.C) {
         jh $$5 = $$1.a($$2.c(aF));
         $$0.a($$5, $$2.b(b, dwi.a), 3);
         $$0.b($$1, dis.a);
         $$2.a($$0, $$1, 3);
      }
   }

   public cvj b() {
      return this.o;
   }

   @Override
   protected long a(dvv $$0, jh $$1) {
      jh $$2 = $$1.a($$0.c(aF), $$0.c(b) == dwi.a ? 0 : 1);
      return azm.b($$2.u(), $$1.v(), $$2.w());
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
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
