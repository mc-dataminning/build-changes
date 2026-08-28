import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eml {
   public static final aly<emk> a = a("classic_flat");
   public static final aly<emk> b = a("tunnelers_dream");
   public static final aly<emk> c = a("water_world");
   public static final aly<emk> d = a("overworld");
   public static final aly<emk> e = a("snowy_kingdom");
   public static final aly<emk> f = a("bottomless_pit");
   public static final aly<emk> g = a("desert");
   public static final aly<emk> h = a("redstone_ready");
   public static final aly<emk> i = a("the_void");

   public static void a(rk<emk> $$0) {
      new eml.a($$0).a();
   }

   private static aly<emk> a(String $$0) {
      return aly.a(mb.aQ, alz.b($$0));
   }

   static class a {
      private final rk<emk> a;

      a(rk<emk> $$0) {
         this.a = $$0;
      }

      private void a(aly<emk> $$0, dhg $$1, aly<dij> $$2, Set<aly<eop>> $$3, boolean $$4, boolean $$5, emj... $$6) {
         jr<eop> $$7 = this.a.a(mb.aW);
         jr<enn> $$8 = this.a.a(mb.aT);
         jr<dij> $$9 = this.a.a(mb.aI);
         ju.a<eop> $$10 = ju.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         emm $$11 = new emm(Optional.of($$10), $$9.b($$2), emm.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new emk($$1.j().f(), $$11));
      }

      public void a() {
         this.a(eml.a, dkn.i, diq.b, ImmutableSet.of(eoc.a), false, false, new emj(1, dkn.i), new emj(2, dkn.j), new emj(1, dkn.I));
         this.a(eml.b, dkn.b, diq.t, ImmutableSet.of(eoc.j, eoc.r), true, false, new emj(1, dkn.i), new emj(5, dkn.j), new emj(230, dkn.b), new emj(1, dkn.I));
         this.a(
            eml.c,
            cxs.qX,
            diq.T,
            ImmutableSet.of(eoc.m, eoc.l, eoc.g),
            false,
            false,
            new emj(90, dkn.J),
            new emj(5, dkn.O),
            new emj(5, dkn.j),
            new emj(5, dkn.b),
            new emj(64, dkn.te),
            new emj(1, dkn.I)
         );
         this.a(
            eml.d,
            dkn.bA,
            diq.b,
            ImmutableSet.of(eoc.a, eoc.j, eoc.f, eoc.k, eoc.r),
            true,
            true,
            new emj(1, dkn.i),
            new emj(3, dkn.j),
            new emj(59, dkn.b),
            new emj(1, dkn.I)
         );
         this.a(
            eml.e,
            dkn.ea,
            diq.d,
            ImmutableSet.of(eoc.a, eoc.c),
            false,
            false,
            new emj(1, dkn.ea),
            new emj(1, dkn.i),
            new emj(3, dkn.j),
            new emj(59, dkn.b),
            new emj(1, dkn.I)
         );
         this.a(eml.f, cxs.pP, diq.b, ImmutableSet.of(eoc.a), false, false, new emj(1, dkn.i), new emj(3, dkn.j), new emj(2, dkn.m));
         this.a(
            eml.g,
            dkn.L,
            diq.f,
            ImmutableSet.of(eoc.a, eoc.b, eoc.j, eoc.r),
            true,
            false,
            new emj(8, dkn.L),
            new emj(52, dkn.bc),
            new emj(3, dkn.b),
            new emj(1, dkn.I)
         );
         this.a(eml.h, cxs.lV, diq.f, ImmutableSet.of(), false, false, new emj(116, dkn.bc), new emj(3, dkn.b), new emj(1, dkn.I));
         this.a(eml.i, dkn.in, diq.a, ImmutableSet.of(), true, false, new emj(1, dkn.a));
      }
   }
}
