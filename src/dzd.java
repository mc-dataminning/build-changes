import it.unimi.dsi.fastutil.objects.Object2IntLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;

public class dzd {
   private final Object2IntSortedMap<czw> a;

   dzd(Object2IntSortedMap<czw> $$0) {
      this.a = $$0;
   }

   public boolean a(daa $$0) {
      return this.a.containsKey($$0.h());
   }

   public SequencedSet<czw> a() {
      return Collections.unmodifiableSequencedSet(this.a.keySet());
   }

   public int b(daa $$0) {
      return $$0.f() ? 0 : this.a.getInt($$0.h());
   }

   public static dzd a(ji.a $$0, cvj $$1) {
      return a($$0, $$1, 200);
   }

   public static dzd a(ji.a $$0, cvj $$1, int $$2) {
      return new dzd.a($$0, $$1)
         .a(dae.rq, $$2 * 100)
         .a(dng.jd, $$2 * 8 * 10)
         .a(dae.to, $$2 * 12)
         .a(dae.pl, $$2 * 8)
         .a(dae.pm, $$2 * 8)
         .a(axo.r, $$2 * 3 / 2)
         .a(axo.D, $$2 * 3 / 2)
         .a(axo.b, $$2 * 3 / 2)
         .a(dng.y, $$2 * 3 / 2)
         .a(axo.i, $$2 * 3 / 2)
         .a(dng.iw, $$2 * 3 / 2)
         .a(axo.j, $$2 * 3 / 4)
         .a(dng.kf, $$2 * 3 / 4)
         .a(axo.n, $$2 * 3 / 2)
         .a(axo.m, $$2 * 3 / 2)
         .a(axo.k, $$2 * 3 / 2)
         .a(axo.l, $$2 * 3 / 2)
         .a(dng.bf, $$2 * 3 / 2)
         .a(dng.cv, $$2 * 3 / 2)
         .a(dng.cw, $$2 * 3 / 2)
         .a(dng.oG, $$2 * 3 / 2)
         .a(dng.ek, $$2 * 3 / 2)
         .a(dng.cG, $$2 * 3 / 2)
         .a(dng.hw, $$2 * 3 / 2)
         .a(dng.cL, $$2 * 3 / 2)
         .a(dng.hA, $$2 * 3 / 2)
         .a(axo.F, $$2 * 3 / 2)
         .a(dae.pj, $$2 * 3 / 2)
         .a(dae.sd, $$2 * 3 / 2)
         .a(dng.da, $$2 * 3 / 2)
         .a(axo.aW, $$2)
         .a(axo.bw, $$2 * 4)
         .a(dae.pB, $$2)
         .a(dae.pA, $$2)
         .a(dae.pE, $$2)
         .a(dae.pD, $$2)
         .a(dae.pC, $$2)
         .a(axo.h, $$2)
         .a(axo.aT, $$2 * 6)
         .a(axo.a, $$2 / 2)
         .a(axo.d, $$2 / 2)
         .a(dae.qe, $$2 / 2)
         .a(axo.p, $$2 / 2)
         .a(dae.ph, $$2 / 2)
         .a(axo.g, 1 + $$2 / 3)
         .a(dng.mK, 1 + $$2 * 20)
         .a(dae.xg, $$2 * 3 / 2)
         .a(dng.nF, $$2 / 4)
         .a(dng.bC, $$2 / 2)
         .a(dng.bE, $$2 / 2)
         .a(dng.bF, $$2 / 2)
         .a(dng.oy, $$2 / 4)
         .a(dng.oz, $$2 * 3 / 2)
         .a(dng.oA, $$2 * 3 / 2)
         .a(dng.oD, $$2 * 3 / 2)
         .a(dng.oE, $$2 * 3 / 2)
         .a(dng.oH, $$2 * 3 / 2)
         .a(dng.pK, $$2 * 3 / 2)
         .a(dng.tg, $$2 / 2)
         .a(dng.th, $$2 / 2)
         .a(dng.ag, $$2 * 3 / 2)
         .a(dng.tl, $$2 / 2)
         .a(axo.aN)
         .a();
   }

   public static class a {
      private final ji<czw> a;
      private final cvj b;
      private final Object2IntSortedMap<czw> c = new Object2IntLinkedOpenHashMap();

      public a(ji.a $$0, cvj $$1) {
         this.a = $$0.e(mi.K);
         this.b = $$1;
      }

      public dzd a() {
         return new dzd(this.c);
      }

      public dzd.a a(axv<czw> $$0) {
         this.c.keySet().removeIf($$1 -> $$1.e().a($$0));
         return this;
      }

      public dzd.a a(axv<czw> $$0, int $$1) {
         this.a.a($$0).ifPresent($$1x -> {
            for (jg<czw> $$2 : $$1x) {
               this.a($$1, $$2.a());
            }
         });
         return this;
      }

      public dzd.a a(djy $$0, int $$1) {
         czw $$2 = $$0.h();
         this.a($$1, $$2);
         return this;
      }

      private void a(int $$0, czw $$1) {
         if ($$1.a(this.b)) {
            this.c.put($$1, $$0);
         }
      }
   }
}
