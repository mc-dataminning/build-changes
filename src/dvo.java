import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dvo {
   private final Object2IntSortedMap<cxc> a;

   dvo(Object2IntSortedMap<cxc> $$0) {
      this.a = $$0;
   }

   public boolean a(cxg $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cxc> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cxg $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dvo a(js.a $$0, csk $$1) {
      return a($$0, $$1, 200);
   }

   public static dvo a(js.a $$0, csk $$1, int $$2) {
      return new dvo.a($$0, $$1)
         .a(cxk.rh, $$2 * 100)
         .a(dkf.iZ, $$2 * 8 * 10)
         .a(cxk.td, $$2 * 12)
         .a(cxk.pc, $$2 * 8)
         .a(cxk.pd, $$2 * 8)
         .a(axt.r, $$2 * 3 / 2)
         .a(axt.D, $$2 * 3 / 2)
         .a(axt.b, $$2 * 3 / 2)
         .a(dkf.y, $$2 * 3 / 2)
         .a(axt.i, $$2 * 3 / 2)
         .a(dkf.is, $$2 * 3 / 2)
         .a(axt.j, $$2 * 3 / 4)
         .a(dkf.kb, $$2 * 3 / 4)
         .a(axt.n, $$2 * 3 / 2)
         .a(axt.m, $$2 * 3 / 2)
         .a(axt.k, $$2 * 3 / 2)
         .a(axt.l, $$2 * 3 / 2)
         .a(dkf.bf, $$2 * 3 / 2)
         .a(dkf.cs, $$2 * 3 / 2)
         .a(dkf.ct, $$2 * 3 / 2)
         .a(dkf.oC, $$2 * 3 / 2)
         .a(dkf.eg, $$2 * 3 / 2)
         .a(dkf.cD, $$2 * 3 / 2)
         .a(dkf.hs, $$2 * 3 / 2)
         .a(dkf.cI, $$2 * 3 / 2)
         .a(dkf.hw, $$2 * 3 / 2)
         .a(axt.F, $$2 * 3 / 2)
         .a(cxk.pa, $$2 * 3 / 2)
         .a(cxk.rS, $$2 * 3 / 2)
         .a(dkf.cX, $$2 * 3 / 2)
         .a(axt.aW, $$2)
         .a(axt.bw, $$2 * 4)
         .a(cxk.ps, $$2)
         .a(cxk.pr, $$2)
         .a(cxk.pv, $$2)
         .a(cxk.pu, $$2)
         .a(cxk.pt, $$2)
         .a(axt.h, $$2)
         .a(axt.aT, $$2 * 6)
         .a(axt.a, $$2 / 2)
         .a(axt.d, $$2 / 2)
         .a(cxk.pV, $$2 / 2)
         .a(axt.p, $$2 / 2)
         .a(cxk.oY, $$2 / 2)
         .a(axt.g, 1 + $$2 / 3)
         .a(dkf.mG, 1 + $$2 * 20)
         .a(cxk.wV, $$2 * 3 / 2)
         .a(dkf.nB, $$2 / 4)
         .a(dkf.bC, $$2 / 2)
         .a(dkf.ou, $$2 / 4)
         .a(dkf.ov, $$2 * 3 / 2)
         .a(dkf.ow, $$2 * 3 / 2)
         .a(dkf.oz, $$2 * 3 / 2)
         .a(dkf.oA, $$2 * 3 / 2)
         .a(dkf.oD, $$2 * 3 / 2)
         .a(dkf.pE, $$2 * 3 / 2)
         .a(dkf.ta, $$2 / 2)
         .a(dkf.tb, $$2 / 2)
         .a(dkf.ag, $$2 * 3 / 2)
         .a(axt.aN)
         .a();
   }

   public static class a {
      private final js<cxc> a;
      private final csk b;
      private final Object2IntSortedMap<cxc> c = new Object2IntLinkedOpenHashMap();

      public a(js.a $$0, csk $$1) {
         this.a = $$0.d(mb.K);
         this.b = $$1;
      }

      public dvo a() {
         return new dvo(this.c);
      }

      public dvo.a a(aya<cxc> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public dvo.a a(aya<cxc> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jq<cxc> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dvo.a a(dgy $$0, int $$1) {
         cxc $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cxc $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
