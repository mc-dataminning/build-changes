import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dvj {
   public static final agh<dvi> a = a("classic_flat");
   public static final agh<dvi> b = a("tunnelers_dream");
   public static final agh<dvi> c = a("water_world");
   public static final agh<dvi> d = a("overworld");
   public static final agh<dvi> e = a("snowy_kingdom");
   public static final agh<dvi> f = a("bottomless_pit");
   public static final agh<dvi> g = a("desert");
   public static final agh<dvi> h = a("redstone_ready");
   public static final agh<dvi> i = a("the_void");

   public static void a(ov<dvi> $$0) {
      new dvj.a($$0).a();
   }

   private static agh<dvi> a(String $$0) {
      return agh.a(jz.ax, new agi($$0));
   }

   static class a {
      private final ov<dvi> a;

      a(ov<dvi> $$0) {
         this.a = $$0;
      }

      private void a(agh<dvi> $$0, crz $$1, agh<csy> $$2, Set<agh<dxn>> $$3, boolean $$4, boolean $$5, dvh... $$6) {
         ic<dxn> $$7 = this.a.a(jz.aD);
         ic<dwl> $$8 = this.a.a(jz.aA);
         ic<csy> $$9 = this.a.a(jz.ar);
         ig.a<dxn> $$10 = ig.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dvk $$11 = new dvk(Optional.of($$10), $$9.b($$2), dvk.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dvi($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dvj.a, cvc.i, ctf.b, ImmutableSet.of(dxa.a), false, false, new dvh(1, cvc.i), new dvh(2, cvc.j), new dvh(1, cvc.F));
         this.a(dvj.b, cvc.b, ctf.t, ImmutableSet.of(dxa.j, dxa.r), true, false, new dvh(1, cvc.i), new dvh(5, cvc.j), new dvh(230, cvc.b), new dvh(1, cvc.F));
         this.a(
            dvj.c,
            clm.qw,
            ctf.T,
            ImmutableSet.of(dxa.m, dxa.l, dxa.g),
            false,
            false,
            new dvh(90, cvc.G),
            new dvh(5, cvc.L),
            new dvh(5, cvc.j),
            new dvh(5, cvc.b),
            new dvh(64, cvc.sJ),
            new dvh(1, cvc.F)
         );
         this.a(
            dvj.d,
            cvc.bt,
            ctf.b,
            ImmutableSet.of(dxa.a, dxa.j, dxa.f, dxa.k, dxa.r),
            true,
            true,
            new dvh(1, cvc.i),
            new dvh(3, cvc.j),
            new dvh(59, cvc.b),
            new dvh(1, cvc.F)
         );
         this.a(
            dvj.e,
            cvc.dN,
            ctf.d,
            ImmutableSet.of(dxa.a, dxa.c),
            false,
            false,
            new dvh(1, cvc.dN),
            new dvh(1, cvc.i),
            new dvh(3, cvc.j),
            new dvh(59, cvc.b),
            new dvh(1, cvc.F)
         );
         this.a(dvj.f, clm.pq, ctf.b, ImmutableSet.of(dxa.a), false, false, new dvh(1, cvc.i), new dvh(3, cvc.j), new dvh(2, cvc.m));
         this.a(
            dvj.g,
            cvc.I,
            ctf.f,
            ImmutableSet.of(dxa.a, dxa.b, dxa.j, dxa.r),
            true,
            false,
            new dvh(8, cvc.I),
            new dvh(52, cvc.aV),
            new dvh(3, cvc.b),
            new dvh(1, cvc.F)
         );
         this.a(dvj.h, clm.lG, ctf.f, ImmutableSet.of(), false, false, new dvh(116, cvc.aV), new dvh(3, cvc.b), new dvh(1, cvc.F));
         this.a(dvj.i, cvc.hW, ctf.a, ImmutableSet.of(), true, false, new dvh(1, cvc.a));
      }
   }
}
