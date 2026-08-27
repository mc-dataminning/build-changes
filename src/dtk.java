import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class dtk {
   public static final aew<dtj> a = a("classic_flat");
   public static final aew<dtj> b = a("tunnelers_dream");
   public static final aew<dtj> c = a("water_world");
   public static final aew<dtj> d = a("overworld");
   public static final aew<dtj> e = a("snowy_kingdom");
   public static final aew<dtj> f = a("bottomless_pit");
   public static final aew<dtj> g = a("desert");
   public static final aew<dtj> h = a("redstone_ready");
   public static final aew<dtj> i = a("the_void");

   public static void a(ns<dtj> $$0) {
      new dtk.a($$0).a();
   }

   private static aew<dtj> a(String $$0) {
      return aew.a(je.av, new aex($$0));
   }

   static class a {
      private final ns<dtj> a;

      a(ns<dtj> $$0) {
         this.a = $$0;
      }

      private void a(aew<dtj> $$0, cpu $$1, aew<cqt> $$2, Set<aew<dvo>> $$3, boolean $$4, boolean $$5, dti... $$6) {
         hh<dvo> $$7 = this.a.a(je.aB);
         hh<dum> $$8 = this.a.a(je.ay);
         hh<cqt> $$9 = this.a.a(je.ap);
         hk.a<dvo> $$10 = hk.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dtl $$11 = new dtl(Optional.of($$10), $$9.b($$2), dtl.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dtj($$1.k().j(), $$11));
      }

      public void a() {
         this.a(dtk.a, csw.i, cra.b, ImmutableSet.of(dvb.a), false, false, new dti(1, csw.i), new dti(2, csw.j), new dti(1, csw.F));
         this.a(dtk.b, csw.b, cra.t, ImmutableSet.of(dvb.j, dvb.r), true, false, new dti(1, csw.i), new dti(5, csw.j), new dti(230, csw.b), new dti(1, csw.F));
         this.a(
            dtk.c,
            cji.pL,
            cra.T,
            ImmutableSet.of(dvb.m, dvb.l, dvb.g),
            false,
            false,
            new dti(90, csw.G),
            new dti(5, csw.L),
            new dti(5, csw.j),
            new dti(5, csw.b),
            new dti(64, csw.rI),
            new dti(1, csw.F)
         );
         this.a(
            dtk.d,
            csw.bt,
            cra.b,
            ImmutableSet.of(dvb.a, dvb.j, dvb.f, dvb.k, dvb.r),
            true,
            true,
            new dti(1, csw.i),
            new dti(3, csw.j),
            new dti(59, csw.b),
            new dti(1, csw.F)
         );
         this.a(
            dtk.e,
            csw.dN,
            cra.d,
            ImmutableSet.of(dvb.a, dvb.c),
            false,
            false,
            new dti(1, csw.dN),
            new dti(1, csw.i),
            new dti(3, csw.j),
            new dti(59, csw.b),
            new dti(1, csw.F)
         );
         this.a(dtk.f, cji.oF, cra.b, ImmutableSet.of(dvb.a), false, false, new dti(1, csw.i), new dti(3, csw.j), new dti(2, csw.m));
         this.a(
            dtk.g,
            csw.I,
            cra.f,
            ImmutableSet.of(dvb.a, dvb.b, dvb.j, dvb.r),
            true,
            false,
            new dti(8, csw.I),
            new dti(52, csw.aV),
            new dti(3, csw.b),
            new dti(1, csw.F)
         );
         this.a(dtk.h, cji.ll, cra.f, ImmutableSet.of(), false, false, new dti(116, csw.aV), new dti(3, csw.b), new dti(1, csw.F));
         this.a(dtk.i, csw.hW, cra.a, ImmutableSet.of(), true, false, new dti(1, csw.a));
      }
   }
}
