import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dtf {
   public static final aet<dte> a = a("classic_flat");
   public static final aet<dte> b = a("tunnelers_dream");
   public static final aet<dte> c = a("water_world");
   public static final aet<dte> d = a("overworld");
   public static final aet<dte> e = a("snowy_kingdom");
   public static final aet<dte> f = a("bottomless_pit");
   public static final aet<dte> g = a("desert");
   public static final aet<dte> h = a("redstone_ready");
   public static final aet<dte> i = a("the_void");

   public static void a(np<dte> $$0) {
      new dtf.a($$0).a();
   }

   private static aet<dte> a(String $$0) {
      return aet.a(je.av, new aeu($$0));
   }

   static class a {
      private final np<dte> a;

      a(np<dte> $$0) {
         this.a = $$0;
      }

      private void a(aet<dte> $$0, cpp $$1, aet<cqo> $$2, Set<aet<dvj>> $$3, boolean $$4, boolean $$5, dtd... $$6) {
         hh<dvj> $$7 = this.a.a(je.aB);
         hh<duh> $$8 = this.a.a(je.ay);
         hh<cqo> $$9 = this.a.a(je.ap);
         hk.a<dvj> $$10 = hk.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dtg $$11 = new dtg(Optional.of($$10), $$9.b($$2), dtg.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dte($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dtf.a, csr.i, cqv.b, ImmutableSet.of(duw.a), false, false, new dtd(1, csr.i), new dtd(2, csr.j), new dtd(1, csr.F));
         this.a(dtf.b, csr.b, cqv.t, ImmutableSet.of(duw.j, duw.r), true, false, new dtd(1, csr.i), new dtd(5, csr.j), new dtd(230, csr.b), new dtd(1, csr.F));
         this.a(
            dtf.c,
            cjd.pL,
            cqv.T,
            ImmutableSet.of(duw.m, duw.l, duw.g),
            false,
            false,
            new dtd(90, csr.G),
            new dtd(5, csr.L),
            new dtd(5, csr.j),
            new dtd(5, csr.b),
            new dtd(64, csr.rI),
            new dtd(1, csr.F)
         );
         this.a(
            dtf.d,
            csr.bt,
            cqv.b,
            ImmutableSet.of(duw.a, duw.j, duw.f, duw.k, duw.r),
            true,
            true,
            new dtd(1, csr.i),
            new dtd(3, csr.j),
            new dtd(59, csr.b),
            new dtd(1, csr.F)
         );
         this.a(
            dtf.e,
            csr.dN,
            cqv.d,
            ImmutableSet.of(duw.a, duw.c),
            false,
            false,
            new dtd(1, csr.dN),
            new dtd(1, csr.i),
            new dtd(3, csr.j),
            new dtd(59, csr.b),
            new dtd(1, csr.F)
         );
         this.a(dtf.f, cjd.oF, cqv.b, ImmutableSet.of(duw.a), false, false, new dtd(1, csr.i), new dtd(3, csr.j), new dtd(2, csr.m));
         this.a(
            dtf.g,
            csr.I,
            cqv.f,
            ImmutableSet.of(duw.a, duw.b, duw.j, duw.r),
            true,
            false,
            new dtd(8, csr.I),
            new dtd(52, csr.aV),
            new dtd(3, csr.b),
            new dtd(1, csr.F)
         );
         this.a(dtf.h, cjd.ll, cqv.f, ImmutableSet.of(), false, false, new dtd(116, csr.aV), new dtd(3, csr.b), new dtd(1, csr.F));
         this.a(dtf.i, csr.hW, cqv.a, ImmutableSet.of(), true, false, new dtd(1, csr.a));
      }
   }
}
