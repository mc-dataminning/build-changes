import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dvu {
   private final Object2IntSortedMap<cxk> a;

   dvu(Object2IntSortedMap<cxk> $$0) {
      this.a = $$0;
   }

   public boolean a(cxo $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cxk> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cxo $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dvu a(js.a $$0, css $$1) {
      return a($$0, $$1, 200);
   }

   public static dvu a(js.a $$0, css $$1, int $$2) {
      return new dvu.a($$0, $$1)
         .a(cxs.qY, $$2 * 100)
         .a(dkn.iS, $$2 * 8 * 10)
         .a(cxs.sU, $$2 * 12)
         .a(cxs.oT, $$2 * 8)
         .a(cxs.oU, $$2 * 8)
         .a(ayd.r, $$2 * 3 / 2)
         .a(ayd.D, $$2 * 3 / 2)
         .a(ayd.b, $$2 * 3 / 2)
         .a(dkn.y, $$2 * 3 / 2)
         .a(ayd.i, $$2 * 3 / 2)
         .a(dkn.il, $$2 * 3 / 2)
         .a(ayd.j, $$2 * 3 / 4)
         .a(dkn.jU, $$2 * 3 / 4)
         .a(ayd.n, $$2 * 3 / 2)
         .a(ayd.m, $$2 * 3 / 2)
         .a(ayd.k, $$2 * 3 / 2)
         .a(ayd.l, $$2 * 3 / 2)
         .a(dkn.bf, $$2 * 3 / 2)
         .a(dkn.cs, $$2 * 3 / 2)
         .a(dkn.ct, $$2 * 3 / 2)
         .a(dkn.ov, $$2 * 3 / 2)
         .a(dkn.eg, $$2 * 3 / 2)
         .a(dkn.cD, $$2 * 3 / 2)
         .a(dkn.hl, $$2 * 3 / 2)
         .a(dkn.cI, $$2 * 3 / 2)
         .a(dkn.hp, $$2 * 3 / 2)
         .a(ayd.F, $$2 * 3 / 2)
         .a(cxs.oR, $$2 * 3 / 2)
         .a(cxs.rJ, $$2 * 3 / 2)
         .a(dkn.cX, $$2 * 3 / 2)
         .a(ayd.aW, $$2)
         .a(ayd.bw, $$2 * 4)
         .a(cxs.pj, $$2)
         .a(cxs.pi, $$2)
         .a(cxs.pm, $$2)
         .a(cxs.pl, $$2)
         .a(cxs.pk, $$2)
         .a(ayd.h, $$2)
         .a(ayd.aT, $$2 * 6)
         .a(ayd.a, $$2 / 2)
         .a(ayd.d, $$2 / 2)
         .a(cxs.pM, $$2 / 2)
         .a(ayd.p, $$2 / 2)
         .a(cxs.oP, $$2 / 2)
         .a(ayd.g, 1 + $$2 / 3)
         .a(dkn.mz, 1 + $$2 * 20)
         .a(cxs.wL, $$2 * 3 / 2)
         .a(dkn.nu, $$2 / 4)
         .a(dkn.bC, $$2 / 2)
         .a(dkn.on, $$2 / 4)
         .a(dkn.oo, $$2 * 3 / 2)
         .a(dkn.op, $$2 * 3 / 2)
         .a(dkn.os, $$2 * 3 / 2)
         .a(dkn.ot, $$2 * 3 / 2)
         .a(dkn.ow, $$2 * 3 / 2)
         .a(dkn.px, $$2 * 3 / 2)
         .a(dkn.sT, $$2 / 2)
         .a(dkn.sU, $$2 / 2)
         .a(dkn.ag, $$2 * 3 / 2)
         .a(ayd.aN)
         .a();
   }

   public static class a {
      private final js<cxk> a;
      private final css b;
      private final Object2IntSortedMap<cxk> c = new Object2IntLinkedOpenHashMap();

      public a(js.a $$0, css $$1) {
         this.a = $$0.d(mb.K);
         this.b = $$1;
      }

      public dvu a() {
         return new dvu(this.c);
      }

      public dvu.a a(ayk<cxk> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public dvu.a a(ayk<cxk> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jq<cxk> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dvu.a a(dhg $$0, int $$1) {
         cxk $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cxk $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
