import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class epd {
   public static final alf<epc> a = a("classic_flat");
   public static final alf<epc> b = a("tunnelers_dream");
   public static final alf<epc> c = a("water_world");
   public static final alf<epc> d = a("overworld");
   public static final alf<epc> e = a("snowy_kingdom");
   public static final alf<epc> f = a("bottomless_pit");
   public static final alf<epc> g = a("desert");
   public static final alf<epc> h = a("redstone_ready");
   public static final alf<epc> i = a("the_void");

   public static void a(qh<epc> $$0) {
      new epd.a($$0).a();
   }

   private static alf<epc> a(String $$0) {
      return alf.a(mg.aS, alg.b($$0));
   }

   static class a {
      private final qh<epc> a;

      a(qh<epc> $$0) {
         this.a = $$0;
      }

      private void a(alf<epc> $$0, diz $$1, alf<dkd> $$2, Set<alf<erh>> $$3, boolean $$4, boolean $$5, epb... $$6) {
         jf<erh> $$7 = this.a.a(mg.bd);
         jf<eqf> $$8 = this.a.a(mg.bb);
         jf<dkd> $$9 = this.a.a(mg.aG);
         ji.a<erh> $$10 = ji.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         epe $$11 = new epe(Optional.of($$10), $$9.b($$2), epe.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new epc($$1.h().e(), $$11));
      }

      public void a() {
         this.a(epd.a, dmh.i, dkk.b, ImmutableSet.of(equ.a), false, false, new epb(1, dmh.i), new epb(2, dmh.j), new epb(1, dmh.I));
         this.a(epd.b, dmh.b, dkk.u, ImmutableSet.of(equ.j, equ.r), true, false, new epb(1, dmh.i), new epb(5, dmh.j), new epb(230, dmh.b), new epb(1, dmh.I));
         this.a(
            epd.c,
            czh.rp,
            dkk.U,
            ImmutableSet.of(equ.m, equ.l, equ.g),
            false,
            false,
            new epb(90, dmh.J),
            new epb(5, dmh.O),
            new epb(5, dmh.j),
            new epb(5, dmh.b),
            new epb(64, dmh.tt),
            new epb(1, dmh.I)
         );
         this.a(
            epd.d,
            dmh.bA,
            dkk.b,
            ImmutableSet.of(equ.a, equ.j, equ.f, equ.k, equ.r),
            true,
            true,
            new epb(1, dmh.i),
            new epb(3, dmh.j),
            new epb(59, dmh.b),
            new epb(1, dmh.I)
         );
         this.a(
            epd.e,
            dmh.ed,
            dkk.d,
            ImmutableSet.of(equ.a, equ.c),
            false,
            false,
            new epb(1, dmh.ed),
            new epb(1, dmh.i),
            new epb(3, dmh.j),
            new epb(59, dmh.b),
            new epb(1, dmh.I)
         );
         this.a(epd.f, czh.qh, dkk.b, ImmutableSet.of(equ.a), false, false, new epb(1, dmh.i), new epb(3, dmh.j), new epb(2, dmh.m));
         this.a(
            epd.g,
            dmh.L,
            dkk.f,
            ImmutableSet.of(equ.a, equ.b, equ.j, equ.r),
            true,
            false,
            new epb(8, dmh.L),
            new epb(52, dmh.bc),
            new epb(3, dmh.b),
            new epb(1, dmh.I)
         );
         this.a(epd.h, czh.ml, dkk.f, ImmutableSet.of(), false, false, new epb(116, dmh.bc), new epb(3, dmh.b), new epb(1, dmh.I));
         this.a(epd.i, dmh.iy, dkk.a, ImmutableSet.of(), true, false, new epb(1, dmh.a));
      }
   }
}
