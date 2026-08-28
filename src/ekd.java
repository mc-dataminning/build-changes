import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ekd {
   public static final alk<ekc> a = a("classic_flat");
   public static final alk<ekc> b = a("tunnelers_dream");
   public static final alk<ekc> c = a("water_world");
   public static final alk<ekc> d = a("overworld");
   public static final alk<ekc> e = a("snowy_kingdom");
   public static final alk<ekc> f = a("bottomless_pit");
   public static final alk<ekc> g = a("desert");
   public static final alk<ekc> h = a("redstone_ready");
   public static final alk<ekc> i = a("the_void");

   public static void a(rb<ekc> $$0) {
      new ekd.a($$0).a();
   }

   private static alk<ekc> a(String $$0) {
      return alk.a(ma.aO, all.b($$0));
   }

   static class a {
      private final rb<ekc> a;

      a(rb<ekc> $$0) {
         this.a = $$0;
      }

      private void a(alk<ekc> $$0, dfe $$1, alk<dgh> $$2, Set<alk<emh>> $$3, boolean $$4, boolean $$5, ekb... $$6) {
         jr<emh> $$7 = this.a.a(ma.aU);
         jr<elf> $$8 = this.a.a(ma.aR);
         jr<dgh> $$9 = this.a.a(ma.aG);
         ju.a<emh> $$10 = ju.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eke $$11 = new eke(Optional.of($$10), $$9.b($$2), eke.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ekc($$1.j().f(), $$11));
      }

      public void a() {
         this.a(ekd.a, dil.i, dgo.b, ImmutableSet.of(elu.a), false, false, new ekb(1, dil.i), new ekb(2, dil.j), new ekb(1, dil.F));
         this.a(ekd.b, dil.b, dgo.t, ImmutableSet.of(elu.j, elu.r), true, false, new ekb(1, dil.i), new ekb(5, dil.j), new ekb(230, dil.b), new ekb(1, dil.F));
         this.a(
            ekd.c,
            cwj.qA,
            dgo.T,
            ImmutableSet.of(elu.m, elu.l, elu.g),
            false,
            false,
            new ekb(90, dil.G),
            new ekb(5, dil.L),
            new ekb(5, dil.j),
            new ekb(5, dil.b),
            new ekb(64, dil.sJ),
            new ekb(1, dil.F)
         );
         this.a(
            ekd.d,
            dil.bt,
            dgo.b,
            ImmutableSet.of(elu.a, elu.j, elu.f, elu.k, elu.r),
            true,
            true,
            new ekb(1, dil.i),
            new ekb(3, dil.j),
            new ekb(59, dil.b),
            new ekb(1, dil.F)
         );
         this.a(
            ekd.e,
            dil.dN,
            dgo.d,
            ImmutableSet.of(elu.a, elu.c),
            false,
            false,
            new ekb(1, dil.dN),
            new ekb(1, dil.i),
            new ekb(3, dil.j),
            new ekb(59, dil.b),
            new ekb(1, dil.F)
         );
         this.a(ekd.f, cwj.pu, dgo.b, ImmutableSet.of(elu.a), false, false, new ekb(1, dil.i), new ekb(3, dil.j), new ekb(2, dil.m));
         this.a(
            ekd.g,
            dil.I,
            dgo.f,
            ImmutableSet.of(elu.a, elu.b, elu.j, elu.r),
            true,
            false,
            new ekb(8, dil.I),
            new ekb(52, dil.aV),
            new ekb(3, dil.b),
            new ekb(1, dil.F)
         );
         this.a(ekd.h, cwj.lH, dgo.f, ImmutableSet.of(), false, false, new ekb(116, dil.aV), new ekb(3, dil.b), new ekb(1, dil.F));
         this.a(ekd.i, dil.hW, dgo.a, ImmutableSet.of(), true, false, new ekb(1, dil.a));
      }
   }
}
