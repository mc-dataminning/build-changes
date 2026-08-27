import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eei {
   public static final ake<eeh> a = a("classic_flat");
   public static final ake<eeh> b = a("tunnelers_dream");
   public static final ake<eeh> c = a("water_world");
   public static final ake<eeh> d = a("overworld");
   public static final ake<eeh> e = a("snowy_kingdom");
   public static final ake<eeh> f = a("bottomless_pit");
   public static final ake<eeh> g = a("desert");
   public static final ake<eeh> h = a("redstone_ready");
   public static final ake<eeh> i = a("the_void");

   public static void a(qj<eeh> $$0) {
      new eei.a($$0).a();
   }

   private static ake<eeh> a(String $$0) {
      return ake.a(ld.aE, new akf($$0));
   }

   static class a {
      private final qj<eeh> a;

      a(qj<eeh> $$0) {
         this.a = $$0;
      }

      private void a(ake<eeh> $$0, czt $$1, ake<dat> $$2, Set<ake<egm>> $$3, boolean $$4, boolean $$5, eeg... $$6) {
         iw<egm> $$7 = this.a.a(ld.aK);
         iw<efk> $$8 = this.a.a(ld.aH);
         iw<dat> $$9 = this.a.a(ld.ay);
         iz.a<egm> $$10 = iz.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eej $$11 = new eej(Optional.of($$10), $$9.b($$2), eej.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eeh($$1.p().n(), $$11));
      }

      public void a() {
         this.a(eei.a, dcx.i, dba.b, ImmutableSet.of(efz.a), false, false, new eeg(1, dcx.i), new eeg(2, dcx.j), new eeg(1, dcx.F));
         this.a(eei.b, dcx.b, dba.t, ImmutableSet.of(efz.j, efz.r), true, false, new eeg(1, dcx.i), new eeg(5, dcx.j), new eeg(230, dcx.b), new eeg(1, dcx.F));
         this.a(
            eei.c,
            csg.qz,
            dba.T,
            ImmutableSet.of(efz.m, efz.l, efz.g),
            false,
            false,
            new eeg(90, dcx.G),
            new eeg(5, dcx.L),
            new eeg(5, dcx.j),
            new eeg(5, dcx.b),
            new eeg(64, dcx.sJ),
            new eeg(1, dcx.F)
         );
         this.a(
            eei.d,
            dcx.bt,
            dba.b,
            ImmutableSet.of(efz.a, efz.j, efz.f, efz.k, efz.r),
            true,
            true,
            new eeg(1, dcx.i),
            new eeg(3, dcx.j),
            new eeg(59, dcx.b),
            new eeg(1, dcx.F)
         );
         this.a(
            eei.e,
            dcx.dN,
            dba.d,
            ImmutableSet.of(efz.a, efz.c),
            false,
            false,
            new eeg(1, dcx.dN),
            new eeg(1, dcx.i),
            new eeg(3, dcx.j),
            new eeg(59, dcx.b),
            new eeg(1, dcx.F)
         );
         this.a(eei.f, csg.pt, dba.b, ImmutableSet.of(efz.a), false, false, new eeg(1, dcx.i), new eeg(3, dcx.j), new eeg(2, dcx.m));
         this.a(
            eei.g,
            dcx.I,
            dba.f,
            ImmutableSet.of(efz.a, efz.b, efz.j, efz.r),
            true,
            false,
            new eeg(8, dcx.I),
            new eeg(52, dcx.aV),
            new eeg(3, dcx.b),
            new eeg(1, dcx.F)
         );
         this.a(eei.h, csg.lH, dba.f, ImmutableSet.of(), false, false, new eeg(116, dcx.aV), new eeg(3, dcx.b), new eeg(1, dcx.F));
         this.a(eei.i, dcx.hW, dba.a, ImmutableSet.of(), true, false, new eeg(1, dcx.a));
      }
   }
}
