import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dte {
   public static final aey<dtd> a = a("classic_flat");
   public static final aey<dtd> b = a("tunnelers_dream");
   public static final aey<dtd> c = a("water_world");
   public static final aey<dtd> d = a("overworld");
   public static final aey<dtd> e = a("snowy_kingdom");
   public static final aey<dtd> f = a("bottomless_pit");
   public static final aey<dtd> g = a("desert");
   public static final aey<dtd> h = a("redstone_ready");
   public static final aey<dtd> i = a("the_void");

   public static void a(nr<dtd> $$0) {
      new dte.a($$0).a();
   }

   private static aey<dtd> a(String $$0) {
      return aey.a(jc.aw, new aez($$0));
   }

   static class a {
      private final nr<dtd> a;

      a(nr<dtd> $$0) {
         this.a = $$0;
      }

      private void a(aey<dtd> $$0, cqa $$1, aey<cqz> $$2, Set<aey<dvi>> $$3, boolean $$4, boolean $$5, dtc... $$6) {
         hf<dvi> $$7 = this.a.a(jc.aC);
         hf<dug> $$8 = this.a.a(jc.az);
         hf<cqz> $$9 = this.a.a(jc.aq);
         hi.a<dvi> $$10 = hi.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dtf $$11 = new dtf(Optional.of($$10), $$9.b($$2), dtf.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dtd($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dte.a, cte.i, crg.b, ImmutableSet.of(duv.a), false, false, new dtc(1, cte.i), new dtc(2, cte.j), new dtc(1, cte.F));
         this.a(dte.b, cte.b, crg.t, ImmutableSet.of(duv.j, duv.r), true, false, new dtc(1, cte.i), new dtc(5, cte.j), new dtc(230, cte.b), new dtc(1, cte.F));
         this.a(
            dte.c,
            cjo.pL,
            crg.T,
            ImmutableSet.of(duv.m, duv.l, duv.g),
            false,
            false,
            new dtc(90, cte.G),
            new dtc(5, cte.L),
            new dtc(5, cte.j),
            new dtc(5, cte.b),
            new dtc(64, cte.rI),
            new dtc(1, cte.F)
         );
         this.a(
            dte.d,
            cte.bt,
            crg.b,
            ImmutableSet.of(duv.a, duv.j, duv.f, duv.k, duv.r),
            true,
            true,
            new dtc(1, cte.i),
            new dtc(3, cte.j),
            new dtc(59, cte.b),
            new dtc(1, cte.F)
         );
         this.a(
            dte.e,
            cte.dN,
            crg.d,
            ImmutableSet.of(duv.a, duv.c),
            false,
            false,
            new dtc(1, cte.dN),
            new dtc(1, cte.i),
            new dtc(3, cte.j),
            new dtc(59, cte.b),
            new dtc(1, cte.F)
         );
         this.a(dte.f, cjo.oF, crg.b, ImmutableSet.of(duv.a), false, false, new dtc(1, cte.i), new dtc(3, cte.j), new dtc(2, cte.m));
         this.a(
            dte.g,
            cte.I,
            crg.f,
            ImmutableSet.of(duv.a, duv.b, duv.j, duv.r),
            true,
            false,
            new dtc(8, cte.I),
            new dtc(52, cte.aV),
            new dtc(3, cte.b),
            new dtc(1, cte.F)
         );
         this.a(dte.h, cjo.ll, crg.f, ImmutableSet.of(), false, false, new dtc(116, cte.aV), new dtc(3, cte.b), new dtc(1, cte.F));
         this.a(dte.i, cte.hW, crg.a, ImmutableSet.of(), true, false, new dtc(1, cte.a));
      }
   }
}
