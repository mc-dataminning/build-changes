import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dto {
   private final Object2IntSortedMap<cwb> a;

   dto(Object2IntSortedMap<cwb> $$0) {
      this.a = $$0;
   }

   public boolean a(cwf $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cwb> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cwf $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dto a(js.a $$0, crj $$1) {
      return a($$0, $$1, 200);
   }

   public static dto a(js.a $$0, crj $$1, int $$2) {
      return new dto.a($$0, $$1)
         .a(cwj.qB, $$2 * 100)
         .a(dil.iB, $$2 * 8 * 10)
         .a(cwj.sx, $$2 * 12)
         .a(cwj.oy, $$2 * 8)
         .a(cwj.oz, $$2 * 8)
         .a(axm.r, $$2 * 3 / 2)
         .a(axm.C, $$2 * 3 / 2)
         .a(axm.b, $$2 * 3 / 2)
         .a(dil.w, $$2 * 3 / 2)
         .a(axm.i, $$2 * 3 / 2)
         .a(dil.hU, $$2 * 3 / 2)
         .a(axm.j, $$2 * 3 / 4)
         .a(dil.jC, $$2 * 3 / 4)
         .a(axm.n, $$2 * 3 / 2)
         .a(axm.m, $$2 * 3 / 2)
         .a(axm.k, $$2 * 3 / 2)
         .a(axm.l, $$2 * 3 / 2)
         .a(dil.aY, $$2 * 3 / 2)
         .a(dil.cl, $$2 * 3 / 2)
         .a(dil.cm, $$2 * 3 / 2)
         .a(dil.oa, $$2 * 3 / 2)
         .a(dil.dT, $$2 * 3 / 2)
         .a(dil.cv, $$2 * 3 / 2)
         .a(dil.gV, $$2 * 3 / 2)
         .a(dil.cA, $$2 * 3 / 2)
         .a(dil.gZ, $$2 * 3 / 2)
         .a(axm.E, $$2 * 3 / 2)
         .a(cwj.ow, $$2 * 3 / 2)
         .a(cwj.rm, $$2 * 3 / 2)
         .a(dil.cO, $$2 * 3 / 2)
         .a(axm.aV, $$2)
         .a(axm.bv, $$2 * 4)
         .a(cwj.oO, $$2)
         .a(cwj.oN, $$2)
         .a(cwj.oR, $$2)
         .a(cwj.oQ, $$2)
         .a(cwj.oP, $$2)
         .a(axm.h, $$2)
         .a(axm.aS, $$2 * 6)
         .a(axm.a, $$2 / 2)
         .a(axm.d, $$2 / 2)
         .a(cwj.pr, $$2 / 2)
         .a(axm.p, $$2 / 2)
         .a(cwj.ou, $$2 / 2)
         .a(axm.g, 1 + $$2 / 3)
         .a(dil.me, 1 + $$2 * 20)
         .a(cwj.wn, $$2 * 3 / 2)
         .a(dil.mZ, $$2 / 4)
         .a(dil.bv, $$2 / 2)
         .a(dil.nS, $$2 / 4)
         .a(dil.nT, $$2 * 3 / 2)
         .a(dil.nU, $$2 * 3 / 2)
         .a(dil.nX, $$2 * 3 / 2)
         .a(dil.nY, $$2 * 3 / 2)
         .a(dil.ob, $$2 * 3 / 2)
         .a(dil.pc, $$2 * 3 / 2)
         .a(dil.sy, $$2 / 2)
         .a(dil.sz, $$2 / 2)
         .a(dil.ac, $$2 * 3 / 2)
         .a(axm.aM)
         .a();
   }

   public static class a {
      private final js<cwb> a;
      private final crj b;
      private final Object2IntSortedMap<cwb> c = new Object2IntLinkedOpenHashMap();

      public a(js.a $$0, crj $$1) {
         this.a = $$0.d(ma.K);
         this.b = $$1;
      }

      public dto a() {
         return new dto(this.c);
      }

      public dto.a a(axt<cwb> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public dto.a a(axt<cwb> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jq<cwb> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dto.a a(dfe $$0, int $$1) {
         cwb $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cwb $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
