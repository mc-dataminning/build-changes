import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;

public class ccf {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.0F;
   private static final float d = 0.75F;
   private static final blw e = blw.a(100, 140);
   private static final int f = 2;
   private static final int g = 4;
   private static final float h = 1.5F;
   private static final float i = 1.25F;

   protected static void a(cce $$0, awt $$1) {
      $$0.dM().a(bya.S, e.a($$1));
   }

   protected static bpy<?> a(bpy<cce> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      g($$0);
      f($$0);
      $$0.a(ImmutableSet.of(cjn.a));
      $$0.b(cjn.b);
      $$0.f();
      return $$0;
   }

   private static void b(bpy<cce> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new bqk(2.0F), new brv(45, 90), new brz(), new bqv(bya.P), new bqv(bya.S)));
   }

   private static void c(bpy<cce> $$0) {
      $$0.a(
         cjn.b,
         ImmutableList.of(
            Pair.of(0, bsp.a(bol.bw, 6.0F, blw.a(30, 60))),
            Pair.of(0, new bqj(bol.Q)),
            Pair.of(1, new brc($$0x -> 1.25F)),
            Pair.of(2, btb.a(ccf::b, $$0x -> $$0x.dM().c(bya.B))),
            Pair.of(3, btm.a(6, 1.0F)),
            Pair.of(
               4,
               new bsm(
                  ImmutableMap.of(bya.m, byb.b),
                  ImmutableList.of(Pair.of(bsh.a(1.0F), 1), Pair.of(bsw.a(1.0F, 3), 1), Pair.of(new bqw(), 3), Pair.of(buc.a(bof::aC), 2))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bya.T, byb.b), Pair.of(bya.X, byb.b))
      );
   }

   private static void d(bpy<cce> $$0) {
      $$0.a(
         cjn.t,
         ImmutableList.of(
            Pair.of(0, bsp.a(bol.bw, 6.0F, blw.a(30, 60))),
            Pair.of(1, new brc($$0x -> 1.25F)),
            Pair.of(2, btb.a(ccf::b, $$0x -> $$0x.dM().c(bya.B))),
            Pair.of(3, btm.a(8, 1.5F)),
            Pair.of(
               5,
               new brd(
                  ImmutableMap.of(bya.m, byb.b),
                  ImmutableSet.of(),
                  brd.a.a,
                  brd.b.b,
                  ImmutableList.of(Pair.of(bsh.c(0.75F), 1), Pair.of(bsh.a(1.0F, true), 1), Pair.of(bsw.a(1.0F, 3), 1), Pair.of(buc.a(bof::bc), 5))
               )
            )
         ),
         ImmutableSet.of(Pair.of(bya.T, byb.b), Pair.of(bya.X, byb.a))
      );
   }

   private static void e(bpy<cce> $$0) {
      $$0.a(
         cjn.u,
         ImmutableList.of(
            Pair.of(0, bsp.a(bol.bw, 6.0F, blw.a(30, 60))),
            Pair.of(1, btb.a(ccf::b, $$0x -> $$0x.dM().c(bya.B))),
            Pair.of(2, btn.a(8, 1.0F)),
            Pair.of(3, btp.a(czh.tn)),
            Pair.of(4, new bsm(ImmutableList.of(Pair.of(bsh.a(1.0F), 2), Pair.of(bsw.a(1.0F, 3), 1), Pair.of(new bqw(), 2), Pair.of(buc.a(bof::aC), 1))))
         ),
         ImmutableSet.of(Pair.of(bya.T, byb.b), Pair.of(bya.Y, byb.a))
      );
   }

   private static void f(bpy<cce> $$0) {
      $$0.a(
         cjn.q,
         ImmutableList.of(Pair.of(0, new brq(e, atp.jD)), Pair.of(1, new brr<>(e, 2, 4, 1.5F, $$0x -> atp.jC, aue.bK, 0.5F, ccf::a))),
         ImmutableSet.of(Pair.of(bya.O, byb.b), Pair.of(bya.r, byb.b), Pair.of(bya.S, byb.b), Pair.of(bya.X, byb.b))
      );
   }

   private static void g(bpy<cce> $$0) {
      $$0.a(cjn.s, 0, ImmutableList.of(bte.a(), new ccg(atp.jE, atp.jz)), bya.o);
   }

   private static <E extends boz> boolean a(E $$0, ib $$1) {
      cwe $$2 = $$0.dJ();
      ib $$3 = $$1.d();
      if ($$2.b_($$1).c() && $$2.b_($$3).c() && $$2.b_($$1.c()).c()) {
         dme $$4 = $$2.a_($$1);
         dme $$5 = $$2.a_($$3);
         if (!$$4.a(aue.bK) && !$$5.a(aue.bK)) {
            eic $$6 = eil.a($$2, $$1.j());
            eic $$7 = eil.a($$2, $$3.j());
            return $$6 != eic.e && (!$$4.i() || $$7 != eic.e) ? brs.a($$0, $$1) : true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   private static boolean b(cce $$0) {
      return !bqr.a($$0);
   }

   public static void a(cce $$0) {
      $$0.dM().a(ImmutableList.of(cjn.s, cjn.u, cjn.q, cjn.t, cjn.b));
   }

   public static csp a() {
      return cce.bV;
   }
}
