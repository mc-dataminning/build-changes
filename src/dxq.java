import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dxq {
   public static final ahg<dxp> a = a("classic_flat");
   public static final ahg<dxp> b = a("tunnelers_dream");
   public static final ahg<dxp> c = a("water_world");
   public static final ahg<dxp> d = a("overworld");
   public static final ahg<dxp> e = a("snowy_kingdom");
   public static final ahg<dxp> f = a("bottomless_pit");
   public static final ahg<dxp> g = a("desert");
   public static final ahg<dxp> h = a("redstone_ready");
   public static final ahg<dxp> i = a("the_void");

   public static void a(pf<dxp> $$0) {
      new dxq.a($$0).a();
   }

   private static ahg<dxp> a(String $$0) {
      return ahg.a(ke.az, new ahh($$0));
   }

   static class a {
      private final pf<dxp> a;

      a(pf<dxp> $$0) {
         this.a = $$0;
      }

      private void a(ahg<dxp> $$0, ctw $$1, ahg<cuw> $$2, Set<ahg<dzu>> $$3, boolean $$4, boolean $$5, dxo... $$6) {
         ii<dzu> $$7 = this.a.a(ke.aF);
         ii<dys> $$8 = this.a.a(ke.aC);
         ii<cuw> $$9 = this.a.a(ke.at);
         il.a<dzu> $$10 = il.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dxr $$11 = new dxr(Optional.of($$10), $$9.b($$2), dxr.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dxp($$1.j().i(), $$11));
      }

      public void a() {
         this.a(dxq.a, cxa.i, cvd.b, ImmutableSet.of(dzh.a), false, false, new dxo(1, cxa.i), new dxo(2, cxa.j), new dxo(1, cxa.F));
         this.a(dxq.b, cxa.b, cvd.t, ImmutableSet.of(dzh.j, dzh.r), true, false, new dxo(1, cxa.i), new dxo(5, cxa.j), new dxo(230, cxa.b), new dxo(1, cxa.F));
         this.a(
            dxq.c,
            cnj.qy,
            cvd.T,
            ImmutableSet.of(dzh.m, dzh.l, dzh.g),
            false,
            false,
            new dxo(90, cxa.G),
            new dxo(5, cxa.L),
            new dxo(5, cxa.j),
            new dxo(5, cxa.b),
            new dxo(64, cxa.sJ),
            new dxo(1, cxa.F)
         );
         this.a(
            dxq.d,
            cxa.bt,
            cvd.b,
            ImmutableSet.of(dzh.a, dzh.j, dzh.f, dzh.k, dzh.r),
            true,
            true,
            new dxo(1, cxa.i),
            new dxo(3, cxa.j),
            new dxo(59, cxa.b),
            new dxo(1, cxa.F)
         );
         this.a(
            dxq.e,
            cxa.dN,
            cvd.d,
            ImmutableSet.of(dzh.a, dzh.c),
            false,
            false,
            new dxo(1, cxa.dN),
            new dxo(1, cxa.i),
            new dxo(3, cxa.j),
            new dxo(59, cxa.b),
            new dxo(1, cxa.F)
         );
         this.a(dxq.f, cnj.ps, cvd.b, ImmutableSet.of(dzh.a), false, false, new dxo(1, cxa.i), new dxo(3, cxa.j), new dxo(2, cxa.m));
         this.a(
            dxq.g,
            cxa.I,
            cvd.f,
            ImmutableSet.of(dzh.a, dzh.b, dzh.j, dzh.r),
            true,
            false,
            new dxo(8, cxa.I),
            new dxo(52, cxa.aV),
            new dxo(3, cxa.b),
            new dxo(1, cxa.F)
         );
         this.a(dxq.h, cnj.lG, cvd.f, ImmutableSet.of(), false, false, new dxo(116, cxa.aV), new dxo(3, cxa.b), new dxo(1, cxa.F));
         this.a(dxq.i, cxa.hW, cvd.a, ImmutableSet.of(), true, false, new dxo(1, cxa.a));
      }
   }
}
