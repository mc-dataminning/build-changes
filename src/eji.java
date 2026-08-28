import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eji {
   public static final ald<ejh> a = a("classic_flat");
   public static final ald<ejh> b = a("tunnelers_dream");
   public static final ald<ejh> c = a("water_world");
   public static final ald<ejh> d = a("overworld");
   public static final ald<ejh> e = a("snowy_kingdom");
   public static final ald<ejh> f = a("bottomless_pit");
   public static final ald<ejh> g = a("desert");
   public static final ald<ejh> h = a("redstone_ready");
   public static final ald<ejh> i = a("the_void");

   public static void a(qu<ejh> $$0) {
      new eji.a($$0).a();
   }

   private static ald<ejh> a(String $$0) {
      return ald.a(lw.aP, ale.b($$0));
   }

   static class a {
      private final qu<ejh> a;

      a(qu<ejh> $$0) {
         this.a = $$0;
      }

      private void a(ald<ejh> $$0, dei $$1, ald<dfk> $$2, Set<ald<elm>> $$3, boolean $$4, boolean $$5, ejg... $$6) {
         jp<elm> $$7 = this.a.a(lw.aV);
         jp<ekk> $$8 = this.a.a(lw.aS);
         jp<dfk> $$9 = this.a.a(lw.aH);
         js.a<elm> $$10 = js.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         ejj $$11 = new ejj(Optional.of($$10), $$9.b($$2), ejj.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ejh($$1.q().n(), $$11));
      }

      public void a() {
         this.a(eji.a, dho.i, dfr.b, ImmutableSet.of(ekz.a), false, false, new ejg(1, dho.i), new ejg(2, dho.j), new ejg(1, dho.F));
         this.a(eji.b, dho.b, dfr.t, ImmutableSet.of(ekz.j, ekz.r), true, false, new ejg(1, dho.i), new ejg(5, dho.j), new ejg(230, dho.b), new ejg(1, dho.F));
         this.a(
            eji.c,
            cvw.qA,
            dfr.T,
            ImmutableSet.of(ekz.m, ekz.l, ekz.g),
            false,
            false,
            new ejg(90, dho.G),
            new ejg(5, dho.L),
            new ejg(5, dho.j),
            new ejg(5, dho.b),
            new ejg(64, dho.sJ),
            new ejg(1, dho.F)
         );
         this.a(
            eji.d,
            dho.bt,
            dfr.b,
            ImmutableSet.of(ekz.a, ekz.j, ekz.f, ekz.k, ekz.r),
            true,
            true,
            new ejg(1, dho.i),
            new ejg(3, dho.j),
            new ejg(59, dho.b),
            new ejg(1, dho.F)
         );
         this.a(
            eji.e,
            dho.dN,
            dfr.d,
            ImmutableSet.of(ekz.a, ekz.c),
            false,
            false,
            new ejg(1, dho.dN),
            new ejg(1, dho.i),
            new ejg(3, dho.j),
            new ejg(59, dho.b),
            new ejg(1, dho.F)
         );
         this.a(eji.f, cvw.pu, dfr.b, ImmutableSet.of(ekz.a), false, false, new ejg(1, dho.i), new ejg(3, dho.j), new ejg(2, dho.m));
         this.a(
            eji.g,
            dho.I,
            dfr.f,
            ImmutableSet.of(ekz.a, ekz.b, ekz.j, ekz.r),
            true,
            false,
            new ejg(8, dho.I),
            new ejg(52, dho.aV),
            new ejg(3, dho.b),
            new ejg(1, dho.F)
         );
         this.a(eji.h, cvw.lH, dfr.f, ImmutableSet.of(), false, false, new ejg(116, dho.aV), new ejg(3, dho.b), new ejg(1, dho.F));
         this.a(eji.i, dho.hW, dfr.a, ImmutableSet.of(), true, false, new ejg(1, dho.a));
      }
   }
}
