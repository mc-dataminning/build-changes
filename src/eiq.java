import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eiq {
   public static final ala<eip> a = a("classic_flat");
   public static final ala<eip> b = a("tunnelers_dream");
   public static final ala<eip> c = a("water_world");
   public static final ala<eip> d = a("overworld");
   public static final ala<eip> e = a("snowy_kingdom");
   public static final ala<eip> f = a("bottomless_pit");
   public static final ala<eip> g = a("desert");
   public static final ala<eip> h = a("redstone_ready");
   public static final ala<eip> i = a("the_void");

   public static void a(qt<eip> $$0) {
      new eiq.a($$0).a();
   }

   private static ala<eip> a(String $$0) {
      return ala.a(lv.aN, alb.b($$0));
   }

   static class a {
      private final qt<eip> a;

      a(qt<eip> $$0) {
         this.a = $$0;
      }

      private void a(ala<eip> $$0, ddr $$1, ala<det> $$2, Set<ala<eku>> $$3, boolean $$4, boolean $$5, eio... $$6) {
         jo<eku> $$7 = this.a.a(lv.aT);
         jo<ejs> $$8 = this.a.a(lv.aQ);
         jo<det> $$9 = this.a.a(lv.aF);
         jr.a<eku> $$10 = jr.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eir $$11 = new eir(Optional.of($$10), $$9.b($$2), eir.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eip($$1.r().o(), $$11));
      }

      public void a() {
         this.a(eiq.a, dgx.i, dfa.b, ImmutableSet.of(ekh.a), false, false, new eio(1, dgx.i), new eio(2, dgx.j), new eio(1, dgx.F));
         this.a(eiq.b, dgx.b, dfa.t, ImmutableSet.of(ekh.j, ekh.r), true, false, new eio(1, dgx.i), new eio(5, dgx.j), new eio(230, dgx.b), new eio(1, dgx.F));
         this.a(
            eiq.c,
            cvo.qA,
            dfa.T,
            ImmutableSet.of(ekh.m, ekh.l, ekh.g),
            false,
            false,
            new eio(90, dgx.G),
            new eio(5, dgx.L),
            new eio(5, dgx.j),
            new eio(5, dgx.b),
            new eio(64, dgx.sJ),
            new eio(1, dgx.F)
         );
         this.a(
            eiq.d,
            dgx.bt,
            dfa.b,
            ImmutableSet.of(ekh.a, ekh.j, ekh.f, ekh.k, ekh.r),
            true,
            true,
            new eio(1, dgx.i),
            new eio(3, dgx.j),
            new eio(59, dgx.b),
            new eio(1, dgx.F)
         );
         this.a(
            eiq.e,
            dgx.dN,
            dfa.d,
            ImmutableSet.of(ekh.a, ekh.c),
            false,
            false,
            new eio(1, dgx.dN),
            new eio(1, dgx.i),
            new eio(3, dgx.j),
            new eio(59, dgx.b),
            new eio(1, dgx.F)
         );
         this.a(eiq.f, cvo.pu, dfa.b, ImmutableSet.of(ekh.a), false, false, new eio(1, dgx.i), new eio(3, dgx.j), new eio(2, dgx.m));
         this.a(
            eiq.g,
            dgx.I,
            dfa.f,
            ImmutableSet.of(ekh.a, ekh.b, ekh.j, ekh.r),
            true,
            false,
            new eio(8, dgx.I),
            new eio(52, dgx.aV),
            new eio(3, dgx.b),
            new eio(1, dgx.F)
         );
         this.a(eiq.h, cvo.lH, dfa.f, ImmutableSet.of(), false, false, new eio(116, dgx.aV), new eio(3, dgx.b), new eio(1, dgx.F));
         this.a(eiq.i, dgx.hW, dfa.a, ImmutableSet.of(), true, false, new eio(1, dgx.a));
      }
   }
}
