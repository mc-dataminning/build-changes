import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class duc {
   public static final afv<dub> a = a("classic_flat");
   public static final afv<dub> b = a("tunnelers_dream");
   public static final afv<dub> c = a("water_world");
   public static final afv<dub> d = a("overworld");
   public static final afv<dub> e = a("snowy_kingdom");
   public static final afv<dub> f = a("bottomless_pit");
   public static final afv<dub> g = a("desert");
   public static final afv<dub> h = a("redstone_ready");
   public static final afv<dub> i = a("the_void");

   public static void a(oo<dub> $$0) {
      new duc.a($$0).a();
   }

   private static afv<dub> a(String $$0) {
      return afv.a(jz.aw, new afw($$0));
   }

   static class a {
      private final oo<dub> a;

      a(oo<dub> $$0) {
         this.a = $$0;
      }

      private void a(afv<dub> $$0, cqy $$1, afv<crx> $$2, Set<afv<dwg>> $$3, boolean $$4, boolean $$5, dua... $$6) {
         ic<dwg> $$7 = this.a.a(jz.aC);
         ic<dve> $$8 = this.a.a(jz.az);
         ic<crx> $$9 = this.a.a(jz.aq);
         ig.a<dwg> $$10 = ig.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         dud $$11 = new dud(Optional.of($$10), $$9.b($$2), dud.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new dub($$1.k().j(), $$11));
      }

      public void a() {
         this.a(duc.a, cuc.i, cse.b, ImmutableSet.of(dvt.a), false, false, new dua(1, cuc.i), new dua(2, cuc.j), new dua(1, cuc.F));
         this.a(duc.b, cuc.b, cse.t, ImmutableSet.of(dvt.j, dvt.r), true, false, new dua(1, cuc.i), new dua(5, cuc.j), new dua(230, cuc.b), new dua(1, cuc.F));
         this.a(
            duc.c,
            ckm.pL,
            cse.T,
            ImmutableSet.of(dvt.m, dvt.l, dvt.g),
            false,
            false,
            new dua(90, cuc.G),
            new dua(5, cuc.L),
            new dua(5, cuc.j),
            new dua(5, cuc.b),
            new dua(64, cuc.rI),
            new dua(1, cuc.F)
         );
         this.a(
            duc.d,
            cuc.bt,
            cse.b,
            ImmutableSet.of(dvt.a, dvt.j, dvt.f, dvt.k, dvt.r),
            true,
            true,
            new dua(1, cuc.i),
            new dua(3, cuc.j),
            new dua(59, cuc.b),
            new dua(1, cuc.F)
         );
         this.a(
            duc.e,
            cuc.dN,
            cse.d,
            ImmutableSet.of(dvt.a, dvt.c),
            false,
            false,
            new dua(1, cuc.dN),
            new dua(1, cuc.i),
            new dua(3, cuc.j),
            new dua(59, cuc.b),
            new dua(1, cuc.F)
         );
         this.a(duc.f, ckm.oF, cse.b, ImmutableSet.of(dvt.a), false, false, new dua(1, cuc.i), new dua(3, cuc.j), new dua(2, cuc.m));
         this.a(
            duc.g,
            cuc.I,
            cse.f,
            ImmutableSet.of(dvt.a, dvt.b, dvt.j, dvt.r),
            true,
            false,
            new dua(8, cuc.I),
            new dua(52, cuc.aV),
            new dua(3, cuc.b),
            new dua(1, cuc.F)
         );
         this.a(duc.h, ckm.ll, cse.f, ImmutableSet.of(), false, false, new dua(116, cuc.aV), new dua(3, cuc.b), new dua(1, cuc.F));
         this.a(duc.i, cuc.hW, cse.a, ImmutableSet.of(), true, false, new dua(1, cuc.a));
      }
   }
}
