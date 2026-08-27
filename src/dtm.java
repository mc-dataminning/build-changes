import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dtm {
   public static final aex<dtl> a = a("classic_flat");
   public static final aex<dtl> b = a("tunnelers_dream");
   public static final aex<dtl> c = a("water_world");
   public static final aex<dtl> d = a("overworld");
   public static final aex<dtl> e = a("snowy_kingdom");
   public static final aex<dtl> f = a("bottomless_pit");
   public static final aex<dtl> g = a("desert");
   public static final aex<dtl> h = a("redstone_ready");
   public static final aex<dtl> i = a("the_void");

   public static void a(nt<dtl> $$0) {
      new dtm.a($$0).a();
   }

   private static aex<dtl> a(String $$0) {
      return aex.a(je.av, new aey($$0));
   }

   static class a {
      private final nt<dtl> a;

      a(nt<dtl> $$0) {
         this.a = $$0;
      }

      private void a(aex<dtl> $$0, cpw $$1, aex<cqv> $$2, Set<aex<dvq>> $$3, boolean $$4, boolean $$5, dtk... $$6) {
         hh<dvq> $$7 = this.a.a(je.aB);
         hh<duo> $$8 = this.a.a(je.ay);
         hh<cqv> $$9 = this.a.a(je.ap);
         hk.a<dvq> $$10 = hk.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dtn $$11 = new dtn(Optional.of($$10), $$9.b($$2), dtn.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dtl($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dtm.a, csy.i, crc.b, ImmutableSet.of(dvd.a), false, false, new dtk(1, csy.i), new dtk(2, csy.j), new dtk(1, csy.F));
         this.a(dtm.b, csy.b, crc.t, ImmutableSet.of(dvd.j, dvd.r), true, false, new dtk(1, csy.i), new dtk(5, csy.j), new dtk(230, csy.b), new dtk(1, csy.F));
         this.a(
            dtm.c,
            cjk.pL,
            crc.T,
            ImmutableSet.of(dvd.m, dvd.l, dvd.g),
            false,
            false,
            new dtk(90, csy.G),
            new dtk(5, csy.L),
            new dtk(5, csy.j),
            new dtk(5, csy.b),
            new dtk(64, csy.rI),
            new dtk(1, csy.F)
         );
         this.a(
            dtm.d,
            csy.bt,
            crc.b,
            ImmutableSet.of(dvd.a, dvd.j, dvd.f, dvd.k, dvd.r),
            true,
            true,
            new dtk(1, csy.i),
            new dtk(3, csy.j),
            new dtk(59, csy.b),
            new dtk(1, csy.F)
         );
         this.a(
            dtm.e,
            csy.dN,
            crc.d,
            ImmutableSet.of(dvd.a, dvd.c),
            false,
            false,
            new dtk(1, csy.dN),
            new dtk(1, csy.i),
            new dtk(3, csy.j),
            new dtk(59, csy.b),
            new dtk(1, csy.F)
         );
         this.a(dtm.f, cjk.oF, crc.b, ImmutableSet.of(dvd.a), false, false, new dtk(1, csy.i), new dtk(3, csy.j), new dtk(2, csy.m));
         this.a(
            dtm.g,
            csy.I,
            crc.f,
            ImmutableSet.of(dvd.a, dvd.b, dvd.j, dvd.r),
            true,
            false,
            new dtk(8, csy.I),
            new dtk(52, csy.aV),
            new dtk(3, csy.b),
            new dtk(1, csy.F)
         );
         this.a(dtm.h, cjk.ll, crc.f, ImmutableSet.of(), false, false, new dtk(116, csy.aV), new dtk(3, csy.b), new dtk(1, csy.F));
         this.a(dtm.i, csy.hW, crc.a, ImmutableSet.of(), true, false, new dtk(1, csy.a));
      }
   }
}
