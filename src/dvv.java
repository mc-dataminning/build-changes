import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dvv {
   private final Object2IntSortedMap<cxl> a;

   dvv(Object2IntSortedMap<cxl> $$0) {
      this.a = $$0;
   }

   public boolean a(cxp $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cxl> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cxp $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dvv a(js.a $$0, cst $$1) {
      return a($$0, $$1, 200);
   }

   public static dvv a(js.a $$0, cst $$1, int $$2) {
      return new dvv.a($$0, $$1)
         .a(cxt.qY, $$2 * 100)
         .a(dko.iS, $$2 * 8 * 10)
         .a(cxt.sU, $$2 * 12)
         .a(cxt.oT, $$2 * 8)
         .a(cxt.oU, $$2 * 8)
         .a(ayd.r, $$2 * 3 / 2)
         .a(ayd.D, $$2 * 3 / 2)
         .a(ayd.b, $$2 * 3 / 2)
         .a(dko.y, $$2 * 3 / 2)
         .a(ayd.i, $$2 * 3 / 2)
         .a(dko.il, $$2 * 3 / 2)
         .a(ayd.j, $$2 * 3 / 4)
         .a(dko.jU, $$2 * 3 / 4)
         .a(ayd.n, $$2 * 3 / 2)
         .a(ayd.m, $$2 * 3 / 2)
         .a(ayd.k, $$2 * 3 / 2)
         .a(ayd.l, $$2 * 3 / 2)
         .a(dko.bf, $$2 * 3 / 2)
         .a(dko.cs, $$2 * 3 / 2)
         .a(dko.ct, $$2 * 3 / 2)
         .a(dko.ov, $$2 * 3 / 2)
         .a(dko.eg, $$2 * 3 / 2)
         .a(dko.cD, $$2 * 3 / 2)
         .a(dko.hl, $$2 * 3 / 2)
         .a(dko.cI, $$2 * 3 / 2)
         .a(dko.hp, $$2 * 3 / 2)
         .a(ayd.F, $$2 * 3 / 2)
         .a(cxt.oR, $$2 * 3 / 2)
         .a(cxt.rJ, $$2 * 3 / 2)
         .a(dko.cX, $$2 * 3 / 2)
         .a(ayd.aW, $$2)
         .a(ayd.bw, $$2 * 4)
         .a(cxt.pj, $$2)
         .a(cxt.pi, $$2)
         .a(cxt.pm, $$2)
         .a(cxt.pl, $$2)
         .a(cxt.pk, $$2)
         .a(ayd.h, $$2)
         .a(ayd.aT, $$2 * 6)
         .a(ayd.a, $$2 / 2)
         .a(ayd.d, $$2 / 2)
         .a(cxt.pM, $$2 / 2)
         .a(ayd.p, $$2 / 2)
         .a(cxt.oP, $$2 / 2)
         .a(ayd.g, 1 + $$2 / 3)
         .a(dko.mz, 1 + $$2 * 20)
         .a(cxt.wL, $$2 * 3 / 2)
         .a(dko.nu, $$2 / 4)
         .a(dko.bC, $$2 / 2)
         .a(dko.on, $$2 / 4)
         .a(dko.oo, $$2 * 3 / 2)
         .a(dko.op, $$2 * 3 / 2)
         .a(dko.os, $$2 * 3 / 2)
         .a(dko.ot, $$2 * 3 / 2)
         .a(dko.ow, $$2 * 3 / 2)
         .a(dko.px, $$2 * 3 / 2)
         .a(dko.sT, $$2 / 2)
         .a(dko.sU, $$2 / 2)
         .a(dko.ag, $$2 * 3 / 2)
         .a(ayd.aN)
         .a();
   }

   public static class a {
      private final js<cxl> a;
      private final cst b;
      private final Object2IntSortedMap<cxl> c = new Object2IntLinkedOpenHashMap();

      public a(js.a $$0, cst $$1) {
         this.a = $$0.d(mb.K);
         this.b = $$1;
      }

      public dvv a() {
         return new dvv(this.c);
      }

      public dvv.a a(ayk<cxl> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public dvv.a a(ayk<cxl> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jq<cxl> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dvv.a a(dhh $$0, int $$1) {
         cxl $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cxl $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
