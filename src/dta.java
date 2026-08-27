import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dta {
   public static final aeq<dsz> a = a("classic_flat");
   public static final aeq<dsz> b = a("tunnelers_dream");
   public static final aeq<dsz> c = a("water_world");
   public static final aeq<dsz> d = a("overworld");
   public static final aeq<dsz> e = a("snowy_kingdom");
   public static final aeq<dsz> f = a("bottomless_pit");
   public static final aeq<dsz> g = a("desert");
   public static final aeq<dsz> h = a("redstone_ready");
   public static final aeq<dsz> i = a("the_void");

   public static void a(nm<dsz> $$0) {
      new dta.a($$0).a();
   }

   private static aeq<dsz> a(String $$0) {
      return aeq.a(jc.av, new aer($$0));
   }

   static class a {
      private final nm<dsz> a;

      a(nm<dsz> $$0) {
         this.a = $$0;
      }

      private void a(aeq<dsz> $$0, cpk $$1, aeq<cqj> $$2, Set<aeq<dve>> $$3, boolean $$4, boolean $$5, dsy... $$6) {
         hf<dve> $$7 = this.a.a(jc.aB);
         hf<duc> $$8 = this.a.a(jc.ay);
         hf<cqj> $$9 = this.a.a(jc.ap);
         hi.a<dve> $$10 = hi.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dtb $$11 = new dtb(Optional.of($$10), $$9.b($$2), dtb.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dsz($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dta.a, csm.i, cqq.b, ImmutableSet.of(dur.a), false, false, new dsy(1, csm.i), new dsy(2, csm.j), new dsy(1, csm.F));
         this.a(dta.b, csm.b, cqq.t, ImmutableSet.of(dur.j, dur.r), true, false, new dsy(1, csm.i), new dsy(5, csm.j), new dsy(230, csm.b), new dsy(1, csm.F));
         this.a(
            dta.c,
            cja.pL,
            cqq.T,
            ImmutableSet.of(dur.m, dur.l, dur.g),
            false,
            false,
            new dsy(90, csm.G),
            new dsy(5, csm.L),
            new dsy(5, csm.j),
            new dsy(5, csm.b),
            new dsy(64, csm.rI),
            new dsy(1, csm.F)
         );
         this.a(
            dta.d,
            csm.bt,
            cqq.b,
            ImmutableSet.of(dur.a, dur.j, dur.f, dur.k, dur.r),
            true,
            true,
            new dsy(1, csm.i),
            new dsy(3, csm.j),
            new dsy(59, csm.b),
            new dsy(1, csm.F)
         );
         this.a(
            dta.e,
            csm.dN,
            cqq.d,
            ImmutableSet.of(dur.a, dur.c),
            false,
            false,
            new dsy(1, csm.dN),
            new dsy(1, csm.i),
            new dsy(3, csm.j),
            new dsy(59, csm.b),
            new dsy(1, csm.F)
         );
         this.a(dta.f, cja.oF, cqq.b, ImmutableSet.of(dur.a), false, false, new dsy(1, csm.i), new dsy(3, csm.j), new dsy(2, csm.m));
         this.a(
            dta.g,
            csm.I,
            cqq.f,
            ImmutableSet.of(dur.a, dur.b, dur.j, dur.r),
            true,
            false,
            new dsy(8, csm.I),
            new dsy(52, csm.aV),
            new dsy(3, csm.b),
            new dsy(1, csm.F)
         );
         this.a(dta.h, cja.ll, cqq.f, ImmutableSet.of(), false, false, new dsy(116, csm.aV), new dsy(3, csm.b), new dsy(1, csm.F));
         this.a(dta.i, csm.hW, cqq.a, ImmutableSet.of(), true, false, new dsy(1, csm.a));
      }
   }
}
