import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class epk {
   public static final alf<epj> a = a("classic_flat");
   public static final alf<epj> b = a("tunnelers_dream");
   public static final alf<epj> c = a("water_world");
   public static final alf<epj> d = a("overworld");
   public static final alf<epj> e = a("snowy_kingdom");
   public static final alf<epj> f = a("bottomless_pit");
   public static final alf<epj> g = a("desert");
   public static final alf<epj> h = a("redstone_ready");
   public static final alf<epj> i = a("the_void");

   public static void a(qh<epj> $$0) {
      new epk.a($$0).a();
   }

   private static alf<epj> a(String $$0) {
      return alf.a(mh.aS, alg.b($$0));
   }

   static class a {
      private final qh<epj> a;

      a(qh<epj> $$0) {
         this.a = $$0;
      }

      private void a(alf<epj> $$0, djg $$1, alf<dkk> $$2, Set<alf<ero>> $$3, boolean $$4, boolean $$5, epi... $$6) {
         jg<ero> $$7 = this.a.a(mh.bd);
         jg<eqm> $$8 = this.a.a(mh.bb);
         jg<dkk> $$9 = this.a.a(mh.aG);
         jj.a<ero> $$10 = jj.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         epl $$11 = new epl(Optional.of($$10), $$9.b($$2), epl.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new epj($$1.h().e(), $$11));
      }

      public void a() {
         this.a(epk.a, dmo.i, dkr.b, ImmutableSet.of(erb.a), false, false, new epi(1, dmo.i), new epi(2, dmo.j), new epi(1, dmo.I));
         this.a(epk.b, dmo.b, dkr.u, ImmutableSet.of(erb.j, erb.r), true, false, new epi(1, dmo.i), new epi(5, dmo.j), new epi(230, dmo.b), new epi(1, dmo.I));
         this.a(
            epk.c,
            czo.rp,
            dkr.U,
            ImmutableSet.of(erb.m, erb.l, erb.g),
            false,
            false,
            new epi(90, dmo.J),
            new epi(5, dmo.O),
            new epi(5, dmo.j),
            new epi(5, dmo.b),
            new epi(64, dmo.tt),
            new epi(1, dmo.I)
         );
         this.a(
            epk.d,
            dmo.bA,
            dkr.b,
            ImmutableSet.of(erb.a, erb.j, erb.f, erb.k, erb.r),
            true,
            true,
            new epi(1, dmo.i),
            new epi(3, dmo.j),
            new epi(59, dmo.b),
            new epi(1, dmo.I)
         );
         this.a(
            epk.e,
            dmo.ed,
            dkr.d,
            ImmutableSet.of(erb.a, erb.c),
            false,
            false,
            new epi(1, dmo.ed),
            new epi(1, dmo.i),
            new epi(3, dmo.j),
            new epi(59, dmo.b),
            new epi(1, dmo.I)
         );
         this.a(epk.f, czo.qh, dkr.b, ImmutableSet.of(erb.a), false, false, new epi(1, dmo.i), new epi(3, dmo.j), new epi(2, dmo.m));
         this.a(
            epk.g,
            dmo.L,
            dkr.f,
            ImmutableSet.of(erb.a, erb.b, erb.j, erb.r),
            true,
            false,
            new epi(8, dmo.L),
            new epi(52, dmo.bc),
            new epi(3, dmo.b),
            new epi(1, dmo.I)
         );
         this.a(epk.h, czo.ml, dkr.f, ImmutableSet.of(), false, false, new epi(116, dmo.bc), new epi(3, dmo.b), new epi(1, dmo.I));
         this.a(epk.i, dmo.iy, dkr.a, ImmutableSet.of(), true, false, new epi(1, dmo.a));
      }
   }
}
