import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eln {
   public static final aku<elm> a = a("classic_flat");
   public static final aku<elm> b = a("tunnelers_dream");
   public static final aku<elm> c = a("water_world");
   public static final aku<elm> d = a("overworld");
   public static final aku<elm> e = a("snowy_kingdom");
   public static final aku<elm> f = a("bottomless_pit");
   public static final aku<elm> g = a("desert");
   public static final aku<elm> h = a("redstone_ready");
   public static final aku<elm> i = a("the_void");

   public static void a(qe<elm> $$0) {
      new eln.a($$0).a();
   }

   private static aku<elm> a(String $$0) {
      return aku.a(mc.aQ, akv.b($$0));
   }

   static class a {
      private final qe<elm> a;

      a(qe<elm> $$0) {
         this.a = $$0;
      }

      private void a(aku<elm> $$0, dgg $$1, aku<dhj> $$2, Set<aku<enr>> $$3, boolean $$4, boolean $$5, ell... $$6) {
         js<enr> $$7 = this.a.a(mc.aW);
         js<emp> $$8 = this.a.a(mc.aT);
         js<dhj> $$9 = this.a.a(mc.aI);
         jv.a<enr> $$10 = jv.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         elo $$11 = new elo(Optional.of($$10), $$9.b($$2), elo.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new elm($$1.j().f(), $$11));
      }

      public void a() {
         this.a(eln.a, djn.i, dhq.b, ImmutableSet.of(ene.a), false, false, new ell(1, djn.i), new ell(2, djn.j), new ell(1, djn.I));
         this.a(eln.b, djn.b, dhq.u, ImmutableSet.of(ene.j, ene.r), true, false, new ell(1, djn.i), new ell(5, djn.j), new ell(230, djn.b), new ell(1, djn.I));
         this.a(
            eln.c,
            cws.rg,
            dhq.U,
            ImmutableSet.of(ene.m, ene.l, ene.g),
            false,
            false,
            new ell(90, djn.J),
            new ell(5, djn.O),
            new ell(5, djn.j),
            new ell(5, djn.b),
            new ell(64, djn.tl),
            new ell(1, djn.I)
         );
         this.a(
            eln.d,
            djn.bA,
            dhq.b,
            ImmutableSet.of(ene.a, ene.j, ene.f, ene.k, ene.r),
            true,
            true,
            new ell(1, djn.i),
            new ell(3, djn.j),
            new ell(59, djn.b),
            new ell(1, djn.I)
         );
         this.a(
            eln.e,
            djn.ea,
            dhq.d,
            ImmutableSet.of(ene.a, ene.c),
            false,
            false,
            new ell(1, djn.ea),
            new ell(1, djn.i),
            new ell(3, djn.j),
            new ell(59, djn.b),
            new ell(1, djn.I)
         );
         this.a(eln.f, cws.pY, dhq.b, ImmutableSet.of(ene.a), false, false, new ell(1, djn.i), new ell(3, djn.j), new ell(2, djn.m));
         this.a(
            eln.g,
            djn.L,
            dhq.f,
            ImmutableSet.of(ene.a, ene.b, ene.j, ene.r),
            true,
            false,
            new ell(8, djn.L),
            new ell(52, djn.bc),
            new ell(3, djn.b),
            new ell(1, djn.I)
         );
         this.a(eln.h, cws.me, dhq.f, ImmutableSet.of(), false, false, new ell(116, djn.bc), new ell(3, djn.b), new ell(1, djn.I));
         this.a(eln.i, djn.iu, dhq.a, ImmutableSet.of(), true, false, new ell(1, djn.a));
      }
   }
}
