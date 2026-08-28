import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ehr {
   public static final akq<ehq> a = a("classic_flat");
   public static final akq<ehq> b = a("tunnelers_dream");
   public static final akq<ehq> c = a("water_world");
   public static final akq<ehq> d = a("overworld");
   public static final akq<ehq> e = a("snowy_kingdom");
   public static final akq<ehq> f = a("bottomless_pit");
   public static final akq<ehq> g = a("desert");
   public static final akq<ehq> h = a("redstone_ready");
   public static final akq<ehq> i = a("the_void");

   public static void a(qq<ehq> $$0) {
      new ehr.a($$0).a();
   }

   private static akq<ehq> a(String $$0) {
      return akq.a(lu.aN, akr.b($$0));
   }

   static class a {
      private final qq<ehq> a;

      a(qq<ehq> $$0) {
         this.a = $$0;
      }

      private void a(akq<ehq> $$0, dcv $$1, akq<ddw> $$2, Set<akq<ejv>> $$3, boolean $$4, boolean $$5, ehp... $$6) {
         jn<ejv> $$7 = this.a.a(lu.aT);
         jn<eit> $$8 = this.a.a(lu.aQ);
         jn<ddw> $$9 = this.a.a(lu.aF);
         jq.a<ejv> $$10 = jq.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         ehs $$11 = new ehs(Optional.of($$10), $$9.b($$2), ehs.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ehq($$1.r().o(), $$11));
      }

      public void a() {
         this.a(ehr.a, dga.i, ded.b, ImmutableSet.of(eji.a), false, false, new ehp(1, dga.i), new ehp(2, dga.j), new ehp(1, dga.F));
         this.a(ehr.b, dga.b, ded.t, ImmutableSet.of(eji.j, eji.r), true, false, new ehp(1, dga.i), new ehp(5, dga.j), new ehp(230, dga.b), new ehp(1, dga.F));
         this.a(
            ehr.c,
            cut.qz,
            ded.T,
            ImmutableSet.of(eji.m, eji.l, eji.g),
            false,
            false,
            new ehp(90, dga.G),
            new ehp(5, dga.L),
            new ehp(5, dga.j),
            new ehp(5, dga.b),
            new ehp(64, dga.sJ),
            new ehp(1, dga.F)
         );
         this.a(
            ehr.d,
            dga.bt,
            ded.b,
            ImmutableSet.of(eji.a, eji.j, eji.f, eji.k, eji.r),
            true,
            true,
            new ehp(1, dga.i),
            new ehp(3, dga.j),
            new ehp(59, dga.b),
            new ehp(1, dga.F)
         );
         this.a(
            ehr.e,
            dga.dN,
            ded.d,
            ImmutableSet.of(eji.a, eji.c),
            false,
            false,
            new ehp(1, dga.dN),
            new ehp(1, dga.i),
            new ehp(3, dga.j),
            new ehp(59, dga.b),
            new ehp(1, dga.F)
         );
         this.a(ehr.f, cut.pt, ded.b, ImmutableSet.of(eji.a), false, false, new ehp(1, dga.i), new ehp(3, dga.j), new ehp(2, dga.m));
         this.a(
            ehr.g,
            dga.I,
            ded.f,
            ImmutableSet.of(eji.a, eji.b, eji.j, eji.r),
            true,
            false,
            new ehp(8, dga.I),
            new ehp(52, dga.aV),
            new ehp(3, dga.b),
            new ehp(1, dga.F)
         );
         this.a(ehr.h, cut.lH, ded.f, ImmutableSet.of(), false, false, new ehp(116, dga.aV), new ehp(3, dga.b), new ehp(1, dga.F));
         this.a(ehr.i, dga.hW, ded.a, ImmutableSet.of(), true, false, new ehp(1, dga.a));
      }
   }
}
