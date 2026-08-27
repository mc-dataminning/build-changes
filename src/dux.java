import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dux {
   public static final agf<duw> a = a("classic_flat");
   public static final agf<duw> b = a("tunnelers_dream");
   public static final agf<duw> c = a("water_world");
   public static final agf<duw> d = a("overworld");
   public static final agf<duw> e = a("snowy_kingdom");
   public static final agf<duw> f = a("bottomless_pit");
   public static final agf<duw> g = a("desert");
   public static final agf<duw> h = a("redstone_ready");
   public static final agf<duw> i = a("the_void");

   public static void a(ou<duw> $$0) {
      new dux.a($$0).a();
   }

   private static agf<duw> a(String $$0) {
      return agf.a(jz.ax, new agg($$0));
   }

   static class a {
      private final ou<duw> a;

      a(ou<duw> $$0) {
         this.a = $$0;
      }

      private void a(agf<duw> $$0, crr $$1, agf<csq> $$2, Set<agf<dxb>> $$3, boolean $$4, boolean $$5, duv... $$6) {
         ic<dxb> $$7 = this.a.a(jz.aD);
         ic<dvz> $$8 = this.a.a(jz.aA);
         ic<csq> $$9 = this.a.a(jz.ar);
         ig.a<dxb> $$10 = ig.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         duy $$11 = new duy(Optional.of($$10), $$9.b($$2), duy.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new duw($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dux.a, cuv.i, csx.b, ImmutableSet.of(dwo.a), false, false, new duv(1, cuv.i), new duv(2, cuv.j), new duv(1, cuv.F));
         this.a(dux.b, cuv.b, csx.t, ImmutableSet.of(dwo.j, dwo.r), true, false, new duv(1, cuv.i), new duv(5, cuv.j), new duv(230, cuv.b), new duv(1, cuv.F));
         this.a(
            dux.c,
            cle.pL,
            csx.T,
            ImmutableSet.of(dwo.m, dwo.l, dwo.g),
            false,
            false,
            new duv(90, cuv.G),
            new duv(5, cuv.L),
            new duv(5, cuv.j),
            new duv(5, cuv.b),
            new duv(64, cuv.rI),
            new duv(1, cuv.F)
         );
         this.a(
            dux.d,
            cuv.bt,
            csx.b,
            ImmutableSet.of(dwo.a, dwo.j, dwo.f, dwo.k, dwo.r),
            true,
            true,
            new duv(1, cuv.i),
            new duv(3, cuv.j),
            new duv(59, cuv.b),
            new duv(1, cuv.F)
         );
         this.a(
            dux.e,
            cuv.dN,
            csx.d,
            ImmutableSet.of(dwo.a, dwo.c),
            false,
            false,
            new duv(1, cuv.dN),
            new duv(1, cuv.i),
            new duv(3, cuv.j),
            new duv(59, cuv.b),
            new duv(1, cuv.F)
         );
         this.a(dux.f, cle.oF, csx.b, ImmutableSet.of(dwo.a), false, false, new duv(1, cuv.i), new duv(3, cuv.j), new duv(2, cuv.m));
         this.a(
            dux.g,
            cuv.I,
            csx.f,
            ImmutableSet.of(dwo.a, dwo.b, dwo.j, dwo.r),
            true,
            false,
            new duv(8, cuv.I),
            new duv(52, cuv.aV),
            new duv(3, cuv.b),
            new duv(1, cuv.F)
         );
         this.a(dux.h, cle.ll, csx.f, ImmutableSet.of(), false, false, new duv(116, cuv.aV), new duv(3, cuv.b), new duv(1, cuv.F));
         this.a(dux.i, cuv.hW, csx.a, ImmutableSet.of(), true, false, new duv(1, cuv.a));
      }
   }
}
