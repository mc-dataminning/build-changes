import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class epp {
   public static final alf<epo> a = a("classic_flat");
   public static final alf<epo> b = a("tunnelers_dream");
   public static final alf<epo> c = a("water_world");
   public static final alf<epo> d = a("overworld");
   public static final alf<epo> e = a("snowy_kingdom");
   public static final alf<epo> f = a("bottomless_pit");
   public static final alf<epo> g = a("desert");
   public static final alf<epo> h = a("redstone_ready");
   public static final alf<epo> i = a("the_void");

   public static void a(qh<epo> $$0) {
      new epp.a($$0).a();
   }

   private static alf<epo> a(String $$0) {
      return alf.a(mh.aS, alg.b($$0));
   }

   static class a {
      private final qh<epo> a;

      a(qh<epo> $$0) {
         this.a = $$0;
      }

      private void a(alf<epo> $$0, djl $$1, alf<dkp> $$2, Set<alf<ert>> $$3, boolean $$4, boolean $$5, epn... $$6) {
         jg<ert> $$7 = this.a.a(mh.bd);
         jg<eqr> $$8 = this.a.a(mh.bb);
         jg<dkp> $$9 = this.a.a(mh.aG);
         jj.a<ert> $$10 = jj.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         epq $$11 = new epq(Optional.of($$10), $$9.b($$2), epq.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new epo($$1.h().e(), $$11));
      }

      public void a() {
         this.a(epp.a, dmt.i, dkw.b, ImmutableSet.of(erg.a), false, false, new epn(1, dmt.i), new epn(2, dmt.j), new epn(1, dmt.I));
         this.a(epp.b, dmt.b, dkw.u, ImmutableSet.of(erg.j, erg.r), true, false, new epn(1, dmt.i), new epn(5, dmt.j), new epn(230, dmt.b), new epn(1, dmt.I));
         this.a(
            epp.c,
            czr.rp,
            dkw.U,
            ImmutableSet.of(erg.m, erg.l, erg.g),
            false,
            false,
            new epn(90, dmt.J),
            new epn(5, dmt.O),
            new epn(5, dmt.j),
            new epn(5, dmt.b),
            new epn(64, dmt.tt),
            new epn(1, dmt.I)
         );
         this.a(
            epp.d,
            dmt.bA,
            dkw.b,
            ImmutableSet.of(erg.a, erg.j, erg.f, erg.k, erg.r),
            true,
            true,
            new epn(1, dmt.i),
            new epn(3, dmt.j),
            new epn(59, dmt.b),
            new epn(1, dmt.I)
         );
         this.a(
            epp.e,
            dmt.ed,
            dkw.d,
            ImmutableSet.of(erg.a, erg.c),
            false,
            false,
            new epn(1, dmt.ed),
            new epn(1, dmt.i),
            new epn(3, dmt.j),
            new epn(59, dmt.b),
            new epn(1, dmt.I)
         );
         this.a(epp.f, czr.qh, dkw.b, ImmutableSet.of(erg.a), false, false, new epn(1, dmt.i), new epn(3, dmt.j), new epn(2, dmt.m));
         this.a(
            epp.g,
            dmt.L,
            dkw.f,
            ImmutableSet.of(erg.a, erg.b, erg.j, erg.r),
            true,
            false,
            new epn(8, dmt.L),
            new epn(52, dmt.bc),
            new epn(3, dmt.b),
            new epn(1, dmt.I)
         );
         this.a(epp.h, czr.ml, dkw.f, ImmutableSet.of(), false, false, new epn(116, dmt.bc), new epn(3, dmt.b), new epn(1, dmt.I));
         this.a(epp.i, dmt.iy, dkw.a, ImmutableSet.of(), true, false, new epn(1, dmt.a));
      }
   }
}
