import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.Optional;

public class cbx {
   private static final blw a = blw.a(5, 16);
   private static final float b = 0.2F;
   private static final float c = 0.15F;
   private static final float d = 0.5F;
   private static final float e = 0.6F;
   private static final float f = 0.6F;

   protected static bpy<?> a(bpy<cbw> $$0) {
      d($$0);
      e($$0);
      c($$0);
      b($$0);
      $$0.a(ImmutableSet.of(cjn.a));
      $$0.b(cjn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpy<cbw> $$0) {
      $$0.a(cjn.p, ImmutableList.of(Pair.of(0, new cby()), Pair.of(1, brb.a(bqr::a, bya.N))), ImmutableSet.of(Pair.of(bya.N, byb.a)), ImmutableSet.of(bya.N));
   }

   private static void c(bpy<cbw> $$0) {
      $$0.a(cjn.k, 0, ImmutableList.of(bte.a(cbw::a), bsu.a(cbx::b), brw.a(20), brb.a(bqr::a, bya.o)), bya.o);
   }

   private static void d(bpy<cbw> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new brv(45, 90), new brz(), cbz.a(), new bqv(bya.P)));
   }

   private static void e(bpy<cbw> $$0) {
      $$0.a(
         cjn.b,
         ImmutableList.of(
            Pair.of(0, bsp.a(bol.bw, 6.0F, blw.a(30, 60))),
            Pair.of(1, new bqj(bol.g, 0.2F, 2)),
            Pair.of(2, new bsm(ImmutableList.of(Pair.of(new brc(cbx::d), 1), Pair.of(bqm.a(a, cbx::c), 1)))),
            Pair.of(3, btb.a(cbx::b)),
            Pair.of(3, bto.a(6, 0.15F)),
            Pair.of(
               4,
               new brd(
                  ImmutableMap.of(bya.m, byb.b),
                  ImmutableSet.of(),
                  brd.a.a,
                  brd.b.b,
                  ImmutableList.of(
                     Pair.of(bsh.c(0.5F), 2),
                     Pair.of(bsh.a(0.15F, false), 2),
                     Pair.of(bsw.a(cbx::a, cbx::d, 3), 3),
                     Pair.of(buc.a(bof::bc), 5),
                     Pair.of(buc.a(bof::aC), 5)
                  )
               )
            )
         )
      );
   }

   private static boolean a(box $$0) {
      cwe $$1 = $$0.dJ();
      Optional<bsd> $$2 = $$0.dM().c(bya.n);
      if ($$2.isPresent()) {
         ib $$3 = $$2.get().b();
         return $$1.z($$3) == $$0.bc();
      } else {
         return false;
      }
   }

   public static void a(cbw $$0) {
      bpy<cbw> $$1 = $$0.dM();
      cjn $$2 = $$1.g().orElse(null);
      if ($$2 != cjn.p) {
         $$1.a(ImmutableList.of(cjn.p, cjn.k, cjn.b));
         if ($$2 == cjn.k && $$1.g().orElse(null) != cjn.k) {
            $$1.a(bya.U, true, 2400L);
         }
      }
   }

   private static float b(box $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float c(box $$0) {
      return $$0.bc() ? 0.6F : 0.15F;
   }

   private static float d(box $$0) {
      return $$0.bc() ? 0.5F : 0.15F;
   }

   private static Optional<? extends box> b(cbw $$0) {
      return bqr.a($$0) ? Optional.empty() : $$0.dM().c(bya.B);
   }

   public static csp a() {
      return csp.a(aum.aA);
   }
}
