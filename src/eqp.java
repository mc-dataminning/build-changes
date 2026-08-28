import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eqp {
   public static final alq<eqo> a = a("classic_flat");
   public static final alq<eqo> b = a("tunnelers_dream");
   public static final alq<eqo> c = a("water_world");
   public static final alq<eqo> d = a("overworld");
   public static final alq<eqo> e = a("snowy_kingdom");
   public static final alq<eqo> f = a("bottomless_pit");
   public static final alq<eqo> g = a("desert");
   public static final alq<eqo> h = a("redstone_ready");
   public static final alq<eqo> i = a("the_void");

   public static void a(qi<eqo> $$0) {
      new eqp.a($$0).a();
   }

   private static alq<eqo> a(String $$0) {
      return alq.a(mi.aS, alr.b($$0));
   }

   static class a {
      private final qi<eqo> a;

      a(qi<eqo> $$0) {
         this.a = $$0;
      }

      private void a(alq<eqo> $$0, dki $$1, alq<dlm> $$2, Set<alq<est>> $$3, boolean $$4, boolean $$5, eqn... $$6) {
         jh<est> $$7 = this.a.a(mi.bd);
         jh<err> $$8 = this.a.a(mi.bb);
         jh<dlm> $$9 = this.a.a(mi.aG);
         jk.a<est> $$10 = jk.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eqq $$11 = new eqq(Optional.of($$10), $$9.b($$2), eqq.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eqo($$1.h().e(), $$11));
      }

      public void a() {
         this.a(eqp.a, dnq.i, dlt.b, ImmutableSet.of(esg.a), false, false, new eqn(1, dnq.i), new eqn(2, dnq.j), new eqn(1, dnq.I));
         this.a(eqp.b, dnq.b, dlt.u, ImmutableSet.of(esg.j, esg.r), true, false, new eqn(1, dnq.i), new eqn(5, dnq.j), new eqn(230, dnq.b), new eqn(1, dnq.I));
         this.a(
            eqp.c,
            dao.rp,
            dlt.U,
            ImmutableSet.of(esg.m, esg.l, esg.g),
            false,
            false,
            new eqn(90, dnq.J),
            new eqn(5, dnq.O),
            new eqn(5, dnq.j),
            new eqn(5, dnq.b),
            new eqn(64, dnq.tt),
            new eqn(1, dnq.I)
         );
         this.a(
            eqp.d,
            dnq.bA,
            dlt.b,
            ImmutableSet.of(esg.a, esg.j, esg.f, esg.k, esg.r),
            true,
            true,
            new eqn(1, dnq.i),
            new eqn(3, dnq.j),
            new eqn(59, dnq.b),
            new eqn(1, dnq.I)
         );
         this.a(
            eqp.e,
            dnq.ed,
            dlt.d,
            ImmutableSet.of(esg.a, esg.c),
            false,
            false,
            new eqn(1, dnq.ed),
            new eqn(1, dnq.i),
            new eqn(3, dnq.j),
            new eqn(59, dnq.b),
            new eqn(1, dnq.I)
         );
         this.a(eqp.f, dao.qh, dlt.b, ImmutableSet.of(esg.a), false, false, new eqn(1, dnq.i), new eqn(3, dnq.j), new eqn(2, dnq.m));
         this.a(
            eqp.g,
            dnq.L,
            dlt.f,
            ImmutableSet.of(esg.a, esg.b, esg.j, esg.r),
            true,
            false,
            new eqn(8, dnq.L),
            new eqn(52, dnq.bc),
            new eqn(3, dnq.b),
            new eqn(1, dnq.I)
         );
         this.a(eqp.h, dao.ml, dlt.f, ImmutableSet.of(), false, false, new eqn(116, dnq.bc), new eqn(3, dnq.b), new eqn(1, dnq.I));
         this.a(eqp.i, dnq.iy, dlt.a, ImmutableSet.of(), true, false, new eqn(1, dnq.a));
      }
   }
}
