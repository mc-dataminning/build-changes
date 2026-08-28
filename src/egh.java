import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class egh {
   public static final ala<egg> a = a("classic_flat");
   public static final ala<egg> b = a("tunnelers_dream");
   public static final ala<egg> c = a("water_world");
   public static final ala<egg> d = a("overworld");
   public static final ala<egg> e = a("snowy_kingdom");
   public static final ala<egg> f = a("bottomless_pit");
   public static final ala<egg> g = a("desert");
   public static final ala<egg> h = a("redstone_ready");
   public static final ala<egg> i = a("the_void");

   public static void a(rc<egg> $$0) {
      new egh.a($$0).a();
   }

   private static ala<egg> a(String $$0) {
      return ala.a(lq.aF, new alb($$0));
   }

   static class a {
      private final rc<egg> a;

      a(rc<egg> $$0) {
         this.a = $$0;
      }

      private void a(ala<egg> $$0, dbs $$1, ala<dcs> $$2, Set<ala<eil>> $$3, boolean $$4, boolean $$5, egf... $$6) {
         jj<eil> $$7 = this.a.a(lq.aL);
         jj<ehj> $$8 = this.a.a(lq.aI);
         jj<dcs> $$9 = this.a.a(lq.az);
         jm.a<eil> $$10 = jm.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         egi $$11 = new egi(Optional.of($$10), $$9.b($$2), egi.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new egg($$1.r().o(), $$11));
      }

      public void a() {
         this.a(egh.a, dew.i, dcz.b, ImmutableSet.of(ehy.a), false, false, new egf(1, dew.i), new egf(2, dew.j), new egf(1, dew.F));
         this.a(egh.b, dew.b, dcz.t, ImmutableSet.of(ehy.j, ehy.r), true, false, new egf(1, dew.i), new egf(5, dew.j), new egf(230, dew.b), new egf(1, dew.F));
         this.a(
            egh.c,
            cun.qz,
            dcz.T,
            ImmutableSet.of(ehy.m, ehy.l, ehy.g),
            false,
            false,
            new egf(90, dew.G),
            new egf(5, dew.L),
            new egf(5, dew.j),
            new egf(5, dew.b),
            new egf(64, dew.sJ),
            new egf(1, dew.F)
         );
         this.a(
            egh.d,
            dew.bt,
            dcz.b,
            ImmutableSet.of(ehy.a, ehy.j, ehy.f, ehy.k, ehy.r),
            true,
            true,
            new egf(1, dew.i),
            new egf(3, dew.j),
            new egf(59, dew.b),
            new egf(1, dew.F)
         );
         this.a(
            egh.e,
            dew.dN,
            dcz.d,
            ImmutableSet.of(ehy.a, ehy.c),
            false,
            false,
            new egf(1, dew.dN),
            new egf(1, dew.i),
            new egf(3, dew.j),
            new egf(59, dew.b),
            new egf(1, dew.F)
         );
         this.a(egh.f, cun.pt, dcz.b, ImmutableSet.of(ehy.a), false, false, new egf(1, dew.i), new egf(3, dew.j), new egf(2, dew.m));
         this.a(
            egh.g,
            dew.I,
            dcz.f,
            ImmutableSet.of(ehy.a, ehy.b, ehy.j, ehy.r),
            true,
            false,
            new egf(8, dew.I),
            new egf(52, dew.aV),
            new egf(3, dew.b),
            new egf(1, dew.F)
         );
         this.a(egh.h, cun.lH, dcz.f, ImmutableSet.of(), false, false, new egf(116, dew.aV), new egf(3, dew.b), new egf(1, dew.F));
         this.a(egh.i, dew.hW, dcz.a, ImmutableSet.of(), true, false, new egf(1, dew.a));
      }
   }
}
