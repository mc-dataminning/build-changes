import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dtb {
   public static final aeq<dta> a = a("classic_flat");
   public static final aeq<dta> b = a("tunnelers_dream");
   public static final aeq<dta> c = a("water_world");
   public static final aeq<dta> d = a("overworld");
   public static final aeq<dta> e = a("snowy_kingdom");
   public static final aeq<dta> f = a("bottomless_pit");
   public static final aeq<dta> g = a("desert");
   public static final aeq<dta> h = a("redstone_ready");
   public static final aeq<dta> i = a("the_void");

   public static void a(nm<dta> $$0) {
      new dtb.a($$0).a();
   }

   private static aeq<dta> a(String $$0) {
      return aeq.a(jc.av, new aer($$0));
   }

   static class a {
      private final nm<dta> a;

      a(nm<dta> $$0) {
         this.a = $$0;
      }

      private void a(aeq<dta> $$0, cpl $$1, aeq<cqk> $$2, Set<aeq<dvf>> $$3, boolean $$4, boolean $$5, dsz... $$6) {
         hf<dvf> $$7 = this.a.a(jc.aB);
         hf<dud> $$8 = this.a.a(jc.ay);
         hf<cqk> $$9 = this.a.a(jc.ap);
         hi.a<dvf> $$10 = hi.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dtc $$11 = new dtc(Optional.of($$10), $$9.b($$2), dtc.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dta($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dtb.a, csn.i, cqr.b, ImmutableSet.of(dus.a), false, false, new dsz(1, csn.i), new dsz(2, csn.j), new dsz(1, csn.F));
         this.a(dtb.b, csn.b, cqr.t, ImmutableSet.of(dus.j, dus.r), true, false, new dsz(1, csn.i), new dsz(5, csn.j), new dsz(230, csn.b), new dsz(1, csn.F));
         this.a(
            dtb.c,
            cjb.pL,
            cqr.T,
            ImmutableSet.of(dus.m, dus.l, dus.g),
            false,
            false,
            new dsz(90, csn.G),
            new dsz(5, csn.L),
            new dsz(5, csn.j),
            new dsz(5, csn.b),
            new dsz(64, csn.rI),
            new dsz(1, csn.F)
         );
         this.a(
            dtb.d,
            csn.bt,
            cqr.b,
            ImmutableSet.of(dus.a, dus.j, dus.f, dus.k, dus.r),
            true,
            true,
            new dsz(1, csn.i),
            new dsz(3, csn.j),
            new dsz(59, csn.b),
            new dsz(1, csn.F)
         );
         this.a(
            dtb.e,
            csn.dN,
            cqr.d,
            ImmutableSet.of(dus.a, dus.c),
            false,
            false,
            new dsz(1, csn.dN),
            new dsz(1, csn.i),
            new dsz(3, csn.j),
            new dsz(59, csn.b),
            new dsz(1, csn.F)
         );
         this.a(dtb.f, cjb.oF, cqr.b, ImmutableSet.of(dus.a), false, false, new dsz(1, csn.i), new dsz(3, csn.j), new dsz(2, csn.m));
         this.a(
            dtb.g,
            csn.I,
            cqr.f,
            ImmutableSet.of(dus.a, dus.b, dus.j, dus.r),
            true,
            false,
            new dsz(8, csn.I),
            new dsz(52, csn.aV),
            new dsz(3, csn.b),
            new dsz(1, csn.F)
         );
         this.a(dtb.h, cjb.ll, cqr.f, ImmutableSet.of(), false, false, new dsz(116, csn.aV), new dsz(3, csn.b), new dsz(1, csn.F));
         this.a(dtb.i, csn.hW, cqr.a, ImmutableSet.of(), true, false, new dsz(1, csn.a));
      }
   }
}
