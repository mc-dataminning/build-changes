import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dss {
   private final Object2IntSortedMap<cvn> a;

   dss(Object2IntSortedMap<cvn> $$0) {
      this.a = $$0;
   }

   public boolean a(cvs $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cvn> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cvs $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dss a(jq.a $$0, cqq $$1) {
      return a($$0, $$1, 200);
   }

   public static dss a(jq.a $$0, cqq $$1, int $$2) {
      return new dss.a($$0, $$1)
         .a(cvw.qB, $$2 * 100)
         .a(dho.iB, $$2 * 8 * 10)
         .a(cvw.sh, $$2 * 12)
         .a(cvw.oy, $$2 * 8)
         .a(cvw.oz, $$2 * 8)
         .a(axe.r, $$2 * 3 / 2)
         .a(axe.C, $$2 * 3 / 2)
         .a(axe.b, $$2 * 3 / 2)
         .a(dho.w, $$2 * 3 / 2)
         .a(axe.i, $$2 * 3 / 2)
         .a(dho.hU, $$2 * 3 / 2)
         .a(axe.j, $$2 * 3 / 4)
         .a(dho.jC, $$2 * 3 / 4)
         .a(axe.n, $$2 * 3 / 2)
         .a(axe.m, $$2 * 3 / 2)
         .a(axe.k, $$2 * 3 / 2)
         .a(axe.l, $$2 * 3 / 2)
         .a(dho.aY, $$2 * 3 / 2)
         .a(dho.cl, $$2 * 3 / 2)
         .a(dho.cm, $$2 * 3 / 2)
         .a(dho.oa, $$2 * 3 / 2)
         .a(dho.dT, $$2 * 3 / 2)
         .a(dho.cv, $$2 * 3 / 2)
         .a(dho.gV, $$2 * 3 / 2)
         .a(dho.cA, $$2 * 3 / 2)
         .a(dho.gZ, $$2 * 3 / 2)
         .a(axe.E, $$2 * 3 / 2)
         .a(cvw.ow, $$2 * 3 / 2)
         .a(cvw.qW, $$2 * 3 / 2)
         .a(dho.cO, $$2 * 3 / 2)
         .a(axe.aQ, $$2)
         .a(axe.bi, $$2 * 4)
         .a(cvw.oO, $$2)
         .a(cvw.oN, $$2)
         .a(cvw.oR, $$2)
         .a(cvw.oQ, $$2)
         .a(cvw.oP, $$2)
         .a(axe.h, $$2)
         .a(axe.aN, $$2 * 6)
         .a(axe.a, $$2 / 2)
         .a(axe.d, $$2 / 2)
         .a(cvw.pr, $$2 / 2)
         .a(axe.p, $$2 / 2)
         .a(cvw.ou, $$2 / 2)
         .a(axe.g, 1 + $$2 / 3)
         .a(dho.me, 1 + $$2 * 20)
         .a(cvw.vX, $$2 * 3 / 2)
         .a(dho.mZ, $$2 / 4)
         .a(dho.bv, $$2 / 2)
         .a(dho.nS, $$2 / 4)
         .a(dho.nT, $$2 * 3 / 2)
         .a(dho.nU, $$2 * 3 / 2)
         .a(dho.nX, $$2 * 3 / 2)
         .a(dho.nY, $$2 * 3 / 2)
         .a(dho.ob, $$2 * 3 / 2)
         .a(dho.pc, $$2 * 3 / 2)
         .a(dho.sy, $$2 / 2)
         .a(dho.sz, $$2 / 2)
         .a(dho.ac, $$2 * 3 / 2)
         .a(axe.aH)
         .a();
   }

   public static class a {
      private final jq<cvn> a;
      private final cqq b;
      private final Object2IntSortedMap<cvn> c = new Object2IntLinkedOpenHashMap();

      public a(jq.a $$0, cqq $$1) {
         this.a = $$0.d(lw.K);
         this.b = $$1;
      }

      public dss a() {
         return new dss(this.c);
      }

      public dss.a a(axl<cvn> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.n().a($$0));
         return this;
      }

      public dss.a a(axl<cvn> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jo<cvn> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dss.a a(dei $$0, int $$1) {
         cvn $$2 = $$0.q();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cvn $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
