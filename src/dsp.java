import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dsp {
   private final Object2IntSortedMap<cvk> a;

   dsp(Object2IntSortedMap<cvk> $$0) {
      this.a = $$0;
   }

   public boolean a(cvp $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cvk> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cvp $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dsp a(jp.a $$0, cqn $$1) {
      return a($$0, $$1, 200);
   }

   public static dsp a(jp.a $$0, cqn $$1, int $$2) {
      return new dsp.a($$0, $$1)
         .a(cvt.qB, $$2 * 100)
         .a(dhl.iB, $$2 * 8 * 10)
         .a(cvt.sh, $$2 * 12)
         .a(cvt.oy, $$2 * 8)
         .a(cvt.oz, $$2 * 8)
         .a(axc.r, $$2 * 3 / 2)
         .a(axc.C, $$2 * 3 / 2)
         .a(axc.b, $$2 * 3 / 2)
         .a(dhl.w, $$2 * 3 / 2)
         .a(axc.i, $$2 * 3 / 2)
         .a(dhl.hU, $$2 * 3 / 2)
         .a(axc.j, $$2 * 3 / 4)
         .a(dhl.jC, $$2 * 3 / 4)
         .a(axc.n, $$2 * 3 / 2)
         .a(axc.m, $$2 * 3 / 2)
         .a(axc.k, $$2 * 3 / 2)
         .a(axc.l, $$2 * 3 / 2)
         .a(dhl.aY, $$2 * 3 / 2)
         .a(dhl.cl, $$2 * 3 / 2)
         .a(dhl.cm, $$2 * 3 / 2)
         .a(dhl.oa, $$2 * 3 / 2)
         .a(dhl.dT, $$2 * 3 / 2)
         .a(dhl.cv, $$2 * 3 / 2)
         .a(dhl.gV, $$2 * 3 / 2)
         .a(dhl.cA, $$2 * 3 / 2)
         .a(dhl.gZ, $$2 * 3 / 2)
         .a(axc.E, $$2 * 3 / 2)
         .a(cvt.ow, $$2 * 3 / 2)
         .a(cvt.qW, $$2 * 3 / 2)
         .a(dhl.cO, $$2 * 3 / 2)
         .a(axc.aQ, $$2)
         .a(axc.bi, $$2 * 4)
         .a(cvt.oO, $$2)
         .a(cvt.oN, $$2)
         .a(cvt.oR, $$2)
         .a(cvt.oQ, $$2)
         .a(cvt.oP, $$2)
         .a(axc.h, $$2)
         .a(axc.aN, $$2 * 6)
         .a(axc.a, $$2 / 2)
         .a(axc.d, $$2 / 2)
         .a(cvt.pr, $$2 / 2)
         .a(axc.p, $$2 / 2)
         .a(cvt.ou, $$2 / 2)
         .a(axc.g, 1 + $$2 / 3)
         .a(dhl.me, 1 + $$2 * 20)
         .a(cvt.vX, $$2 * 3 / 2)
         .a(dhl.mZ, $$2 / 4)
         .a(dhl.bv, $$2 / 2)
         .a(dhl.nS, $$2 / 4)
         .a(dhl.nT, $$2 * 3 / 2)
         .a(dhl.nU, $$2 * 3 / 2)
         .a(dhl.nX, $$2 * 3 / 2)
         .a(dhl.nY, $$2 * 3 / 2)
         .a(dhl.ob, $$2 * 3 / 2)
         .a(dhl.pc, $$2 * 3 / 2)
         .a(dhl.sy, $$2 / 2)
         .a(dhl.sz, $$2 / 2)
         .a(dhl.ac, $$2 * 3 / 2)
         .a(axc.aH)
         .a();
   }

   public static class a {
      private final jp<cvk> a;
      private final cqn b;
      private final Object2IntSortedMap<cvk> c = new Object2IntLinkedOpenHashMap();

      public a(jp.a $$0, cqn $$1) {
         this.a = $$0.b(lv.K);
         this.b = $$1;
      }

      public dsp a() {
         return new dsp(this.c);
      }

      public dsp.a a(axj<cvk> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.n().a($$0));
         return this;
      }

      public dsp.a a(axj<cvk> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jn<cvk> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dsp.a a(def $$0, int $$1) {
         cvk $$2 = $$0.q();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cvk $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
