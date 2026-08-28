import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class duv {
   private final Object2IntSortedMap<cwj> a;

   duv(Object2IntSortedMap<cwj> $$0) {
      this.a = $$0;
   }

   public boolean a(cwn $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cwj> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cwn $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static duv a(jt.a $$0, crr $$1) {
      return a($$0, $$1, 200);
   }

   public static duv a(jt.a $$0, crr $$1, int $$2) {
      return new duv.a($$0, $$1)
         .a(cwr.rh, $$2 * 100)
         .a(djm.iZ, $$2 * 8 * 10)
         .a(cwr.td, $$2 * 12)
         .a(cwr.pc, $$2 * 8)
         .a(cwr.pd, $$2 * 8)
         .a(awx.r, $$2 * 3 / 2)
         .a(awx.D, $$2 * 3 / 2)
         .a(awx.b, $$2 * 3 / 2)
         .a(djm.y, $$2 * 3 / 2)
         .a(awx.i, $$2 * 3 / 2)
         .a(djm.is, $$2 * 3 / 2)
         .a(awx.j, $$2 * 3 / 4)
         .a(djm.kb, $$2 * 3 / 4)
         .a(awx.n, $$2 * 3 / 2)
         .a(awx.m, $$2 * 3 / 2)
         .a(awx.k, $$2 * 3 / 2)
         .a(awx.l, $$2 * 3 / 2)
         .a(djm.bf, $$2 * 3 / 2)
         .a(djm.cs, $$2 * 3 / 2)
         .a(djm.ct, $$2 * 3 / 2)
         .a(djm.oC, $$2 * 3 / 2)
         .a(djm.eg, $$2 * 3 / 2)
         .a(djm.cD, $$2 * 3 / 2)
         .a(djm.hs, $$2 * 3 / 2)
         .a(djm.cI, $$2 * 3 / 2)
         .a(djm.hw, $$2 * 3 / 2)
         .a(awx.F, $$2 * 3 / 2)
         .a(cwr.pa, $$2 * 3 / 2)
         .a(cwr.rS, $$2 * 3 / 2)
         .a(djm.cX, $$2 * 3 / 2)
         .a(awx.aU, $$2)
         .a(awx.bu, $$2 * 4)
         .a(cwr.ps, $$2)
         .a(cwr.pr, $$2)
         .a(cwr.pv, $$2)
         .a(cwr.pu, $$2)
         .a(cwr.pt, $$2)
         .a(awx.h, $$2)
         .a(awx.aR, $$2 * 6)
         .a(awx.a, $$2 / 2)
         .a(awx.d, $$2 / 2)
         .a(cwr.pV, $$2 / 2)
         .a(awx.p, $$2 / 2)
         .a(cwr.oY, $$2 / 2)
         .a(awx.g, 1 + $$2 / 3)
         .a(djm.mG, 1 + $$2 * 20)
         .a(cwr.wV, $$2 * 3 / 2)
         .a(djm.nB, $$2 / 4)
         .a(djm.bC, $$2 / 2)
         .a(djm.ou, $$2 / 4)
         .a(djm.ov, $$2 * 3 / 2)
         .a(djm.ow, $$2 * 3 / 2)
         .a(djm.oz, $$2 * 3 / 2)
         .a(djm.oA, $$2 * 3 / 2)
         .a(djm.oD, $$2 * 3 / 2)
         .a(djm.pE, $$2 * 3 / 2)
         .a(djm.ta, $$2 / 2)
         .a(djm.tb, $$2 / 2)
         .a(djm.ag, $$2 * 3 / 2)
         .a(awx.aL)
         .a();
   }

   public static class a {
      private final jt<cwj> a;
      private final crr b;
      private final Object2IntSortedMap<cwj> c = new Object2IntLinkedOpenHashMap();

      public a(jt.a $$0, crr $$1) {
         this.a = $$0.d(mc.K);
         this.b = $$1;
      }

      public duv a() {
         return new duv(this.c);
      }

      public duv.a a(axe<cwj> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public duv.a a(axe<cwj> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jr<cwj> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public duv.a a(dgf $$0, int $$1) {
         cwj $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cwj $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
