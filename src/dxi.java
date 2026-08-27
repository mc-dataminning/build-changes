import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dxi {
   public static final ahf<dxh> a = a("classic_flat");
   public static final ahf<dxh> b = a("tunnelers_dream");
   public static final ahf<dxh> c = a("water_world");
   public static final ahf<dxh> d = a("overworld");
   public static final ahf<dxh> e = a("snowy_kingdom");
   public static final ahf<dxh> f = a("bottomless_pit");
   public static final ahf<dxh> g = a("desert");
   public static final ahf<dxh> h = a("redstone_ready");
   public static final ahf<dxh> i = a("the_void");

   public static void a(pe<dxh> $$0) {
      new dxi.a($$0).a();
   }

   private static ahf<dxh> a(String $$0) {
      return ahf.a(ke.az, new ahg($$0));
   }

   static class a {
      private final pe<dxh> a;

      a(pe<dxh> $$0) {
         this.a = $$0;
      }

      private void a(ahf<dxh> $$0, cto $$1, ahf<cuo> $$2, Set<ahf<dzm>> $$3, boolean $$4, boolean $$5, dxg... $$6) {
         ii<dzm> $$7 = this.a.a(ke.aF);
         ii<dyk> $$8 = this.a.a(ke.aC);
         ii<cuo> $$9 = this.a.a(ke.at);
         il.a<dzm> $$10 = il.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dxj $$11 = new dxj(Optional.of($$10), $$9.b($$2), dxj.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dxh($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dxi.a, cws.i, cuv.b, ImmutableSet.of(dyz.a), false, false, new dxg(1, cws.i), new dxg(2, cws.j), new dxg(1, cws.F));
         this.a(dxi.b, cws.b, cuv.t, ImmutableSet.of(dyz.j, dyz.r), true, false, new dxg(1, cws.i), new dxg(5, cws.j), new dxg(230, cws.b), new dxg(1, cws.F));
         this.a(
            dxi.c,
            cnb.qw,
            cuv.T,
            ImmutableSet.of(dyz.m, dyz.l, dyz.g),
            false,
            false,
            new dxg(90, cws.G),
            new dxg(5, cws.L),
            new dxg(5, cws.j),
            new dxg(5, cws.b),
            new dxg(64, cws.sJ),
            new dxg(1, cws.F)
         );
         this.a(
            dxi.d,
            cws.bt,
            cuv.b,
            ImmutableSet.of(dyz.a, dyz.j, dyz.f, dyz.k, dyz.r),
            true,
            true,
            new dxg(1, cws.i),
            new dxg(3, cws.j),
            new dxg(59, cws.b),
            new dxg(1, cws.F)
         );
         this.a(
            dxi.e,
            cws.dN,
            cuv.d,
            ImmutableSet.of(dyz.a, dyz.c),
            false,
            false,
            new dxg(1, cws.dN),
            new dxg(1, cws.i),
            new dxg(3, cws.j),
            new dxg(59, cws.b),
            new dxg(1, cws.F)
         );
         this.a(dxi.f, cnb.pq, cuv.b, ImmutableSet.of(dyz.a), false, false, new dxg(1, cws.i), new dxg(3, cws.j), new dxg(2, cws.m));
         this.a(
            dxi.g,
            cws.I,
            cuv.f,
            ImmutableSet.of(dyz.a, dyz.b, dyz.j, dyz.r),
            true,
            false,
            new dxg(8, cws.I),
            new dxg(52, cws.aV),
            new dxg(3, cws.b),
            new dxg(1, cws.F)
         );
         this.a(dxi.h, cnb.lG, cuv.f, ImmutableSet.of(), false, false, new dxg(116, cws.aV), new dxg(3, cws.b), new dxg(1, cws.F));
         this.a(dxi.i, cws.hW, cuv.a, ImmutableSet.of(), true, false, new dxg(1, cws.a));
      }
   }
}
