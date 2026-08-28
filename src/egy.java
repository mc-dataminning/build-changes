import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class egy {
   public static final akj<egx> a = a("classic_flat");
   public static final akj<egx> b = a("tunnelers_dream");
   public static final akj<egx> c = a("water_world");
   public static final akj<egx> d = a("overworld");
   public static final akj<egx> e = a("snowy_kingdom");
   public static final akj<egx> f = a("bottomless_pit");
   public static final akj<egx> g = a("desert");
   public static final akj<egx> h = a("redstone_ready");
   public static final akj<egx> i = a("the_void");

   public static void a(qm<egx> $$0) {
      new egy.a($$0).a();
   }

   private static akj<egx> a(String $$0) {
      return akj.a(lr.aM, new akk($$0));
   }

   static class a {
      private final qm<egx> a;

      a(qm<egx> $$0) {
         this.a = $$0;
      }

      private void a(akj<egx> $$0, dce $$1, akj<ddf> $$2, Set<akj<ejc>> $$3, boolean $$4, boolean $$5, egw... $$6) {
         jk<ejc> $$7 = this.a.a(lr.aS);
         jk<eia> $$8 = this.a.a(lr.aP);
         jk<ddf> $$9 = this.a.a(lr.aE);
         jn.a<ejc> $$10 = jn.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         egz $$11 = new egz(Optional.of($$10), $$9.b($$2), egz.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new egx($$1.r().o(), $$11));
      }

      public void a() {
         this.a(egy.a, dfj.i, ddm.b, ImmutableSet.of(eip.a), false, false, new egw(1, dfj.i), new egw(2, dfj.j), new egw(1, dfj.F));
         this.a(egy.b, dfj.b, ddm.t, ImmutableSet.of(eip.j, eip.r), true, false, new egw(1, dfj.i), new egw(5, dfj.j), new egw(230, dfj.b), new egw(1, dfj.F));
         this.a(
            egy.c,
            cuf.qz,
            ddm.T,
            ImmutableSet.of(eip.m, eip.l, eip.g),
            false,
            false,
            new egw(90, dfj.G),
            new egw(5, dfj.L),
            new egw(5, dfj.j),
            new egw(5, dfj.b),
            new egw(64, dfj.sJ),
            new egw(1, dfj.F)
         );
         this.a(
            egy.d,
            dfj.bt,
            ddm.b,
            ImmutableSet.of(eip.a, eip.j, eip.f, eip.k, eip.r),
            true,
            true,
            new egw(1, dfj.i),
            new egw(3, dfj.j),
            new egw(59, dfj.b),
            new egw(1, dfj.F)
         );
         this.a(
            egy.e,
            dfj.dN,
            ddm.d,
            ImmutableSet.of(eip.a, eip.c),
            false,
            false,
            new egw(1, dfj.dN),
            new egw(1, dfj.i),
            new egw(3, dfj.j),
            new egw(59, dfj.b),
            new egw(1, dfj.F)
         );
         this.a(egy.f, cuf.pt, ddm.b, ImmutableSet.of(eip.a), false, false, new egw(1, dfj.i), new egw(3, dfj.j), new egw(2, dfj.m));
         this.a(
            egy.g,
            dfj.I,
            ddm.f,
            ImmutableSet.of(eip.a, eip.b, eip.j, eip.r),
            true,
            false,
            new egw(8, dfj.I),
            new egw(52, dfj.aV),
            new egw(3, dfj.b),
            new egw(1, dfj.F)
         );
         this.a(egy.h, cuf.lH, ddm.f, ImmutableSet.of(), false, false, new egw(116, dfj.aV), new egw(3, dfj.b), new egw(1, dfj.F));
         this.a(egy.i, dfj.hW, ddm.a, ImmutableSet.of(), true, false, new egw(1, dfj.a));
      }
   }
}
