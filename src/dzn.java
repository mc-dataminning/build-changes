import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dzn {
   public static final aix<dzm> a = a("classic_flat");
   public static final aix<dzm> b = a("tunnelers_dream");
   public static final aix<dzm> c = a("water_world");
   public static final aix<dzm> d = a("overworld");
   public static final aix<dzm> e = a("snowy_kingdom");
   public static final aix<dzm> f = a("bottomless_pit");
   public static final aix<dzm> g = a("desert");
   public static final aix<dzm> h = a("redstone_ready");
   public static final aix<dzm> i = a("the_void");

   public static void a(ph<dzm> $$0) {
      new dzn.a($$0).a();
   }

   private static aix<dzm> a(String $$0) {
      return aix.a(kg.az, new aiy($$0));
   }

   static class a {
      private final ph<dzm> a;

      a(ph<dzm> $$0) {
         this.a = $$0;
      }

      private void a(aix<dzm> $$0, cvq $$1, aix<cwq> $$2, Set<aix<ebr>> $$3, boolean $$4, boolean $$5, dzl... $$6) {
         ik<ebr> $$7 = this.a.a(kg.aF);
         ik<eap> $$8 = this.a.a(kg.aC);
         ik<cwq> $$9 = this.a.a(kg.at);
         in.a<ebr> $$10 = in.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dzo $$11 = new dzo(Optional.of($$10), $$9.b($$2), dzo.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dzm($$1.j().i(), $$11));
      }

      public void a() {
         this.a(dzn.a, cyu.i, cwx.b, ImmutableSet.of(ebe.a), false, false, new dzl(1, cyu.i), new dzl(2, cyu.j), new dzl(1, cyu.F));
         this.a(dzn.b, cyu.b, cwx.t, ImmutableSet.of(ebe.j, ebe.r), true, false, new dzl(1, cyu.i), new dzl(5, cyu.j), new dzl(230, cyu.b), new dzl(1, cyu.F));
         this.a(
            dzn.c,
            cpg.qy,
            cwx.T,
            ImmutableSet.of(ebe.m, ebe.l, ebe.g),
            false,
            false,
            new dzl(90, cyu.G),
            new dzl(5, cyu.L),
            new dzl(5, cyu.j),
            new dzl(5, cyu.b),
            new dzl(64, cyu.sJ),
            new dzl(1, cyu.F)
         );
         this.a(
            dzn.d,
            cyu.bt,
            cwx.b,
            ImmutableSet.of(ebe.a, ebe.j, ebe.f, ebe.k, ebe.r),
            true,
            true,
            new dzl(1, cyu.i),
            new dzl(3, cyu.j),
            new dzl(59, cyu.b),
            new dzl(1, cyu.F)
         );
         this.a(
            dzn.e,
            cyu.dN,
            cwx.d,
            ImmutableSet.of(ebe.a, ebe.c),
            false,
            false,
            new dzl(1, cyu.dN),
            new dzl(1, cyu.i),
            new dzl(3, cyu.j),
            new dzl(59, cyu.b),
            new dzl(1, cyu.F)
         );
         this.a(dzn.f, cpg.ps, cwx.b, ImmutableSet.of(ebe.a), false, false, new dzl(1, cyu.i), new dzl(3, cyu.j), new dzl(2, cyu.m));
         this.a(
            dzn.g,
            cyu.I,
            cwx.f,
            ImmutableSet.of(ebe.a, ebe.b, ebe.j, ebe.r),
            true,
            false,
            new dzl(8, cyu.I),
            new dzl(52, cyu.aV),
            new dzl(3, cyu.b),
            new dzl(1, cyu.F)
         );
         this.a(dzn.h, cpg.lG, cwx.f, ImmutableSet.of(), false, false, new dzl(116, cyu.aV), new dzl(3, cyu.b), new dzl(1, cyu.F));
         this.a(dzn.i, cyu.hW, cwx.a, ImmutableSet.of(), true, false, new dzl(1, cyu.a));
      }
   }
}
