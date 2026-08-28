import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eni {
   public static final alc<enh> a = a("classic_flat");
   public static final alc<enh> b = a("tunnelers_dream");
   public static final alc<enh> c = a("water_world");
   public static final alc<enh> d = a("overworld");
   public static final alc<enh> e = a("snowy_kingdom");
   public static final alc<enh> f = a("bottomless_pit");
   public static final alc<enh> g = a("desert");
   public static final alc<enh> h = a("redstone_ready");
   public static final alc<enh> i = a("the_void");

   public static void a(qg<enh> $$0) {
      new eni.a($$0).a();
   }

   private static alc<enh> a(String $$0) {
      return alc.a(me.aU, ald.b($$0));
   }

   static class a {
      private final qg<enh> a;

      a(qg<enh> $$0) {
         this.a = $$0;
      }

      private void a(alc<enh> $$0, dho $$1, alc<dis> $$2, Set<alc<epm>> $$3, boolean $$4, boolean $$5, eng... $$6) {
         jt<epm> $$7 = this.a.a(me.bb);
         jt<eok> $$8 = this.a.a(me.aY);
         jt<dis> $$9 = this.a.a(me.aM);
         jw.a<epm> $$10 = jw.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         enj $$11 = new enj(Optional.of($$10), $$9.b($$2), enj.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new enh($$1.i().f(), $$11));
      }

      public void a() {
         this.a(eni.a, dkw.i, diz.b, ImmutableSet.of(eoz.a), false, false, new eng(1, dkw.i), new eng(2, dkw.j), new eng(1, dkw.I));
         this.a(eni.b, dkw.b, diz.u, ImmutableSet.of(eoz.j, eoz.r), true, false, new eng(1, dkw.i), new eng(5, dkw.j), new eng(230, dkw.b), new eng(1, dkw.I));
         this.a(
            eni.c,
            cyc.rk,
            diz.U,
            ImmutableSet.of(eoz.m, eoz.l, eoz.g),
            false,
            false,
            new eng(90, dkw.J),
            new eng(5, dkw.O),
            new eng(5, dkw.j),
            new eng(5, dkw.b),
            new eng(64, dkw.tp),
            new eng(1, dkw.I)
         );
         this.a(
            eni.d,
            dkw.bA,
            diz.b,
            ImmutableSet.of(eoz.a, eoz.j, eoz.f, eoz.k, eoz.r),
            true,
            true,
            new eng(1, dkw.i),
            new eng(3, dkw.j),
            new eng(59, dkw.b),
            new eng(1, dkw.I)
         );
         this.a(
            eni.e,
            dkw.ea,
            diz.d,
            ImmutableSet.of(eoz.a, eoz.c),
            false,
            false,
            new eng(1, dkw.ea),
            new eng(1, dkw.i),
            new eng(3, dkw.j),
            new eng(59, dkw.b),
            new eng(1, dkw.I)
         );
         this.a(eni.f, cyc.qc, diz.b, ImmutableSet.of(eoz.a), false, false, new eng(1, dkw.i), new eng(3, dkw.j), new eng(2, dkw.m));
         this.a(
            eni.g,
            dkw.L,
            diz.f,
            ImmutableSet.of(eoz.a, eoz.b, eoz.j, eoz.r),
            true,
            false,
            new eng(8, dkw.L),
            new eng(52, dkw.bc),
            new eng(3, dkw.b),
            new eng(1, dkw.I)
         );
         this.a(eni.h, cyc.mg, diz.f, ImmutableSet.of(), false, false, new eng(116, dkw.bc), new eng(3, dkw.b), new eng(1, dkw.I));
         this.a(eni.i, dkw.iu, diz.a, ImmutableSet.of(), true, false, new eng(1, dkw.a));
      }
   }
}
