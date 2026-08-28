import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ego {
   public static final ale<egn> a = a("classic_flat");
   public static final ale<egn> b = a("tunnelers_dream");
   public static final ale<egn> c = a("water_world");
   public static final ale<egn> d = a("overworld");
   public static final ale<egn> e = a("snowy_kingdom");
   public static final ale<egn> f = a("bottomless_pit");
   public static final ale<egn> g = a("desert");
   public static final ale<egn> h = a("redstone_ready");
   public static final ale<egn> i = a("the_void");

   public static void a(rc<egn> $$0) {
      new ego.a($$0).a();
   }

   private static ale<egn> a(String $$0) {
      return ale.a(lq.aF, new alf($$0));
   }

   static class a {
      private final rc<egn> a;

      a(rc<egn> $$0) {
         this.a = $$0;
      }

      private void a(ale<egn> $$0, dbz $$1, ale<dcz> $$2, Set<ale<eis>> $$3, boolean $$4, boolean $$5, egm... $$6) {
         jj<eis> $$7 = this.a.a(lq.aL);
         jj<ehq> $$8 = this.a.a(lq.aI);
         jj<dcz> $$9 = this.a.a(lq.az);
         jm.a<eis> $$10 = jm.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         egp $$11 = new egp(Optional.of($$10), $$9.b($$2), egp.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new egn($$1.r().o(), $$11));
      }

      public void a() {
         this.a(ego.a, dfd.i, ddg.b, ImmutableSet.of(eif.a), false, false, new egm(1, dfd.i), new egm(2, dfd.j), new egm(1, dfd.F));
         this.a(ego.b, dfd.b, ddg.t, ImmutableSet.of(eif.j, eif.r), true, false, new egm(1, dfd.i), new egm(5, dfd.j), new egm(230, dfd.b), new egm(1, dfd.F));
         this.a(
            ego.c,
            cuu.qz,
            ddg.T,
            ImmutableSet.of(eif.m, eif.l, eif.g),
            false,
            false,
            new egm(90, dfd.G),
            new egm(5, dfd.L),
            new egm(5, dfd.j),
            new egm(5, dfd.b),
            new egm(64, dfd.sJ),
            new egm(1, dfd.F)
         );
         this.a(
            ego.d,
            dfd.bt,
            ddg.b,
            ImmutableSet.of(eif.a, eif.j, eif.f, eif.k, eif.r),
            true,
            true,
            new egm(1, dfd.i),
            new egm(3, dfd.j),
            new egm(59, dfd.b),
            new egm(1, dfd.F)
         );
         this.a(
            ego.e,
            dfd.dN,
            ddg.d,
            ImmutableSet.of(eif.a, eif.c),
            false,
            false,
            new egm(1, dfd.dN),
            new egm(1, dfd.i),
            new egm(3, dfd.j),
            new egm(59, dfd.b),
            new egm(1, dfd.F)
         );
         this.a(ego.f, cuu.pt, ddg.b, ImmutableSet.of(eif.a), false, false, new egm(1, dfd.i), new egm(3, dfd.j), new egm(2, dfd.m));
         this.a(
            ego.g,
            dfd.I,
            ddg.f,
            ImmutableSet.of(eif.a, eif.b, eif.j, eif.r),
            true,
            false,
            new egm(8, dfd.I),
            new egm(52, dfd.aV),
            new egm(3, dfd.b),
            new egm(1, dfd.F)
         );
         this.a(ego.h, cuu.lH, ddg.f, ImmutableSet.of(), false, false, new egm(116, dfd.aV), new egm(3, dfd.b), new egm(1, dfd.F));
         this.a(ego.i, dfd.hW, ddg.a, ImmutableSet.of(), true, false, new egm(1, dfd.a));
      }
   }
}
