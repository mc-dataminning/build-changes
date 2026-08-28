import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class elm {
   public static final akt<ell> a = a("classic_flat");
   public static final akt<ell> b = a("tunnelers_dream");
   public static final akt<ell> c = a("water_world");
   public static final akt<ell> d = a("overworld");
   public static final akt<ell> e = a("snowy_kingdom");
   public static final akt<ell> f = a("bottomless_pit");
   public static final akt<ell> g = a("desert");
   public static final akt<ell> h = a("redstone_ready");
   public static final akt<ell> i = a("the_void");

   public static void a(qe<ell> $$0) {
      new elm.a($$0).a();
   }

   private static akt<ell> a(String $$0) {
      return akt.a(mc.aQ, aku.b($$0));
   }

   static class a {
      private final qe<ell> a;

      a(qe<ell> $$0) {
         this.a = $$0;
      }

      private void a(akt<ell> $$0, dgf $$1, akt<dhi> $$2, Set<akt<enq>> $$3, boolean $$4, boolean $$5, elk... $$6) {
         js<enq> $$7 = this.a.a(mc.aW);
         js<emo> $$8 = this.a.a(mc.aT);
         js<dhi> $$9 = this.a.a(mc.aI);
         jv.a<enq> $$10 = jv.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eln $$11 = new eln(Optional.of($$10), $$9.b($$2), eln.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ell($$1.j().f(), $$11));
      }

      public void a() {
         this.a(elm.a, djm.i, dhp.b, ImmutableSet.of(end.a), false, false, new elk(1, djm.i), new elk(2, djm.j), new elk(1, djm.I));
         this.a(elm.b, djm.b, dhp.u, ImmutableSet.of(end.j, end.r), true, false, new elk(1, djm.i), new elk(5, djm.j), new elk(230, djm.b), new elk(1, djm.I));
         this.a(
            elm.c,
            cwr.rg,
            dhp.U,
            ImmutableSet.of(end.m, end.l, end.g),
            false,
            false,
            new elk(90, djm.J),
            new elk(5, djm.O),
            new elk(5, djm.j),
            new elk(5, djm.b),
            new elk(64, djm.tl),
            new elk(1, djm.I)
         );
         this.a(
            elm.d,
            djm.bA,
            dhp.b,
            ImmutableSet.of(end.a, end.j, end.f, end.k, end.r),
            true,
            true,
            new elk(1, djm.i),
            new elk(3, djm.j),
            new elk(59, djm.b),
            new elk(1, djm.I)
         );
         this.a(
            elm.e,
            djm.ea,
            dhp.d,
            ImmutableSet.of(end.a, end.c),
            false,
            false,
            new elk(1, djm.ea),
            new elk(1, djm.i),
            new elk(3, djm.j),
            new elk(59, djm.b),
            new elk(1, djm.I)
         );
         this.a(elm.f, cwr.pY, dhp.b, ImmutableSet.of(end.a), false, false, new elk(1, djm.i), new elk(3, djm.j), new elk(2, djm.m));
         this.a(
            elm.g,
            djm.L,
            dhp.f,
            ImmutableSet.of(end.a, end.b, end.j, end.r),
            true,
            false,
            new elk(8, djm.L),
            new elk(52, djm.bc),
            new elk(3, djm.b),
            new elk(1, djm.I)
         );
         this.a(elm.h, cwr.me, dhp.f, ImmutableSet.of(), false, false, new elk(116, djm.bc), new elk(3, djm.b), new elk(1, djm.I));
         this.a(elm.i, djm.iu, dhp.a, ImmutableSet.of(), true, false, new elk(1, djm.a));
      }
   }
}
