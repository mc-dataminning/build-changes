import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dsb {
   private final Object2IntSortedMap<cvg> a;

   dsb(Object2IntSortedMap<cvg> $$0) {
      this.a = $$0;
   }

   public boolean a(cvl $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cvg> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cvl $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dsb a(jp.a $$0, cqh $$1) {
      return a($$0, $$1, 200);
   }

   public static dsb a(jp.a $$0, cqh $$1, int $$2) {
      return new dsb.a($$0, $$1)
         .a(cvo.qB, $$2 * 100)
         .a(dgx.iB, $$2 * 8 * 10)
         .a(cvo.sh, $$2 * 12)
         .a(cvo.oy, $$2 * 8)
         .a(cvo.oz, $$2 * 8)
         .a(axb.r, $$2 * 3 / 2)
         .a(axb.C, $$2 * 3 / 2)
         .a(axb.b, $$2 * 3 / 2)
         .a(dgx.w, $$2 * 3 / 2)
         .a(axb.i, $$2 * 3 / 2)
         .a(dgx.hU, $$2 * 3 / 2)
         .a(axb.j, $$2 * 3 / 4)
         .a(dgx.jC, $$2 * 3 / 4)
         .a(axb.n, $$2 * 3 / 2)
         .a(axb.m, $$2 * 3 / 2)
         .a(axb.k, $$2 * 3 / 2)
         .a(axb.l, $$2 * 3 / 2)
         .a(dgx.aY, $$2 * 3 / 2)
         .a(dgx.cl, $$2 * 3 / 2)
         .a(dgx.cm, $$2 * 3 / 2)
         .a(dgx.oa, $$2 * 3 / 2)
         .a(dgx.dT, $$2 * 3 / 2)
         .a(dgx.cv, $$2 * 3 / 2)
         .a(dgx.gV, $$2 * 3 / 2)
         .a(dgx.cA, $$2 * 3 / 2)
         .a(dgx.gZ, $$2 * 3 / 2)
         .a(axb.E, $$2 * 3 / 2)
         .a(cvo.ow, $$2 * 3 / 2)
         .a(cvo.qW, $$2 * 3 / 2)
         .a(dgx.cO, $$2 * 3 / 2)
         .a(axb.aQ, $$2)
         .a(axb.bi, $$2 * 4)
         .a(cvo.oO, $$2)
         .a(cvo.oN, $$2)
         .a(cvo.oR, $$2)
         .a(cvo.oQ, $$2)
         .a(cvo.oP, $$2)
         .a(axb.h, $$2)
         .a(axb.aN, $$2 * 6)
         .a(axb.a, $$2 / 2)
         .a(axb.d, $$2 / 2)
         .a(cvo.pr, $$2 / 2)
         .a(axb.p, $$2 / 2)
         .a(cvo.ou, $$2 / 2)
         .a(axb.g, 1 + $$2 / 3)
         .a(dgx.me, 1 + $$2 * 20)
         .a(cvo.vX, $$2 * 3 / 2)
         .a(dgx.mZ, $$2 / 4)
         .a(dgx.bv, $$2 / 2)
         .a(dgx.nS, $$2 / 4)
         .a(dgx.nT, $$2 * 3 / 2)
         .a(dgx.nU, $$2 * 3 / 2)
         .a(dgx.nX, $$2 * 3 / 2)
         .a(dgx.nY, $$2 * 3 / 2)
         .a(dgx.ob, $$2 * 3 / 2)
         .a(dgx.pc, $$2 * 3 / 2)
         .a(dgx.sy, $$2 / 2)
         .a(dgx.sz, $$2 / 2)
         .a(dgx.ac, $$2 * 3 / 2)
         .a(axb.aH)
         .a();
   }

   public static class a {
      private final jp<cvg> a;
      private final cqh b;
      private final Object2IntSortedMap<cvg> c = new Object2IntLinkedOpenHashMap();

      public a(jp.a $$0, cqh $$1) {
         this.a = $$0.b(lv.K);
         this.b = $$1;
      }

      public dsb a() {
         return new dsb(this.c);
      }

      public dsb.a a(axi<cvg> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.o().a($$0));
         return this;
      }

      public dsb.a a(axi<cvg> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jn<cvg> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dsb.a a(ddr $$0, int $$1) {
         cvg $$2 = $$0.r();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cvg $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
