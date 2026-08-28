import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eml {
   public static final akt<emk> a = a("classic_flat");
   public static final akt<emk> b = a("tunnelers_dream");
   public static final akt<emk> c = a("water_world");
   public static final akt<emk> d = a("overworld");
   public static final akt<emk> e = a("snowy_kingdom");
   public static final akt<emk> f = a("bottomless_pit");
   public static final akt<emk> g = a("desert");
   public static final akt<emk> h = a("redstone_ready");
   public static final akt<emk> i = a("the_void");

   public static void a(qe<emk> $$0) {
      new eml.a($$0).a();
   }

   private static akt<emk> a(String $$0) {
      return akt.a(mc.aR, aku.b($$0));
   }

   static class a {
      private final qe<emk> a;

      a(qe<emk> $$0) {
         this.a = $$0;
      }

      private void a(akt<emk> $$0, dgy $$1, akt<dic> $$2, Set<akt<eop>> $$3, boolean $$4, boolean $$5, emj... $$6) {
         js<eop> $$7 = this.a.a(mc.aY);
         js<enn> $$8 = this.a.a(mc.aV);
         js<dic> $$9 = this.a.a(mc.aJ);
         jv.a<eop> $$10 = jv.a($$3.stream().map($$7::b).collect(Collectors.toList()));
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

         this.a.a($$0, new emk($$1.i().f(), $$11));
      }

      public void a() {
         this.a(eml.a, dkg.i, dij.b, ImmutableSet.of(eoc.a), false, false, new emj(1, dkg.i), new emj(2, dkg.j), new emj(1, dkg.I));
         this.a(eml.b, dkg.b, dij.u, ImmutableSet.of(eoc.j, eoc.r), true, false, new emj(1, dkg.i), new emj(5, dkg.j), new emj(230, dkg.b), new emj(1, dkg.I));
         this.a(
            eml.c,
            cxl.ri,
            dij.U,
            ImmutableSet.of(eoc.m, eoc.l, eoc.g),
            false,
            false,
            new emj(90, dkg.J),
            new emj(5, dkg.O),
            new emj(5, dkg.j),
            new emj(5, dkg.b),
            new emj(64, dkg.tn),
            new emj(1, dkg.I)
         );
         this.a(
            eml.d,
            dkg.bA,
            dij.b,
            ImmutableSet.of(eoc.a, eoc.j, eoc.f, eoc.k, eoc.r),
            true,
            true,
            new emj(1, dkg.i),
            new emj(3, dkg.j),
            new emj(59, dkg.b),
            new emj(1, dkg.I)
         );
         this.a(
            eml.e,
            dkg.ea,
            dij.d,
            ImmutableSet.of(eoc.a, eoc.c),
            false,
            false,
            new emj(1, dkg.ea),
            new emj(1, dkg.i),
            new emj(3, dkg.j),
            new emj(59, dkg.b),
            new emj(1, dkg.I)
         );
         this.a(eml.f, cxl.qa, dij.b, ImmutableSet.of(eoc.a), false, false, new emj(1, dkg.i), new emj(3, dkg.j), new emj(2, dkg.m));
         this.a(
            eml.g,
            dkg.L,
            dij.f,
            ImmutableSet.of(eoc.a, eoc.b, eoc.j, eoc.r),
            true,
            false,
            new emj(8, dkg.L),
            new emj(52, dkg.bc),
            new emj(3, dkg.b),
            new emj(1, dkg.I)
         );
         this.a(eml.h, cxl.mg, dij.f, ImmutableSet.of(), false, false, new emj(116, dkg.bc), new emj(3, dkg.b), new emj(1, dkg.I));
         this.a(eml.i, dkg.iu, dij.a, ImmutableSet.of(), true, false, new emj(1, dkg.a));
      }
   }
}
