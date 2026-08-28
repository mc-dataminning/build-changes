import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dtv {
   private final Object2IntSortedMap<cwi> a;

   dtv(Object2IntSortedMap<cwi> $$0) {
      this.a = $$0;
   }

   public boolean a(cwm $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cwi> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cwm $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dtv a(js.a $$0, crq $$1) {
      return a($$0, $$1, 200);
   }

   public static dtv a(js.a $$0, crq $$1, int $$2) {
      return new dtv.a($$0, $$1)
         .a(cwq.qB, $$2 * 100)
         .a(dis.iB, $$2 * 8 * 10)
         .a(cwq.sx, $$2 * 12)
         .a(cwq.oy, $$2 * 8)
         .a(cwq.oz, $$2 * 8)
         .a(axl.r, $$2 * 3 / 2)
         .a(axl.C, $$2 * 3 / 2)
         .a(axl.b, $$2 * 3 / 2)
         .a(dis.w, $$2 * 3 / 2)
         .a(axl.i, $$2 * 3 / 2)
         .a(dis.hU, $$2 * 3 / 2)
         .a(axl.j, $$2 * 3 / 4)
         .a(dis.jC, $$2 * 3 / 4)
         .a(axl.n, $$2 * 3 / 2)
         .a(axl.m, $$2 * 3 / 2)
         .a(axl.k, $$2 * 3 / 2)
         .a(axl.l, $$2 * 3 / 2)
         .a(dis.aY, $$2 * 3 / 2)
         .a(dis.cl, $$2 * 3 / 2)
         .a(dis.cm, $$2 * 3 / 2)
         .a(dis.oa, $$2 * 3 / 2)
         .a(dis.dT, $$2 * 3 / 2)
         .a(dis.cv, $$2 * 3 / 2)
         .a(dis.gV, $$2 * 3 / 2)
         .a(dis.cA, $$2 * 3 / 2)
         .a(dis.gZ, $$2 * 3 / 2)
         .a(axl.E, $$2 * 3 / 2)
         .a(cwq.ow, $$2 * 3 / 2)
         .a(cwq.rm, $$2 * 3 / 2)
         .a(dis.cO, $$2 * 3 / 2)
         .a(axl.aV, $$2)
         .a(axl.bv, $$2 * 4)
         .a(cwq.oO, $$2)
         .a(cwq.oN, $$2)
         .a(cwq.oR, $$2)
         .a(cwq.oQ, $$2)
         .a(cwq.oP, $$2)
         .a(axl.h, $$2)
         .a(axl.aS, $$2 * 6)
         .a(axl.a, $$2 / 2)
         .a(axl.d, $$2 / 2)
         .a(cwq.pr, $$2 / 2)
         .a(axl.p, $$2 / 2)
         .a(cwq.ou, $$2 / 2)
         .a(axl.g, 1 + $$2 / 3)
         .a(dis.me, 1 + $$2 * 20)
         .a(cwq.wn, $$2 * 3 / 2)
         .a(dis.mZ, $$2 / 4)
         .a(dis.bv, $$2 / 2)
         .a(dis.nS, $$2 / 4)
         .a(dis.nT, $$2 * 3 / 2)
         .a(dis.nU, $$2 * 3 / 2)
         .a(dis.nX, $$2 * 3 / 2)
         .a(dis.nY, $$2 * 3 / 2)
         .a(dis.ob, $$2 * 3 / 2)
         .a(dis.pc, $$2 * 3 / 2)
         .a(dis.sy, $$2 / 2)
         .a(dis.sz, $$2 / 2)
         .a(dis.ac, $$2 * 3 / 2)
         .a(axl.aM)
         .a();
   }

   public static class a {
      private final js<cwi> a;
      private final crq b;
      private final Object2IntSortedMap<cwi> c = new Object2IntLinkedOpenHashMap();

      public a(js.a $$0, crq $$1) {
         this.a = $$0.d(ma.K);
         this.b = $$1;
      }

      public dtv a() {
         return new dtv(this.c);
      }

      public dtv.a a(axs<cwi> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public dtv.a a(axs<cwi> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jq<cwi> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dtv.a a(dfl $$0, int $$1) {
         cwi $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cwi $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
