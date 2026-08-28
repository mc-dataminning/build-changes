import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class egk {
   public static final ald<egj> a = a("classic_flat");
   public static final ald<egj> b = a("tunnelers_dream");
   public static final ald<egj> c = a("water_world");
   public static final ald<egj> d = a("overworld");
   public static final ald<egj> e = a("snowy_kingdom");
   public static final ald<egj> f = a("bottomless_pit");
   public static final ald<egj> g = a("desert");
   public static final ald<egj> h = a("redstone_ready");
   public static final ald<egj> i = a("the_void");

   public static void a(rc<egj> $$0) {
      new egk.a($$0).a();
   }

   private static ald<egj> a(String $$0) {
      return ald.a(lq.aF, new ale($$0));
   }

   static class a {
      private final rc<egj> a;

      a(rc<egj> $$0) {
         this.a = $$0;
      }

      private void a(ald<egj> $$0, dbv $$1, ald<dcv> $$2, Set<ald<eio>> $$3, boolean $$4, boolean $$5, egi... $$6) {
         jj<eio> $$7 = this.a.a(lq.aL);
         jj<ehm> $$8 = this.a.a(lq.aI);
         jj<dcv> $$9 = this.a.a(lq.az);
         jm.a<eio> $$10 = jm.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         egl $$11 = new egl(Optional.of($$10), $$9.b($$2), egl.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new egj($$1.r().o(), $$11));
      }

      public void a() {
         this.a(egk.a, dez.i, ddc.b, ImmutableSet.of(eib.a), false, false, new egi(1, dez.i), new egi(2, dez.j), new egi(1, dez.F));
         this.a(egk.b, dez.b, ddc.t, ImmutableSet.of(eib.j, eib.r), true, false, new egi(1, dez.i), new egi(5, dez.j), new egi(230, dez.b), new egi(1, dez.F));
         this.a(
            egk.c,
            cuq.qz,
            ddc.T,
            ImmutableSet.of(eib.m, eib.l, eib.g),
            false,
            false,
            new egi(90, dez.G),
            new egi(5, dez.L),
            new egi(5, dez.j),
            new egi(5, dez.b),
            new egi(64, dez.sJ),
            new egi(1, dez.F)
         );
         this.a(
            egk.d,
            dez.bt,
            ddc.b,
            ImmutableSet.of(eib.a, eib.j, eib.f, eib.k, eib.r),
            true,
            true,
            new egi(1, dez.i),
            new egi(3, dez.j),
            new egi(59, dez.b),
            new egi(1, dez.F)
         );
         this.a(
            egk.e,
            dez.dN,
            ddc.d,
            ImmutableSet.of(eib.a, eib.c),
            false,
            false,
            new egi(1, dez.dN),
            new egi(1, dez.i),
            new egi(3, dez.j),
            new egi(59, dez.b),
            new egi(1, dez.F)
         );
         this.a(egk.f, cuq.pt, ddc.b, ImmutableSet.of(eib.a), false, false, new egi(1, dez.i), new egi(3, dez.j), new egi(2, dez.m));
         this.a(
            egk.g,
            dez.I,
            ddc.f,
            ImmutableSet.of(eib.a, eib.b, eib.j, eib.r),
            true,
            false,
            new egi(8, dez.I),
            new egi(52, dez.aV),
            new egi(3, dez.b),
            new egi(1, dez.F)
         );
         this.a(egk.h, cuq.lH, ddc.f, ImmutableSet.of(), false, false, new egi(116, dez.aV), new egi(3, dez.b), new egi(1, dez.F));
         this.a(egk.i, dez.hW, ddc.a, ImmutableSet.of(), true, false, new egi(1, dez.a));
      }
   }
}
