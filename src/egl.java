import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class egl {
   public static final ald<egk> a = a("classic_flat");
   public static final ald<egk> b = a("tunnelers_dream");
   public static final ald<egk> c = a("water_world");
   public static final ald<egk> d = a("overworld");
   public static final ald<egk> e = a("snowy_kingdom");
   public static final ald<egk> f = a("bottomless_pit");
   public static final ald<egk> g = a("desert");
   public static final ald<egk> h = a("redstone_ready");
   public static final ald<egk> i = a("the_void");

   public static void a(rc<egk> $$0) {
      new egl.a($$0).a();
   }

   private static ald<egk> a(String $$0) {
      return ald.a(lq.aF, new ale($$0));
   }

   static class a {
      private final rc<egk> a;

      a(rc<egk> $$0) {
         this.a = $$0;
      }

      private void a(ald<egk> $$0, dbw $$1, ald<dcw> $$2, Set<ald<eip>> $$3, boolean $$4, boolean $$5, egj... $$6) {
         jj<eip> $$7 = this.a.a(lq.aL);
         jj<ehn> $$8 = this.a.a(lq.aI);
         jj<dcw> $$9 = this.a.a(lq.az);
         jm.a<eip> $$10 = jm.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         egm $$11 = new egm(Optional.of($$10), $$9.b($$2), egm.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new egk($$1.r().o(), $$11));
      }

      public void a() {
         this.a(egl.a, dfa.i, ddd.b, ImmutableSet.of(eic.a), false, false, new egj(1, dfa.i), new egj(2, dfa.j), new egj(1, dfa.F));
         this.a(egl.b, dfa.b, ddd.t, ImmutableSet.of(eic.j, eic.r), true, false, new egj(1, dfa.i), new egj(5, dfa.j), new egj(230, dfa.b), new egj(1, dfa.F));
         this.a(
            egl.c,
            cur.qz,
            ddd.T,
            ImmutableSet.of(eic.m, eic.l, eic.g),
            false,
            false,
            new egj(90, dfa.G),
            new egj(5, dfa.L),
            new egj(5, dfa.j),
            new egj(5, dfa.b),
            new egj(64, dfa.sJ),
            new egj(1, dfa.F)
         );
         this.a(
            egl.d,
            dfa.bt,
            ddd.b,
            ImmutableSet.of(eic.a, eic.j, eic.f, eic.k, eic.r),
            true,
            true,
            new egj(1, dfa.i),
            new egj(3, dfa.j),
            new egj(59, dfa.b),
            new egj(1, dfa.F)
         );
         this.a(
            egl.e,
            dfa.dN,
            ddd.d,
            ImmutableSet.of(eic.a, eic.c),
            false,
            false,
            new egj(1, dfa.dN),
            new egj(1, dfa.i),
            new egj(3, dfa.j),
            new egj(59, dfa.b),
            new egj(1, dfa.F)
         );
         this.a(egl.f, cur.pt, ddd.b, ImmutableSet.of(eic.a), false, false, new egj(1, dfa.i), new egj(3, dfa.j), new egj(2, dfa.m));
         this.a(
            egl.g,
            dfa.I,
            ddd.f,
            ImmutableSet.of(eic.a, eic.b, eic.j, eic.r),
            true,
            false,
            new egj(8, dfa.I),
            new egj(52, dfa.aV),
            new egj(3, dfa.b),
            new egj(1, dfa.F)
         );
         this.a(egl.h, cur.lH, ddd.f, ImmutableSet.of(), false, false, new egj(116, dfa.aV), new egj(3, dfa.b), new egj(1, dfa.F));
         this.a(egl.i, dfa.hW, ddd.a, ImmutableSet.of(), true, false, new egj(1, dfa.a));
      }
   }
}
