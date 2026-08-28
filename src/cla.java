import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cla {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final btr e = btr.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 3.5714288F;
   private static final float i = 1.25F;

   protected static void a(ckz $$0, azv $$1) {
      $$0.eb().a(cgl.T, e.a($$1));
   }

   protected static byj<?> a(byj<ckz> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(ctd.a));
      $$0.b(ctd.b);
      $$0.f();
      return $$0;
   }

   private static void b(byj<ckz> $$0) {
      $$0.a(ctd.a, 0, ImmutableList.of(new byv(2.0F), new cag(45, 90), new cak(), new bzg(cgl.Q), new bzg(cgl.T)));
   }

   private static void c(byj<ckz> $$0) {
      $$0.a(
         ctd.b,
         ImmutableList.of(
            Pair.of(0, cba.a(bwr.bS, 6.0F, btr.a(30, 60))),
            Pair.of(0, new byu(bwr.ab)),
            Pair.of(1, new bzn($$0x -> 1.25F)),
            Pair.of(2, cbm.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cgl.C))),
            Pair.of(3, cbx.a(6, 1.0F)),
            Pair.of(
               4,
               new cax(
                  ImmutableMap.of(cgl.n, cgm.b),
                  ImmutableList.of(Pair.of(cas.a(1.0F), 1), Pair.of(cbh.a(1.0F, 3), 1), Pair.of(new bzh(), 3), Pair.of(ccn.a(bwi::aH), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cgl.U, cgm.b), Pair.of(cgl.Y, cgm.b))
      );
   }

   private static void d(byj<ckz> $$0) {
      $$0.a(
         ctd.t,
         ImmutableList.of(
            Pair.of(0, cba.a(bwr.bS, 6.0F, btr.a(30, 60))),
            Pair.of(1, new bzn($$0x -> 1.25F)),
            Pair.of(2, cbm.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cgl.C))),
            Pair.of(3, cbx.a(8, 1.5F)),
            Pair.of(
               5,
               new bzo(
                  ImmutableMap.of(cgl.n, cgm.b),
                  ImmutableSet.of(),
                  bzo.a.a,
                  bzo.b.b,
                  ImmutableList.of(Pair.of(cas.c(0.75F), 1), Pair.of(cas.a(1.0F, true), 1), Pair.of(cbh.a(1.0F, 3), 1), Pair.of(ccn.a(bwi::bh), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(cgl.U, cgm.b), Pair.of(cgl.Y, cgm.a))
      );
   }

   private static void e(byj<ckz> $$0) {
      $$0.a(
         ctd.u,
         ImmutableList.of(
            Pair.of(0, cba.a(bwr.bS, 6.0F, btr.a(30, 60))),
            Pair.of(1, cbm.a(($$0x, $$1) -> b($$1), ($$0x, $$1) -> $$1.eb().c(cgl.C))),
            Pair.of(2, cby.a(8, 1.0F)),
            Pair.of(3, cca.a(dmo.tX)),
            Pair.of(4, new cax(ImmutableList.of(Pair.of(cas.a(1.0F), 2), Pair.of(cbh.a(1.0F, 3), 1), Pair.of(new bzh(), 2), Pair.of(ccn.a(bwi::aH), 1))))
         ),
         ImmutableSet.of(Pair.of(cgl.U, cgm.b), Pair.of(cgl.Z, cgm.a))
      );
   }

   private static void f(byj<ckz> $$0) {
      $$0.a(
         ctd.q,
         ImmutableList.of(Pair.of(0, new cab(e, awn.kv)), Pair.of(1, new cac<>(e, 2, 4, 3.5714288F, $$0x -> awn.ku, axc.bV, 0.5F, cla::a))),
         ImmutableSet.of(Pair.of(cgl.P, cgm.b), Pair.of(cgl.s, cgm.b), Pair.of(cgl.T, cgm.b), Pair.of(cgl.Y, cgm.b))
      );
   }

   private static void g(byj<ckz> $$0) {
      $$0.a(ctd.s, 0, ImmutableList.of(cbp.a(), new cld(awn.kw, awn.kr)), cgl.p);
   }

   private static <E extends bxl> boolean a(E $$0, iv $$1) {
      djh $$2 = $$0.dU();
      iv $$3 = $$1.e();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.d()).c()) {
         eao $$4 = $$2.a_($$1);
         eao $$5 = $$2.a_($$3);
         if (!$$4.a(axc.bV) && !$$5.a(axc.bV)) {
            exo $$6 = new exo($$0.dU(), $$0);
            exm $$7 = exr.a($$6, $$1.k());
            exm $$8 = exr.a($$6, $$3.k());
            return $$7 != exm.e && (!$$4.l() || $$8 != exm.e) ? cad.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(ckz $$0) {
      return !bzc.a($$0);
   }

   public static void a(ckz $$0) {
      $$0.eb().a(ImmutableList.of(ctd.s, ctd.u, ctd.q, ctd.t, ctd.b));
   }

   public static Predicate<czk> a() {
      return $$0 -> $$0.a(axk.ap);
   }
}
