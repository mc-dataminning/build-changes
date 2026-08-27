import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class eds {
   public static final aju<edr> a = a("classic_flat");
   public static final aju<edr> b = a("tunnelers_dream");
   public static final aju<edr> c = a("water_world");
   public static final aju<edr> d = a("overworld");
   public static final aju<edr> e = a("snowy_kingdom");
   public static final aju<edr> f = a("bottomless_pit");
   public static final aju<edr> g = a("desert");
   public static final aju<edr> h = a("redstone_ready");
   public static final aju<edr> i = a("the_void");

   public static void a(pz<edr> $$0) {
      new eds.a($$0).a();
   }

   private static aju<edr> a(String $$0) {
      return aju.a(ku.aC, new ajv($$0));
   }

   static class a {
      private final pz<edr> a;

      a(pz<edr> $$0) {
         this.a = $$0;
      }

      private void a(aju<edr> $$0, czf $$1, aju<daf> $$2, Set<aju<efw>> $$3, boolean $$4, boolean $$5, edq... $$6) {
         io<efw> $$7 = this.a.a(ku.aI);
         io<eeu> $$8 = this.a.a(ku.aF);
         io<daf> $$9 = this.a.a(ku.aw);
         ir.a<efw> $$10 = ir.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         edt $$11 = new edt(Optional.of($$10), $$9.b($$2), edt.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new edr($$1.p().n(), $$11));
      }

      public void a() {
         this.a(eds.a, dcj.i, dam.b, ImmutableSet.of(efj.a), false, false, new edq(1, dcj.i), new edq(2, dcj.j), new edq(1, dcj.F));
         this.a(eds.b, dcj.b, dam.t, ImmutableSet.of(efj.j, efj.r), true, false, new edq(1, dcj.i), new edq(5, dcj.j), new edq(230, dcj.b), new edq(1, dcj.F));
         this.a(
            eds.c,
            crv.qy,
            dam.T,
            ImmutableSet.of(efj.m, efj.l, efj.g),
            false,
            false,
            new edq(90, dcj.G),
            new edq(5, dcj.L),
            new edq(5, dcj.j),
            new edq(5, dcj.b),
            new edq(64, dcj.sJ),
            new edq(1, dcj.F)
         );
         this.a(
            eds.d,
            dcj.bt,
            dam.b,
            ImmutableSet.of(efj.a, efj.j, efj.f, efj.k, efj.r),
            true,
            true,
            new edq(1, dcj.i),
            new edq(3, dcj.j),
            new edq(59, dcj.b),
            new edq(1, dcj.F)
         );
         this.a(
            eds.e,
            dcj.dN,
            dam.d,
            ImmutableSet.of(efj.a, efj.c),
            false,
            false,
            new edq(1, dcj.dN),
            new edq(1, dcj.i),
            new edq(3, dcj.j),
            new edq(59, dcj.b),
            new edq(1, dcj.F)
         );
         this.a(eds.f, crv.ps, dam.b, ImmutableSet.of(efj.a), false, false, new edq(1, dcj.i), new edq(3, dcj.j), new edq(2, dcj.m));
         this.a(
            eds.g,
            dcj.I,
            dam.f,
            ImmutableSet.of(efj.a, efj.b, efj.j, efj.r),
            true,
            false,
            new edq(8, dcj.I),
            new edq(52, dcj.aV),
            new edq(3, dcj.b),
            new edq(1, dcj.F)
         );
         this.a(eds.h, crv.lG, dam.f, ImmutableSet.of(), false, false, new edq(116, dcj.aV), new edq(3, dcj.b), new edq(1, dcj.F));
         this.a(eds.i, dcj.hW, dam.a, ImmutableSet.of(), true, false, new edq(1, dcj.a));
      }
   }
}
