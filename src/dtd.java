import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dtd {
   private final Object2IntSortedMap<cvt> a;

   dtd(Object2IntSortedMap<cvt> $$0) {
      this.a = $$0;
   }

   public boolean a(cvx $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cvt> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(cvx $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dtd a(jr.a $$0, cra $$1) {
      return a($$0, $$1, 200);
   }

   public static dtd a(jr.a $$0, cra $$1, int $$2) {
      return new dtd.a($$0, $$1)
         .a(cwb.qB, $$2 * 100)
         .a(dia.iB, $$2 * 8 * 10)
         .a(cwb.sh, $$2 * 12)
         .a(cwb.oy, $$2 * 8)
         .a(cwb.oz, $$2 * 8)
         .a(axi.r, $$2 * 3 / 2)
         .a(axi.C, $$2 * 3 / 2)
         .a(axi.b, $$2 * 3 / 2)
         .a(dia.w, $$2 * 3 / 2)
         .a(axi.i, $$2 * 3 / 2)
         .a(dia.hU, $$2 * 3 / 2)
         .a(axi.j, $$2 * 3 / 4)
         .a(dia.jC, $$2 * 3 / 4)
         .a(axi.n, $$2 * 3 / 2)
         .a(axi.m, $$2 * 3 / 2)
         .a(axi.k, $$2 * 3 / 2)
         .a(axi.l, $$2 * 3 / 2)
         .a(dia.aY, $$2 * 3 / 2)
         .a(dia.cl, $$2 * 3 / 2)
         .a(dia.cm, $$2 * 3 / 2)
         .a(dia.oa, $$2 * 3 / 2)
         .a(dia.dT, $$2 * 3 / 2)
         .a(dia.cv, $$2 * 3 / 2)
         .a(dia.gV, $$2 * 3 / 2)
         .a(dia.cA, $$2 * 3 / 2)
         .a(dia.gZ, $$2 * 3 / 2)
         .a(axi.E, $$2 * 3 / 2)
         .a(cwb.ow, $$2 * 3 / 2)
         .a(cwb.qW, $$2 * 3 / 2)
         .a(dia.cO, $$2 * 3 / 2)
         .a(axi.aR, $$2)
         .a(axi.br, $$2 * 4)
         .a(cwb.oO, $$2)
         .a(cwb.oN, $$2)
         .a(cwb.oR, $$2)
         .a(cwb.oQ, $$2)
         .a(cwb.oP, $$2)
         .a(axi.h, $$2)
         .a(axi.aO, $$2 * 6)
         .a(axi.a, $$2 / 2)
         .a(axi.d, $$2 / 2)
         .a(cwb.pr, $$2 / 2)
         .a(axi.p, $$2 / 2)
         .a(cwb.ou, $$2 / 2)
         .a(axi.g, 1 + $$2 / 3)
         .a(dia.me, 1 + $$2 * 20)
         .a(cwb.vX, $$2 * 3 / 2)
         .a(dia.mZ, $$2 / 4)
         .a(dia.bv, $$2 / 2)
         .a(dia.nS, $$2 / 4)
         .a(dia.nT, $$2 * 3 / 2)
         .a(dia.nU, $$2 * 3 / 2)
         .a(dia.nX, $$2 * 3 / 2)
         .a(dia.nY, $$2 * 3 / 2)
         .a(dia.ob, $$2 * 3 / 2)
         .a(dia.pc, $$2 * 3 / 2)
         .a(dia.sy, $$2 / 2)
         .a(dia.sz, $$2 / 2)
         .a(dia.ac, $$2 * 3 / 2)
         .a(axi.aI)
         .a();
   }

   public static class a {
      private final jr<cvt> a;
      private final cra b;
      private final Object2IntSortedMap<cvt> c = new Object2IntLinkedOpenHashMap();

      public a(jr.a $$0, cra $$1) {
         this.a = $$0.d(ly.K);
         this.b = $$1;
      }

      public dtd a() {
         return new dtd(this.c);
      }

      public dtd.a a(axp<cvt> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.f().a($$0));
         return this;
      }

      public dtd.a a(axp<cvt> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jp<cvt> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dtd.a a(deu $$0, int $$1) {
         cvt $$2 = $$0.j();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cvt $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
