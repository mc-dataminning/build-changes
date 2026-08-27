import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.List;
import java.util.Optional;

public class cgl {
   public static final int a = 8;
   public static final int b = 4;
   private static final blw c = axl.a(5, 20);
   private static final int d = 200;
   private static final int e = 8;
   private static final int f = 15;
   private static final int g = 40;
   private static final int h = 15;
   private static final int i = 200;
   private static final blw j = blw.a(5, 16);
   private static final float k = 1.0F;
   private static final float l = 1.3F;
   private static final float m = 0.6F;
   private static final float n = 0.4F;
   private static final float o = 0.6F;

   protected static bpy<?> a(bpy<cgk> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cjn.a));
      $$0.b(cjn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpy<cgk> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new brv(45, 90), new brz()));
   }

   private static void c(bpy<cgk> $$0) {
      $$0.a(
         cjn.b,
         10,
         ImmutableList.of(
            bqo.a(bya.aw, 200),
            new bqj(bol.Y, 0.6F, 2),
            bst.a(bya.aw, 1.0F, 8, true),
            btb.a(cgl::d),
            buc.a(cgk::w, bst.b(bya.aq, 0.4F, 8, false)),
            bsp.a(8.0F, blw.a(30, 60)),
            bqm.a(j, 0.6F),
            a()
         )
      );
   }

   private static void d(bpy<cgk> $$0) {
      $$0.a(
         cjn.k,
         10,
         ImmutableList.of(
            bqo.a(bya.aw, 200), new bqj(bol.Y, 0.6F, 2), bsu.a(1.0F), buc.a(cgk::w, brw.a(40)), buc.a(boa::o_, brw.a(15)), bte.a(), brb.a(cgl::i, bya.o)
         ),
         bya.o
      );
   }

   private static void e(bpy<cgk> $$0) {
      $$0.a(cjn.n, 10, ImmutableList.of(bst.b(bya.z, 1.3F, 15, false), a(), bsp.a(8.0F, blw.a(30, 60)), brb.a(cgl::e, bya.z)), bya.z);
   }

   private static bsm<cgk> a() {
      return new bsm<>(ImmutableList.of(Pair.of(bsh.a(0.4F), 2), Pair.of(bsw.a(0.4F, 3), 2), Pair.of(new bqz(30, 60), 1)));
   }

   protected static void a(cgk $$0) {
      bpy<cgk> $$1 = $$0.dM();
      cjn $$2 = $$1.g().orElse(null);
      $$1.a(ImmutableList.of(cjn.k, cjn.n, cjn.b));
      cjn $$3 = $$1.g().orElse(null);
      if ($$2 != $$3) {
         b($$0).ifPresent($$0::b);
      }

      $$0.v($$1.a(bya.o));
   }

   protected static void a(cgk $$0, box $$1) {
      if (!$$0.o_()) {
         if ($$1.ai() == bol.ay && f($$0)) {
            e($$0, $$1);
            c($$0, $$1);
         } else {
            h($$0, $$1);
         }
      }
   }

   private static void c(cgk $$0, box $$1) {
      g($$0).forEach($$1x -> d($$1x, $$1));
   }

   private static void d(cgk $$0, box $$1) {
      bpy<cgk> $$3 = $$0.dM();
      box $$2 = bqr.a($$0, $$3.c(bya.z), $$1);
      $$2 = bqr.a($$0, $$3.c(bya.o), $$2);
      e($$0, $$2);
   }

   private static void e(cgk $$0, box $$1) {
      $$0.dM().b(bya.o);
      $$0.dM().b(bya.m);
      $$0.dM().a(bya.z, $$1, (long)c.a($$0.dJ().z));
   }

   private static Optional<? extends box> d(cgk $$0) {
      return !c($$0) && !i($$0) ? $$0.dM().c(bya.l) : Optional.empty();
   }

   static boolean a(cgk $$0, ib $$1) {
      Optional<ib> $$2 = $$0.dM().c(bya.aw);
      return $$2.isPresent() && $$2.get().a($$1, 8.0);
   }

   private static boolean e(cgk $$0) {
      return $$0.w() && !f($$0);
   }

   private static boolean f(cgk $$0) {
      if ($$0.o_()) {
         return false;
      } else {
         int $$1 = $$0.dM().c(bya.as).orElse(0);
         int $$2 = $$0.dM().c(bya.at).orElse(0) + 1;
         return $$1 > $$2;
      }
   }

   protected static void b(cgk $$0, box $$1) {
      bpy<cgk> $$2 = $$0.dM();
      $$2.b(bya.ax);
      $$2.b(bya.r);
      if ($$0.o_()) {
         d($$0, $$1);
      } else {
         f($$0, $$1);
      }
   }

   private static void f(cgk $$0, box $$1) {
      if (!$$0.dM().c(cjn.n) || $$1.ai() != bol.ay) {
         if ($$1.ai() != bol.Y) {
            if (!bqr.a($$0, $$1, 4.0)) {
               if (bzg.c($$0, $$1)) {
                  g($$0, $$1);
                  h($$0, $$1);
               }
            }
         }
      }
   }

   private static void g(cgk $$0, box $$1) {
      bpy<cgk> $$2 = $$0.dM();
      $$2.b(bya.E);
      $$2.b(bya.r);
      $$2.a(bya.o, $$1, 200L);
   }

   private static void h(cgk $$0, box $$1) {
      g($$0).forEach($$1x -> i($$1x, $$1));
   }

   private static void i(cgk $$0, box $$1) {
      if (!c($$0)) {
         Optional<box> $$2 = $$0.dM().c(bya.o);
         box $$3 = bqr.a($$0, $$2, $$1);
         g($$0, $$3);
      }
   }

   public static Optional<ato> b(cgk $$0) {
      return $$0.dM().g().map($$1 -> a($$0, $$1));
   }

   private static ato a(cgk $$0, cjn $$1) {
      if ($$1 == cjn.n || $$0.A()) {
         return atp.lW;
      } else if ($$1 == cjn.k) {
         return atp.lR;
      } else {
         return h($$0) ? atp.lW : atp.lQ;
      }
   }

   private static List<cgk> g(cgk $$0) {
      return $$0.dM().c(bya.ap).orElse(ImmutableList.of());
   }

   private static boolean h(cgk $$0) {
      return $$0.dM().a(bya.aw);
   }

   private static boolean i(cgk $$0) {
      return $$0.dM().a(bya.r);
   }

   protected static boolean c(cgk $$0) {
      return $$0.dM().a(bya.ax);
   }
}
