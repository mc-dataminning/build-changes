import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dux {
   private final Object2IntSortedMap<cwl> a;

   dux(Object2IntSortedMap<cwl> $$0) {
      this.a = $$0;
   }

   public boolean a(cwp $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cwl> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cwp $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dux a(jt.a $$0, crt $$1) {
      return a($$0, $$1, 200);
   }

   public static dux a(jt.a $$0, crt $$1, int $$2) {
      return new dux.a($$0, $$1)
         .a(cwt.rh, $$2 * 100)
         .a(djo.iZ, $$2 * 8 * 10)
         .a(cwt.td, $$2 * 12)
         .a(cwt.pc, $$2 * 8)
         .a(cwt.pd, $$2 * 8)
         .a(awy.r, $$2 * 3 / 2)
         .a(awy.D, $$2 * 3 / 2)
         .a(awy.b, $$2 * 3 / 2)
         .a(djo.y, $$2 * 3 / 2)
         .a(awy.i, $$2 * 3 / 2)
         .a(djo.is, $$2 * 3 / 2)
         .a(awy.j, $$2 * 3 / 4)
         .a(djo.kb, $$2 * 3 / 4)
         .a(awy.n, $$2 * 3 / 2)
         .a(awy.m, $$2 * 3 / 2)
         .a(awy.k, $$2 * 3 / 2)
         .a(awy.l, $$2 * 3 / 2)
         .a(djo.bf, $$2 * 3 / 2)
         .a(djo.cs, $$2 * 3 / 2)
         .a(djo.ct, $$2 * 3 / 2)
         .a(djo.oC, $$2 * 3 / 2)
         .a(djo.eg, $$2 * 3 / 2)
         .a(djo.cD, $$2 * 3 / 2)
         .a(djo.hs, $$2 * 3 / 2)
         .a(djo.cI, $$2 * 3 / 2)
         .a(djo.hw, $$2 * 3 / 2)
         .a(awy.F, $$2 * 3 / 2)
         .a(cwt.pa, $$2 * 3 / 2)
         .a(cwt.rS, $$2 * 3 / 2)
         .a(djo.cX, $$2 * 3 / 2)
         .a(awy.aU, $$2)
         .a(awy.bu, $$2 * 4)
         .a(cwt.ps, $$2)
         .a(cwt.pr, $$2)
         .a(cwt.pv, $$2)
         .a(cwt.pu, $$2)
         .a(cwt.pt, $$2)
         .a(awy.h, $$2)
         .a(awy.aR, $$2 * 6)
         .a(awy.a, $$2 / 2)
         .a(awy.d, $$2 / 2)
         .a(cwt.pV, $$2 / 2)
         .a(awy.p, $$2 / 2)
         .a(cwt.oY, $$2 / 2)
         .a(awy.g, 1 + $$2 / 3)
         .a(djo.mG, 1 + $$2 * 20)
         .a(cwt.wV, $$2 * 3 / 2)
         .a(djo.nB, $$2 / 4)
         .a(djo.bC, $$2 / 2)
         .a(djo.ou, $$2 / 4)
         .a(djo.ov, $$2 * 3 / 2)
         .a(djo.ow, $$2 * 3 / 2)
         .a(djo.oz, $$2 * 3 / 2)
         .a(djo.oA, $$2 * 3 / 2)
         .a(djo.oD, $$2 * 3 / 2)
         .a(djo.pE, $$2 * 3 / 2)
         .a(djo.ta, $$2 / 2)
         .a(djo.tb, $$2 / 2)
         .a(djo.ag, $$2 * 3 / 2)
         .a(awy.aL)
         .a();
   }

   public static class a {
      private final jt<cwl> a;
      private final crt b;
      private final Object2IntSortedMap<cwl> c = new Object2IntLinkedOpenHashMap();

      public a(jt.a $$0, crt $$1) {
         this.a = $$0.d(mc.K);
         this.b = $$1;
      }

      public dux a() {
         return new dux(this.c);
      }

      public dux.a a(axf<cwl> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public dux.a a(axf<cwl> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jr<cwl> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dux.a a(dgh $$0, int $$1) {
         cwl $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cwl $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
