import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class elp {
   public static final aku<elo> a = a("classic_flat");
   public static final aku<elo> b = a("tunnelers_dream");
   public static final aku<elo> c = a("water_world");
   public static final aku<elo> d = a("overworld");
   public static final aku<elo> e = a("snowy_kingdom");
   public static final aku<elo> f = a("bottomless_pit");
   public static final aku<elo> g = a("desert");
   public static final aku<elo> h = a("redstone_ready");
   public static final aku<elo> i = a("the_void");

   public static void a(qe<elo> $$0) {
      new elp.a($$0).a();
   }

   private static aku<elo> a(String $$0) {
      return aku.a(mc.aQ, akv.b($$0));
   }

   static class a {
      private final qe<elo> a;

      a(qe<elo> $$0) {
         this.a = $$0;
      }

      private void a(aku<elo> $$0, dgi $$1, aku<dhl> $$2, Set<aku<ent>> $$3, boolean $$4, boolean $$5, eln... $$6) {
         js<ent> $$7 = this.a.a(mc.aW);
         js<emr> $$8 = this.a.a(mc.aT);
         js<dhl> $$9 = this.a.a(mc.aI);
         jv.a<ent> $$10 = jv.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         elq $$11 = new elq(Optional.of($$10), $$9.b($$2), elq.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new elo($$1.j().f(), $$11));
      }

      public void a() {
         this.a(elp.a, djp.i, dhs.b, ImmutableSet.of(eng.a), false, false, new eln(1, djp.i), new eln(2, djp.j), new eln(1, djp.I));
         this.a(elp.b, djp.b, dhs.u, ImmutableSet.of(eng.j, eng.r), true, false, new eln(1, djp.i), new eln(5, djp.j), new eln(230, djp.b), new eln(1, djp.I));
         this.a(
            elp.c,
            cwu.rg,
            dhs.U,
            ImmutableSet.of(eng.m, eng.l, eng.g),
            false,
            false,
            new eln(90, djp.J),
            new eln(5, djp.O),
            new eln(5, djp.j),
            new eln(5, djp.b),
            new eln(64, djp.tl),
            new eln(1, djp.I)
         );
         this.a(
            elp.d,
            djp.bA,
            dhs.b,
            ImmutableSet.of(eng.a, eng.j, eng.f, eng.k, eng.r),
            true,
            true,
            new eln(1, djp.i),
            new eln(3, djp.j),
            new eln(59, djp.b),
            new eln(1, djp.I)
         );
         this.a(
            elp.e,
            djp.ea,
            dhs.d,
            ImmutableSet.of(eng.a, eng.c),
            false,
            false,
            new eln(1, djp.ea),
            new eln(1, djp.i),
            new eln(3, djp.j),
            new eln(59, djp.b),
            new eln(1, djp.I)
         );
         this.a(elp.f, cwu.pY, dhs.b, ImmutableSet.of(eng.a), false, false, new eln(1, djp.i), new eln(3, djp.j), new eln(2, djp.m));
         this.a(
            elp.g,
            djp.L,
            dhs.f,
            ImmutableSet.of(eng.a, eng.b, eng.j, eng.r),
            true,
            false,
            new eln(8, djp.L),
            new eln(52, djp.bc),
            new eln(3, djp.b),
            new eln(1, djp.I)
         );
         this.a(elp.h, cwu.me, dhs.f, ImmutableSet.of(), false, false, new eln(116, djp.bc), new eln(3, djp.b), new eln(1, djp.I));
         this.a(elp.i, djp.iu, dhs.a, ImmutableSet.of(), true, false, new eln(1, djp.a));
      }
   }
}
