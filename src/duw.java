import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class duw {
   private final Object2IntSortedMap<cwk> a;

   duw(Object2IntSortedMap<cwk> $$0) {
      this.a = $$0;
   }

   public boolean a(cwo $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cwk> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cwo $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static duw a(jt.a $$0, crs $$1) {
      return a($$0, $$1, 200);
   }

   public static duw a(jt.a $$0, crs $$1, int $$2) {
      return new duw.a($$0, $$1)
         .a(cws.rh, $$2 * 100)
         .a(djn.iZ, $$2 * 8 * 10)
         .a(cws.td, $$2 * 12)
         .a(cws.pc, $$2 * 8)
         .a(cws.pd, $$2 * 8)
         .a(awy.r, $$2 * 3 / 2)
         .a(awy.D, $$2 * 3 / 2)
         .a(awy.b, $$2 * 3 / 2)
         .a(djn.y, $$2 * 3 / 2)
         .a(awy.i, $$2 * 3 / 2)
         .a(djn.is, $$2 * 3 / 2)
         .a(awy.j, $$2 * 3 / 4)
         .a(djn.kb, $$2 * 3 / 4)
         .a(awy.n, $$2 * 3 / 2)
         .a(awy.m, $$2 * 3 / 2)
         .a(awy.k, $$2 * 3 / 2)
         .a(awy.l, $$2 * 3 / 2)
         .a(djn.bf, $$2 * 3 / 2)
         .a(djn.cs, $$2 * 3 / 2)
         .a(djn.ct, $$2 * 3 / 2)
         .a(djn.oC, $$2 * 3 / 2)
         .a(djn.eg, $$2 * 3 / 2)
         .a(djn.cD, $$2 * 3 / 2)
         .a(djn.hs, $$2 * 3 / 2)
         .a(djn.cI, $$2 * 3 / 2)
         .a(djn.hw, $$2 * 3 / 2)
         .a(awy.F, $$2 * 3 / 2)
         .a(cws.pa, $$2 * 3 / 2)
         .a(cws.rS, $$2 * 3 / 2)
         .a(djn.cX, $$2 * 3 / 2)
         .a(awy.aU, $$2)
         .a(awy.bu, $$2 * 4)
         .a(cws.ps, $$2)
         .a(cws.pr, $$2)
         .a(cws.pv, $$2)
         .a(cws.pu, $$2)
         .a(cws.pt, $$2)
         .a(awy.h, $$2)
         .a(awy.aR, $$2 * 6)
         .a(awy.a, $$2 / 2)
         .a(awy.d, $$2 / 2)
         .a(cws.pV, $$2 / 2)
         .a(awy.p, $$2 / 2)
         .a(cws.oY, $$2 / 2)
         .a(awy.g, 1 + $$2 / 3)
         .a(djn.mG, 1 + $$2 * 20)
         .a(cws.wV, $$2 * 3 / 2)
         .a(djn.nB, $$2 / 4)
         .a(djn.bC, $$2 / 2)
         .a(djn.ou, $$2 / 4)
         .a(djn.ov, $$2 * 3 / 2)
         .a(djn.ow, $$2 * 3 / 2)
         .a(djn.oz, $$2 * 3 / 2)
         .a(djn.oA, $$2 * 3 / 2)
         .a(djn.oD, $$2 * 3 / 2)
         .a(djn.pE, $$2 * 3 / 2)
         .a(djn.ta, $$2 / 2)
         .a(djn.tb, $$2 / 2)
         .a(djn.ag, $$2 * 3 / 2)
         .a(awy.aL)
         .a();
   }

   public static class a {
      private final jt<cwk> a;
      private final crs b;
      private final Object2IntSortedMap<cwk> c = new Object2IntLinkedOpenHashMap();

      public a(jt.a $$0, crs $$1) {
         this.a = $$0.d(mc.K);
         this.b = $$1;
      }

      public duw a() {
         return new duw(this.c);
      }

      public duw.a a(axf<cwk> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public duw.a a(axf<cwk> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jr<cwk> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public duw.a a(dgg $$0, int $$1) {
         cwk $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cwk $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
