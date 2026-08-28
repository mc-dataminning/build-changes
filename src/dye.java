import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dye {
   private final Object2IntSortedMap<cyz> a;

   dye(Object2IntSortedMap<cyz> $$0) {
      this.a = $$0;
   }

   public boolean a(czd $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<cyz> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(czd $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dye a(jg.a $$0, cum $$1) {
      return a($$0, $$1, 200);
   }

   public static dye a(jg.a $$0, cum $$1, int $$2) {
      return new dye.a($$0, $$1)
         .a(czh.rq, $$2 * 100)
         .a(dmh.jd, $$2 * 8 * 10)
         .a(czh.to, $$2 * 12)
         .a(czh.pl, $$2 * 8)
         .a(czh.pm, $$2 * 8)
         .a(axk.r, $$2 * 3 / 2)
         .a(axk.D, $$2 * 3 / 2)
         .a(axk.b, $$2 * 3 / 2)
         .a(dmh.y, $$2 * 3 / 2)
         .a(axk.i, $$2 * 3 / 2)
         .a(dmh.iw, $$2 * 3 / 2)
         .a(axk.j, $$2 * 3 / 4)
         .a(dmh.kf, $$2 * 3 / 4)
         .a(axk.n, $$2 * 3 / 2)
         .a(axk.m, $$2 * 3 / 2)
         .a(axk.k, $$2 * 3 / 2)
         .a(axk.l, $$2 * 3 / 2)
         .a(dmh.bf, $$2 * 3 / 2)
         .a(dmh.cv, $$2 * 3 / 2)
         .a(dmh.cw, $$2 * 3 / 2)
         .a(dmh.oG, $$2 * 3 / 2)
         .a(dmh.ek, $$2 * 3 / 2)
         .a(dmh.cG, $$2 * 3 / 2)
         .a(dmh.hw, $$2 * 3 / 2)
         .a(dmh.cL, $$2 * 3 / 2)
         .a(dmh.hA, $$2 * 3 / 2)
         .a(axk.F, $$2 * 3 / 2)
         .a(czh.pj, $$2 * 3 / 2)
         .a(czh.sd, $$2 * 3 / 2)
         .a(dmh.da, $$2 * 3 / 2)
         .a(axk.aV, $$2)
         .a(axk.bv, $$2 * 4)
         .a(czh.pB, $$2)
         .a(czh.pA, $$2)
         .a(czh.pE, $$2)
         .a(czh.pD, $$2)
         .a(czh.pC, $$2)
         .a(axk.h, $$2)
         .a(axk.aS, $$2 * 6)
         .a(axk.a, $$2 / 2)
         .a(axk.d, $$2 / 2)
         .a(czh.qe, $$2 / 2)
         .a(axk.p, $$2 / 2)
         .a(czh.ph, $$2 / 2)
         .a(axk.g, 1 + $$2 / 3)
         .a(dmh.mK, 1 + $$2 * 20)
         .a(czh.xg, $$2 * 3 / 2)
         .a(dmh.nF, $$2 / 4)
         .a(dmh.bC, $$2 / 2)
         .a(dmh.bE, $$2 / 2)
         .a(dmh.bF, $$2 / 2)
         .a(dmh.oy, $$2 / 4)
         .a(dmh.oz, $$2 * 3 / 2)
         .a(dmh.oA, $$2 * 3 / 2)
         .a(dmh.oD, $$2 * 3 / 2)
         .a(dmh.oE, $$2 * 3 / 2)
         .a(dmh.oH, $$2 * 3 / 2)
         .a(dmh.pK, $$2 * 3 / 2)
         .a(dmh.tg, $$2 / 2)
         .a(dmh.th, $$2 / 2)
         .a(dmh.ag, $$2 * 3 / 2)
         .a(dmh.tl, $$2 / 2)
         .a(axk.aM)
         .a();
   }

   public static class a {
      private final jg<cyz> a;
      private final cum b;
      private final Object2IntSortedMap<cyz> c = new Object2IntLinkedOpenHashMap();

      public a(jg.a $$0, cum $$1) {
         this.a = $$0.e(mg.K);
         this.b = $$1;
      }

      public dye a() {
         return new dye(this.c);
      }

      public dye.a a(axr<cyz> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.e().a($$0));
         return this;
      }

      public dye.a a(axr<cyz> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (je<cyz> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dye.a a(diz $$0, int $$1) {
         cyz $$2 = $$0.h();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, cyz $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
