import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eer {
   public static final akg<eeq> a = a("classic_flat");
   public static final akg<eeq> b = a("tunnelers_dream");
   public static final akg<eeq> c = a("water_world");
   public static final akg<eeq> d = a("overworld");
   public static final akg<eeq> e = a("snowy_kingdom");
   public static final akg<eeq> f = a("bottomless_pit");
   public static final akg<eeq> g = a("desert");
   public static final akg<eeq> h = a("redstone_ready");
   public static final akg<eeq> i = a("the_void");

   public static void a(ql<eeq> $$0) {
      new eer.a($$0).a();
   }

   private static akg<eeq> a(String $$0) {
      return akg.a(le.aF, new akh($$0));
   }

   static class a {
      private final ql<eeq> a;

      a(ql<eeq> $$0) {
         this.a = $$0;
      }

      private void a(akg<eeq> $$0, dac $$1, akg<dbc> $$2, Set<akg<egv>> $$3, boolean $$4, boolean $$5, eep... $$6) {
         ix<egv> $$7 = this.a.a(le.aL);
         ix<eft> $$8 = this.a.a(le.aI);
         ix<dbc> $$9 = this.a.a(le.az);
         ja.a<egv> $$10 = ja.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         ees $$11 = new ees(Optional.of($$10), $$9.b($$2), ees.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eeq($$1.q().n(), $$11));
      }

      public void a() {
         this.a(eer.a, ddg.i, dbj.b, ImmutableSet.of(egi.a), false, false, new eep(1, ddg.i), new eep(2, ddg.j), new eep(1, ddg.F));
         this.a(eer.b, ddg.b, dbj.t, ImmutableSet.of(egi.j, egi.r), true, false, new eep(1, ddg.i), new eep(5, ddg.j), new eep(230, ddg.b), new eep(1, ddg.F));
         this.a(
            eer.c,
            ctc.qz,
            dbj.T,
            ImmutableSet.of(egi.m, egi.l, egi.g),
            false,
            false,
            new eep(90, ddg.G),
            new eep(5, ddg.L),
            new eep(5, ddg.j),
            new eep(5, ddg.b),
            new eep(64, ddg.sJ),
            new eep(1, ddg.F)
         );
         this.a(
            eer.d,
            ddg.bt,
            dbj.b,
            ImmutableSet.of(egi.a, egi.j, egi.f, egi.k, egi.r),
            true,
            true,
            new eep(1, ddg.i),
            new eep(3, ddg.j),
            new eep(59, ddg.b),
            new eep(1, ddg.F)
         );
         this.a(
            eer.e,
            ddg.dN,
            dbj.d,
            ImmutableSet.of(egi.a, egi.c),
            false,
            false,
            new eep(1, ddg.dN),
            new eep(1, ddg.i),
            new eep(3, ddg.j),
            new eep(59, ddg.b),
            new eep(1, ddg.F)
         );
         this.a(eer.f, ctc.pt, dbj.b, ImmutableSet.of(egi.a), false, false, new eep(1, ddg.i), new eep(3, ddg.j), new eep(2, ddg.m));
         this.a(
            eer.g,
            ddg.I,
            dbj.f,
            ImmutableSet.of(egi.a, egi.b, egi.j, egi.r),
            true,
            false,
            new eep(8, ddg.I),
            new eep(52, ddg.aV),
            new eep(3, ddg.b),
            new eep(1, ddg.F)
         );
         this.a(eer.h, ctc.lH, dbj.f, ImmutableSet.of(), false, false, new eep(116, ddg.aV), new eep(3, ddg.b), new eep(1, ddg.F));
         this.a(eer.i, ddg.hW, dbj.a, ImmutableSet.of(), true, false, new eep(1, ddg.a));
      }
   }
}
