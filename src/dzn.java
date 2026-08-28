import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dzn {
   private final Object2IntSortedMap<dag> a;

   dzn(Object2IntSortedMap<dag> $$0) {
      this.a = $$0;
   }

   public boolean a(dak $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<dag> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(dak $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dzn a(ji.a $$0, cvs $$1) {
      return a($$0, $$1, 200);
   }

   public static dzn a(ji.a $$0, cvs $$1, int $$2) {
      return new dzn.a($$0, $$1)
         .a(dao.rq, $$2 * 100)
         .a(dnq.jd, $$2 * 8 * 10)
         .a(dao.to, $$2 * 12)
         .a(dao.pl, $$2 * 8)
         .a(dao.pm, $$2 * 8)
         .a(axv.r, $$2 * 3 / 2)
         .a(axv.D, $$2 * 3 / 2)
         .a(axv.b, $$2 * 3 / 2)
         .a(dnq.y, $$2 * 3 / 2)
         .a(axv.i, $$2 * 3 / 2)
         .a(dnq.iw, $$2 * 3 / 2)
         .a(axv.j, $$2 * 3 / 4)
         .a(dnq.kf, $$2 * 3 / 4)
         .a(axv.n, $$2 * 3 / 2)
         .a(axv.m, $$2 * 3 / 2)
         .a(axv.k, $$2 * 3 / 2)
         .a(axv.l, $$2 * 3 / 2)
         .a(dnq.bf, $$2 * 3 / 2)
         .a(dnq.cv, $$2 * 3 / 2)
         .a(dnq.cw, $$2 * 3 / 2)
         .a(dnq.oG, $$2 * 3 / 2)
         .a(dnq.ek, $$2 * 3 / 2)
         .a(dnq.cG, $$2 * 3 / 2)
         .a(dnq.hw, $$2 * 3 / 2)
         .a(dnq.cL, $$2 * 3 / 2)
         .a(dnq.hA, $$2 * 3 / 2)
         .a(axv.F, $$2 * 3 / 2)
         .a(dao.pj, $$2 * 3 / 2)
         .a(dao.sd, $$2 * 3 / 2)
         .a(dnq.da, $$2 * 3 / 2)
         .a(axv.aW, $$2)
         .a(axv.bw, $$2 * 4)
         .a(dao.pB, $$2)
         .a(dao.pA, $$2)
         .a(dao.pE, $$2)
         .a(dao.pD, $$2)
         .a(dao.pC, $$2)
         .a(axv.h, $$2)
         .a(axv.aT, $$2 * 6)
         .a(axv.a, $$2 / 2)
         .a(axv.d, $$2 / 2)
         .a(dao.qe, $$2 / 2)
         .a(axv.p, $$2 / 2)
         .a(dao.ph, $$2 / 2)
         .a(axv.g, 1 + $$2 / 3)
         .a(dnq.mK, 1 + $$2 * 20)
         .a(dao.xg, $$2 * 3 / 2)
         .a(dnq.nF, $$2 / 4)
         .a(dnq.bC, $$2 / 2)
         .a(dnq.bE, $$2 / 2)
         .a(dnq.bF, $$2 / 2)
         .a(dnq.oy, $$2 / 4)
         .a(dnq.oz, $$2 * 3 / 2)
         .a(dnq.oA, $$2 * 3 / 2)
         .a(dnq.oD, $$2 * 3 / 2)
         .a(dnq.oE, $$2 * 3 / 2)
         .a(dnq.oH, $$2 * 3 / 2)
         .a(dnq.pK, $$2 * 3 / 2)
         .a(dnq.tg, $$2 / 2)
         .a(dnq.th, $$2 / 2)
         .a(dnq.ag, $$2 * 3 / 2)
         .a(dnq.tl, $$2 / 2)
         .a(axv.aN)
         .a();
   }

   public static class a {
      private final ji<dag> a;
      private final cvs b;
      private final Object2IntSortedMap<dag> c = new Object2IntLinkedOpenHashMap();

      public a(ji.a $$0, cvs $$1) {
         this.a = $$0.e(mi.K);
         this.b = $$1;
      }

      public dzn a() {
         return new dzn(this.c);
      }

      public dzn.a a(ayc<dag> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.e().a($$0));
         return this;
      }

      public dzn.a a(ayc<dag> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jg<dag> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dzn.a a(dki $$0, int $$1) {
         dag $$2 = $$0.h();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, dag $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
