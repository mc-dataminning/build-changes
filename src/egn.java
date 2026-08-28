import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class egn {
   public static final ale<egm> a = a("classic_flat");
   public static final ale<egm> b = a("tunnelers_dream");
   public static final ale<egm> c = a("water_world");
   public static final ale<egm> d = a("overworld");
   public static final ale<egm> e = a("snowy_kingdom");
   public static final ale<egm> f = a("bottomless_pit");
   public static final ale<egm> g = a("desert");
   public static final ale<egm> h = a("redstone_ready");
   public static final ale<egm> i = a("the_void");

   public static void a(rc<egm> $$0) {
      new egn.a($$0).a();
   }

   private static ale<egm> a(String $$0) {
      return ale.a(lq.aF, new alf($$0));
   }

   static class a {
      private final rc<egm> a;

      a(rc<egm> $$0) {
         this.a = $$0;
      }

      private void a(ale<egm> $$0, dby $$1, ale<dcy> $$2, Set<ale<eir>> $$3, boolean $$4, boolean $$5, egl... $$6) {
         jj<eir> $$7 = this.a.a(lq.aL);
         jj<ehp> $$8 = this.a.a(lq.aI);
         jj<dcy> $$9 = this.a.a(lq.az);
         jm.a<eir> $$10 = jm.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         ego $$11 = new ego(Optional.of($$10), $$9.b($$2), ego.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new egm($$1.r().o(), $$11));
      }

      public void a() {
         this.a(egn.a, dfc.i, ddf.b, ImmutableSet.of(eie.a), false, false, new egl(1, dfc.i), new egl(2, dfc.j), new egl(1, dfc.F));
         this.a(egn.b, dfc.b, ddf.t, ImmutableSet.of(eie.j, eie.r), true, false, new egl(1, dfc.i), new egl(5, dfc.j), new egl(230, dfc.b), new egl(1, dfc.F));
         this.a(
            egn.c,
            cut.qz,
            ddf.T,
            ImmutableSet.of(eie.m, eie.l, eie.g),
            false,
            false,
            new egl(90, dfc.G),
            new egl(5, dfc.L),
            new egl(5, dfc.j),
            new egl(5, dfc.b),
            new egl(64, dfc.sJ),
            new egl(1, dfc.F)
         );
         this.a(
            egn.d,
            dfc.bt,
            ddf.b,
            ImmutableSet.of(eie.a, eie.j, eie.f, eie.k, eie.r),
            true,
            true,
            new egl(1, dfc.i),
            new egl(3, dfc.j),
            new egl(59, dfc.b),
            new egl(1, dfc.F)
         );
         this.a(
            egn.e,
            dfc.dN,
            ddf.d,
            ImmutableSet.of(eie.a, eie.c),
            false,
            false,
            new egl(1, dfc.dN),
            new egl(1, dfc.i),
            new egl(3, dfc.j),
            new egl(59, dfc.b),
            new egl(1, dfc.F)
         );
         this.a(egn.f, cut.pt, ddf.b, ImmutableSet.of(eie.a), false, false, new egl(1, dfc.i), new egl(3, dfc.j), new egl(2, dfc.m));
         this.a(
            egn.g,
            dfc.I,
            ddf.f,
            ImmutableSet.of(eie.a, eie.b, eie.j, eie.r),
            true,
            false,
            new egl(8, dfc.I),
            new egl(52, dfc.aV),
            new egl(3, dfc.b),
            new egl(1, dfc.F)
         );
         this.a(egn.h, cut.lH, ddf.f, ImmutableSet.of(), false, false, new egl(116, dfc.aV), new egl(3, dfc.b), new egl(1, dfc.F));
         this.a(egn.i, dfc.hW, ddf.a, ImmutableSet.of(), true, false, new egl(1, dfc.a));
      }
   }
}
