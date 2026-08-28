import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cml extends bwo<cmi> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cml() {
      super(Map.of(cdz.o, cea.a, cdz.aU, cea.b, cdz.aZ, cea.c, cdz.ba, cea.c, cdz.aV, cea.b, cdz.m, cea.b, cdz.bb, cea.c), 200);
   }

   public static boolean a(arm $$0, cmi $$1) {
      if (!$$1.aJ() && !$$1.bk()) {
         return false;
      } else if (bzi.a($$1)) {
         return false;
      } else if ($$1.ed().a(cdz.ba, cea.a)) {
         return true;
      } else {
         buv $$2 = $$1.ed().c(cdz.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.ed().b(cdz.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            jg $$3 = a($$1, cmk.a($$2, $$1.ea()));
            if ($$3 == null) {
               return false;
            } else {
               dvd $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cmk.a($$1, $$3.b()) && !cmk.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.ed().a(cdz.ba, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(arm $$0, cmi $$1) {
      return a($$0, $$1);
   }

   protected boolean a(arm $$0, cmi $$1, long $$2) {
      return $$1.ax() != bvh.a && !$$1.ed().a(cdz.aU);
   }

   protected void b(arm $$0, cmi $$1, long $$2) {
      if ($$1.ed().a(cdz.aZ, cea.b)) {
         $$1.ed().a(cdz.aZ, bao.a, (long)f);
      }

      $$1.b(bvh.r);
      $$0.a(null, $$1, awk.cE, awl.f, 1.0F, 1.0F);
      $$1.ed().c(cdz.ba).ifPresent($$1x -> $$1.a(fh.a.b, $$1x.b()));
   }

   protected void c(arm $$0, cmi $$1, long $$2) {
      boolean $$3 = $$1.bk();
      if (!$$3 && $$1.ed().a(cdz.bb, cea.a)) {
         $$1.ed().b(cdz.bb);
      }

      if (a($$1)) {
         ezh $$4 = $$1.ed().c(cdz.ba).flatMap($$1x -> a($$1, $$1.ea(), ezh.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bvh.a);
            return;
         }

         if ($$3) {
            $$1.ed().a(cdz.bb, bao.a);
         }

         $$1.a(awk.cK, 1.0F, 1.0F);
         $$1.b(bvh.g);
         $$1.v($$1.aU);
         $$1.r(true);
         $$1.h($$4);
      } else if (b($$1)) {
         $$1.a(awk.cL, 1.0F, 1.0F);
         $$1.b(bvh.a);
         $$1.r(false);
         boolean $$5 = $$1.ed().a(cdz.x);
         $$1.ed().a(cdz.aU, bao.a, $$5 ? 2L : 10L);
         $$1.ed().a(cdz.aV, bao.a, 100L);
      }
   }

   protected void d(arm $$0, cmi $$1, long $$2) {
      if ($$1.ax() == bvh.g || $$1.ax() == bvh.r) {
         $$1.b(bvh.a);
      }

      $$1.ed().b(cdz.ba);
      $$1.ed().b(cdz.aZ);
      $$1.ed().b(cdz.bb);
   }

   private static boolean a(cmi $$0) {
      return $$0.ed().c(cdz.aZ).isEmpty() && $$0.ax() == bvh.r;
   }

   private static boolean b(cmi $$0) {
      boolean $$1 = $$0.ax() == bvh.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bk() && $$0.ed().a(cdz.bb, cea.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static jg a(buv $$0, ezh $$1) {
      ded $$2 = new ded($$1, $$1.a(jl.a, 10.0), ded.a.a, ded.b.a, $$0);
      ezf $$3 = $$0.dX().a($$2);
      if ($$3.d() == ezf.a.b) {
         return jg.a((jz)$$3.g()).d();
      } else {
         ded $$4 = new ded($$1, $$1.a(jl.b, 10.0), ded.a.a, ded.b.a, $$0);
         ezf $$5 = $$0.dX().a($$4);
         return $$5.d() == ezf.a.b ? jg.a((jz)$$5.g()).d() : null;
      }
   }

   private static boolean a(cmi $$0, buv $$1) {
      return !$$1.a($$0, $$0.h(bwd.m));
   }

   private static boolean b(cmi $$0, buv $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(arm $$0, cmi $$1) {
      jg $$2 = $$1.dx();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         jg $$4 = $$2.a(jl.b, $$3);
         if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axf.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<ezh> a(cmi $$0, azr $$1, ezh $$2) {
      for (int $$4 : ad.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(bwd.m);
         Optional<ezh> $$6 = bxs.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            return $$6;
         }
      }

      return Optional.empty();
   }
}
