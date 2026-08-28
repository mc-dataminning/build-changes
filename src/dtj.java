import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dtj {
   private final Object2IntSortedMap<cvx> a;

   dtj(Object2IntSortedMap<cvx> $$0) {
      this.a = $$0;
   }

   public boolean a(cwb $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cvx> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cwb $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dtj a(js.a $$0, crf $$1) {
      return a($$0, $$1, 200);
   }

   public static dtj a(js.a $$0, crf $$1, int $$2) {
      return new dtj.a($$0, $$1)
         .a(cwf.qB, $$2 * 100)
         .a(dig.iB, $$2 * 8 * 10)
         .a(cwf.sh, $$2 * 12)
         .a(cwf.oy, $$2 * 8)
         .a(cwf.oz, $$2 * 8)
         .a(axj.r, $$2 * 3 / 2)
         .a(axj.C, $$2 * 3 / 2)
         .a(axj.b, $$2 * 3 / 2)
         .a(dig.w, $$2 * 3 / 2)
         .a(axj.i, $$2 * 3 / 2)
         .a(dig.hU, $$2 * 3 / 2)
         .a(axj.j, $$2 * 3 / 4)
         .a(dig.jC, $$2 * 3 / 4)
         .a(axj.n, $$2 * 3 / 2)
         .a(axj.m, $$2 * 3 / 2)
         .a(axj.k, $$2 * 3 / 2)
         .a(axj.l, $$2 * 3 / 2)
         .a(dig.aY, $$2 * 3 / 2)
         .a(dig.cl, $$2 * 3 / 2)
         .a(dig.cm, $$2 * 3 / 2)
         .a(dig.oa, $$2 * 3 / 2)
         .a(dig.dT, $$2 * 3 / 2)
         .a(dig.cv, $$2 * 3 / 2)
         .a(dig.gV, $$2 * 3 / 2)
         .a(dig.cA, $$2 * 3 / 2)
         .a(dig.gZ, $$2 * 3 / 2)
         .a(axj.E, $$2 * 3 / 2)
         .a(cwf.ow, $$2 * 3 / 2)
         .a(cwf.qW, $$2 * 3 / 2)
         .a(dig.cO, $$2 * 3 / 2)
         .a(axj.aU, $$2)
         .a(axj.bu, $$2 * 4)
         .a(cwf.oO, $$2)
         .a(cwf.oN, $$2)
         .a(cwf.oR, $$2)
         .a(cwf.oQ, $$2)
         .a(cwf.oP, $$2)
         .a(axj.h, $$2)
         .a(axj.aR, $$2 * 6)
         .a(axj.a, $$2 / 2)
         .a(axj.d, $$2 / 2)
         .a(cwf.pr, $$2 / 2)
         .a(axj.p, $$2 / 2)
         .a(cwf.ou, $$2 / 2)
         .a(axj.g, 1 + $$2 / 3)
         .a(dig.me, 1 + $$2 * 20)
         .a(cwf.vX, $$2 * 3 / 2)
         .a(dig.mZ, $$2 / 4)
         .a(dig.bv, $$2 / 2)
         .a(dig.nS, $$2 / 4)
         .a(dig.nT, $$2 * 3 / 2)
         .a(dig.nU, $$2 * 3 / 2)
         .a(dig.nX, $$2 * 3 / 2)
         .a(dig.nY, $$2 * 3 / 2)
         .a(dig.ob, $$2 * 3 / 2)
         .a(dig.pc, $$2 * 3 / 2)
         .a(dig.sy, $$2 / 2)
         .a(dig.sz, $$2 / 2)
         .a(dig.ac, $$2 * 3 / 2)
         .a(axj.aL)
         .a();
   }

   public static class a {
      private final js<cvx> a;
      private final crf b;
      private final Object2IntSortedMap<cvx> c = new Object2IntLinkedOpenHashMap();

      public a(js.a $$0, crf $$1) {
         this.a = $$0.d(lz.K);
         this.b = $$1;
      }

      public dtj a() {
         return new dtj(this.c);
      }

      public dtj.a a(axq<cvx> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public dtj.a a(axq<cvx> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jq<cvx> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dtj.a a(dfa $$0, int $$1) {
         cvx $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cvx $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
