import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dwq {
   public static final ags<dwp> a = a("classic_flat");
   public static final ags<dwp> b = a("tunnelers_dream");
   public static final ags<dwp> c = a("water_world");
   public static final ags<dwp> d = a("overworld");
   public static final ags<dwp> e = a("snowy_kingdom");
   public static final ags<dwp> f = a("bottomless_pit");
   public static final ags<dwp> g = a("desert");
   public static final ags<dwp> h = a("redstone_ready");
   public static final ags<dwp> i = a("the_void");

   public static void a(pa<dwp> $$0) {
      new dwq.a($$0).a();
   }

   private static ags<dwp> a(String $$0) {
      return ags.a(kc.ay, new agt($$0));
   }

   static class a {
      private final pa<dwp> a;

      a(pa<dwp> $$0) {
         this.a = $$0;
      }

      private void a(ags<dwp> $$0, csx $$1, ags<ctx> $$2, Set<ags<dyu>> $$3, boolean $$4, boolean $$5, dwo... $$6) {
         ig<dyu> $$7 = this.a.a(kc.aE);
         ig<dxs> $$8 = this.a.a(kc.aB);
         ig<ctx> $$9 = this.a.a(kc.as);
         ij.a<dyu> $$10 = ij.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dwr $$11 = new dwr(Optional.of($$10), $$9.b($$2), dwr.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dwp($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dwq.a, cwb.i, cue.b, ImmutableSet.of(dyh.a), false, false, new dwo(1, cwb.i), new dwo(2, cwb.j), new dwo(1, cwb.F));
         this.a(dwq.b, cwb.b, cue.t, ImmutableSet.of(dyh.j, dyh.r), true, false, new dwo(1, cwb.i), new dwo(5, cwb.j), new dwo(230, cwb.b), new dwo(1, cwb.F));
         this.a(
            dwq.c,
            cmk.qw,
            cue.T,
            ImmutableSet.of(dyh.m, dyh.l, dyh.g),
            false,
            false,
            new dwo(90, cwb.G),
            new dwo(5, cwb.L),
            new dwo(5, cwb.j),
            new dwo(5, cwb.b),
            new dwo(64, cwb.sJ),
            new dwo(1, cwb.F)
         );
         this.a(
            dwq.d,
            cwb.bt,
            cue.b,
            ImmutableSet.of(dyh.a, dyh.j, dyh.f, dyh.k, dyh.r),
            true,
            true,
            new dwo(1, cwb.i),
            new dwo(3, cwb.j),
            new dwo(59, cwb.b),
            new dwo(1, cwb.F)
         );
         this.a(
            dwq.e,
            cwb.dN,
            cue.d,
            ImmutableSet.of(dyh.a, dyh.c),
            false,
            false,
            new dwo(1, cwb.dN),
            new dwo(1, cwb.i),
            new dwo(3, cwb.j),
            new dwo(59, cwb.b),
            new dwo(1, cwb.F)
         );
         this.a(dwq.f, cmk.pq, cue.b, ImmutableSet.of(dyh.a), false, false, new dwo(1, cwb.i), new dwo(3, cwb.j), new dwo(2, cwb.m));
         this.a(
            dwq.g,
            cwb.I,
            cue.f,
            ImmutableSet.of(dyh.a, dyh.b, dyh.j, dyh.r),
            true,
            false,
            new dwo(8, cwb.I),
            new dwo(52, cwb.aV),
            new dwo(3, cwb.b),
            new dwo(1, cwb.F)
         );
         this.a(dwq.h, cmk.lG, cue.f, ImmutableSet.of(), false, false, new dwo(116, cwb.aV), new dwo(3, cwb.b), new dwo(1, cwb.F));
         this.a(dwq.i, cwb.hW, cue.a, ImmutableSet.of(), true, false, new dwo(1, cwb.a));
      }
   }
}
