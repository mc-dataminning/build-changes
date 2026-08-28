import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class egz {
   public static final akj<egy> a = a("classic_flat");
   public static final akj<egy> b = a("tunnelers_dream");
   public static final akj<egy> c = a("water_world");
   public static final akj<egy> d = a("overworld");
   public static final akj<egy> e = a("snowy_kingdom");
   public static final akj<egy> f = a("bottomless_pit");
   public static final akj<egy> g = a("desert");
   public static final akj<egy> h = a("redstone_ready");
   public static final akj<egy> i = a("the_void");

   public static void a(qm<egy> $$0) {
      new egz.a($$0).a();
   }

   private static akj<egy> a(String $$0) {
      return akj.a(lr.aM, new akk($$0));
   }

   static class a {
      private final qm<egy> a;

      a(qm<egy> $$0) {
         this.a = $$0;
      }

      private void a(akj<egy> $$0, dcf $$1, akj<ddg> $$2, Set<akj<ejd>> $$3, boolean $$4, boolean $$5, egx... $$6) {
         jk<ejd> $$7 = this.a.a(lr.aS);
         jk<eib> $$8 = this.a.a(lr.aP);
         jk<ddg> $$9 = this.a.a(lr.aE);
         jn.a<ejd> $$10 = jn.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eha $$11 = new eha(Optional.of($$10), $$9.b($$2), eha.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new egy($$1.r().o(), $$11));
      }

      public void a() {
         this.a(egz.a, dfk.i, ddn.b, ImmutableSet.of(eiq.a), false, false, new egx(1, dfk.i), new egx(2, dfk.j), new egx(1, dfk.F));
         this.a(egz.b, dfk.b, ddn.t, ImmutableSet.of(eiq.j, eiq.r), true, false, new egx(1, dfk.i), new egx(5, dfk.j), new egx(230, dfk.b), new egx(1, dfk.F));
         this.a(
            egz.c,
            cug.qz,
            ddn.T,
            ImmutableSet.of(eiq.m, eiq.l, eiq.g),
            false,
            false,
            new egx(90, dfk.G),
            new egx(5, dfk.L),
            new egx(5, dfk.j),
            new egx(5, dfk.b),
            new egx(64, dfk.sJ),
            new egx(1, dfk.F)
         );
         this.a(
            egz.d,
            dfk.bt,
            ddn.b,
            ImmutableSet.of(eiq.a, eiq.j, eiq.f, eiq.k, eiq.r),
            true,
            true,
            new egx(1, dfk.i),
            new egx(3, dfk.j),
            new egx(59, dfk.b),
            new egx(1, dfk.F)
         );
         this.a(
            egz.e,
            dfk.dN,
            ddn.d,
            ImmutableSet.of(eiq.a, eiq.c),
            false,
            false,
            new egx(1, dfk.dN),
            new egx(1, dfk.i),
            new egx(3, dfk.j),
            new egx(59, dfk.b),
            new egx(1, dfk.F)
         );
         this.a(egz.f, cug.pt, ddn.b, ImmutableSet.of(eiq.a), false, false, new egx(1, dfk.i), new egx(3, dfk.j), new egx(2, dfk.m));
         this.a(
            egz.g,
            dfk.I,
            ddn.f,
            ImmutableSet.of(eiq.a, eiq.b, eiq.j, eiq.r),
            true,
            false,
            new egx(8, dfk.I),
            new egx(52, dfk.aV),
            new egx(3, dfk.b),
            new egx(1, dfk.F)
         );
         this.a(egz.h, cug.lH, ddn.f, ImmutableSet.of(), false, false, new egx(116, dfk.aV), new egx(3, dfk.b), new egx(1, dfk.F));
         this.a(egz.i, dfk.hW, ddn.a, ImmutableSet.of(), true, false, new egx(1, dfk.a));
      }
   }
}
