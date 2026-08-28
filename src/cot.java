import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cot extends byq<coq> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 24.0F;
   private static final float h = 1.4F;
   private static final float i = 0.058333334F;
   private static final ObjectArrayList<Integer> j = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cot() {
      super(Map.of(cgb.p, cgc.a, cgb.aV, cgc.b, cgb.ba, cgc.c, cgb.bb, cgc.c, cgb.aW, cgc.b, cgb.n, cgc.b, cgb.bc, cgc.c), 200);
   }

   public static boolean a(aro $$0, coq $$1) {
      if (!$$1.aJ() && !$$1.bj()) {
         return false;
      } else if (cbk.a($$1)) {
         return false;
      } else if ($$1.eb().a(cgb.bb, cgc.a)) {
         return true;
      } else {
         bwz $$2 = $$1.eb().c(cgb.p).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.eb().b(cgb.p);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!c($$0, $$1)) {
            return false;
         } else {
            iu $$3 = a($$1, cos.a($$2, $$1.dY()));
            if ($$3 == null) {
               return false;
            } else {
               dzo $$4 = $$0.a_($$3.e());
               if ($$1.aq().a($$4)) {
                  return false;
               } else if (!cos.a($$1, $$3.b()) && !cos.a($$1, $$3.b(4).b())) {
                  return false;
               } else {
                  $$1.eb().a(cgb.bb, $$3);
                  return true;
               }
            }
         }
      }
   }

   protected boolean b(aro $$0, coq $$1) {
      return a($$0, $$1);
   }

   protected boolean a(aro $$0, coq $$1, long $$2) {
      return $$1.aw() != bxl.a && !$$1.eb().a(cgb.aV);
   }

   protected void b(aro $$0, coq $$1, long $$2) {
      if ($$1.eb().a(cgb.ba, cgc.b)) {
         $$1.eb().a(cgb.ba, bas.a, (long)f);
      }

      $$1.b(bxl.r);
      $$0.a(null, $$1, awl.cE, awm.f, 1.0F, 1.0F);
      $$1.eb().c(cgb.bb).ifPresent($$1x -> $$1.a(eu.a.b, $$1x.b()));
   }

   protected void c(aro $$0, coq $$1, long $$2) {
      boolean $$3 = $$1.bj();
      if (!$$3 && $$1.eb().a(cgb.bc, cgc.a)) {
         $$1.eb().b(cgb.bc);
      }

      if (a($$1)) {
         fdw $$4 = $$1.eb().c(cgb.bb).flatMap($$1x -> a($$1, $$1.dY(), fdw.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bxl.a);
            return;
         }

         if ($$3) {
            $$1.eb().a(cgb.bc, bas.a);
         }

         $$1.a(awl.cK, 1.0F, 1.0F);
         $$1.b(bxl.g);
         $$1.w($$1.aV);
         $$1.q(true);
         $$1.i($$4);
      } else if (b($$1)) {
         $$1.a(awl.cL, 1.0F, 1.0F);
         $$1.b(bxl.a);
         $$1.q(false);
         boolean $$5 = $$1.eb().a(cgb.y);
         $$1.eb().a(cgb.aV, bas.a, $$5 ? 2L : 10L);
         $$1.eb().a(cgb.aW, bas.a, 100L);
      }
   }

   protected void d(aro $$0, coq $$1, long $$2) {
      if ($$1.aw() == bxl.g || $$1.aw() == bxl.r) {
         $$1.b(bxl.a);
      }

      $$1.eb().b(cgb.bb);
      $$1.eb().b(cgb.ba);
      $$1.eb().b(cgb.bc);
   }

   private static boolean a(coq $$0) {
      return $$0.eb().c(cgb.ba).isEmpty() && $$0.aw() == bxl.r;
   }

   private static boolean b(coq $$0) {
      boolean $$1 = $$0.aw() == bxl.g;
      boolean $$2 = $$0.aJ();
      boolean $$3 = $$0.bj() && $$0.eb().a(cgb.bc, cgc.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static iu a(bwz $$0, fdw $$1) {
      dhy $$2 = new dhy($$1, $$1.a(ja.a, 10.0), dhy.a.a, dhy.b.a, $$0);
      fdu $$3 = $$0.dV().a($$2);
      if ($$3.d() == fdu.a.b) {
         return iu.a((jo)$$3.g()).d();
      } else {
         dhy $$4 = new dhy($$1, $$1.a(ja.b, 10.0), dhy.a.a, dhy.b.a, $$0);
         fdu $$5 = $$0.dV().a($$4);
         return $$5.d() == fdu.a.b ? iu.a((jo)$$5.g()).d() : null;
      }
   }

   private static boolean a(coq $$0, bwz $$1) {
      return !$$1.a($$0, $$0.h(byf.m));
   }

   private static boolean b(coq $$0, bwz $$1) {
      return $$1.f($$0) - 4.0F <= 0.0F;
   }

   private static boolean c(aro $$0, coq $$1) {
      iu $$2 = $$1.dv();
      if ($$0.a_($$2).a(dlw.pK)) {
         return false;
      } else {
         for (int $$3 = 1; $$3 <= 4; $$3++) {
            iu $$4 = $$2.a(ja.b, $$3);
            if (!$$0.a_($$4).l() && !$$0.b_($$4).a(axf.a)) {
               return false;
            }
         }

         return true;
      }
   }

   private static Optional<fdw> a(coq $$0, azt $$1, fdw $$2) {
      for (int $$4 : af.a(j, $$1)) {
         float $$5 = 0.058333334F * (float)$$0.h(byf.m);
         Optional<fdw> $$6 = bzu.a($$0, $$2, $$5, $$4, false);
         if ($$6.isPresent()) {
            if ($$0.b(bvg.h)) {
               double $$7 = $$6.get().d().e * (double)$$0.fh();
               return $$6.map($$1x -> $$1x.b(0.0, $$7, 0.0));
            }

            return $$6;
         }
      }

      return Optional.empty();
   }
}
