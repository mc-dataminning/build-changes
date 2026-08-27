import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dxh {
   public static final ahf<dxg> a = a("classic_flat");
   public static final ahf<dxg> b = a("tunnelers_dream");
   public static final ahf<dxg> c = a("water_world");
   public static final ahf<dxg> d = a("overworld");
   public static final ahf<dxg> e = a("snowy_kingdom");
   public static final ahf<dxg> f = a("bottomless_pit");
   public static final ahf<dxg> g = a("desert");
   public static final ahf<dxg> h = a("redstone_ready");
   public static final ahf<dxg> i = a("the_void");

   public static void a(pe<dxg> $$0) {
      new dxh.a($$0).a();
   }

   private static ahf<dxg> a(String $$0) {
      return ahf.a(ke.az, new ahg($$0));
   }

   static class a {
      private final pe<dxg> a;

      a(pe<dxg> $$0) {
         this.a = $$0;
      }

      private void a(ahf<dxg> $$0, ctn $$1, ahf<cun> $$2, Set<ahf<dzl>> $$3, boolean $$4, boolean $$5, dxf... $$6) {
         ii<dzl> $$7 = this.a.a(ke.aF);
         ii<dyj> $$8 = this.a.a(ke.aC);
         ii<cun> $$9 = this.a.a(ke.at);
         il.a<dzl> $$10 = il.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dxi $$11 = new dxi(Optional.of($$10), $$9.b($$2), dxi.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dxg($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dxh.a, cwr.i, cuu.b, ImmutableSet.of(dyy.a), false, false, new dxf(1, cwr.i), new dxf(2, cwr.j), new dxf(1, cwr.F));
         this.a(dxh.b, cwr.b, cuu.t, ImmutableSet.of(dyy.j, dyy.r), true, false, new dxf(1, cwr.i), new dxf(5, cwr.j), new dxf(230, cwr.b), new dxf(1, cwr.F));
         this.a(
            dxh.c,
            cna.qw,
            cuu.T,
            ImmutableSet.of(dyy.m, dyy.l, dyy.g),
            false,
            false,
            new dxf(90, cwr.G),
            new dxf(5, cwr.L),
            new dxf(5, cwr.j),
            new dxf(5, cwr.b),
            new dxf(64, cwr.sJ),
            new dxf(1, cwr.F)
         );
         this.a(
            dxh.d,
            cwr.bt,
            cuu.b,
            ImmutableSet.of(dyy.a, dyy.j, dyy.f, dyy.k, dyy.r),
            true,
            true,
            new dxf(1, cwr.i),
            new dxf(3, cwr.j),
            new dxf(59, cwr.b),
            new dxf(1, cwr.F)
         );
         this.a(
            dxh.e,
            cwr.dN,
            cuu.d,
            ImmutableSet.of(dyy.a, dyy.c),
            false,
            false,
            new dxf(1, cwr.dN),
            new dxf(1, cwr.i),
            new dxf(3, cwr.j),
            new dxf(59, cwr.b),
            new dxf(1, cwr.F)
         );
         this.a(dxh.f, cna.pq, cuu.b, ImmutableSet.of(dyy.a), false, false, new dxf(1, cwr.i), new dxf(3, cwr.j), new dxf(2, cwr.m));
         this.a(
            dxh.g,
            cwr.I,
            cuu.f,
            ImmutableSet.of(dyy.a, dyy.b, dyy.j, dyy.r),
            true,
            false,
            new dxf(8, cwr.I),
            new dxf(52, cwr.aV),
            new dxf(3, cwr.b),
            new dxf(1, cwr.F)
         );
         this.a(dxh.h, cna.lG, cuu.f, ImmutableSet.of(), false, false, new dxf(116, cwr.aV), new dxf(3, cwr.b), new dxf(1, cwr.F));
         this.a(dxh.i, cwr.hW, cuu.a, ImmutableSet.of(), true, false, new dxf(1, cwr.a));
      }
   }
}
