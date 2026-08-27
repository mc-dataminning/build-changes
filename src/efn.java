import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class efn {
   public static final akm<efm> a = a("classic_flat");
   public static final akm<efm> b = a("tunnelers_dream");
   public static final akm<efm> c = a("water_world");
   public static final akm<efm> d = a("overworld");
   public static final akm<efm> e = a("snowy_kingdom");
   public static final akm<efm> f = a("bottomless_pit");
   public static final akm<efm> g = a("desert");
   public static final akm<efm> h = a("redstone_ready");
   public static final akm<efm> i = a("the_void");

   public static void a(qo<efm> $$0) {
      new efn.a($$0).a();
   }

   private static akm<efm> a(String $$0) {
      return akm.a(lf.aF, new akn($$0));
   }

   static class a {
      private final qo<efm> a;

      a(qo<efm> $$0) {
         this.a = $$0;
      }

      private void a(akm<efm> $$0, day $$1, akm<dby> $$2, Set<akm<ehr>> $$3, boolean $$4, boolean $$5, efl... $$6) {
         iy<ehr> $$7 = this.a.a(lf.aL);
         iy<egp> $$8 = this.a.a(lf.aI);
         iy<dby> $$9 = this.a.a(lf.az);
         jb.a<ehr> $$10 = jb.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         efo $$11 = new efo(Optional.of($$10), $$9.b($$2), efo.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new efm($$1.r().o(), $$11));
      }

      public void a() {
         this.a(efn.a, dec.i, dcf.b, ImmutableSet.of(ehe.a), false, false, new efl(1, dec.i), new efl(2, dec.j), new efl(1, dec.F));
         this.a(efn.b, dec.b, dcf.t, ImmutableSet.of(ehe.j, ehe.r), true, false, new efl(1, dec.i), new efl(5, dec.j), new efl(230, dec.b), new efl(1, dec.F));
         this.a(
            efn.c,
            ctt.qz,
            dcf.T,
            ImmutableSet.of(ehe.m, ehe.l, ehe.g),
            false,
            false,
            new efl(90, dec.G),
            new efl(5, dec.L),
            new efl(5, dec.j),
            new efl(5, dec.b),
            new efl(64, dec.sJ),
            new efl(1, dec.F)
         );
         this.a(
            efn.d,
            dec.bt,
            dcf.b,
            ImmutableSet.of(ehe.a, ehe.j, ehe.f, ehe.k, ehe.r),
            true,
            true,
            new efl(1, dec.i),
            new efl(3, dec.j),
            new efl(59, dec.b),
            new efl(1, dec.F)
         );
         this.a(
            efn.e,
            dec.dN,
            dcf.d,
            ImmutableSet.of(ehe.a, ehe.c),
            false,
            false,
            new efl(1, dec.dN),
            new efl(1, dec.i),
            new efl(3, dec.j),
            new efl(59, dec.b),
            new efl(1, dec.F)
         );
         this.a(efn.f, ctt.pt, dcf.b, ImmutableSet.of(ehe.a), false, false, new efl(1, dec.i), new efl(3, dec.j), new efl(2, dec.m));
         this.a(
            efn.g,
            dec.I,
            dcf.f,
            ImmutableSet.of(ehe.a, ehe.b, ehe.j, ehe.r),
            true,
            false,
            new efl(8, dec.I),
            new efl(52, dec.aV),
            new efl(3, dec.b),
            new efl(1, dec.F)
         );
         this.a(efn.h, ctt.lH, dcf.f, ImmutableSet.of(), false, false, new efl(116, dec.aV), new efl(3, dec.b), new efl(1, dec.F));
         this.a(efn.i, dec.hW, dcf.a, ImmutableSet.of(), true, false, new efl(1, dec.a));
      }
   }
}
