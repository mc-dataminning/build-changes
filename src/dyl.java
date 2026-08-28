import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dyl {
   private final Object2IntSortedMap<czg> a;

   dyl(Object2IntSortedMap<czg> $$0) {
      this.a = $$0;
   }

   public boolean a(czk $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<czg> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(czk $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dyl a(jh.a $$0, cut $$1) {
      return a($$0, $$1, 200);
   }

   public static dyl a(jh.a $$0, cut $$1, int $$2) {
      return new dyl.a($$0, $$1)
         .a(czo.rq, $$2 * 100)
         .a(dmo.jd, $$2 * 8 * 10)
         .a(czo.to, $$2 * 12)
         .a(czo.pl, $$2 * 8)
         .a(czo.pm, $$2 * 8)
         .a(axk.r, $$2 * 3 / 2)
         .a(axk.D, $$2 * 3 / 2)
         .a(axk.b, $$2 * 3 / 2)
         .a(dmo.y, $$2 * 3 / 2)
         .a(axk.i, $$2 * 3 / 2)
         .a(dmo.iw, $$2 * 3 / 2)
         .a(axk.j, $$2 * 3 / 4)
         .a(dmo.kf, $$2 * 3 / 4)
         .a(axk.n, $$2 * 3 / 2)
         .a(axk.m, $$2 * 3 / 2)
         .a(axk.k, $$2 * 3 / 2)
         .a(axk.l, $$2 * 3 / 2)
         .a(dmo.bf, $$2 * 3 / 2)
         .a(dmo.cv, $$2 * 3 / 2)
         .a(dmo.cw, $$2 * 3 / 2)
         .a(dmo.oG, $$2 * 3 / 2)
         .a(dmo.ek, $$2 * 3 / 2)
         .a(dmo.cG, $$2 * 3 / 2)
         .a(dmo.hw, $$2 * 3 / 2)
         .a(dmo.cL, $$2 * 3 / 2)
         .a(dmo.hA, $$2 * 3 / 2)
         .a(axk.F, $$2 * 3 / 2)
         .a(czo.pj, $$2 * 3 / 2)
         .a(czo.sd, $$2 * 3 / 2)
         .a(dmo.da, $$2 * 3 / 2)
         .a(axk.aV, $$2)
         .a(axk.bv, $$2 * 4)
         .a(czo.pB, $$2)
         .a(czo.pA, $$2)
         .a(czo.pE, $$2)
         .a(czo.pD, $$2)
         .a(czo.pC, $$2)
         .a(axk.h, $$2)
         .a(axk.aS, $$2 * 6)
         .a(axk.a, $$2 / 2)
         .a(axk.d, $$2 / 2)
         .a(czo.qe, $$2 / 2)
         .a(axk.p, $$2 / 2)
         .a(czo.ph, $$2 / 2)
         .a(axk.g, 1 + $$2 / 3)
         .a(dmo.mK, 1 + $$2 * 20)
         .a(czo.xg, $$2 * 3 / 2)
         .a(dmo.nF, $$2 / 4)
         .a(dmo.bC, $$2 / 2)
         .a(dmo.bE, $$2 / 2)
         .a(dmo.bF, $$2 / 2)
         .a(dmo.oy, $$2 / 4)
         .a(dmo.oz, $$2 * 3 / 2)
         .a(dmo.oA, $$2 * 3 / 2)
         .a(dmo.oD, $$2 * 3 / 2)
         .a(dmo.oE, $$2 * 3 / 2)
         .a(dmo.oH, $$2 * 3 / 2)
         .a(dmo.pK, $$2 * 3 / 2)
         .a(dmo.tg, $$2 / 2)
         .a(dmo.th, $$2 / 2)
         .a(dmo.ag, $$2 * 3 / 2)
         .a(dmo.tl, $$2 / 2)
         .a(axk.aM)
         .a();
   }

   public static class a {
      private final jh<czg> a;
      private final cut b;
      private final Object2IntSortedMap<czg> c = new Object2IntLinkedOpenHashMap();

      public a(jh.a $$0, cut $$1) {
         this.a = $$0.e(mh.K);
         this.b = $$1;
      }

      public dyl a() {
         return new dyl(this.c);
      }

      public dyl.a a(axr<czg> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.e().a($$0));
         return this;
      }

      public dyl.a a(axr<czg> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jf<czg> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dyl.a a(djg $$0, int $$1) {
         czg $$2 = $$0.h();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, czg $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
