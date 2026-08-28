import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dyq {
   private final Object2IntSortedMap<czj> a;

   dyq(Object2IntSortedMap<czj> $$0) {
      this.a = $$0;
   }

   public boolean a(czn $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<czj> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(czn $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dyq a(jh.a $$0, cuw $$1) {
      return a($$0, $$1, 200);
   }

   public static dyq a(jh.a $$0, cuw $$1, int $$2) {
      return new dyq.a($$0, $$1)
         .a(czr.rq, $$2 * 100)
         .a(dmt.jd, $$2 * 8 * 10)
         .a(czr.to, $$2 * 12)
         .a(czr.pl, $$2 * 8)
         .a(czr.pm, $$2 * 8)
         .a(axk.r, $$2 * 3 / 2)
         .a(axk.D, $$2 * 3 / 2)
         .a(axk.b, $$2 * 3 / 2)
         .a(dmt.y, $$2 * 3 / 2)
         .a(axk.i, $$2 * 3 / 2)
         .a(dmt.iw, $$2 * 3 / 2)
         .a(axk.j, $$2 * 3 / 4)
         .a(dmt.kf, $$2 * 3 / 4)
         .a(axk.n, $$2 * 3 / 2)
         .a(axk.m, $$2 * 3 / 2)
         .a(axk.k, $$2 * 3 / 2)
         .a(axk.l, $$2 * 3 / 2)
         .a(dmt.bf, $$2 * 3 / 2)
         .a(dmt.cv, $$2 * 3 / 2)
         .a(dmt.cw, $$2 * 3 / 2)
         .a(dmt.oG, $$2 * 3 / 2)
         .a(dmt.ek, $$2 * 3 / 2)
         .a(dmt.cG, $$2 * 3 / 2)
         .a(dmt.hw, $$2 * 3 / 2)
         .a(dmt.cL, $$2 * 3 / 2)
         .a(dmt.hA, $$2 * 3 / 2)
         .a(axk.F, $$2 * 3 / 2)
         .a(czr.pj, $$2 * 3 / 2)
         .a(czr.sd, $$2 * 3 / 2)
         .a(dmt.da, $$2 * 3 / 2)
         .a(axk.aV, $$2)
         .a(axk.bv, $$2 * 4)
         .a(czr.pB, $$2)
         .a(czr.pA, $$2)
         .a(czr.pE, $$2)
         .a(czr.pD, $$2)
         .a(czr.pC, $$2)
         .a(axk.h, $$2)
         .a(axk.aS, $$2 * 6)
         .a(axk.a, $$2 / 2)
         .a(axk.d, $$2 / 2)
         .a(czr.qe, $$2 / 2)
         .a(axk.p, $$2 / 2)
         .a(czr.ph, $$2 / 2)
         .a(axk.g, 1 + $$2 / 3)
         .a(dmt.mK, 1 + $$2 * 20)
         .a(czr.xg, $$2 * 3 / 2)
         .a(dmt.nF, $$2 / 4)
         .a(dmt.bC, $$2 / 2)
         .a(dmt.bE, $$2 / 2)
         .a(dmt.bF, $$2 / 2)
         .a(dmt.oy, $$2 / 4)
         .a(dmt.oz, $$2 * 3 / 2)
         .a(dmt.oA, $$2 * 3 / 2)
         .a(dmt.oD, $$2 * 3 / 2)
         .a(dmt.oE, $$2 * 3 / 2)
         .a(dmt.oH, $$2 * 3 / 2)
         .a(dmt.pK, $$2 * 3 / 2)
         .a(dmt.tg, $$2 / 2)
         .a(dmt.th, $$2 / 2)
         .a(dmt.ag, $$2 * 3 / 2)
         .a(dmt.tl, $$2 / 2)
         .a(axk.aM)
         .a();
   }

   public static class a {
      private final jh<czj> a;
      private final cuw b;
      private final Object2IntSortedMap<czj> c = new Object2IntLinkedOpenHashMap();

      public a(jh.a $$0, cuw $$1) {
         this.a = $$0.e(mh.K);
         this.b = $$1;
      }

      public dyq a() {
         return new dyq(this.c);
      }

      public dyq.a a(axr<czj> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.e().a($$0));
         return this;
      }

      public dyq.a a(axr<czj> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jf<czj> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dyq.a a(djl $$0, int $$1) {
         czj $$2 = $$0.h();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, czj $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
