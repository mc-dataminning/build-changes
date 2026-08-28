import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eqf {
   public static final alj<eqe> a = a("classic_flat");
   public static final alj<eqe> b = a("tunnelers_dream");
   public static final alj<eqe> c = a("water_world");
   public static final alj<eqe> d = a("overworld");
   public static final alj<eqe> e = a("snowy_kingdom");
   public static final alj<eqe> f = a("bottomless_pit");
   public static final alj<eqe> g = a("desert");
   public static final alj<eqe> h = a("redstone_ready");
   public static final alj<eqe> i = a("the_void");

   public static void a(qi<eqe> $$0) {
      new eqf.a($$0).a();
   }

   private static alj<eqe> a(String $$0) {
      return alj.a(mi.aS, alk.b($$0));
   }

   static class a {
      private final qi<eqe> a;

      a(qi<eqe> $$0) {
         this.a = $$0;
      }

      private void a(alj<eqe> $$0, djy $$1, alj<dlc> $$2, Set<alj<esj>> $$3, boolean $$4, boolean $$5, eqd... $$6) {
         jh<esj> $$7 = this.a.a(mi.bd);
         jh<erh> $$8 = this.a.a(mi.bb);
         jh<dlc> $$9 = this.a.a(mi.aG);
         jk.a<esj> $$10 = jk.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eqg $$11 = new eqg(Optional.of($$10), $$9.b($$2), eqg.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eqe($$1.h().e(), $$11));
      }

      public void a() {
         this.a(eqf.a, dng.i, dlj.b, ImmutableSet.of(erw.a), false, false, new eqd(1, dng.i), new eqd(2, dng.j), new eqd(1, dng.I));
         this.a(eqf.b, dng.b, dlj.u, ImmutableSet.of(erw.j, erw.r), true, false, new eqd(1, dng.i), new eqd(5, dng.j), new eqd(230, dng.b), new eqd(1, dng.I));
         this.a(
            eqf.c,
            dae.rp,
            dlj.U,
            ImmutableSet.of(erw.m, erw.l, erw.g),
            false,
            false,
            new eqd(90, dng.J),
            new eqd(5, dng.O),
            new eqd(5, dng.j),
            new eqd(5, dng.b),
            new eqd(64, dng.tt),
            new eqd(1, dng.I)
         );
         this.a(
            eqf.d,
            dng.bA,
            dlj.b,
            ImmutableSet.of(erw.a, erw.j, erw.f, erw.k, erw.r),
            true,
            true,
            new eqd(1, dng.i),
            new eqd(3, dng.j),
            new eqd(59, dng.b),
            new eqd(1, dng.I)
         );
         this.a(
            eqf.e,
            dng.ed,
            dlj.d,
            ImmutableSet.of(erw.a, erw.c),
            false,
            false,
            new eqd(1, dng.ed),
            new eqd(1, dng.i),
            new eqd(3, dng.j),
            new eqd(59, dng.b),
            new eqd(1, dng.I)
         );
         this.a(eqf.f, dae.qh, dlj.b, ImmutableSet.of(erw.a), false, false, new eqd(1, dng.i), new eqd(3, dng.j), new eqd(2, dng.m));
         this.a(
            eqf.g,
            dng.L,
            dlj.f,
            ImmutableSet.of(erw.a, erw.b, erw.j, erw.r),
            true,
            false,
            new eqd(8, dng.L),
            new eqd(52, dng.bc),
            new eqd(3, dng.b),
            new eqd(1, dng.I)
         );
         this.a(eqf.h, dae.ml, dlj.f, ImmutableSet.of(), false, false, new eqd(116, dng.bc), new eqd(3, dng.b), new eqd(1, dng.I));
         this.a(eqf.i, dng.iy, dlj.a, ImmutableSet.of(), true, false, new eqd(1, dng.a));
      }
   }
}
