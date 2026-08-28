import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eho {
   public static final akp<ehn> a = a("classic_flat");
   public static final akp<ehn> b = a("tunnelers_dream");
   public static final akp<ehn> c = a("water_world");
   public static final akp<ehn> d = a("overworld");
   public static final akp<ehn> e = a("snowy_kingdom");
   public static final akp<ehn> f = a("bottomless_pit");
   public static final akp<ehn> g = a("desert");
   public static final akp<ehn> h = a("redstone_ready");
   public static final akp<ehn> i = a("the_void");

   public static void a(qp<ehn> $$0) {
      new eho.a($$0).a();
   }

   private static akp<ehn> a(String $$0) {
      return akp.a(lu.aN, akq.b($$0));
   }

   static class a {
      private final qp<ehn> a;

      a(qp<ehn> $$0) {
         this.a = $$0;
      }

      private void a(akp<ehn> $$0, dct $$1, akp<ddu> $$2, Set<akp<ejs>> $$3, boolean $$4, boolean $$5, ehm... $$6) {
         jn<ejs> $$7 = this.a.a(lu.aT);
         jn<eiq> $$8 = this.a.a(lu.aQ);
         jn<ddu> $$9 = this.a.a(lu.aF);
         jq.a<ejs> $$10 = jq.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         ehp $$11 = new ehp(Optional.of($$10), $$9.b($$2), ehp.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ehn($$1.r().o(), $$11));
      }

      public void a() {
         this.a(eho.a, dfy.i, deb.b, ImmutableSet.of(ejf.a), false, false, new ehm(1, dfy.i), new ehm(2, dfy.j), new ehm(1, dfy.F));
         this.a(eho.b, dfy.b, deb.t, ImmutableSet.of(ejf.j, ejf.r), true, false, new ehm(1, dfy.i), new ehm(5, dfy.j), new ehm(230, dfy.b), new ehm(1, dfy.F));
         this.a(
            eho.c,
            cur.qz,
            deb.T,
            ImmutableSet.of(ejf.m, ejf.l, ejf.g),
            false,
            false,
            new ehm(90, dfy.G),
            new ehm(5, dfy.L),
            new ehm(5, dfy.j),
            new ehm(5, dfy.b),
            new ehm(64, dfy.sJ),
            new ehm(1, dfy.F)
         );
         this.a(
            eho.d,
            dfy.bt,
            deb.b,
            ImmutableSet.of(ejf.a, ejf.j, ejf.f, ejf.k, ejf.r),
            true,
            true,
            new ehm(1, dfy.i),
            new ehm(3, dfy.j),
            new ehm(59, dfy.b),
            new ehm(1, dfy.F)
         );
         this.a(
            eho.e,
            dfy.dN,
            deb.d,
            ImmutableSet.of(ejf.a, ejf.c),
            false,
            false,
            new ehm(1, dfy.dN),
            new ehm(1, dfy.i),
            new ehm(3, dfy.j),
            new ehm(59, dfy.b),
            new ehm(1, dfy.F)
         );
         this.a(eho.f, cur.pt, deb.b, ImmutableSet.of(ejf.a), false, false, new ehm(1, dfy.i), new ehm(3, dfy.j), new ehm(2, dfy.m));
         this.a(
            eho.g,
            dfy.I,
            deb.f,
            ImmutableSet.of(ejf.a, ejf.b, ejf.j, ejf.r),
            true,
            false,
            new ehm(8, dfy.I),
            new ehm(52, dfy.aV),
            new ehm(3, dfy.b),
            new ehm(1, dfy.F)
         );
         this.a(eho.h, cur.lH, deb.f, ImmutableSet.of(), false, false, new ehm(116, dfy.aV), new ehm(3, dfy.b), new ehm(1, dfy.F));
         this.a(eho.i, dfy.hW, deb.a, ImmutableSet.of(), true, false, new ehm(1, dfy.a));
      }
   }
}
