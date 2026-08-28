import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class duy {
   private final Object2IntSortedMap<cwm> a;

   duy(Object2IntSortedMap<cwm> $$0) {
      this.a = $$0;
   }

   public boolean a(cwq $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cwm> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cwq $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static duy a(jt.a $$0, cru $$1) {
      return a($$0, $$1, 200);
   }

   public static duy a(jt.a $$0, cru $$1, int $$2) {
      return new duy.a($$0, $$1)
         .a(cwu.rh, $$2 * 100)
         .a(djp.iZ, $$2 * 8 * 10)
         .a(cwu.td, $$2 * 12)
         .a(cwu.pc, $$2 * 8)
         .a(cwu.pd, $$2 * 8)
         .a(awy.r, $$2 * 3 / 2)
         .a(awy.D, $$2 * 3 / 2)
         .a(awy.b, $$2 * 3 / 2)
         .a(djp.y, $$2 * 3 / 2)
         .a(awy.i, $$2 * 3 / 2)
         .a(djp.is, $$2 * 3 / 2)
         .a(awy.j, $$2 * 3 / 4)
         .a(djp.kb, $$2 * 3 / 4)
         .a(awy.n, $$2 * 3 / 2)
         .a(awy.m, $$2 * 3 / 2)
         .a(awy.k, $$2 * 3 / 2)
         .a(awy.l, $$2 * 3 / 2)
         .a(djp.bf, $$2 * 3 / 2)
         .a(djp.cs, $$2 * 3 / 2)
         .a(djp.ct, $$2 * 3 / 2)
         .a(djp.oC, $$2 * 3 / 2)
         .a(djp.eg, $$2 * 3 / 2)
         .a(djp.cD, $$2 * 3 / 2)
         .a(djp.hs, $$2 * 3 / 2)
         .a(djp.cI, $$2 * 3 / 2)
         .a(djp.hw, $$2 * 3 / 2)
         .a(awy.F, $$2 * 3 / 2)
         .a(cwu.pa, $$2 * 3 / 2)
         .a(cwu.rS, $$2 * 3 / 2)
         .a(djp.cX, $$2 * 3 / 2)
         .a(awy.aU, $$2)
         .a(awy.bu, $$2 * 4)
         .a(cwu.ps, $$2)
         .a(cwu.pr, $$2)
         .a(cwu.pv, $$2)
         .a(cwu.pu, $$2)
         .a(cwu.pt, $$2)
         .a(awy.h, $$2)
         .a(awy.aR, $$2 * 6)
         .a(awy.a, $$2 / 2)
         .a(awy.d, $$2 / 2)
         .a(cwu.pV, $$2 / 2)
         .a(awy.p, $$2 / 2)
         .a(cwu.oY, $$2 / 2)
         .a(awy.g, 1 + $$2 / 3)
         .a(djp.mG, 1 + $$2 * 20)
         .a(cwu.wV, $$2 * 3 / 2)
         .a(djp.nB, $$2 / 4)
         .a(djp.bC, $$2 / 2)
         .a(djp.ou, $$2 / 4)
         .a(djp.ov, $$2 * 3 / 2)
         .a(djp.ow, $$2 * 3 / 2)
         .a(djp.oz, $$2 * 3 / 2)
         .a(djp.oA, $$2 * 3 / 2)
         .a(djp.oD, $$2 * 3 / 2)
         .a(djp.pE, $$2 * 3 / 2)
         .a(djp.ta, $$2 / 2)
         .a(djp.tb, $$2 / 2)
         .a(djp.ag, $$2 * 3 / 2)
         .a(awy.aL)
         .a();
   }

   public static class a {
      private final jt<cwm> a;
      private final cru b;
      private final Object2IntSortedMap<cwm> c = new Object2IntLinkedOpenHashMap();

      public a(jt.a $$0, cru $$1) {
         this.a = $$0.d(mc.K);
         this.b = $$1;
      }

      public duy a() {
         return new duy(this.c);
      }

      public duy.a a(axf<cwm> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public duy.a a(axf<cwm> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jr<cwm> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public duy.a a(dgi $$0, int $$1) {
         cwm $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cwm $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
