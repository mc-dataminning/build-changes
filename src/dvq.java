import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dvq {
   private final Object2IntSortedMap<cxd> a;

   dvq(Object2IntSortedMap<cxd> $$0) {
      this.a = $$0;
   }

   public boolean a(cxh $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cxd> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cxh $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dvq a(jt.a $$0, csn $$1) {
      return a($$0, $$1, 200);
   }

   public static dvq a(jt.a $$0, csn $$1, int $$2) {
      return new dvq.a($$0, $$1)
         .a(cxl.rj, $$2 * 100)
         .a(dkg.iZ, $$2 * 8 * 10)
         .a(cxl.tf, $$2 * 12)
         .a(cxl.pe, $$2 * 8)
         .a(cxl.pf, $$2 * 8)
         .a(awy.r, $$2 * 3 / 2)
         .a(awy.D, $$2 * 3 / 2)
         .a(awy.b, $$2 * 3 / 2)
         .a(dkg.y, $$2 * 3 / 2)
         .a(awy.i, $$2 * 3 / 2)
         .a(dkg.is, $$2 * 3 / 2)
         .a(awy.j, $$2 * 3 / 4)
         .a(dkg.kb, $$2 * 3 / 4)
         .a(awy.n, $$2 * 3 / 2)
         .a(awy.m, $$2 * 3 / 2)
         .a(awy.k, $$2 * 3 / 2)
         .a(awy.l, $$2 * 3 / 2)
         .a(dkg.bf, $$2 * 3 / 2)
         .a(dkg.cs, $$2 * 3 / 2)
         .a(dkg.ct, $$2 * 3 / 2)
         .a(dkg.oC, $$2 * 3 / 2)
         .a(dkg.eg, $$2 * 3 / 2)
         .a(dkg.cD, $$2 * 3 / 2)
         .a(dkg.hs, $$2 * 3 / 2)
         .a(dkg.cI, $$2 * 3 / 2)
         .a(dkg.hw, $$2 * 3 / 2)
         .a(awy.F, $$2 * 3 / 2)
         .a(cxl.pc, $$2 * 3 / 2)
         .a(cxl.rU, $$2 * 3 / 2)
         .a(dkg.cX, $$2 * 3 / 2)
         .a(awy.aU, $$2)
         .a(awy.bu, $$2 * 4)
         .a(cxl.pu, $$2)
         .a(cxl.pt, $$2)
         .a(cxl.px, $$2)
         .a(cxl.pw, $$2)
         .a(cxl.pv, $$2)
         .a(awy.h, $$2)
         .a(awy.aR, $$2 * 6)
         .a(awy.a, $$2 / 2)
         .a(awy.d, $$2 / 2)
         .a(cxl.pX, $$2 / 2)
         .a(awy.p, $$2 / 2)
         .a(cxl.pa, $$2 / 2)
         .a(awy.g, 1 + $$2 / 3)
         .a(dkg.mG, 1 + $$2 * 20)
         .a(cxl.wX, $$2 * 3 / 2)
         .a(dkg.nB, $$2 / 4)
         .a(dkg.bC, $$2 / 2)
         .a(dkg.ou, $$2 / 4)
         .a(dkg.ov, $$2 * 3 / 2)
         .a(dkg.ow, $$2 * 3 / 2)
         .a(dkg.oz, $$2 * 3 / 2)
         .a(dkg.oA, $$2 * 3 / 2)
         .a(dkg.oD, $$2 * 3 / 2)
         .a(dkg.pE, $$2 * 3 / 2)
         .a(dkg.ta, $$2 / 2)
         .a(dkg.tb, $$2 / 2)
         .a(dkg.ag, $$2 * 3 / 2)
         .a(dkg.tf, $$2 / 2)
         .a(awy.aL)
         .a();
   }

   public static class a {
      private final jt<cxd> a;
      private final csn b;
      private final Object2IntSortedMap<cxd> c = new Object2IntLinkedOpenHashMap();

      public a(jt.a $$0, csn $$1) {
         this.a = $$0.d(mc.K);
         this.b = $$1;
      }

      public dvq a() {
         return new dvq(this.c);
      }

      public dvq.a a(axf<cxd> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public dvq.a a(axf<cxd> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jr<cxd> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dvq.a a(dgy $$0, int $$1) {
         cxd $$2 = $$0.i();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cxd $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
