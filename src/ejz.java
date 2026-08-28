import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ejz {
   public static final alh<ejy> a = a("classic_flat");
   public static final alh<ejy> b = a("tunnelers_dream");
   public static final alh<ejy> c = a("water_world");
   public static final alh<ejy> d = a("overworld");
   public static final alh<ejy> e = a("snowy_kingdom");
   public static final alh<ejy> f = a("bottomless_pit");
   public static final alh<ejy> g = a("desert");
   public static final alh<ejy> h = a("redstone_ready");
   public static final alh<ejy> i = a("the_void");

   public static void a(qy<ejy> $$0) {
      new ejz.a($$0).a();
   }

   private static alh<ejy> a(String $$0) {
      return alh.a(lz.aO, ali.b($$0));
   }

   static class a {
      private final qy<ejy> a;

      a(qy<ejy> $$0) {
         this.a = $$0;
      }

      private void a(alh<ejy> $$0, dfa $$1, alh<dgc> $$2, Set<alh<emd>> $$3, boolean $$4, boolean $$5, ejx... $$6) {
         jr<emd> $$7 = this.a.a(lz.aU);
         jr<elb> $$8 = this.a.a(lz.aR);
         jr<dgc> $$9 = this.a.a(lz.aG);
         ju.a<emd> $$10 = ju.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         eka $$11 = new eka(Optional.of($$10), $$9.b($$2), eka.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new ejy($$1.j().f(), $$11));
      }

      public void a() {
         this.a(ejz.a, dig.i, dgj.b, ImmutableSet.of(elq.a), false, false, new ejx(1, dig.i), new ejx(2, dig.j), new ejx(1, dig.F));
         this.a(ejz.b, dig.b, dgj.t, ImmutableSet.of(elq.j, elq.r), true, false, new ejx(1, dig.i), new ejx(5, dig.j), new ejx(230, dig.b), new ejx(1, dig.F));
         this.a(
            ejz.c,
            cwf.qA,
            dgj.T,
            ImmutableSet.of(elq.m, elq.l, elq.g),
            false,
            false,
            new ejx(90, dig.G),
            new ejx(5, dig.L),
            new ejx(5, dig.j),
            new ejx(5, dig.b),
            new ejx(64, dig.sJ),
            new ejx(1, dig.F)
         );
         this.a(
            ejz.d,
            dig.bt,
            dgj.b,
            ImmutableSet.of(elq.a, elq.j, elq.f, elq.k, elq.r),
            true,
            true,
            new ejx(1, dig.i),
            new ejx(3, dig.j),
            new ejx(59, dig.b),
            new ejx(1, dig.F)
         );
         this.a(
            ejz.e,
            dig.dN,
            dgj.d,
            ImmutableSet.of(elq.a, elq.c),
            false,
            false,
            new ejx(1, dig.dN),
            new ejx(1, dig.i),
            new ejx(3, dig.j),
            new ejx(59, dig.b),
            new ejx(1, dig.F)
         );
         this.a(ejz.f, cwf.pu, dgj.b, ImmutableSet.of(elq.a), false, false, new ejx(1, dig.i), new ejx(3, dig.j), new ejx(2, dig.m));
         this.a(
            ejz.g,
            dig.I,
            dgj.f,
            ImmutableSet.of(elq.a, elq.b, elq.j, elq.r),
            true,
            false,
            new ejx(8, dig.I),
            new ejx(52, dig.aV),
            new ejx(3, dig.b),
            new ejx(1, dig.F)
         );
         this.a(ejz.h, cwf.lH, dgj.f, ImmutableSet.of(), false, false, new ejx(116, dig.aV), new ejx(3, dig.b), new ejx(1, dig.F));
         this.a(ejz.i, dig.hW, dgj.a, ImmutableSet.of(), true, false, new ejx(1, dig.a));
      }
   }
}
