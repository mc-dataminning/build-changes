import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ehs {
   public static final akq<ehr> a = a("classic_flat");
   public static final akq<ehr> b = a("tunnelers_dream");
   public static final akq<ehr> c = a("water_world");
   public static final akq<ehr> d = a("overworld");
   public static final akq<ehr> e = a("snowy_kingdom");
   public static final akq<ehr> f = a("bottomless_pit");
   public static final akq<ehr> g = a("desert");
   public static final akq<ehr> h = a("redstone_ready");
   public static final akq<ehr> i = a("the_void");

   public static void a(qq<ehr> $$0) {
      new ehs.a($$0).a();
   }

   private static akq<ehr> a(String $$0) {
      return akq.a(lu.aN, akr.b($$0));
   }

   static class a {
      private final qq<ehr> a;

      a(qq<ehr> $$0) {
         this.a = $$0;
      }

      private void a(akq<ehr> $$0, dcv $$1, akq<ddw> $$2, Set<akq<ejx>> $$3, boolean $$4, boolean $$5, ehq... $$6) {
         jn<ejx> $$7 = this.a.a(lu.aT);
         jn<eiv> $$8 = this.a.a(lu.aQ);
         jn<ddw> $$9 = this.a.a(lu.aF);
         jq.a<ejx> $$10 = jq.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eht $$11 = new eht(Optional.of($$10), $$9.b($$2), eht.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ehr($$1.r().o(), $$11));
      }

      public void a() {
         this.a(ehs.a, dga.i, ded.b, ImmutableSet.of(ejk.a), false, false, new ehq(1, dga.i), new ehq(2, dga.j), new ehq(1, dga.F));
         this.a(ehs.b, dga.b, ded.t, ImmutableSet.of(ejk.j, ejk.r), true, false, new ehq(1, dga.i), new ehq(5, dga.j), new ehq(230, dga.b), new ehq(1, dga.F));
         this.a(
            ehs.c,
            cut.qz,
            ded.T,
            ImmutableSet.of(ejk.m, ejk.l, ejk.g),
            false,
            false,
            new ehq(90, dga.G),
            new ehq(5, dga.L),
            new ehq(5, dga.j),
            new ehq(5, dga.b),
            new ehq(64, dga.sJ),
            new ehq(1, dga.F)
         );
         this.a(
            ehs.d,
            dga.bt,
            ded.b,
            ImmutableSet.of(ejk.a, ejk.j, ejk.f, ejk.k, ejk.r),
            true,
            true,
            new ehq(1, dga.i),
            new ehq(3, dga.j),
            new ehq(59, dga.b),
            new ehq(1, dga.F)
         );
         this.a(
            ehs.e,
            dga.dN,
            ded.d,
            ImmutableSet.of(ejk.a, ejk.c),
            false,
            false,
            new ehq(1, dga.dN),
            new ehq(1, dga.i),
            new ehq(3, dga.j),
            new ehq(59, dga.b),
            new ehq(1, dga.F)
         );
         this.a(ehs.f, cut.pt, ded.b, ImmutableSet.of(ejk.a), false, false, new ehq(1, dga.i), new ehq(3, dga.j), new ehq(2, dga.m));
         this.a(
            ehs.g,
            dga.I,
            ded.f,
            ImmutableSet.of(ejk.a, ejk.b, ejk.j, ejk.r),
            true,
            false,
            new ehq(8, dga.I),
            new ehq(52, dga.aV),
            new ehq(3, dga.b),
            new ehq(1, dga.F)
         );
         this.a(ehs.h, cut.lH, ded.f, ImmutableSet.of(), false, false, new ehq(116, dga.aV), new ehq(3, dga.b), new ehq(1, dga.F));
         this.a(ehs.i, dga.hW, ded.a, ImmutableSet.of(), true, false, new ehq(1, dga.a));
      }
   }
}
