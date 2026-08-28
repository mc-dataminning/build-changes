import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dxw {
   private final Object2IntSortedMap<cyu> a;

   dxw(Object2IntSortedMap<cyu> $$0) {
      this.a = $$0;
   }

   public boolean a(cyy $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cyu> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cyy $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dxw a(jg.a $$0, cuh $$1) {
      return a($$0, $$1, 200);
   }

   public static dxw a(jg.a $$0, cuh $$1, int $$2) {
      return new dxw.a($$0, $$1)
         .a(czc.rn, $$2 * 100)
         .a(dmc.ja, $$2 * 8 * 10)
         .a(czc.tj, $$2 * 12)
         .a(czc.pi, $$2 * 8)
         .a(czc.pj, $$2 * 8)
         .a(axk.r, $$2 * 3 / 2)
         .a(axk.D, $$2 * 3 / 2)
         .a(axk.b, $$2 * 3 / 2)
         .a(dmc.y, $$2 * 3 / 2)
         .a(axk.i, $$2 * 3 / 2)
         .a(dmc.it, $$2 * 3 / 2)
         .a(axk.j, $$2 * 3 / 4)
         .a(dmc.kc, $$2 * 3 / 4)
         .a(axk.n, $$2 * 3 / 2)
         .a(axk.m, $$2 * 3 / 2)
         .a(axk.k, $$2 * 3 / 2)
         .a(axk.l, $$2 * 3 / 2)
         .a(dmc.bf, $$2 * 3 / 2)
         .a(dmc.ct, $$2 * 3 / 2)
         .a(dmc.cu, $$2 * 3 / 2)
         .a(dmc.oD, $$2 * 3 / 2)
         .a(dmc.eh, $$2 * 3 / 2)
         .a(dmc.cE, $$2 * 3 / 2)
         .a(dmc.ht, $$2 * 3 / 2)
         .a(dmc.cJ, $$2 * 3 / 2)
         .a(dmc.hx, $$2 * 3 / 2)
         .a(axk.F, $$2 * 3 / 2)
         .a(czc.pg, $$2 * 3 / 2)
         .a(czc.rY, $$2 * 3 / 2)
         .a(dmc.cY, $$2 * 3 / 2)
         .a(axk.aU, $$2)
         .a(axk.bu, $$2 * 4)
         .a(czc.py, $$2)
         .a(czc.px, $$2)
         .a(czc.pB, $$2)
         .a(czc.pA, $$2)
         .a(czc.pz, $$2)
         .a(axk.h, $$2)
         .a(axk.aR, $$2 * 6)
         .a(axk.a, $$2 / 2)
         .a(axk.d, $$2 / 2)
         .a(czc.qb, $$2 / 2)
         .a(axk.p, $$2 / 2)
         .a(czc.pe, $$2 / 2)
         .a(axk.g, 1 + $$2 / 3)
         .a(dmc.mH, 1 + $$2 * 20)
         .a(czc.xb, $$2 * 3 / 2)
         .a(dmc.nC, $$2 / 4)
         .a(dmc.bC, $$2 / 2)
         .a(dmc.ov, $$2 / 4)
         .a(dmc.ow, $$2 * 3 / 2)
         .a(dmc.ox, $$2 * 3 / 2)
         .a(dmc.oA, $$2 * 3 / 2)
         .a(dmc.oB, $$2 * 3 / 2)
         .a(dmc.oE, $$2 * 3 / 2)
         .a(dmc.pH, $$2 * 3 / 2)
         .a(dmc.td, $$2 / 2)
         .a(dmc.te, $$2 / 2)
         .a(dmc.ag, $$2 * 3 / 2)
         .a(dmc.ti, $$2 / 2)
         .a(axk.aL)
         .a();
   }

   public static class a {
      private final jg<cyu> a;
      private final cuh b;
      private final Object2IntSortedMap<cyu> c = new Object2IntLinkedOpenHashMap();

      public a(jg.a $$0, cuh $$1) {
         this.a = $$0.e(mg.K);
         this.b = $$1;
      }

      public dxw a() {
         return new dxw(this.c);
      }

      public dxw.a a(axr<cyu> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.e().a($$0));
         return this;
      }

      public dxw.a a(axr<cyu> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (je<cyu> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dxw.a a(diu $$0, int $$1) {
         cyu $$2 = $$0.h();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cyu $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
