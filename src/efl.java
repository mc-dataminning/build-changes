import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class efl {
   public static final akl<efk> a = a("classic_flat");
   public static final akl<efk> b = a("tunnelers_dream");
   public static final akl<efk> c = a("water_world");
   public static final akl<efk> d = a("overworld");
   public static final akl<efk> e = a("snowy_kingdom");
   public static final akl<efk> f = a("bottomless_pit");
   public static final akl<efk> g = a("desert");
   public static final akl<efk> h = a("redstone_ready");
   public static final akl<efk> i = a("the_void");

   public static void a(qo<efk> $$0) {
      new efl.a($$0).a();
   }

   private static akl<efk> a(String $$0) {
      return akl.a(lf.aF, new akm($$0));
   }

   static class a {
      private final qo<efk> a;

      a(qo<efk> $$0) {
         this.a = $$0;
      }

      private void a(akl<efk> $$0, daw $$1, akl<dbw> $$2, Set<akl<ehp>> $$3, boolean $$4, boolean $$5, efj... $$6) {
         iy<ehp> $$7 = this.a.a(lf.aL);
         iy<egn> $$8 = this.a.a(lf.aI);
         iy<dbw> $$9 = this.a.a(lf.az);
         jb.a<ehp> $$10 = jb.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         efm $$11 = new efm(Optional.of($$10), $$9.b($$2), efm.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new efk($$1.q().n(), $$11));
      }

      public void a() {
         this.a(efl.a, dea.i, dcd.b, ImmutableSet.of(ehc.a), false, false, new efj(1, dea.i), new efj(2, dea.j), new efj(1, dea.F));
         this.a(efl.b, dea.b, dcd.t, ImmutableSet.of(ehc.j, ehc.r), true, false, new efj(1, dea.i), new efj(5, dea.j), new efj(230, dea.b), new efj(1, dea.F));
         this.a(
            efl.c,
            ctr.qz,
            dcd.T,
            ImmutableSet.of(ehc.m, ehc.l, ehc.g),
            false,
            false,
            new efj(90, dea.G),
            new efj(5, dea.L),
            new efj(5, dea.j),
            new efj(5, dea.b),
            new efj(64, dea.sJ),
            new efj(1, dea.F)
         );
         this.a(
            efl.d,
            dea.bt,
            dcd.b,
            ImmutableSet.of(ehc.a, ehc.j, ehc.f, ehc.k, ehc.r),
            true,
            true,
            new efj(1, dea.i),
            new efj(3, dea.j),
            new efj(59, dea.b),
            new efj(1, dea.F)
         );
         this.a(
            efl.e,
            dea.dN,
            dcd.d,
            ImmutableSet.of(ehc.a, ehc.c),
            false,
            false,
            new efj(1, dea.dN),
            new efj(1, dea.i),
            new efj(3, dea.j),
            new efj(59, dea.b),
            new efj(1, dea.F)
         );
         this.a(efl.f, ctr.pt, dcd.b, ImmutableSet.of(ehc.a), false, false, new efj(1, dea.i), new efj(3, dea.j), new efj(2, dea.m));
         this.a(
            efl.g,
            dea.I,
            dcd.f,
            ImmutableSet.of(ehc.a, ehc.b, ehc.j, ehc.r),
            true,
            false,
            new efj(8, dea.I),
            new efj(52, dea.aV),
            new efj(3, dea.b),
            new efj(1, dea.F)
         );
         this.a(efl.h, ctr.lH, dcd.f, ImmutableSet.of(), false, false, new efj(116, dea.aV), new efj(3, dea.b), new efj(1, dea.F));
         this.a(efl.i, dea.hW, dcd.a, ImmutableSet.of(), true, false, new efj(1, dea.a));
      }
   }
}
