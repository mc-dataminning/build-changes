import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dsz {
   public static final aeo<dsy> a = a("classic_flat");
   public static final aeo<dsy> b = a("tunnelers_dream");
   public static final aeo<dsy> c = a("water_world");
   public static final aeo<dsy> d = a("overworld");
   public static final aeo<dsy> e = a("snowy_kingdom");
   public static final aeo<dsy> f = a("bottomless_pit");
   public static final aeo<dsy> g = a("desert");
   public static final aeo<dsy> h = a("redstone_ready");
   public static final aeo<dsy> i = a("the_void");

   public static void a(nn<dsy> $$0) {
      new dsz.a($$0).a();
   }

   private static aeo<dsy> a(String $$0) {
      return aeo.a(jd.av, new aep($$0));
   }

   static class a {
      private final nn<dsy> a;

      a(nn<dsy> $$0) {
         this.a = $$0;
      }

      private void a(aeo<dsy> $$0, cpj $$1, aeo<cqi> $$2, Set<aeo<dvd>> $$3, boolean $$4, boolean $$5, dsx... $$6) {
         hg<dvd> $$7 = this.a.a(jd.aB);
         hg<dub> $$8 = this.a.a(jd.ay);
         hg<cqi> $$9 = this.a.a(jd.ap);
         hj.a<dvd> $$10 = hj.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dta $$11 = new dta(Optional.of($$10), $$9.b($$2), dta.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dsy($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dsz.a, csl.i, cqp.b, ImmutableSet.of(duq.a), false, false, new dsx(1, csl.i), new dsx(2, csl.j), new dsx(1, csl.F));
         this.a(dsz.b, csl.b, cqp.t, ImmutableSet.of(duq.j, duq.r), true, false, new dsx(1, csl.i), new dsx(5, csl.j), new dsx(230, csl.b), new dsx(1, csl.F));
         this.a(
            dsz.c,
            ciz.pL,
            cqp.T,
            ImmutableSet.of(duq.m, duq.l, duq.g),
            false,
            false,
            new dsx(90, csl.G),
            new dsx(5, csl.L),
            new dsx(5, csl.j),
            new dsx(5, csl.b),
            new dsx(64, csl.rI),
            new dsx(1, csl.F)
         );
         this.a(
            dsz.d,
            csl.bt,
            cqp.b,
            ImmutableSet.of(duq.a, duq.j, duq.f, duq.k, duq.r),
            true,
            true,
            new dsx(1, csl.i),
            new dsx(3, csl.j),
            new dsx(59, csl.b),
            new dsx(1, csl.F)
         );
         this.a(
            dsz.e,
            csl.dN,
            cqp.d,
            ImmutableSet.of(duq.a, duq.c),
            false,
            false,
            new dsx(1, csl.dN),
            new dsx(1, csl.i),
            new dsx(3, csl.j),
            new dsx(59, csl.b),
            new dsx(1, csl.F)
         );
         this.a(dsz.f, ciz.oF, cqp.b, ImmutableSet.of(duq.a), false, false, new dsx(1, csl.i), new dsx(3, csl.j), new dsx(2, csl.m));
         this.a(
            dsz.g,
            csl.I,
            cqp.f,
            ImmutableSet.of(duq.a, duq.b, duq.j, duq.r),
            true,
            false,
            new dsx(8, csl.I),
            new dsx(52, csl.aV),
            new dsx(3, csl.b),
            new dsx(1, csl.F)
         );
         this.a(dsz.h, ciz.ll, cqp.f, ImmutableSet.of(), false, false, new dsx(116, csl.aV), new dsx(3, csl.b), new dsx(1, csl.F));
         this.a(dsz.i, csl.hW, cqp.a, ImmutableSet.of(), true, false, new dsx(1, csl.a));
      }
   }
}
