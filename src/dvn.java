import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dvn {
   private final Object2IntSortedMap<cxg> a;

   dvn(Object2IntSortedMap<cxg> $$0) {
      this.a = $$0;
   }

   public boolean a(cxk $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cxg> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cxk $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dvn a(js.a $$0, cso $$1) {
      return a($$0, $$1, 200);
   }

   public static dvn a(js.a $$0, cso $$1, int $$2) {
      return new dvn.a($$0, $$1)
         .a(cxo.qY, $$2 * 100)
         .a(dkg.iS, $$2 * 8 * 10)
         .a(cxo.sU, $$2 * 12)
         .a(cxo.oT, $$2 * 8)
         .a(cxo.oU, $$2 * 8)
         .a(ayd.r, $$2 * 3 / 2)
         .a(ayd.D, $$2 * 3 / 2)
         .a(ayd.b, $$2 * 3 / 2)
         .a(dkg.y, $$2 * 3 / 2)
         .a(ayd.i, $$2 * 3 / 2)
         .a(dkg.il, $$2 * 3 / 2)
         .a(ayd.j, $$2 * 3 / 4)
         .a(dkg.jU, $$2 * 3 / 4)
         .a(ayd.n, $$2 * 3 / 2)
         .a(ayd.m, $$2 * 3 / 2)
         .a(ayd.k, $$2 * 3 / 2)
         .a(ayd.l, $$2 * 3 / 2)
         .a(dkg.bf, $$2 * 3 / 2)
         .a(dkg.cs, $$2 * 3 / 2)
         .a(dkg.ct, $$2 * 3 / 2)
         .a(dkg.ov, $$2 * 3 / 2)
         .a(dkg.eg, $$2 * 3 / 2)
         .a(dkg.cD, $$2 * 3 / 2)
         .a(dkg.hl, $$2 * 3 / 2)
         .a(dkg.cI, $$2 * 3 / 2)
         .a(dkg.hp, $$2 * 3 / 2)
         .a(ayd.F, $$2 * 3 / 2)
         .a(cxo.oR, $$2 * 3 / 2)
         .a(cxo.rJ, $$2 * 3 / 2)
         .a(dkg.cX, $$2 * 3 / 2)
         .a(ayd.aW, $$2)
         .a(ayd.bw, $$2 * 4)
         .a(cxo.pj, $$2)
         .a(cxo.pi, $$2)
         .a(cxo.pm, $$2)
         .a(cxo.pl, $$2)
         .a(cxo.pk, $$2)
         .a(ayd.h, $$2)
         .a(ayd.aT, $$2 * 6)
         .a(ayd.a, $$2 / 2)
         .a(ayd.d, $$2 / 2)
         .a(cxo.pM, $$2 / 2)
         .a(ayd.p, $$2 / 2)
         .a(cxo.oP, $$2 / 2)
         .a(ayd.g, 1 + $$2 / 3)
         .a(dkg.mz, 1 + $$2 * 20)
         .a(cxo.wL, $$2 * 3 / 2)
         .a(dkg.nu, $$2 / 4)
         .a(dkg.bC, $$2 / 2)
         .a(dkg.on, $$2 / 4)
         .a(dkg.oo, $$2 * 3 / 2)
         .a(dkg.op, $$2 * 3 / 2)
         .a(dkg.os, $$2 * 3 / 2)
         .a(dkg.ot, $$2 * 3 / 2)
         .a(dkg.ow, $$2 * 3 / 2)
         .a(dkg.px, $$2 * 3 / 2)
         .a(dkg.sT, $$2 / 2)
         .a(dkg.sU, $$2 / 2)
         .a(dkg.ag, $$2 * 3 / 2)
         .a(ayd.aN)
         .a();
   }

   public static class a {
      private final js<cxg> a;
      private final cso b;
      private final Object2IntSortedMap<cxg> c = new Object2IntLinkedOpenHashMap();

      public a(js.a $$0, cso $$1) {
         this.a = $$0.d(mb.K);
         this.b = $$1;
      }

      public dvn a() {
         return new dvn(this.c);
      }

      public dvn.a a(ayk<cxg> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public dvn.a a(ayk<cxg> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jq<cxg> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dvn.a a(dgz $$0, int $$1) {
         cxg $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cxg $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
