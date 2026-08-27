import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ebe {
   public static final ajg<ebd> a = a("classic_flat");
   public static final ajg<ebd> b = a("tunnelers_dream");
   public static final ajg<ebd> c = a("water_world");
   public static final ajg<ebd> d = a("overworld");
   public static final ajg<ebd> e = a("snowy_kingdom");
   public static final ajg<ebd> f = a("bottomless_pit");
   public static final ajg<ebd> g = a("desert");
   public static final ajg<ebd> h = a("redstone_ready");
   public static final ajg<ebd> i = a("the_void");

   public static void a(pl<ebd> $$0) {
      new ebe.a($$0).a();
   }

   private static ajg<ebd> a(String $$0) {
      return ajg.a(kj.aA, new ajh($$0));
   }

   static class a {
      private final pl<ebd> a;

      a(pl<ebd> $$0) {
         this.a = $$0;
      }

      private void a(ajg<ebd> $$0, cwy $$1, ajg<cxy> $$2, Set<ajg<edi>> $$3, boolean $$4, boolean $$5, ebc... $$6) {
         im<edi> $$7 = this.a.a(kj.aG);
         im<ecg> $$8 = this.a.a(kj.aD);
         im<cxy> $$9 = this.a.a(kj.au);
         ip.a<edi> $$10 = ip.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         ebf $$11 = new ebf(Optional.of($$10), $$9.b($$2), ebf.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ebd($$1.l().k(), $$11));
      }

      public void a() {
         this.a(ebe.a, dac.i, cyf.b, ImmutableSet.of(ecv.a), false, false, new ebc(1, dac.i), new ebc(2, dac.j), new ebc(1, dac.F));
         this.a(ebe.b, dac.b, cyf.t, ImmutableSet.of(ecv.j, ecv.r), true, false, new ebc(1, dac.i), new ebc(5, dac.j), new ebc(230, dac.b), new ebc(1, dac.F));
         this.a(
            ebe.c,
            cqn.qy,
            cyf.T,
            ImmutableSet.of(ecv.m, ecv.l, ecv.g),
            false,
            false,
            new ebc(90, dac.G),
            new ebc(5, dac.L),
            new ebc(5, dac.j),
            new ebc(5, dac.b),
            new ebc(64, dac.sJ),
            new ebc(1, dac.F)
         );
         this.a(
            ebe.d,
            dac.bt,
            cyf.b,
            ImmutableSet.of(ecv.a, ecv.j, ecv.f, ecv.k, ecv.r),
            true,
            true,
            new ebc(1, dac.i),
            new ebc(3, dac.j),
            new ebc(59, dac.b),
            new ebc(1, dac.F)
         );
         this.a(
            ebe.e,
            dac.dN,
            cyf.d,
            ImmutableSet.of(ecv.a, ecv.c),
            false,
            false,
            new ebc(1, dac.dN),
            new ebc(1, dac.i),
            new ebc(3, dac.j),
            new ebc(59, dac.b),
            new ebc(1, dac.F)
         );
         this.a(ebe.f, cqn.ps, cyf.b, ImmutableSet.of(ecv.a), false, false, new ebc(1, dac.i), new ebc(3, dac.j), new ebc(2, dac.m));
         this.a(
            ebe.g,
            dac.I,
            cyf.f,
            ImmutableSet.of(ecv.a, ecv.b, ecv.j, ecv.r),
            true,
            false,
            new ebc(8, dac.I),
            new ebc(52, dac.aV),
            new ebc(3, dac.b),
            new ebc(1, dac.F)
         );
         this.a(ebe.h, cqn.lG, cyf.f, ImmutableSet.of(), false, false, new ebc(116, dac.aV), new ebc(3, dac.b), new ebc(1, dac.F));
         this.a(ebe.i, dac.hW, cyf.a, ImmutableSet.of(), true, false, new ebc(1, dac.a));
      }
   }
}
