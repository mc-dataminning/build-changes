import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dxm {
   private final Object2IntSortedMap<cyo> a;

   dxm(Object2IntSortedMap<cyo> $$0) {
      this.a = $$0;
   }

   public boolean a(cys $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cyo> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cys $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dxm a(jg.a $$0, cub $$1) {
      return a($$0, $$1, 200);
   }

   public static dxm a(jg.a $$0, cub $$1, int $$2) {
      return new dxm.a($$0, $$1)
         .a(cyw.rl, $$2 * 100)
         .a(dlw.iZ, $$2 * 8 * 10)
         .a(cyw.th, $$2 * 12)
         .a(cyw.pg, $$2 * 8)
         .a(cyw.ph, $$2 * 8)
         .a(axi.r, $$2 * 3 / 2)
         .a(axi.D, $$2 * 3 / 2)
         .a(axi.b, $$2 * 3 / 2)
         .a(dlw.y, $$2 * 3 / 2)
         .a(axi.i, $$2 * 3 / 2)
         .a(dlw.is, $$2 * 3 / 2)
         .a(axi.j, $$2 * 3 / 4)
         .a(dlw.kb, $$2 * 3 / 4)
         .a(axi.n, $$2 * 3 / 2)
         .a(axi.m, $$2 * 3 / 2)
         .a(axi.k, $$2 * 3 / 2)
         .a(axi.l, $$2 * 3 / 2)
         .a(dlw.bf, $$2 * 3 / 2)
         .a(dlw.cs, $$2 * 3 / 2)
         .a(dlw.ct, $$2 * 3 / 2)
         .a(dlw.oC, $$2 * 3 / 2)
         .a(dlw.eg, $$2 * 3 / 2)
         .a(dlw.cD, $$2 * 3 / 2)
         .a(dlw.hs, $$2 * 3 / 2)
         .a(dlw.cI, $$2 * 3 / 2)
         .a(dlw.hw, $$2 * 3 / 2)
         .a(axi.F, $$2 * 3 / 2)
         .a(cyw.pe, $$2 * 3 / 2)
         .a(cyw.rW, $$2 * 3 / 2)
         .a(dlw.cX, $$2 * 3 / 2)
         .a(axi.aU, $$2)
         .a(axi.bu, $$2 * 4)
         .a(cyw.pw, $$2)
         .a(cyw.pv, $$2)
         .a(cyw.pz, $$2)
         .a(cyw.py, $$2)
         .a(cyw.px, $$2)
         .a(axi.h, $$2)
         .a(axi.aR, $$2 * 6)
         .a(axi.a, $$2 / 2)
         .a(axi.d, $$2 / 2)
         .a(cyw.pZ, $$2 / 2)
         .a(axi.p, $$2 / 2)
         .a(cyw.pc, $$2 / 2)
         .a(axi.g, 1 + $$2 / 3)
         .a(dlw.mG, 1 + $$2 * 20)
         .a(cyw.wZ, $$2 * 3 / 2)
         .a(dlw.nB, $$2 / 4)
         .a(dlw.bC, $$2 / 2)
         .a(dlw.ou, $$2 / 4)
         .a(dlw.ov, $$2 * 3 / 2)
         .a(dlw.ow, $$2 * 3 / 2)
         .a(dlw.oz, $$2 * 3 / 2)
         .a(dlw.oA, $$2 * 3 / 2)
         .a(dlw.oD, $$2 * 3 / 2)
         .a(dlw.pG, $$2 * 3 / 2)
         .a(dlw.tc, $$2 / 2)
         .a(dlw.td, $$2 / 2)
         .a(dlw.ag, $$2 * 3 / 2)
         .a(dlw.th, $$2 / 2)
         .a(axi.aL)
         .a();
   }

   public static class a {
      private final jg<cyo> a;
      private final cub b;
      private final Object2IntSortedMap<cyo> c = new Object2IntLinkedOpenHashMap();

      public a(jg.a $$0, cub $$1) {
         this.a = $$0.e(mg.K);
         this.b = $$1;
      }

      public dxm a() {
         return new dxm(this.c);
      }

      public dxm.a a(axp<cyo> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.e().a($$0));
         return this;
      }

      public dxm.a a(axp<cyo> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (je<cyo> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dxm.a a(dio $$0, int $$1) {
         cyo $$2 = $$0.h();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cyo $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
