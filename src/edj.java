import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class edj {
   public static final ajs<edi> a = a("classic_flat");
   public static final ajs<edi> b = a("tunnelers_dream");
   public static final ajs<edi> c = a("water_world");
   public static final ajs<edi> d = a("overworld");
   public static final ajs<edi> e = a("snowy_kingdom");
   public static final ajs<edi> f = a("bottomless_pit");
   public static final ajs<edi> g = a("desert");
   public static final ajs<edi> h = a("redstone_ready");
   public static final ajs<edi> i = a("the_void");

   public static void a(px<edi> $$0) {
      new edj.a($$0).a();
   }

   private static ajs<edi> a(String $$0) {
      return ajs.a(ks.aB, new ajt($$0));
   }

   static class a {
      private final px<edi> a;

      a(px<edi> $$0) {
         this.a = $$0;
      }

      private void a(ajs<edi> $$0, cyw $$1, ajs<czw> $$2, Set<ajs<efn>> $$3, boolean $$4, boolean $$5, edh... $$6) {
         im<efn> $$7 = this.a.a(ks.aH);
         im<eel> $$8 = this.a.a(ks.aE);
         im<czw> $$9 = this.a.a(ks.av);
         ip.a<efn> $$10 = ip.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         edk $$11 = new edk(Optional.of($$10), $$9.b($$2), edk.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new edi($$1.p().n(), $$11));
      }

      public void a() {
         this.a(edj.a, dca.i, dad.b, ImmutableSet.of(efa.a), false, false, new edh(1, dca.i), new edh(2, dca.j), new edh(1, dca.F));
         this.a(edj.b, dca.b, dad.t, ImmutableSet.of(efa.j, efa.r), true, false, new edh(1, dca.i), new edh(5, dca.j), new edh(230, dca.b), new edh(1, dca.F));
         this.a(
            edj.c,
            crm.qy,
            dad.T,
            ImmutableSet.of(efa.m, efa.l, efa.g),
            false,
            false,
            new edh(90, dca.G),
            new edh(5, dca.L),
            new edh(5, dca.j),
            new edh(5, dca.b),
            new edh(64, dca.sJ),
            new edh(1, dca.F)
         );
         this.a(
            edj.d,
            dca.bt,
            dad.b,
            ImmutableSet.of(efa.a, efa.j, efa.f, efa.k, efa.r),
            true,
            true,
            new edh(1, dca.i),
            new edh(3, dca.j),
            new edh(59, dca.b),
            new edh(1, dca.F)
         );
         this.a(
            edj.e,
            dca.dN,
            dad.d,
            ImmutableSet.of(efa.a, efa.c),
            false,
            false,
            new edh(1, dca.dN),
            new edh(1, dca.i),
            new edh(3, dca.j),
            new edh(59, dca.b),
            new edh(1, dca.F)
         );
         this.a(edj.f, crm.ps, dad.b, ImmutableSet.of(efa.a), false, false, new edh(1, dca.i), new edh(3, dca.j), new edh(2, dca.m));
         this.a(
            edj.g,
            dca.I,
            dad.f,
            ImmutableSet.of(efa.a, efa.b, efa.j, efa.r),
            true,
            false,
            new edh(8, dca.I),
            new edh(52, dca.aV),
            new edh(3, dca.b),
            new edh(1, dca.F)
         );
         this.a(edj.h, crm.lG, dad.f, ImmutableSet.of(), false, false, new edh(116, dca.aV), new edh(3, dca.b), new edh(1, dca.F));
         this.a(edj.i, dca.hW, dad.a, ImmutableSet.of(), true, false, new edh(1, dca.a));
      }
   }
}
