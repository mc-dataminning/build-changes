import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eov {
   public static final alf<eou> a = a("classic_flat");
   public static final alf<eou> b = a("tunnelers_dream");
   public static final alf<eou> c = a("water_world");
   public static final alf<eou> d = a("overworld");
   public static final alf<eou> e = a("snowy_kingdom");
   public static final alf<eou> f = a("bottomless_pit");
   public static final alf<eou> g = a("desert");
   public static final alf<eou> h = a("redstone_ready");
   public static final alf<eou> i = a("the_void");

   public static void a(qh<eou> $$0) {
      new eov.a($$0).a();
   }

   private static alf<eou> a(String $$0) {
      return alf.a(mg.aR, alg.b($$0));
   }

   static class a {
      private final qh<eou> a;

      a(qh<eou> $$0) {
         this.a = $$0;
      }

      private void a(alf<eou> $$0, diu $$1, alf<djy> $$2, Set<alf<eqz>> $$3, boolean $$4, boolean $$5, eot... $$6) {
         jf<eqz> $$7 = this.a.a(mg.bc);
         jf<epx> $$8 = this.a.a(mg.ba);
         jf<djy> $$9 = this.a.a(mg.aG);
         ji.a<eqz> $$10 = ji.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eow $$11 = new eow(Optional.of($$10), $$9.b($$2), eow.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new eou($$1.h().e(), $$11));
      }

      public void a() {
         this.a(eov.a, dmc.i, dkf.b, ImmutableSet.of(eqm.a), false, false, new eot(1, dmc.i), new eot(2, dmc.j), new eot(1, dmc.I));
         this.a(eov.b, dmc.b, dkf.u, ImmutableSet.of(eqm.j, eqm.r), true, false, new eot(1, dmc.i), new eot(5, dmc.j), new eot(230, dmc.b), new eot(1, dmc.I));
         this.a(
            eov.c,
            czc.rm,
            dkf.U,
            ImmutableSet.of(eqm.m, eqm.l, eqm.g),
            false,
            false,
            new eot(90, dmc.J),
            new eot(5, dmc.O),
            new eot(5, dmc.j),
            new eot(5, dmc.b),
            new eot(64, dmc.tq),
            new eot(1, dmc.I)
         );
         this.a(
            eov.d,
            dmc.bA,
            dkf.b,
            ImmutableSet.of(eqm.a, eqm.j, eqm.f, eqm.k, eqm.r),
            true,
            true,
            new eot(1, dmc.i),
            new eot(3, dmc.j),
            new eot(59, dmc.b),
            new eot(1, dmc.I)
         );
         this.a(
            eov.e,
            dmc.eb,
            dkf.d,
            ImmutableSet.of(eqm.a, eqm.c),
            false,
            false,
            new eot(1, dmc.eb),
            new eot(1, dmc.i),
            new eot(3, dmc.j),
            new eot(59, dmc.b),
            new eot(1, dmc.I)
         );
         this.a(eov.f, czc.qe, dkf.b, ImmutableSet.of(eqm.a), false, false, new eot(1, dmc.i), new eot(3, dmc.j), new eot(2, dmc.m));
         this.a(
            eov.g,
            dmc.L,
            dkf.f,
            ImmutableSet.of(eqm.a, eqm.b, eqm.j, eqm.r),
            true,
            false,
            new eot(8, dmc.L),
            new eot(52, dmc.bc),
            new eot(3, dmc.b),
            new eot(1, dmc.I)
         );
         this.a(eov.h, czc.mi, dkf.f, ImmutableSet.of(), false, false, new eot(116, dmc.bc), new eot(3, dmc.b), new eot(1, dmc.I));
         this.a(eov.i, dmc.iv, dkf.a, ImmutableSet.of(), true, false, new eot(1, dmc.a));
      }
   }
}
