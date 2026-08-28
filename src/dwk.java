import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dwk {
   private final Object2IntSortedMap<cxu> a;

   dwk(Object2IntSortedMap<cxu> $$0) {
      this.a = $$0;
   }

   public boolean a(cxy $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cxu> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cxy $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dwk a(ju.a $$0, cte $$1) {
      return a($$0, $$1, 200);
   }

   public static dwk a(ju.a $$0, cte $$1, int $$2) {
      return new dwk.a($$0, $$1)
         .a(cyc.rl, $$2 * 100)
         .a(dkw.iZ, $$2 * 8 * 10)
         .a(cyc.th, $$2 * 12)
         .a(cyc.pg, $$2 * 8)
         .a(cyc.ph, $$2 * 8)
         .a(axi.r, $$2 * 3 / 2)
         .a(axi.D, $$2 * 3 / 2)
         .a(axi.b, $$2 * 3 / 2)
         .a(dkw.y, $$2 * 3 / 2)
         .a(axi.i, $$2 * 3 / 2)
         .a(dkw.is, $$2 * 3 / 2)
         .a(axi.j, $$2 * 3 / 4)
         .a(dkw.kb, $$2 * 3 / 4)
         .a(axi.n, $$2 * 3 / 2)
         .a(axi.m, $$2 * 3 / 2)
         .a(axi.k, $$2 * 3 / 2)
         .a(axi.l, $$2 * 3 / 2)
         .a(dkw.bf, $$2 * 3 / 2)
         .a(dkw.cs, $$2 * 3 / 2)
         .a(dkw.ct, $$2 * 3 / 2)
         .a(dkw.oC, $$2 * 3 / 2)
         .a(dkw.eg, $$2 * 3 / 2)
         .a(dkw.cD, $$2 * 3 / 2)
         .a(dkw.hs, $$2 * 3 / 2)
         .a(dkw.cI, $$2 * 3 / 2)
         .a(dkw.hw, $$2 * 3 / 2)
         .a(axi.F, $$2 * 3 / 2)
         .a(cyc.pe, $$2 * 3 / 2)
         .a(cyc.rW, $$2 * 3 / 2)
         .a(dkw.cX, $$2 * 3 / 2)
         .a(axi.aU, $$2)
         .a(axi.bu, $$2 * 4)
         .a(cyc.pw, $$2)
         .a(cyc.pv, $$2)
         .a(cyc.pz, $$2)
         .a(cyc.py, $$2)
         .a(cyc.px, $$2)
         .a(axi.h, $$2)
         .a(axi.aR, $$2 * 6)
         .a(axi.a, $$2 / 2)
         .a(axi.d, $$2 / 2)
         .a(cyc.pZ, $$2 / 2)
         .a(axi.p, $$2 / 2)
         .a(cyc.pc, $$2 / 2)
         .a(axi.g, 1 + $$2 / 3)
         .a(dkw.mG, 1 + $$2 * 20)
         .a(cyc.wZ, $$2 * 3 / 2)
         .a(dkw.nB, $$2 / 4)
         .a(dkw.bC, $$2 / 2)
         .a(dkw.ou, $$2 / 4)
         .a(dkw.ov, $$2 * 3 / 2)
         .a(dkw.ow, $$2 * 3 / 2)
         .a(dkw.oz, $$2 * 3 / 2)
         .a(dkw.oA, $$2 * 3 / 2)
         .a(dkw.oD, $$2 * 3 / 2)
         .a(dkw.pG, $$2 * 3 / 2)
         .a(dkw.tc, $$2 / 2)
         .a(dkw.td, $$2 / 2)
         .a(dkw.ag, $$2 * 3 / 2)
         .a(dkw.th, $$2 / 2)
         .a(axi.aL)
         .a();
   }

   public static class a {
      private final ju<cxu> a;
      private final cte b;
      private final Object2IntSortedMap<cxu> c = new Object2IntLinkedOpenHashMap();

      public a(ju.a $$0, cte $$1) {
         this.a = $$0.e(me.K);
         this.b = $$1;
      }

      public dwk a() {
         return new dwk(this.c);
      }

      public dwk.a a(axp<cxu> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public dwk.a a(axp<cxu> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (js<cxu> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dwk.a a(dho $$0, int $$1) {
         cxu $$2 = $$0.i();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cxu $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
