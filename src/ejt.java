import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ejt {
   public static final alg<ejs> a = a("classic_flat");
   public static final alg<ejs> b = a("tunnelers_dream");
   public static final alg<ejs> c = a("water_world");
   public static final alg<ejs> d = a("overworld");
   public static final alg<ejs> e = a("snowy_kingdom");
   public static final alg<ejs> f = a("bottomless_pit");
   public static final alg<ejs> g = a("desert");
   public static final alg<ejs> h = a("redstone_ready");
   public static final alg<ejs> i = a("the_void");

   public static void a(qx<ejs> $$0) {
      new ejt.a($$0).a();
   }

   private static alg<ejs> a(String $$0) {
      return alg.a(ly.aO, alh.b($$0));
   }

   static class a {
      private final qx<ejs> a;

      a(qx<ejs> $$0) {
         this.a = $$0;
      }

      private void a(alg<ejs> $$0, deu $$1, alg<dfw> $$2, Set<alg<elx>> $$3, boolean $$4, boolean $$5, ejr... $$6) {
         jq<elx> $$7 = this.a.a(ly.aU);
         jq<ekv> $$8 = this.a.a(ly.aR);
         jq<dfw> $$9 = this.a.a(ly.aG);
         jt.a<elx> $$10 = jt.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eju $$11 = new eju(Optional.of($$10), $$9.b($$2), eju.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ejs($$1.j().f(), $$11));
      }

      public void a() {
         this.a(ejt.a, dia.i, dgd.b, ImmutableSet.of(elk.a), false, false, new ejr(1, dia.i), new ejr(2, dia.j), new ejr(1, dia.F));
         this.a(ejt.b, dia.b, dgd.t, ImmutableSet.of(elk.j, elk.r), true, false, new ejr(1, dia.i), new ejr(5, dia.j), new ejr(230, dia.b), new ejr(1, dia.F));
         this.a(
            ejt.c,
            cwb.qA,
            dgd.T,
            ImmutableSet.of(elk.m, elk.l, elk.g),
            false,
            false,
            new ejr(90, dia.G),
            new ejr(5, dia.L),
            new ejr(5, dia.j),
            new ejr(5, dia.b),
            new ejr(64, dia.sJ),
            new ejr(1, dia.F)
         );
         this.a(
            ejt.d,
            dia.bt,
            dgd.b,
            ImmutableSet.of(elk.a, elk.j, elk.f, elk.k, elk.r),
            true,
            true,
            new ejr(1, dia.i),
            new ejr(3, dia.j),
            new ejr(59, dia.b),
            new ejr(1, dia.F)
         );
         this.a(
            ejt.e,
            dia.dN,
            dgd.d,
            ImmutableSet.of(elk.a, elk.c),
            false,
            false,
            new ejr(1, dia.dN),
            new ejr(1, dia.i),
            new ejr(3, dia.j),
            new ejr(59, dia.b),
            new ejr(1, dia.F)
         );
         this.a(ejt.f, cwb.pu, dgd.b, ImmutableSet.of(elk.a), false, false, new ejr(1, dia.i), new ejr(3, dia.j), new ejr(2, dia.m));
         this.a(
            ejt.g,
            dia.I,
            dgd.f,
            ImmutableSet.of(elk.a, elk.b, elk.j, elk.r),
            true,
            false,
            new ejr(8, dia.I),
            new ejr(52, dia.aV),
            new ejr(3, dia.b),
            new ejr(1, dia.F)
         );
         this.a(ejt.h, cwb.lH, dgd.f, ImmutableSet.of(), false, false, new ejr(116, dia.aV), new ejr(3, dia.b), new ejr(1, dia.F));
         this.a(ejt.i, dia.hW, dgd.a, ImmutableSet.of(), true, false, new ejr(1, dia.a));
      }
   }
}
