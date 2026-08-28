import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dzb {
   private final Object2IntSortedMap<czu> a;

   dzb(Object2IntSortedMap<czu> $$0) {
      this.a = $$0;
   }

   public boolean a(czy $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<czu> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(czy $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dzb a(jh.a $$0, cvh $$1) {
      return a($$0, $$1, 200);
   }

   public static dzb a(jh.a $$0, cvh $$1, int $$2) {
      return new dzb.a($$0, $$1)
         .a(dac.rq, $$2 * 100)
         .a(dne.jd, $$2 * 8 * 10)
         .a(dac.to, $$2 * 12)
         .a(dac.pl, $$2 * 8)
         .a(dac.pm, $$2 * 8)
         .a(axm.r, $$2 * 3 / 2)
         .a(axm.D, $$2 * 3 / 2)
         .a(axm.b, $$2 * 3 / 2)
         .a(dne.y, $$2 * 3 / 2)
         .a(axm.i, $$2 * 3 / 2)
         .a(dne.iw, $$2 * 3 / 2)
         .a(axm.j, $$2 * 3 / 4)
         .a(dne.kf, $$2 * 3 / 4)
         .a(axm.n, $$2 * 3 / 2)
         .a(axm.m, $$2 * 3 / 2)
         .a(axm.k, $$2 * 3 / 2)
         .a(axm.l, $$2 * 3 / 2)
         .a(dne.bf, $$2 * 3 / 2)
         .a(dne.cv, $$2 * 3 / 2)
         .a(dne.cw, $$2 * 3 / 2)
         .a(dne.oG, $$2 * 3 / 2)
         .a(dne.ek, $$2 * 3 / 2)
         .a(dne.cG, $$2 * 3 / 2)
         .a(dne.hw, $$2 * 3 / 2)
         .a(dne.cL, $$2 * 3 / 2)
         .a(dne.hA, $$2 * 3 / 2)
         .a(axm.F, $$2 * 3 / 2)
         .a(dac.pj, $$2 * 3 / 2)
         .a(dac.sd, $$2 * 3 / 2)
         .a(dne.da, $$2 * 3 / 2)
         .a(axm.aV, $$2)
         .a(axm.bv, $$2 * 4)
         .a(dac.pB, $$2)
         .a(dac.pA, $$2)
         .a(dac.pE, $$2)
         .a(dac.pD, $$2)
         .a(dac.pC, $$2)
         .a(axm.h, $$2)
         .a(axm.aS, $$2 * 6)
         .a(axm.a, $$2 / 2)
         .a(axm.d, $$2 / 2)
         .a(dac.qe, $$2 / 2)
         .a(axm.p, $$2 / 2)
         .a(dac.ph, $$2 / 2)
         .a(axm.g, 1 + $$2 / 3)
         .a(dne.mK, 1 + $$2 * 20)
         .a(dac.xg, $$2 * 3 / 2)
         .a(dne.nF, $$2 / 4)
         .a(dne.bC, $$2 / 2)
         .a(dne.bE, $$2 / 2)
         .a(dne.bF, $$2 / 2)
         .a(dne.oy, $$2 / 4)
         .a(dne.oz, $$2 * 3 / 2)
         .a(dne.oA, $$2 * 3 / 2)
         .a(dne.oD, $$2 * 3 / 2)
         .a(dne.oE, $$2 * 3 / 2)
         .a(dne.oH, $$2 * 3 / 2)
         .a(dne.pK, $$2 * 3 / 2)
         .a(dne.tg, $$2 / 2)
         .a(dne.th, $$2 / 2)
         .a(dne.ag, $$2 * 3 / 2)
         .a(dne.tl, $$2 / 2)
         .a(axm.aM)
         .a();
   }

   public static class a {
      private final jh<czu> a;
      private final cvh b;
      private final Object2IntSortedMap<czu> c = new Object2IntLinkedOpenHashMap();

      public a(jh.a $$0, cvh $$1) {
         this.a = $$0.e(mh.K);
         this.b = $$1;
      }

      public dzb a() {
         return new dzb(this.c);
      }

      public dzb.a a(axt<czu> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.e().a($$0));
         return this;
      }

      public dzb.a a(axt<czu> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jf<czu> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dzb.a a(djw $$0, int $$1) {
         czu $$2 = $$0.h();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, czu $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
