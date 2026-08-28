import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eok {
   public static final ald<eoj> a = a("classic_flat");
   public static final ald<eoj> b = a("tunnelers_dream");
   public static final ald<eoj> c = a("water_world");
   public static final ald<eoj> d = a("overworld");
   public static final ald<eoj> e = a("snowy_kingdom");
   public static final ald<eoj> f = a("bottomless_pit");
   public static final ald<eoj> g = a("desert");
   public static final ald<eoj> h = a("redstone_ready");
   public static final ald<eoj> i = a("the_void");

   public static void a(qh<eoj> $$0) {
      new eok.a($$0).a();
   }

   private static ald<eoj> a(String $$0) {
      return ald.a(mg.aQ, ale.b($$0));
   }

   static class a {
      private final qh<eoj> a;

      a(qh<eoj> $$0) {
         this.a = $$0;
      }

      private void a(ald<eoj> $$0, dio $$1, ald<djs> $$2, Set<ald<eqo>> $$3, boolean $$4, boolean $$5, eoi... $$6) {
         jf<eqo> $$7 = this.a.a(mg.bb);
         jf<epm> $$8 = this.a.a(mg.aZ);
         jf<djs> $$9 = this.a.a(mg.aG);
         ji.a<eqo> $$10 = ji.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eol $$11 = new eol(Optional.of($$10), $$9.b($$2), eol.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eoj($$1.h().e(), $$11));
      }

      public void a() {
         this.a(eok.a, dlw.i, djz.b, ImmutableSet.of(eqb.a), false, false, new eoi(1, dlw.i), new eoi(2, dlw.j), new eoi(1, dlw.I));
         this.a(eok.b, dlw.b, djz.u, ImmutableSet.of(eqb.j, eqb.r), true, false, new eoi(1, dlw.i), new eoi(5, dlw.j), new eoi(230, dlw.b), new eoi(1, dlw.I));
         this.a(
            eok.c,
            cyw.rk,
            djz.U,
            ImmutableSet.of(eqb.m, eqb.l, eqb.g),
            false,
            false,
            new eoi(90, dlw.J),
            new eoi(5, dlw.O),
            new eoi(5, dlw.j),
            new eoi(5, dlw.b),
            new eoi(64, dlw.tp),
            new eoi(1, dlw.I)
         );
         this.a(
            eok.d,
            dlw.bA,
            djz.b,
            ImmutableSet.of(eqb.a, eqb.j, eqb.f, eqb.k, eqb.r),
            true,
            true,
            new eoi(1, dlw.i),
            new eoi(3, dlw.j),
            new eoi(59, dlw.b),
            new eoi(1, dlw.I)
         );
         this.a(
            eok.e,
            dlw.ea,
            djz.d,
            ImmutableSet.of(eqb.a, eqb.c),
            false,
            false,
            new eoi(1, dlw.ea),
            new eoi(1, dlw.i),
            new eoi(3, dlw.j),
            new eoi(59, dlw.b),
            new eoi(1, dlw.I)
         );
         this.a(eok.f, cyw.qc, djz.b, ImmutableSet.of(eqb.a), false, false, new eoi(1, dlw.i), new eoi(3, dlw.j), new eoi(2, dlw.m));
         this.a(
            eok.g,
            dlw.L,
            djz.f,
            ImmutableSet.of(eqb.a, eqb.b, eqb.j, eqb.r),
            true,
            false,
            new eoi(8, dlw.L),
            new eoi(52, dlw.bc),
            new eoi(3, dlw.b),
            new eoi(1, dlw.I)
         );
         this.a(eok.h, cyw.mg, djz.f, ImmutableSet.of(), false, false, new eoi(116, dlw.bc), new eoi(3, dlw.b), new eoi(1, dlw.I));
         this.a(eok.i, dlw.iu, djz.a, ImmutableSet.of(), true, false, new eoi(1, dlw.a));
      }
   }
}
