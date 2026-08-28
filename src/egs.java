import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class egs {
   public static final akj<egr> a = a("classic_flat");
   public static final akj<egr> b = a("tunnelers_dream");
   public static final akj<egr> c = a("water_world");
   public static final akj<egr> d = a("overworld");
   public static final akj<egr> e = a("snowy_kingdom");
   public static final akj<egr> f = a("bottomless_pit");
   public static final akj<egr> g = a("desert");
   public static final akj<egr> h = a("redstone_ready");
   public static final akj<egr> i = a("the_void");

   public static void a(qm<egr> $$0) {
      new egs.a($$0).a();
   }

   private static akj<egr> a(String $$0) {
      return akj.a(lr.aM, new akk($$0));
   }

   static class a {
      private final qm<egr> a;

      a(qm<egr> $$0) {
         this.a = $$0;
      }

      private void a(akj<egr> $$0, dcc $$1, akj<ddd> $$2, Set<akj<eiw>> $$3, boolean $$4, boolean $$5, egq... $$6) {
         jk<eiw> $$7 = this.a.a(lr.aS);
         jk<ehu> $$8 = this.a.a(lr.aP);
         jk<ddd> $$9 = this.a.a(lr.aE);
         jn.a<eiw> $$10 = jn.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         egt $$11 = new egt(Optional.of($$10), $$9.b($$2), egt.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new egr($$1.r().o(), $$11));
      }

      public void a() {
         this.a(egs.a, dfh.i, ddk.b, ImmutableSet.of(eij.a), false, false, new egq(1, dfh.i), new egq(2, dfh.j), new egq(1, dfh.F));
         this.a(egs.b, dfh.b, ddk.t, ImmutableSet.of(eij.j, eij.r), true, false, new egq(1, dfh.i), new egq(5, dfh.j), new egq(230, dfh.b), new egq(1, dfh.F));
         this.a(
            egs.c,
            cud.qz,
            ddk.T,
            ImmutableSet.of(eij.m, eij.l, eij.g),
            false,
            false,
            new egq(90, dfh.G),
            new egq(5, dfh.L),
            new egq(5, dfh.j),
            new egq(5, dfh.b),
            new egq(64, dfh.sJ),
            new egq(1, dfh.F)
         );
         this.a(
            egs.d,
            dfh.bt,
            ddk.b,
            ImmutableSet.of(eij.a, eij.j, eij.f, eij.k, eij.r),
            true,
            true,
            new egq(1, dfh.i),
            new egq(3, dfh.j),
            new egq(59, dfh.b),
            new egq(1, dfh.F)
         );
         this.a(
            egs.e,
            dfh.dN,
            ddk.d,
            ImmutableSet.of(eij.a, eij.c),
            false,
            false,
            new egq(1, dfh.dN),
            new egq(1, dfh.i),
            new egq(3, dfh.j),
            new egq(59, dfh.b),
            new egq(1, dfh.F)
         );
         this.a(egs.f, cud.pt, ddk.b, ImmutableSet.of(eij.a), false, false, new egq(1, dfh.i), new egq(3, dfh.j), new egq(2, dfh.m));
         this.a(
            egs.g,
            dfh.I,
            ddk.f,
            ImmutableSet.of(eij.a, eij.b, eij.j, eij.r),
            true,
            false,
            new egq(8, dfh.I),
            new egq(52, dfh.aV),
            new egq(3, dfh.b),
            new egq(1, dfh.F)
         );
         this.a(egs.h, cud.lH, ddk.f, ImmutableSet.of(), false, false, new egq(116, dfh.aV), new egq(3, dfh.b), new egq(1, dfh.F));
         this.a(egs.i, dfh.hW, ddk.a, ImmutableSet.of(), true, false, new egq(1, dfh.a));
      }
   }
}
