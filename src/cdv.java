import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public class cdv extends bof<cds> {
   private static final int c = 4;
   private static final int d = 10;
   private static final int e = 2;
   private static final int f = Math.round(10.0F);
   private static final float g = 1.4F;
   private static final ObjectArrayList<Integer> h = new ObjectArrayList(Lists.newArrayList(new Integer[]{40, 55, 60, 75, 80}));

   @VisibleForTesting
   public cdv() {
      super(Map.of(bvq.o, bvr.a, bvq.aU, bvr.b, bvq.aZ, bvr.c, bvq.ba, bvr.c, bvq.aV, bvr.b, bvq.m, bvr.b, bvq.bb, bvr.c), 200);
   }

   protected boolean a(ane $$0, cds $$1) {
      if (!$$1.aC() && !$$1.aZ()) {
         return false;
      } else if (bqz.a($$1)) {
         return false;
      } else if ($$1.dN().a(bvq.ba, bvr.a)) {
         return true;
      } else {
         bmo $$2 = $$1.dN().c(bvq.o).orElse(null);
         if ($$2 == null) {
            return false;
         } else if (a($$1, $$2)) {
            $$1.dN().b(bvq.o);
            return false;
         } else if (b($$1, $$2)) {
            return false;
         } else if (!b($$0, $$1)) {
            return false;
         } else {
            hx $$3 = a($$1, cdu.a($$2, $$1.eg()));
            if ($$3 == null) {
               return false;
            } else if (!cdu.a($$1, $$3.b()) && !cdu.a($$1, $$3.b(4).b())) {
               return false;
            } else {
               $$1.dN().a(bvq.ba, $$3);
               return true;
            }
         }
      }
   }

   protected boolean a(ane $$0, cds $$1, long $$2) {
      return $$1.ap() != bna.a && !$$1.dN().a(bvq.aU);
   }

   protected void b(ane $$0, cds $$1, long $$2) {
      if ($$1.dN().a(bvq.aZ, bvr.b)) {
         $$1.dN().a(bvq.aZ, avt.a, (long)f);
      }

      $$1.b(bna.r);
      $$0.a(null, $$1, art.cw, aru.f, 1.0F, 1.0F);
      $$1.dN().c(bvq.ba).ifPresent($$1x -> $$1.a(ee.a.b, $$1x.b()));
   }

   protected void c(ane $$0, cds $$1, long $$2) {
      boolean $$3 = $$1.aZ();
      if (!$$3 && $$1.dN().a(bvq.bb, bvr.a)) {
         $$1.dN().b(bvq.bb);
      }

      if (a($$1)) {
         emc $$4 = $$1.dN().c(bvq.ba).flatMap($$1x -> a($$1, $$1.eg(), emc.c($$1x))).orElse(null);
         if ($$4 == null) {
            $$1.b(bna.a);
            return;
         }

         if ($$3) {
            $$1.dN().a(bvq.bb, avt.a);
         }

         $$1.a(art.cC, 1.0F, 1.0F);
         $$1.b(bna.g);
         $$1.r($$1.aU);
         $$1.p(true);
         $$1.g($$4);
      } else if (b($$1)) {
         $$1.a(art.cD, 1.0F, 1.0F);
         $$1.b(bna.a);
         $$1.p(false);
         boolean $$5 = $$1.dN().a(bvq.x);
         $$1.dN().a(bvq.aU, avt.a, $$5 ? 2L : 10L);
         $$1.dN().a(bvq.aV, avt.a, 100L);
      }
   }

   protected void d(ane $$0, cds $$1, long $$2) {
      if ($$1.ap() == bna.g || $$1.ap() == bna.r) {
         $$1.b(bna.a);
      }

      $$1.dN().b(bvq.ba);
      $$1.dN().b(bvq.aZ);
      $$1.dN().b(bvq.bb);
   }

   private static boolean a(cds $$0) {
      return $$0.dN().c(bvq.aZ).isEmpty() && $$0.ap() == bna.r;
   }

   private static boolean b(cds $$0) {
      boolean $$1 = $$0.ap() == bna.g;
      boolean $$2 = $$0.aC();
      boolean $$3 = $$0.aZ() && $$0.dN().a(bvq.bb, bvr.b);
      return $$1 && ($$2 || $$3);
   }

   @Nullable
   private static hx a(bmo $$0, emc $$1) {
      ctg $$2 = new ctg($$1, $$1.a(ic.a, 10.0), ctg.a.a, ctg.b.a, $$0);
      ema $$3 = $$0.dL().a($$2);
      if ($$3.c() == ema.a.b) {
         return hx.a($$3.e()).c();
      } else {
         ctg $$4 = new ctg($$1, $$1.a(ic.b, 10.0), ctg.a.a, ctg.b.a, $$0);
         ema $$5 = $$0.dL().a($$4);
         return $$5.c() == ema.a.b ? hx.a($$3.e()).c() : null;
      }
   }

   private static boolean a(cds $$0, bmo $$1) {
      return !$$1.a($$0, 24.0);
   }

   private static boolean b(cds $$0, bmo $$1) {
      return $$1.e($$0) - 4.0F <= 0.0F;
   }

   private static boolean b(ane $$0, cds $$1) {
      hx $$2 = $$1.dl();

      for (int $$3 = 1; $$3 <= 4; $$3++) {
         hx $$4 = $$2.a(ic.b, $$3);
         if (!$$0.a_($$4).i() && !$$0.b_($$4).a(asn.a)) {
            return false;
         }
      }

      return true;
   }

   private static Optional<emc> a(cds $$0, auw $$1, emc $$2) {
      for (int $$4 : ac.a(h, $$1)) {
         Optional<emc> $$5 = bpj.a($$0, $$2, 1.4F, $$4, false);
         if ($$5.isPresent()) {
            return $$5;
         }
      }

      return Optional.empty();
   }
}
