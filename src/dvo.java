import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dvo {
   public static final agl<dvn> a = a("classic_flat");
   public static final agl<dvn> b = a("tunnelers_dream");
   public static final agl<dvn> c = a("water_world");
   public static final agl<dvn> d = a("overworld");
   public static final agl<dvn> e = a("snowy_kingdom");
   public static final agl<dvn> f = a("bottomless_pit");
   public static final agl<dvn> g = a("desert");
   public static final agl<dvn> h = a("redstone_ready");
   public static final agl<dvn> i = a("the_void");

   public static void a(oz<dvn> $$0) {
      new dvo.a($$0).a();
   }

   private static agl<dvn> a(String $$0) {
      return agl.a(kd.ax, new agm($$0));
   }

   static class a {
      private final oz<dvn> a;

      a(oz<dvn> $$0) {
         this.a = $$0;
      }

      private void a(agl<dvn> $$0, cse $$1, agl<ctd> $$2, Set<agl<dxs>> $$3, boolean $$4, boolean $$5, dvm... $$6) {
         ih<dxs> $$7 = this.a.a(kd.aD);
         ih<dwq> $$8 = this.a.a(kd.aA);
         ih<ctd> $$9 = this.a.a(kd.ar);
         ik.a<dxs> $$10 = ik.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dvp $$11 = new dvp(Optional.of($$10), $$9.b($$2), dvp.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dvn($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dvo.a, cvh.i, ctk.b, ImmutableSet.of(dxf.a), false, false, new dvm(1, cvh.i), new dvm(2, cvh.j), new dvm(1, cvh.F));
         this.a(dvo.b, cvh.b, ctk.t, ImmutableSet.of(dxf.j, dxf.r), true, false, new dvm(1, cvh.i), new dvm(5, cvh.j), new dvm(230, cvh.b), new dvm(1, cvh.F));
         this.a(
            dvo.c,
            clr.qw,
            ctk.T,
            ImmutableSet.of(dxf.m, dxf.l, dxf.g),
            false,
            false,
            new dvm(90, cvh.G),
            new dvm(5, cvh.L),
            new dvm(5, cvh.j),
            new dvm(5, cvh.b),
            new dvm(64, cvh.sJ),
            new dvm(1, cvh.F)
         );
         this.a(
            dvo.d,
            cvh.bt,
            ctk.b,
            ImmutableSet.of(dxf.a, dxf.j, dxf.f, dxf.k, dxf.r),
            true,
            true,
            new dvm(1, cvh.i),
            new dvm(3, cvh.j),
            new dvm(59, cvh.b),
            new dvm(1, cvh.F)
         );
         this.a(
            dvo.e,
            cvh.dN,
            ctk.d,
            ImmutableSet.of(dxf.a, dxf.c),
            false,
            false,
            new dvm(1, cvh.dN),
            new dvm(1, cvh.i),
            new dvm(3, cvh.j),
            new dvm(59, cvh.b),
            new dvm(1, cvh.F)
         );
         this.a(dvo.f, clr.pq, ctk.b, ImmutableSet.of(dxf.a), false, false, new dvm(1, cvh.i), new dvm(3, cvh.j), new dvm(2, cvh.m));
         this.a(
            dvo.g,
            cvh.I,
            ctk.f,
            ImmutableSet.of(dxf.a, dxf.b, dxf.j, dxf.r),
            true,
            false,
            new dvm(8, cvh.I),
            new dvm(52, cvh.aV),
            new dvm(3, cvh.b),
            new dvm(1, cvh.F)
         );
         this.a(dvo.h, clr.lG, ctk.f, ImmutableSet.of(), false, false, new dvm(116, cvh.aV), new dvm(3, cvh.b), new dvm(1, cvh.F));
         this.a(dvo.i, cvh.hW, ctk.a, ImmutableSet.of(), true, false, new dvm(1, cvh.a));
      }
   }
}
