import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dzg {
   public static final aix<dzf> a = a("classic_flat");
   public static final aix<dzf> b = a("tunnelers_dream");
   public static final aix<dzf> c = a("water_world");
   public static final aix<dzf> d = a("overworld");
   public static final aix<dzf> e = a("snowy_kingdom");
   public static final aix<dzf> f = a("bottomless_pit");
   public static final aix<dzf> g = a("desert");
   public static final aix<dzf> h = a("redstone_ready");
   public static final aix<dzf> i = a("the_void");

   public static void a(ph<dzf> $$0) {
      new dzg.a($$0).a();
   }

   private static aix<dzf> a(String $$0) {
      return aix.a(kg.az, new aiy($$0));
   }

   static class a {
      private final ph<dzf> a;

      a(ph<dzf> $$0) {
         this.a = $$0;
      }

      private void a(aix<dzf> $$0, cvm $$1, aix<cwm> $$2, Set<aix<ebk>> $$3, boolean $$4, boolean $$5, dze... $$6) {
         ik<ebk> $$7 = this.a.a(kg.aF);
         ik<eai> $$8 = this.a.a(kg.aC);
         ik<cwm> $$9 = this.a.a(kg.at);
         in.a<ebk> $$10 = in.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dzh $$11 = new dzh(Optional.of($$10), $$9.b($$2), dzh.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dzf($$1.j().i(), $$11));
      }

      public void a() {
         this.a(dzg.a, cyq.i, cwt.b, ImmutableSet.of(eax.a), false, false, new dze(1, cyq.i), new dze(2, cyq.j), new dze(1, cyq.F));
         this.a(dzg.b, cyq.b, cwt.t, ImmutableSet.of(eax.j, eax.r), true, false, new dze(1, cyq.i), new dze(5, cyq.j), new dze(230, cyq.b), new dze(1, cyq.F));
         this.a(
            dzg.c,
            cpc.qy,
            cwt.T,
            ImmutableSet.of(eax.m, eax.l, eax.g),
            false,
            false,
            new dze(90, cyq.G),
            new dze(5, cyq.L),
            new dze(5, cyq.j),
            new dze(5, cyq.b),
            new dze(64, cyq.sJ),
            new dze(1, cyq.F)
         );
         this.a(
            dzg.d,
            cyq.bt,
            cwt.b,
            ImmutableSet.of(eax.a, eax.j, eax.f, eax.k, eax.r),
            true,
            true,
            new dze(1, cyq.i),
            new dze(3, cyq.j),
            new dze(59, cyq.b),
            new dze(1, cyq.F)
         );
         this.a(
            dzg.e,
            cyq.dN,
            cwt.d,
            ImmutableSet.of(eax.a, eax.c),
            false,
            false,
            new dze(1, cyq.dN),
            new dze(1, cyq.i),
            new dze(3, cyq.j),
            new dze(59, cyq.b),
            new dze(1, cyq.F)
         );
         this.a(dzg.f, cpc.ps, cwt.b, ImmutableSet.of(eax.a), false, false, new dze(1, cyq.i), new dze(3, cyq.j), new dze(2, cyq.m));
         this.a(
            dzg.g,
            cyq.I,
            cwt.f,
            ImmutableSet.of(eax.a, eax.b, eax.j, eax.r),
            true,
            false,
            new dze(8, cyq.I),
            new dze(52, cyq.aV),
            new dze(3, cyq.b),
            new dze(1, cyq.F)
         );
         this.a(dzg.h, cpc.lG, cwt.f, ImmutableSet.of(), false, false, new dze(116, cyq.aV), new dze(3, cyq.b), new dze(1, cyq.F));
         this.a(dzg.i, cyq.hW, cwt.a, ImmutableSet.of(), true, false, new dze(1, cyq.a));
      }
   }
}
