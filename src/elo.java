import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class elo {
   public static final akt<eln> a = a("classic_flat");
   public static final akt<eln> b = a("tunnelers_dream");
   public static final akt<eln> c = a("water_world");
   public static final akt<eln> d = a("overworld");
   public static final akt<eln> e = a("snowy_kingdom");
   public static final akt<eln> f = a("bottomless_pit");
   public static final akt<eln> g = a("desert");
   public static final akt<eln> h = a("redstone_ready");
   public static final akt<eln> i = a("the_void");

   public static void a(qe<eln> $$0) {
      new elo.a($$0).a();
   }

   private static akt<eln> a(String $$0) {
      return akt.a(mc.aQ, aku.b($$0));
   }

   static class a {
      private final qe<eln> a;

      a(qe<eln> $$0) {
         this.a = $$0;
      }

      private void a(akt<eln> $$0, dgh $$1, akt<dhk> $$2, Set<akt<ens>> $$3, boolean $$4, boolean $$5, elm... $$6) {
         js<ens> $$7 = this.a.a(mc.aW);
         js<emq> $$8 = this.a.a(mc.aT);
         js<dhk> $$9 = this.a.a(mc.aI);
         jv.a<ens> $$10 = jv.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         elp $$11 = new elp(Optional.of($$10), $$9.b($$2), elp.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eln($$1.j().f(), $$11));
      }

      public void a() {
         this.a(elo.a, djo.i, dhr.b, ImmutableSet.of(enf.a), false, false, new elm(1, djo.i), new elm(2, djo.j), new elm(1, djo.I));
         this.a(elo.b, djo.b, dhr.u, ImmutableSet.of(enf.j, enf.r), true, false, new elm(1, djo.i), new elm(5, djo.j), new elm(230, djo.b), new elm(1, djo.I));
         this.a(
            elo.c,
            cwt.rg,
            dhr.U,
            ImmutableSet.of(enf.m, enf.l, enf.g),
            false,
            false,
            new elm(90, djo.J),
            new elm(5, djo.O),
            new elm(5, djo.j),
            new elm(5, djo.b),
            new elm(64, djo.tl),
            new elm(1, djo.I)
         );
         this.a(
            elo.d,
            djo.bA,
            dhr.b,
            ImmutableSet.of(enf.a, enf.j, enf.f, enf.k, enf.r),
            true,
            true,
            new elm(1, djo.i),
            new elm(3, djo.j),
            new elm(59, djo.b),
            new elm(1, djo.I)
         );
         this.a(
            elo.e,
            djo.ea,
            dhr.d,
            ImmutableSet.of(enf.a, enf.c),
            false,
            false,
            new elm(1, djo.ea),
            new elm(1, djo.i),
            new elm(3, djo.j),
            new elm(59, djo.b),
            new elm(1, djo.I)
         );
         this.a(elo.f, cwt.pY, dhr.b, ImmutableSet.of(enf.a), false, false, new elm(1, djo.i), new elm(3, djo.j), new elm(2, djo.m));
         this.a(
            elo.g,
            djo.L,
            dhr.f,
            ImmutableSet.of(enf.a, enf.b, enf.j, enf.r),
            true,
            false,
            new elm(8, djo.L),
            new elm(52, djo.bc),
            new elm(3, djo.b),
            new elm(1, djo.I)
         );
         this.a(elo.h, cwt.me, dhr.f, ImmutableSet.of(), false, false, new elm(116, djo.bc), new elm(3, djo.b), new elm(1, djo.I));
         this.a(elo.i, djo.iu, dhr.a, ImmutableSet.of(), true, false, new elm(1, djo.a));
      }
   }
}
