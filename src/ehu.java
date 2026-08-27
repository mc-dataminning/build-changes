import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ehu {
   public static final aks<eht> a = a("classic_flat");
   public static final aks<eht> b = a("tunnelers_dream");
   public static final aks<eht> c = a("water_world");
   public static final aks<eht> d = a("overworld");
   public static final aks<eht> e = a("snowy_kingdom");
   public static final aks<eht> f = a("bottomless_pit");
   public static final aks<eht> g = a("desert");
   public static final aks<eht> h = a("redstone_ready");
   public static final aks<eht> i = a("the_void");

   public static void a(qq<eht> $$0) {
      new ehu.a($$0).a();
   }

   private static aks<eht> a(String $$0) {
      return aks.a(li.aF, new akt($$0));
   }

   static class a {
      private final qq<eht> a;

      a(qq<eht> $$0) {
         this.a = $$0;
      }

      private void a(aks<eht> $$0, dbz $$1, aks<dcz> $$2, Set<aks<ejz>> $$3, boolean $$4, boolean $$5, ehs... $$6) {
         jb<ejz> $$7 = this.a.a(li.aL);
         jb<eix> $$8 = this.a.a(li.aI);
         jb<dcz> $$9 = this.a.a(li.az);
         je.a<ejz> $$10 = je.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         ehv $$11 = new ehv(Optional.of($$10), $$9.b($$2), ehv.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eht($$1.q().n(), $$11));
      }

      public void a() {
         this.a(ehu.a, dfe.j, ddg.b, ImmutableSet.of(ejm.a), false, false, new ehs(1, dfe.j), new ehs(2, dfe.m), new ehs(1, dfe.ak));
         this.a(ehu.b, dfe.b, ddg.y, ImmutableSet.of(ejm.j, ejm.t), true, false, new ehs(1, dfe.j), new ehs(5, dfe.m), new ehs(230, dfe.b), new ehs(1, dfe.ak));
         this.a(
            ehu.c,
            cuk.rW,
            ddg.Y,
            ImmutableSet.of(ejm.n, ejm.m, ejm.g),
            false,
            false,
            new ehs(90, dfe.al),
            new ehs(5, dfe.ar),
            new ehs(5, dfe.m),
            new ehs(5, dfe.b),
            new ehs(64, dfe.ug),
            new ehs(1, dfe.ak)
         );
         this.a(
            ehu.d,
            dfe.cd,
            ddg.b,
            ImmutableSet.of(ejm.a, ejm.j, ejm.f, ejm.k, ejm.l, ejm.t, new aks[0]),
            true,
            true,
            new ehs(1, dfe.j),
            new ehs(3, dfe.m),
            new ehs(59, dfe.b),
            new ehs(1, dfe.ak)
         );
         this.a(
            ehu.e,
            dfe.eB,
            ddg.i,
            ImmutableSet.of(ejm.a, ejm.c),
            false,
            false,
            new ehs(1, dfe.eB),
            new ehs(1, dfe.j),
            new ehs(3, dfe.m),
            new ehs(59, dfe.b),
            new ehs(1, dfe.ak)
         );
         this.a(ehu.f, cuk.qM, ddg.b, ImmutableSet.of(ejm.a), false, false, new ehs(1, dfe.j), new ehs(3, dfe.m), new ehs(2, dfe.q));
         this.a(
            ehu.g,
            dfe.an,
            ddg.k,
            ImmutableSet.of(ejm.a, ejm.b, ejm.j, ejm.t),
            true,
            false,
            new ehs(8, dfe.an),
            new ehs(52, dfe.bF),
            new ehs(3, dfe.b),
            new ehs(1, dfe.ak)
         );
         this.a(ehu.h, cuk.mW, ddg.k, ImmutableSet.of(), false, false, new ehs(116, dfe.bF), new ehs(3, dfe.b), new ehs(1, dfe.ak));
         this.a(ehu.i, dfe.iQ, ddg.a, ImmutableSet.of(), true, false, new ehs(1, dfe.a));
      }
   }
}
