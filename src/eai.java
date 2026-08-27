import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eai {
   public static final ajb<eah> a = a("classic_flat");
   public static final ajb<eah> b = a("tunnelers_dream");
   public static final ajb<eah> c = a("water_world");
   public static final ajb<eah> d = a("overworld");
   public static final ajb<eah> e = a("snowy_kingdom");
   public static final ajb<eah> f = a("bottomless_pit");
   public static final ajb<eah> g = a("desert");
   public static final ajb<eah> h = a("redstone_ready");
   public static final ajb<eah> i = a("the_void");

   public static void a(pj<eah> $$0) {
      new eai.a($$0).a();
   }

   private static ajb<eah> a(String $$0) {
      return ajb.a(ki.aA, new ajc($$0));
   }

   static class a {
      private final pj<eah> a;

      a(pj<eah> $$0) {
         this.a = $$0;
      }

      private void a(ajb<eah> $$0, cwd $$1, ajb<cxd> $$2, Set<ajb<ecm>> $$3, boolean $$4, boolean $$5, eag... $$6) {
         im<ecm> $$7 = this.a.a(ki.aG);
         im<ebk> $$8 = this.a.a(ki.aD);
         im<cxd> $$9 = this.a.a(ki.au);
         ip.a<ecm> $$10 = ip.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eaj $$11 = new eaj(Optional.of($$10), $$9.b($$2), eaj.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eah($$1.l().k(), $$11));
      }

      public void a() {
         this.a(eai.a, czh.i, cxk.b, ImmutableSet.of(ebz.a), false, false, new eag(1, czh.i), new eag(2, czh.j), new eag(1, czh.F));
         this.a(eai.b, czh.b, cxk.t, ImmutableSet.of(ebz.j, ebz.r), true, false, new eag(1, czh.i), new eag(5, czh.j), new eag(230, czh.b), new eag(1, czh.F));
         this.a(
            eai.c,
            cpt.qy,
            cxk.T,
            ImmutableSet.of(ebz.m, ebz.l, ebz.g),
            false,
            false,
            new eag(90, czh.G),
            new eag(5, czh.L),
            new eag(5, czh.j),
            new eag(5, czh.b),
            new eag(64, czh.sJ),
            new eag(1, czh.F)
         );
         this.a(
            eai.d,
            czh.bt,
            cxk.b,
            ImmutableSet.of(ebz.a, ebz.j, ebz.f, ebz.k, ebz.r),
            true,
            true,
            new eag(1, czh.i),
            new eag(3, czh.j),
            new eag(59, czh.b),
            new eag(1, czh.F)
         );
         this.a(
            eai.e,
            czh.dN,
            cxk.d,
            ImmutableSet.of(ebz.a, ebz.c),
            false,
            false,
            new eag(1, czh.dN),
            new eag(1, czh.i),
            new eag(3, czh.j),
            new eag(59, czh.b),
            new eag(1, czh.F)
         );
         this.a(eai.f, cpt.ps, cxk.b, ImmutableSet.of(ebz.a), false, false, new eag(1, czh.i), new eag(3, czh.j), new eag(2, czh.m));
         this.a(
            eai.g,
            czh.I,
            cxk.f,
            ImmutableSet.of(ebz.a, ebz.b, ebz.j, ebz.r),
            true,
            false,
            new eag(8, czh.I),
            new eag(52, czh.aV),
            new eag(3, czh.b),
            new eag(1, czh.F)
         );
         this.a(eai.h, cpt.lG, cxk.f, ImmutableSet.of(), false, false, new eag(116, czh.aV), new eag(3, czh.b), new eag(1, czh.F));
         this.a(eai.i, czh.hW, cxk.a, ImmutableSet.of(), true, false, new eag(1, czh.a));
      }
   }
}
