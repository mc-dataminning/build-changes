import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eqd {
   public static final alh<eqc> a = a("classic_flat");
   public static final alh<eqc> b = a("tunnelers_dream");
   public static final alh<eqc> c = a("water_world");
   public static final alh<eqc> d = a("overworld");
   public static final alh<eqc> e = a("snowy_kingdom");
   public static final alh<eqc> f = a("bottomless_pit");
   public static final alh<eqc> g = a("desert");
   public static final alh<eqc> h = a("redstone_ready");
   public static final alh<eqc> i = a("the_void");

   public static void a(qh<eqc> $$0) {
      new eqd.a($$0).a();
   }

   private static alh<eqc> a(String $$0) {
      return alh.a(mh.aS, ali.b($$0));
   }

   static class a {
      private final qh<eqc> a;

      a(qh<eqc> $$0) {
         this.a = $$0;
      }

      private void a(alh<eqc> $$0, djw $$1, alh<dla> $$2, Set<alh<esh>> $$3, boolean $$4, boolean $$5, eqb... $$6) {
         jg<esh> $$7 = this.a.a(mh.bd);
         jg<erf> $$8 = this.a.a(mh.bb);
         jg<dla> $$9 = this.a.a(mh.aG);
         jj.a<esh> $$10 = jj.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eqe $$11 = new eqe(Optional.of($$10), $$9.b($$2), eqe.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eqc($$1.h().e(), $$11));
      }

      public void a() {
         this.a(eqd.a, dne.i, dlh.b, ImmutableSet.of(eru.a), false, false, new eqb(1, dne.i), new eqb(2, dne.j), new eqb(1, dne.I));
         this.a(eqd.b, dne.b, dlh.u, ImmutableSet.of(eru.j, eru.r), true, false, new eqb(1, dne.i), new eqb(5, dne.j), new eqb(230, dne.b), new eqb(1, dne.I));
         this.a(
            eqd.c,
            dac.rp,
            dlh.U,
            ImmutableSet.of(eru.m, eru.l, eru.g),
            false,
            false,
            new eqb(90, dne.J),
            new eqb(5, dne.O),
            new eqb(5, dne.j),
            new eqb(5, dne.b),
            new eqb(64, dne.tt),
            new eqb(1, dne.I)
         );
         this.a(
            eqd.d,
            dne.bA,
            dlh.b,
            ImmutableSet.of(eru.a, eru.j, eru.f, eru.k, eru.r),
            true,
            true,
            new eqb(1, dne.i),
            new eqb(3, dne.j),
            new eqb(59, dne.b),
            new eqb(1, dne.I)
         );
         this.a(
            eqd.e,
            dne.ed,
            dlh.d,
            ImmutableSet.of(eru.a, eru.c),
            false,
            false,
            new eqb(1, dne.ed),
            new eqb(1, dne.i),
            new eqb(3, dne.j),
            new eqb(59, dne.b),
            new eqb(1, dne.I)
         );
         this.a(eqd.f, dac.qh, dlh.b, ImmutableSet.of(eru.a), false, false, new eqb(1, dne.i), new eqb(3, dne.j), new eqb(2, dne.m));
         this.a(
            eqd.g,
            dne.L,
            dlh.f,
            ImmutableSet.of(eru.a, eru.b, eru.j, eru.r),
            true,
            false,
            new eqb(8, dne.L),
            new eqb(52, dne.bc),
            new eqb(3, dne.b),
            new eqb(1, dne.I)
         );
         this.a(eqd.h, dac.ml, dlh.f, ImmutableSet.of(), false, false, new eqb(116, dne.bc), new eqb(3, dne.b), new eqb(1, dne.I));
         this.a(eqd.i, dne.iy, dlh.a, ImmutableSet.of(), true, false, new eqb(1, dne.a));
      }
   }
}
