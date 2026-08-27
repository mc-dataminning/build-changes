import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dxb {
   public static final ahc<dxa> a = a("classic_flat");
   public static final ahc<dxa> b = a("tunnelers_dream");
   public static final ahc<dxa> c = a("water_world");
   public static final ahc<dxa> d = a("overworld");
   public static final ahc<dxa> e = a("snowy_kingdom");
   public static final ahc<dxa> f = a("bottomless_pit");
   public static final ahc<dxa> g = a("desert");
   public static final ahc<dxa> h = a("redstone_ready");
   public static final ahc<dxa> i = a("the_void");

   public static void a(pc<dxa> $$0) {
      new dxb.a($$0).a();
   }

   private static ahc<dxa> a(String $$0) {
      return ahc.a(ke.az, new ahd($$0));
   }

   static class a {
      private final pc<dxa> a;

      a(pc<dxa> $$0) {
         this.a = $$0;
      }

      private void a(ahc<dxa> $$0, cth $$1, ahc<cuh> $$2, Set<ahc<dzf>> $$3, boolean $$4, boolean $$5, dwz... $$6) {
         ii<dzf> $$7 = this.a.a(ke.aF);
         ii<dyd> $$8 = this.a.a(ke.aC);
         ii<cuh> $$9 = this.a.a(ke.at);
         il.a<dzf> $$10 = il.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dxc $$11 = new dxc(Optional.of($$10), $$9.b($$2), dxc.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dxa($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dxb.a, cwl.i, cuo.b, ImmutableSet.of(dys.a), false, false, new dwz(1, cwl.i), new dwz(2, cwl.j), new dwz(1, cwl.F));
         this.a(dxb.b, cwl.b, cuo.t, ImmutableSet.of(dys.j, dys.r), true, false, new dwz(1, cwl.i), new dwz(5, cwl.j), new dwz(230, cwl.b), new dwz(1, cwl.F));
         this.a(
            dxb.c,
            cmu.qw,
            cuo.T,
            ImmutableSet.of(dys.m, dys.l, dys.g),
            false,
            false,
            new dwz(90, cwl.G),
            new dwz(5, cwl.L),
            new dwz(5, cwl.j),
            new dwz(5, cwl.b),
            new dwz(64, cwl.sJ),
            new dwz(1, cwl.F)
         );
         this.a(
            dxb.d,
            cwl.bt,
            cuo.b,
            ImmutableSet.of(dys.a, dys.j, dys.f, dys.k, dys.r),
            true,
            true,
            new dwz(1, cwl.i),
            new dwz(3, cwl.j),
            new dwz(59, cwl.b),
            new dwz(1, cwl.F)
         );
         this.a(
            dxb.e,
            cwl.dN,
            cuo.d,
            ImmutableSet.of(dys.a, dys.c),
            false,
            false,
            new dwz(1, cwl.dN),
            new dwz(1, cwl.i),
            new dwz(3, cwl.j),
            new dwz(59, cwl.b),
            new dwz(1, cwl.F)
         );
         this.a(dxb.f, cmu.pq, cuo.b, ImmutableSet.of(dys.a), false, false, new dwz(1, cwl.i), new dwz(3, cwl.j), new dwz(2, cwl.m));
         this.a(
            dxb.g,
            cwl.I,
            cuo.f,
            ImmutableSet.of(dys.a, dys.b, dys.j, dys.r),
            true,
            false,
            new dwz(8, cwl.I),
            new dwz(52, cwl.aV),
            new dwz(3, cwl.b),
            new dwz(1, cwl.F)
         );
         this.a(dxb.h, cmu.lG, cuo.f, ImmutableSet.of(), false, false, new dwz(116, cwl.aV), new dwz(3, cwl.b), new dwz(1, cwl.F));
         this.a(dxb.i, cwl.hW, cuo.a, ImmutableSet.of(), true, false, new dwz(1, cwl.a));
      }
   }
}
