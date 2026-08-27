import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import java.util.function.Predicate;

public class cgf {
   public static final int a = 20;
   public static final int b = 7;
   private static final bpl i = bpl.a(5, 16);
   private static final float j = 1.0F;
   private static final float k = 1.25F;
   private static final float l = 1.25F;
   private static final float m = 2.0F;
   private static final float n = 1.25F;
   private static final bpl o = bpl.a(600, 1200);
   public static final int c = 5;
   public static final int d = 5;
   public static final float e = 3.5714288F;
   private static final bpl p = bpl.a(600, 6000);
   private static final bpl q = bpl.a(100, 300);
   private static final cde r = cde.a().a($$0 -> !$$0.ak().equals(bsb.Z) && $$0.dU().D_().a($$0.cP()));
   private static final float s = 3.0F;
   public static final int f = 4;
   public static final float g = 2.5F;
   public static final float h = 1.0F;

   protected static void a(cge $$0, ayt $$1) {
      $$0.dZ().a(cbr.S, o.a($$1));
      $$0.dZ().a(cbr.V, p.a($$1));
   }

   protected static btp<?> a(btp<cge> $$0) {
      b($$0);
      c($$0);
      d($$0);
      e($$0);
      $$0.a(ImmutableSet.of(cnq.a));
      $$0.b(cnq.b);
      $$0.f();
      return $$0;
   }

   private static void b(btp<cge> $$0) {
      $$0.a(cnq.a, 0, ImmutableList.of(new bxa(0.8F), new bub(2.0F), new bvm(45, 90), new bvq(), new bum(cbr.P), new bum(cbr.S), new bum(cbr.V)));
   }

   private static void c(btp<cge> $$0) {
      $$0.a(
         cnq.b,
         ImmutableList.of(
            Pair.of(0, bwg.a(bsb.bE, 6.0F, bpl.a(30, 60))),
            Pair.of(0, new bua(bsb.Z)),
            Pair.of(1, new but($$0x -> 1.25F)),
            Pair.of(2, bud.a(i, 1.25F)),
            Pair.of(3, new bwd(ImmutableList.of(Pair.of(bvy.a(1.0F), 2), Pair.of(bwn.a(1.0F, 3), 2), Pair.of(new buq(30, 60), 1))))
         ),
         ImmutableSet.of(Pair.of(cbr.W, cbs.b), Pair.of(cbr.T, cbs.b))
      );
   }

   private static void d(btp<cge> $$0) {
      $$0.a(
         cnq.q,
         ImmutableList.of(Pair.of(0, new bvh(o, avo.lq)), Pair.of(1, new bvj<>(o, 5, 5, 3.5714288F, $$0x -> $$0x.gI() ? avo.ll : avo.lb))),
         ImmutableSet.of(Pair.of(cbr.O, cbs.b), Pair.of(cbr.r, cbs.b), Pair.of(cbr.m, cbs.b), Pair.of(cbr.S, cbs.b))
      );
   }

   private static void e(btp<cge> $$0) {
      $$0.a(
         cnq.r,
         ImmutableList.of(
            Pair.of(
               0,
               new bvw(
                  $$0x -> $$0x.gI() ? q : p, r, 3.0F, $$0x -> $$0x.o_() ? 1.0 : 2.5, $$0x -> $$0x.gI() ? avo.lo : avo.le, $$0x -> $$0x.gI() ? avo.lp : avo.lf
               )
            ),
            Pair.of(1, new bvv<>($$0x -> $$0x.gI() ? q.a() : p.a(), 4, 7, 1.25F, r, 20, $$0x -> $$0x.gI() ? avo.ln : avo.ld))
         ),
         ImmutableSet.of(Pair.of(cbr.O, cbs.b), Pair.of(cbr.r, cbs.b), Pair.of(cbr.V, cbs.b))
      );
   }

   public static void a(cge $$0) {
      $$0.dZ().a(ImmutableList.of(cnq.r, cnq.q, cnq.b));
   }

   public static Predicate<cuh> a() {
      return $$0 -> $$0.a(awm.ab);
   }
}
