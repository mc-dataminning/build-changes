import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eme {
   public static final aly<emd> a = a("classic_flat");
   public static final aly<emd> b = a("tunnelers_dream");
   public static final aly<emd> c = a("water_world");
   public static final aly<emd> d = a("overworld");
   public static final aly<emd> e = a("snowy_kingdom");
   public static final aly<emd> f = a("bottomless_pit");
   public static final aly<emd> g = a("desert");
   public static final aly<emd> h = a("redstone_ready");
   public static final aly<emd> i = a("the_void");

   public static void a(rk<emd> $$0) {
      new eme.a($$0).a();
   }

   private static aly<emd> a(String $$0) {
      return aly.a(mb.aP, alz.b($$0));
   }

   static class a {
      private final rk<emd> a;

      a(rk<emd> $$0) {
         this.a = $$0;
      }

      private void a(aly<emd> $$0, dgz $$1, aly<dic> $$2, Set<aly<eoi>> $$3, boolean $$4, boolean $$5, emc... $$6) {
         jr<eoi> $$7 = this.a.a(mb.aV);
         jr<eng> $$8 = this.a.a(mb.aS);
         jr<dic> $$9 = this.a.a(mb.aH);
         ju.a<eoi> $$10 = ju.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         emf $$11 = new emf(Optional.of($$10), $$9.b($$2), emf.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new emd($$1.j().f(), $$11));
      }

      public void a() {
         this.a(eme.a, dkg.i, dij.b, ImmutableSet.of(env.a), false, false, new emc(1, dkg.i), new emc(2, dkg.j), new emc(1, dkg.I));
         this.a(eme.b, dkg.b, dij.t, ImmutableSet.of(env.j, env.r), true, false, new emc(1, dkg.i), new emc(5, dkg.j), new emc(230, dkg.b), new emc(1, dkg.I));
         this.a(
            eme.c,
            cxo.qX,
            dij.T,
            ImmutableSet.of(env.m, env.l, env.g),
            false,
            false,
            new emc(90, dkg.J),
            new emc(5, dkg.O),
            new emc(5, dkg.j),
            new emc(5, dkg.b),
            new emc(64, dkg.te),
            new emc(1, dkg.I)
         );
         this.a(
            eme.d,
            dkg.bA,
            dij.b,
            ImmutableSet.of(env.a, env.j, env.f, env.k, env.r),
            true,
            true,
            new emc(1, dkg.i),
            new emc(3, dkg.j),
            new emc(59, dkg.b),
            new emc(1, dkg.I)
         );
         this.a(
            eme.e,
            dkg.ea,
            dij.d,
            ImmutableSet.of(env.a, env.c),
            false,
            false,
            new emc(1, dkg.ea),
            new emc(1, dkg.i),
            new emc(3, dkg.j),
            new emc(59, dkg.b),
            new emc(1, dkg.I)
         );
         this.a(eme.f, cxo.pP, dij.b, ImmutableSet.of(env.a), false, false, new emc(1, dkg.i), new emc(3, dkg.j), new emc(2, dkg.m));
         this.a(
            eme.g,
            dkg.L,
            dij.f,
            ImmutableSet.of(env.a, env.b, env.j, env.r),
            true,
            false,
            new emc(8, dkg.L),
            new emc(52, dkg.bc),
            new emc(3, dkg.b),
            new emc(1, dkg.I)
         );
         this.a(eme.h, cxo.lV, dij.f, ImmutableSet.of(), false, false, new emc(116, dkg.bc), new emc(3, dkg.b), new emc(1, dkg.I));
         this.a(eme.i, dkg.in, dij.a, ImmutableSet.of(), true, false, new emc(1, dkg.a));
      }
   }
}
