import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class egm {
   public static final ale<egl> a = a("classic_flat");
   public static final ale<egl> b = a("tunnelers_dream");
   public static final ale<egl> c = a("water_world");
   public static final ale<egl> d = a("overworld");
   public static final ale<egl> e = a("snowy_kingdom");
   public static final ale<egl> f = a("bottomless_pit");
   public static final ale<egl> g = a("desert");
   public static final ale<egl> h = a("redstone_ready");
   public static final ale<egl> i = a("the_void");

   public static void a(rc<egl> $$0) {
      new egm.a($$0).a();
   }

   private static ale<egl> a(String $$0) {
      return ale.a(lq.aF, new alf($$0));
   }

   static class a {
      private final rc<egl> a;

      a(rc<egl> $$0) {
         this.a = $$0;
      }

      private void a(ale<egl> $$0, dbx $$1, ale<dcx> $$2, Set<ale<eiq>> $$3, boolean $$4, boolean $$5, egk... $$6) {
         jj<eiq> $$7 = this.a.a(lq.aL);
         jj<eho> $$8 = this.a.a(lq.aI);
         jj<dcx> $$9 = this.a.a(lq.az);
         jm.a<eiq> $$10 = jm.a($$3.stream().map($$7::b).collect(Collectors.toList()));
         egn $$11 = new egn(Optional.of($$10), $$9.b($$2), egn.b($$8));
         if ($$4) {
            $$11.a();
         }

         if ($$5) {
            $$11.b();
         }

         for (int $$12 = $$6.length - 1; $$12 >= 0; $$12--) {
            $$11.e().add($$6[$$12]);
         }

         this.a.a($$0, new egl($$1.r().o(), $$11));
      }

      public void a() {
         this.a(egm.a, dfb.i, dde.b, ImmutableSet.of(eid.a), false, false, new egk(1, dfb.i), new egk(2, dfb.j), new egk(1, dfb.F));
         this.a(egm.b, dfb.b, dde.t, ImmutableSet.of(eid.j, eid.r), true, false, new egk(1, dfb.i), new egk(5, dfb.j), new egk(230, dfb.b), new egk(1, dfb.F));
         this.a(
            egm.c,
            cus.qz,
            dde.T,
            ImmutableSet.of(eid.m, eid.l, eid.g),
            false,
            false,
            new egk(90, dfb.G),
            new egk(5, dfb.L),
            new egk(5, dfb.j),
            new egk(5, dfb.b),
            new egk(64, dfb.sJ),
            new egk(1, dfb.F)
         );
         this.a(
            egm.d,
            dfb.bt,
            dde.b,
            ImmutableSet.of(eid.a, eid.j, eid.f, eid.k, eid.r),
            true,
            true,
            new egk(1, dfb.i),
            new egk(3, dfb.j),
            new egk(59, dfb.b),
            new egk(1, dfb.F)
         );
         this.a(
            egm.e,
            dfb.dN,
            dde.d,
            ImmutableSet.of(eid.a, eid.c),
            false,
            false,
            new egk(1, dfb.dN),
            new egk(1, dfb.i),
            new egk(3, dfb.j),
            new egk(59, dfb.b),
            new egk(1, dfb.F)
         );
         this.a(egm.f, cus.pt, dde.b, ImmutableSet.of(eid.a), false, false, new egk(1, dfb.i), new egk(3, dfb.j), new egk(2, dfb.m));
         this.a(
            egm.g,
            dfb.I,
            dde.f,
            ImmutableSet.of(eid.a, eid.b, eid.j, eid.r),
            true,
            false,
            new egk(8, dfb.I),
            new egk(52, dfb.aV),
            new egk(3, dfb.b),
            new egk(1, dfb.F)
         );
         this.a(egm.h, cus.lH, dde.f, ImmutableSet.of(), false, false, new egk(116, dfb.aV), new egk(3, dfb.b), new egk(1, dfb.F));
         this.a(egm.i, dfb.hW, dde.a, ImmutableSet.of(), true, false, new egk(1, dfb.a));
      }
   }
}
