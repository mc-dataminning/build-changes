import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eje {
   public static final alb<ejd> a = a("classic_flat");
   public static final alb<ejd> b = a("tunnelers_dream");
   public static final alb<ejd> c = a("water_world");
   public static final alb<ejd> d = a("overworld");
   public static final alb<ejd> e = a("snowy_kingdom");
   public static final alb<ejd> f = a("bottomless_pit");
   public static final alb<ejd> g = a("desert");
   public static final alb<ejd> h = a("redstone_ready");
   public static final alb<ejd> i = a("the_void");

   public static void a(qt<ejd> $$0) {
      new eje.a($$0).a();
   }

   private static alb<ejd> a(String $$0) {
      return alb.a(lv.aO, alc.b($$0));
   }

   static class a {
      private final qt<ejd> a;

      a(qt<ejd> $$0) {
         this.a = $$0;
      }

      private void a(alb<ejd> $$0, def $$1, alb<dfh> $$2, Set<alb<eli>> $$3, boolean $$4, boolean $$5, ejc... $$6) {
         jo<eli> $$7 = this.a.a(lv.aU);
         jo<ekg> $$8 = this.a.a(lv.aR);
         jo<dfh> $$9 = this.a.a(lv.aG);
         jr.a<eli> $$10 = jr.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         ejf $$11 = new ejf(Optional.of($$10), $$9.b($$2), ejf.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ejd($$1.q().n(), $$11));
      }

      public void a() {
         this.a(eje.a, dhl.i, dfo.b, ImmutableSet.of(ekv.a), false, false, new ejc(1, dhl.i), new ejc(2, dhl.j), new ejc(1, dhl.F));
         this.a(eje.b, dhl.b, dfo.t, ImmutableSet.of(ekv.j, ekv.r), true, false, new ejc(1, dhl.i), new ejc(5, dhl.j), new ejc(230, dhl.b), new ejc(1, dhl.F));
         this.a(
            eje.c,
            cvt.qA,
            dfo.T,
            ImmutableSet.of(ekv.m, ekv.l, ekv.g),
            false,
            false,
            new ejc(90, dhl.G),
            new ejc(5, dhl.L),
            new ejc(5, dhl.j),
            new ejc(5, dhl.b),
            new ejc(64, dhl.sJ),
            new ejc(1, dhl.F)
         );
         this.a(
            eje.d,
            dhl.bt,
            dfo.b,
            ImmutableSet.of(ekv.a, ekv.j, ekv.f, ekv.k, ekv.r),
            true,
            true,
            new ejc(1, dhl.i),
            new ejc(3, dhl.j),
            new ejc(59, dhl.b),
            new ejc(1, dhl.F)
         );
         this.a(
            eje.e,
            dhl.dN,
            dfo.d,
            ImmutableSet.of(ekv.a, ekv.c),
            false,
            false,
            new ejc(1, dhl.dN),
            new ejc(1, dhl.i),
            new ejc(3, dhl.j),
            new ejc(59, dhl.b),
            new ejc(1, dhl.F)
         );
         this.a(eje.f, cvt.pu, dfo.b, ImmutableSet.of(ekv.a), false, false, new ejc(1, dhl.i), new ejc(3, dhl.j), new ejc(2, dhl.m));
         this.a(
            eje.g,
            dhl.I,
            dfo.f,
            ImmutableSet.of(ekv.a, ekv.b, ekv.j, ekv.r),
            true,
            false,
            new ejc(8, dhl.I),
            new ejc(52, dhl.aV),
            new ejc(3, dhl.b),
            new ejc(1, dhl.F)
         );
         this.a(eje.h, cvt.lH, dfo.f, ImmutableSet.of(), false, false, new ejc(116, dhl.aV), new ejc(3, dhl.b), new ejc(1, dhl.F));
         this.a(eje.i, dhl.hW, dfo.a, ImmutableSet.of(), true, false, new ejc(1, dhl.a));
      }
   }
}
