import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ebg {
   public static final ajg<ebf> a = a("classic_flat");
   public static final ajg<ebf> b = a("tunnelers_dream");
   public static final ajg<ebf> c = a("water_world");
   public static final ajg<ebf> d = a("overworld");
   public static final ajg<ebf> e = a("snowy_kingdom");
   public static final ajg<ebf> f = a("bottomless_pit");
   public static final ajg<ebf> g = a("desert");
   public static final ajg<ebf> h = a("redstone_ready");
   public static final ajg<ebf> i = a("the_void");

   public static void a(pl<ebf> $$0) {
      new ebg.a($$0).a();
   }

   private static ajg<ebf> a(String $$0) {
      return ajg.a(kj.aA, new ajh($$0));
   }

   static class a {
      private final pl<ebf> a;

      a(pl<ebf> $$0) {
         this.a = $$0;
      }

      private void a(ajg<ebf> $$0, cxa $$1, ajg<cya> $$2, Set<ajg<edk>> $$3, boolean $$4, boolean $$5, ebe... $$6) {
         im<edk> $$7 = this.a.a(kj.aG);
         im<eci> $$8 = this.a.a(kj.aD);
         im<cya> $$9 = this.a.a(kj.au);
         ip.a<edk> $$10 = ip.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         ebh $$11 = new ebh(Optional.of($$10), $$9.b($$2), ebh.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ebf($$1.l().k(), $$11));
      }

      public void a() {
         this.a(ebg.a, dae.i, cyh.b, ImmutableSet.of(ecx.a), false, false, new ebe(1, dae.i), new ebe(2, dae.j), new ebe(1, dae.F));
         this.a(ebg.b, dae.b, cyh.t, ImmutableSet.of(ecx.j, ecx.r), true, false, new ebe(1, dae.i), new ebe(5, dae.j), new ebe(230, dae.b), new ebe(1, dae.F));
         this.a(
            ebg.c,
            cqp.qy,
            cyh.T,
            ImmutableSet.of(ecx.m, ecx.l, ecx.g),
            false,
            false,
            new ebe(90, dae.G),
            new ebe(5, dae.L),
            new ebe(5, dae.j),
            new ebe(5, dae.b),
            new ebe(64, dae.sJ),
            new ebe(1, dae.F)
         );
         this.a(
            ebg.d,
            dae.bt,
            cyh.b,
            ImmutableSet.of(ecx.a, ecx.j, ecx.f, ecx.k, ecx.r),
            true,
            true,
            new ebe(1, dae.i),
            new ebe(3, dae.j),
            new ebe(59, dae.b),
            new ebe(1, dae.F)
         );
         this.a(
            ebg.e,
            dae.dN,
            cyh.d,
            ImmutableSet.of(ecx.a, ecx.c),
            false,
            false,
            new ebe(1, dae.dN),
            new ebe(1, dae.i),
            new ebe(3, dae.j),
            new ebe(59, dae.b),
            new ebe(1, dae.F)
         );
         this.a(ebg.f, cqp.ps, cyh.b, ImmutableSet.of(ecx.a), false, false, new ebe(1, dae.i), new ebe(3, dae.j), new ebe(2, dae.m));
         this.a(
            ebg.g,
            dae.I,
            cyh.f,
            ImmutableSet.of(ecx.a, ecx.b, ecx.j, ecx.r),
            true,
            false,
            new ebe(8, dae.I),
            new ebe(52, dae.aV),
            new ebe(3, dae.b),
            new ebe(1, dae.F)
         );
         this.a(ebg.h, cqp.lG, cyh.f, ImmutableSet.of(), false, false, new ebe(116, dae.aV), new ebe(3, dae.b), new ebe(1, dae.F));
         this.a(ebg.i, dae.hW, cyh.a, ImmutableSet.of(), true, false, new ebe(1, dae.a));
      }
   }
}
