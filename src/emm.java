import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class emm {
   public static final aly<eml> a = a("classic_flat");
   public static final aly<eml> b = a("tunnelers_dream");
   public static final aly<eml> c = a("water_world");
   public static final aly<eml> d = a("overworld");
   public static final aly<eml> e = a("snowy_kingdom");
   public static final aly<eml> f = a("bottomless_pit");
   public static final aly<eml> g = a("desert");
   public static final aly<eml> h = a("redstone_ready");
   public static final aly<eml> i = a("the_void");

   public static void a(rk<eml> $$0) {
      new emm.a($$0).a();
   }

   private static aly<eml> a(String $$0) {
      return aly.a(mb.aQ, alz.b($$0));
   }

   static class a {
      private final rk<eml> a;

      a(rk<eml> $$0) {
         this.a = $$0;
      }

      private void a(aly<eml> $$0, dhh $$1, aly<dik> $$2, Set<aly<eoq>> $$3, boolean $$4, boolean $$5, emk... $$6) {
         jr<eoq> $$7 = this.a.a(mb.aW);
         jr<eno> $$8 = this.a.a(mb.aT);
         jr<dik> $$9 = this.a.a(mb.aI);
         ju.a<eoq> $$10 = ju.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         emn $$11 = new emn(Optional.of($$10), $$9.b($$2), emn.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eml($$1.j().f(), $$11));
      }

      public void a() {
         this.a(emm.a, dko.i, dir.b, ImmutableSet.of(eod.a), false, false, new emk(1, dko.i), new emk(2, dko.j), new emk(1, dko.I));
         this.a(emm.b, dko.b, dir.t, ImmutableSet.of(eod.j, eod.r), true, false, new emk(1, dko.i), new emk(5, dko.j), new emk(230, dko.b), new emk(1, dko.I));
         this.a(
            emm.c,
            cxt.qX,
            dir.T,
            ImmutableSet.of(eod.m, eod.l, eod.g),
            false,
            false,
            new emk(90, dko.J),
            new emk(5, dko.O),
            new emk(5, dko.j),
            new emk(5, dko.b),
            new emk(64, dko.te),
            new emk(1, dko.I)
         );
         this.a(
            emm.d,
            dko.bA,
            dir.b,
            ImmutableSet.of(eod.a, eod.j, eod.f, eod.k, eod.r),
            true,
            true,
            new emk(1, dko.i),
            new emk(3, dko.j),
            new emk(59, dko.b),
            new emk(1, dko.I)
         );
         this.a(
            emm.e,
            dko.ea,
            dir.d,
            ImmutableSet.of(eod.a, eod.c),
            false,
            false,
            new emk(1, dko.ea),
            new emk(1, dko.i),
            new emk(3, dko.j),
            new emk(59, dko.b),
            new emk(1, dko.I)
         );
         this.a(emm.f, cxt.pP, dir.b, ImmutableSet.of(eod.a), false, false, new emk(1, dko.i), new emk(3, dko.j), new emk(2, dko.m));
         this.a(
            emm.g,
            dko.L,
            dir.f,
            ImmutableSet.of(eod.a, eod.b, eod.j, eod.r),
            true,
            false,
            new emk(8, dko.L),
            new emk(52, dko.bc),
            new emk(3, dko.b),
            new emk(1, dko.I)
         );
         this.a(emm.h, cxt.lV, dir.f, ImmutableSet.of(), false, false, new emk(116, dko.bc), new emk(3, dko.b), new emk(1, dko.I));
         this.a(emm.i, dko.in, dir.a, ImmutableSet.of(), true, false, new emk(1, dko.a));
      }
   }
}
